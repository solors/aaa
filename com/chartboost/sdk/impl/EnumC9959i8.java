package com.chartboost.sdk.impl;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.i8 */
/* loaded from: classes3.dex */
public final class EnumC9959i8 {

    /* renamed from: c */
    public static final EnumC9959i8 f22351c = new EnumC9959i8(InterfaceC32663coo2iico.cco22, 0, 0);

    /* renamed from: d */
    public static final EnumC9959i8 f22352d = new EnumC9959i8("IDLE", 1, 1);

    /* renamed from: e */
    public static final EnumC9959i8 f22353e = new EnumC9959i8("PLAYING", 2, 2);

    /* renamed from: f */
    public static final EnumC9959i8 f22354f = new EnumC9959i8("PAUSED", 3, 3);

    /* renamed from: g */
    public static final /* synthetic */ EnumC9959i8[] f22355g;

    /* renamed from: h */
    public static final /* synthetic */ EnumEntries f22356h;

    /* renamed from: b */
    public final int f22357b;

    static {
        EnumC9959i8[] m81388a = m81388a();
        f22355g = m81388a;
        f22356h = C44401b.m3113a(m81388a);
    }

    public EnumC9959i8(String str, int i, int i2) {
        this.f22357b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9959i8[] m81388a() {
        return new EnumC9959i8[]{f22351c, f22352d, f22353e, f22354f};
    }

    public static EnumC9959i8 valueOf(String str) {
        return (EnumC9959i8) Enum.valueOf(EnumC9959i8.class, str);
    }

    public static EnumC9959i8[] values() {
        return (EnumC9959i8[]) f22355g.clone();
    }
}
