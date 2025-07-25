package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25018a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C25030g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C25039n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C25044s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.EnumC25036k;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i */
/* loaded from: classes7.dex */
public final class C24956i {
    @NotNull

    /* renamed from: a */
    public static final Comparator<AbstractC25018a0> f64543a = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C24956i.m45416c((AbstractC25018a0) obj, (AbstractC25018a0) obj2);
        }
    };
    @NotNull

    /* renamed from: b */
    public static final Comparator<C25039n> f64544b = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C24956i.m45418a((C25039n) obj, (C25039n) obj2);
        }
    };

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i$a */
    /* loaded from: classes7.dex */
    public static final class C24957a extends Lambda implements Function1<AbstractC25018a0, Boolean> {

        /* renamed from: g */
        public static final C24957a f64545g = new C24957a();

        public C24957a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Boolean invoke(@NotNull AbstractC25018a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof AbstractC25018a0.C25021c);
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i$b */
    /* loaded from: classes7.dex */
    public static final class C24958b extends Lambda implements Function1<Tuples<? extends Boolean, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C37607l0 f64546g;

        /* renamed from: h */
        public final /* synthetic */ C37607l0 f64547h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24958b(C37607l0 c37607l0, C37607l0 c37607l02) {
            super(1);
            this.f64546g = c37607l0;
            this.f64547h = c37607l02;
        }

        /* renamed from: a */
        public final void m45395a(@NotNull Tuples<Boolean, Boolean> tuples) {
            Intrinsics.checkNotNullParameter(tuples, "<name for destructuring parameter 0>");
            boolean booleanValue = tuples.m17632a().booleanValue();
            boolean booleanValue2 = tuples.m17631b().booleanValue();
            if (booleanValue) {
                this.f64546g.f99325b++;
            }
            if (booleanValue2) {
                this.f64547h.f99325b++;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Tuples<? extends Boolean, ? extends Boolean> tuples) {
            m45395a(tuples);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i$c */
    /* loaded from: classes7.dex */
    public static final class C24959c extends Lambda implements Function1<Tuples<? extends Boolean, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C37607l0 f64548g;

        /* renamed from: h */
        public final /* synthetic */ C37607l0 f64549h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24959c(C37607l0 c37607l0, C37607l0 c37607l02) {
            super(1);
            this.f64548g = c37607l0;
            this.f64549h = c37607l02;
        }

        /* renamed from: a */
        public final void m45394a(@NotNull Tuples<Boolean, Boolean> tuples) {
            Intrinsics.checkNotNullParameter(tuples, "<name for destructuring parameter 0>");
            boolean booleanValue = tuples.m17632a().booleanValue();
            boolean booleanValue2 = tuples.m17631b().booleanValue();
            if (booleanValue) {
                this.f64548g.f99325b++;
            }
            if (booleanValue2) {
                this.f64549h.f99325b++;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Tuples<? extends Boolean, ? extends Boolean> tuples) {
            m45394a(tuples);
            return Unit.f99208a;
        }
    }

    /* renamed from: a */
    public static final int m45418a(C25039n c25039n, C25039n c25039n2) {
        return f64543a.compare(c25039n.m45244f(), c25039n2.m45244f());
    }

    /* renamed from: b */
    public static final int m45417b(AbstractC25018a0 abstractC25018a0) {
        if (abstractC25018a0 instanceof AbstractC25018a0.C25019a) {
            return 4;
        }
        if (abstractC25018a0 instanceof AbstractC25018a0.C25021c) {
            if (((AbstractC25018a0.C25021c) abstractC25018a0).m45275a().m45218a() == EnumC25036k.JS) {
                return 3;
            }
            return 2;
        } else if (abstractC25018a0 instanceof AbstractC25018a0.C25020b) {
            return 1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public static final int m45416c(AbstractC25018a0 vr1, AbstractC25018a0 vr2) {
        Intrinsics.checkNotNullExpressionValue(vr2, "vr2");
        int m45417b = m45417b(vr2);
        Intrinsics.checkNotNullExpressionValue(vr1, "vr1");
        return Intrinsics.m17071j(m45417b, m45417b(vr1));
    }

    /* renamed from: d */
    public static final Double m45415d(C25044s c25044s, double d, Long l) {
        Double m45414e = m45414e(c25044s, l);
        if (m45414e != null) {
            return Double.valueOf(m45414e.doubleValue() - d);
        }
        return null;
    }

    /* renamed from: e */
    public static final Double m45414e(C25044s c25044s, Long l) {
        Double d;
        if (l == null) {
            return null;
        }
        if (c25044s.m45228b() != null) {
            d = Double.valueOf(c25044s.m45228b().intValue());
        } else if (c25044s.m45226d() != null && c25044s.m45224f() != null) {
            d = Double.valueOf((c25044s.m45226d().intValue() - c25044s.m45224f().intValue()) / 2.0d);
        } else {
            d = null;
        }
        if (d == null) {
            return null;
        }
        return Double.valueOf((d.doubleValue() / 8192) * (l.longValue() / 1000.0d));
    }

    /* renamed from: f */
    public static final Double m45413f(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num != null && num.intValue() != 0 && num2 != null && num2.intValue() != 0 && num3 != null && num3.intValue() != 0 && num4 != null && num4.intValue() != 0) {
            return Double.valueOf((num.intValue() * num2.intValue()) - (num3.intValue() * num4.intValue()));
        }
        return null;
    }

    @NotNull
    /* renamed from: g */
    public static final Comparator<C25039n> m45412g() {
        return f64544b;
    }

    @NotNull
    /* renamed from: h */
    public static final Comparator<C25044s> m45411h(double d, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2) {
        return new C24920b(d, l, num, num2);
    }

    @NotNull
    /* renamed from: i */
    public static final Comparator<C25030g> m45410i(@Nullable Integer num, @Nullable Integer num2) {
        return new C24919a(num, num2);
    }

    /* renamed from: j */
    public static final Tuples<Boolean, Boolean> m45409j(C25030g c25030g, C25030g c25030g2) {
        Object obj;
        Object obj2;
        boolean z;
        C24957a c24957a = C24957a.f64545g;
        Iterator<T> it = c25030g.m45260e().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (c24957a.invoke(obj2).booleanValue()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        boolean z2 = true;
        if (obj2 != null) {
            z = true;
        } else {
            z = false;
        }
        Iterator<T> it2 = c25030g2.m45260e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (c24957a.invoke(next).booleanValue()) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            z2 = false;
        }
        return C38513v.m14532a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: l */
    public static final Tuples<Boolean, Boolean> m45407l(C25044s c25044s, C25044s c25044s2, double d, Long l) {
        return m45404o(m45415d(c25044s, d, l), m45415d(c25044s2, d, l));
    }

    /* renamed from: n */
    public static final Tuples<Boolean, Boolean> m45405n(C25044s c25044s, C25044s c25044s2, Integer num, Integer num2) {
        return m45404o(m45413f(c25044s.m45222h(), c25044s.m45227c(), num, num2), m45413f(c25044s2.m45222h(), c25044s2.m45227c(), num, num2));
    }

    /* renamed from: o */
    public static final Tuples<Boolean, Boolean> m45404o(Double d, Double d2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (d != null && d2 != null) {
            if (Intrinsics.m17078c(d, d2)) {
                Boolean bool = Boolean.TRUE;
                return C38513v.m14532a(bool, bool);
            } else if (Math.abs(d.doubleValue()) == Math.abs(d2.doubleValue())) {
                if (d.doubleValue() < 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                if (d2.doubleValue() >= 0.0d) {
                    z3 = false;
                }
                return C38513v.m14532a(valueOf, Boolean.valueOf(z3));
            } else if (Double.compare(Math.abs(d.doubleValue()), Math.abs(d2.doubleValue())) < 0) {
                return C38513v.m14532a(Boolean.TRUE, Boolean.FALSE);
            } else {
                return C38513v.m14532a(Boolean.FALSE, Boolean.TRUE);
            }
        }
        if (d != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        if (d2 == null) {
            z3 = false;
        }
        return C38513v.m14532a(valueOf2, Boolean.valueOf(z3));
    }

    /* renamed from: p */
    public static final Double m45403p(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num != null && num.intValue() != 0 && num2 != null && num2.intValue() != 0 && num3 != null && num3.intValue() != 0 && num4 != null && num4.intValue() != 0) {
            return Double.valueOf((num.intValue() / num2.intValue()) - (num3.intValue() / num4.intValue()));
        }
        return null;
    }

    @NotNull
    /* renamed from: q */
    public static final Comparator<AbstractC25018a0> m45402q() {
        return f64543a;
    }

    /* renamed from: r */
    public static final Tuples<Boolean, Boolean> m45401r(C25030g c25030g, C25030g c25030g2, Integer num, Integer num2) {
        return m45404o(m45413f(c25030g.m45259f(), c25030g.m45261d(), num, num2), m45413f(c25030g2.m45259f(), c25030g2.m45261d(), num, num2));
    }

    /* renamed from: s */
    public static final Tuples<Integer, Integer> m45400s(C25044s c25044s, C25044s c25044s2, double d, Long l, Integer num, Integer num2) {
        C37607l0 c37607l0 = new C37607l0();
        C37607l0 c37607l02 = new C37607l0();
        C24959c c24959c = new C24959c(c37607l0, c37607l02);
        c24959c.invoke(m45405n(c25044s, c25044s2, num, num2));
        c24959c.invoke(m45399t(c25044s, c25044s2, num, num2));
        c24959c.invoke(m45407l(c25044s, c25044s2, d, l));
        return C38513v.m14532a(Integer.valueOf(c37607l0.f99325b), Integer.valueOf(c37607l02.f99325b));
    }

    /* renamed from: t */
    public static final Tuples<Boolean, Boolean> m45399t(C25044s c25044s, C25044s c25044s2, Integer num, Integer num2) {
        return m45404o(m45403p(c25044s.m45222h(), c25044s.m45227c(), num, num2), m45403p(c25044s2.m45222h(), c25044s2.m45227c(), num, num2));
    }

    /* renamed from: u */
    public static final Tuples<Boolean, Boolean> m45398u(C25030g c25030g, C25030g c25030g2, Integer num, Integer num2) {
        return m45404o(m45403p(c25030g.m45259f(), c25030g.m45261d(), num, num2), m45403p(c25030g2.m45259f(), c25030g2.m45261d(), num, num2));
    }

    /* renamed from: v */
    public static final Tuples<Integer, Integer> m45397v(C25030g c25030g, C25030g c25030g2, Integer num, Integer num2) {
        C37607l0 c37607l0 = new C37607l0();
        C37607l0 c37607l02 = new C37607l0();
        C24958b c24958b = new C24958b(c37607l0, c37607l02);
        c24958b.invoke(m45401r(c25030g, c25030g2, num, num2));
        c24958b.invoke(m45398u(c25030g, c25030g2, num, num2));
        c24958b.invoke(m45409j(c25030g, c25030g2));
        return C38513v.m14532a(Integer.valueOf(c37607l0.f99325b), Integer.valueOf(c37607l02.f99325b));
    }
}
