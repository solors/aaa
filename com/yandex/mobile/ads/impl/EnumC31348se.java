package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.se */
/* loaded from: classes8.dex */
public final class EnumC31348se {

    /* renamed from: b */
    public static final EnumC31348se f85200b;

    /* renamed from: c */
    public static final EnumC31348se f85201c;

    /* renamed from: d */
    public static final EnumC31348se f85202d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC31348se[] f85203e;

    static {
        EnumC31348se enumC31348se = new EnumC31348se(0, "UNKNOWN");
        f85200b = enumC31348se;
        EnumC31348se enumC31348se2 = new EnumC31348se(1, "NETWORK");
        f85201c = enumC31348se2;
        EnumC31348se enumC31348se3 = new EnumC31348se(2, "INVALID_RESPONSE");
        f85202d = enumC31348se3;
        EnumC31348se[] enumC31348seArr = {enumC31348se, enumC31348se2, enumC31348se3};
        f85203e = enumC31348seArr;
        C44401b.m3113a(enumC31348seArr);
    }

    private EnumC31348se(int i, String str) {
    }

    public static EnumC31348se valueOf(String str) {
        return (EnumC31348se) Enum.valueOf(EnumC31348se.class, str);
    }

    public static EnumC31348se[] values() {
        return (EnumC31348se[]) f85203e.clone();
    }
}
