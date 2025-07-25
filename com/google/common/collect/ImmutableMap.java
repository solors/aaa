package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* renamed from: g */
    static final Map.Entry<?, ?>[] f40045g = new Map.Entry[0];
    @RetainedWith
    @LazyInit

    /* renamed from: b */
    private transient ImmutableSet<Map.Entry<K, V>> f40046b;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient ImmutableSet<K> f40047c;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    private transient ImmutableCollection<V> f40048d;
    @LazyInit

    /* renamed from: f */
    private transient ImmutableSetMultimap<K, V> f40049f;

    @DoNotMock
    /* loaded from: classes4.dex */
    public static class Builder<K, V> {

        /* renamed from: a */
        Comparator<? super V> f40051a;

        /* renamed from: b */
        Object[] f40052b;

        /* renamed from: c */
        int f40053c;

        /* renamed from: d */
        boolean f40054d;

        /* renamed from: e */
        DuplicateKey f40055e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class DuplicateKey {

            /* renamed from: a */
            private final Object f40056a;

            /* renamed from: b */
            private final Object f40057b;

            /* renamed from: c */
            private final Object f40058c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.f40056a = obj;
                this.f40057b = obj2;
                this.f40058c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: a */
            public IllegalArgumentException m69382a() {
                String valueOf = String.valueOf(this.f40056a);
                String valueOf2 = String.valueOf(this.f40057b);
                String valueOf3 = String.valueOf(this.f40056a);
                String valueOf4 = String.valueOf(this.f40058c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(valueOf);
                sb2.append("=");
                sb2.append(valueOf2);
                sb2.append(" and ");
                sb2.append(valueOf3);
                sb2.append("=");
                sb2.append(valueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public Builder() {
            this(4);
        }

        /* renamed from: a */
        private ImmutableMap<K, V> m69386a(boolean z) {
            Object[] objArr;
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z && (duplicateKey2 = this.f40055e) != null) {
                throw duplicateKey2.m69382a();
            }
            int i = this.f40053c;
            if (this.f40051a == null) {
                objArr = this.f40052b;
            } else {
                if (this.f40054d) {
                    this.f40052b = Arrays.copyOf(this.f40052b, i * 2);
                }
                objArr = this.f40052b;
                if (!z) {
                    objArr = m69384c(objArr, this.f40053c);
                    if (objArr.length < this.f40052b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                m69383d(objArr, i, this.f40051a);
            }
            this.f40054d = true;
            RegularImmutableMap m68831m = RegularImmutableMap.m68831m(i, objArr, this);
            if (z && (duplicateKey = this.f40055e) != null) {
                throw duplicateKey.m69382a();
            }
            return m68831m;
        }

        /* renamed from: b */
        private void m69385b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f40052b;
            if (i2 > objArr.length) {
                this.f40052b = Arrays.copyOf(objArr, ImmutableCollection.Builder.m69431a(objArr.length, i2));
                this.f40054d = false;
            }
        }

        /* renamed from: c */
        private Object[] m69384c(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 = i5 + 1;
                    i3 = i6 + 1;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public static <V> void m69383d(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, Ordering.from(comparator).onResultOf(Maps.m69050P()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public ImmutableMap<K, V> build() {
            return buildOrThrow();
        }

        public ImmutableMap<K, V> buildKeepingLast() {
            return m69386a(false);
        }

        public ImmutableMap<K, V> buildOrThrow() {
            return m69386a(true);
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            boolean z;
            if (this.f40051a == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "valueComparator was already set");
            this.f40051a = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            m69385b(this.f40053c + 1);
            CollectPreconditions.m69728a(k, v);
            Object[] objArr = this.f40052b;
            int i = this.f40053c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f40053c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(int i) {
            this.f40052b = new Object[i * 2];
            this.f40053c = 0;
            this.f40054d = false;
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m69385b(this.f40053c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                put(entry);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: c */
        ImmutableSet<Map.Entry<K, V>> mo68836c() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                /* renamed from: m */
                ImmutableMap<K, V> mo69289m() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.mo69380l();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: d */
        public ImmutableSet<K> mo68835d() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: f */
        ImmutableCollection<V> mo68834f() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        /* renamed from: l */
        abstract UnmodifiableIterator<Map.Entry<K, V>> mo69380l();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* loaded from: classes4.dex */
    private final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        /* renamed from: d */
        public ImmutableSet<K> mo68835d() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: h */
        boolean mo69381h() {
            return ImmutableMap.this.mo69381h();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: i */
        boolean mo68833i() {
            return ImmutableMap.this.mo68833i();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        /* renamed from: l */
        UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> mo69380l() {
            final UnmodifiableIterator<Map.Entry<K, V>> it = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.m69330of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m69330of(obj2);
        }
    }

    /* loaded from: classes4.dex */
    static class SerializedForm<K, V> implements Serializable {

        /* renamed from: b */
        private final Object f40063b;

        /* renamed from: c */
        private final Object f40064c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f40063b = objArr;
            this.f40064c = objArr2;
        }

        /* renamed from: a */
        final Object m69379a() {
            Object[] objArr = (Object[]) this.f40063b;
            Object[] objArr2 = (Object[]) this.f40064c;
            Builder<K, V> mo69287b = mo69287b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                mo69287b.put((K) objArr[i], (V) objArr2[i]);
            }
            return mo69287b.buildOrThrow();
        }

        /* renamed from: b */
        Builder<K, V> mo69287b(int i) {
            return new Builder<>(i);
        }

        final Object readResolve() {
            Object obj = this.f40063b;
            if (!(obj instanceof ImmutableSet)) {
                return m69379a();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            Builder<K, V> mo69287b = mo69287b(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = ((ImmutableCollection) this.f40064c).iterator();
            while (it.hasNext()) {
                mo69287b.put((K) it.next(), (V) it2.next());
            }
            return mo69287b.buildOrThrow();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m69401a(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw m69400b(str, obj, obj2);
    }

    /* renamed from: b */
    static IllegalArgumentException m69400b(String str, Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + valueOf.length() + valueOf2.length());
        sb2.append("Multiple entries with same ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(valueOf);
        sb2.append(" and ");
        sb2.append(valueOf2);
        return new IllegalArgumentException(sb2.toString());
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
        CollectPreconditions.m69727b(i, "expectedSize");
        return new Builder<>(i);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.mo68833i()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static <K, V> Map.Entry<K, V> m69399g(K k, V v) {
        CollectPreconditions.m69728a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69397of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.f40602k;
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m69321of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.f40049f;
        if (immutableSetMultimap == null) {
            ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null);
            this.f40049f = immutableSetMultimap2;
            return immutableSetMultimap2;
        }
        return immutableSetMultimap;
    }

    /* renamed from: c */
    abstract ImmutableSet<Map.Entry<K, V>> mo68836c();

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    abstract ImmutableSet<K> mo68835d();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.m69031p(this, obj);
    }

    /* renamed from: f */
    abstract ImmutableCollection<V> mo68834f();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo69381h() {
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.m68786b(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract boolean mo68833i();

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public UnmodifiableIterator<K> mo69398j() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m69057I(this);
    }

    Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69396of(K k, V v) {
        CollectPreconditions.m69728a(k, v);
        return RegularImmutableMap.m68832l(1, new Object[]{k, v});
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f40046b;
        if (immutableSet == null) {
            ImmutableSet<Map.Entry<K, V>> mo68836c = mo68836c();
            this.f40046b = mo68836c;
            return mo68836c;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f40047c;
        if (immutableSet == null) {
            ImmutableSet<K> mo68835d = mo68835d();
            this.f40047c = mo68835d;
            return mo68835d;
        }
        return immutableSet;
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f40048d;
        if (immutableCollection == null) {
            ImmutableCollection<V> mo68834f = mo68834f();
            this.f40048d = mo68834f;
            return mo68834f;
        }
        return immutableCollection;
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69395of(K k, V v, K k2, V v2) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        return RegularImmutableMap.m68832l(2, new Object[]{k, v, k2, v2});
    }

    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69394of(K k, V v, K k2, V v2, K k3, V v3) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        return RegularImmutableMap.m68832l(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69393of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        return RegularImmutableMap.m68832l(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69392of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        return RegularImmutableMap.m68832l(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69391of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        return RegularImmutableMap.m68832l(6, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69390of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        return RegularImmutableMap.m68832l(7, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69389of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        CollectPreconditions.m69728a(k8, v8);
        return RegularImmutableMap.m68832l(8, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69388of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        CollectPreconditions.m69728a(k8, v8);
        CollectPreconditions.m69728a(k9, v9);
        return RegularImmutableMap.m68832l(9, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m69387of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        CollectPreconditions.m69728a(k8, v8);
        CollectPreconditions.m69728a(k9, v9);
        CollectPreconditions.m69728a(k10, v10);
        return RegularImmutableMap.m68832l(10, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }
}
