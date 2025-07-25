package com.five_corp.p372ad;

import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.exception.C13771a;

/* renamed from: com.five_corp.ad.CreativeType */
/* loaded from: classes4.dex */
public enum CreativeType {
    NOT_LOADED(0),
    MOVIE(1),
    IMAGE(2);
    
    public final int value;

    CreativeType(int i) {
        this.value = i;
    }

    public static CreativeType get(int i) throws C13771a {
        CreativeType[] values;
        for (CreativeType creativeType : values()) {
            if (creativeType.value == i) {
                return creativeType;
            }
        }
        throw new C13771a(EnumC14106t.f26525b1, i);
    }
}
