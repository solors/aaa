package kotlin.time;

import be.MathJVM;
import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37633f;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Duration.kt */
@Metadata
/* renamed from: kotlin.time.c */
/* loaded from: classes7.dex */
public final class C37700c {
    /* renamed from: i */
    public static final long m16462i(long j, int i) {
        return Duration.m16491j((j << 1) + i);
    }

    /* renamed from: j */
    public static final long m16461j(long j) {
        return Duration.m16491j((j << 1) + 1);
    }

    /* renamed from: k */
    public static final long m16460k(long j) {
        long m16906p;
        if (!new C37633f(-4611686018426L, 4611686018426L).m16945g(j)) {
            m16906p = _Ranges.m16906p(j, -4611686018427387903L, 4611686018427387903L);
            return m16461j(m16906p);
        }
        return m16459l(m16457n(j));
    }

    /* renamed from: l */
    public static final long m16459l(long j) {
        return Duration.m16491j(j << 1);
    }

    /* renamed from: m */
    public static final long m16458m(long j) {
        if (new C37633f(-4611686018426999999L, 4611686018426999999L).m16945g(j)) {
            return m16459l(j);
        }
        return m16461j(m16456o(j));
    }

    /* renamed from: n */
    public static final long m16457n(long j) {
        return j * 1000000;
    }

    /* renamed from: o */
    public static final long m16456o(long j) {
        return j / 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:389:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0094 A[LOOP:1: B:404:0x006c->B:415:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x009e A[EDGE_INSN: B:538:0x009e->B:417:0x009e ?: BREAK  , SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long m16455p(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.C37700c.m16455p(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0076  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final long m16454q(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L18
            java.lang.String r5 = "+-"
            char r6 = r9.charAt(r4)
            boolean r5 = kotlin.text.C37686h.m16708Q(r5, r6, r4, r2, r1)
            if (r5 == 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r4
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6e
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r6 = kotlin.text.C37686h.m16699Y(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L36
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L36
        L34:
            r0 = r3
            goto L5b
        L36:
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34
            r5 = r0
            kotlin.collections.k0 r5 = (kotlin.collections.PrimitiveIterators) r5
            int r5 = r5.nextInt()
            kotlin.ranges.b r6 = new kotlin.ranges.b
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.m16961g(r5)
            if (r5 != 0) goto L3a
            r0 = r4
        L5b:
            if (r0 == 0) goto L6e
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L68
            r0 = -9223372036854775808
            goto L6d
        L68:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6d:
            return r0
        L6e:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.C37686h.m16713M(r9, r0, r4, r2, r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = kotlin.text.C37686h.m16685g1(r9, r3)
        L7a:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.C37700c.m16454q(java.lang.String):long");
    }

    /* renamed from: r */
    public static final long m16453r(double d, @NotNull DurationUnitJvm unit) {
        long m103790e;
        long m103790e2;
        Intrinsics.checkNotNullParameter(unit, "unit");
        double m16450a = C37701d.m16450a(d, unit, DurationUnitJvm.f90127c);
        if (!Double.isNaN(m16450a)) {
            m103790e = MathJVM.m103790e(m16450a);
            if (!new C37633f(-4611686018426999999L, 4611686018426999999L).m16945g(m103790e)) {
                m103790e2 = MathJVM.m103790e(C37701d.m16450a(d, unit, DurationUnitJvm.f90129f));
                return m16460k(m103790e2);
            }
            return m16459l(m103790e);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    /* renamed from: s */
    public static final long m16452s(int i, @NotNull DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnitJvm.f90130g) <= 0) {
            return m16459l(C37701d.m16448c(i, unit, DurationUnitJvm.f90127c));
        }
        return m16451t(i, unit);
    }

    /* renamed from: t */
    public static final long m16451t(long j, @NotNull DurationUnitJvm unit) {
        long m16906p;
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.f90127c;
        long m16448c = C37701d.m16448c(4611686018426999999L, durationUnitJvm, unit);
        if (!new C37633f(-m16448c, m16448c).m16945g(j)) {
            m16906p = _Ranges.m16906p(C37701d.m16449b(j, unit, DurationUnitJvm.f90129f), -4611686018427387903L, 4611686018427387903L);
            return m16461j(m16906p);
        }
        return m16459l(C37701d.m16448c(j, unit, durationUnitJvm));
    }
}
