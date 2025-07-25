package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class wr0 {

    /* renamed from: b */
    public static final wr0 f87337b;

    /* renamed from: c */
    public static final wr0 f87338c;

    /* renamed from: d */
    public static final wr0 f87339d;

    /* renamed from: e */
    private static final /* synthetic */ wr0[] f87340e;

    static {
        wr0 wr0Var = new wr0(0, "EXACTLY");
        f87337b = wr0Var;
        wr0 wr0Var2 = new wr0(1, "AT_MOST");
        f87338c = wr0Var2;
        wr0 wr0Var3 = new wr0(2, "UNSPECIFIED");
        f87339d = wr0Var3;
        wr0[] wr0VarArr = {wr0Var, wr0Var2, wr0Var3};
        f87340e = wr0VarArr;
        C44401b.m3113a(wr0VarArr);
    }

    private wr0(int i, String str) {
    }

    public static wr0 valueOf(String str) {
        return (wr0) Enum.valueOf(wr0.class, str);
    }

    public static wr0[] values() {
        return (wr0[]) f87340e.clone();
    }
}
