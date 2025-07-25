package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.ar */
/* loaded from: classes8.dex */
public final class EnumC29958ar {

    /* renamed from: b */
    public static final EnumC29958ar f76877b;

    /* renamed from: c */
    public static final EnumC29958ar f76878c;

    /* renamed from: d */
    private static final /* synthetic */ EnumC29958ar[] f76879d;

    static {
        EnumC29958ar enumC29958ar = new EnumC29958ar(0, "HTML");
        f76877b = enumC29958ar;
        EnumC29958ar enumC29958ar2 = new EnumC29958ar(1, "NATIVE");
        f76878c = enumC29958ar2;
        EnumC29958ar[] enumC29958arArr = {enumC29958ar, enumC29958ar2};
        f76879d = enumC29958arArr;
        C44401b.m3113a(enumC29958arArr);
    }

    private EnumC29958ar(int i, String str) {
    }

    public static EnumC29958ar valueOf(String str) {
        return (EnumC29958ar) Enum.valueOf(EnumC29958ar.class, str);
    }

    public static EnumC29958ar[] values() {
        return (EnumC29958ar[]) f76879d.clone();
    }
}
