package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.s */
/* loaded from: classes4.dex */
public enum EnumC14232s implements InterfaceC15295e0 {
    UNITDISPLAYTYPEUNKNOWN(0),
    BANNER(1),
    INTERSTITIAL(2),
    REWARDED(3),
    MRECT(4),
    UNRECOGNIZED(-1);
    
    public static final int BANNER_VALUE = 1;
    public static final int INTERSTITIAL_VALUE = 2;
    public static final int MRECT_VALUE = 4;
    public static final int REWARDED_VALUE = 3;
    public static final int UNITDISPLAYTYPEUNKNOWN_VALUE = 0;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.adm.r
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return EnumC14232s.MRECT;
                        }
                        return EnumC14232s.REWARDED;
                    }
                    return EnumC14232s.INTERSTITIAL;
                }
                return EnumC14232s.BANNER;
            }
            return EnumC14232s.UNITDISPLAYTYPEUNKNOWN;
        }
    };
    private final int value;

    EnumC14232s(int i) {
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
