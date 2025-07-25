package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class AsciiDigits {

        /* renamed from: a */
        private static final byte[] f41480a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            f41480a = bArr;
        }

        private AsciiDigits() {
        }

        /* renamed from: a */
        static int m67981a(char c) {
            if (c < 128) {
                return f41480a[c];
            }
            return -1;
        }
    }

    /* loaded from: classes4.dex */
    private enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Longs.compare(jArr[i], jArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    @GwtCompatible
    /* loaded from: classes4.dex */
    private static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: b */
        final long[] f41482b;

        /* renamed from: c */
        final int f41483c;

        /* renamed from: d */
        final int f41484d;

        LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        /* renamed from: c */
        long[] m67979c() {
            return Arrays.copyOfRange(this.f41482b, this.f41483c, this.f41484d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Long) && Longs.m67983c(this.f41482b, ((Long) obj).longValue(), this.f41483c, this.f41484d) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LongArrayAsList) {
                LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
                int size = size();
                if (longArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f41482b[this.f41483c + i] != longArrayAsList.f41482b[longArrayAsList.f41483c + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f41483c; i2 < this.f41484d; i2++) {
                i = (i * 31) + Longs.hashCode(this.f41482b[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m67983c;
            if ((obj instanceof Long) && (m67983c = Longs.m67983c(this.f41482b, ((Long) obj).longValue(), this.f41483c, this.f41484d)) >= 0) {
                return m67983c - this.f41483c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m67982d;
            if ((obj instanceof Long) && (m67982d = Longs.m67982d(this.f41482b, ((Long) obj).longValue(), this.f41483c, this.f41484d)) >= 0) {
                return m67982d - this.f41483c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41484d - this.f41483c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.f41482b;
            int i3 = this.f41483c;
            return new LongArrayAsList(jArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 10);
            sb2.append('[');
            sb2.append(this.f41482b[this.f41483c]);
            int i = this.f41483c;
            while (true) {
                i++;
                if (i < this.f41484d) {
                    sb2.append(", ");
                    sb2.append(this.f41482b[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        LongArrayAsList(long[] jArr, int i, int i2) {
            this.f41482b = jArr;
            this.f41483c = i;
            this.f41484d = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Long.valueOf(this.f41482b[this.f41483c + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i, Long l) {
            Preconditions.checkElementIndex(i, size());
            long[] jArr = this.f41482b;
            int i2 = this.f41483c;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) Preconditions.checkNotNull(l)).longValue();
            return Long.valueOf(j);
        }
    }

    /* loaded from: classes4.dex */
    private static final class LongConverter extends Converter<String, Long> implements Serializable {

        /* renamed from: d */
        static final LongConverter f41485d = new LongConverter();

        private LongConverter() {
        }

        private Object readResolve() {
            return f41485d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: h */
        public String mo67968d(Long l) {
            return l.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: i */
        public Long mo67967e(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    private Longs() {
    }

    public static List<Long> asList(long... jArr) {
        if (jArr.length == 0) {
            return Collections.emptyList();
        }
        return new LongArrayAsList(jArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m67983c(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int compare(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public static long[] concat(long[]... jArr) {
        int i = 0;
        for (long[] jArr2 : jArr) {
            i += jArr2.length;
        }
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    @Beta
    public static long constrainToRange(long j, long j2, long j3) {
        boolean z;
        if (j2 <= j3) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "min (%s) must be less than or equal to max (%s)", j2, j3);
        return Math.min(Math.max(j, j2), j3);
    }

    public static boolean contains(long[] jArr, long j) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (jArr[i] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m67982d(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    public static long[] ensureCapacity(long[] jArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid minLength: %s", i);
        if (i2 < 0) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Invalid padding: %s", i2);
        if (jArr.length < i) {
            return Arrays.copyOf(jArr, i + i2);
        }
        return jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        boolean z;
        if (bArr.length >= 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (b8 & 255);
    }

    public static int hashCode(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int indexOf(long[] jArr, long j) {
        return m67983c(jArr, j, 0, jArr.length);
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 10);
        sb2.append(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            sb2.append(str);
            sb2.append(jArr[i]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(long[] jArr, long j) {
        return m67982d(jArr, j, 0, jArr.length);
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
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long min(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public static void reverse(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    @Beta
    public static Converter<String, Long> stringConverter() {
        return LongConverter.f41485d;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).m67979c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) Preconditions.checkNotNull(array[i])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    @Beta
    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(long[] r7, long[] r8) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Longs.indexOf(long[], long[]):int");
    }

    @Beta
    public static Long tryParse(String str, int i) {
        if (((String) Preconditions.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i >= 2 && i <= 36) {
            int i2 = str.charAt(0) == '-' ? 1 : 0;
            if (i2 == str.length()) {
                return null;
            }
            int i3 = i2 + 1;
            int m67981a = AsciiDigits.m67981a(str.charAt(i2));
            if (m67981a < 0 || m67981a >= i) {
                return null;
            }
            long j = -m67981a;
            long j2 = i;
            long j3 = Long.MIN_VALUE / j2;
            while (i3 < str.length()) {
                int i4 = i3 + 1;
                int m67981a2 = AsciiDigits.m67981a(str.charAt(i3));
                if (m67981a2 < 0 || m67981a2 >= i || j < j3) {
                    return null;
                }
                long j4 = j * j2;
                long j5 = m67981a2;
                if (j4 < j5 - Long.MIN_VALUE) {
                    return null;
                }
                j = j4 - j5;
                i3 = i4;
            }
            if (i2 != 0) {
                return Long.valueOf(j);
            }
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(-j);
        }
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void reverse(long[] jArr, int i, int i2) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i, i2, jArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            long j = jArr[i];
            jArr[i] = jArr[i3];
            jArr[i3] = j;
            i++;
        }
    }

    public static void sortDescending(long[] jArr, int i, int i2) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i, i2, jArr.length);
        Arrays.sort(jArr, i, i2);
        reverse(jArr, i, i2);
    }
}
