package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.S5 */
/* loaded from: classes6.dex */
public final class EnumC19096S5 {

    /* renamed from: a */
    public static final EnumC19096S5 f47688a;

    /* renamed from: b */
    public static final EnumC19096S5 f47689b;

    /* renamed from: c */
    public static final EnumC19096S5 f47690c;

    /* renamed from: d */
    public static final EnumC19096S5 f47691d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC19096S5[] f47692e;

    static {
        EnumC19096S5 enumC19096S5 = new EnumC19096S5("INFO", 0);
        f47688a = enumC19096S5;
        EnumC19096S5 enumC19096S52 = new EnumC19096S5("DEBUG", 1);
        f47689b = enumC19096S52;
        EnumC19096S5 enumC19096S53 = new EnumC19096S5("ERROR", 2);
        f47690c = enumC19096S53;
        EnumC19096S5 enumC19096S54 = new EnumC19096S5("STATE", 3);
        f47691d = enumC19096S54;
        EnumC19096S5[] enumC19096S5Arr = {enumC19096S5, enumC19096S52, enumC19096S53, enumC19096S54};
        f47692e = enumC19096S5Arr;
        C44401b.m3113a(enumC19096S5Arr);
    }

    public EnumC19096S5(String str, int i) {
    }

    public static EnumC19096S5 valueOf(String str) {
        return (EnumC19096S5) Enum.valueOf(EnumC19096S5.class, str);
    }

    public static EnumC19096S5[] values() {
        return (EnumC19096S5[]) f47692e.clone();
    }
}
