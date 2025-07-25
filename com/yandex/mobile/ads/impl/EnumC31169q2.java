package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.q2 */
/* loaded from: classes8.dex */
public final class EnumC31169q2 {

    /* renamed from: b */
    public static final EnumC31169q2 f84154b;

    /* renamed from: c */
    public static final EnumC31169q2 f84155c;

    /* renamed from: d */
    public static final EnumC31169q2 f84156d;

    /* renamed from: e */
    public static final EnumC31169q2 f84157e;

    /* renamed from: f */
    public static final EnumC31169q2 f84158f;

    /* renamed from: g */
    public static final EnumC31169q2 f84159g;

    /* renamed from: h */
    public static final EnumC31169q2 f84160h;

    /* renamed from: i */
    public static final EnumC31169q2 f84161i;

    /* renamed from: j */
    private static final /* synthetic */ EnumC31169q2[] f84162j;

    static {
        EnumC31169q2 enumC31169q2 = new EnumC31169q2(0, "INITIAL");
        f84154b = enumC31169q2;
        EnumC31169q2 enumC31169q22 = new EnumC31169q2(1, "PREPARING");
        f84155c = enumC31169q22;
        EnumC31169q2 enumC31169q23 = new EnumC31169q2(2, "PREPARED");
        f84156d = enumC31169q23;
        EnumC31169q2 enumC31169q24 = new EnumC31169q2(3, "FINISHED");
        f84157e = enumC31169q24;
        EnumC31169q2 enumC31169q25 = new EnumC31169q2(4, "UNKNOWN");
        f84158f = enumC31169q25;
        EnumC31169q2 enumC31169q26 = new EnumC31169q2(5, "ERROR");
        f84159g = enumC31169q26;
        EnumC31169q2 enumC31169q27 = new EnumC31169q2(6, "PAUSED");
        f84160h = enumC31169q27;
        EnumC31169q2 enumC31169q28 = new EnumC31169q2(7, "PLAYING");
        f84161i = enumC31169q28;
        EnumC31169q2[] enumC31169q2Arr = {enumC31169q2, enumC31169q22, enumC31169q23, enumC31169q24, enumC31169q25, enumC31169q26, enumC31169q27, enumC31169q28};
        f84162j = enumC31169q2Arr;
        C44401b.m3113a(enumC31169q2Arr);
    }

    private EnumC31169q2(int i, String str) {
    }

    public static EnumC31169q2 valueOf(String str) {
        return (EnumC31169q2) Enum.valueOf(EnumC31169q2.class, str);
    }

    public static EnumC31169q2[] values() {
        return (EnumC31169q2[]) f84162j.clone();
    }
}
