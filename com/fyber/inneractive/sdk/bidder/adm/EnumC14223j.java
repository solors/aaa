package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.j */
/* loaded from: classes4.dex */
public enum EnumC14223j implements InterfaceC15295e0 {
    MANUAL(0),
    AUTOMATIC(1),
    UNRECOGNIZED(-1);
    
    public static final int AUTOMATIC_VALUE = 1;
    public static final int MANUAL_VALUE = 0;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.adm.i
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return EnumC14223j.AUTOMATIC;
            }
            return EnumC14223j.MANUAL;
        }
    };
    private final int value;

    EnumC14223j(int i) {
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
