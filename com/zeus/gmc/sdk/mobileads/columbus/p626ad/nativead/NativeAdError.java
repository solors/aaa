package com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead;

import android.text.TextUtils;
import com.vungle.ads.AbstractC29537l2;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.nativead.NativeAdError */
/* loaded from: classes8.dex */
public class NativeAdError {
    private boolean c2oc2i;
    private final String coi222o222;
    private final int coo2iico;
    public static final NativeAdError NETWORK_ERROR = new NativeAdError(1000, "Network Error");
    public static final NativeAdError NO_FILL = new NativeAdError(1001, "No Fill");
    public static final NativeAdError LOAD_TOO_FREQUENTLY = new NativeAdError(1002, "Ad was re-loaded too frequently");
    public static final NativeAdError ADINFO_IS_INVALID = new NativeAdError(1008, "AdInfo is invalid");
    public static final NativeAdError SERVER_ERROR = new NativeAdError(2000, "Server Error");
    public static final NativeAdError INTERNAL_ERROR = new NativeAdError(2001, "Internal Error");
    public static final NativeAdError USERS_CLOSE = new NativeAdError(2002, "User Close");
    public static final NativeAdError GOOGLE_LIMIT = new NativeAdError(2003, "Google Limit");
    public static final NativeAdError LOADING = new NativeAdError(2004, "Loading");
    public static final NativeAdError LOADED = new NativeAdError(2005, "Loaded");
    public static final NativeAdError MEDIATION_ERROR = new NativeAdError(3001, "Mediation Error");
    public static final NativeAdError NO_CACHE = new NativeAdError(AbstractC29537l2.AD_UNABLE_TO_PLAY, "video ad no cache");
    @Deprecated
    public static final NativeAdError MISSING_PROPERTIES = new NativeAdError(2002, "Native ad failed to load due to missing properties");
    public static final NativeAdError ANALYTICS_ERROR = new NativeAdError(3002, "analytics error");
    public static final NativeAdError TIMEOUT_ERROR = new NativeAdError(9000, "Get AD timeout");
    public static final NativeAdError LITE_LIMIT = new NativeAdError(4001, "lite limit");
    public static final NativeAdError GET_ADSENSE_SUCCESS = new NativeAdError(5000, "get adsense SUCCESS");
    public static final NativeAdError GET_ADSENSE_NO_CONFIG = new NativeAdError(5001, "get adsense no config");
    public static final NativeAdError GET_ADSENSE_NO_TAG_ID = new NativeAdError(5002, "get adsense no tagId");
    public static final NativeAdError GET_ADSENSE_TAG_ID_NULL = new NativeAdError(5003, "get adsense tagId null");

    public NativeAdError(int i, String str) {
        str = TextUtils.isEmpty(str) ? "Unknown Error" : str;
        this.coo2iico = i;
        this.coi222o222 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.coo2iico == ((NativeAdError) obj).coo2iico) {
            return true;
        }
        return false;
    }

    public int getErrorCode() {
        return this.coo2iico;
    }

    public String getErrorMessage() {
        return this.coi222o222;
    }

    public boolean isFromServerError() {
        return this.c2oc2i;
    }

    public NativeAdError(int i, String str, boolean z) {
        str = TextUtils.isEmpty(str) ? "Unknown Error" : str;
        this.coo2iico = i;
        this.coi222o222 = str;
        this.c2oc2i = z;
    }
}
