package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class ObjectCountHashMap<K> {

    /* renamed from: a */
    transient Object[] f40558a;

    /* renamed from: b */
    transient int[] f40559b;

    /* renamed from: c */
    transient int f40560c;

    /* renamed from: d */
    transient int f40561d;

    /* renamed from: e */
    private transient int[] f40562e;
    @VisibleForTesting

    /* renamed from: f */
    transient long[] f40563f;

    /* renamed from: g */
    private transient float f40564g;

    /* renamed from: h */
    private transient int f40565h;

    /* loaded from: classes4.dex */
    class MapEntry extends Multisets.AbstractEntry<K> {
        @ParametricNullness

        /* renamed from: b */
        final K f40566b;

        /* renamed from: c */
        int f40567c;

        MapEntry(int i) {
            this.f40566b = (K) ObjectCountHashMap.this.f40558a[i];
            this.f40567c = i;
        }

        /* renamed from: a */
        void m68878a() {
            int i = this.f40567c;
            if (i == -1 || i >= ObjectCountHashMap.this.m68880y() || !Objects.equal(this.f40566b, ObjectCountHashMap.this.f40558a[this.f40567c])) {
                this.f40567c = ObjectCountHashMap.this.m68888k(this.f40566b);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            m68878a();
            int i = this.f40567c;
            if (i == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.f40559b[i];
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return this.f40566b;
        }

        @CanIgnoreReturnValue
        public int setCount(int i) {
            m68878a();
            int i2 = this.f40567c;
            if (i2 == -1) {
                ObjectCountHashMap.this.put(this.f40566b, i);
                return 0;
            }
            int[] iArr = ObjectCountHashMap.this.f40559b;
            int i3 = iArr[i2];
            iArr[i2] = i;
            return i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectCountHashMap() {
        mo68871l(3, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <K> ObjectCountHashMap<K> m68897a() {
        return new ObjectCountHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <K> ObjectCountHashMap<K> m68896b(int i) {
        return new ObjectCountHashMap<>(i);
    }

    /* renamed from: f */
    private static int m68893f(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: h */
    private static int m68891h(long j) {
        return (int) j;
    }

    /* renamed from: j */
    private int m68889j() {
        return this.f40562e.length - 1;
    }

    /* renamed from: o */
    private static long[] m68887o(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* renamed from: p */
    private static int[] m68886p(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: s */
    private int m68885s(Object obj, int i) {
        int m68889j = m68889j() & i;
        int i2 = this.f40562e[m68889j];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m68893f(this.f40563f[i2]) == i && Objects.equal(obj, this.f40558a[i2])) {
                int i4 = this.f40559b[i2];
                if (i3 == -1) {
                    this.f40562e[m68889j] = m68891h(this.f40563f[i2]);
                } else {
                    long[] jArr = this.f40563f;
                    jArr[i3] = m68879z(jArr[i3], m68891h(jArr[i2]));
                }
                mo68869n(i2);
                this.f40560c--;
                this.f40561d++;
                return i4;
            }
            int m68891h = m68891h(this.f40563f[i2]);
            if (m68891h == -1) {
                return 0;
            }
            i3 = i2;
            i2 = m68891h;
        }
    }

    /* renamed from: v */
    private void m68883v(int i) {
        int length = this.f40563f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo68866u(max);
            }
        }
    }

    /* renamed from: w */
    private void m68882w(int i) {
        if (this.f40562e.length >= 1073741824) {
            this.f40565h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f40564g)) + 1;
        int[] m68886p = m68886p(i);
        long[] jArr = this.f40563f;
        int length = m68886p.length - 1;
        for (int i3 = 0; i3 < this.f40560c; i3++) {
            int m68893f = m68893f(jArr[i3]);
            int i4 = m68893f & length;
            int i5 = m68886p[i4];
            m68886p[i4] = i3;
            jArr[i3] = (m68893f << 32) | (i5 & 4294967295L);
        }
        this.f40565h = i2;
        this.f40562e = m68886p;
    }

    /* renamed from: z */
    private static long m68879z(long j, int i) {
        return (j & (-4294967296L)) | (4294967295L & i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m68895c(int i) {
        if (i > this.f40563f.length) {
            mo68866u(i);
        }
        if (i >= this.f40565h) {
            m68882w(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public void clear() {
        this.f40561d++;
        Arrays.fill(this.f40558a, 0, this.f40560c, (Object) null);
        Arrays.fill(this.f40559b, 0, this.f40560c, 0);
        Arrays.fill(this.f40562e, -1);
        Arrays.fill(this.f40563f, -1L);
        this.f40560c = 0;
    }

    public boolean containsKey(Object obj) {
        if (m68888k(obj) != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo68872d() {
        if (this.f40560c == 0) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Multiset.Entry<K> m68894e(int i) {
        Preconditions.checkElementIndex(i, this.f40560c);
        return new MapEntry(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ParametricNullness
    /* renamed from: g */
    public K m68892g(int i) {
        Preconditions.checkElementIndex(i, this.f40560c);
        return (K) this.f40558a[i];
    }

    public int get(Object obj) {
        int m68888k = m68888k(obj);
        if (m68888k == -1) {
            return 0;
        }
        return this.f40559b[m68888k];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m68890i(int i) {
        Preconditions.checkElementIndex(i, this.f40560c);
        return this.f40559b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m68888k(Object obj) {
        int m69450d = Hashing.m69450d(obj);
        int i = this.f40562e[m68889j() & m69450d];
        while (i != -1) {
            long j = this.f40563f[i];
            if (m68893f(j) == m69450d && Objects.equal(obj, this.f40558a[i])) {
                return i;
            }
            i = m68891h(j);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo68871l(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Illegal load factor");
        int m69453a = Hashing.m69453a(i, f);
        this.f40562e = m68886p(m69453a);
        this.f40564g = f;
        this.f40558a = new Object[i];
        this.f40559b = new int[i];
        this.f40563f = m68887o(i);
        this.f40565h = Math.max(1, (int) (m69453a * f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo68870m(int i, @ParametricNullness K k, int i2, int i3) {
        this.f40563f[i] = (i3 << 32) | 4294967295L;
        this.f40558a[i] = k;
        this.f40559b[i] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo68869n(int i) {
        int m68880y = m68880y() - 1;
        if (i < m68880y) {
            Object[] objArr = this.f40558a;
            objArr[i] = objArr[m68880y];
            int[] iArr = this.f40559b;
            iArr[i] = iArr[m68880y];
            objArr[m68880y] = null;
            iArr[m68880y] = 0;
            long[] jArr = this.f40563f;
            long j = jArr[m68880y];
            jArr[i] = j;
            jArr[m68880y] = -1;
            int m68893f = m68893f(j) & m68889j();
            int[] iArr2 = this.f40562e;
            int i2 = iArr2[m68893f];
            if (i2 == m68880y) {
                iArr2[m68893f] = i;
                return;
            }
            while (true) {
                long j2 = this.f40563f[i2];
                int m68891h = m68891h(j2);
                if (m68891h == m68880y) {
                    this.f40563f[i2] = m68879z(j2, i);
                    return;
                }
                i2 = m68891h;
            }
        } else {
            this.f40558a[i] = null;
            this.f40559b[i] = 0;
            this.f40563f[i] = -1;
        }
    }

    @CanIgnoreReturnValue
    public int put(@ParametricNullness K k, int i) {
        CollectPreconditions.m69725d(i, "count");
        long[] jArr = this.f40563f;
        Object[] objArr = this.f40558a;
        int[] iArr = this.f40559b;
        int m69450d = Hashing.m69450d(k);
        int m68889j = m68889j() & m69450d;
        int i2 = this.f40560c;
        int[] iArr2 = this.f40562e;
        int i3 = iArr2[m68889j];
        if (i3 == -1) {
            iArr2[m68889j] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m68893f(j) == m69450d && Objects.equal(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int m68891h = m68891h(j);
                if (m68891h == -1) {
                    jArr[i3] = m68879z(j, i2);
                    break;
                }
                i3 = m68891h;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            m68883v(i5);
            mo68870m(i2, k, i, m69450d);
            this.f40560c = i5;
            if (i2 >= this.f40565h) {
                m68882w(this.f40562e.length * 2);
            }
            this.f40561d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo68868q(int i) {
        int i2 = i + 1;
        if (i2 >= this.f40560c) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo68867r(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int remove(Object obj) {
        return m68885s(obj, Hashing.m69450d(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: t */
    public int m68884t(int i) {
        return m68885s(this.f40558a[i], m68893f(this.f40563f[i]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo68866u(int i) {
        this.f40558a = Arrays.copyOf(this.f40558a, i);
        this.f40559b = Arrays.copyOf(this.f40559b, i);
        long[] jArr = this.f40563f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f40563f = copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m68881x(int i, int i2) {
        Preconditions.checkElementIndex(i, this.f40560c);
        this.f40559b[i] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public int m68880y() {
        return this.f40560c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        mo68871l(objectCountHashMap.m68880y(), 1.0f);
        int mo68872d = objectCountHashMap.mo68872d();
        while (mo68872d != -1) {
            put(objectCountHashMap.m68892g(mo68872d), objectCountHashMap.m68890i(mo68872d));
            mo68872d = objectCountHashMap.mo68868q(mo68872d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectCountHashMap(int i) {
        this(i, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectCountHashMap(int i, float f) {
        mo68871l(i, f);
    }
}
