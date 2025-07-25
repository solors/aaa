package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.J */
/* loaded from: classes4.dex */
public enum EnumC14204J implements InterfaceC15295e0 {
    UNITCONTENTTYPEUNKNOWN(0),
    DISPLAY(1),
    VIDEO(2),
    UNRECOGNIZED(-1);
    
    public static final int DISPLAY_VALUE = 1;
    public static final int UNITCONTENTTYPEUNKNOWN_VALUE = 0;
    public static final int VIDEO_VALUE = 2;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.I
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return EnumC14204J.VIDEO;
                }
                return EnumC14204J.DISPLAY;
            }
            return EnumC14204J.UNITCONTENTTYPEUNKNOWN;
        }
    };
    private final int value;

    EnumC14204J(int i) {
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
