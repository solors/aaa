package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class zn0 {

    /* renamed from: b */
    public static final zn0 f89005b;

    /* renamed from: c */
    public static final zn0 f89006c;

    /* renamed from: d */
    public static final zn0 f89007d;

    /* renamed from: e */
    private static final /* synthetic */ zn0[] f89008e;

    static {
        zn0 zn0Var = new zn0(0, "LOAD");
        f89005b = zn0Var;
        zn0 zn0Var2 = new zn0(1, "SHOW");
        f89006c = zn0Var2;
        zn0 zn0Var3 = new zn0(2, "RETURN_TO_APP");
        f89007d = zn0Var3;
        zn0[] zn0VarArr = {zn0Var, zn0Var2, zn0Var3};
        f89008e = zn0VarArr;
        C44401b.m3113a(zn0VarArr);
    }

    private zn0(int i, String str) {
    }

    public static zn0 valueOf(String str) {
        return (zn0) Enum.valueOf(zn0.class, str);
    }

    public static zn0[] values() {
        return (zn0[]) f89008e.clone();
    }
}
