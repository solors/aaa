package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.P */
/* loaded from: classes4.dex */
public enum EnumC15258P {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean isList;

    EnumC15258P(boolean z) {
        this.isList = z;
    }

    /* renamed from: a */
    public final boolean m76950a() {
        return this.isList;
    }
}
