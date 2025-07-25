package com.chartboost.sdk.impl;

import com.facebook.internal.AnalyticsEvents;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.n7 */
/* loaded from: classes3.dex */
public final class EnumC10065n7 {

    /* renamed from: d */
    public static final EnumC10065n7 f22647d = new EnumC10065n7("UNKNOWN", 0, 0, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);

    /* renamed from: e */
    public static final EnumC10065n7 f22648e = new EnumC10065n7("ETHERNET", 1, 1, "Ethernet");

    /* renamed from: f */
    public static final EnumC10065n7 f22649f = new EnumC10065n7(InterfaceC32663coo2iico.coo2iico, 2, 2, InterfaceC32663coo2iico.coo2iico);

    /* renamed from: g */
    public static final EnumC10065n7 f22650g = new EnumC10065n7("CELLULAR_UNKNOWN", 3, 3, "Cellular_Unknown");

    /* renamed from: h */
    public static final EnumC10065n7 f22651h = new EnumC10065n7("CELLULAR_2G", 4, 4, "Cellular_2G");

    /* renamed from: i */
    public static final EnumC10065n7 f22652i = new EnumC10065n7("CELLULAR_3G", 5, 5, "Cellular_3G");

    /* renamed from: j */
    public static final EnumC10065n7 f22653j = new EnumC10065n7("CELLULAR_4G", 6, 6, "Cellular_4G");

    /* renamed from: k */
    public static final EnumC10065n7 f22654k = new EnumC10065n7("CELLULAR_5G", 7, 7, "Cellular_5G");

    /* renamed from: l */
    public static final /* synthetic */ EnumC10065n7[] f22655l;

    /* renamed from: m */
    public static final /* synthetic */ EnumEntries f22656m;

    /* renamed from: b */
    public final int f22657b;

    /* renamed from: c */
    public final String f22658c;

    static {
        EnumC10065n7[] m81035a = m81035a();
        f22655l = m81035a;
        f22656m = C44401b.m3113a(m81035a);
    }

    public EnumC10065n7(String str, int i, int i2, String str2) {
        this.f22657b = i2;
        this.f22658c = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10065n7[] m81035a() {
        return new EnumC10065n7[]{f22647d, f22648e, f22649f, f22650g, f22651h, f22652i, f22653j, f22654k};
    }

    public static EnumC10065n7 valueOf(String str) {
        return (EnumC10065n7) Enum.valueOf(EnumC10065n7.class, str);
    }

    public static EnumC10065n7[] values() {
        return (EnumC10065n7[]) f22655l.clone();
    }

    /* renamed from: b */
    public final String m81034b() {
        return this.f22658c;
    }

    /* renamed from: c */
    public final int m81033c() {
        return this.f22657b;
    }
}
