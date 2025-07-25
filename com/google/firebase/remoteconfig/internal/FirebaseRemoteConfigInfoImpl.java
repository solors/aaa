package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {

    /* renamed from: a */
    private final long f43554a;

    /* renamed from: b */
    private final int f43555b;

    /* renamed from: c */
    private final FirebaseRemoteConfigSettings f43556c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        private long f43557a;

        /* renamed from: b */
        private int f43558b;

        /* renamed from: c */
        private FirebaseRemoteConfigSettings f43559c;

        private Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Builder m66317a(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.f43559c = firebaseRemoteConfigSettings;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public Builder m66316b(int i) {
            this.f43558b = i;
            return this;
        }

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.f43557a, this.f43558b, this.f43559c);
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long j) {
            this.f43557a = j;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Builder m66318a() {
        return new Builder();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.f43556c;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.f43554a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.f43555b;
    }

    private FirebaseRemoteConfigInfoImpl(long j, int i, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f43554a = j;
        this.f43555b = i;
        this.f43556c = firebaseRemoteConfigSettings;
    }
}
