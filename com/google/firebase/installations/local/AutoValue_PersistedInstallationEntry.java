package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: classes4.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* renamed from: a */
    private final String f43093a;

    /* renamed from: b */
    private final PersistedInstallation.RegistrationStatus f43094b;

    /* renamed from: c */
    private final String f43095c;

    /* renamed from: d */
    private final String f43096d;

    /* renamed from: e */
    private final long f43097e;

    /* renamed from: f */
    private final long f43098f;

    /* renamed from: g */
    private final String f43099g;

    /* loaded from: classes4.dex */
    static final class Builder extends PersistedInstallationEntry.Builder {

        /* renamed from: a */
        private String f43100a;

        /* renamed from: b */
        private PersistedInstallation.RegistrationStatus f43101b;

        /* renamed from: c */
        private String f43102c;

        /* renamed from: d */
        private String f43103d;

        /* renamed from: e */
        private Long f43104e;

        /* renamed from: f */
        private Long f43105f;

        /* renamed from: g */
        private String f43106g;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry build() {
            String str = "";
            if (this.f43101b == null) {
                str = " registrationStatus";
            }
            if (this.f43104e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f43105f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.f43100a, this.f43101b, this.f43102c, this.f43103d, this.f43104e.longValue(), this.f43105f.longValue(), this.f43106g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setAuthToken(@Nullable String str) {
            this.f43102c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.f43104e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.f43100a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFisError(@Nullable String str) {
            this.f43106g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRefreshToken(@Nullable String str) {
            this.f43103d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f43101b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.f43105f = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.f43100a = persistedInstallationEntry.getFirebaseInstallationId();
            this.f43101b = persistedInstallationEntry.getRegistrationStatus();
            this.f43102c = persistedInstallationEntry.getAuthToken();
            this.f43103d = persistedInstallationEntry.getRefreshToken();
            this.f43104e = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.f43105f = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.f43106g = persistedInstallationEntry.getFisError();
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f43093a;
        if (str3 != null ? str3.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
            if (this.f43094b.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.f43095c) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.f43096d) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.f43097e == persistedInstallationEntry.getExpiresInSecs() && this.f43098f == persistedInstallationEntry.getTokenCreationEpochInSecs()) {
                String str4 = this.f43099g;
                if (str4 == null) {
                    if (persistedInstallationEntry.getFisError() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.getFisError())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getAuthToken() {
        return this.f43095c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getExpiresInSecs() {
        return this.f43097e;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFirebaseInstallationId() {
        return this.f43093a;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFisError() {
        return this.f43099g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getRefreshToken() {
        return this.f43096d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @NonNull
    public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.f43094b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getTokenCreationEpochInSecs() {
        return this.f43098f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f43093a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f43094b.hashCode()) * 1000003;
        String str2 = this.f43095c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f43096d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.f43097e;
        long j2 = this.f43098f;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f43099g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public PersistedInstallationEntry.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f43093a + ", registrationStatus=" + this.f43094b + ", authToken=" + this.f43095c + ", refreshToken=" + this.f43096d + ", expiresInSecs=" + this.f43097e + ", tokenCreationEpochInSecs=" + this.f43098f + ", fisError=" + this.f43099g + "}";
    }

    private AutoValue_PersistedInstallationEntry(@Nullable String str, PersistedInstallation.RegistrationStatus registrationStatus, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.f43093a = str;
        this.f43094b = registrationStatus;
        this.f43095c = str2;
        this.f43096d = str3;
        this.f43097e = j;
        this.f43098f = j2;
        this.f43099g = str4;
    }
}
