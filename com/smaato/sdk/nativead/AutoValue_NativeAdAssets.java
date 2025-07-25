package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.nativead.NativeAdAssets;
import java.util.List;

/* renamed from: com.smaato.sdk.nativead.a */
/* loaded from: classes7.dex */
final class AutoValue_NativeAdAssets extends NativeAdAssets {

    /* renamed from: a */
    private final String f72152a;

    /* renamed from: b */
    private final String f72153b;

    /* renamed from: c */
    private final String f72154c;

    /* renamed from: d */
    private final String f72155d;

    /* renamed from: e */
    private final String f72156e;

    /* renamed from: f */
    private final String f72157f;

    /* renamed from: g */
    private final NativeAdAssets.Image f72158g;

    /* renamed from: h */
    private final List<NativeAdAssets.Image> f72159h;

    /* renamed from: i */
    private final Double f72160i;

    /* compiled from: AutoValue_NativeAdAssets.java */
    /* renamed from: com.smaato.sdk.nativead.a$b */
    /* loaded from: classes7.dex */
    static final class C27457b extends NativeAdAssets.Builder {

        /* renamed from: a */
        private String f72161a;

        /* renamed from: b */
        private String f72162b;

        /* renamed from: c */
        private String f72163c;

        /* renamed from: d */
        private String f72164d;

        /* renamed from: e */
        private String f72165e;

        /* renamed from: f */
        private String f72166f;

        /* renamed from: g */
        private NativeAdAssets.Image f72167g;

        /* renamed from: h */
        private List<NativeAdAssets.Image> f72168h;

        /* renamed from: i */
        private Double f72169i;

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets build() {
            String str = "";
            if (this.f72168h == null) {
                str = " images";
            }
            if (str.isEmpty()) {
                return new AutoValue_NativeAdAssets(this.f72161a, this.f72162b, this.f72163c, this.f72164d, this.f72165e, this.f72166f, this.f72167g, this.f72168h, this.f72169i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder cta(String str) {
            this.f72166f = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder icon(NativeAdAssets.Image image) {
            this.f72167g = image;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder images(List<NativeAdAssets.Image> list) {
            if (list != null) {
                this.f72168h = list;
                return this;
            }
            throw new NullPointerException("Null images");
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder mraidJs(String str) {
            this.f72162b = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder rating(Double d) {
            this.f72169i = d;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder sponsored(String str) {
            this.f72165e = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder text(String str) {
            this.f72164d = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder title(String str) {
            this.f72161a = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdAssets.Builder
        public NativeAdAssets.Builder vastTag(String str) {
            this.f72163c = str;
            return this;
        }
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public String cta() {
        return this.f72157f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdAssets)) {
            return false;
        }
        NativeAdAssets nativeAdAssets = (NativeAdAssets) obj;
        String str = this.f72152a;
        if (str != null ? str.equals(nativeAdAssets.title()) : nativeAdAssets.title() == null) {
            String str2 = this.f72153b;
            if (str2 != null ? str2.equals(nativeAdAssets.mraidJs()) : nativeAdAssets.mraidJs() == null) {
                String str3 = this.f72154c;
                if (str3 != null ? str3.equals(nativeAdAssets.vastTag()) : nativeAdAssets.vastTag() == null) {
                    String str4 = this.f72155d;
                    if (str4 != null ? str4.equals(nativeAdAssets.text()) : nativeAdAssets.text() == null) {
                        String str5 = this.f72156e;
                        if (str5 != null ? str5.equals(nativeAdAssets.sponsored()) : nativeAdAssets.sponsored() == null) {
                            String str6 = this.f72157f;
                            if (str6 != null ? str6.equals(nativeAdAssets.cta()) : nativeAdAssets.cta() == null) {
                                NativeAdAssets.Image image = this.f72158g;
                                if (image != null ? image.equals(nativeAdAssets.icon()) : nativeAdAssets.icon() == null) {
                                    if (this.f72159h.equals(nativeAdAssets.images())) {
                                        Double d = this.f72160i;
                                        if (d == null) {
                                            if (nativeAdAssets.rating() == null) {
                                                return true;
                                            }
                                        } else if (d.equals(nativeAdAssets.rating())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.f72152a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f72153b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f72154c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str4 = this.f72155d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str5 = this.f72156e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str6 = this.f72157f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 ^ hashCode6) * 1000003;
        NativeAdAssets.Image image = this.f72158g;
        if (image == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = image.hashCode();
        }
        int hashCode8 = (((i7 ^ hashCode7) * 1000003) ^ this.f72159h.hashCode()) * 1000003;
        Double d = this.f72160i;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode8 ^ i;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public NativeAdAssets.Image icon() {
        return this.f72158g;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @NonNull
    public List<NativeAdAssets.Image> images() {
        return this.f72159h;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public String mraidJs() {
        return this.f72153b;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public Double rating() {
        return this.f72160i;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public String sponsored() {
        return this.f72156e;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public String text() {
        return this.f72155d;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public String title() {
        return this.f72152a;
    }

    public String toString() {
        return "NativeAdAssets{title=" + this.f72152a + ", mraidJs=" + this.f72153b + ", vastTag=" + this.f72154c + ", text=" + this.f72155d + ", sponsored=" + this.f72156e + ", cta=" + this.f72157f + ", icon=" + this.f72158g + ", images=" + this.f72159h + ", rating=" + this.f72160i + "}";
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets
    @Nullable
    public String vastTag() {
        return this.f72154c;
    }

    private AutoValue_NativeAdAssets(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable NativeAdAssets.Image image, List<NativeAdAssets.Image> list, @Nullable Double d) {
        this.f72152a = str;
        this.f72153b = str2;
        this.f72154c = str3;
        this.f72155d = str4;
        this.f72156e = str5;
        this.f72157f = str6;
        this.f72158g = image;
        this.f72159h = list;
        this.f72160i = d;
    }
}
