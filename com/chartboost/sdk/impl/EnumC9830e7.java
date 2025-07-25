package com.chartboost.sdk.impl;

import com.facebook.share.internal.ShareConstants;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.e7 */
/* loaded from: classes3.dex */
public final class EnumC9830e7 {

    /* renamed from: c */
    public static final EnumC9830e7 f21948c = new EnumC9830e7("UNKNOWN", 0, 0);

    /* renamed from: d */
    public static final EnumC9830e7 f21949d = new EnumC9830e7("HTML", 1, 1);

    /* renamed from: e */
    public static final EnumC9830e7 f21950e = new EnumC9830e7(ShareConstants.VIDEO_URL, 2, 2);

    /* renamed from: f */
    public static final EnumC9830e7 f21951f = new EnumC9830e7("AUDIO", 3, 3);

    /* renamed from: g */
    public static final EnumC9830e7 f21952g = new EnumC9830e7("NATIVE", 4, 4);

    /* renamed from: h */
    public static final /* synthetic */ EnumC9830e7[] f21953h;

    /* renamed from: i */
    public static final /* synthetic */ EnumEntries f21954i;

    /* renamed from: b */
    public final int f21955b;

    static {
        EnumC9830e7[] m81736a = m81736a();
        f21953h = m81736a;
        f21954i = C44401b.m3113a(m81736a);
    }

    public EnumC9830e7(String str, int i, int i2) {
        this.f21955b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9830e7[] m81736a() {
        return new EnumC9830e7[]{f21948c, f21949d, f21950e, f21951f, f21952g};
    }

    /* renamed from: b */
    public static EnumEntries m81735b() {
        return f21954i;
    }

    public static EnumC9830e7 valueOf(String str) {
        return (EnumC9830e7) Enum.valueOf(EnumC9830e7.class, str);
    }

    public static EnumC9830e7[] values() {
        return (EnumC9830e7[]) f21953h.clone();
    }

    /* renamed from: c */
    public final int m81734c() {
        return this.f21955b;
    }
}
