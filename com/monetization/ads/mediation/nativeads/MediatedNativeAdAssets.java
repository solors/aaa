package com.monetization.ads.mediation.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedNativeAdAssets {
    @Nullable

    /* renamed from: a */
    private final String f66503a;
    @Nullable

    /* renamed from: b */
    private final String f66504b;
    @Nullable

    /* renamed from: c */
    private final String f66505c;
    @Nullable

    /* renamed from: d */
    private final String f66506d;
    @Nullable

    /* renamed from: e */
    private final MediatedNativeAdImage f66507e;
    @Nullable

    /* renamed from: f */
    private final MediatedNativeAdImage f66508f;
    @Nullable

    /* renamed from: g */
    private final MediatedNativeAdImage f66509g;
    @Nullable

    /* renamed from: h */
    private final MediatedNativeAdMedia f66510h;
    @Nullable

    /* renamed from: i */
    private final String f66511i;
    @Nullable

    /* renamed from: j */
    private final String f66512j;
    @Nullable

    /* renamed from: k */
    private final String f66513k;
    @Nullable

    /* renamed from: l */
    private final String f66514l;
    @Nullable

    /* renamed from: m */
    private final String f66515m;
    @Nullable

    /* renamed from: n */
    private final String f66516n;
    @Nullable

    /* renamed from: o */
    private final MediatedNativeAdImage f66517o;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private String f66518a;
        @Nullable

        /* renamed from: b */
        private String f66519b;
        @Nullable

        /* renamed from: c */
        private String f66520c;
        @Nullable

        /* renamed from: d */
        private String f66521d;
        @Nullable

        /* renamed from: e */
        private MediatedNativeAdImage f66522e;
        @Nullable

        /* renamed from: f */
        private MediatedNativeAdImage f66523f;
        @Nullable

        /* renamed from: g */
        private MediatedNativeAdImage f66524g;
        @Nullable

        /* renamed from: h */
        private MediatedNativeAdMedia f66525h;
        @Nullable

        /* renamed from: i */
        private String f66526i;
        @Nullable

        /* renamed from: j */
        private String f66527j;
        @Nullable

        /* renamed from: k */
        private String f66528k;
        @Nullable

        /* renamed from: l */
        private String f66529l;
        @Nullable

        /* renamed from: m */
        private String f66530m;
        @Nullable

        /* renamed from: n */
        private String f66531n;
        @Nullable

        /* renamed from: o */
        private MediatedNativeAdImage f66532o;

        @NotNull
        public final MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this.f66518a, this.f66519b, this.f66520c, this.f66521d, this.f66522e, this.f66523f, this.f66524g, this.f66525h, this.f66526i, this.f66527j, this.f66528k, this.f66529l, this.f66530m, this.f66531n, this.f66532o, null);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f66518a = str;
            return this;
        }

        @NotNull
        public final Builder setBody(@Nullable String str) {
            this.f66519b = str;
            return this;
        }

        @NotNull
        public final Builder setCallToAction(@Nullable String str) {
            this.f66520c = str;
            return this;
        }

        @NotNull
        public final Builder setDomain(@Nullable String str) {
            this.f66521d = str;
            return this;
        }

        @NotNull
        public final Builder setFavicon(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f66522e = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setFeedback(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f66532o = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setIcon(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f66523f = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setImage(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f66524g = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setMedia(@Nullable MediatedNativeAdMedia mediatedNativeAdMedia) {
            this.f66525h = mediatedNativeAdMedia;
            return this;
        }

        @NotNull
        public final Builder setPrice(@Nullable String str) {
            this.f66526i = str;
            return this;
        }

        @NotNull
        public final Builder setRating(@Nullable String str) {
            this.f66527j = str;
            return this;
        }

        @NotNull
        public final Builder setReviewCount(@Nullable String str) {
            this.f66528k = str;
            return this;
        }

        @NotNull
        public final Builder setSponsored(@Nullable String str) {
            this.f66529l = str;
            return this;
        }

        @NotNull
        public final Builder setTitle(@Nullable String str) {
            this.f66530m = str;
            return this;
        }

        @NotNull
        public final Builder setWarning(@Nullable String str) {
            this.f66531n = str;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, mediatedNativeAdImage, mediatedNativeAdImage2, mediatedNativeAdImage3, mediatedNativeAdMedia, str5, str6, str7, str8, str9, str10, mediatedNativeAdImage4);
    }

    @Nullable
    public final String getAge() {
        return this.f66503a;
    }

    @Nullable
    public final String getBody() {
        return this.f66504b;
    }

    @Nullable
    public final String getCallToAction() {
        return this.f66505c;
    }

    @Nullable
    public final String getDomain() {
        return this.f66506d;
    }

    @Nullable
    public final MediatedNativeAdImage getFavicon() {
        return this.f66507e;
    }

    @Nullable
    public final MediatedNativeAdImage getFeedback() {
        return this.f66517o;
    }

    @Nullable
    public final MediatedNativeAdImage getIcon() {
        return this.f66508f;
    }

    @Nullable
    public final MediatedNativeAdImage getImage() {
        return this.f66509g;
    }

    @Nullable
    public final MediatedNativeAdMedia getMedia() {
        return this.f66510h;
    }

    @Nullable
    public final String getPrice() {
        return this.f66511i;
    }

    @Nullable
    public final String getRating() {
        return this.f66512j;
    }

    @Nullable
    public final String getReviewCount() {
        return this.f66513k;
    }

    @Nullable
    public final String getSponsored() {
        return this.f66514l;
    }

    @Nullable
    public final String getTitle() {
        return this.f66515m;
    }

    @Nullable
    public final String getWarning() {
        return this.f66516n;
    }

    private MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4) {
        this.f66503a = str;
        this.f66504b = str2;
        this.f66505c = str3;
        this.f66506d = str4;
        this.f66507e = mediatedNativeAdImage;
        this.f66508f = mediatedNativeAdImage2;
        this.f66509g = mediatedNativeAdImage3;
        this.f66510h = mediatedNativeAdMedia;
        this.f66511i = str5;
        this.f66512j = str6;
        this.f66513k = str7;
        this.f66514l = str8;
        this.f66515m = str9;
        this.f66516n = str10;
        this.f66517o = mediatedNativeAdImage4;
    }
}
