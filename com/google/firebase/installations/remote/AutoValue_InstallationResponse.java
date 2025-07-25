package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.InstallationResponse;

/* loaded from: classes4.dex */
final class AutoValue_InstallationResponse extends InstallationResponse {

    /* renamed from: a */
    private final String f43113a;

    /* renamed from: b */
    private final String f43114b;

    /* renamed from: c */
    private final String f43115c;

    /* renamed from: d */
    private final TokenResult f43116d;

    /* renamed from: e */
    private final InstallationResponse.ResponseCode f43117e;

    /* loaded from: classes4.dex */
    static final class Builder extends InstallationResponse.Builder {

        /* renamed from: a */
        private String f43118a;

        /* renamed from: b */
        private String f43119b;

        /* renamed from: c */
        private String f43120c;

        /* renamed from: d */
        private TokenResult f43121d;

        /* renamed from: e */
        private InstallationResponse.ResponseCode f43122e;

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse build() {
            return new AutoValue_InstallationResponse(this.f43118a, this.f43119b, this.f43120c, this.f43121d, this.f43122e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.f43121d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setFid(String str) {
            this.f43119b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setRefreshToken(String str) {
            this.f43120c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
            this.f43122e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setUri(String str) {
            this.f43118a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(InstallationResponse installationResponse) {
            this.f43118a = installationResponse.getUri();
            this.f43119b = installationResponse.getFid();
            this.f43120c = installationResponse.getRefreshToken();
            this.f43121d = installationResponse.getAuthToken();
            this.f43122e = installationResponse.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f43113a;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.f43114b;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.f43115c;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.f43116d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f43117e;
                        if (responseCode == null) {
                            if (installationResponse.getResponseCode() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.getResponseCode())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public TokenResult getAuthToken() {
        return this.f43116d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public String getFid() {
        return this.f43114b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public String getRefreshToken() {
        return this.f43115c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public InstallationResponse.ResponseCode getResponseCode() {
        return this.f43117e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public String getUri() {
        return this.f43113a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f43113a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f43114b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f43115c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        TokenResult tokenResult = this.f43116d;
        if (tokenResult == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = tokenResult.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f43117e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i5 ^ i;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f43113a + ", fid=" + this.f43114b + ", refreshToken=" + this.f43115c + ", authToken=" + this.f43116d + ", responseCode=" + this.f43117e + "}";
    }

    private AutoValue_InstallationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable TokenResult tokenResult, @Nullable InstallationResponse.ResponseCode responseCode) {
        this.f43113a = str;
        this.f43114b = str2;
        this.f43115c = str3;
        this.f43116d = tokenResult;
        this.f43117e = responseCode;
    }
}
