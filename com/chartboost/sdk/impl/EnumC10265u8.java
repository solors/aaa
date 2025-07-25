package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.u8 */
/* loaded from: classes3.dex */
public final class EnumC10265u8 {

    /* renamed from: b */
    public static final EnumC10265u8 f23283b = new EnumC10265u8("FIRST", 0);

    /* renamed from: c */
    public static final EnumC10265u8 f23284c = new EnumC10265u8("MIDDLE", 1);

    /* renamed from: d */
    public static final EnumC10265u8 f23285d = new EnumC10265u8("THIRD", 2);

    /* renamed from: e */
    public static final /* synthetic */ EnumC10265u8[] f23286e;

    /* renamed from: f */
    public static final /* synthetic */ EnumEntries f23287f;

    static {
        EnumC10265u8[] m80391a = m80391a();
        f23286e = m80391a;
        f23287f = C44401b.m3113a(m80391a);
    }

    public EnumC10265u8(String str, int i) {
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10265u8[] m80391a() {
        return new EnumC10265u8[]{f23283b, f23284c, f23285d};
    }

    public static EnumC10265u8 valueOf(String str) {
        return (EnumC10265u8) Enum.valueOf(EnumC10265u8.class, str);
    }

    public static EnumC10265u8[] values() {
        return (EnumC10265u8[]) f23286e.clone();
    }
}
