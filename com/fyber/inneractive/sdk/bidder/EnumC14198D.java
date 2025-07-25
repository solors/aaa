package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.D */
/* loaded from: classes4.dex */
public enum EnumC14198D implements InterfaceC15295e0 {
    UNSECURE(0),
    SECURE(1),
    PARTIALLYSECURE(2),
    UNRECOGNIZED(-1);
    
    public static final int PARTIALLYSECURE_VALUE = 2;
    public static final int SECURE_VALUE = 1;
    public static final int UNSECURE_VALUE = 0;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.C
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return EnumC14198D.PARTIALLYSECURE;
                }
                return EnumC14198D.SECURE;
            }
            return EnumC14198D.UNSECURE;
        }
    };
    private final int value;

    EnumC14198D(int i) {
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
