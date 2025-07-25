package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class o61 {

    /* renamed from: c */
    public static final o61 f83348c;

    /* renamed from: d */
    public static final o61 f83349d;

    /* renamed from: e */
    public static final o61 f83350e;

    /* renamed from: f */
    private static final /* synthetic */ o61[] f83351f;
    @NotNull

    /* renamed from: b */
    private final String f83352b;

    static {
        o61 o61Var = new o61(0, "AD", "ad");
        f83348c = o61Var;
        o61 o61Var2 = new o61(1, "BULK", "bulk");
        f83349d = o61Var2;
        o61 o61Var3 = new o61(2, "SLIDER", "ad_unit");
        f83350e = o61Var3;
        o61[] o61VarArr = {o61Var, o61Var2, o61Var3};
        f83351f = o61VarArr;
        C44401b.m3113a(o61VarArr);
    }

    private o61(int i, String str, String str2) {
        this.f83352b = str2;
    }

    public static o61 valueOf(String str) {
        return (o61) Enum.valueOf(o61.class, str);
    }

    public static o61[] values() {
        return (o61[]) f83351f.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m31150a() {
        return this.f83352b;
    }
}
