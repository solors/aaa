package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.q */
/* loaded from: classes4.dex */
public enum EnumC14254q implements InterfaceC15295e0 {
    NATIVE(0),
    UNITY3D(1),
    UNRECOGNIZED(-1);
    
    public static final int NATIVE_VALUE = 0;
    public static final int UNITY3D_VALUE = 1;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.p
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return EnumC14254q.UNITY3D;
            }
            return EnumC14254q.NATIVE;
        }
    };
    private final int value;

    EnumC14254q(int i) {
        this.value = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0
    /* renamed from: a */
    public final int mo76885a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
