package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ev1 {

    /* renamed from: c */
    public static final ev1 f78810c;

    /* renamed from: d */
    private static final /* synthetic */ ev1[] f78811d;
    @NotNull

    /* renamed from: b */
    private final String f78812b;

    static {
        ev1 ev1Var = new ev1(0, "NEXT", "next");
        ev1 ev1Var2 = new ev1(1, "LAST", "last");
        f78810c = ev1Var2;
        ev1[] ev1VarArr = {ev1Var, ev1Var2};
        f78811d = ev1VarArr;
        C44401b.m3113a(ev1VarArr);
    }

    private ev1(int i, String str, String str2) {
        this.f78812b = str2;
    }

    public static ev1 valueOf(String str) {
        return (ev1) Enum.valueOf(ev1.class, str);
    }

    public static ev1[] values() {
        return (ev1[]) f78811d.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m34419a() {
        return this.f78812b;
    }
}
