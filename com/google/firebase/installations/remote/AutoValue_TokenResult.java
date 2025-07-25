package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

/* loaded from: classes4.dex */
final class AutoValue_TokenResult extends TokenResult {

    /* renamed from: a */
    private final String f43123a;

    /* renamed from: b */
    private final long f43124b;

    /* renamed from: c */
    private final TokenResult.ResponseCode f43125c;

    /* loaded from: classes4.dex */
    static final class Builder extends TokenResult.Builder {

        /* renamed from: a */
        private String f43126a;

        /* renamed from: b */
        private Long f43127b;

        /* renamed from: c */
        private TokenResult.ResponseCode f43128c;

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
            String str = "";
            if (this.f43127b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.f43126a, this.f43127b.longValue(), this.f43128c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.f43128c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String str) {
            this.f43126a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.f43127b = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(TokenResult tokenResult) {
            this.f43126a = tokenResult.getToken();
            this.f43127b = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.f43128c = tokenResult.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f43123a;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.f43124b == tokenResult.getTokenExpirationTimestamp()) {
                TokenResult.ResponseCode responseCode = this.f43125c;
                if (responseCode == null) {
                    if (tokenResult.getResponseCode() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.getResponseCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public TokenResult.ResponseCode getResponseCode() {
        return this.f43125c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public String getToken() {
        return this.f43123a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.f43124b;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f43123a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f43124b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f43125c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.f43123a + ", tokenExpirationTimestamp=" + this.f43124b + ", responseCode=" + this.f43125c + "}";
    }

    private AutoValue_TokenResult(@Nullable String str, long j, @Nullable TokenResult.ResponseCode responseCode) {
        this.f43123a = str;
        this.f43124b = j;
        this.f43125c = responseCode;
    }
}
