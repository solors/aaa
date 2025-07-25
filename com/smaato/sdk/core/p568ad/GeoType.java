package com.smaato.sdk.core.p568ad;

import androidx.annotation.NonNull;

/* renamed from: com.smaato.sdk.core.ad.GeoType */
/* loaded from: classes7.dex */
public enum GeoType {
    GPS("1"),
    IP_ADDRESS("2"),
    USER_PROVIDED("3");
    
    private final String type;

    GeoType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.type;
    }
}
