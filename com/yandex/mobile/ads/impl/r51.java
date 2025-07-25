package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class r51 {

    /* renamed from: c */
    public static final r51 f84634c;

    /* renamed from: d */
    public static final r51 f84635d;

    /* renamed from: e */
    private static final /* synthetic */ r51[] f84636e;
    @NotNull

    /* renamed from: b */
    private final String f84637b;

    static {
        r51 r51Var = new r51(0, "LoadingOnShow", "loading_on_show");
        f84634c = r51Var;
        r51 r51Var2 = new r51(1, "LoadingOnBack", "loading_on_back");
        f84635d = r51Var2;
        r51[] r51VarArr = {r51Var, r51Var2};
        f84636e = r51VarArr;
        C44401b.m3113a(r51VarArr);
    }

    private r51(int i, String str, String str2) {
        this.f84637b = str2;
    }

    public static r51 valueOf(String str) {
        return (r51) Enum.valueOf(r51.class, str);
    }

    public static r51[] values() {
        return (r51[]) f84636e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m30146a() {
        return this.f84637b;
    }
}
