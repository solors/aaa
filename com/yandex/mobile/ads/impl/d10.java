package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class d10 {

    /* renamed from: b */
    public static final d10 f77831b;

    /* renamed from: c */
    public static final d10 f77832c;

    /* renamed from: d */
    private static final /* synthetic */ d10[] f77833d;

    static {
        d10 d10Var = new d10(0, "BLOCK");
        f77831b = d10Var;
        d10 d10Var2 = new d10(1, "BLOCK_INNER_AD");
        f77832c = d10Var2;
        d10[] d10VarArr = {d10Var, d10Var2};
        f77833d = d10VarArr;
        C44401b.m3113a(d10VarArr);
    }

    private d10(int i, String str) {
    }

    public static d10 valueOf(String str) {
        return (d10) Enum.valueOf(d10.class, str);
    }

    public static d10[] values() {
        return (d10[]) f77833d.clone();
    }
}
