package com.smaato.sdk.core.locationaware;

import androidx.annotation.VisibleForTesting;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.core.util.Threads;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class LocationAwareGdprImpl implements LocationAware {
    @VisibleForTesting

    /* renamed from: EU */
    static final Set<String> f71632EU;
    private static final Set<String> ONLY_APPLICABLE_FOR;
    @VisibleForTesting
    static final Map<String, String> TZ_TO_COUNTRY;
    private final ConsentCountryChecker consentCountryChecker;
    private boolean isDetectionEnabled;
    private volatile Boolean isGdprCountry;

    static {
        HashMap hashMap = new HashMap();
        TZ_TO_COUNTRY = hashMap;
        ONLY_APPLICABLE_FOR = new HashSet();
        hashMap.put("Europe/Amsterdam", "NL");
        hashMap.put("Europe/Athens", "CY");
        hashMap.put("Europe/Berlin", "DE");
        hashMap.put("Europe/Bratislava", "SK");
        hashMap.put("Europe/Brussels", "BE");
        hashMap.put("Europe/Bucharest", "RO");
        hashMap.put("Europe/Budapest", "HU");
        hashMap.put("Europe/Copenhagen", "DK");
        hashMap.put("Europe/Dublin", "IE");
        hashMap.put("Europe/Helsinki", "FI");
        hashMap.put("Europe/Lisbon", "PT");
        hashMap.put("Europe/Ljubljana", "SI");
        hashMap.put("Europe/London", "GB");
        hashMap.put("Europe/Luxembourg", "LU");
        hashMap.put("Europe/Madrid", "ES");
        hashMap.put("Europe/Malta", "MT");
        hashMap.put("Europe/Oslo", "NO");
        hashMap.put("Europe/Paris", "FR");
        hashMap.put("Europe/Prague", "CZ");
        hashMap.put("Europe/Riga", "LV");
        hashMap.put("Europe/Rome", "IT");
        hashMap.put("Europe/Sofia", "BG");
        hashMap.put("Europe/Stockholm", "SE");
        hashMap.put("Europe/Tallinn", "EE");
        hashMap.put("Europe/Vaduz", "LI");
        hashMap.put("Europe/Vienna", "AT");
        hashMap.put("Europe/Vilnius", "LT");
        hashMap.put("Europe/Warsaw", "PL");
        hashMap.put("Europe/Zagreb", "HR");
        hashMap.put("Atlantic/Reykjavik", IronSourceConstants.INTERSTITIAL_EVENT_TYPE);
        f71632EU = new HashSet(hashMap.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAwareGdprImpl(ConsentCountryChecker consentCountryChecker, boolean z) {
        this.consentCountryChecker = consentCountryChecker;
        this.isDetectionEnabled = z;
        if (z) {
            checkConsentCountryInBackground();
        }
    }

    public void checkConsentCountry() {
        boolean z;
        if (this.isGdprCountry == null) {
            synchronized (this) {
                if (this.isGdprCountry == null) {
                    this.isGdprCountry = Boolean.FALSE;
                    if (!this.consentCountryChecker.isConsentCountryBySIM(f71632EU) && !this.consentCountryChecker.isConsentCountryByTimeZone(TZ_TO_COUNTRY) && !this.consentCountryChecker.isGeoDns("geoclue.smaato.net", "GDPR")) {
                        z = false;
                        this.isGdprCountry = Boolean.valueOf(z);
                    }
                    z = true;
                    this.isGdprCountry = Boolean.valueOf(z);
                }
            }
        }
    }

    public void checkConsentCountryInBackground() {
        Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.core.locationaware.i
            @Override // java.lang.Runnable
            public final void run() {
                LocationAwareGdprImpl.this.checkConsentCountry();
            }
        });
    }

    @Override // com.smaato.sdk.core.locationaware.LocationAware
    public boolean isApplicable() {
        Set<String> set = ONLY_APPLICABLE_FOR;
        if (!set.isEmpty() && !set.contains(this.consentCountryChecker.getPackageName())) {
            return false;
        }
        return true;
    }

    @Override // com.smaato.sdk.core.locationaware.LocationAware
    public boolean isConsentCountry() {
        if (this.isDetectionEnabled && this.isGdprCountry != null && this.isGdprCountry.booleanValue()) {
            return true;
        }
        return false;
    }
}
