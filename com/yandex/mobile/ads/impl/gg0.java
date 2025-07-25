package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class gg0 {

    /* renamed from: b */
    public static final gg0 f79651b;

    /* renamed from: c */
    private static final /* synthetic */ gg0[] f79652c;

    static {
        gg0 gg0Var = new gg0(0, "PROD");
        f79651b = gg0Var;
        gg0[] gg0VarArr = {gg0Var, new gg0(1, "PREDEFINED")};
        f79652c = gg0VarArr;
        C44401b.m3113a(gg0VarArr);
    }

    private gg0(int i, String str) {
    }

    public static gg0 valueOf(String str) {
        return (gg0) Enum.valueOf(gg0.class, str);
    }

    public static gg0[] values() {
        return (gg0[]) f79652c.clone();
    }
}
