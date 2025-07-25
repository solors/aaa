package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.w3 */
/* loaded from: classes2.dex */
public class C5739w3 extends AbstractMap implements Serializable {

    /* renamed from: a */
    private transient int[] f11606a;

    /* renamed from: b */
    transient long[] f11607b;

    /* renamed from: c */
    transient Object[] f11608c;

    /* renamed from: d */
    transient Object[] f11609d;

    /* renamed from: f */
    transient float f11610f;

    /* renamed from: g */
    transient int f11611g;

    /* renamed from: h */
    private transient int f11612h;

    /* renamed from: i */
    private transient int f11613i;

    /* renamed from: j */
    private transient Set f11614j;

    /* renamed from: k */
    private transient Set f11615k;

    /* renamed from: l */
    private transient Collection f11616l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.w3$a */
    /* loaded from: classes2.dex */
    public class C5740a extends AbstractC5744e {
        C5740a() {
            super(C5739w3.this, null);
        }

        @Override // com.applovin.impl.C5739w3.AbstractC5744e
        /* renamed from: a */
        Object mo93712a(int i) {
            return C5739w3.this.f11608c[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.w3$b */
    /* loaded from: classes2.dex */
    public class C5741b extends AbstractC5744e {
        C5741b() {
            super(C5739w3.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.C5739w3.AbstractC5744e
        /* renamed from: b */
        public Map.Entry mo93712a(int i) {
            return new C5746g(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.w3$c */
    /* loaded from: classes2.dex */
    public class C5742c extends AbstractC5744e {
        C5742c() {
            super(C5739w3.this, null);
        }

        @Override // com.applovin.impl.C5739w3.AbstractC5744e
        /* renamed from: a */
        Object mo93712a(int i) {
            return C5739w3.this.f11609d[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.w3$d */
    /* loaded from: classes2.dex */
    public class C5743d extends AbstractSet {
        C5743d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5739w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m93733a = C5739w3.this.m93733a(entry.getKey());
            if (m93733a == -1 || !Objects.equal(C5739w3.this.f11609d[m93733a], entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C5739w3.this.m93724e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int m93733a = C5739w3.this.m93733a(entry.getKey());
                if (m93733a != -1 && Objects.equal(C5739w3.this.f11609d[m93733a], entry.getValue())) {
                    C5739w3.this.m93721f(m93733a);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5739w3.this.f11613i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.w3$f */
    /* loaded from: classes2.dex */
    public class C5745f extends AbstractSet {
        C5745f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5739w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C5739w3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C5739w3.this.m93718h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m93733a = C5739w3.this.m93733a(obj);
            if (m93733a != -1) {
                C5739w3.this.m93721f(m93733a);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5739w3.this.f11613i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.w3$g */
    /* loaded from: classes2.dex */
    public final class C5746g extends AbstractC4431g {

        /* renamed from: a */
        private final Object f11626a;

        /* renamed from: b */
        private int f11627b;

        C5746g(int i) {
            this.f11626a = C5739w3.this.f11608c[i];
            this.f11627b = i;
        }

        /* renamed from: a */
        private void m93711a() {
            int i = this.f11627b;
            if (i == -1 || i >= C5739w3.this.size() || !Objects.equal(this.f11626a, C5739w3.this.f11608c[this.f11627b])) {
                this.f11627b = C5739w3.this.m93733a(this.f11626a);
            }
        }

        @Override // com.applovin.impl.AbstractC4431g, java.util.Map.Entry
        public Object getKey() {
            return this.f11626a;
        }

        @Override // com.applovin.impl.AbstractC4431g, java.util.Map.Entry
        public Object getValue() {
            m93711a();
            int i = this.f11627b;
            if (i == -1) {
                return null;
            }
            return C5739w3.this.f11609d[i];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            m93711a();
            int i = this.f11627b;
            if (i == -1) {
                C5739w3.this.put(this.f11626a, obj);
                return null;
            }
            Object[] objArr = C5739w3.this.f11609d;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.w3$h */
    /* loaded from: classes2.dex */
    public class C5747h extends AbstractCollection {
        C5747h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C5739w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C5739w3.this.m93716i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C5739w3.this.f11613i;
        }
    }

    C5739w3() {
        m93741a(3, 1.0f);
    }

    /* renamed from: b */
    private static int m93729b(long j) {
        return (int) j;
    }

    /* renamed from: d */
    private static long[] m93725d(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* renamed from: e */
    private static int[] m93723e(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: g */
    private int m93720g() {
        return this.f11606a.length - 1;
    }

    /* renamed from: h */
    private void m93717h(int i) {
        int length = this.f11607b.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                m93719g(max);
            }
        }
    }

    /* renamed from: i */
    private void m93715i(int i) {
        if (this.f11606a.length >= 1073741824) {
            this.f11612h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f11610f)) + 1;
        int[] m93723e = m93723e(i);
        long[] jArr = this.f11607b;
        int length = m93723e.length - 1;
        for (int i3 = 0; i3 < this.f11613i; i3++) {
            int m93738a = m93738a(jArr[i3]);
            int i4 = m93738a & length;
            int i5 = m93723e[i4];
            m93723e[i4] = i3;
            jArr[i3] = (m93738a << 32) | (i5 & 4294967295L);
        }
        this.f11612h = i2;
        this.f11606a = m93723e;
    }

    /* renamed from: a */
    int m93740a(int i, int i2) {
        return i - 1;
    }

    /* renamed from: c */
    void m93727c(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f11608c;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f11609d;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f11607b;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int m93738a = m93738a(j) & m93720g();
            int[] iArr = this.f11606a;
            int i2 = iArr[m93738a];
            if (i2 == size) {
                iArr[m93738a] = i;
                return;
            }
            while (true) {
                long j2 = this.f11607b[i2];
                int m93729b = m93729b(j2);
                if (m93729b == size) {
                    this.f11607b[i2] = m93737a(j2, i);
                    return;
                }
                i2 = m93729b;
            }
        } else {
            this.f11608c[i] = null;
            this.f11609d[i] = null;
            this.f11607b[i] = -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f11611g++;
        Arrays.fill(this.f11608c, 0, this.f11613i, (Object) null);
        Arrays.fill(this.f11609d, 0, this.f11613i, (Object) null);
        Arrays.fill(this.f11606a, -1);
        Arrays.fill(this.f11607b, -1L);
        this.f11613i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (m93733a(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.f11613i; i++) {
            if (Objects.equal(obj, this.f11609d[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f11615k;
        if (set == null) {
            Set m93731b = m93731b();
            this.f11615k = m93731b;
            return m93731b;
        }
        return set;
    }

    /* renamed from: f */
    int m93722f() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int m93733a = m93733a(obj);
        m93742a(m93733a);
        if (m93733a == -1) {
            return null;
        }
        return this.f11609d[m93733a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (this.f11613i == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f11614j;
        if (set == null) {
            Set m93728c = m93728c();
            this.f11614j = m93728c;
            return m93728c;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        long[] jArr = this.f11607b;
        Object[] objArr = this.f11608c;
        Object[] objArr2 = this.f11609d;
        int m98280a = AbstractC4643ja.m98280a(obj);
        int m93720g = m93720g() & m98280a;
        int i = this.f11613i;
        int[] iArr = this.f11606a;
        int i2 = iArr[m93720g];
        if (i2 == -1) {
            iArr[m93720g] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m93738a(j) == m98280a && Objects.equal(obj, objArr[i2])) {
                    Object obj3 = objArr2[i2];
                    objArr2[i2] = obj2;
                    m93742a(i2);
                    return obj3;
                }
                int m93729b = m93729b(j);
                if (m93729b == -1) {
                    jArr[i2] = m93737a(j, i);
                    break;
                }
                i2 = m93729b;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            m93717h(i3);
            m93739a(i, obj, obj2, m98280a);
            this.f11613i = i3;
            if (i >= this.f11612h) {
                m93715i(this.f11606a.length * 2);
            }
            this.f11611g++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return m93732a(obj, AbstractC4643ja.m98280a(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f11613i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f11616l;
        if (collection == null) {
            Collection m93726d = m93726d();
            this.f11616l = m93726d;
            return m93726d;
        }
        return collection;
    }

    /* renamed from: a */
    private static int m93738a(long j) {
        return (int) (j >>> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public Object m93721f(int i) {
        return m93732a(this.f11608c[i], m93738a(this.f11607b[i]));
    }

    /* renamed from: b */
    int m93730b(int i) {
        int i2 = i + 1;
        if (i2 < this.f11613i) {
            return i2;
        }
        return -1;
    }

    /* renamed from: g */
    void m93719g(int i) {
        this.f11608c = Arrays.copyOf(this.f11608c, i);
        this.f11609d = Arrays.copyOf(this.f11609d, i);
        long[] jArr = this.f11607b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f11607b = copyOf;
    }

    /* renamed from: a */
    private static long m93737a(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    /* renamed from: b */
    Set m93731b() {
        return new C5743d();
    }

    /* renamed from: d */
    Collection m93726d() {
        return new C5747h();
    }

    /* renamed from: e */
    Iterator m93724e() {
        return new C5741b();
    }

    /* renamed from: com.applovin.impl.w3$e */
    /* loaded from: classes2.dex */
    private abstract class AbstractC5744e implements Iterator {

        /* renamed from: a */
        int f11621a;

        /* renamed from: b */
        int f11622b;

        /* renamed from: c */
        int f11623c;

        private AbstractC5744e() {
            this.f11621a = C5739w3.this.f11611g;
            this.f11622b = C5739w3.this.m93722f();
            this.f11623c = -1;
        }

        /* renamed from: a */
        private void m93713a() {
            if (C5739w3.this.f11611g == this.f11621a) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: a */
        abstract Object mo93712a(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11622b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            m93713a();
            if (hasNext()) {
                int i = this.f11622b;
                this.f11623c = i;
                Object mo93712a = mo93712a(i);
                this.f11622b = C5739w3.this.m93730b(this.f11622b);
                return mo93712a;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m93713a();
            if (this.f11623c >= 0) {
                z = true;
            } else {
                z = false;
            }
            AbstractC5103p3.m96596a(z);
            this.f11621a++;
            C5739w3.this.m93721f(this.f11623c);
            this.f11622b = C5739w3.this.m93740a(this.f11622b, this.f11623c);
            this.f11623c = -1;
        }

        /* synthetic */ AbstractC5744e(C5739w3 c5739w3, C5740a c5740a) {
            this();
        }
    }

    /* renamed from: a */
    void m93742a(int i) {
    }

    /* renamed from: h */
    Iterator m93718h() {
        return new C5740a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m93733a(Object obj) {
        int m98280a = AbstractC4643ja.m98280a(obj);
        int i = this.f11606a[m93720g() & m98280a];
        while (i != -1) {
            long j = this.f11607b[i];
            if (m93738a(j) == m98280a && Objects.equal(obj, this.f11608c[i])) {
                return i;
            }
            i = m93729b(j);
        }
        return -1;
    }

    /* renamed from: a */
    void m93741a(int i, float f) {
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f > 0.0f, "Illegal load factor");
        int m98281a = AbstractC4643ja.m98281a(i, f);
        this.f11606a = m93723e(m98281a);
        this.f11610f = f;
        this.f11608c = new Object[i];
        this.f11609d = new Object[i];
        this.f11607b = m93725d(i);
        this.f11612h = Math.max(1, (int) (m98281a * f));
    }

    /* renamed from: i */
    Iterator m93716i() {
        return new C5742c();
    }

    /* renamed from: c */
    Set m93728c() {
        return new C5745f();
    }

    /* renamed from: a */
    void m93739a(int i, Object obj, Object obj2, int i2) {
        this.f11607b[i] = (i2 << 32) | 4294967295L;
        this.f11608c[i] = obj;
        this.f11609d[i] = obj2;
    }

    /* renamed from: a */
    private Object m93732a(Object obj, int i) {
        int m93720g = m93720g() & i;
        int i2 = this.f11606a[m93720g];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (m93738a(this.f11607b[i2]) == i && Objects.equal(obj, this.f11608c[i2])) {
                Object obj2 = this.f11609d[i2];
                if (i3 == -1) {
                    this.f11606a[m93720g] = m93729b(this.f11607b[i2]);
                } else {
                    long[] jArr = this.f11607b;
                    jArr[i3] = m93737a(jArr[i3], m93729b(jArr[i2]));
                }
                m93727c(i2);
                this.f11613i--;
                this.f11611g++;
                return obj2;
            }
            int m93729b = m93729b(this.f11607b[i2]);
            if (m93729b == -1) {
                return null;
            }
            i3 = i2;
            i2 = m93729b;
        }
    }

    /* renamed from: a */
    public static C5739w3 m93743a() {
        return new C5739w3();
    }
}
