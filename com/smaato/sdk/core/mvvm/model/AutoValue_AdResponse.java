package com.smaato.sdk.core.mvvm.model;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.imagead.Extension;
import com.smaato.sdk.core.p568ad.AdType;
import java.util.List;

/* renamed from: com.smaato.sdk.core.mvvm.model.b */
/* loaded from: classes7.dex */
final class AutoValue_AdResponse extends AdResponse {

    /* renamed from: a */
    private final String f71678a;

    /* renamed from: b */
    private final String f71679b;

    /* renamed from: c */
    private final String f71680c;

    /* renamed from: d */
    private final AdType f71681d;

    /* renamed from: e */
    private final Integer f71682e;

    /* renamed from: f */
    private final Integer f71683f;

    /* renamed from: g */
    private final String f71684g;

    /* renamed from: h */
    private final Bitmap f71685h;

    /* renamed from: i */
    private final String f71686i;

    /* renamed from: j */
    private final Object f71687j;

    /* renamed from: k */
    private final Object f71688k;

    /* renamed from: l */
    private final Long f71689l;

    /* renamed from: m */
    private final Integer f71690m;

    /* renamed from: n */
    private final List<String> f71691n;

    /* renamed from: o */
    private final List<String> f71692o;

    /* renamed from: p */
    private final List<Extension> f71693p;

    /* renamed from: q */
    private final ImpressionCountingType f71694q;

    /* renamed from: r */
    private final String f71695r;

    /* renamed from: s */
    private final Object f71696s;

    /* compiled from: AutoValue_AdResponse.java */
    /* renamed from: com.smaato.sdk.core.mvvm.model.b$b */
    /* loaded from: classes7.dex */
    static final class C27173b extends AdResponse.Builder {

        /* renamed from: a */
        private String f71697a;

        /* renamed from: b */
        private String f71698b;

        /* renamed from: c */
        private String f71699c;

        /* renamed from: d */
        private AdType f71700d;

        /* renamed from: e */
        private Integer f71701e;

        /* renamed from: f */
        private Integer f71702f;

        /* renamed from: g */
        private String f71703g;

        /* renamed from: h */
        private Bitmap f71704h;

        /* renamed from: i */
        private String f71705i;

        /* renamed from: j */
        private Object f71706j;

        /* renamed from: k */
        private Object f71707k;

        /* renamed from: l */
        private Long f71708l;

        /* renamed from: m */
        private Integer f71709m;

        /* renamed from: n */
        private List<String> f71710n;

        /* renamed from: o */
        private List<String> f71711o;

        /* renamed from: p */
        private List<Extension> f71712p;

        /* renamed from: q */
        private ImpressionCountingType f71713q;

        /* renamed from: r */
        private String f71714r;

