package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class nb1 {

    /* renamed from: c */
    public static final nb1 f82658c;

    /* renamed from: d */
    public static final nb1 f82659d;

    /* renamed from: e */
    public static final nb1 f82660e;

    /* renamed from: f */
    private static final /* synthetic */ nb1[] f82661f;

    /* renamed from: b */
    private final int f82662b;

    static {
        nb1 nb1Var = new nb1(0, 2, "LANDSCAPE");
        f82658c = nb1Var;
        nb1 nb1Var2 = new nb1(1, 1, "PORTRAIT");
        f82659d = nb1Var2;
        nb1 nb1Var3 = new nb1(2, 0, "UNDEFINED");
        f82660e = nb1Var3;
        nb1[] nb1VarArr = {nb1Var, nb1Var2, nb1Var3};
        f82661f = nb1VarArr;
        C44401b.m3113a(nb1VarArr);
    }

    private nb1(int i, int i2, String str) {
        this.f82662b = i2;
    }

    public static nb1 valueOf(String str) {
        return (nb1) Enum.valueOf(nb1.class, str);
    }

    public static nb1[] values() {
        return (nb1[]) f82661f.clone();
    }

    /* renamed from: a */
    public final int m31622a() {
        return this.f82662b;
    }
}
