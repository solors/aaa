package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.vz */
/* loaded from: classes8.dex */
public final class EnumC31709vz {

    /* renamed from: b */
    public static final EnumC31709vz f87041b;

    /* renamed from: c */
    public static final EnumC31709vz f87042c;

    /* renamed from: d */
    public static final EnumC31709vz f87043d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC31709vz[] f87044e;

    static {
        EnumC31709vz enumC31709vz = new EnumC31709vz(0, "PHONE");
        f87041b = enumC31709vz;
        EnumC31709vz enumC31709vz2 = new EnumC31709vz(1, "TABLET");
        f87042c = enumC31709vz2;
        EnumC31709vz enumC31709vz3 = new EnumC31709vz(2, "TV");
        f87043d = enumC31709vz3;
        EnumC31709vz[] enumC31709vzArr = {enumC31709vz, enumC31709vz2, enumC31709vz3};
        f87044e = enumC31709vzArr;
        C44401b.m3113a(enumC31709vzArr);
    }

    private EnumC31709vz(int i, String str) {
    }

    public static EnumC31709vz valueOf(String str) {
        return (EnumC31709vz) Enum.valueOf(EnumC31709vz.class, str);
    }

    public static EnumC31709vz[] values() {
        return (EnumC31709vz[]) f87044e.clone();
    }
}
