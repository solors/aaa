package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {

    /* renamed from: b */
    transient K[] f39988b;

    /* renamed from: c */
    transient V[] f39989c;

    /* renamed from: d */
    transient int f39990d;

    /* renamed from: f */
    transient int f39991f;

    /* renamed from: g */
    private transient int[] f39992g;

    /* renamed from: h */
    private transient int[] f39993h;

    /* renamed from: i */
    private transient int[] f39994i;

    /* renamed from: j */
    private transient int[] f39995j;

    /* renamed from: k */
    private transient int f39996k;

    /* renamed from: l */
    private transient int f39997l;

    /* renamed from: m */
    private transient int[] f39998m;

    /* renamed from: n */
    private transient int[] f39999n;

    /* renamed from: o */
    private transient Set<K> f40000o;

    /* renamed from: p */
    private transient Set<V> f40001p;

    /* renamed from: q */
    private transient Set<Map.Entry<K, V>> f40002q;
    @RetainedWith
    @LazyInit

    /* renamed from: r */
    private transient BiMap<V, K> f40003r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class EntryForKey extends AbstractMapEntry<K, V> {
        @ParametricNullness

        /* renamed from: b */
        final K f40004b;

        /* renamed from: c */
        int f40005c;

        EntryForKey(int i) {
            this.f40004b = (K) NullnessCasts.m68906a(HashBiMap.this.f39988b[i]);
            this.f40005c = i;
        }

        /* renamed from: a */
        void m69459a() {
            int i = this.f40005c;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.f39990d && Objects.equal(hashBiMap.f39988b[i], this.f40004b)) {
                    return;
                }
            }
            this.f40005c = HashBiMap.this.m69471o(this.f40004b);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.f40004b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            m69459a();
            int i = this.f40005c;
            if (i == -1) {
                return (V) NullnessCasts.m68905b();
            }
            return (V) NullnessCasts.m68906a(HashBiMap.this.f39989c[i]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            m69459a();
            int i = this.f40005c;
            if (i == -1) {
                HashBiMap.this.put(this.f40004b, v);
                return (V) NullnessCasts.m68905b();
            }
            V v2 = (V) NullnessCasts.m68906a(HashBiMap.this.f39989c[i]);
            if (!Objects.equal(v2, v)) {
                HashBiMap.this.m69485F(this.f40005c, v, false);
                return v2;
            }
            return v;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {

        /* renamed from: b */
        final HashBiMap<K, V> f40007b;
        @ParametricNullness

        /* renamed from: c */
        final V f40008c;

        /* renamed from: d */
        int f40009d;

        EntryForValue(HashBiMap<K, V> hashBiMap, int i) {
            this.f40007b = hashBiMap;
            this.f40008c = (V) NullnessCasts.m68906a(hashBiMap.f39989c[i]);
            this.f40009d = i;
        }

        /* renamed from: a */
        private void m69458a() {
            int i = this.f40009d;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.f40007b;
                if (i <= hashBiMap.f39990d && Objects.equal(this.f40008c, hashBiMap.f39989c[i])) {
                    return;
                }
            }
            this.f40009d = this.f40007b.m69469q(this.f40008c);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.f40008c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            m69458a();
            int i = this.f40009d;
            if (i == -1) {
                return (K) NullnessCasts.m68905b();
            }
            return (K) NullnessCasts.m68906a(this.f40007b.f39988b[i]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k) {
            m69458a();
            int i = this.f40009d;
            if (i == -1) {
                this.f40007b.m69461y(this.f40008c, k, false);
                return (K) NullnessCasts.m68905b();
            }
            K k2 = (K) NullnessCasts.m68906a(this.f40007b.f39988b[i]);
            if (!Objects.equal(k2, k)) {
                this.f40007b.m69486E(this.f40009d, k, false);
                return k2;
            }
            return k;
        }
    }

    /* loaded from: classes4.dex */
    final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m69471o = HashBiMap.this.m69471o(key);
            if (m69471o == -1 || !Objects.equal(value, HashBiMap.this.f39989c[m69471o])) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        /* renamed from: d */
        public Map.Entry<K, V> mo69455c(int i) {
            return new EntryForKey(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int m69450d = Hashing.m69450d(key);
                int m69470p = HashBiMap.this.m69470p(key, m69450d);
                if (m69470p != -1 && Objects.equal(value, HashBiMap.this.f39989c[m69470p])) {
                    HashBiMap.this.m69489B(m69470p, m69450d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {

        /* renamed from: b */
        private final HashBiMap<K, V> f40011b;

        /* renamed from: c */
        private transient Set<Map.Entry<V, K>> f40012c;

        Inverse(HashBiMap<K, V> hashBiMap) {
            this.f40011b = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.f40011b).f40003r = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f40011b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f40011b.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f40011b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f40012c;
            if (set == null) {
                InverseEntrySet inverseEntrySet = new InverseEntrySet(this.f40011b);
                this.f40012c = inverseEntrySet;
                return inverseEntrySet;
            }
            return set;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K forcePut(@ParametricNullness V v, @ParametricNullness K k) {
            return this.f40011b.m69461y(v, k, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.f40011b.m69467s(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.f40011b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f40011b.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K put(@ParametricNullness V v, @ParametricNullness K k) {
            return this.f40011b.m69461y(v, k, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        public K remove(Object obj) {
            return this.f40011b.m69487D(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f40011b.f39990d;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.f40011b.keySet();
        }
    }

    /* loaded from: classes4.dex */
    static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m69469q = this.f40015b.m69469q(key);
            if (m69469q == -1 || !Objects.equal(this.f40015b.f39988b[m69469q], value)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        /* renamed from: d */
        public Map.Entry<V, K> mo69455c(int i) {
            return new EntryForValue(this.f40015b, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int m69450d = Hashing.m69450d(key);
                int m69468r = this.f40015b.m69468r(key, m69450d);
                if (m69468r != -1 && Objects.equal(this.f40015b.f39988b[m69468r], value)) {
                    this.f40015b.m69488C(m69468r, m69450d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class KeySet extends View<K, V, K> {
        KeySet() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        /* renamed from: c */
        K mo69455c(int i) {
            return (K) NullnessCasts.m68906a(HashBiMap.this.f39988b[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m69450d = Hashing.m69450d(obj);
            int m69470p = HashBiMap.this.m69470p(obj, m69450d);
            if (m69470p != -1) {
                HashBiMap.this.m69489B(m69470p, m69450d);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class ValueSet extends View<K, V, V> {
        ValueSet() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        /* renamed from: c */
        V mo69455c(int i) {
            return (V) NullnessCasts.m68906a(HashBiMap.this.f39989c[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m69450d = Hashing.m69450d(obj);
            int m69468r = HashBiMap.this.m69468r(obj, m69450d);
            if (m69468r != -1) {
                HashBiMap.this.m69488C(m69468r, m69450d);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class View<K, V, T> extends AbstractSet<T> {

        /* renamed from: b */
        final HashBiMap<K, V> f40015b;

        View(HashBiMap<K, V> hashBiMap) {
            this.f40015b = hashBiMap;
        }

        @ParametricNullness
        /* renamed from: c */
        abstract T mo69455c(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f40015b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1

                /* renamed from: b */
                private int f40016b;

                /* renamed from: c */
                private int f40017c = -1;

                /* renamed from: d */
                private int f40018d;

                /* renamed from: f */
                private int f40019f;

                {
                    this.f40016b = ((HashBiMap) View.this.f40015b).f39996k;
                    HashBiMap<K, V> hashBiMap = View.this.f40015b;
                    this.f40018d = hashBiMap.f39991f;
                    this.f40019f = hashBiMap.f39990d;
                }

                /* renamed from: a */
                private void m69454a() {
                    if (View.this.f40015b.f39991f == this.f40018d) {
                        return;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    m69454a();
                    if (this.f40016b != -2 && this.f40019f > 0) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (hasNext()) {
                        T t = (T) View.this.mo69455c(this.f40016b);
                        this.f40017c = this.f40016b;
                        this.f40016b = ((HashBiMap) View.this.f40015b).f39999n[this.f40016b];
                        this.f40019f--;
                        return t;
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public void remove() {
                    boolean z;
                    m69454a();
                    if (this.f40017c != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    CollectPreconditions.m69724e(z);
                    View.this.f40015b.m69460z(this.f40017c);
                    int i = this.f40016b;
                    HashBiMap<K, V> hashBiMap = View.this.f40015b;
                    if (i == hashBiMap.f39990d) {
                        this.f40016b = this.f40017c;
                    }
                    this.f40017c = -1;
                    this.f40018d = hashBiMap.f39991f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f40015b.f39990d;
        }
    }

    private HashBiMap(int i) {
        m69466t(i);
    }

    /* renamed from: A */
    private void m69490A(int i, int i2, int i3) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        m69476i(i, i2);
        m69475j(i, i3);
        m69484G(this.f39998m[i], this.f39999n[i]);
        m69463w(this.f39990d - 1, i);
        K[] kArr = this.f39988b;
        int i4 = this.f39990d;
        kArr[i4 - 1] = null;
        this.f39989c[i4 - 1] = null;
        this.f39990d = i4 - 1;
        this.f39991f++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m69486E(int i, @ParametricNullness K k, boolean z) {
        boolean z2;
        int i2;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        int m69450d = Hashing.m69450d(k);
        int m69470p = m69470p(k, m69450d);
        int i3 = this.f39997l;
        if (m69470p != -1) {
            if (z) {
                i3 = this.f39998m[m69470p];
                i2 = this.f39999n[m69470p];
                m69489B(m69470p, m69450d);
                if (i == this.f39990d) {
                    i = m69470p;
                }
            } else {
                String valueOf = String.valueOf(k);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
                sb2.append("Key already present in map: ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            i2 = -2;
        }
        if (i3 == i) {
            i3 = this.f39998m[i];
        } else if (i3 == this.f39990d) {
            i3 = m69470p;
        }
        if (i2 == i) {
            m69470p = this.f39999n[i];
        } else if (i2 != this.f39990d) {
            m69470p = i2;
        }
        m69484G(this.f39998m[i], this.f39999n[i]);
        m69476i(i, Hashing.m69450d(this.f39988b[i]));
        this.f39988b[i] = k;
        m69465u(i, Hashing.m69450d(k));
        m69484G(i3, i);
        m69484G(i, m69470p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m69485F(int i, @ParametricNullness V v, boolean z) {
        boolean z2;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        int m69450d = Hashing.m69450d(v);
        int m69468r = m69468r(v, m69450d);
        if (m69468r != -1) {
            if (z) {
                m69488C(m69468r, m69450d);
                if (i == this.f39990d) {
                    i = m69468r;
                }
            } else {
                String valueOf = String.valueOf(v);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 30);
                sb2.append("Value already present in map: ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        m69475j(i, Hashing.m69450d(this.f39989c[i]));
        this.f39989c[i] = v;
        m69464v(i, m69450d);
    }

    /* renamed from: G */
    private void m69484G(int i, int i2) {
        if (i == -2) {
            this.f39996k = i2;
        } else {
            this.f39999n[i] = i2;
        }
        if (i2 == -2) {
            this.f39997l = i;
        } else {
            this.f39998m[i2] = i;
        }
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    /* renamed from: g */
    private int m69478g(int i) {
        return i & (this.f39992g.length - 1);
    }

    /* renamed from: h */
    private static int[] m69477h(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: i */
    private void m69476i(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int m69478g = m69478g(i2);
        int[] iArr = this.f39992g;
        int i3 = iArr[m69478g];
        if (i3 == i) {
            int[] iArr2 = this.f39994i;
            iArr[m69478g] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f39994i[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.f39994i;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.f39994i[i3];
            } else {
                String valueOf = String.valueOf(this.f39988b[i]);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
                sb2.append("Expected to find entry with key ");
                sb2.append(valueOf);
                throw new AssertionError(sb2.toString());
            }
        }
    }

    /* renamed from: j */
    private void m69475j(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int m69478g = m69478g(i2);
        int[] iArr = this.f39993h;
        int i3 = iArr[m69478g];
        if (i3 == i) {
            int[] iArr2 = this.f39995j;
            iArr[m69478g] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f39995j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.f39995j;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.f39995j[i3];
            } else {
                String valueOf = String.valueOf(this.f39989c[i]);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                sb2.append("Expected to find entry with value ");
                sb2.append(valueOf);
                throw new AssertionError(sb2.toString());
            }
        }
    }

    /* renamed from: l */
    private void m69474l(int i) {
        int[] iArr = this.f39994i;
        if (iArr.length < i) {
            int m69431a = ImmutableCollection.Builder.m69431a(iArr.length, i);
            this.f39988b = (K[]) Arrays.copyOf(this.f39988b, m69431a);
            this.f39989c = (V[]) Arrays.copyOf(this.f39989c, m69431a);
            this.f39994i = m69473m(this.f39994i, m69431a);
            this.f39995j = m69473m(this.f39995j, m69431a);
            this.f39998m = m69473m(this.f39998m, m69431a);
            this.f39999n = m69473m(this.f39999n, m69431a);
        }
        if (this.f39992g.length < i) {
            int m69453a = Hashing.m69453a(i, 1.0d);
            this.f39992g = m69477h(m69453a);
            this.f39993h = m69477h(m69453a);
            for (int i2 = 0; i2 < this.f39990d; i2++) {
                int m69478g = m69478g(Hashing.m69450d(this.f39988b[i2]));
                int[] iArr2 = this.f39994i;
                int[] iArr3 = this.f39992g;
                iArr2[i2] = iArr3[m69478g];
                iArr3[m69478g] = i2;
                int m69478g2 = m69478g(Hashing.m69450d(this.f39989c[i2]));
                int[] iArr4 = this.f39995j;
                int[] iArr5 = this.f39993h;
                iArr4[i2] = iArr5[m69478g2];
                iArr5[m69478g2] = i2;
            }
        }
    }

    /* renamed from: m */
    private static int[] m69473m(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int m68793h = Serialization.m68793h(objectInputStream);
        m69466t(16);
        Serialization.m68798c(this, objectInputStream, m68793h);
    }

    /* renamed from: u */
    private void m69465u(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int m69478g = m69478g(i2);
        int[] iArr = this.f39994i;
        int[] iArr2 = this.f39992g;
        iArr[i] = iArr2[m69478g];
        iArr2[m69478g] = i;
    }

    /* renamed from: v */
    private void m69464v(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int m69478g = m69478g(i2);
        int[] iArr = this.f39995j;
        int[] iArr2 = this.f39993h;
        iArr[i] = iArr2[m69478g];
        iArr2[m69478g] = i;
    }

    /* renamed from: w */
    private void m69463w(int i, int i2) {
        int i3;
        int i4;
        if (i == i2) {
            return;
        }
        int i5 = this.f39998m[i];
        int i6 = this.f39999n[i];
        m69484G(i5, i2);
        m69484G(i2, i6);
        K[] kArr = this.f39988b;
        K k = kArr[i];
        V[] vArr = this.f39989c;
        V v = vArr[i];
        kArr[i2] = k;
        vArr[i2] = v;
        int m69478g = m69478g(Hashing.m69450d(k));
        int[] iArr = this.f39992g;
        int i7 = iArr[m69478g];
        if (i7 == i) {
            iArr[m69478g] = i2;
        } else {
            int i8 = this.f39994i[i7];
            while (true) {
                i3 = i7;
                i7 = i8;
                if (i7 == i) {
                    break;
                }
                i8 = this.f39994i[i7];
            }
            this.f39994i[i3] = i2;
        }
        int[] iArr2 = this.f39994i;
        iArr2[i2] = iArr2[i];
        iArr2[i] = -1;
        int m69478g2 = m69478g(Hashing.m69450d(v));
        int[] iArr3 = this.f39993h;
        int i9 = iArr3[m69478g2];
        if (i9 == i) {
            iArr3[m69478g2] = i2;
        } else {
            int i10 = this.f39995j[i9];
            while (true) {
                i4 = i9;
                i9 = i10;
                if (i9 == i) {
                    break;
                }
                i10 = this.f39995j[i9];
            }
            this.f39995j[i4] = i2;
        }
        int[] iArr4 = this.f39995j;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.m68792i(this, objectOutputStream);
    }

    /* renamed from: B */
    void m69489B(int i, int i2) {
        m69490A(i, i2, Hashing.m69450d(this.f39989c[i]));
    }

    /* renamed from: C */
    void m69488C(int i, int i2) {
        m69490A(i, Hashing.m69450d(this.f39988b[i]), i2);
    }

    /* renamed from: D */
    K m69487D(Object obj) {
        int m69450d = Hashing.m69450d(obj);
        int m69468r = m69468r(obj, m69450d);
        if (m69468r == -1) {
            return null;
        }
        K k = this.f39988b[m69468r];
        m69488C(m69468r, m69450d);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f39988b, 0, this.f39990d, (Object) null);
        Arrays.fill(this.f39989c, 0, this.f39990d, (Object) null);
        Arrays.fill(this.f39992g, -1);
        Arrays.fill(this.f39993h, -1);
        Arrays.fill(this.f39994i, 0, this.f39990d, -1);
        Arrays.fill(this.f39995j, 0, this.f39990d, -1);
        Arrays.fill(this.f39998m, 0, this.f39990d, -1);
        Arrays.fill(this.f39999n, 0, this.f39990d, -1);
        this.f39990d = 0;
        this.f39996k = -2;
        this.f39997l = -2;
        this.f39991f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (m69471o(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (m69469q(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f40002q;
        if (set == null) {
            EntrySet entrySet = new EntrySet();
            this.f40002q = entrySet;
            return entrySet;
        }
        return set;
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
        return m69462x(k, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int m69471o = m69471o(obj);
        if (m69471o == -1) {
            return null;
        }
        return this.f39989c[m69471o];
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.f40003r;
        if (biMap == null) {
            Inverse inverse = new Inverse(this);
            this.f40003r = inverse;
            return inverse;
        }
        return biMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f40000o;
        if (set == null) {
            KeySet keySet = new KeySet();
            this.f40000o = keySet;
            return keySet;
        }
        return set;
    }

    /* renamed from: n */
    int m69472n(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m69478g(i)];
        while (i2 != -1) {
            if (Objects.equal(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* renamed from: o */
    int m69471o(Object obj) {
        return m69470p(obj, Hashing.m69450d(obj));
    }

    /* renamed from: p */
    int m69470p(Object obj, int i) {
        return m69472n(obj, i, this.f39992g, this.f39994i, this.f39988b);
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return m69462x(k, v, false);
    }

    /* renamed from: q */
    int m69469q(Object obj) {
        return m69468r(obj, Hashing.m69450d(obj));
    }

    /* renamed from: r */
    int m69468r(Object obj, int i) {
        return m69472n(obj, i, this.f39993h, this.f39995j, this.f39989c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        int m69450d = Hashing.m69450d(obj);
        int m69470p = m69470p(obj, m69450d);
        if (m69470p == -1) {
            return null;
        }
        V v = this.f39989c[m69470p];
        m69489B(m69470p, m69450d);
        return v;
    }

    /* renamed from: s */
    K m69467s(Object obj) {
        int m69469q = m69469q(obj);
        if (m69469q == -1) {
            return null;
        }
        return this.f39988b[m69469q];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f39990d;
    }

    /* renamed from: t */
    void m69466t(int i) {
        CollectPreconditions.m69727b(i, "expectedSize");
        int m69453a = Hashing.m69453a(i, 1.0d);
        this.f39990d = 0;
        this.f39988b = (K[]) new Object[i];
        this.f39989c = (V[]) new Object[i];
        this.f39992g = m69477h(m69453a);
        this.f39993h = m69477h(m69453a);
        this.f39994i = m69477h(i);
        this.f39995j = m69477h(i);
        this.f39996k = -2;
        this.f39997l = -2;
        this.f39998m = m69477h(i);
        this.f39999n = m69477h(i);
    }

    /* renamed from: x */
    V m69462x(@ParametricNullness K k, @ParametricNullness V v, boolean z) {
        boolean z2;
        int m69450d = Hashing.m69450d(k);
        int m69470p = m69470p(k, m69450d);
        if (m69470p != -1) {
            V v2 = this.f39989c[m69470p];
            if (Objects.equal(v2, v)) {
                return v;
            }
            m69485F(m69470p, v, z);
            return v2;
        }
        int m69450d2 = Hashing.m69450d(v);
        int m69468r = m69468r(v, m69450d2);
        if (z) {
            if (m69468r != -1) {
                m69488C(m69468r, m69450d2);
            }
        } else {
            if (m69468r == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Value already present: %s", v);
        }
        m69474l(this.f39990d + 1);
        K[] kArr = this.f39988b;
        int i = this.f39990d;
        kArr[i] = k;
        this.f39989c[i] = v;
        m69465u(i, m69450d);
        m69464v(this.f39990d, m69450d2);
        m69484G(this.f39997l, this.f39990d);
        m69484G(this.f39990d, -2);
        this.f39990d++;
        this.f39991f++;
        return null;
    }

    @CanIgnoreReturnValue
    /* renamed from: y */
    K m69461y(@ParametricNullness V v, @ParametricNullness K k, boolean z) {
        boolean z2;
        int i;
        int m69450d = Hashing.m69450d(v);
        int m69468r = m69468r(v, m69450d);
        if (m69468r != -1) {
            K k2 = this.f39988b[m69468r];
            if (Objects.equal(k2, k)) {
                return k;
            }
            m69486E(m69468r, k, z);
            return k2;
        }
        int i2 = this.f39997l;
        int m69450d2 = Hashing.m69450d(k);
        int m69470p = m69470p(k, m69450d2);
        if (z) {
            if (m69470p != -1) {
                i2 = this.f39998m[m69470p];
                m69489B(m69470p, m69450d2);
            }
        } else {
            if (m69470p == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Key already present: %s", k);
        }
        m69474l(this.f39990d + 1);
        K[] kArr = this.f39988b;
        int i3 = this.f39990d;
        kArr[i3] = k;
        this.f39989c[i3] = v;
        m69465u(i3, m69450d2);
        m69464v(this.f39990d, m69450d);
        if (i2 == -2) {
            i = this.f39996k;
        } else {
            i = this.f39999n[i2];
        }
        m69484G(i2, this.f39990d);
        m69484G(this.f39990d, i);
        this.f39990d++;
        this.f39991f++;
        return null;
    }

    /* renamed from: z */
    void m69460z(int i) {
        m69489B(i, Hashing.m69450d(this.f39988b[i]));
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.f40001p;
        if (set == null) {
            ValueSet valueSet = new ValueSet();
            this.f40001p = valueSet;
            return valueSet;
        }
        return set;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }
}
