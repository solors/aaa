package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
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
public final class Booleans {

    @GwtCompatible
    /* loaded from: classes4.dex */
    private static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {

        /* renamed from: b */
        final boolean[] f41429b;

        /* renamed from: c */
        final int f41430c;

        /* renamed from: d */
        final int f41431d;

        BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        /* renamed from: c */
        boolean[] m68068c() {
            return Arrays.copyOfRange(this.f41429b, this.f41430c, this.f41431d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Boolean) && Booleans.m68070c(this.f41429b, ((Boolean) obj).booleanValue(), this.f41430c, this.f41431d) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof BooleanArrayAsList) {
                BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
                int size = size();
                if (booleanArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f41429b[this.f41430c + i] != booleanArrayAsList.f41429b[booleanArrayAsList.f41430c + i]) {
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
            for (int i2 = this.f41430c; i2 < this.f41431d; i2++) {
                i = (i * 31) + Booleans.hashCode(this.f41429b[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m68070c;
            if ((obj instanceof Boolean) && (m68070c = Booleans.m68070c(this.f41429b, ((Boolean) obj).booleanValue(), this.f41430c, this.f41431d)) >= 0) {
                return m68070c - this.f41430c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m68069d;
            if ((obj instanceof Boolean) && (m68069d = Booleans.m68069d(this.f41429b, ((Boolean) obj).booleanValue(), this.f41430c, this.f41431d)) >= 0) {
                return m68069d - this.f41430c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41431d - this.f41430c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f41429b;
            int i3 = this.f41430c;
            return new BooleanArrayAsList(zArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String str;
            String str2;
            StringBuilder sb2 = new StringBuilder(size() * 7);
            if (this.f41429b[this.f41430c]) {
                str = "[true";
            } else {
                str = "[false";
            }
            sb2.append(str);
            int i = this.f41430c;
            while (true) {
                i++;
                if (i < this.f41431d) {
                    if (this.f41429b[i]) {
                        str2 = ", true";
                    } else {
                        str2 = ", false";
                    }
                    sb2.append(str2);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        BooleanArrayAsList(boolean[] zArr, int i, int i2) {
            this.f41429b = zArr;
            this.f41430c = i;
            this.f41431d = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Boolean.valueOf(this.f41429b[this.f41430c + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i, Boolean bool) {
            Preconditions.checkElementIndex(i, size());
            boolean[] zArr = this.f41429b;
            int i2 = this.f41430c;
            boolean z = zArr[i2 + i];
            zArr[i2 + i] = ((Boolean) Preconditions.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes4.dex */
    private enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");
        

        /* renamed from: b */
        private final int f41433b;

        /* renamed from: c */
        private final String f41434c;

        BooleanComparator(int i, String str) {
            this.f41433b = i;
            this.f41434c = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f41434c;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.f41433b : 0) - (bool.booleanValue() ? this.f41433b : 0);
        }
    }

    /* loaded from: classes4.dex */
    private enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Booleans.compare(zArr[i], zArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    private Booleans() {
    }

    public static List<Boolean> asList(boolean... zArr) {
        if (zArr.length == 0) {
            return Collections.emptyList();
        }
        return new BooleanArrayAsList(zArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m68070c(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int compare(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public static boolean[] concat(boolean[]... zArr) {
        int i = 0;
        for (boolean[] zArr2 : zArr) {
            i += zArr2.length;
        }
        boolean[] zArr3 = new boolean[i];
        int i2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, i2, zArr4.length);
            i2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    @Beta
    public static int countTrue(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m68069d(boolean[] zArr, boolean z, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (zArr[i3] == z) {
                return i3;
            }
        }
        return -1;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i, int i2) {
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
        if (zArr.length < i) {
            return Arrays.copyOf(zArr, i + i2);
        }
        return zArr;
    }

    @Beta
    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int indexOf(boolean[] zArr, boolean z) {
        return m68070c(zArr, z, 0, zArr.length);
    }

    public static String join(String str, boolean... zArr) {
        Preconditions.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zArr.length * 7);
        sb2.append(zArr[0]);
        for (int i = 1; i < zArr.length; i++) {
            sb2.append(str);
            sb2.append(zArr[i]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(boolean[] zArr, boolean z) {
        return m68069d(zArr, z, 0, zArr.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] zArr) {
        Preconditions.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).m68068c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((Boolean) Preconditions.checkNotNull(array[i])).booleanValue();
        }
        return zArr;
    }

    @Beta
    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(boolean[] r5, boolean[] r6) {
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
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Booleans.indexOf(boolean[], boolean[]):int");
    }

    public static void reverse(boolean[] zArr, int i, int i2) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i, i2, zArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            boolean z = zArr[i];
            zArr[i] = zArr[i3];
            zArr[i3] = z;
            i++;
        }
    }
}
