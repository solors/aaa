package net.pubnative.lite.sdk.models;

/* loaded from: classes10.dex */
public interface RemoteConfigFeature {

    /* loaded from: classes10.dex */
    public interface AdFormat {
        public static final String BANNER = "banner";
        public static final String INTERSTITIAL = "interstitial";
        public static final String NATIVE = "native";
        public static final String REWARDED = "rewarded";
    }

    /* loaded from: classes10.dex */
    public interface Rendering {
        public static final String MRAID = "mraid";
        public static final String VAST = "vast";
    }

    /* loaded from: classes10.dex */
    public interface Reporting {
        public static final String AD_ERRORS = "ad_errors";
        public static final String AD_EVENTS = "ad_events";
        public static final String DIAGNOSTIC_INIT = "diagnostic_init";
        public static final String DIAGNOSTIC_PLACEMENT = "diagnostic_placement";
        public static final String DIAGNOSTIC_REPORT = "diagnostic_report";
    }

    /* loaded from: classes10.dex */
    public interface UserConsent {
        public static final String CCPA = "ccpa";
        public static final String GDPR = "gdpr";
    }
}
