package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.N */
/* loaded from: classes4.dex */
public enum EnumC14208N implements InterfaceC15295e0 {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    OTHER(3),
    UNRECOGNIZED(-1);
    
    public static final int FEMALE_VALUE = 2;
    public static final int MALE_VALUE = 1;
    public static final int OTHER_VALUE = 3;
    public static final int UNKNOWN_VALUE = 0;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.M
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return EnumC14208N.OTHER;
                    }
                    return EnumC14208N.FEMALE;
                }
                return EnumC14208N.MALE;
            }
            return EnumC14208N.UNKNOWN;
        }
    };
    private final int value;

    EnumC14208N(int i) {
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
