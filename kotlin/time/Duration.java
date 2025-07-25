package kotlin.time;

import androidx.exifinterface.media.ExifInterface;
import ee.DurationJvm;
import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37633f;
import kotlin.ranges._Ranges;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.time.b */
/* loaded from: classes7.dex */
public final class Duration implements Comparable<Duration> {
    @NotNull

    /* renamed from: c */
    public static final C37699a f99494c = new C37699a(null);

    /* renamed from: d */
    private static final long f99495d = m16491j(0);

    /* renamed from: f */
    private static final long f99496f = C37700c.m16469b(4611686018427387903L);

    /* renamed from: g */
    private static final long f99497g = C37700c.m16469b(-4611686018427387903L);

    /* renamed from: b */
    private final long f99498b;

    /* compiled from: Duration.kt */
    @Metadata
    /* renamed from: kotlin.time.b$a */
    /* loaded from: classes7.dex */
    public static final class C37699a {
        private C37699a() {
        }

        public /* synthetic */ C37699a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m16474a() {
            return Duration.f99496f;
        }

        /* renamed from: b */
        public final long m16473b() {
            return Duration.f99497g;
        }

        /* renamed from: c */
        public final long m16472c() {
            return Duration.f99495d;
        }

        /* renamed from: d */
        public final long m16471d(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return C37700c.m16463h(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }
    }

    private /* synthetic */ Duration(long j) {
        this.f99498b = j;
    }

