package com.amazon.device.ads;

import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;

/* loaded from: classes2.dex */
class DtbGooglePlayServices {
    private static final String LOG_TAG = "DtbGooglePlayServices";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class AdvertisingInfo {
        private String advertisingIdentifier;
        private boolean gpsAvailable = true;
        private Boolean limitAdTrackingEnabled;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static AdvertisingInfo createNotAvailable() {
            return new AdvertisingInfo().setGooglePlayServicesAvailable(false);
        }

        private AdvertisingInfo setGooglePlayServicesAvailable(boolean z) {
            this.gpsAvailable = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String getAdvertisingIdentifier() {
            if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
                return this.advertisingIdentifier;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasAdvertisingIdentifier() {
            if (getAdvertisingIdentifier() != null) {
                return true;
            }
            return false;
        }

        boolean isGooglePlayServicesAvailable() {
            return this.gpsAvailable;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AdvertisingInfo setAdvertisingIdentifier(String str) {
            this.advertisingIdentifier = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AdvertisingInfo setLimitAdTrackingEnabled(Boolean bool) {
            this.limitAdTrackingEnabled = bool;
            return this;
        }
    }

    private boolean isAdvertisingClassAvailable() {
        return DtbCommonUtils.isClassAvailable("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    public AdvertisingInfo getAdvertisingIdentifierInfo() {
        if (isAdvertisingClassAvailable()) {
            AdvertisingInfo advertisingIdentifierInfo = DtbGooglePlayServicesAdapter.newAdapter().getAdvertisingIdentifierInfo();
            if (advertisingIdentifierInfo.getAdvertisingIdentifier() != null && !advertisingIdentifierInfo.getAdvertisingIdentifier().isEmpty()) {
                return advertisingIdentifierInfo;
            }
        }
        AdvertisingInfo advertisingIdentifierInfo2 = DtbFireOSServiceAdapter.newAdapter().getAdvertisingIdentifierInfo();
        if (advertisingIdentifierInfo2.getAdvertisingIdentifier() != null && !advertisingIdentifierInfo2.getAdvertisingIdentifier().isEmpty()) {
            return advertisingIdentifierInfo2;
        }
        DtbLog.error(LOG_TAG, "The Google Play Services Advertising Identifier feature is not available. Please include the google dependency / check the proguard rule");
        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "The Google Play Services Advertising Identifier feature is not available");
        return AdvertisingInfo.createNotAvailable();
    }
}
