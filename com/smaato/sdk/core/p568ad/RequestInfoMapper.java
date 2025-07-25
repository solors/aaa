package com.smaato.sdk.core.p568ad;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.RequestConfiguration;
import com.smaato.sdk.core.AdContentRating;

/* renamed from: com.smaato.sdk.core.ad.RequestInfoMapper */
/* loaded from: classes7.dex */
public final class RequestInfoMapper {

    /* renamed from: com.smaato.sdk.core.ad.RequestInfoMapper$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27005a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71378a;

        /* renamed from: b */
        static final /* synthetic */ int[] f71379b;

        static {
            int[] iArr = new int[AdContentRating.values().length];
            f71379b = iArr;
            try {
                iArr[AdContentRating.MAX_AD_CONTENT_RATING_G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71379b[AdContentRating.MAX_AD_CONTENT_RATING_PG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71379b[AdContentRating.MAX_AD_CONTENT_RATING_T.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71379b[AdContentRating.MAX_AD_CONTENT_RATING_MA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[GeoType.values().length];
            f71378a = iArr2;
            try {
                iArr2[GeoType.GPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71378a[GeoType.IP_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71378a[GeoType.USER_PROVIDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @NonNull
    public Integer mapToApiValue(@NonNull GeoType geoType) {
        int i = C27005a.f71378a[geoType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", GeoType.class.getSimpleName(), geoType));
            }
            return 2;
        }
        return 1;
    }

    @NonNull
    public String mapToApiValue(@NonNull AdContentRating adContentRating) {
        int i = C27005a.f71379b[adContentRating.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return RequestConfiguration.MAX_AD_CONTENT_RATING_MA;
                    }
                    throw new IllegalArgumentException(String.format("Unexpected %s: %s", AdContentRating.class.getSimpleName(), adContentRating));
                }
                return "T";
            }
            return RequestConfiguration.MAX_AD_CONTENT_RATING_PG;
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }
}
