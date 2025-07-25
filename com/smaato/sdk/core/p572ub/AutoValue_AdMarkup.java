package com.smaato.sdk.core.p572ub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.p568ad.Expiration;
import com.smaato.sdk.core.p572ub.AdMarkup;

/* renamed from: com.smaato.sdk.core.ub.a */
/* loaded from: classes7.dex */
final class AutoValue_AdMarkup extends AdMarkup {

    /* renamed from: a */
    private final String f71897a;

    /* renamed from: b */
    private final String f71898b;

    /* renamed from: c */
    private final String f71899c;

    /* renamed from: d */
    private final String f71900d;

    /* renamed from: e */
    private final String f71901e;

    /* renamed from: f */
    private final String f71902f;

    /* renamed from: g */
    private final Expiration f71903g;

    /* renamed from: h */
    private final ImpressionCountingType f71904h;

    /* compiled from: AutoValue_AdMarkup.java */
    /* renamed from: com.smaato.sdk.core.ub.a$b */
    /* loaded from: classes7.dex */
    static final class C27278b extends AdMarkup.Builder {

        /* renamed from: a */
        private String f71905a;

        /* renamed from: b */
        private String f71906b;

        /* renamed from: c */
        private String f71907c;

        /* renamed from: d */
        private String f71908d;

        /* renamed from: e */
        private String f71909e;

        /* renamed from: f */
        private String f71910f;

        /* renamed from: g */
        private Expiration f71911g;

        /* renamed from: h */
        private ImpressionCountingType f71912h;

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder adFormat(String str) {
            if (str != null) {
                this.f71906b = str;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder adSpaceId(String str) {
            if (str != null) {
                this.f71910f = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup build() {
            String str = "";
            if (this.f71905a == null) {
                str = " markup";
            }
            if (this.f71906b == null) {
                str = str + " adFormat";
            }
            if (this.f71907c == null) {
                str = str + " sessionId";
            }
            if (this.f71910f == null) {
                str = str + " adSpaceId";
            }
            if (this.f71911g == null) {
                str = str + " expiresAt";
            }
            if (this.f71912h == null) {
                str = str + " impressionCountingType";
            }
            if (str.isEmpty()) {
                return new AutoValue_AdMarkup(this.f71905a, this.f71906b, this.f71907c, this.f71908d, this.f71909e, this.f71910f, this.f71911g, this.f71912h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder bundleId(String str) {
            this.f71908d = str;
            return this;
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder creativeId(String str) {
            this.f71909e = str;
            return this;
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder expiresAt(Expiration expiration) {
            if (expiration != null) {
                this.f71911g = expiration;
                return this;
            }
            throw new NullPointerException("Null expiresAt");
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder impressionCountingType(ImpressionCountingType impressionCountingType) {
            if (impressionCountingType != null) {
                this.f71912h = impressionCountingType;
                return this;
            }
            throw new NullPointerException("Null impressionCountingType");
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder markup(String str) {
            if (str != null) {
                this.f71905a = str;
                return this;
            }
            throw new NullPointerException("Null markup");
        }

        @Override // com.smaato.sdk.core.p572ub.AdMarkup.Builder
        public AdMarkup.Builder sessionId(String str) {
            if (str != null) {
                this.f71907c = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @NonNull
    public String adFormat() {
        return this.f71898b;
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @NonNull
    public String adSpaceId() {
        return this.f71902f;
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @Nullable
    public String bundleId() {
        return this.f71900d;
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @Nullable
    public String creativeId() {
        return this.f71901e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdMarkup)) {
            return false;
        }
        AdMarkup adMarkup = (AdMarkup) obj;
        if (this.f71897a.equals(adMarkup.markup()) && this.f71898b.equals(adMarkup.adFormat()) && this.f71899c.equals(adMarkup.sessionId()) && ((str = this.f71900d) != null ? str.equals(adMarkup.bundleId()) : adMarkup.bundleId() == null) && ((str2 = this.f71901e) != null ? str2.equals(adMarkup.creativeId()) : adMarkup.creativeId() == null) && this.f71902f.equals(adMarkup.adSpaceId()) && this.f71903g.equals(adMarkup.expiresAt()) && this.f71904h.equals(adMarkup.impressionCountingType())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @NonNull
    public Expiration expiresAt() {
        return this.f71903g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f71897a.hashCode() ^ 1000003) * 1000003) ^ this.f71898b.hashCode()) * 1000003) ^ this.f71899c.hashCode()) * 1000003;
        String str = this.f71900d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f71901e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((i2 ^ i) * 1000003) ^ this.f71902f.hashCode()) * 1000003) ^ this.f71903g.hashCode()) * 1000003) ^ this.f71904h.hashCode();
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @NonNull
    public ImpressionCountingType impressionCountingType() {
        return this.f71904h;
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @NonNull
    public String markup() {
        return this.f71897a;
    }

    @Override // com.smaato.sdk.core.p572ub.AdMarkup
    @NonNull
    public String sessionId() {
        return this.f71899c;
    }

    public String toString() {
        return "AdMarkup{markup=" + this.f71897a + ", adFormat=" + this.f71898b + ", sessionId=" + this.f71899c + ", bundleId=" + this.f71900d + ", creativeId=" + this.f71901e + ", adSpaceId=" + this.f71902f + ", expiresAt=" + this.f71903g + ", impressionCountingType=" + this.f71904h + "}";
    }

    private AutoValue_AdMarkup(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, String str6, Expiration expiration, ImpressionCountingType impressionCountingType) {
        this.f71897a = str;
        this.f71898b = str2;
        this.f71899c = str3;
        this.f71900d = str4;
        this.f71901e = str5;
        this.f71902f = str6;
        this.f71903g = expiration;
        this.f71904h = impressionCountingType;
    }
}
