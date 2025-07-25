package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ey0 {

    /* renamed from: b */
    public static final ey0 f78839b;

    /* renamed from: c */
    public static final ey0 f78840c;

    /* renamed from: d */
    public static final ey0 f78841d;

    /* renamed from: e */
    private static final /* synthetic */ ey0[] f78842e;

    static {
        ey0 ey0Var = new ey0(0, "VERBOSE");
        ey0 ey0Var2 = new ey0(1, "DEBUG");
        ey0 ey0Var3 = new ey0(2, "INFO");
        f78839b = ey0Var3;
        ey0 ey0Var4 = new ey0(3, "WARNING");
        f78840c = ey0Var4;
        ey0 ey0Var5 = new ey0(4, "ERROR");
        f78841d = ey0Var5;
        ey0[] ey0VarArr = {ey0Var, ey0Var2, ey0Var3, ey0Var4, ey0Var5};
        f78842e = ey0VarArr;
        C44401b.m3113a(ey0VarArr);
    }

    private ey0(int i, String str) {
    }

    public static ey0 valueOf(String str) {
        return (ey0) Enum.valueOf(ey0.class, str);
    }

    public static ey0[] values() {
        return (ey0[]) f78842e.clone();
    }
}
