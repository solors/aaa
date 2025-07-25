package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.o2 */
/* loaded from: classes8.dex */
public final class EnumC31013o2 {

    /* renamed from: b */
    public static final EnumC31013o2 f83275b;

    /* renamed from: c */
    public static final EnumC31013o2 f83276c;

    /* renamed from: d */
    public static final EnumC31013o2 f83277d;

    /* renamed from: e */
    public static final EnumC31013o2 f83278e;

    /* renamed from: f */
    private static final /* synthetic */ EnumC31013o2[] f83279f;

    static {
        EnumC31013o2 enumC31013o2 = new EnumC31013o2(0, "PREROLL");
        f83275b = enumC31013o2;
        EnumC31013o2 enumC31013o22 = new EnumC31013o2(1, "MIDROLL");
        f83276c = enumC31013o22;
        EnumC31013o2 enumC31013o23 = new EnumC31013o2(2, "POSTROLL");
        f83277d = enumC31013o23;
        EnumC31013o2 enumC31013o24 = new EnumC31013o2(3, "STANDALONE");
        f83278e = enumC31013o24;
        EnumC31013o2[] enumC31013o2Arr = {enumC31013o2, enumC31013o22, enumC31013o23, enumC31013o24};
        f83279f = enumC31013o2Arr;
        C44401b.m3113a(enumC31013o2Arr);
    }

    private EnumC31013o2(int i, String str) {
    }

    public static EnumC31013o2 valueOf(String str) {
        return (EnumC31013o2) Enum.valueOf(EnumC31013o2.class, str);
    }

    public static EnumC31013o2[] values() {
        return (EnumC31013o2[]) f83279f.clone();
    }
}
