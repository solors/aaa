package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* loaded from: classes4.dex */
final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* renamed from: a */
    private final NetworkConnectionInfo.NetworkType f30972a;

    /* renamed from: b */
    private final NetworkConnectionInfo.MobileSubtype f30973b;

    /* loaded from: classes4.dex */
    static final class Builder extends NetworkConnectionInfo.Builder {

        /* renamed from: a */
        private NetworkConnectionInfo.NetworkType f30974a;

        /* renamed from: b */
        private NetworkConnectionInfo.MobileSubtype f30975b;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo build() {
            return new AutoValue_NetworkConnectionInfo(this.f30974a, this.f30975b);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setMobileSubtype(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f30975b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setNetworkType(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.f30974a = networkType;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f30972a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.getNetworkType()) : networkConnectionInfo.getNetworkType() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f30973b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.getMobileSubtype() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.getMobileSubtype())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.f30973b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.f30972a;
    }

    public int hashCode() {
        int hashCode;
        NetworkConnectionInfo.NetworkType networkType = this.f30972a;
        int i = 0;
        if (networkType == null) {
            hashCode = 0;
        } else {
            hashCode = networkType.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f30973b;
        if (mobileSubtype != null) {
            i = mobileSubtype.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f30972a + ", mobileSubtype=" + this.f30973b + "}";
    }

    private AutoValue_NetworkConnectionInfo(@Nullable NetworkConnectionInfo.NetworkType networkType, @Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f30972a = networkType;
        this.f30973b = mobileSubtype;
    }
}
