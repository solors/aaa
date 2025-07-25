package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class pt1 {

    /* renamed from: b */
    public static final pt1 f84073b;

    /* renamed from: c */
    public static final pt1 f84074c;

    /* renamed from: d */
    public static final pt1 f84075d;

    /* renamed from: e */
    private static final /* synthetic */ pt1[] f84076e;

    static {
        pt1 pt1Var = new pt1(0, "AD");
        f84073b = pt1Var;
        pt1 pt1Var2 = new pt1(1, "DSP");
        f84074c = pt1Var2;
        pt1 pt1Var3 = new pt1(2, "UNDEFINED");
        f84075d = pt1Var3;
        pt1[] pt1VarArr = {pt1Var, pt1Var2, pt1Var3};
        f84076e = pt1VarArr;
        C44401b.m3113a(pt1VarArr);
    }

    private pt1(int i, String str) {
    }

    public static pt1 valueOf(String str) {
        return (pt1) Enum.valueOf(pt1.class, str);
    }

    public static pt1[] values() {
        return (pt1[]) f84076e.clone();
    }
}
