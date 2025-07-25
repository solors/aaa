package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.C20410l;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class u41 {

    /* renamed from: c */
    public static final u41 f86102c;

    /* renamed from: d */
    public static final u41 f86103d;

    /* renamed from: e */
    private static final /* synthetic */ u41[] f86104e;
    @NotNull

    /* renamed from: b */
    private final String f86105b;

    static {
        u41 u41Var = new u41(0, C20410l.f51634f, "custom");
        f86102c = u41Var;
        u41 u41Var2 = new u41(1, "TEMPLATE", "template");
        f86103d = u41Var2;
        u41[] u41VarArr = {u41Var, u41Var2};
        f86104e = u41VarArr;
        C44401b.m3113a(u41VarArr);
    }

    private u41(int i, String str, String str2) {
        this.f86105b = str2;
    }

    public static u41 valueOf(String str) {
        return (u41) Enum.valueOf(u41.class, str);
    }

    public static u41[] values() {
        return (u41[]) f86104e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m28888a() {
        return this.f86105b;
    }
}
