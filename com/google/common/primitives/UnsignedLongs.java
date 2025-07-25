package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
/* loaded from: classes4.dex */
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    /* loaded from: classes4.dex */
    enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                long j = jArr[i];
                long j2 = jArr2[i];
                if (j != j2) {
                    return UnsignedLongs.compare(j, j2);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ParseOverflowDetection {

        /* renamed from: a */
        static final long[] f41507a = new long[37];

        /* renamed from: b */
        static final int[] f41508b = new int[37];

        /* renamed from: c */
        static final int[] f41509c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = i;
                f41507a[i] = UnsignedLongs.divide(-1L, j);
                f41508b[i] = (int) UnsignedLongs.remainder(-1L, j);
                f41509c[i] = bigInteger.toString(i).length() - 1;
            }
        }

        private ParseOverflowDetection() {
        }

        /* renamed from: a */
        static boolean m67953a(long j, int i, int i2) {
            if (j < 0) {
                return true;
            }
            long j2 = f41507a[i2];
            if (j < j2) {
                return false;
            }
            if (j > j2 || i > f41508b[i2]) {
                return true;
            }
            return false;
        }
    }

    private UnsignedLongs() {
    }

    /* renamed from: a */
    private static long m67955a(long j) {
        return j ^ Long.MIN_VALUE;
    }

    public static int compare(long j, long j2) {
        return Longs.compare(m67955a(j), m67955a(j2));
    }

    @CanIgnoreReturnValue
    public static long decode(String str) {
        String str2;
        ParseRequest m67976a = ParseRequest.m67976a(str);
        try {
            return parseUnsignedLong(m67976a.f41486a, m67976a.f41487b);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Error parsing value: ".concat(valueOf);
            } else {
                str2 = new String("Error parsing value: ");
            }
            NumberFormatException numberFormatException = new NumberFormatException(str2);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public static long divide(long j, long j2) {
        if (j2 < 0) {
            if (compare(j, j2) < 0) {
                return 0L;
            }
            return 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            if (compare(j - (j3 * j2), j2) < 0) {
                i = 0;
            }
            return j3 + i;
        }
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 5);
        sb2.append(toString(jArr[0]));
        for (int i = 1; i < jArr.length; i++) {
            sb2.append(str);
            sb2.append(toString(jArr[i]));
        }
        return sb2.toString();
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        long m67955a = m67955a(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long m67955a2 = m67955a(jArr[i]);
            if (m67955a2 > m67955a) {
                m67955a = m67955a2;
            }
        }
        return m67955a(m67955a);
    }

    public static long min(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        long m67955a = m67955a(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long m67955a2 = m67955a(jArr[i]);
            if (m67955a2 < m67955a) {
                m67955a = m67955a2;
            }
        }
        return m67955a(m67955a);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    public static long remainder(long j, long j2) {
        if (j2 < 0) {
            if (compare(j, j2) < 0) {
                return j;
            }
            return j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (compare(j3, j2) < 0) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }

    public static void sort(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static String toString(long j) {
        return toString(j, 10);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str, int i) {
        Preconditions.checkNotNull(str);
        if (str.length() != 0) {
            if (i >= 2 && i <= 36) {
                int i2 = ParseOverflowDetection.f41509c[i] - 1;
                long j = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    int digit = Character.digit(str.charAt(i3), i);
                    if (digit != -1) {
                        if (i3 > i2 && ParseOverflowDetection.m67953a(j, digit, i)) {
                            throw new NumberFormatException(str.length() != 0 ? "Too large for unsigned long: ".concat(str) : new String("Too large for unsigned long: "));
                        }
                        j = (j * i) + digit;
                    } else {
                        throw new NumberFormatException(str);
                    }
                }
                return j;
            }
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("illegal radix: ");
            sb2.append(i);
            throw new NumberFormatException(sb2.toString());
        }
        throw new NumberFormatException("empty string");
    }

    public static String toString(long j, int i) {
        long divide;
        Preconditions.checkArgument(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                divide = (j >>> 1) / (i >>> 1);
            } else {
                divide = divide(j, i);
            }
            long j2 = i;
            int i5 = 63;
            cArr[63] = Character.forDigit((int) (j - (divide * j2)), i);
            while (divide > 0) {
                i5--;
                cArr[i5] = Character.forDigit((int) (divide % j2), i);
                divide /= j2;
            }
            i3 = i5;
        }
        return new String(cArr, i3, 64 - i3);
    }

    public static void sort(long[] jArr, int i, int i2) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i, i2, jArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            jArr[i3] = m67955a(jArr[i3]);
        }
        Arrays.sort(jArr, i, i2);
        while (i < i2) {
            jArr[i] = m67955a(jArr[i]);
            i++;
        }
    }

    public static void sortDescending(long[] jArr, int i, int i2) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i, i2, jArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            jArr[i3] = Long.MAX_VALUE ^ jArr[i3];
        }
        Arrays.sort(jArr, i, i2);
        while (i < i2) {
            jArr[i] = jArr[i] ^ Long.MAX_VALUE;
            i++;
        }
    }
}
