package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.n */
/* loaded from: classes4.dex */
public enum EnumC14227n implements InterfaceC15295e0 {
    NONE(0),
    SINGLETAP(1),
    TRUESINGLETAP(2),
    UNRECOGNIZED(-1);
    
    public static final int NONE_VALUE = 0;
    public static final int SINGLETAP_VALUE = 1;
    public static final int TRUESINGLETAP_VALUE = 2;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.adm.m
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return EnumC14227n.TRUESINGLETAP;
                }
                return EnumC14227n.SINGLETAP;
            }
            return EnumC14227n.NONE;
        }
    };
    private final int value;

    EnumC14227n(int i) {
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
