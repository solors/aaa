package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ea2 {

    /* renamed from: b */
    public static final ea2 f78497b;

    /* renamed from: c */
    private static final /* synthetic */ ea2[] f78498c;

    static {
        ea2 ea2Var = new ea2(0, "FIT_XY");
        ea2 ea2Var2 = new ea2(1, "FIT_CENTER");
        f78497b = ea2Var2;
        ea2[] ea2VarArr = {ea2Var, ea2Var2, new ea2(2, "CENTER_CROP")};
        f78498c = ea2VarArr;
        C44401b.m3113a(ea2VarArr);
    }

    private ea2(int i, String str) {
    }

    public static ea2 valueOf(String str) {
        return (ea2) Enum.valueOf(ea2.class, str);
    }

    public static ea2[] values() {
        return (ea2[]) f78498c.clone();
    }
}
