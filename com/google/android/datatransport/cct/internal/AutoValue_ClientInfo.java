package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;

/* loaded from: classes4.dex */
final class AutoValue_ClientInfo extends ClientInfo {

    /* renamed from: a */
    private final ClientInfo.ClientType f30939a;

    /* renamed from: b */
    private final AndroidClientInfo f30940b;

    /* loaded from: classes4.dex */
    static final class Builder extends ClientInfo.Builder {

        /* renamed from: a */
        private ClientInfo.ClientType f30941a;

        /* renamed from: b */
        private AndroidClientInfo f30942b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo build() {
            return new AutoValue_ClientInfo(this.f30941a, this.f30942b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo) {
            this.f30942b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setClientType(@Nullable ClientInfo.ClientType clientType) {
            this.f30941a = clientType;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f30939a;
        if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
            AndroidClientInfo androidClientInfo = this.f30940b;
            if (androidClientInfo == null) {
                if (clientInfo.getAndroidClientInfo() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.getAndroidClientInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public AndroidClientInfo getAndroidClientInfo() {
        return this.f30940b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public ClientInfo.ClientType getClientType() {
        return this.f30939a;
    }

    public int hashCode() {
        int hashCode;
        ClientInfo.ClientType clientType = this.f30939a;
        int i = 0;
        if (clientType == null) {
            hashCode = 0;
        } else {
            hashCode = clientType.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f30940b;
        if (androidClientInfo != null) {
            i = androidClientInfo.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f30939a + ", androidClientInfo=" + this.f30940b + "}";
    }

    private AutoValue_ClientInfo(@Nullable ClientInfo.ClientType clientType, @Nullable AndroidClientInfo androidClientInfo) {
        this.f30939a = clientType;
        this.f30940b = androidClientInfo;
    }
}
