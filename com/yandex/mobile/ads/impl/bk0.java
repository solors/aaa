package com.yandex.mobile.ads.impl;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class bk0 {

    /* renamed from: b */
    public static final bk0 f77335b;

    /* renamed from: c */
    public static final bk0 f77336c;

    /* renamed from: d */
    public static final bk0 f77337d;

    /* renamed from: e */
    public static final bk0 f77338e;

    /* renamed from: f */
    public static final bk0 f77339f;

    /* renamed from: g */
    public static final bk0 f77340g;

    /* renamed from: h */
    public static final bk0 f77341h;

    /* renamed from: i */
    private static final /* synthetic */ bk0[] f77342i;

    static {
        bk0 bk0Var = new bk0(0, InterfaceC32663coo2iico.cco22);
        f77335b = bk0Var;
        bk0 bk0Var2 = new bk0(1, "PREPARED");
        f77336c = bk0Var2;
        bk0 bk0Var3 = new bk0(2, "PLAYING");
        f77337d = bk0Var3;
        bk0 bk0Var4 = new bk0(3, "PAUSED");
        f77338e = bk0Var4;
        bk0 bk0Var5 = new bk0(4, "SKIPPED");
        f77339f = bk0Var5;
        bk0 bk0Var6 = new bk0(5, "ERROR");
        f77340g = bk0Var6;
        bk0 bk0Var7 = new bk0(6, "COMPLETED");
        f77341h = bk0Var7;
        bk0[] bk0VarArr = {bk0Var, bk0Var2, bk0Var3, bk0Var4, bk0Var5, bk0Var6, bk0Var7};
        f77342i = bk0VarArr;
        C44401b.m3113a(bk0VarArr);
    }

    private bk0(int i, String str) {
    }

    public static bk0 valueOf(String str) {
        return (bk0) Enum.valueOf(bk0.class, str);
    }

    public static bk0[] values() {
        return (bk0[]) f77342i.clone();
    }
}
