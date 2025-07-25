package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.c */
/* loaded from: classes4.dex */
public enum EnumC14216c implements InterfaceC15295e0 {
    OTHER(0),
    HTML(4),
    MRAID(6),
    VAST(8),
    DV360(15),
    UNRECOGNIZED(-1);
    
    public static final int DV360_VALUE = 15;
    public static final int HTML_VALUE = 4;
    public static final int MRAID_VALUE = 6;
    public static final int OTHER_VALUE = 0;
    public static final int VAST_VALUE = 8;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.adm.b
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 4) {
                    if (i != 6) {
                        if (i != 8) {
                            if (i != 15) {
                                return null;
                            }
                            return EnumC14216c.DV360;
                        }
                        return EnumC14216c.VAST;
                    }
                    return EnumC14216c.MRAID;
                }
                return EnumC14216c.HTML;
            }
            return EnumC14216c.OTHER;
        }
    };
    private final int value;

    EnumC14216c(int i) {
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
