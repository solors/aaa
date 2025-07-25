package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class fd1 {

    /* renamed from: b */
    public static final fd1 f79052b;

    /* renamed from: c */
    public static final fd1 f79053c;

    /* renamed from: d */
    public static final fd1 f79054d;

    /* renamed from: e */
    private static final /* synthetic */ fd1[] f79055e;

    static {
        fd1 fd1Var = new fd1(0, "SCREEN_ON");
        f79052b = fd1Var;
        fd1 fd1Var2 = new fd1(1, "SCREEN_OFF");
        f79053c = fd1Var2;
        fd1 fd1Var3 = new fd1(2, "USER_PRESENT");
        f79054d = fd1Var3;
        fd1[] fd1VarArr = {fd1Var, fd1Var2, fd1Var3};
        f79055e = fd1VarArr;
        C44401b.m3113a(fd1VarArr);
    }

    private fd1(int i, String str) {
    }

    public static fd1 valueOf(String str) {
        return (fd1) Enum.valueOf(fd1.class, str);
    }

    public static fd1[] values() {
        return (fd1[]) f79055e.clone();
    }
}
