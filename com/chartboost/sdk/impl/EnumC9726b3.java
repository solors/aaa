package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.b3 */
/* loaded from: classes3.dex */
public final class EnumC9726b3 {

    /* renamed from: c */
    public static final C9727a f21668c;

    /* renamed from: d */
    public static final EnumC9726b3 f21669d = new EnumC9726b3("CLICK_PREFERENCE_EMBEDDED", 0, 0);

    /* renamed from: e */
    public static final EnumC9726b3 f21670e = new EnumC9726b3("CLICK_PREFERENCE_NATIVE", 1, 1);

    /* renamed from: f */
    public static final /* synthetic */ EnumC9726b3[] f21671f;

    /* renamed from: g */
    public static final /* synthetic */ EnumEntries f21672g;

    /* renamed from: b */
    public final int f21673b;

    /* renamed from: com.chartboost.sdk.impl.b3$a */
    /* loaded from: classes3.dex */
    public static final class C9727a {
        public C9727a() {
        }

        /* renamed from: a */
        public final EnumC9726b3 m82028a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return EnumC9726b3.f21669d;
                }
                return EnumC9726b3.f21670e;
            }
            return EnumC9726b3.f21669d;
        }

        public /* synthetic */ C9727a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumC9726b3[] m82030a = m82030a();
        f21671f = m82030a;
        f21672g = C44401b.m3113a(m82030a);
        f21668c = new C9727a(null);
    }

    public EnumC9726b3(String str, int i, int i2) {
        this.f21673b = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9726b3[] m82030a() {
        return new EnumC9726b3[]{f21669d, f21670e};
    }

    public static EnumC9726b3 valueOf(String str) {
        return (EnumC9726b3) Enum.valueOf(EnumC9726b3.class, str);
    }

    public static EnumC9726b3[] values() {
        return (EnumC9726b3[]) f21671f.clone();
    }

    /* renamed from: b */
    public final int m82029b() {
        return this.f21673b;
    }
}
