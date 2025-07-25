package com.smaato.sdk.core.locationaware;

import androidx.annotation.VisibleForTesting;
import com.smaato.sdk.core.util.Threads;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class LocationAwareLgpdImpl implements LocationAware {
    @VisibleForTesting
    static final Set<String> LGPD;
    private static final Set<String> ONLY_APPLICABLE_FOR;
    @VisibleForTesting
    static final Map<String, String> TZ_TO_COUNTRY;
    private final ConsentCountryChecker consentCountryChecker;
    private boolean isDetectionEnabled;
    private volatile Boolean isLgpdCountry;

    static {
        HashMap hashMap = new HashMap();
        TZ_TO_COUNTRY = hashMap;
        ONLY_APPLICABLE_FOR = new HashSet();
        hashMap.put("America/Araguaina", "BR");
        hashMap.put("America/Bahia", "BR");
        hashMap.put("America/Belem", "BR");
        hashMap.put("America/Boa_Vista", "BR");
        hashMap.put("America/Campo_Grande", "BR");
        hashMap.put("America/Cuiaba", "BR");
        hashMap.put("America/Eirunepe", "BR");
        hashMap.put("America/Fortaleza", "BR");
        hashMap.put("America/Maceio", "BR");
        hashMap.put("America/Manaus", "BR");
        hashMap.put("America/Noronha", "BR");
        hashMap.put("America/Porto_Acre", "BR");
        hashMap.put("America/Porto_Velho", "BR");
        hashMap.put("America/Recife", "BR");
        hashMap.put("America/Rio_Branco", "BR");
        hashMap.put("America/Santarem", "BR");
        hashMap.put("America/Sao_Paulo", "BR");
        hashMap.put("Brazil/Acre", "BR");
        hashMap.put("Brazil/DeNoronha", "BR");
        hashMap.put("Brazil/East", "BR");
        hashMap.put("Brazil/West", "BR");
        LGPD = new HashSet(hashMap.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAwareLgpdImpl(ConsentCountryChecker consentCountryChecker, boolean z) {
        this.consentCountryChecker = consentCountryChecker;
        this.isDetectionEnabled = z;
        if (z) {
            checkConsentCountryInBackground();
        }
    }

    public void checkConsentCountry() {
        boolean z;
        if (this.isLgpdCountry == null) {
            synchronized (this) {
                if (this.isLgpdCountry == null) {
                    this.isLgpdCountry = Boolean.FALSE;
                    if (!this.consentCountryChecker.isConsentCountryBySIM(LGPD) && !this.consentCountryChecker.isConsentCountryByTimeZone(TZ_TO_COUNTRY) && !this.consentCountryChecker.isGeoDns("geoclue.smaato.net", "LGPD")) {
                        z = false;
                        this.isLgpdCountry = Boolean.valueOf(z);
                    }
                    z = true;
                    this.isLgpdCountry = Boolean.valueOf(z);
                }
            }
        }
    }

    public void checkConsentCountryInBackground() {
        Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.core.locationaware.j
            @Override // java.lang.Runnable
            public final void run() {
                LocationAwareLgpdImpl.this.checkConsentCountry();
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
        if (this.isDetectionEnabled && this.isLgpdCountry != null && this.isLgpdCountry.booleanValue()) {
            return true;
        }
        return false;
    }
}
