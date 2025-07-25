package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class gv1 {

    /* renamed from: c */
    private static final /* synthetic */ gv1[] f79776c;

    /* renamed from: d */
    public static final /* synthetic */ int f79777d = 0;
    @NotNull

    /* renamed from: b */
    private final String f79778b;

    static {
        gv1[] gv1VarArr = {new gv1(0, "VISIBLE", "visible"), new gv1(1, "DELAYED", "delayed")};
        f79776c = gv1VarArr;
        C44401b.m3113a(gv1VarArr);
    }

    private gv1(int i, String str, String str2) {
        this.f79778b = str2;
    }

    public static gv1 valueOf(String str) {
        return (gv1) Enum.valueOf(gv1.class, str);
    }

    public static gv1[] values() {
        return (gv1[]) f79776c.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m33771a() {
        return this.f79778b;
    }
}
