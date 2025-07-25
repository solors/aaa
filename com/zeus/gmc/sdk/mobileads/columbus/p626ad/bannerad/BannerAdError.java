package com.zeus.gmc.sdk.mobileads.columbus.p626ad.bannerad;

import android.text.TextUtils;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.BannerAdError */
/* loaded from: classes8.dex */
public class BannerAdError {
    public static final int ANALYTICS_ERROR_CODE = 3002;
    public static final int INTERNAL_ERROR_CODE = 2001;
    public static final int LOAD_TOO_FREQUENTLY_ERROR_CODE = 1002;
    public static final int MEDIATION_ERROR_CODE = 3001;
    public static final int NETWORK_ERROR_CODE = 1000;
    public static final int NO_FILL_ERROR_CODE = 1001;
    public static final int SERVER_ERROR_CODE = 2000;
    private final String coi222o222;
    private final int coo2iico;
    public static final BannerAdError NETWORK_ERROR = new BannerAdError(1000, "Network Error");
    public static final BannerAdError NO_FILL = new BannerAdError(1001, "No Fill");
    public static final BannerAdError NO_ADSIZE = new BannerAdError(1002, "No AdSize");
    public static final BannerAdError NO_PLACEID = new BannerAdError(1003, "No PlaceID");
    public static final BannerAdError LACK_URL = new BannerAdError(1004, "Lack Url");
    public static final BannerAdError DOWNLOAD_ERROR = new BannerAdError(1005, "Download error");
    public static final BannerAdError BAD_NETWORK_ERROR = new BannerAdError(1006, "Bad Network");
    public static final BannerAdError LOAD_TOO_FREQUENTLY = new BannerAdError(1007, "Ad was re-loaded too frequently");
    public static final BannerAdError ADINFO_IS_INVALID = new BannerAdError(1008, "AdInfo is invalid");
    public static final BannerAdError BANNER_ADVIEW_DESROYED = new BannerAdError(1009, "BannerAdView has been destroyed");
    public static final BannerAdError SERVER_ERROR = new BannerAdError(2000, "Server Error");
    public static final BannerAdError INTERNAL_ERROR = new BannerAdError(2001, "Internal Error");
    public static final BannerAdError USERS_CLOSE = new BannerAdError(2002, "User Close");
    public static final BannerAdError GOOGLE_LIMIT = new BannerAdError(2003, "Google Limit");
    public static final BannerAdError MEDIATION_ERROR = new BannerAdError(3001, "Mediation Error");
    @Deprecated
    public static final BannerAdError MISSING_PROPERTIES = new BannerAdError(2002, "Native ad failed to load due to missing properties");
    public static final BannerAdError ANALYTICS_ERROR = new BannerAdError(3002, "analytics error");

    public BannerAdError(int i, String str) {
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
