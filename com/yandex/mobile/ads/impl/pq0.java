package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class pq0 {

    /* renamed from: c */
    public static final pq0 f84050c;

    /* renamed from: d */
    public static final pq0 f84051d;

    /* renamed from: e */
    public static final pq0 f84052e;

    /* renamed from: f */
    public static final pq0 f84053f;

    /* renamed from: g */
    public static final pq0 f84054g;

    /* renamed from: h */
    public static final pq0 f84055h;

    /* renamed from: i */
    private static final /* synthetic */ pq0[] f84056i;
    @NotNull

    /* renamed from: b */
    private final String f84057b;

    static {
        pq0 pq0Var = new pq0(0, "AUTOMATIC_SDK_INITIALIZATION", "com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION");
        f84050c = pq0Var;
        pq0 pq0Var2 = new pq0(1, "AGE_RESTRICTED_USER", "com.yandex.mobile.ads.AGE_RESTRICTED_USER");
        f84051d = pq0Var2;
        pq0 pq0Var3 = new pq0(2, "ENABLE_LOGGING", "com.yandex.mobile.ads.ENABLE_LOGGING");
        f84052e = pq0Var3;
        pq0 pq0Var4 = new pq0(3, "AD_HOST", "com.yandex.mobile.ads.AD_HOST");
        f84053f = pq0Var4;
        pq0 pq0Var5 = new pq0(4, "APPMETRICA_EASY_INTEGRATION_ENABLED", "com.yandex.mobile.ads.APPMETRICA_EASY_INTEGRATION_ENABLED");
        f84054g = pq0Var5;
        pq0 pq0Var6 = new pq0(5, "SINGLE_ASSEMBLY_ENABLED", "com.yandex.mobile.ads.SINGLE_ASSEMBLY_ENABLED");
        f84055h = pq0Var6;
        pq0[] pq0VarArr = {pq0Var, pq0Var2, pq0Var3, pq0Var4, pq0Var5, pq0Var6};
        f84056i = pq0VarArr;
        C44401b.m3113a(pq0VarArr);
    }

    private pq0(int i, String str, String str2) {
        this.f84057b = str2;
    }

    public static pq0 valueOf(String str) {
        return (pq0) Enum.valueOf(pq0.class, str);
    }

    public static pq0[] values() {
        return (pq0[]) f84056i.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m30599a() {
        return this.f84057b;
    }
}
