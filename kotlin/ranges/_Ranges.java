package kotlin.ranges;

import de.InterfaceC32867c;
import de.Ranges;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.C37623d;
import kotlin.random.Random;
import kotlin.ranges.C37629d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.ranges.i */
/* loaded from: classes7.dex */
public class _Ranges extends C37636h {
    /* renamed from: c */
    public static double m16919c(double d, double d2) {
        if (d < d2) {
            return d2;
        }
        return d;
    }

    /* renamed from: d */
    public static float m16918d(float f, float f2) {
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: e */
    public static int m16917e(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: f */
    public static long m16916f(long j, long j2) {
        if (j < j2) {
            return j2;
        }
        return j;
    }

    @NotNull
    /* renamed from: g */
    public static <T extends Comparable<? super T>> T m16915g(@NotNull T t, @NotNull T minimumValue) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        if (t.compareTo(minimumValue) < 0) {
            return minimumValue;
        }
        return t;
    }

    /* renamed from: h */
    public static double m16914h(double d, double d2) {
        if (d > d2) {
            return d2;
        }
        return d;
    }

    /* renamed from: i */
    public static float m16913i(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: j */
    public static int m16912j(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: k */
    public static long m16911k(long j, long j2) {
        if (j > j2) {
            return j2;
        }
        return j;
    }

    /* renamed from: l */
    public static double m16910l(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* renamed from: m */
    public static float m16909m(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* renamed from: n */
    public static int m16908n(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: o */
    public static int m16907o(int i, @NotNull InterfaceC32867c<Integer> range) {
        Comparable m16905q;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof Ranges) {
            m16905q = m16905q(Integer.valueOf(i), (Ranges) range);
            return ((Number) m16905q).intValue();
        } else if (!range.isEmpty()) {
            if (i < range.getStart().intValue()) {
                return range.getStart().intValue();
            }
            if (i > range.getEndInclusive().intValue()) {
                return range.getEndInclusive().intValue();
            }
            return i;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
    }

    /* renamed from: p */
    public static long m16906p(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    @NotNull
    /* renamed from: q */
    public static <T extends Comparable<? super T>> T m16905q(@NotNull T t, @NotNull Ranges<T> range) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (range.mo16958a(t, range.getStart()) && !range.mo16958a(range.getStart(), t)) {
                return range.getStart();
            }
            if (range.mo16958a(range.getEndInclusive(), t) && !range.mo16958a(t, range.getEndInclusive())) {
                return range.getEndInclusive();
            }
            return t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    /* renamed from: r */
    public static C37629d m16904r(int i, int i2) {
        return C37629d.f99357f.m16949a(i, i2, -1);
    }

    /* renamed from: s */
    public static int m16903s(@NotNull PrimitiveRanges primitiveRanges, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(primitiveRanges, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return C37623d.m16971e(random, primitiveRanges);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @NotNull
    /* renamed from: t */
    public static C37629d m16902t(@NotNull C37629d c37629d) {
        Intrinsics.checkNotNullParameter(c37629d, "<this>");
        return C37629d.f99357f.m16949a(c37629d.m16952d(), c37629d.m16953c(), -c37629d.m16951f());
    }

    @NotNull
    /* renamed from: u */
    public static C37629d m16901u(@NotNull C37629d c37629d, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(c37629d, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C37636h.m16921a(z, Integer.valueOf(i));
        C37629d.C37630a c37630a = C37629d.f99357f;
        int m16953c = c37629d.m16953c();
        int m16952d = c37629d.m16952d();
        if (c37629d.m16951f() <= 0) {
            i = -i;
        }
        return c37630a.m16949a(m16953c, m16952d, i);
    }

    @NotNull
    /* renamed from: v */
    public static PrimitiveRanges m16900v(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return PrimitiveRanges.f99347g.m16965a();
        }
        return new PrimitiveRanges(i, i2 - 1);
    }
}
