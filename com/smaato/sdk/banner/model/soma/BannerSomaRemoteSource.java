package com.smaato.sdk.banner.model.soma;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.smaato.sdk.banner.model.BannerAdRequest;
import com.smaato.sdk.banner.p567ad.BannerAdSize;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.mvvm.model.soma.SomaAdRequest;
import com.smaato.sdk.core.mvvm.model.soma.SomaRemoteSource;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.p568ad.AdDimension;
import com.smaato.sdk.core.util.HeaderValueUtils;

/* loaded from: classes7.dex */
public class BannerSomaRemoteSource extends SomaRemoteSource {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.smaato.sdk.banner.model.soma.BannerSomaRemoteSource$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C26973a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71318a;

        static {
            int[] iArr = new int[AdDimension.values().length];
            f71318a = iArr;
            try {
                iArr[AdDimension.XX_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71318a[AdDimension.X_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71318a[AdDimension.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71318a[AdDimension.MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71318a[AdDimension.SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71318a[AdDimension.MEDIUM_RECTANGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71318a[AdDimension.SKYSCRAPER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f71318a[AdDimension.LEADERBOARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f71318a[AdDimension.FULLSCREEN_PORTRAIT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f71318a[AdDimension.FULLSCREEN_LANDSCAPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f71318a[AdDimension.FULLSCREEN_PORTRAIT_TABLET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f71318a[AdDimension.FULLSCREEN_LANDSCAPE_TABLET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public BannerSomaRemoteSource(@NonNull HttpClient httpClient, @NonNull String str, @NonNull HeaderValueUtils headerValueUtils, @NonNull Logger logger) {
        super(httpClient, str, headerValueUtils, logger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.smaato.sdk.core.mvvm.model.soma.SomaRemoteSource
    public Request buildSomaHttpRequest(SomaAdRequest somaAdRequest) {
        Request buildSomaHttpRequest = super.buildSomaHttpRequest(somaAdRequest);
        Uri.Builder buildUpon = buildSomaHttpRequest.uri().buildUpon();
        if (somaAdRequest instanceof BannerAdRequest) {
            BannerAdSize bannerAdSize = ((BannerAdRequest) somaAdRequest).getBannerAdSize();
            if (bannerAdSize != null) {
                buildUpon.appendQueryParameter(ViewHierarchyConstants.DIMENSION_KEY, mapAdDimensionToApiValue(bannerAdSize.adDimension));
            }
            return buildSomaHttpRequest.buildUpon().uri(buildUpon.build()).build();
        }
        return buildSomaHttpRequest;
    }

    @NonNull
    protected String mapAdDimensionToApiValue(@NonNull AdDimension adDimension) {
        switch (C26973a.f71318a[adDimension.ordinal()]) {
            case 1:
                return "xxlarge";
            case 2:
                return "xlarge";
            case 3:
                return "large";
            case 4:
                return "medium";
            case 5:
                return "small";
            case 6:
                return "medrect";
            case 7:
                return "sky";
            case 8:
                return "leader";
            case 9:
                return "full_320x480";
            case 10:
                return "full_480x320";
            case 11:
                return "full_768x1024";
            case 12:
                return "full_1024x768";
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", AdDimension.class.getSimpleName(), adDimension));
        }
    }
}
