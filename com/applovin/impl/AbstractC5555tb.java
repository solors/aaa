package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.applovin.impl.tb */
/* loaded from: classes2.dex */
public abstract class AbstractC5555tb {

    /* renamed from: com.applovin.impl.tb$a */
    /* loaded from: classes2.dex */
    private static class C5556a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a */
        final int[] f10873a;

        /* renamed from: b */
        final int f10874b;

        /* renamed from: c */
        final int f10875c;

        C5556a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* renamed from: a */
        int[] m94475a() {
            return Arrays.copyOfRange(this.f10873a, this.f10874b, this.f10875c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Integer) && AbstractC5555tb.m94477c(this.f10873a, ((Integer) obj).intValue(), this.f10874b, this.f10875c) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C5556a) {
                C5556a c5556a = (C5556a) obj;
                int size = size();
                if (c5556a.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f10873a[this.f10874b + i] != c5556a.f10873a[c5556a.f10874b + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Integer.valueOf(this.f10873a[this.f10874b + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f10874b; i2 < this.f10875c; i2++) {
                i = (i * 31) + AbstractC5555tb.m94484a(this.f10873a[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m94477c;
            if ((obj instanceof Integer) && (m94477c = AbstractC5555tb.m94477c(this.f10873a, ((Integer) obj).intValue(), this.f10874b, this.f10875c)) >= 0) {
                return m94477c - this.f10874b;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m94476d;
            if ((obj instanceof Integer) && (m94476d = AbstractC5555tb.m94476d(this.f10873a, ((Integer) obj).intValue(), this.f10874b, this.f10875c)) >= 0) {
                return m94476d - this.f10874b;
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i, Integer num) {
            Preconditions.checkElementIndex(i, size());
            int[] iArr = this.f10873a;
            int i2 = this.f10874b + i;
            int i3 = iArr[i2];
            iArr[i2] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10875c - this.f10874b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f10873a;
            int i3 = this.f10874b;
            return new C5556a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f10873a[this.f10874b]);
            int i = this.f10874b;
            while (true) {
                i++;
                if (i < this.f10875c) {
                    sb2.append(", ");
                    sb2.append(this.f10873a[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        C5556a(int[] iArr, int i, int i2) {
            this.f10873a = iArr;
            this.f10874b = i;
            this.f10875c = i2;
        }
    }

    /* renamed from: a */
    public static int m94484a(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m94477c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m94476d(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m94483a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static List m94480a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new C5556a(iArr);
    }

    /* renamed from: a */
    public static int m94482a(long j) {
        int i = (int) j;
        Preconditions.checkArgument(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: a */
    public static int[] m94481a(Collection collection) {
        if (collection instanceof C5556a) {
            return ((C5556a) collection).m94475a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }
}
