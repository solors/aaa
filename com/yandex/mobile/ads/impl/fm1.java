package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class fm1 {

    /* renamed from: c */
    public static final fm1 f79175c;

    /* renamed from: d */
    public static final fm1 f79176d;

    /* renamed from: e */
    private static final /* synthetic */ fm1[] f79177e;
    @NotNull

    /* renamed from: b */
    private final String f79178b;

    static {
        fm1 fm1Var = new fm1(0, "LIGHT", "light");
        f79175c = fm1Var;
        fm1 fm1Var2 = new fm1(1, "DARK", "dark");
        f79176d = fm1Var2;
        fm1[] fm1VarArr = {fm1Var, fm1Var2};
        f79177e = fm1VarArr;
        C44401b.m3113a(fm1VarArr);
    }

    private fm1(int i, String str, String str2) {
        this.f79178b = str2;
    }

    public static fm1 valueOf(String str) {
        return (fm1) Enum.valueOf(fm1.class, str);
    }

    public static fm1[] values() {
        return (fm1[]) f79177e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m34114a() {
        return this.f79178b;
    }
}