    /* renamed from: A */
    private static final boolean m16512A(long j) {
        if ((((int) j) & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private static final boolean m16511B(long j) {
        if ((((int) j) & 1) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static final boolean m16510C(long j) {
        if (j != f99496f && j != f99497g) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static final boolean m16509D(long j) {
        if (j < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static final boolean m16508E(long j) {
        if (j > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static final long m16507F(long j, long j2) {
        if (m16510C(j)) {
            if (!m16475z(j2) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        } else if (m16510C(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long m16477x = m16477x(j) + m16477x(j2);
                if (m16511B(j)) {
                    return C37700c.m16466e(m16477x);
                }
                return C37700c.m16468c(m16477x);
            } else if (m16512A(j)) {
                return m16496e(j, m16477x(j), m16477x(j2));
            } else {
                return m16496e(j, m16477x(j2), m16477x(j));
            }
        }
    }

    /* renamed from: G */
    public static final double m16506G(long j, @NotNull DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f99496f) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f99497g) {
            return Double.NEGATIVE_INFINITY;
        }
        return C37701d.m16450a(m16477x(j), m16478w(j), unit);
    }

    /* renamed from: H */
    public static final int m16505H(long j, @NotNull DurationUnitJvm unit) {
        long m16906p;
        Intrinsics.checkNotNullParameter(unit, "unit");
        m16906p = _Ranges.m16906p(m16503J(j, unit), -2147483648L, 2147483647L);
        return (int) m16906p;
    }

    @NotNull
    /* renamed from: I */
    public static final String m16504I(long j) {
        boolean z;
        boolean z2;
        StringBuilder sb2 = new StringBuilder();
        if (m16509D(j)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long m16488m = m16488m(j);
        long m16485p = m16485p(m16488m);
        int m16481t = m16481t(m16488m);
        int m16479v = m16479v(m16488m);
        int m16480u = m16480u(m16488m);
        if (m16510C(j)) {
            m16485p = 9999999999999L;
        }
        boolean z3 = true;
        if (m16485p != 0) {
            z = true;
        } else {
            z = false;
        }
        if (m16479v == 0 && m16480u == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (m16481t == 0 && (!z2 || !z)) {
            z3 = false;
        }
        if (z) {
            sb2.append(m16485p);
            sb2.append('H');
        }
        if (z3) {
            sb2.append(m16481t);
            sb2.append('M');
        }
        if (z2 || (!z && !z3)) {
            m16495f(j, sb2, m16479v, m16480u, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: J */
    public static final long m16503J(long j, @NotNull DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f99496f) {
            return Long.MAX_VALUE;
        }
        if (j == f99497g) {
            return Long.MIN_VALUE;
        }
        return C37701d.m16449b(m16477x(j), m16478w(j), unit);
    }

    @NotNull
    /* renamed from: K */
    public static String m16502K(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == f99496f) {
            return "Infinity";
        }
        if (j == f99497g) {
            return "-Infinity";
        }
        boolean m16509D = m16509D(j);
        StringBuilder sb2 = new StringBuilder();
        if (m16509D) {
            sb2.append('-');
        }
        long m16488m = m16488m(j);
        long m16486o = m16486o(m16488m);
        int m16487n = m16487n(m16488m);
        int m16481t = m16481t(m16488m);
        int m16479v = m16479v(m16488m);
        int m16480u = m16480u(m16488m);
        int i = 0;
        if (m16486o != 0) {
            z = true;
        } else {
            z = false;
        }
        if (m16487n != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m16481t != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (m16479v == 0 && m16480u == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb2.append(m16486o);
            sb2.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(m16487n);
            sb2.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(m16481t);
            sb2.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            if (m16479v == 0 && !z && !z2 && !z3) {
                if (m16480u >= 1000000) {
                    m16495f(j, sb2, m16480u / 1000000, m16480u % 1000000, 6, "ms", false);
                } else if (m16480u >= 1000) {
                    m16495f(j, sb2, m16480u / 1000, m16480u % 1000, 3, "us", false);
                } else {
                    sb2.append(m16480u);
                    sb2.append("ns");
                }
            } else {
                m16495f(j, sb2, m16479v, m16480u, 9, "s", false);
            }
            i = i4;
        }
        if (m16509D && i > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: L */
    public static final long m16501L(long j) {
        return C37700c.m16470a(-m16477x(j), ((int) j) & 1);
    }

    /* renamed from: e */
    private static final long m16496e(long j, long j2, long j3) {
        long m16906p;
        long m16464g = C37700c.m16464g(j3);
        long j4 = j2 + m16464g;
        if (!new C37633f(-4611686018426L, 4611686018426L).m16945g(j4)) {
            m16906p = _Ranges.m16906p(j4, -4611686018427387903L, 4611686018427387903L);
            return C37700c.m16469b(m16906p);
        }
        return C37700c.m16467d(C37700c.m16465f(j4) + (j3 - C37700c.m16465f(m16464g)));
    }

    /* renamed from: f */
    private static final void m16495f(long j, StringBuilder sb2, int i, int i2, int i3, String str, boolean z) {
        String m16553p0;
        boolean z2;
        sb2.append(i);
        if (i2 != 0) {
            sb2.append('.');
            m16553p0 = C37690r.m16553p0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = m16553p0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (m16553p0.charAt(length) != '0') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb2.append((CharSequence) m16553p0, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) m16553p0, 0, ((i6 + 2) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: g */
    public static final /* synthetic */ Duration m16494g(long j) {
        return new Duration(j);
    }

    /* renamed from: i */
    public static int m16492i(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (m16509D(j)) {
                return -i;
            }
            return i;
        }
        return Intrinsics.m17070k(j, j2);
    }

    /* renamed from: j */
    public static long m16491j(long j) {
        if (DurationJvm.m25158a()) {
            if (m16511B(j)) {
                if (!new C37633f(-4611686018426999999L, 4611686018426999999L).m16945g(m16477x(j))) {
                    throw new AssertionError(m16477x(j) + " ns is out of nanoseconds range");
                }
            } else if (new C37633f(-4611686018427387903L, 4611686018427387903L).m16945g(m16477x(j))) {
                if (new C37633f(-4611686018426L, 4611686018426L).m16945g(m16477x(j))) {
                    throw new AssertionError(m16477x(j) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(m16477x(j) + " ms is out of milliseconds range");
            }
        }
        return j;
    }

    /* renamed from: k */
    public static boolean m16490k(long j, Object obj) {
        if (!(obj instanceof Duration) || j != ((Duration) obj).m16500M()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final boolean m16489l(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final long m16488m(long j) {
        if (m16509D(j)) {
            return m16501L(j);
        }
        return j;
    }

    /* renamed from: n */
    public static final int m16487n(long j) {
        if (m16510C(j)) {
            return 0;
        }
        return (int) (m16485p(j) % 24);
    }

    /* renamed from: o */
    public static final long m16486o(long j) {
        return m16503J(j, DurationUnitJvm.f90133j);
    }

    /* renamed from: p */
    public static final long m16485p(long j) {
        return m16503J(j, DurationUnitJvm.f90132i);
    }

    /* renamed from: q */
    public static final long m16484q(long j) {
        if (m16512A(j) && m16475z(j)) {
            return m16477x(j);
        }
        return m16503J(j, DurationUnitJvm.f90129f);
    }

    /* renamed from: r */
    public static final long m16483r(long j) {
        return m16503J(j, DurationUnitJvm.f90131h);
    }

    /* renamed from: s */
    public static final long m16482s(long j) {
        return m16503J(j, DurationUnitJvm.f90130g);
    }

    /* renamed from: t */
    public static final int m16481t(long j) {
        if (m16510C(j)) {
            return 0;
        }
        return (int) (m16483r(j) % 60);
    }

    /* renamed from: u */
    public static final int m16480u(long j) {
        long m16477x;
        if (m16510C(j)) {
            return 0;
        }
        if (m16512A(j)) {
            m16477x = C37700c.m16465f(m16477x(j) % 1000);
        } else {
            m16477x = m16477x(j) % 1000000000;
        }
        return (int) m16477x;
    }

    /* renamed from: v */
    public static final int m16479v(long j) {
        if (m16510C(j)) {
            return 0;
        }
        return (int) (m16482s(j) % 60);
    }

    /* renamed from: w */
    private static final DurationUnitJvm m16478w(long j) {
        if (m16511B(j)) {
            return DurationUnitJvm.f90127c;
        }
        return DurationUnitJvm.f90129f;
    }

    /* renamed from: x */
    private static final long m16477x(long j) {
        return j >> 1;
    }

    /* renamed from: y */
    public static int m16476y(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: z */
    public static final boolean m16475z(long j) {
        return !m16510C(j);
    }

    /* renamed from: M */
    public final /* synthetic */ long m16500M() {
        return this.f99498b;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m16493h(duration.m16500M());
    }

    public boolean equals(Object obj) {
        return m16490k(this.f99498b, obj);
    }

    /* renamed from: h */
    public int m16493h(long j) {
        return m16492i(this.f99498b, j);
    }

    public int hashCode() {
        return m16476y(this.f99498b);
    }

    @NotNull
    public String toString() {
        return m16502K(this.f99498b);
    }
}
