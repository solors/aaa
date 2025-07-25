package com.bytedance.adsdk.p195bg.p196IL.eqN;

import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.adsdk.bg.IL.eqN.bX */
/* loaded from: classes3.dex */
public enum EnumC6953bX implements InterfaceC6957zx {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI(ProxyConfig.MATCH_ALL_SCHEMES, 4),
    DIVISION(RemoteSettings.FORWARD_SLASH_STRING, 4),
    MOD("%", 4);
    

    /* renamed from: vb */
    private static final Map<String, EnumC6953bX> f14852vb = new HashMap(128);
    private static final Set<EnumC6953bX> xxp = new HashSet();
    private final String VzQ;
    private final int tuV;

    static {
        EnumC6953bX[] values;
        for (EnumC6953bX enumC6953bX : values()) {
            f14852vb.put(enumC6953bX.m90452bg(), enumC6953bX);
            xxp.add(enumC6953bX);
        }
    }

    EnumC6953bX(String str, int i) {
        this.VzQ = str;
        this.tuV = i;
    }

    /* renamed from: bg */
    public static EnumC6953bX m90450bg(String str) {
        return f14852vb.get(str);
    }

    /* renamed from: IL */
    public int m90453IL() {
        return this.tuV;
    }

    /* renamed from: bg */
    public static boolean m90451bg(InterfaceC6957zx interfaceC6957zx) {
        return interfaceC6957zx instanceof EnumC6953bX;
    }

    /* renamed from: bg */
    public String m90452bg() {
        return this.VzQ;
    }
}
