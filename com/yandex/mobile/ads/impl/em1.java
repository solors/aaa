package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class em1 {

    /* renamed from: b */
    public static final em1 f78710b;

    /* renamed from: c */
    public static final em1 f78711c;

    /* renamed from: d */
    public static final em1 f78712d;

    /* renamed from: e */
    public static final em1 f78713e;

    /* renamed from: f */
    private static final /* synthetic */ em1[] f78714f;

    static {
        em1 em1Var = new em1(0, "UNKNOWN");
        f78710b = em1Var;
        em1 em1Var2 = new em1(1, "STARTUP");
        f78711c = em1Var2;
        em1 em1Var3 = new em1(2, "VMAP");
        f78712d = em1Var3;
        em1 em1Var4 = new em1(3, "AD");
        f78713e = em1Var4;
        em1[] em1VarArr = {em1Var, em1Var2, em1Var3, em1Var4};
        f78714f = em1VarArr;
        C44401b.m3113a(em1VarArr);
    }

    private em1(int i, String str) {
    }

    public static em1 valueOf(String str) {
        return (em1) Enum.valueOf(em1.class, str);
    }

    public static em1[] values() {
        return (em1[]) f78714f.clone();
    }
}
