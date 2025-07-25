package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class u30 {

    /* renamed from: b */
    public static final u30 f86095b;

    /* renamed from: c */
    public static final u30 f86096c;

    /* renamed from: d */
    private static final /* synthetic */ u30[] f86097d;

    static {
        u30 u30Var = new u30(0, "FRAME");
        f86095b = u30Var;
        u30 u30Var2 = new u30(1, "TRACE");
        f86096c = u30Var2;
        u30[] u30VarArr = {u30Var, u30Var2};
        f86097d = u30VarArr;
        C44401b.m3113a(u30VarArr);
    }

    private u30(int i, String str) {
    }

    public static u30 valueOf(String str) {
        return (u30) Enum.valueOf(u30.class, str);
    }

    public static u30[] values() {
        return (u30[]) f86097d.clone();
    }
}
