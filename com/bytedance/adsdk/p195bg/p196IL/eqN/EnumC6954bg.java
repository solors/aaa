package com.bytedance.adsdk.p195bg.p196IL.eqN;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.bg.IL.eqN.bg */
/* loaded from: classes3.dex */
public enum EnumC6954bg implements InterfaceC6957zx {
    TRUE,
    FALSE,
    NULL;
    
    private static final Map<String, EnumC6954bg> eqN = new HashMap(128);

    static {
        EnumC6954bg[] values;
        for (EnumC6954bg enumC6954bg : values()) {
            eqN.put(enumC6954bg.name().toLowerCase(), enumC6954bg);
        }
    }

    /* renamed from: bg */
    public static EnumC6954bg m90449bg(String str) {
        return eqN.get(str.toLowerCase());
    }
}
