package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.z1 */
/* loaded from: classes8.dex */
public final class EnumC31944z1 {

    /* renamed from: b */
    public static final EnumC31944z1 f88656b;

    /* renamed from: c */
    public static final EnumC31944z1 f88657c;

    /* renamed from: d */
    private static final /* synthetic */ EnumC31944z1[] f88658d;

    static {
        EnumC31944z1 enumC31944z1 = new EnumC31944z1(0, "TCP");
        f88656b = enumC31944z1;
        EnumC31944z1 enumC31944z12 = new EnumC31944z1(1, "HTTP");
        f88657c = enumC31944z12;
        EnumC31944z1[] enumC31944z1Arr = {enumC31944z1, enumC31944z12};
        f88658d = enumC31944z1Arr;
        C44401b.m3113a(enumC31944z1Arr);
    }

    private EnumC31944z1(int i, String str) {
    }

    public static EnumC31944z1 valueOf(String str) {
        return (EnumC31944z1) Enum.valueOf(EnumC31944z1.class, str);
    }

    public static EnumC31944z1[] values() {
        return (EnumC31944z1[]) f88658d.clone();
    }
}
