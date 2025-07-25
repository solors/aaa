package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.S */
/* loaded from: classes4.dex */
public enum EnumC14212S implements InterfaceC15295e0 {
    NOCLICK(0),
    CTABUTTON(1),
    COMPANION(2),
    VIDEOVIEW(3),
    UNRECOGNIZED(-1);
    
    public static final int COMPANION_VALUE = 2;
    public static final int CTABUTTON_VALUE = 1;
    public static final int NOCLICK_VALUE = 0;
    public static final int VIDEOVIEW_VALUE = 3;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.Q
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return EnumC14212S.VIDEOVIEW;
                    }
                    return EnumC14212S.COMPANION;
                }
                return EnumC14212S.CTABUTTON;
            }
            return EnumC14212S.NOCLICK;
        }
    };
    private final int value;

    EnumC14212S(int i) {
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
