package com.chartboost.sdk.impl;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.m6 */
/* loaded from: classes3.dex */
public final class EnumC10047m6 {

    /* renamed from: c */
    public static final EnumC10047m6 f22603c = new EnumC10047m6("LOADING", 0, 0);

    /* renamed from: d */
    public static final EnumC10047m6 f22604d = new EnumC10047m6("LOADED", 1, 1);

    /* renamed from: e */
    public static final EnumC10047m6 f22605e = new EnumC10047m6("DISPLAYED", 2, 2);

    /* renamed from: f */
    public static final EnumC10047m6 f22606f = new EnumC10047m6("CACHED", 3, 3);

    /* renamed from: g */
    public static final EnumC10047m6 f22607g = new EnumC10047m6("DISMISSING", 4, 4);

    /* renamed from: h */
    public static final EnumC10047m6 f22608h = new EnumC10047m6(InterfaceC32663coo2iico.cco22, 5, 5);

    /* renamed from: i */
    public static final /* synthetic */ EnumC10047m6[] f22609i;

    /* renamed from: j */
    public static final /* synthetic */ EnumEntries f22610j;

    /* renamed from: b */
    public final int f22611b;

    static {
        EnumC10047m6[] m81101a = m81101a();
        f22609i = m81101a;
        f22610j = C44401b.m3113a(m81101a);
    }

    public EnumC10047m6(String str, int i, int i2) {
        this.f22611b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10047m6[] m81101a() {
        return new EnumC10047m6[]{f22603c, f22604d, f22605e, f22606f, f22607g, f22608h};
    }

    public static EnumC10047m6 valueOf(String str) {
        return (EnumC10047m6) Enum.valueOf(EnumC10047m6.class, str);
    }

    public static EnumC10047m6[] values() {
        return (EnumC10047m6[]) f22609i.clone();
    }
}
