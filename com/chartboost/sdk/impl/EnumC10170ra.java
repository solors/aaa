package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.ra */
/* loaded from: classes3.dex */
public final class EnumC10170ra {

    /* renamed from: c */
    public static final EnumC10170ra f23054c = new EnumC10170ra("TRACKING_UNKNOWN", 0, -1);

    /* renamed from: d */
    public static final EnumC10170ra f23055d = new EnumC10170ra("TRACKING_ENABLED", 1, 0);

    /* renamed from: e */
    public static final EnumC10170ra f23056e = new EnumC10170ra("TRACKING_LIMITED", 2, 1);

    /* renamed from: f */
    public static final /* synthetic */ EnumC10170ra[] f23057f;

    /* renamed from: g */
    public static final /* synthetic */ EnumEntries f23058g;

    /* renamed from: b */
    public final int f23059b;

    static {
        EnumC10170ra[] m80678a = m80678a();
        f23057f = m80678a;
        f23058g = C44401b.m3113a(m80678a);
    }

    public EnumC10170ra(String str, int i, int i2) {
        this.f23059b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10170ra[] m80678a() {
        return new EnumC10170ra[]{f23054c, f23055d, f23056e};
    }

    public static EnumC10170ra valueOf(String str) {
        return (EnumC10170ra) Enum.valueOf(EnumC10170ra.class, str);
    }

    public static EnumC10170ra[] values() {
        return (EnumC10170ra[]) f23057f.clone();
    }

    /* renamed from: b */
    public final int m80677b() {
        return this.f23059b;
    }
}
