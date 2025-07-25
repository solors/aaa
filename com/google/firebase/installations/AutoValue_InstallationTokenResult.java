package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.InstallationTokenResult;

/* loaded from: classes4.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* renamed from: a */
    private final String f43048a;

    /* renamed from: b */
    private final long f43049b;

    /* renamed from: c */
    private final long f43050c;

    /* loaded from: classes4.dex */
    static final class Builder extends InstallationTokenResult.Builder {

        /* renamed from: a */
        private String f43051a;

        /* renamed from: b */
        private Long f43052b;

        /* renamed from: c */
        private Long f43053c;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String str = "";
            if (this.f43051a == null) {
                str = " token";
            }
            if (this.f43052b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f43053c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.f43051a, this.f43052b.longValue(), this.f43053c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str != null) {
                this.f43051a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.f43053c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.f43052b = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(InstallationTokenResult installationTokenResult) {
            this.f43051a = installationTokenResult.getToken();
            this.f43052b = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.f43053c = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        if (this.f43048a.equals(installationTokenResult.getToken()) && this.f43049b == installationTokenResult.getTokenExpirationTimestamp() && this.f43050c == installationTokenResult.getTokenCreationTimestamp()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public String getToken() {
        return this.f43048a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenCreationTimestamp() {
        return this.f43050c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.f43049b;
    }

    public int hashCode() {
        long j = this.f43049b;
        long j2 = this.f43050c;
        return ((((this.f43048a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f43048a + ", tokenExpirationTimestamp=" + this.f43049b + ", tokenCreationTimestamp=" + this.f43050c + "}";
    }

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.f43048a = str;
        this.f43049b = j;
        this.f43050c = j2;
    }
}
