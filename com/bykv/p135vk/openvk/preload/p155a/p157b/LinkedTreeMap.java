package com.bykv.p135vk.openvk.preload.p155a.p157b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.preload.a.b.g */
/* loaded from: classes3.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: d */
    private static final Comparator<Comparable> f13777d = new Comparator<Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.g.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: i */
    private static /* synthetic */ boolean f13778i = true;

    /* renamed from: a */
    int f13779a;

    /* renamed from: b */
    int f13780b;

    /* renamed from: c */
    final C6603d<K, V> f13781c;

    /* renamed from: e */
    private Comparator<? super K> f13782e;

    /* renamed from: f */
    private C6603d<K, V> f13783f;

    /* renamed from: g */
    private LinkedTreeMap<K, V>.C6598a f13784g;

    /* renamed from: h */
    private LinkedTreeMap<K, V>.C6600b f13785h;

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.g$a */
    /* loaded from: classes3.dex */
    class C6598a extends AbstractSet<Map.Entry<K, V>> {
        C6598a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && LinkedTreeMap.this.m91579a((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.AbstractC6602c<Map.Entry<K, V>>() { // from class: com.bykv.vk.openvk.preload.a.b.g.a.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return m91575a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C6603d<K, V> m91579a;
            if (!(obj instanceof Map.Entry) || (m91579a = LinkedTreeMap.this.m91579a((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.m91582a((C6603d) m91579a, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f13779a;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.g$b */
    /* loaded from: classes3.dex */
    final class C6600b extends AbstractSet<K> {
        C6600b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.AbstractC6602c<K>() { // from class: com.bykv.vk.openvk.preload.a.b.g.b.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return m91575a().f13799f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (LinkedTreeMap.this.m91581a(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f13779a;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.g$c */
    /* loaded from: classes3.dex */
    abstract class AbstractC6602c<T> implements Iterator<T> {

        /* renamed from: a */
        private C6603d<K, V> f13790a;

        /* renamed from: b */
        private C6603d<K, V> f13791b = null;

        /* renamed from: c */
        private int f13792c;

        AbstractC6602c() {
            this.f13790a = LinkedTreeMap.this.f13781c.f13797d;
            this.f13792c = LinkedTreeMap.this.f13780b;
        }

        /* renamed from: a */
        final C6603d<K, V> m91575a() {
            C6603d<K, V> c6603d = this.f13790a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (c6603d != linkedTreeMap.f13781c) {
                if (linkedTreeMap.f13780b == this.f13792c) {
                    this.f13790a = c6603d.f13797d;
                    this.f13791b = c6603d;
                    return c6603d;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f13790a != LinkedTreeMap.this.f13781c) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C6603d<K, V> c6603d = this.f13791b;
            if (c6603d != null) {
                LinkedTreeMap.this.m91582a((C6603d) c6603d, true);
                this.f13791b = null;
                this.f13792c = LinkedTreeMap.this.f13780b;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedTreeMap() {
        this(f13777d);
    }

    /* renamed from: a */
    private C6603d<K, V> m91580a(K k, boolean z) {
        int i;
        C6603d<K, V> c6603d;
        Comparator<? super K> comparator = this.f13782e;
        C6603d<K, V> c6603d2 = this.f13783f;
        if (c6603d2 != null) {
            Comparable comparable = comparator == f13777d ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c6603d2.f13799f);
                } else {
                    i = comparator.compare(k, (K) c6603d2.f13799f);
                }
                if (i != 0) {
                    C6603d<K, V> c6603d3 = i < 0 ? c6603d2.f13795b : c6603d2.f13796c;
                    if (c6603d3 == null) {
                        break;
                    }
                    c6603d2 = c6603d3;
                } else {
                    return c6603d2;
                }
            }
        } else {
            i = 0;
        }
        if (z) {
            C6603d<K, V> c6603d4 = this.f13781c;
            if (c6603d2 == null) {
                if (comparator == f13777d && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                c6603d = new C6603d<>(c6603d2, k, c6603d4, c6603d4.f13798e);
                this.f13783f = c6603d;
            } else {
                c6603d = new C6603d<>(c6603d2, k, c6603d4, c6603d4.f13798e);
                if (i < 0) {
                    c6603d2.f13795b = c6603d;
                } else {
                    c6603d2.f13796c = c6603d;
                }
                m91577b(c6603d2, true);
            }
            this.f13779a++;
            this.f13780b++;
            return c6603d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private C6603d<K, V> m91576b(Object obj) {
        if (obj != 0) {
            try {
                return m91580a((LinkedTreeMap<K, V>) obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13783f = null;
        this.f13779a = 0;
        this.f13780b++;
        C6603d<K, V> c6603d = this.f13781c;
        c6603d.f13798e = c6603d;
        c6603d.f13797d = c6603d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (m91576b(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.C6598a c6598a = this.f13784g;
        if (c6598a != null) {
            return c6598a;
        }
        LinkedTreeMap<K, V>.C6598a c6598a2 = new C6598a();
        this.f13784g = c6598a2;
        return c6598a2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        C6603d<K, V> m91576b = m91576b(obj);
        if (m91576b != null) {
            return m91576b.f13800g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedTreeMap<K, V>.C6600b c6600b = this.f13785h;
        if (c6600b != null) {
            return c6600b;
        }
        LinkedTreeMap<K, V>.C6600b c6600b2 = new C6600b();
        this.f13785h = c6600b2;
        return c6600b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k != null) {
            C6603d<K, V> m91580a = m91580a((LinkedTreeMap<K, V>) k, true);
            V v2 = m91580a.f13800g;
            m91580a.f13800g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        C6603d<K, V> m91581a = m91581a(obj);
        if (m91581a != null) {
            return m91581a.f13800g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13779a;
    }

    private LinkedTreeMap(Comparator<? super K> comparator) {
        this.f13779a = 0;
        this.f13780b = 0;
        this.f13781c = new C6603d<>();
        this.f13782e = comparator == null ? f13777d : comparator;
    }

    /* renamed from: b */
    private void m91577b(C6603d<K, V> c6603d, boolean z) {
        while (c6603d != null) {
            C6603d<K, V> c6603d2 = c6603d.f13795b;
            C6603d<K, V> c6603d3 = c6603d.f13796c;
            int i = c6603d2 != null ? c6603d2.f13801h : 0;
            int i2 = c6603d3 != null ? c6603d3.f13801h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C6603d<K, V> c6603d4 = c6603d3.f13795b;
                C6603d<K, V> c6603d5 = c6603d3.f13796c;
                int i4 = (c6603d4 != null ? c6603d4.f13801h : 0) - (c6603d5 != null ? c6603d5.f13801h : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    if (!f13778i && i4 != 1) {
                        throw new AssertionError();
                    }
                    m91578b((C6603d) c6603d3);
                    m91584a((C6603d) c6603d);
                } else {
                    m91584a((C6603d) c6603d);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C6603d<K, V> c6603d6 = c6603d2.f13795b;
                C6603d<K, V> c6603d7 = c6603d2.f13796c;
                int i5 = (c6603d6 != null ? c6603d6.f13801h : 0) - (c6603d7 != null ? c6603d7.f13801h : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    if (!f13778i && i5 != -1) {
                        throw new AssertionError();
                    }
                    m91584a((C6603d) c6603d2);
                    m91578b((C6603d) c6603d);
                } else {
                    m91578b((C6603d) c6603d);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c6603d.f13801h = i + 1;
                if (z) {
                    return;
                }
            } else if (!f13778i && i3 != -1 && i3 != 1) {
                throw new AssertionError();
            } else {
                c6603d.f13801h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c6603d = c6603d.f13794a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.g$d */
    /* loaded from: classes3.dex */
    public static final class C6603d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C6603d<K, V> f13794a;

        /* renamed from: b */
        C6603d<K, V> f13795b;

        /* renamed from: c */
        C6603d<K, V> f13796c;

        /* renamed from: d */
        C6603d<K, V> f13797d;

        /* renamed from: e */
        C6603d<K, V> f13798e;

        /* renamed from: f */
        final K f13799f;

        /* renamed from: g */
        V f13800g;

        /* renamed from: h */
        int f13801h;

        C6603d() {
            this.f13799f = null;
            this.f13798e = this;
            this.f13797d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f13799f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f13800g;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f13799f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f13800g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            K k = this.f13799f;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.f13800g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.f13800g;
            this.f13800g = v;
            return v2;
        }

        public final String toString() {
            return this.f13799f + "=" + this.f13800g;
        }

        C6603d(C6603d<K, V> c6603d, K k, C6603d<K, V> c6603d2, C6603d<K, V> c6603d3) {
            this.f13794a = c6603d;
            this.f13799f = k;
            this.f13801h = 1;
            this.f13797d = c6603d2;
            this.f13798e = c6603d3;
            c6603d3.f13797d = this;
            c6603d2.f13798e = this;
        }
    }

    /* renamed from: a */
    final C6603d<K, V> m91579a(Map.Entry<?, ?> entry) {
        C6603d<K, V> m91576b = m91576b(entry.getKey());
        boolean z = false;
        if (m91576b != null) {
            V v = m91576b.f13800g;
            Object value = entry.getValue();
            if (v == value || (v != null && v.equals(value))) {
                z = true;
            }
        }
        if (z) {
            return m91576b;
        }
        return null;
    }

    /* renamed from: a */
    final void m91582a(C6603d<K, V> c6603d, boolean z) {
        int i;
        if (z) {
            C6603d<K, V> c6603d2 = c6603d.f13798e;
            c6603d2.f13797d = c6603d.f13797d;
            c6603d.f13797d.f13798e = c6603d2;
        }
        C6603d<K, V> c6603d3 = c6603d.f13795b;
        C6603d<K, V> c6603d4 = c6603d.f13796c;
        C6603d<K, V> c6603d5 = c6603d.f13794a;
        int i2 = 0;
        if (c6603d3 != null && c6603d4 != null) {
            if (c6603d3.f13801h > c6603d4.f13801h) {
                C6603d<K, V> c6603d6 = c6603d3.f13796c;
                while (true) {
                    C6603d<K, V> c6603d7 = c6603d6;
                    c6603d4 = c6603d3;
                    c6603d3 = c6603d7;
                    if (c6603d3 == null) {
                        break;
                    }
                    c6603d6 = c6603d3.f13796c;
                }
            } else {
                while (true) {
                    C6603d<K, V> c6603d8 = c6603d4.f13795b;
                    if (c6603d8 == null) {
                        break;
                    }
                    c6603d4 = c6603d8;
                }
            }
            m91582a((C6603d) c6603d4, false);
            C6603d<K, V> c6603d9 = c6603d.f13795b;
            if (c6603d9 != null) {
                i = c6603d9.f13801h;
                c6603d4.f13795b = c6603d9;
                c6603d9.f13794a = c6603d4;
                c6603d.f13795b = null;
            } else {
                i = 0;
            }
            C6603d<K, V> c6603d10 = c6603d.f13796c;
            if (c6603d10 != null) {
                i2 = c6603d10.f13801h;
                c6603d4.f13796c = c6603d10;
                c6603d10.f13794a = c6603d4;
                c6603d.f13796c = null;
            }
            c6603d4.f13801h = Math.max(i, i2) + 1;
            m91583a(c6603d, c6603d4);
            return;
        }
        if (c6603d3 != null) {
            m91583a(c6603d, c6603d3);
            c6603d.f13795b = null;
        } else if (c6603d4 != null) {
            m91583a(c6603d, c6603d4);
            c6603d.f13796c = null;
        } else {
            m91583a(c6603d, (C6603d) null);
        }
        m91577b(c6603d5, false);
        this.f13779a--;
        this.f13780b++;
    }

    /* renamed from: b */
    private void m91578b(C6603d<K, V> c6603d) {
        C6603d<K, V> c6603d2 = c6603d.f13795b;
        C6603d<K, V> c6603d3 = c6603d.f13796c;
        C6603d<K, V> c6603d4 = c6603d2.f13795b;
        C6603d<K, V> c6603d5 = c6603d2.f13796c;
        c6603d.f13795b = c6603d5;
        if (c6603d5 != null) {
            c6603d5.f13794a = c6603d;
        }
        m91583a(c6603d, c6603d2);
        c6603d2.f13796c = c6603d;
        c6603d.f13794a = c6603d2;
        int max = Math.max(c6603d3 != null ? c6603d3.f13801h : 0, c6603d5 != null ? c6603d5.f13801h : 0) + 1;
        c6603d.f13801h = max;
        c6603d2.f13801h = Math.max(max, c6603d4 != null ? c6603d4.f13801h : 0) + 1;
    }

    /* renamed from: a */
    final C6603d<K, V> m91581a(Object obj) {
        C6603d<K, V> m91576b = m91576b(obj);
        if (m91576b != null) {
            m91582a((C6603d) m91576b, true);
        }
        return m91576b;
    }

    /* renamed from: a */
    private void m91583a(C6603d<K, V> c6603d, C6603d<K, V> c6603d2) {
        C6603d<K, V> c6603d3 = c6603d.f13794a;
        c6603d.f13794a = null;
        if (c6603d2 != null) {
            c6603d2.f13794a = c6603d3;
        }
        if (c6603d3 != null) {
            if (c6603d3.f13795b == c6603d) {
                c6603d3.f13795b = c6603d2;
                return;
            } else if (!f13778i && c6603d3.f13796c != c6603d) {
                throw new AssertionError();
            } else {
                c6603d3.f13796c = c6603d2;
                return;
            }
        }
        this.f13783f = c6603d2;
    }

    /* renamed from: a */
    private void m91584a(C6603d<K, V> c6603d) {
        C6603d<K, V> c6603d2 = c6603d.f13795b;
        C6603d<K, V> c6603d3 = c6603d.f13796c;
        C6603d<K, V> c6603d4 = c6603d3.f13795b;
        C6603d<K, V> c6603d5 = c6603d3.f13796c;
        c6603d.f13796c = c6603d4;
        if (c6603d4 != null) {
            c6603d4.f13794a = c6603d;
        }
        m91583a(c6603d, c6603d3);
        c6603d3.f13795b = c6603d;
        c6603d.f13794a = c6603d3;
        int max = Math.max(c6603d2 != null ? c6603d2.f13801h : 0, c6603d4 != null ? c6603d4.f13801h : 0) + 1;
        c6603d.f13801h = max;
        c6603d3.f13801h = Math.max(max, c6603d5 != null ? c6603d5.f13801h : 0) + 1;
    }
}
