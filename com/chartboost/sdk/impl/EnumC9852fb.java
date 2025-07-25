package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.fb */
/* loaded from: classes3.dex */
public final class EnumC9852fb {

    /* renamed from: b */
    public static final EnumC9852fb f22014b = new EnumC9852fb("START", 0);

    /* renamed from: c */
    public static final EnumC9852fb f22015c = new EnumC9852fb("RESUME", 1);

    /* renamed from: d */
    public static final EnumC9852fb f22016d = new EnumC9852fb("PAUSE", 2);

    /* renamed from: e */
    public static final EnumC9852fb f22017e = new EnumC9852fb("BUFFER_START", 3);

    /* renamed from: f */
    public static final EnumC9852fb f22018f = new EnumC9852fb("BUFFER_END", 4);

    /* renamed from: g */
    public static final EnumC9852fb f22019g = new EnumC9852fb("QUARTILE1", 5);

    /* renamed from: h */
    public static final EnumC9852fb f22020h = new EnumC9852fb("MIDPOINT", 6);

    /* renamed from: i */
    public static final EnumC9852fb f22021i = new EnumC9852fb("QUARTILE3", 7);

    /* renamed from: j */
    public static final EnumC9852fb f22022j = new EnumC9852fb("COMPLETED", 8);

    /* renamed from: k */
    public static final EnumC9852fb f22023k = new EnumC9852fb("SKIP", 9);

    /* renamed from: l */
    public static final EnumC9852fb f22024l = new EnumC9852fb("VOLUME_CHANGE", 10);

    /* renamed from: m */
    public static final /* synthetic */ EnumC9852fb[] f22025m;

    /* renamed from: n */
    public static final /* synthetic */ EnumEntries f22026n;

    static {
        EnumC9852fb[] m81685a = m81685a();
        f22025m = m81685a;
        f22026n = C44401b.m3113a(m81685a);
    }

    public EnumC9852fb(String str, int i) {
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9852fb[] m81685a() {
        return new EnumC9852fb[]{f22014b, f22015c, f22016d, f22017e, f22018f, f22019g, f22020h, f22021i, f22022j, f22023k, f22024l};
    }

    public static EnumC9852fb valueOf(String str) {
        return (EnumC9852fb) Enum.valueOf(EnumC9852fb.class, str);
    }

    public static EnumC9852fb[] values() {
        return (EnumC9852fb[]) f22025m.clone();
    }
}
