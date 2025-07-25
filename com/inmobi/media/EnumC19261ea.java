package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.ea */
/* loaded from: classes6.dex */
public final class EnumC19261ea {

    /* renamed from: a */
    public static final EnumC19261ea f48181a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC19261ea[] f48182b;

    static {
        EnumC19261ea enumC19261ea = new EnumC19261ea("HIGH", 0);
        EnumC19261ea enumC19261ea2 = new EnumC19261ea("LOW", 1);
        f48181a = enumC19261ea2;
        EnumC19261ea[] enumC19261eaArr = {enumC19261ea, enumC19261ea2};
        f48182b = enumC19261eaArr;
        C44401b.m3113a(enumC19261eaArr);
    }

    public EnumC19261ea(String str, int i) {
    }

    public static EnumC19261ea valueOf(String str) {
        return (EnumC19261ea) Enum.valueOf(EnumC19261ea.class, str);
    }

    public static EnumC19261ea[] values() {
        return (EnumC19261ea[]) f48182b.clone();
    }
}
