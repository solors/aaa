package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.h9 */
/* loaded from: classes8.dex */
public final class EnumC30451h9 {

    /* renamed from: b */
    public static final EnumC30451h9 f79993b;

    /* renamed from: c */
    public static final EnumC30451h9 f79994c;

    /* renamed from: d */
    public static final EnumC30451h9 f79995d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC30451h9[] f79996e;

    static {
        EnumC30451h9 enumC30451h9 = new EnumC30451h9(0, "SINGLE");
        f79993b = enumC30451h9;
        EnumC30451h9 enumC30451h92 = new EnumC30451h9(1, "BLOCK");
        f79994c = enumC30451h92;
        EnumC30451h9 enumC30451h93 = new EnumC30451h9(2, "BLOCK_INNER_CREATIVE");
        f79995d = enumC30451h93;
        EnumC30451h9[] enumC30451h9Arr = {enumC30451h9, enumC30451h92, enumC30451h93};
        f79996e = enumC30451h9Arr;
        C44401b.m3113a(enumC30451h9Arr);
    }

    private EnumC30451h9(int i, String str) {
    }

    public static EnumC30451h9 valueOf(String str) {
        return (EnumC30451h9) Enum.valueOf(EnumC30451h9.class, str);
    }

    public static EnumC30451h9[] values() {
        return (EnumC30451h9[]) f79996e.clone();
    }
}
