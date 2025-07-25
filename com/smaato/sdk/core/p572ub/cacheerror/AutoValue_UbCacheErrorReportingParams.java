package com.smaato.sdk.core.p572ub.cacheerror;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams;

/* renamed from: com.smaato.sdk.core.ub.cacheerror.a */
/* loaded from: classes7.dex */
final class AutoValue_UbCacheErrorReportingParams extends UbCacheErrorReportingParams {

    /* renamed from: a */
    private final String f71919a;

    /* renamed from: b */
    private final String f71920b;

    /* renamed from: c */
    private final String f71921c;

    /* renamed from: d */
    private final String f71922d;

    /* renamed from: e */
    private final AdFormat f71923e;

    /* renamed from: f */
    private final Long f71924f;

    /* compiled from: AutoValue_UbCacheErrorReportingParams.java */
    /* renamed from: com.smaato.sdk.core.ub.cacheerror.a$b */
    /* loaded from: classes7.dex */
    static final class C27284b extends UbCacheErrorReportingParams.Builder {

        /* renamed from: a */
        private String f71925a;

        /* renamed from: b */
        private String f71926b;

        /* renamed from: c */
        private String f71927c;

        /* renamed from: d */
        private String f71928d;

        /* renamed from: e */
        private AdFormat f71929e;

        /* renamed from: f */
        private Long f71930f;

        @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams.Builder
        public UbCacheErrorReportingParams build() {
            String str = "";
            if (this.f71925a == null) {
                str = " publisherId";
            }
            if (this.f71926b == null) {
                str = str + " adSpaceId";
            }
            if (str.isEmpty()) {
                return new AutoValue_UbCacheErrorReportingParams(this.f71925a, this.f71926b, this.f71927c, this.f71928d, this.f71929e, this.f71930f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams.Builder
        public UbCacheErrorReportingParams.Builder setAdFormat(@Nullable AdFormat adFormat) {
            this.f71929e = adFormat;
            return this;
        }

        @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams.Builder
        public UbCacheErrorReportingParams.Builder setAdSpaceId(@Nullable String str) {
            if (str != null) {
                this.f71926b = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams.Builder
        public UbCacheErrorReportingParams.Builder setCreativeId(@Nullable String str) {
            this.f71928d = str;
            return this;
        }

        @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams.Builder
        public UbCacheErrorReportingParams.Builder setPublisherId(@Nullable String str) {
            if (str != null) {
                this.f71925a = str;
                return this;
            }
            throw new NullPointerException("Null publisherId");
        }

        @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams.Builder
        public UbCacheErrorReportingParams.Builder setRequestTimestamp(@Nullable Long l) {
            this.f71930f = l;
            return this;
        }

        @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams.Builder
        public UbCacheErrorReportingParams.Builder setSessionId(@Nullable String str) {
            this.f71927c = str;
            return this;
        }
    }

    @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams
    @Nullable
    public AdFormat adFormat() {
        return this.f71923e;
    }

    @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams
    @NonNull
    public String adSpaceId() {
        return this.f71920b;
    }

    @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams
    @Nullable
    public String creativeId() {
        return this.f71922d;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        AdFormat adFormat;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UbCacheErrorReportingParams)) {
            return false;
        }
        UbCacheErrorReportingParams ubCacheErrorReportingParams = (UbCacheErrorReportingParams) obj;
        if (this.f71919a.equals(ubCacheErrorReportingParams.publisherId()) && this.f71920b.equals(ubCacheErrorReportingParams.adSpaceId()) && ((str = this.f71921c) != null ? str.equals(ubCacheErrorReportingParams.sessionId()) : ubCacheErrorReportingParams.sessionId() == null) && ((str2 = this.f71922d) != null ? str2.equals(ubCacheErrorReportingParams.creativeId()) : ubCacheErrorReportingParams.creativeId() == null) && ((adFormat = this.f71923e) != null ? adFormat.equals(ubCacheErrorReportingParams.adFormat()) : ubCacheErrorReportingParams.adFormat() == null)) {
            Long l = this.f71924f;
            if (l == null) {
                if (ubCacheErrorReportingParams.requestTimestamp() == null) {
                    return true;
                }
            } else if (l.equals(ubCacheErrorReportingParams.requestTimestamp())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f71919a.hashCode() ^ 1000003) * 1000003) ^ this.f71920b.hashCode()) * 1000003;
        String str = this.f71921c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode) * 1000003;
        String str2 = this.f71922d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        AdFormat adFormat = this.f71923e;
        if (adFormat == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = adFormat.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        Long l = this.f71924f;
        if (l != null) {
            i = l.hashCode();
        }
        return i4 ^ i;
    }

    @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams
    @NonNull
    public String publisherId() {
        return this.f71919a;
    }

    @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams
    @Nullable
    public Long requestTimestamp() {
        return this.f71924f;
    }

    @Override // com.smaato.sdk.core.p572ub.cacheerror.UbCacheErrorReportingParams
    @Nullable
    public String sessionId() {
        return this.f71921c;
    }

    public String toString() {
        return "UbCacheErrorReportingParams{publisherId=" + this.f71919a + ", adSpaceId=" + this.f71920b + ", sessionId=" + this.f71921c + ", creativeId=" + this.f71922d + ", adFormat=" + this.f71923e + ", requestTimestamp=" + this.f71924f + "}";
    }

    private AutoValue_UbCacheErrorReportingParams(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable AdFormat adFormat, @Nullable Long l) {
        this.f71919a = str;
        this.f71920b = str2;
        this.f71921c = str3;
        this.f71922d = str4;
        this.f71923e = adFormat;
        this.f71924f = l;
    }
}
