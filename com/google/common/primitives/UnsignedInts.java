package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
/* loaded from: classes4.dex */
public final class UnsignedInts {

    /* loaded from: classes4.dex */
    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                if (i2 != i3) {
                    return UnsignedInts.compare(i2, i3);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private UnsignedInts() {
    }

    /* renamed from: a */
    static int m67957a(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static int checkedCast(long j) {
        boolean z;
        if ((j >> 32) == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "out of range: %s", j);
        return (int) j;
    }

    public static int compare(int i, int i2) {
        return Ints.compare(m67957a(i), m67957a(i2));
    }

    @CanIgnoreReturnValue
    public static int decode(String str) {
        String str2;
        ParseRequest m67976a = ParseRequest.m67976a(str);
        try {
            return parseUnsignedInt(m67976a.f41486a, m67976a.f41487b);
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

    public static int divide(int i, int i2) {
        return (int) (toLong(i) / toLong(i2));
    }

    public static String join(String str, int... iArr) {
        Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(toString(iArr[0]));
        for (int i = 1; i < iArr.length; i++) {
            sb2.append(str);
            sb2.append(toString(iArr[i]));
        }
        return sb2.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static int max(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int m67957a = m67957a(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int m67957a2 = m67957a(iArr[i]);
            if (m67957a2 > m67957a) {
                m67957a = m67957a2;
            }
        }
        return m67957a(m67957a);
    }

    public static int min(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int m67957a = m67957a(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int m67957a2 = m67957a(iArr[i]);
            if (m67957a2 < m67957a) {
                m67957a = m67957a2;
            }
        }
        return m67957a(m67957a);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str) {
        return parseUnsignedInt(str, 10);
    }

    public static int remainder(int i, int i2) {
        return (int) (toLong(i) % toLong(i2));
    }

    public static int saturatedCast(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 4294967296L) {
            return -1;
        }
        return (int) j;
    }

    public static void sort(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sort(iArr, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static long toLong(int i) {
        return i & 4294967295L;
    }

    public static String toString(int i) {
        return toString(i, 10);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str, int i) {
        Preconditions.checkNotNull(str);
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 69);
        sb2.append("Input ");
        sb2.append(str);
        sb2.append(" in base ");
        sb2.append(i);
        sb2.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb2.toString());
    }

    public static String toString(int i, int i2) {
        return Long.toString(i & 4294967295L, i2);
    }

    public static void sort(int[] iArr, int i, int i2) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i, i2, iArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            iArr[i3] = m67957a(iArr[i3]);
        }
        Arrays.sort(iArr, i, i2);
        while (i < i2) {
            iArr[i] = m67957a(iArr[i]);
            i++;
        }
    }

    public static void sortDescending(int[] iArr, int i, int i2) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i, i2, iArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            iArr[i3] = Integer.MAX_VALUE ^ iArr[i3];
        }
        Arrays.sort(iArr, i, i2);
        while (i < i2) {
            iArr[i] = iArr[i] ^ Integer.MAX_VALUE;
            i++;
        }
    }
}
