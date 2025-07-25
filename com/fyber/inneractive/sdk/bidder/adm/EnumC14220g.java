package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.g */
/* loaded from: classes4.dex */
public enum EnumC14220g implements InterfaceC15295e0 {
    AUTOSTOREKITNONE(0),
    AUTOSTOREKITPRESENTONLY(1),
    AUTOSTOREKITPRESENTANDTRACK(2),
    UNRECOGNIZED(-1);
    
    public static final int AUTOSTOREKITNONE_VALUE = 0;
    public static final int AUTOSTOREKITPRESENTANDTRACK_VALUE = 2;
    public static final int AUTOSTOREKITPRESENTONLY_VALUE = 1;
    private static final InterfaceC15298f0 internalValueMap = new InterfaceC15298f0() { // from class: com.fyber.inneractive.sdk.bidder.adm.f
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15298f0
        /* renamed from: a */
        public final InterfaceC15295e0 mo76884a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return EnumC14220g.AUTOSTOREKITPRESENTANDTRACK;
                }
                return EnumC14220g.AUTOSTOREKITPRESENTONLY;
            }
            return EnumC14220g.AUTOSTOREKITNONE;
        }
    };
    private final int value;

    EnumC14220g(int i) {
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