        /* renamed from: s */
        private Object f71715s;

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse build() {
            String str = "";
            if (this.f71697a == null) {
                str = " sessionId";
            }
            if (this.f71700d == null) {
                str = str + " adType";
            }
            if (this.f71701e == null) {
                str = str + " width";
            }
            if (this.f71702f == null) {
                str = str + " height";
            }
            if (this.f71710n == null) {
                str = str + " impressionTrackingUrls";
            }
            if (this.f71711o == null) {
                str = str + " clickTrackingUrls";
            }
            if (this.f71713q == null) {
                str = str + " impressionCountingType";
            }
            if (str.isEmpty()) {
                return new AutoValue_AdResponse(this.f71697a, this.f71698b, this.f71699c, this.f71700d, this.f71701e, this.f71702f, this.f71703g, this.f71704h, this.f71705i, this.f71706j, this.f71707k, this.f71708l, this.f71709m, this.f71710n, this.f71711o, this.f71712p, this.f71713q, this.f71714r, this.f71715s);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setAdType(AdType adType) {
            if (adType != null) {
                this.f71700d = adType;
                return this;
            }
            throw new NullPointerException("Null adType");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setBundleId(String str) {
            this.f71698b = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setClickTrackingUrls(List<String> list) {
            if (list != null) {
                this.f71711o = list;
                return this;
            }
            throw new NullPointerException("Null clickTrackingUrls");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setClickUrl(String str) {
            this.f71714r = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setCsmObject(Object obj) {
            this.f71715s = obj;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setExtensions(List<Extension> list) {
            this.f71712p = list;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setHeight(Integer num) {
            if (num != null) {
                this.f71702f = num;
                return this;
            }
            throw new NullPointerException("Null height");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setImageBitmap(Bitmap bitmap) {
            this.f71704h = bitmap;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setImageUrl(String str) {
            this.f71703g = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setImpressionCountingType(ImpressionCountingType impressionCountingType) {
            if (impressionCountingType != null) {
                this.f71713q = impressionCountingType;
                return this;
            }
            throw new NullPointerException("Null impressionCountingType");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setImpressionTrackingUrls(List<String> list) {
            if (list != null) {
                this.f71710n = list;
                return this;
            }
            throw new NullPointerException("Null impressionTrackingUrls");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setNativeObject(Object obj) {
            this.f71707k = obj;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setRichMediaContent(String str) {
            this.f71705i = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setRichMediaRewardIntervalSeconds(Integer num) {
            this.f71709m = num;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setSci(String str) {
            this.f71699c = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setSessionId(String str) {
            if (str != null) {
                this.f71697a = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setTtlMs(Long l) {
            this.f71708l = l;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setVastObject(Object obj) {
            this.f71706j = obj;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdResponse.Builder
        public AdResponse.Builder setWidth(Integer num) {
            if (num != null) {
                this.f71701e = num;
                return this;
            }
            throw new NullPointerException("Null width");
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        Bitmap bitmap;
        String str4;
        Object obj2;
        Object obj3;
        Long l;
        Integer num;
        List<Extension> list;
        String str5;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdResponse)) {
            return false;
        }
        AdResponse adResponse = (AdResponse) obj;
        if (this.f71678a.equals(adResponse.getSessionId()) && ((str = this.f71679b) != null ? str.equals(adResponse.getBundleId()) : adResponse.getBundleId() == null) && ((str2 = this.f71680c) != null ? str2.equals(adResponse.getSci()) : adResponse.getSci() == null) && this.f71681d.equals(adResponse.getAdType()) && this.f71682e.equals(adResponse.getWidth()) && this.f71683f.equals(adResponse.getHeight()) && ((str3 = this.f71684g) != null ? str3.equals(adResponse.getImageUrl()) : adResponse.getImageUrl() == null) && ((bitmap = this.f71685h) != null ? bitmap.equals(adResponse.getImageBitmap()) : adResponse.getImageBitmap() == null) && ((str4 = this.f71686i) != null ? str4.equals(adResponse.getRichMediaContent()) : adResponse.getRichMediaContent() == null) && ((obj2 = this.f71687j) != null ? obj2.equals(adResponse.getVastObject()) : adResponse.getVastObject() == null) && ((obj3 = this.f71688k) != null ? obj3.equals(adResponse.getNativeObject()) : adResponse.getNativeObject() == null) && ((l = this.f71689l) != null ? l.equals(adResponse.getTtlMs()) : adResponse.getTtlMs() == null) && ((num = this.f71690m) != null ? num.equals(adResponse.getRichMediaRewardIntervalSeconds()) : adResponse.getRichMediaRewardIntervalSeconds() == null) && this.f71691n.equals(adResponse.getImpressionTrackingUrls()) && this.f71692o.equals(adResponse.getClickTrackingUrls()) && ((list = this.f71693p) != null ? list.equals(adResponse.getExtensions()) : adResponse.getExtensions() == null) && this.f71694q.equals(adResponse.getImpressionCountingType()) && ((str5 = this.f71695r) != null ? str5.equals(adResponse.getClickUrl()) : adResponse.getClickUrl() == null)) {
            Object obj4 = this.f71696s;
            if (obj4 == null) {
                if (adResponse.getCsmObject() == null) {
                    return true;
                }
            } else if (obj4.equals(adResponse.getCsmObject())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @NonNull
    public AdType getAdType() {
        return this.f71681d;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public String getBundleId() {
        return this.f71679b;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @NonNull
    public List<String> getClickTrackingUrls() {
        return this.f71692o;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public String getClickUrl() {
        return this.f71695r;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public Object getCsmObject() {
        return this.f71696s;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public List<Extension> getExtensions() {
        return this.f71693p;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @NonNull
    public Integer getHeight() {
        return this.f71683f;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public Bitmap getImageBitmap() {
        return this.f71685h;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public String getImageUrl() {
        return this.f71684g;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @NonNull
    public ImpressionCountingType getImpressionCountingType() {
        return this.f71694q;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @NonNull
    public List<String> getImpressionTrackingUrls() {
        return this.f71691n;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public Object getNativeObject() {
        return this.f71688k;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public String getRichMediaContent() {
        return this.f71686i;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public Integer getRichMediaRewardIntervalSeconds() {
        return this.f71690m;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public String getSci() {
        return this.f71680c;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @NonNull
    public String getSessionId() {
        return this.f71678a;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public Long getTtlMs() {
        return this.f71689l;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @Nullable
    public Object getVastObject() {
        return this.f71687j;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponse
    @NonNull
    public Integer getWidth() {
        return this.f71682e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = (this.f71678a.hashCode() ^ 1000003) * 1000003;
        String str = this.f71679b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode12 ^ hashCode) * 1000003;
        String str2 = this.f71680c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode13 = (((((((i2 ^ hashCode2) * 1000003) ^ this.f71681d.hashCode()) * 1000003) ^ this.f71682e.hashCode()) * 1000003) ^ this.f71683f.hashCode()) * 1000003;
        String str3 = this.f71684g;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (hashCode13 ^ hashCode3) * 1000003;
        Bitmap bitmap = this.f71685h;
        if (bitmap == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bitmap.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str4 = this.f71686i;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        Object obj = this.f71687j;
        if (obj == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = obj.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        Object obj2 = this.f71688k;
        if (obj2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = obj2.hashCode();
        }
        int i7 = (i6 ^ hashCode7) * 1000003;
        Long l = this.f71689l;
        if (l == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l.hashCode();
        }
        int i8 = (i7 ^ hashCode8) * 1000003;
        Integer num = this.f71690m;
        if (num == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num.hashCode();
        }
        int hashCode14 = (((((i8 ^ hashCode9) * 1000003) ^ this.f71691n.hashCode()) * 1000003) ^ this.f71692o.hashCode()) * 1000003;
        List<Extension> list = this.f71693p;
        if (list == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list.hashCode();
        }
        int hashCode15 = (((hashCode14 ^ hashCode10) * 1000003) ^ this.f71694q.hashCode()) * 1000003;
        String str5 = this.f71695r;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int i9 = (hashCode15 ^ hashCode11) * 1000003;
        Object obj3 = this.f71696s;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return i9 ^ i;
    }

    public String toString() {
        return "AdResponse{sessionId=" + this.f71678a + ", bundleId=" + this.f71679b + ", sci=" + this.f71680c + ", adType=" + this.f71681d + ", width=" + this.f71682e + ", height=" + this.f71683f + ", imageUrl=" + this.f71684g + ", imageBitmap=" + this.f71685h + ", richMediaContent=" + this.f71686i + ", vastObject=" + this.f71687j + ", nativeObject=" + this.f71688k + ", ttlMs=" + this.f71689l + ", richMediaRewardIntervalSeconds=" + this.f71690m + ", impressionTrackingUrls=" + this.f71691n + ", clickTrackingUrls=" + this.f71692o + ", extensions=" + this.f71693p + ", impressionCountingType=" + this.f71694q + ", clickUrl=" + this.f71695r + ", csmObject=" + this.f71696s + "}";
    }

    private AutoValue_AdResponse(String str, @Nullable String str2, @Nullable String str3, AdType adType, Integer num, Integer num2, @Nullable String str4, @Nullable Bitmap bitmap, @Nullable String str5, @Nullable Object obj, @Nullable Object obj2, @Nullable Long l, @Nullable Integer num3, List<String> list, List<String> list2, @Nullable List<Extension> list3, ImpressionCountingType impressionCountingType, @Nullable String str6, @Nullable Object obj3) {
        this.f71678a = str;
        this.f71679b = str2;
        this.f71680c = str3;
        this.f71681d = adType;
        this.f71682e = num;
        this.f71683f = num2;
        this.f71684g = str4;
        this.f71685h = bitmap;
        this.f71686i = str5;
        this.f71687j = obj;
        this.f71688k = obj2;
        this.f71689l = l;
        this.f71690m = num3;
        this.f71691n = list;
        this.f71692o = list2;
        this.f71693p = list3;
        this.f71694q = impressionCountingType;
        this.f71695r = str6;
        this.f71696s = obj3;
    }
}
