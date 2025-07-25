package com.chartboost.sdk.impl;

import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.q5 */
/* loaded from: classes3.dex */
public final class EnumC10145q5 {

    /* renamed from: c */
    public static final EnumC10145q5 f22976c = new EnumC10145q5("REQUEST_SUCCESS_START", 0, 200);

    /* renamed from: d */
    public static final EnumC10145q5 f22977d = new EnumC10145q5("REQUEST_SUCCESS_END", 1, 299);

    /* renamed from: e */
    public static final EnumC10145q5 f22978e = new EnumC10145q5("REDIRECTION_START", 2, 300);

    /* renamed from: f */
    public static final EnumC10145q5 f22979f = new EnumC10145q5("REDIRECTION_END", 3, 399);

    /* renamed from: g */
    public static final /* synthetic */ EnumC10145q5[] f22980g;

    /* renamed from: h */
    public static final /* synthetic */ EnumEntries f22981h;

    /* renamed from: b */
    public final int f22982b;

    static {
        EnumC10145q5[] m80763a = m80763a();
        f22980g = m80763a;
        f22981h = C44401b.m3113a(m80763a);
    }

    public EnumC10145q5(String str, int i, int i2) {
        this.f22982b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC10145q5[] m80763a() {
        return new EnumC10145q5[]{f22976c, f22977d, f22978e, f22979f};
    }

    public static EnumC10145q5 valueOf(String str) {
        return (EnumC10145q5) Enum.valueOf(EnumC10145q5.class, str);
    }

    public static EnumC10145q5[] values() {
        return (EnumC10145q5[]) f22980g.clone();
    }

    /* renamed from: b */
    public final int m80762b() {
        return this.f22982b;
    }
}
