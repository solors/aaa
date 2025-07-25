package com.unity3d.services.banners;

import com.unity3d.ads.UnityAds;

/* loaded from: classes7.dex */
public class BannerErrorInfo {
    public BannerErrorCode errorCode;
    public String errorMessage;

    /* renamed from: com.unity3d.services.banners.BannerErrorInfo$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C288821 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        static {
            int[] iArr = new int[UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr;
            try {
                iArr[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[BannerErrorCode.values().length];
            $SwitchMap$com$unity3d$services$banners$BannerErrorCode = iArr2;
            try {
                iArr2[BannerErrorCode.NATIVE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public BannerErrorInfo(String str, BannerErrorCode bannerErrorCode) {
        this.errorCode = bannerErrorCode;
        this.errorMessage = str;
    }

    public static BannerErrorInfo fromLoadError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i = C288821.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return new BannerErrorInfo(str, BannerErrorCode.UNKNOWN);
                }
                return new BannerErrorInfo(str, BannerErrorCode.NO_FILL);
            }
            return new BannerErrorInfo(str, BannerErrorCode.WEBVIEW_ERROR);
        }
        return new BannerErrorInfo(str, BannerErrorCode.NATIVE_ERROR);
    }

    public UnityAds.UnityAdsLoadError toLoadError() {
        int i = C288821.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[this.errorCode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
                }
                return UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
            }
            return UnityAds.UnityAdsLoadError.NO_FILL;
        }
        return UnityAds.UnityAdsLoadError.INVALID_ARGUMENT;
    }
}
