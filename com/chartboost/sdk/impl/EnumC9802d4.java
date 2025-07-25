package com.chartboost.sdk.impl;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import kotlin.jvm.internal.DefaultConstructorMarker;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.d4 */
/* loaded from: classes3.dex */
public final class EnumC9802d4 {

    /* renamed from: c */
    public static final C9803a f21892c;

    /* renamed from: d */
    public static final EnumC9802d4 f21893d = new EnumC9802d4(InterfaceC32663coo2iico.cco22, 0, 0);

    /* renamed from: e */
    public static final EnumC9802d4 f21894e = new EnumC9802d4("STOPPED_QUEUE", 1, 1);

    /* renamed from: f */
    public static final EnumC9802d4 f21895f = new EnumC9802d4("MAX_COUNT_TIME_WINDOW", 2, 2);

    /* renamed from: g */
    public static final EnumC9802d4 f21896g = new EnumC9802d4("FORCED_OUT", 3, 3);

    /* renamed from: h */
    public static final /* synthetic */ EnumC9802d4[] f21897h;

    /* renamed from: i */
    public static final /* synthetic */ EnumEntries f21898i;

    /* renamed from: b */
    public final int f21899b;

    /* renamed from: com.chartboost.sdk.impl.d4$a */
    /* loaded from: classes3.dex */
    public static final class C9803a {
        public C9803a() {
        }

        public /* synthetic */ C9803a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumC9802d4[] m81826a = m81826a();
        f21897h = m81826a;
        f21898i = C44401b.m3113a(m81826a);
        f21892c = new C9803a(null);
    }

    public EnumC9802d4(String str, int i, int i2) {
        this.f21899b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9802d4[] m81826a() {
        return new EnumC9802d4[]{f21893d, f21894e, f21895f, f21896g};
    }

    public static EnumC9802d4 valueOf(String str) {
        return (EnumC9802d4) Enum.valueOf(EnumC9802d4.class, str);
    }

    public static EnumC9802d4[] values() {
        return (EnumC9802d4[]) f21897h.clone();
    }

    /* renamed from: b */
    public final int m81825b() {
        return this.f21899b;
    }
}
