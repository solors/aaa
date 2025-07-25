package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class wp1 {

    /* renamed from: c */
    public static final wp1 f87325c;

    /* renamed from: d */
    public static final wp1 f87326d;

    /* renamed from: e */
    private static final /* synthetic */ wp1[] f87327e;
    @NotNull

    /* renamed from: b */
    private final String f87328b;

    static {
        wp1 wp1Var = new wp1(0, "CONFIGURATION_FAILED", "configuration_failed");
        f87325c = wp1Var;
        wp1 wp1Var2 = new wp1(1, "TIMEOUT", "timeout");
        f87326d = wp1Var2;
        wp1[] wp1VarArr = {wp1Var, wp1Var2};
        f87327e = wp1VarArr;
        C44401b.m3113a(wp1VarArr);
    }

    private wp1(int i, String str, String str2) {
        this.f87328b = str2;
    }

    public static wp1 valueOf(String str) {
        return (wp1) Enum.valueOf(wp1.class, str);
    }

    public static wp1[] values() {
        return (wp1[]) f87327e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m27858a() {
        return this.f87328b;
    }
}
