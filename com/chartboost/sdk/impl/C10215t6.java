package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import td.C44401b;
import td.EnumEntries;

/* renamed from: com.chartboost.sdk.impl.t6 */
/* loaded from: classes3.dex */
public final class C10215t6 {

    /* renamed from: a */
    public final String f23154a;

    /* renamed from: b */
    public final String f23155b;

    /* renamed from: c */
    public final EnumC10217b f23156c;

    /* renamed from: d */
    public final C10216a f23157d;

    /* renamed from: e */
    public final C10216a f23158e;

    /* renamed from: f */
    public final C10216a f23159f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.t6$b */
    /* loaded from: classes3.dex */
    public static final class EnumC10217b {

        /* renamed from: c */
        public static final C10218a f23162c;

        /* renamed from: d */
        public static final EnumC10217b f23163d = new EnumC10217b("TOP_LEFT", 0, 0);

        /* renamed from: e */
        public static final EnumC10217b f23164e = new EnumC10217b("TOP_RIGHT", 1, 1);

        /* renamed from: f */
        public static final EnumC10217b f23165f = new EnumC10217b("BOTTOM_LEFT", 2, 2);

        /* renamed from: g */
        public static final EnumC10217b f23166g = new EnumC10217b("BOTTOM_RIGHT", 3, 3);

        /* renamed from: h */
        public static final /* synthetic */ EnumC10217b[] f23167h;

        /* renamed from: i */
        public static final /* synthetic */ EnumEntries f23168i;

        /* renamed from: b */
        public final int f23169b;

        /* renamed from: com.chartboost.sdk.impl.t6$b$a */
        /* loaded from: classes3.dex */
        public static final class C10218a {
            public C10218a() {
            }

            /* renamed from: a */
            public final EnumC10217b m80542a(int i) {
                Object obj;
                Iterator<E> it = EnumC10217b.m80544b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((EnumC10217b) obj).m80543c() == i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                EnumC10217b enumC10217b = (EnumC10217b) obj;
                if (enumC10217b == null) {
                    return EnumC10217b.f23163d;
                }
                return enumC10217b;
            }

            public /* synthetic */ C10218a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            EnumC10217b[] m80545a = m80545a();
            f23167h = m80545a;
            f23168i = C44401b.m3113a(m80545a);
            f23162c = new C10218a(null);
        }

        public EnumC10217b(String str, int i, int i2) {
            this.f23169b = i2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10217b[] m80545a() {
            return new EnumC10217b[]{f23163d, f23164e, f23165f, f23166g};
        }

        /* renamed from: b */
        public static EnumEntries m80544b() {
            return f23168i;
        }

        public static EnumC10217b valueOf(String str) {
            return (EnumC10217b) Enum.valueOf(EnumC10217b.class, str);
        }

        public static EnumC10217b[] values() {
            return (EnumC10217b[]) f23167h.clone();
        }

        /* renamed from: c */
        public final int m80543c() {
            return this.f23169b;
        }
    }

    public C10215t6(String imageUrl, String clickthroughUrl, EnumC10217b position, C10216a margin, C10216a padding, C10216a size) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f23154a = imageUrl;
        this.f23155b = clickthroughUrl;
        this.f23156c = position;
        this.f23157d = margin;
        this.f23158e = padding;
        this.f23159f = size;
    }

    /* renamed from: a */
    public final String m80552a() {
        return this.f23155b;
    }

    /* renamed from: b */
    public final String m80551b() {
        return this.f23154a;
    }

    /* renamed from: c */
    public final C10216a m80550c() {
        return this.f23157d;
    }

    /* renamed from: d */
    public final EnumC10217b m80549d() {
        return this.f23156c;
    }

    /* renamed from: e */
    public final C10216a m80548e() {
        return this.f23159f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10215t6)) {
            return false;
        }
        C10215t6 c10215t6 = (C10215t6) obj;
        if (Intrinsics.m17075f(this.f23154a, c10215t6.f23154a) && Intrinsics.m17075f(this.f23155b, c10215t6.f23155b) && this.f23156c == c10215t6.f23156c && Intrinsics.m17075f(this.f23157d, c10215t6.f23157d) && Intrinsics.m17075f(this.f23158e, c10215t6.f23158e) && Intrinsics.m17075f(this.f23159f, c10215t6.f23159f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f23154a.hashCode() * 31) + this.f23155b.hashCode()) * 31) + this.f23156c.hashCode()) * 31) + this.f23157d.hashCode()) * 31) + this.f23158e.hashCode()) * 31) + this.f23159f.hashCode();
    }

    public String toString() {
        String str = this.f23154a;
        String str2 = this.f23155b;
        EnumC10217b enumC10217b = this.f23156c;
        C10216a c10216a = this.f23157d;
        C10216a c10216a2 = this.f23158e;
        C10216a c10216a3 = this.f23159f;
        return "InfoIcon(imageUrl=" + str + ", clickthroughUrl=" + str2 + ", position=" + enumC10217b + ", margin=" + c10216a + ", padding=" + c10216a2 + ", size=" + c10216a3 + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.t6$a */
    /* loaded from: classes3.dex */
    public static final class C10216a {

        /* renamed from: a */
        public final double f23160a;

        /* renamed from: b */
        public final double f23161b;

        public C10216a(double d, double d2) {
            this.f23160a = d;
            this.f23161b = d2;
        }

        /* renamed from: a */
        public final double m80547a() {
            return this.f23161b;
        }

        /* renamed from: b */
        public final double m80546b() {
            return this.f23160a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10216a)) {
                return false;
            }
            C10216a c10216a = (C10216a) obj;
            if (Double.compare(this.f23160a, c10216a.f23160a) == 0 && Double.compare(this.f23161b, c10216a.f23161b) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Double.hashCode(this.f23160a) * 31) + Double.hashCode(this.f23161b);
        }

        public String toString() {
            double d = this.f23160a;
            double d2 = this.f23161b;
            return "DoubleSize(width=" + d + ", height=" + d2 + ")";
        }

        public /* synthetic */ C10216a(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
        }
    }

    public /* synthetic */ C10215t6(String str, String str2, EnumC10217b enumC10217b, C10216a c10216a, C10216a c10216a2, C10216a c10216a3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? EnumC10217b.f23163d : enumC10217b, (i & 8) != 0 ? new C10216a(0.0d, 0.0d, 3, null) : c10216a, (i & 16) != 0 ? new C10216a(0.0d, 0.0d, 3, null) : c10216a2, (i & 32) != 0 ? new C10216a(0.0d, 0.0d, 3, null) : c10216a3);
    }
}
