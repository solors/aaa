package com.yandex.mobile.ads.impl;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ck0 {

    /* renamed from: b */
    public static final ck0 f77649b;

    /* renamed from: c */
    public static final ck0 f77650c;

    /* renamed from: d */
    public static final ck0 f77651d;

    /* renamed from: e */
    public static final ck0 f77652e;

    /* renamed from: f */
    public static final ck0 f77653f;

    /* renamed from: g */
    public static final ck0 f77654g;

    /* renamed from: h */
    public static final ck0 f77655h;

    /* renamed from: i */
    private static final /* synthetic */ ck0[] f77656i;

    static {
        ck0 ck0Var = new ck0(0, InterfaceC32663coo2iico.cco22);
        f77649b = ck0Var;
        ck0 ck0Var2 = new ck0(1, "PREPARED");
        f77650c = ck0Var2;
        ck0 ck0Var3 = new ck0(2, "PLAYING");
        f77651d = ck0Var3;
        ck0 ck0Var4 = new ck0(3, "PAUSED");
        f77652e = ck0Var4;
        ck0 ck0Var5 = new ck0(4, "SKIPPED");
        f77653f = ck0Var5;
        ck0 ck0Var6 = new ck0(5, "ERROR");
        f77654g = ck0Var6;
        ck0 ck0Var7 = new ck0(6, "COMPLETED");
        f77655h = ck0Var7;
        ck0[] ck0VarArr = {ck0Var, ck0Var2, ck0Var3, ck0Var4, ck0Var5, ck0Var6, ck0Var7};
        f77656i = ck0VarArr;
        C44401b.m3113a(ck0VarArr);
    }

    private ck0(int i, String str) {
    }

    public static ck0 valueOf(String str) {
        return (ck0) Enum.valueOf(ck0.class, str);
    }

    public static ck0[] values() {
        return (ck0[]) f77656i.clone();
    }
}
