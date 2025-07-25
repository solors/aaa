package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.C37612s0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class zb2 implements un0 {

    /* renamed from: c */
    public static final zb2 f88813c;

    /* renamed from: d */
    public static final zb2 f88814d;

    /* renamed from: e */
    public static final zb2 f88815e;

    /* renamed from: f */
    private static final /* synthetic */ zb2[] f88816f;
    @NotNull

    /* renamed from: b */
    private final String f88817b;

    static {
        zb2 zb2Var = new zb2(0, "DEFAULT", "default");
        f88813c = zb2Var;
        zb2 zb2Var2 = new zb2(1, "LOADING", "loading");
        f88814d = zb2Var2;
        zb2 zb2Var3 = new zb2(2, "HIDDEN", "hidden");
        f88815e = zb2Var3;
        zb2[] zb2VarArr = {zb2Var, zb2Var2, zb2Var3};
        f88816f = zb2VarArr;
        C44401b.m3113a(zb2VarArr);
    }

    private zb2(int i, String str, String str2) {
        this.f88817b = str2;
    }

    public static zb2 valueOf(String str) {
        return (zb2) Enum.valueOf(zb2.class, str);
    }

    public static zb2[] values() {
        return (zb2[]) f88816f.clone();
    }

    @Override // com.yandex.mobile.ads.impl.un0
    @NotNull
    /* renamed from: a */
    public final String mo26283a() {
        String quote = JSONObject.quote(this.f88817b);
        C37612s0 c37612s0 = C37612s0.f99333a;
        return C31714w0.m28089a(new Object[]{quote}, 1, "state: %s", "format(...)");
    }
}
