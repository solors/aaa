package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Quantiles {

    /* loaded from: classes4.dex */
    public static final class Scale {

        /* renamed from: a */
        private final int f41368a;

        public ScaleAndIndex index(int i) {
            return new ScaleAndIndex(this.f41368a, i);
        }

        public ScaleAndIndexes indexes(int... iArr) {
            return new ScaleAndIndexes(this.f41368a, (int[]) iArr.clone());
        }

        private Scale(int i) {
            Preconditions.checkArgument(i > 0, "Quantile scale must be positive");
            this.f41368a = i;
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
            return new ScaleAndIndexes(this.f41368a, Ints.toArray(collection));
        }
    }

    /* loaded from: classes4.dex */
    public static final class ScaleAndIndex {

        /* renamed from: a */
        private final int f41369a;

        /* renamed from: b */
        private final int f41370b;

        public double compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public double computeInPlace(double... dArr) {
            boolean z;
            if (dArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.m68140j(dArr)) {
                return Double.NaN;
            }
            long length = this.f41370b * (dArr.length - 1);
            int divide = (int) LongMath.divide(length, this.f41369a, RoundingMode.DOWN);
            int i = (int) (length - (divide * this.f41369a));
            Quantiles.m68133q(divide, dArr, 0, dArr.length - 1);
            if (i == 0) {
                return dArr[divide];
            }
            int i2 = divide + 1;
            Quantiles.m68133q(i2, dArr, i2, dArr.length - 1);
            return Quantiles.m68139k(dArr[divide], dArr[i2], i, this.f41369a);
        }

        private ScaleAndIndex(int i, int i2) {
            Quantiles.m68142h(i2, i);
            this.f41369a = i;
            this.f41370b = i2;
        }

        public double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public double compute(long... jArr) {
            return computeInPlace(Quantiles.m68137m(jArr));
        }

        public double compute(int... iArr) {
            return computeInPlace(Quantiles.m68138l(iArr));
        }
    }

    /* loaded from: classes4.dex */
    public static final class ScaleAndIndexes {

        /* renamed from: a */
        private final int f41371a;

        /* renamed from: b */
        private final int[] f41372b;

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
            boolean z;
            int[] iArr;
            int i = 0;
            if (dArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.m68140j(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr2 = this.f41372b;
                int length = iArr2.length;
                while (i < length) {
                    linkedHashMap.put(Integer.valueOf(iArr2[i]), Double.valueOf(Double.NaN));
                    i++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr3 = this.f41372b;
            int[] iArr4 = new int[iArr3.length];
            int[] iArr5 = new int[iArr3.length];
            int[] iArr6 = new int[iArr3.length * 2];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.f41372b.length) {
                    break;
                }
                long length2 = iArr[i2] * (dArr.length - 1);
                int divide = (int) LongMath.divide(length2, this.f41371a, RoundingMode.DOWN);
                int i4 = (int) (length2 - (divide * this.f41371a));
                iArr4[i2] = divide;
                iArr5[i2] = i4;
                iArr6[i3] = divide;
                i3++;
                if (i4 != 0) {
                    iArr6[i3] = divide + 1;
                    i3++;
                }
                i2++;
            }
            Arrays.sort(iArr6, 0, i3);
            Quantiles.m68134p(iArr6, 0, i3 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.f41372b;
                if (i < iArr7.length) {
                    int i5 = iArr4[i];
                    int i6 = iArr5[i];
                    if (i6 == 0) {
                        linkedHashMap2.put(Integer.valueOf(iArr7[i]), Double.valueOf(dArr[i5]));
                    } else {
                        linkedHashMap2.put(Integer.valueOf(iArr7[i]), Double.valueOf(Quantiles.m68139k(dArr[i5], dArr[i5 + 1], i6, this.f41371a)));
                    }
                    i++;
                } else {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
            }
        }

        private ScaleAndIndexes(int i, int[] iArr) {
            for (int i2 : iArr) {
                Quantiles.m68142h(i2, i);
            }
            Preconditions.checkArgument(iArr.length > 0, "Indexes must be a non empty array");
            this.f41371a = i;
            this.f41372b = iArr;
        }

        public Map<Integer, Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public Map<Integer, Double> compute(long... jArr) {
            return computeInPlace(Quantiles.m68137m(jArr));
        }

        public Map<Integer, Double> compute(int... iArr) {
            return computeInPlace(Quantiles.m68138l(iArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static void m68142h(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("Quantile indexes must be between 0 and the scale, which is ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: i */
    private static int m68141i(int[] iArr, int i, int i2, int i3, int i4) {
        if (i == i2) {
            return i;
        }
        int i5 = i3 + i4;
        int i6 = i5 >>> 1;
        while (i2 > i + 1) {
            int i7 = (i + i2) >>> 1;
            int i8 = iArr[i7];
            if (i8 > i6) {
                i2 = i7;
            } else if (i8 < i6) {
                i = i7;
            } else {
                return i7;
            }
        }
        if ((i5 - iArr[i]) - iArr[i2] > 0) {
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m68140j(double... dArr) {
        for (double d : dArr) {
            if (Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static double m68139k(double d, double d2, double d3, double d4) {
        if (d == Double.NEGATIVE_INFINITY) {
            if (d2 != Double.POSITIVE_INFINITY) {
                return Double.NEGATIVE_INFINITY;
            }
            return Double.NaN;
        } else if (d2 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else {
            return d + (((d2 - d) * d3) / d4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static double[] m68138l(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = iArr[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static double[] m68137m(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = jArr[i];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    /* renamed from: n */
    private static void m68136n(double[] dArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i3 = (i + i2) >>> 1;
        double d = dArr[i2];
        double d2 = dArr[i3];
        if (d < d2) {
            z = true;
        } else {
            z = false;
        }
        double d3 = dArr[i];
        if (d2 < d3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d >= d3) {
            z3 = false;
        }
        if (z == z2) {
            m68132r(dArr, i3, i);
        } else if (z != z3) {
            m68132r(dArr, i, i2);
        }
    }

    /* renamed from: o */
    private static int m68135o(double[] dArr, int i, int i2) {
        m68136n(dArr, i, i2);
        double d = dArr[i];
        int i3 = i2;
        while (i2 > i) {
            if (dArr[i2] > d) {
                m68132r(dArr, i3, i2);
                i3--;
            }
            i2--;
        }
        m68132r(dArr, i, i3);
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static void m68134p(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
        int m68141i = m68141i(iArr, i, i2, i3, i4);
        int i5 = iArr[m68141i];
        m68133q(i5, dArr, i3, i4);
        int i6 = m68141i - 1;
        while (i6 >= i && iArr[i6] == i5) {
            i6--;
        }
        if (i6 >= i) {
            m68134p(iArr, i, i6, dArr, i3, i5 - 1);
        }
        int i7 = m68141i + 1;
        while (i7 <= i2 && iArr[i7] == i5) {
            i7++;
        }
        if (i7 <= i2) {
            m68134p(iArr, i7, i2, dArr, i5 + 1, i4);
        }
    }

    public static Scale percentiles() {
        return scale(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m68133q(int i, double[] dArr, int i2, int i3) {
        if (i == i2) {
            int i4 = i2;
            for (int i5 = i2 + 1; i5 <= i3; i5++) {
                if (dArr[i4] > dArr[i5]) {
                    i4 = i5;
                }
            }
            if (i4 != i2) {
                m68132r(dArr, i4, i2);
                return;
            }
            return;
        }
        while (i3 > i2) {
            int m68135o = m68135o(dArr, i2, i3);
            if (m68135o >= i) {
                i3 = m68135o - 1;
            }
            if (m68135o <= i) {
                i2 = m68135o + 1;
            }
        }
    }

    public static Scale quartiles() {
        return scale(4);
    }

    /* renamed from: r */
    private static void m68132r(double[] dArr, int i, int i2) {
        double d = dArr[i];
        dArr[i] = dArr[i2];
        dArr[i2] = d;
    }

    public static Scale scale(int i) {
        return new Scale(i);
    }
}
