package com.zeus.gmc.sdk.mobileads.columbus.p626ad.splashad;

import android.text.TextUtils;
import com.facebook.ads.AdError;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.splashad.SplashAdError */
/* loaded from: classes8.dex */
public class SplashAdError {
    public static final SplashAdError TIMEOUT_ERROR = new SplashAdError(9000, "Get AD timeout");
    public static final SplashAdError VIEW_ERROR = new SplashAdError(AdError.AD_PRESENTATION_ERROR_CODE, "View error");
    private final String coi222o222;
    private final int coo2iico;

    public SplashAdError(int i, String str) {
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
