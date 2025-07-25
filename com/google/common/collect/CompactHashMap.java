package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: l */
    private static final Object f39836l = new Object();

    /* renamed from: b */
    private transient Object f39837b;
    @VisibleForTesting

    /* renamed from: c */
    transient int[] f39838c;
    @VisibleForTesting

    /* renamed from: d */
    transient Object[] f39839d;
    @VisibleForTesting

    /* renamed from: f */
    transient Object[] f39840f;

    /* renamed from: g */
    private transient int f39841g;

    /* renamed from: h */
    private transient int f39842h;

    /* renamed from: i */
    private transient Set<K> f39843i;

    /* renamed from: j */
    private transient Set<Map.Entry<K, V>> f39844j;

    /* renamed from: k */
    private transient Collection<V> f39845k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> m69671x = CompactHashMap.this.m69671x();
            if (m69671x != null) {
                return m69671x.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m69704E = CompactHashMap.this.m69704E(entry.getKey());
            if (m69704E == -1 || !Objects.equal(CompactHashMap.this.m69689X(m69704E), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.m69669z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m69671x = CompactHashMap.this.m69671x();
            if (m69671x != null) {
                return m69671x.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!CompactHashMap.this.m69701K()) {
                int m69706C = CompactHashMap.this.m69706C();
                int m69639f = CompactHashing.m69639f(entry.getKey(), entry.getValue(), m69706C, CompactHashMap.this.m69697O(), CompactHashMap.this.m69699M(), CompactHashMap.this.m69698N(), CompactHashMap.this.m69696P());
                if (m69639f == -1) {
                    return false;
                }
                CompactHashMap.this.mo69630J(m69639f, m69706C);
                CompactHashMap.m69683f(CompactHashMap.this);
                CompactHashMap.this.m69705D();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* loaded from: classes4.dex */
    private abstract class Itr<T> implements Iterator<T> {

        /* renamed from: b */
        int f39850b;

        /* renamed from: c */
        int f39851c;

        /* renamed from: d */
        int f39852d;

        private Itr() {
            this.f39850b = CompactHashMap.this.f39841g;
            this.f39851c = CompactHashMap.this.mo69634A();
            this.f39852d = -1;
        }

        /* renamed from: a */
        private void m69667a() {
            if (CompactHashMap.this.f39841g == this.f39850b) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @ParametricNullness
        /* renamed from: b */
        abstract T mo69666b(int i);

        /* renamed from: c */
        void m69665c() {
            this.f39850b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f39851c >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            m69667a();
            if (hasNext()) {
                int i = this.f39851c;
                this.f39852d = i;
                T mo69666b = mo69666b(i);
                this.f39851c = CompactHashMap.this.mo69633B(this.f39851c);
                return mo69666b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m69667a();
            if (this.f39852d >= 0) {
                z = true;
            } else {
                z = false;
            }
            CollectPreconditions.m69724e(z);
            m69665c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.m69703H(this.f39852d));
            this.f39851c = CompactHashMap.this.mo69620q(this.f39851c, this.f39852d);
            this.f39852d = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class KeySetView extends AbstractSet<K> {
        KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.m69702I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m69671x = CompactHashMap.this.m69671x();
            if (m69671x != null) {
                return m69671x.keySet().remove(obj);
            }
            if (CompactHashMap.this.m69700L(obj) != CompactHashMap.f39836l) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class MapEntry extends AbstractMapEntry<K, V> {
        @ParametricNullness

        /* renamed from: b */
        private final K f39855b;

        /* renamed from: c */
        private int f39856c;

        MapEntry(int i) {
            this.f39855b = (K) CompactHashMap.this.m69703H(i);
            this.f39856c = i;
        }

        /* renamed from: a */
        private void m69664a() {
            int i = this.f39856c;
            if (i == -1 || i >= CompactHashMap.this.size() || !Objects.equal(this.f39855b, CompactHashMap.this.m69703H(this.f39856c))) {
                this.f39856c = CompactHashMap.this.m69704E(this.f39855b);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.f39855b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            Map<K, V> m69671x = CompactHashMap.this.m69671x();
            if (m69671x != null) {
                return (V) NullnessCasts.m68906a(m69671x.get(this.f39855b));
            }
            m69664a();
            int i = this.f39856c;
            if (i != -1) {
                return (V) CompactHashMap.this.m69689X(i);
            }
            return (V) NullnessCasts.m68905b();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            Map<K, V> m69671x = CompactHashMap.this.m69671x();
            if (m69671x != null) {
                return (V) NullnessCasts.m68906a(m69671x.put(this.f39855b, v));
            }
            m69664a();
            int i = this.f39856c;
            if (i != -1) {
                V v2 = (V) CompactHashMap.this.m69689X(i);
                CompactHashMap.this.m69690W(this.f39856c, v);
                return v2;
            }
            CompactHashMap.this.put(this.f39855b, v);
            return (V) NullnessCasts.m68905b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class ValuesView extends AbstractCollection<V> {
        ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.m69688Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    CompactHashMap() {
        mo69632F(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public int m69706C() {
        return (1 << (this.f39841g & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public int m69704E(Object obj) {
        if (m69701K()) {
            return -1;
        }
        int m69450d = Hashing.m69450d(obj);
        int m69706C = m69706C();
        int m69637h = CompactHashing.m69637h(m69697O(), m69450d & m69706C);
        if (m69637h == 0) {
            return -1;
        }
        int m69643b = CompactHashing.m69643b(m69450d, m69706C);
        do {
            int i = m69637h - 1;
            int m69670y = m69670y(i);
            if (CompactHashing.m69643b(m69670y, m69706C) == m69643b && Objects.equal(obj, m69703H(i))) {
                return i;
            }
            m69637h = CompactHashing.m69642c(m69670y, m69706C);
        } while (m69637h != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public K m69703H(int i) {
        return (K) m69698N()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public Object m69700L(Object obj) {
        if (m69701K()) {
            return f39836l;
        }
        int m69706C = m69706C();
        int m69639f = CompactHashing.m69639f(obj, null, m69706C, m69697O(), m69699M(), m69698N(), null);
        if (m69639f == -1) {
            return f39836l;
        }
        V m69689X = m69689X(m69639f);
        mo69630J(m69639f, m69706C);
        this.f39842h--;
        m69705D();
        return m69689X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public int[] m69699M() {
        int[] iArr = this.f39838c;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public Object[] m69698N() {
        Object[] objArr = this.f39839d;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public Object m69697O() {
        Object obj = this.f39837b;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public Object[] m69696P() {
        Object[] objArr = this.f39840f;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: R */
    private void m69695R(int i) {
        int min;
        int length = m69699M().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            mo69629Q(min);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: S */
    private int m69694S(int i, int i2, int i3, int i4) {
        Object m69644a = CompactHashing.m69644a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.m69636i(m69644a, i3 & i5, i4 + 1);
        }
        Object m69697O = m69697O();
        int[] m69699M = m69699M();
        for (int i6 = 0; i6 <= i; i6++) {
            int m69637h = CompactHashing.m69637h(m69697O, i6);
            while (m69637h != 0) {
                int i7 = m69637h - 1;
                int i8 = m69699M[i7];
                int m69643b = CompactHashing.m69643b(i8, i) | i6;
                int i9 = m69643b & i5;
                int m69637h2 = CompactHashing.m69637h(m69644a, i9);
                CompactHashing.m69636i(m69644a, i9, m69637h);
                m69699M[i7] = CompactHashing.m69641d(m69643b, m69637h2, i5);
                m69637h = CompactHashing.m69642c(i8, i);
            }
        }
        this.f39837b = m69644a;
        m69692U(i5);
        return i5;
    }

    /* renamed from: T */
    private void m69693T(int i, int i2) {
        m69699M()[i] = i2;
    }

    /* renamed from: U */
    private void m69692U(int i) {
        this.f39841g = CompactHashing.m69641d(this.f39841g, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* renamed from: V */
    private void m69691V(int i, K k) {
        m69698N()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m69690W(int i, V v) {
        m69696P()[i] = v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public V m69689X(int i) {
        return (V) m69696P()[i];
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap<>(i);
    }

    /* renamed from: f */
    static /* synthetic */ int m69683f(CompactHashMap compactHashMap) {
        int i = compactHashMap.f39842h;
        compactHashMap.f39842h = i - 1;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo69632F(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid size: ");
        sb2.append(readInt);
        throw new InvalidObjectException(sb2.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> m69669z = m69669z();
        while (m69669z.hasNext()) {
            Map.Entry<K, V> next = m69669z.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* renamed from: y */
    private int m69670y(int i) {
        return m69699M()[i];
    }

    /* renamed from: A */
    int mo69634A() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* renamed from: B */
    int mo69633B(int i) {
        int i2 = i + 1;
        if (i2 >= this.f39842h) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m69705D() {
        this.f39841g += 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo69632F(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected size must be >= 0");
        this.f39841g = Ints.constrainToRange(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo69631G(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
        m69693T(i, CompactHashing.m69641d(i2, 0, i3));
        m69691V(i, k);
        m69690W(i, v);
    }

    /* renamed from: I */
    Iterator<K> m69702I() {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.keySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.1
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            /* renamed from: b */
            K mo69666b(int i) {
                return (K) CompactHashMap.this.m69703H(i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo69630J(int i, int i2) {
        Object m69697O = m69697O();
        int[] m69699M = m69699M();
        Object[] m69698N = m69698N();
        Object[] m69696P = m69696P();
        int size = size() - 1;
        if (i < size) {
            Object obj = m69698N[size];
            m69698N[i] = obj;
            m69696P[i] = m69696P[size];
            m69698N[size] = null;
            m69696P[size] = null;
            m69699M[i] = m69699M[size];
            m69699M[size] = 0;
            int m69450d = Hashing.m69450d(obj) & i2;
            int m69637h = CompactHashing.m69637h(m69697O, m69450d);
            int i3 = size + 1;
            if (m69637h == i3) {
                CompactHashing.m69636i(m69697O, m69450d, i + 1);
                return;
            }
            while (true) {
                int i4 = m69637h - 1;
                int i5 = m69699M[i4];
                int m69642c = CompactHashing.m69642c(i5, i2);
                if (m69642c == i3) {
                    m69699M[i4] = CompactHashing.m69641d(i5, i + 1, i2);
                    return;
                }
                m69637h = m69642c;
            }
        } else {
            m69698N[i] = null;
            m69696P[i] = null;
            m69699M[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: K */
    public boolean m69701K() {
        if (this.f39837b == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo69629Q(int i) {
        this.f39838c = Arrays.copyOf(m69699M(), i);
        this.f39839d = Arrays.copyOf(m69698N(), i);
        this.f39840f = Arrays.copyOf(m69696P(), i);
    }

    /* renamed from: Y */
    Iterator<V> m69688Y() {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.values().iterator();
        }
        return new CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.3
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            /* renamed from: b */
            V mo69666b(int i) {
                return (V) CompactHashMap.this.m69689X(i);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m69701K()) {
            return;
        }
        m69705D();
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            this.f39841g = Ints.constrainToRange(size(), 3, 1073741823);
            m69671x.clear();
            this.f39837b = null;
            this.f39842h = 0;
            return;
        }
        Arrays.fill(m69698N(), 0, this.f39842h, (Object) null);
        Arrays.fill(m69696P(), 0, this.f39842h, (Object) null);
        CompactHashing.m69638g(m69697O());
        Arrays.fill(m69699M(), 0, this.f39842h, 0);
        this.f39842h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.containsKey(obj);
        }
        if (m69704E(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.containsValue(obj);
        }
        for (int i = 0; i < this.f39842h; i++) {
            if (Objects.equal(obj, m69689X(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f39844j;
        if (set == null) {
            Set<Map.Entry<K, V>> m69674t = m69674t();
            this.f39844j = m69674t;
            return m69674t;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.get(obj);
        }
        int m69704E = m69704E(obj);
        if (m69704E == -1) {
            return null;
        }
        mo69621p(m69704E);
        return m69689X(m69704E);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f39843i;
        if (set == null) {
            Set<K> m69673v = m69673v();
            this.f39843i = m69673v;
            return m69673v;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        int m69694S;
        int i;
        if (m69701K()) {
            mo69619r();
        }
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.put(k, v);
        }
        int[] m69699M = m69699M();
        Object[] m69698N = m69698N();
        Object[] m69696P = m69696P();
        int i2 = this.f39842h;
        int i3 = i2 + 1;
        int m69450d = Hashing.m69450d(k);
        int m69706C = m69706C();
        int i4 = m69450d & m69706C;
        int m69637h = CompactHashing.m69637h(m69697O(), i4);
        if (m69637h == 0) {
            if (i3 > m69706C) {
                m69694S = m69694S(m69706C, CompactHashing.m69640e(m69706C), m69450d, i2);
                i = m69694S;
            } else {
                CompactHashing.m69636i(m69697O(), i4, i3);
                i = m69706C;
            }
        } else {
            int m69643b = CompactHashing.m69643b(m69450d, m69706C);
            int i5 = 0;
            while (true) {
                int i6 = m69637h - 1;
                int i7 = m69699M[i6];
                if (CompactHashing.m69643b(i7, m69706C) == m69643b && Objects.equal(k, m69698N[i6])) {
                    V v2 = (V) m69696P[i6];
                    m69696P[i6] = v;
                    mo69621p(i6);
                    return v2;
                }
                int m69642c = CompactHashing.m69642c(i7, m69706C);
                i5++;
                if (m69642c == 0) {
                    if (i5 >= 9) {
                        return mo69618s().put(k, v);
                    }
                    if (i3 > m69706C) {
                        m69694S = m69694S(m69706C, CompactHashing.m69640e(m69706C), m69450d, i2);
                    } else {
                        m69699M[i6] = CompactHashing.m69641d(i7, i3, m69706C);
                    }
                } else {
                    m69637h = m69642c;
                }
            }
        }
        m69695R(i3);
        mo69631G(i2, k, v, m69450d, i);
        this.f39842h = i3;
        m69705D();
        return null;
    }

    /* renamed from: q */
    int mo69620q(int i, int i2) {
        return i - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: r */
    public int mo69619r() {
        Preconditions.checkState(m69701K(), "Arrays already allocated");
        int i = this.f39841g;
        int m69635j = CompactHashing.m69635j(i);
        this.f39837b = CompactHashing.m69644a(m69635j);
        m69692U(m69635j - 1);
        this.f39838c = new int[i];
        this.f39839d = new Object[i];
        this.f39840f = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.remove(obj);
        }
        V v = (V) m69700L(obj);
        if (v == f39836l) {
            return null;
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    @CanIgnoreReturnValue
    /* renamed from: s */
    public Map<K, V> mo69618s() {
        Map<K, V> mo69617u = mo69617u(m69706C() + 1);
        int mo69634A = mo69634A();
        while (mo69634A >= 0) {
            mo69617u.put(m69703H(mo69634A), m69689X(mo69634A));
            mo69634A = mo69633B(mo69634A);
        }
        this.f39837b = mo69617u;
        this.f39838c = null;
        this.f39839d = null;
        this.f39840f = null;
        m69705D();
        return mo69617u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.size();
        }
        return this.f39842h;
    }

    /* renamed from: t */
    Set<Map.Entry<K, V>> m69674t() {
        return new EntrySetView();
    }

    public void trimToSize() {
        if (m69701K()) {
            return;
        }
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            Map<K, V> mo69617u = mo69617u(size());
            mo69617u.putAll(m69671x);
            this.f39837b = mo69617u;
            return;
        }
        int i = this.f39842h;
        if (i < m69699M().length) {
            mo69629Q(i);
        }
        int m69635j = CompactHashing.m69635j(i);
        int m69706C = m69706C();
        if (m69635j < m69706C) {
            m69694S(m69706C, m69635j, 0, 0);
        }
    }

    /* renamed from: u */
    Map<K, V> mo69617u(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* renamed from: v */
    Set<K> m69673v() {
        return new KeySetView();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f39845k;
        if (collection == null) {
            Collection<V> m69672w = m69672w();
            this.f39845k = m69672w;
            return m69672w;
        }
        return collection;
    }

    /* renamed from: w */
    Collection<V> m69672w() {
        return new ValuesView();
    }

    @VisibleForTesting
    /* renamed from: x */
    Map<K, V> m69671x() {
        Object obj = this.f39837b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: z */
    Iterator<Map.Entry<K, V>> m69669z() {
        Map<K, V> m69671x = m69671x();
        if (m69671x != null) {
            return m69671x.entrySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.CompactHashMap.Itr
            /* renamed from: d */
            public Map.Entry<K, V> mo69666b(int i) {
                return new MapEntry(i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompactHashMap(int i) {
        mo69632F(i);
    }

    /* renamed from: p */
    void mo69621p(int i) {
    }
}
