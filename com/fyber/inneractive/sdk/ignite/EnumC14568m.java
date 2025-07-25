package com.fyber.inneractive.sdk.ignite;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.ignite.m */
/* loaded from: classes4.dex */
public enum EnumC14568m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP("st"),
    NONE("none");
    
    private static final Map<String, EnumC14568m> CONSTANTS = new HashMap();
    private final String value;

    static {
        EnumC14568m[] values;
        for (EnumC14568m enumC14568m : values()) {
            CONSTANTS.put(enumC14568m.value, enumC14568m);
        }
    }

    EnumC14568m(String str) {
        this.value = str;
    }

    /* renamed from: a */
    public final String m77792a() {
        return this.value;
    }

    /* renamed from: a */
    public static EnumC14568m m77791a(String str) {
        return CONSTANTS.get(str);
    }
}
