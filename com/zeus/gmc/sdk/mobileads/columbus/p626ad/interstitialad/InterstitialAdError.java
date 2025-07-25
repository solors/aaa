package com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad;

import android.text.TextUtils;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.InterstitialAdError */
/* loaded from: classes8.dex */
public class InterstitialAdError {
    public static final int ANALYTICS_ERROR_CODE = 3002;
    public static final int INTERNAL_ERROR_CODE = 2001;
    public static final int LOAD_TOO_FREQUENTLY_ERROR_CODE = 1002;
    public static final int MEDIATION_ERROR_CODE = 3001;
    public static final int NETWORK_ERROR_CODE = 1000;
    public static final int NO_FILL_ERROR_CODE = 1001;
    public static final int SERVER_ERROR_CODE = 2000;
    public static final int UNSPECIFIED_ERROR_CODE = 4001;
    private final String coi222o222;
    private final int coo2iico;
    public static final InterstitialAdError NETWORK_ERROR = new InterstitialAdError(1000, "Network Error");
    public static final InterstitialAdError NO_FILL = new InterstitialAdError(1001, "No Fill");
    public static final InterstitialAdError LOAD_TOO_FREQUENTLY = new InterstitialAdError(1002, "Ad was re-loaded too frequently");
    public static final InterstitialAdError NETWORK_TIMEOUT = new InterstitialAdError(1003, "Network failed to respond in a timely manner");
    public static final InterstitialAdError ADINFO_IS_INVALID = new InterstitialAdError(1008, "AdInfo is invalid");
    public static final InterstitialAdError SERVER_ERROR = new InterstitialAdError(2000, "Server Error");
    public static final InterstitialAdError INTERNAL_ERROR = new InterstitialAdError(2001, "Internal Error");
    public static final InterstitialAdError USERS_CLOSE = new InterstitialAdError(2002, "User Close");
    public static final InterstitialAdError GOOGLE_LIMIT = new InterstitialAdError(2003, "Google Limit");
    public static final InterstitialAdError ANALYTICS_ERROR = new InterstitialAdError(3002, "analytics error");
    public static final InterstitialAdError UNSPECIFIED = new InterstitialAdError(4001, "Unspecified error");
    public static final InterstitialAdError UNSUPPORTED_TYPE = new InterstitialAdError(4002, "Unsupported interstitial type");

    public InterstitialAdError(int i, String str) {
        str = TextUtils.isEmpty(str) ? "Unknown Error" : str;
        this.coo2iico = i;
        this.coi222o222 = str;
    }

    public int getErrorCode() {
        return this.coo2iico;
    }

    public String getErrorMessage() {
        return this.coi222o222;
    }
}
