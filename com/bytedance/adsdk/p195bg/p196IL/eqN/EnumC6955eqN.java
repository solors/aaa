package com.bytedance.adsdk.p195bg.p196IL.eqN;

import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.bg.IL.eqN.eqN */
/* loaded from: classes3.dex */
public enum EnumC6955eqN implements InterfaceC6957zx {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(C21114v8.C21123i.f54137d),
    RIGHT_BRACKET(C21114v8.C21123i.f54139e),
    COMMA(",");
    
    private static final Map<String, EnumC6955eqN> ldr;

    /* renamed from: iR */
    private final String f14863iR;

    static {
        HashMap hashMap = new HashMap(128);
        ldr = hashMap;
        for (EnumC6955eqN enumC6955eqN : hashMap.values()) {
            ldr.put(enumC6955eqN.m90448bg(), enumC6955eqN);
        }
    }

    EnumC6955eqN(String str) {
        this.f14863iR = str;
    }

    /* renamed from: bg */
    public static boolean m90447bg(InterfaceC6957zx interfaceC6957zx) {
        return interfaceC6957zx instanceof EnumC6955eqN;
    }

    /* renamed from: bg */
    public String m90448bg() {
        return this.f14863iR;
    }
}
