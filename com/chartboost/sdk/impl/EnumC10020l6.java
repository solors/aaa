package com.chartboost.sdk.impl;

import com.ironsource.mediationsdk.C20410l;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.l6 */
/* loaded from: classes3.dex */
public final class EnumC10020l6 {

    /* renamed from: c */
    public static final EnumC10020l6 f22507c = new EnumC10020l6("INTERSTITIAL", 0, 0);

    /* renamed from: d */
    public static final EnumC10020l6 f22508d = new EnumC10020l6("INTERSTITIAL_VIDEO", 1, 1);

    /* renamed from: e */
    public static final EnumC10020l6 f22509e = new EnumC10020l6("INTERSTITIAL_REWARD_VIDEO", 2, 2);

    /* renamed from: f */
    public static final EnumC10020l6 f22510f = new EnumC10020l6(C20410l.f51629a, 3, 3);

    /* renamed from: g */
    public static final EnumC10020l6 f22511g = new EnumC10020l6(InterfaceC32663coo2iico.cco22, 4, 4);

    /* renamed from: h */
    public static final /* synthetic */ EnumC10020l6[] f22512h;

    /* renamed from: i */
    public static final /* synthetic */ EnumEntries f22513i;

    /* renamed from: b */
    public final int f22514b;

    static {
        EnumC10020l6[] m81177a = m81177a();
        f22512h = m81177a;
        f22513i = C44401b.m3113a(m81177a);
    }

    public EnumC10020l6(String str, int i, int i2) {
        this.f22514b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10020l6[] m81177a() {
        return new EnumC10020l6[]{f22507c, f22508d, f22509e, f22510f, f22511g};
    }

    public static EnumC10020l6 valueOf(String str) {
        return (EnumC10020l6) Enum.valueOf(EnumC10020l6.class, str);
    }

    public static EnumC10020l6[] values() {
        return (EnumC10020l6[]) f22512h.clone();
    }
}
