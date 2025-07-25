package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Random.kt */
@Metadata
/* renamed from: kotlin.random.d */
/* loaded from: classes7.dex */
public final class C37623d {
    @NotNull
    /* renamed from: a */
    public static final String m16975a(@NotNull Object from, @NotNull Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    /* renamed from: b */
    public static final void m16974b(int i, int i2) {
        boolean z;
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(m16975a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
    }

    /* renamed from: c */
    public static final void m16973c(long j, long j2) {
        boolean z;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(m16975a(Long.valueOf(j), Long.valueOf(j2)).toString());
    }

    /* renamed from: d */
    public static final int m16972d(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: e */
    public static final int m16971e(@NotNull Random random, @NotNull PrimitiveRanges range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (range.m16952d() < Integer.MAX_VALUE) {
                return random.mo16979e(range.m16953c(), range.m16952d() + 1);
            }
            if (range.m16953c() > Integer.MIN_VALUE) {
                return random.mo16979e(range.m16953c() - 1, range.m16952d()) + 1;
            }
            return random.mo16981c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    /* renamed from: f */
    public static final int m16970f(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
