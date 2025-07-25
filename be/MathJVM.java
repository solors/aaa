package be;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: be.c */
/* loaded from: classes7.dex */
public class MathJVM extends MathH {
    /* renamed from: a */
    public static int m103794a(int i) {
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m103793b(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m103792c(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: d */
    public static int m103791d(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: e */
    public static long m103790e(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: f */
    public static long m103789f(float f) {
        long m103790e;
        m103790e = m103790e(f);
        return m103790e;
    }
}
