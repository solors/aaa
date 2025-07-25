package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class j72 {

    /* renamed from: b */
    public static final j72 f80787b;

    /* renamed from: c */
    public static final j72 f80788c;

    /* renamed from: d */
    public static final j72 f80789d;

    /* renamed from: e */
    public static final j72 f80790e;

    /* renamed from: f */
    private static final /* synthetic */ j72[] f80791f;

    static {
        j72 j72Var = new j72(0, "PREROLL");
        f80787b = j72Var;
        j72 j72Var2 = new j72(1, "MIDROLL");
        f80788c = j72Var2;
        j72 j72Var3 = new j72(2, "POSTROLL");
        f80789d = j72Var3;
        j72 j72Var4 = new j72(3, "STANDALONE");
        f80790e = j72Var4;
        j72[] j72VarArr = {j72Var, j72Var2, j72Var3, j72Var4};
        f80791f = j72VarArr;
        C44401b.m3113a(j72VarArr);
    }

    private j72(int i, String str) {
    }

    public static j72 valueOf(String str) {
        return (j72) Enum.valueOf(j72.class, str);
    }

    public static j72[] values() {
        return (j72[]) f80791f.clone();
    }
}
