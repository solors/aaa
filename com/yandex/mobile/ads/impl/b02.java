package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b02 {

    /* renamed from: b */
    public static final b02 f76980b;

    /* renamed from: c */
    public static final b02 f76981c;

    /* renamed from: d */
    public static final b02 f76982d;

    /* renamed from: e */
    public static final b02 f76983e;

    /* renamed from: f */
    public static final b02 f76984f;

    /* renamed from: g */
    private static final /* synthetic */ b02[] f76985g;

    static {
        b02 b02Var = new b02(0, "TIME");
        f76980b = b02Var;
        b02 b02Var2 = new b02(1, "PERCENTAGE");
        f76981c = b02Var2;
        b02 b02Var3 = new b02(2, "START");
        f76982d = b02Var3;
        b02 b02Var4 = new b02(3, "END");
        f76983e = b02Var4;
        b02 b02Var5 = new b02(4, "POSITION");
        f76984f = b02Var5;
        b02[] b02VarArr = {b02Var, b02Var2, b02Var3, b02Var4, b02Var5};
        f76985g = b02VarArr;
        C44401b.m3113a(b02VarArr);
    }

    private b02(int i, String str) {
    }

    public static b02 valueOf(String str) {
        return (b02) Enum.valueOf(b02.class, str);
    }

    public static b02[] values() {
        return (b02[]) f76985g.clone();
    }
}
