package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    /* loaded from: classes4.dex */
    private enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Shorts.compare(sArr[i], sArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return sArr.length - sArr2.length;
        }
    }

    @GwtCompatible
    /* loaded from: classes4.dex */
    private static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {

        /* renamed from: b */
        final short[] f41491b;

        /* renamed from: c */
        final int f41492c;

        /* renamed from: d */
        final int f41493d;

        ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        /* renamed from: c */
        short[] m67969c() {
            return Arrays.copyOfRange(this.f41491b, this.f41492c, this.f41493d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Short) && Shorts.m67972c(this.f41491b, ((Short) obj).shortValue(), this.f41492c, this.f41493d) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ShortArrayAsList) {
                ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
                int size = size();
                if (shortArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f41491b[this.f41492c + i] != shortArrayAsList.f41491b[shortArrayAsList.f41492c + i]) {
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
            for (int i2 = this.f41492c; i2 < this.f41493d; i2++) {
                i = (i * 31) + Shorts.hashCode(this.f41491b[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m67972c;
            if ((obj instanceof Short) && (m67972c = Shorts.m67972c(this.f41491b, ((Short) obj).shortValue(), this.f41492c, this.f41493d)) >= 0) {
                return m67972c - this.f41492c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m67971d;
            if ((obj instanceof Short) && (m67971d = Shorts.m67971d(this.f41491b, ((Short) obj).shortValue(), this.f41492c, this.f41493d)) >= 0) {
                return m67971d - this.f41492c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41493d - this.f41492c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            short[] sArr = this.f41491b;
            int i3 = this.f41492c;
            return new ShortArrayAsList(sArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 6);
            sb2.append('[');
            sb2.append((int) this.f41491b[this.f41492c]);
            int i = this.f41492c;
            while (true) {
                i++;
                if (i < this.f41493d) {
                    sb2.append(", ");
                    sb2.append((int) this.f41491b[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        ShortArrayAsList(short[] sArr, int i, int i2) {
            this.f41491b = sArr;
            this.f41492c = i;
            this.f41493d = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Short.valueOf(this.f41491b[this.f41492c + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i, Short sh) {
            Preconditions.checkElementIndex(i, size());
            short[] sArr = this.f41491b;
            int i2 = this.f41492c;
            short s = sArr[i2 + i];
            sArr[i2 + i] = ((Short) Preconditions.checkNotNull(sh)).shortValue();
            return Short.valueOf(s);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ShortConverter extends Converter<String, Short> implements Serializable {

        /* renamed from: d */
        static final ShortConverter f41494d = new ShortConverter();

        private ShortConverter() {
        }

        private Object readResolve() {
            return f41494d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: h */
        public String mo67968d(Short sh) {
            return sh.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: i */
        public Short mo67967e(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    private Shorts() {
    }

    public static List<Short> asList(short... sArr) {
        if (sArr.length == 0) {
            return Collections.emptyList();
        }
        return new ShortArrayAsList(sArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m67972c(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static short checkedCast(long j) {
        boolean z;
        short s = (short) j;
        if (s == j) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Out of range: %s", j);
        return s;
    }

    public static int compare(short s, short s2) {
        return s - s2;
    }

    public static short[] concat(short[]... sArr) {
        int i = 0;
        for (short[] sArr2 : sArr) {
            i += sArr2.length;
        }
        short[] sArr3 = new short[i];
        int i2 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, i2, sArr4.length);
            i2 += sArr4.length;
        }
        return sArr3;
    }

    @Beta
    public static short constrainToRange(short s, short s2, short s3) {
        boolean z;
        if (s2 <= s3) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "min (%s) must be less than or equal to max (%s)", (int) s2, (int) s3);
        if (s < s2) {
            return s2;
        }
        if (s >= s3) {
            return s3;
        }
        return s;
    }

    public static boolean contains(short[] sArr, short s) {
        for (short s2 : sArr) {
            if (s2 == s) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m67971d(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }

    public static short[] ensureCapacity(short[] sArr, int i, int i2) {
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
        if (sArr.length < i) {
            return Arrays.copyOf(sArr, i + i2);
        }
        return sArr;
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bArr) {
        boolean z;
        if (bArr.length >= 2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static short fromBytes(byte b, byte b2) {
        return (short) ((b << 8) | (b2 & 255));
    }

    public static int indexOf(short[] sArr, short s) {
        return m67972c(sArr, s, 0, sArr.length);
    }

    public static String join(String str, short... sArr) {
        Preconditions.checkNotNull(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(sArr.length * 6);
        sb2.append((int) sArr[0]);
        for (int i = 1; i < sArr.length; i++) {
            sb2.append(str);
            sb2.append((int) sArr[i]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(short[] sArr, short s) {
        return m67971d(sArr, s, 0, sArr.length);
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... sArr) {
        boolean z;
        if (sArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... sArr) {
        boolean z;
        if (sArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    public static void reverse(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        reverse(sArr, 0, sArr.length);
    }

    public static short saturatedCast(long j) {
        if (j > 32767) {
            return Short.MAX_VALUE;
        }
        if (j < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) j;
    }

    public static void sortDescending(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        sortDescending(sArr, 0, sArr.length);
    }

    @Beta
    public static Converter<String, Short> stringConverter() {
        return ShortConverter.f41494d;
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).m67969c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = ((Number) Preconditions.checkNotNull(array[i])).shortValue();
        }
        return sArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(short s) {
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(short[] r5, short[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            short r3 = r5[r3]
            short r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Shorts.indexOf(short[], short[]):int");
    }

    public static void reverse(short[] sArr, int i, int i2) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i, i2, sArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            short s = sArr[i];
            sArr[i] = sArr[i3];
            sArr[i3] = s;
            i++;
        }
    }

    public static void sortDescending(short[] sArr, int i, int i2) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i, i2, sArr.length);
        Arrays.sort(sArr, i, i2);
        reverse(sArr, i, i2);
    }

    public static int hashCode(short s) {
        return s;
    }
}
