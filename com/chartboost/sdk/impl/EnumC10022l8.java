package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.l8 */
/* loaded from: classes3.dex */
public final class EnumC10022l8 {

    /* renamed from: c */
    public static final EnumC10022l8 f22521c = new EnumC10022l8("IMMEDIATE", 0, 0);

    /* renamed from: d */
    public static final EnumC10022l8 f22522d = new EnumC10022l8("HIGH", 1, 1);

    /* renamed from: e */
    public static final EnumC10022l8 f22523e = new EnumC10022l8("NORMAL", 2, 2);

    /* renamed from: f */
    public static final EnumC10022l8 f22524f = new EnumC10022l8("LOW", 3, 3);

    /* renamed from: g */
    public static final /* synthetic */ EnumC10022l8[] f22525g;

    /* renamed from: h */
    public static final /* synthetic */ EnumEntries f22526h;

    /* renamed from: b */
    public final int f22527b;

    static {
        EnumC10022l8[] m81176a = m81176a();
        f22525g = m81176a;
        f22526h = C44401b.m3113a(m81176a);
    }

    public EnumC10022l8(String str, int i, int i2) {
        this.f22527b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10022l8[] m81176a() {
        return new EnumC10022l8[]{f22521c, f22522d, f22523e, f22524f};
    }

    public static EnumC10022l8 valueOf(String str) {
        return (EnumC10022l8) Enum.valueOf(EnumC10022l8.class, str);
    }

    public static EnumC10022l8[] values() {
        return (EnumC10022l8[]) f22525g.clone();
    }

    /* renamed from: b */
    public final int m81175b() {
        return this.f22527b;
    }
}
