package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.ironsource.C20747r8;

/* loaded from: classes7.dex */
public enum NetworkConnectionType {
    CARRIER_2G("2g"),
    CARRIER_3G(C20747r8.f52729a),
    CARRIER_4G("4g"),
    CARRIER_UNKNOWN("carrier"),
    WIFI(C20747r8.f52730b),
    ETHERNET(C20747r8.f52733e),
    OTHER("other");
    
    private final String type;

    NetworkConnectionType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.type;
    }
}
