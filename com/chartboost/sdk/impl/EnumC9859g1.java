package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.g1 */
/* loaded from: classes3.dex */
public final class EnumC9859g1 {

    /* renamed from: b */
    public static final EnumC9859g1 f22057b = new EnumC9859g1("FAILURE", 0);

    /* renamed from: c */
    public static final EnumC9859g1 f22058c = new EnumC9859g1("READY_TO_SHOW", 1);

    /* renamed from: d */
    public static final EnumC9859g1 f22059d = new EnumC9859g1("SUCCESS", 2);

    /* renamed from: e */
    public static final /* synthetic */ EnumC9859g1[] f22060e;

    /* renamed from: f */
    public static final /* synthetic */ EnumEntries f22061f;

    static {
        EnumC9859g1[] m81652a = m81652a();
        f22060e = m81652a;
        f22061f = C44401b.m3113a(m81652a);
    }

    public EnumC9859g1(String str, int i) {
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9859g1[] m81652a() {
        return new EnumC9859g1[]{f22057b, f22058c, f22059d};
    }

    public static EnumC9859g1 valueOf(String str) {
        return (EnumC9859g1) Enum.valueOf(EnumC9859g1.class, str);
    }

    public static EnumC9859g1[] values() {
        return (EnumC9859g1[]) f22060e.clone();
    }
}
