package p1001ud;

import kotlin.Metadata;

@Metadata
/* renamed from: ud.c */
/* loaded from: classes7.dex */
public final class progressionUtil {
    /* renamed from: a */
    private static final int m2864a(int i, int i2, int i3) {
        return m2860e(m2860e(i, i3) - m2860e(i2, i3), i3);
    }

    /* renamed from: b */
    private static final long m2863b(long j, long j2, long j3) {
        return m2859f(m2859f(j, j3) - m2859f(j2, j3), j3);
    }

    /* renamed from: c */
    public static final int m2862c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - m2864a(i2, i, i3);
            }
            return i2;
        } else if (i3 < 0) {
            if (i > i2) {
                return i2 + m2864a(i, i2, -i3);
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: d */
    public static final long m2861d(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            if (j < j2) {
                return j2 - m2863b(j2, j, j3);
            }
            return j2;
        } else if (i < 0) {
            if (j > j2) {
                return j2 + m2863b(j, j2, -j3);
            }
            return j2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: e */
    private static final int m2860e(int i, int i2) {
        int i3 = i % i2;
        if (i3 < 0) {
            return i3 + i2;
        }
        return i3;
    }

    /* renamed from: f */
    private static final long m2859f(long j, long j2) {
        long j3 = j % j2;
        if (j3 < 0) {
            return j3 + j2;
        }
        return j3;
    }
}
