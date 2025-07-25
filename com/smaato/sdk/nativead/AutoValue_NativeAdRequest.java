package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.nativead.NativeAdRequest;

/* renamed from: com.smaato.sdk.nativead.d */
/* loaded from: classes7.dex */
final class AutoValue_NativeAdRequest extends NativeAdRequest {

    /* renamed from: a */
    private final String f72176a;

    /* renamed from: b */
    private final boolean f72177b;

    /* renamed from: c */
    private final boolean f72178c;

    /* renamed from: d */
    private final String f72179d;

    /* renamed from: e */
    private final String f72180e;

    /* renamed from: f */
    private final String f72181f;

    /* renamed from: g */
    private final String f72182g;

    /* compiled from: AutoValue_NativeAdRequest.java */
    /* renamed from: com.smaato.sdk.nativead.d$b */
    /* loaded from: classes7.dex */
    static final class C27459b extends NativeAdRequest.Builder {

        /* renamed from: a */
        private String f72183a;

        /* renamed from: b */
        private Boolean f72184b;

        /* renamed from: c */
        private Boolean f72185c;

        /* renamed from: d */
        private String f72186d;

        /* renamed from: e */
        private String f72187e;

        /* renamed from: f */
        private String f72188f;

        /* renamed from: g */
        private String f72189g;

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest.Builder adSpaceId(String str) {
            if (str != null) {
                this.f72183a = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest build() {
            String str = "";
            if (this.f72183a == null) {
                str = " adSpaceId";
            }
            if (this.f72184b == null) {
                str = str + " shouldFetchPrivacy";
            }
            if (this.f72185c == null) {
                str = str + " shouldReturnUrlsForImageAssets";
            }
            if (str.isEmpty()) {
                return new AutoValue_NativeAdRequest(this.f72183a, this.f72184b.booleanValue(), this.f72185c.booleanValue(), this.f72186d, this.f72187e, this.f72188f, this.f72189g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest.Builder mediationAdapterVersion(String str) {
            this.f72186d = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest.Builder mediationNetworkName(String str) {
            this.f72187e = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest.Builder mediationNetworkSdkVersion(String str) {
            this.f72188f = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest.Builder shouldFetchPrivacy(boolean z) {
            this.f72184b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest.Builder shouldReturnUrlsForImageAssets(boolean z) {
            this.f72185c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.nativead.NativeAdRequest.Builder
        public NativeAdRequest.Builder uniqueUBId(String str) {
            this.f72189g = str;
            return this;
        }
    }

    @Override // com.smaato.sdk.nativead.NativeAdRequest
    @NonNull
    public String adSpaceId() {
        return this.f72176a;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdRequest)) {
            return false;
        }
        NativeAdRequest nativeAdRequest = (NativeAdRequest) obj;
        if (this.f72176a.equals(nativeAdRequest.adSpaceId()) && this.f72177b == nativeAdRequest.shouldFetchPrivacy() && this.f72178c == nativeAdRequest.shouldReturnUrlsForImageAssets() && ((str = this.f72179d) != null ? str.equals(nativeAdRequest.mediationAdapterVersion()) : nativeAdRequest.mediationAdapterVersion() == null) && ((str2 = this.f72180e) != null ? str2.equals(nativeAdRequest.mediationNetworkName()) : nativeAdRequest.mediationNetworkName() == null) && ((str3 = this.f72181f) != null ? str3.equals(nativeAdRequest.mediationNetworkSdkVersion()) : nativeAdRequest.mediationNetworkSdkVersion() == null)) {
            String str4 = this.f72182g;
            if (str4 == null) {
                if (nativeAdRequest.uniqueUBId() == null) {
                    return true;
                }
            } else if (str4.equals(nativeAdRequest.uniqueUBId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.f72176a.hashCode() ^ 1000003) * 1000003;
        int i2 = 1231;
        if (this.f72177b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (hashCode4 ^ i) * 1000003;
        if (!this.f72178c) {
            i2 = 1237;
        }
        int i4 = (i3 ^ i2) * 1000003;
        String str = this.f72179d;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i6 = (i4 ^ hashCode) * 1000003;
        String str2 = this.f72180e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i7 = (i6 ^ hashCode2) * 1000003;
        String str3 = this.f72181f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i8 = (i7 ^ hashCode3) * 1000003;
        String str4 = this.f72182g;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i8 ^ i5;
    }

    @Override // com.smaato.sdk.nativead.NativeAdRequest
    @Nullable
    public String mediationAdapterVersion() {
        return this.f72179d;
    }

    @Override // com.smaato.sdk.nativead.NativeAdRequest
    @Nullable
    public String mediationNetworkName() {
        return this.f72180e;
    }

    @Override // com.smaato.sdk.nativead.NativeAdRequest
    @Nullable
    public String mediationNetworkSdkVersion() {
        return this.f72181f;
    }

    @Override // com.smaato.sdk.nativead.NativeAdRequest
    public boolean shouldFetchPrivacy() {
        return this.f72177b;
    }

    @Override // com.smaato.sdk.nativead.NativeAdRequest
    public boolean shouldReturnUrlsForImageAssets() {
        return this.f72178c;
    }

    public String toString() {
        return "NativeAdRequest{adSpaceId=" + this.f72176a + ", shouldFetchPrivacy=" + this.f72177b + ", shouldReturnUrlsForImageAssets=" + this.f72178c + ", mediationAdapterVersion=" + this.f72179d + ", mediationNetworkName=" + this.f72180e + ", mediationNetworkSdkVersion=" + this.f72181f + ", uniqueUBId=" + this.f72182g + "}";
    }

    @Override // com.smaato.sdk.nativead.NativeAdRequest
    @Nullable
    public String uniqueUBId() {
        return this.f72182g;
    }

    private AutoValue_NativeAdRequest(String str, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f72176a = str;
        this.f72177b = z;
        this.f72178c = z2;
        this.f72179d = str2;
        this.f72180e = str3;
        this.f72181f = str4;
        this.f72182g = str5;
    }
}
