package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.o3 */
/* loaded from: classes3.dex */
public final class EnumC10095o3 {

    /* renamed from: c */
    public static final EnumC10095o3 f22834c = new EnumC10095o3("CONNECTION_UNKNOWN", 0, -1);

    /* renamed from: d */
    public static final EnumC10095o3 f22835d = new EnumC10095o3("CONNECTION_ERROR", 1, 0);

    /* renamed from: e */
    public static final EnumC10095o3 f22836e = new EnumC10095o3("CONNECTION_WIFI", 2, 1);

    /* renamed from: f */
    public static final EnumC10095o3 f22837f = new EnumC10095o3("CONNECTION_MOBILE", 3, 2);

    /* renamed from: g */
    public static final /* synthetic */ EnumC10095o3[] f22838g;

    /* renamed from: h */
    public static final /* synthetic */ EnumEntries f22839h;

    /* renamed from: b */
    public final int f22840b;

    static {
        EnumC10095o3[] m80903a = m80903a();
        f22838g = m80903a;
        f22839h = C44401b.m3113a(m80903a);
    }

    public EnumC10095o3(String str, int i, int i2) {
        this.f22840b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10095o3[] m80903a() {
        return new EnumC10095o3[]{f22834c, f22835d, f22836e, f22837f};
    }

    public static EnumC10095o3 valueOf(String str) {
        return (EnumC10095o3) Enum.valueOf(EnumC10095o3.class, str);
    }

    public static EnumC10095o3[] values() {
        return (EnumC10095o3[]) f22838g.clone();
    }

    /* renamed from: b */
    public final int m80902b() {
        return this.f22840b;
    }
}
