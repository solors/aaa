package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.c9 */
/* loaded from: classes6.dex */
public final class EnumC19232c9 {

    /* renamed from: a */
    public static final EnumC19232c9 f48131a;

    /* renamed from: b */
    public static final EnumC19232c9 f48132b;

    /* renamed from: c */
    public static final EnumC19232c9 f48133c;

    /* renamed from: d */
    public static final EnumC19232c9 f48134d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC19232c9[] f48135e;

    static {
        EnumC19232c9 enumC19232c9 = new EnumC19232c9("PORTRAIT", 0);
        f48131a = enumC19232c9;
        EnumC19232c9 enumC19232c92 = new EnumC19232c9("LANDSCAPE", 1);
        f48132b = enumC19232c92;
        EnumC19232c9 enumC19232c93 = new EnumC19232c9("REVERSE_PORTRAIT", 2);
        f48133c = enumC19232c93;
        EnumC19232c9 enumC19232c94 = new EnumC19232c9("REVERSE_LANDSCAPE", 3);
        f48134d = enumC19232c94;
        EnumC19232c9[] enumC19232c9Arr = {enumC19232c9, enumC19232c92, enumC19232c93, enumC19232c94};
        f48135e = enumC19232c9Arr;
        C44401b.m3113a(enumC19232c9Arr);
    }

    public EnumC19232c9(String str, int i) {
    }

    public static EnumC19232c9 valueOf(String str) {
        return (EnumC19232c9) Enum.valueOf(EnumC19232c9.class, str);
    }

    public static EnumC19232c9[] values() {
        return (EnumC19232c9[]) f48135e.clone();
    }
}
