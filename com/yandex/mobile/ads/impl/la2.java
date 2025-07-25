package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class la2 {

    /* renamed from: b */
    public static final la2 f81759b;

    /* renamed from: c */
    public static final la2 f81760c;

    /* renamed from: d */
    public static final la2 f81761d;

    /* renamed from: e */
    public static final la2 f81762e;

    /* renamed from: f */
    public static final la2 f81763f;

    /* renamed from: g */
    public static final la2 f81764g;

    /* renamed from: h */
    public static final la2 f81765h;

    /* renamed from: i */
    public static final la2 f81766i;

    /* renamed from: j */
    private static final /* synthetic */ la2[] f81767j;

    static {
        la2 la2Var = new la2(0, "INITIAL");
        f81759b = la2Var;
        la2 la2Var2 = new la2(1, "PREPARING");
        f81760c = la2Var2;
        la2 la2Var3 = new la2(2, "PREPARED");
        f81761d = la2Var3;
        la2 la2Var4 = new la2(3, "PLAYING");
        f81762e = la2Var4;
        la2 la2Var5 = new la2(4, "STOPPED");
        f81763f = la2Var5;
        la2 la2Var6 = new la2(5, "FINISHED");
        f81764g = la2Var6;
        la2 la2Var7 = new la2(6, "PAUSED");
        f81765h = la2Var7;
        la2 la2Var8 = new la2(7, "ERROR");
        f81766i = la2Var8;
        la2[] la2VarArr = {la2Var, la2Var2, la2Var3, la2Var4, la2Var5, la2Var6, la2Var7, la2Var8};
        f81767j = la2VarArr;
        C44401b.m3113a(la2VarArr);
    }

    private la2(int i, String str) {
    }

    public static la2 valueOf(String str) {
        return (la2) Enum.valueOf(la2.class, str);
    }

    public static la2[] values() {
        return (la2[]) f81767j.clone();
    }
}
