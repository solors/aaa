package com.yandex.mobile.ads.impl;

import com.amazon.p047a.p048a.p066n.p067a.p068a.MalformedResponseException;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class fx1 {

    /* renamed from: b */
    public static final fx1 f79341b;

    /* renamed from: c */
    public static final fx1 f79342c;

    /* renamed from: d */
    public static final fx1 f79343d;

    /* renamed from: e */
    private static final /* synthetic */ fx1[] f79344e;

    static {
        fx1 fx1Var = new fx1(0, "DEFAULT");
        f79341b = fx1Var;
        fx1 fx1Var2 = new fx1(1, "SOCIAL");
        f79342c = fx1Var2;
        fx1 fx1Var3 = new fx1(2, MalformedResponseException.f2548a);
        f79343d = fx1Var3;
        fx1[] fx1VarArr = {fx1Var, fx1Var2, fx1Var3};
        f79344e = fx1VarArr;
        C44401b.m3113a(fx1VarArr);
    }

    private fx1(int i, String str) {
    }

    public static fx1 valueOf(String str) {
        return (fx1) Enum.valueOf(fx1.class, str);
    }

    public static fx1[] values() {
        return (fx1[]) f79344e.clone();
    }
}
