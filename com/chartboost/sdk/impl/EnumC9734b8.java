package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.b8 */
/* loaded from: classes3.dex */
public final class EnumC9734b8 {

    /* renamed from: b */
    public static final EnumC9734b8 f21690b = new EnumC9734b8("PORTRAIT", 0);

    /* renamed from: c */
    public static final EnumC9734b8 f21691c = new EnumC9734b8("LANDSCAPE", 1);

    /* renamed from: d */
    public static final EnumC9734b8 f21692d = new EnumC9734b8("PORTRAIT_REVERSE", 2);

    /* renamed from: e */
    public static final EnumC9734b8 f21693e = new EnumC9734b8("LANDSCAPE_REVERSE", 3);

    /* renamed from: f */
    public static final EnumC9734b8 f21694f = new EnumC9734b8("PORTRAIT_LEFT", 4);

    /* renamed from: g */
    public static final EnumC9734b8 f21695g = new EnumC9734b8("PORTRAIT_RIGHT", 5);

    /* renamed from: h */
    public static final EnumC9734b8 f21696h = new EnumC9734b8("LANDSCAPE_LEFT", 6);

    /* renamed from: i */
    public static final EnumC9734b8 f21697i = new EnumC9734b8("LANDSCAPE_RIGHT", 7);

    /* renamed from: j */
    public static final /* synthetic */ EnumC9734b8[] f21698j;

    /* renamed from: k */
    public static final /* synthetic */ EnumEntries f21699k;

    static {
        EnumC9734b8[] m82017a = m82017a();
        f21698j = m82017a;
        f21699k = C44401b.m3113a(m82017a);
    }

    public EnumC9734b8(String str, int i) {
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9734b8[] m82017a() {
        return new EnumC9734b8[]{f21690b, f21691c, f21692d, f21693e, f21694f, f21695g, f21696h, f21697i};
    }

    public static EnumC9734b8 valueOf(String str) {
        return (EnumC9734b8) Enum.valueOf(EnumC9734b8.class, str);
    }

    public static EnumC9734b8[] values() {
        return (EnumC9734b8[]) f21698j.clone();
    }
}
