package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
public final class Chars {
    public static final int BYTES = 2;

    @GwtCompatible
    /* loaded from: classes4.dex */
    private static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {

        /* renamed from: b */
        final char[] f41439b;

        /* renamed from: c */
        final int f41440c;

        /* renamed from: d */
        final int f41441d;

        CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        /* renamed from: c */
        char[] m68056c() {
            return Arrays.copyOfRange(this.f41439b, this.f41440c, this.f41441d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Character) && Chars.m68058c(this.f41439b, ((Character) obj).charValue(), this.f41440c, this.f41441d) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CharArrayAsList) {
                CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
                int size = size();
                if (charArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f41439b[this.f41440c + i] != charArrayAsList.f41439b[charArrayAsList.f41440c + i]) {
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
            for (int i2 = this.f41440c; i2 < this.f41441d; i2++) {
                i = (i * 31) + Chars.hashCode(this.f41439b[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m68058c;
            if ((obj instanceof Character) && (m68058c = Chars.m68058c(this.f41439b, ((Character) obj).charValue(), this.f41440c, this.f41441d)) >= 0) {
                return m68058c - this.f41440c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m68057d;
            if ((obj instanceof Character) && (m68057d = Chars.m68057d(this.f41439b, ((Character) obj).charValue(), this.f41440c, this.f41441d)) >= 0) {
                return m68057d - this.f41440c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41441d - this.f41440c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            char[] cArr = this.f41439b;
            int i3 = this.f41440c;
            return new CharArrayAsList(cArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 3);
            sb2.append('[');
            sb2.append(this.f41439b[this.f41440c]);
            int i = this.f41440c;
            while (true) {
                i++;
                if (i < this.f41441d) {
                    sb2.append(", ");
                    sb2.append(this.f41439b[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        CharArrayAsList(char[] cArr, int i, int i2) {
            this.f41439b = cArr;
            this.f41440c = i;
            this.f41441d = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Character.valueOf(this.f41439b[this.f41440c + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i, Character ch) {
            Preconditions.checkElementIndex(i, size());
            char[] cArr = this.f41439b;
            int i2 = this.f41440c;
            char c = cArr[i2 + i];
            cArr[i2 + i] = ((Character) Preconditions.checkNotNull(ch)).charValue();
            return Character.valueOf(c);
        }
    }

    /* loaded from: classes4.dex */
    private enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Chars.compare(cArr[i], cArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    private Chars() {
    }

    public static List<Character> asList(char... cArr) {
        if (cArr.length == 0) {
            return Collections.emptyList();
        }
        return new CharArrayAsList(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m68058c(char[] cArr, char c, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static char checkedCast(long j) {
        boolean z;
        char c = (char) j;
        if (c == j) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Out of range: %s", j);
        return c;
    }

    public static int compare(char c, char c2) {
        return c - c2;
    }

    public static char[] concat(char[]... cArr) {
        int i = 0;
        for (char[] cArr2 : cArr) {
            i += cArr2.length;
        }
        char[] cArr3 = new char[i];
        int i2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, i2, cArr4.length);
            i2 += cArr4.length;
        }
        return cArr3;
    }

    @Beta
    public static char constrainToRange(char c, char c2, char c3) {
        boolean z;
        if (c2 <= c3) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "min (%s) must be less than or equal to max (%s)", c2, c3);
        if (c < c2) {
            return c2;
        }
        if (c >= c3) {
            return c3;
        }
        return c;
    }

    public static boolean contains(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m68057d(char[] cArr, char c, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (cArr[i3] == c) {
                return i3;
            }
        }
        return -1;
    }

    public static char[] ensureCapacity(char[] cArr, int i, int i2) {
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
        if (cArr.length < i) {
            return Arrays.copyOf(cArr, i + i2);
        }
        return cArr;
    }

    @GwtIncompatible
    public static char fromByteArray(byte[] bArr) {
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
    public static char fromBytes(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    public static int indexOf(char[] cArr, char c) {
        return m68058c(cArr, c, 0, cArr.length);
    }

    public static String join(String str, char... cArr) {
        Preconditions.checkNotNull(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((str.length() * (length - 1)) + length);
        sb2.append(cArr[0]);
        for (int i = 1; i < length; i++) {
            sb2.append(str);
            sb2.append(cArr[i]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(char[] cArr, char c) {
        return m68057d(cArr, c, 0, cArr.length);
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char max(char... cArr) {
        boolean z;
        if (cArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        char c = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            char c2 = cArr[i];
            if (c2 > c) {
                c = c2;
            }
        }
        return c;
    }

    public static char min(char... cArr) {
        boolean z;
        if (cArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        char c = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            char c2 = cArr[i];
            if (c2 < c) {
                c = c2;
            }
        }
        return c;
    }

    public static void reverse(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        reverse(cArr, 0, cArr.length);
    }

    public static char saturatedCast(long j) {
        if (j > 65535) {
            return (char) 65535;
        }
        if (j < 0) {
            return (char) 0;
        }
        return (char) j;
    }

    public static void sortDescending(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        sortDescending(cArr, 0, cArr.length);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).m68056c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = ((Character) Preconditions.checkNotNull(array[i])).charValue();
        }
        return cArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(char c) {
        return new byte[]{(byte) (c >> '\b'), (byte) c};
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(char[] r5, char[] r6) {
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
            char r3 = r5[r3]
            char r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Chars.indexOf(char[], char[]):int");
    }

    public static void reverse(char[] cArr, int i, int i2) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i, i2, cArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            char c = cArr[i];
            cArr[i] = cArr[i3];
            cArr[i3] = c;
            i++;
        }
    }

    public static void sortDescending(char[] cArr, int i, int i2) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i, i2, cArr.length);
        Arrays.sort(cArr, i, i2);
        reverse(cArr, i, i2);
    }

    public static int hashCode(char c) {
        return c;
    }
}
