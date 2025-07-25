package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.o8 */
/* loaded from: classes8.dex */
public final class EnumC31024o8 {

    /* renamed from: b */
    public static final EnumC31024o8 f83362b;

    /* renamed from: c */
    public static final EnumC31024o8 f83363c;

    /* renamed from: d */
    public static final EnumC31024o8 f83364d;

    /* renamed from: e */
    public static final EnumC31024o8 f83365e;

    /* renamed from: f */
    public static final EnumC31024o8 f83366f;

    /* renamed from: g */
    private static final /* synthetic */ EnumC31024o8[] f83367g;

    static {
        EnumC31024o8 enumC31024o8 = new EnumC31024o8(0, "INITIAL");
        f83362b = enumC31024o8;
        EnumC31024o8 enumC31024o82 = new EnumC31024o8(1, "PREPARED");
        f83363c = enumC31024o82;
        EnumC31024o8 enumC31024o83 = new EnumC31024o8(2, "STARTED");
        f83364d = enumC31024o83;
        EnumC31024o8 enumC31024o84 = new EnumC31024o8(3, "ENDED");
        f83365e = enumC31024o84;
        EnumC31024o8 enumC31024o85 = new EnumC31024o8(4, "ERROR");
        f83366f = enumC31024o85;
        EnumC31024o8[] enumC31024o8Arr = {enumC31024o8, enumC31024o82, enumC31024o83, enumC31024o84, enumC31024o85};
        f83367g = enumC31024o8Arr;
        C44401b.m3113a(enumC31024o8Arr);
    }

    private EnumC31024o8(int i, String str) {
    }

    public static EnumC31024o8 valueOf(String str) {
        return (EnumC31024o8) Enum.valueOf(EnumC31024o8.class, str);
    }

    public static EnumC31024o8[] values() {
        return (EnumC31024o8[]) f83367g.clone();
    }
}
