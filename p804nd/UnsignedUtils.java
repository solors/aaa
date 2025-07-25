package p804nd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharJVM;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: nd.h0 */
/* loaded from: classes5.dex */
public final class UnsignedUtils {
    /* renamed from: a */
    public static final int m14564a(double d) {
        if (Double.isNaN(d) || d <= m14562c(0)) {
            return 0;
        }
        if (d >= m14562c(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return UInt.m14507c((int) d);
        }
        return UInt.m14507c(UInt.m14507c((int) (d - Integer.MAX_VALUE)) + UInt.m14507c(Integer.MAX_VALUE));
    }

    /* renamed from: b */
    public static final int m14563b(int i, int i2) {
        return Intrinsics.m17071j(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public static final double m14562c(int i) {
        return (Integer.MAX_VALUE & i) + (((i >>> 31) << 30) * 2);
    }

    /* renamed from: d */
    public static final int m14561d(long j, long j2) {
        return Intrinsics.m17070k(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: e */
    public static final double m14560e(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @NotNull
    /* renamed from: f */
    public static final String m14559f(long j) {
        return m14558g(j, 10);
    }

    @NotNull
    /* renamed from: g */
    public static final String m14558g(long j, int i) {
        int checkRadix;
        int checkRadix2;
        int checkRadix3;
        if (j >= 0) {
            checkRadix3 = CharJVM.checkRadix(i);
            String l = Long.toString(j, checkRadix3);
            Intrinsics.checkNotNullExpressionValue(l, "toString(...)");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb2 = new StringBuilder();
        checkRadix = CharJVM.checkRadix(i);
        String l2 = Long.toString(j3, checkRadix);
        Intrinsics.checkNotNullExpressionValue(l2, "toString(...)");
        sb2.append(l2);
        checkRadix2 = CharJVM.checkRadix(i);
        String l3 = Long.toString(j4, checkRadix2);
        Intrinsics.checkNotNullExpressionValue(l3, "toString(...)");
        sb2.append(l3);
        return sb2.toString();
    }
}
