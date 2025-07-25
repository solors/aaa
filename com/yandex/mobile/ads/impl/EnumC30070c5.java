package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.c5 */
/* loaded from: classes8.dex */
public final class EnumC30070c5 {

    /* renamed from: b */
    public static final EnumC30070c5 f77505b;

    /* renamed from: c */
    public static final EnumC30070c5 f77506c;

    /* renamed from: d */
    public static final EnumC30070c5 f77507d;

    /* renamed from: e */
    public static final EnumC30070c5 f77508e;

    /* renamed from: f */
    public static final EnumC30070c5 f77509f;

    /* renamed from: g */
    private static final /* synthetic */ EnumC30070c5[] f77510g;

    static {
        EnumC30070c5 enumC30070c5 = new EnumC30070c5(0, "CANCELLED");
        f77505b = enumC30070c5;
        EnumC30070c5 enumC30070c52 = new EnumC30070c5(1, "NOT_STARTED");
        f77506c = enumC30070c52;
        EnumC30070c5 enumC30070c53 = new EnumC30070c5(2, "LOADING");
        f77507d = enumC30070c53;
        EnumC30070c5 enumC30070c54 = new EnumC30070c5(3, "SUCCESSFULLY_LOADED");
        f77508e = enumC30070c54;
        EnumC30070c5 enumC30070c55 = new EnumC30070c5(4, "ERRONEOUSLY_LOADED");
        f77509f = enumC30070c55;
        EnumC30070c5[] enumC30070c5Arr = {enumC30070c5, enumC30070c52, enumC30070c53, enumC30070c54, enumC30070c55};
        f77510g = enumC30070c5Arr;
        C44401b.m3113a(enumC30070c5Arr);
    }

    private EnumC30070c5(int i, String str) {
    }

    public static EnumC30070c5 valueOf(String str) {
        return (EnumC30070c5) Enum.valueOf(EnumC30070c5.class, str);
    }

    public static EnumC30070c5[] values() {
        return (EnumC30070c5[]) f77510g.clone();
    }
}
