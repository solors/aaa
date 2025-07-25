package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class jn0 extends kn0 {

    /* renamed from: com.yandex.mobile.ads.impl.jn0$a */
    /* loaded from: classes8.dex */
    private static class C30642a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final int[] f81017b;

        /* renamed from: c */
        final int f81018c;

        /* renamed from: d */
        final int f81019d;

        C30642a(int i, int i2, int[] iArr) {
            this.f81017b = iArr;
            this.f81018c = i;
            this.f81019d = i2;
        }

        /* renamed from: b */
        final int[] m32831b() {
            return Arrays.copyOfRange(this.f81017b, this.f81018c, this.f81019d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f81017b;
                int intValue = ((Integer) obj).intValue();
                int i = this.f81018c;
                int i2 = this.f81019d;
                while (true) {
                    if (i >= i2) {
                        break;
                    } else if (iArr[i] == intValue) {
                        if (i != -1) {
                            return true;
                        }
                    } else {
                        i++;
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C30642a) {
                C30642a c30642a = (C30642a) obj;
                int i = this.f81019d - this.f81018c;
                if (c30642a.f81019d - c30642a.f81018c != i) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.f81017b[this.f81018c + i2] != c30642a.f81017b[c30642a.f81018c + i2]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            uf1.m28796a(i, this.f81019d - this.f81018c);
            return Integer.valueOf(this.f81017b[this.f81018c + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.f81018c; i2 < this.f81019d; i2++) {
                i = (i * 31) + this.f81017b[i2];
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f81017b;
                int intValue = ((Integer) obj).intValue();
                int i = this.f81018c;
                int i2 = this.f81019d;
                while (true) {
                    if (i < i2) {
                        if (iArr[i] == intValue) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i >= 0) {
                    return i - this.f81018c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f81017b;
                int intValue = ((Integer) obj).intValue();
                int i = this.f81018c;
                int i2 = this.f81019d - 1;
                while (true) {
                    if (i2 >= i) {
                        if (iArr[i2] == intValue) {
                            break;
                        }
                        i2--;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 >= 0) {
                    return i2 - this.f81018c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            uf1.m28796a(i, this.f81019d - this.f81018c);
            int[] iArr = this.f81017b;
            int i2 = this.f81018c + i;
            int i3 = iArr[i2];
            num.getClass();
            iArr[i2] = num.intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f81019d - this.f81018c;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i2) {
            uf1.m28795a(i, i2, this.f81019d - this.f81018c);
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f81017b;
            int i3 = this.f81018c;
            return new C30642a(i + i3, i3 + i2, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder((this.f81019d - this.f81018c) * 5);
            sb2.append('[');
            sb2.append(this.f81017b[this.f81018c]);
            int i = this.f81018c;
            while (true) {
                i++;
                if (i < this.f81019d) {
                    sb2.append(", ");
                    sb2.append(this.f81017b[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }
    }

    /* renamed from: a */
    public static List<Integer> m32833a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new C30642a(0, iArr.length, iArr);
    }

    /* renamed from: b */
    public static int m32832b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: a */
    public static int m32835a(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new IllegalArgumentException(jy1.m32697a("Out of range: %s", Long.valueOf(j)));
    }

    /* renamed from: a */
    public static int[] m32834a(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof C30642a) {
            return ((C30642a) abstractCollection).m32831b();
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
