package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {

    /* renamed from: k */
    private static final Comparator<Comparable> f40148k = Ordering.natural();

    /* renamed from: l */
    private static final ImmutableSortedMap<Comparable, Object> f40149l = new ImmutableSortedMap<>(ImmutableSortedSet.m69256o(Ordering.natural()), ImmutableList.m69424of());

    /* renamed from: h */
    private final transient RegularImmutableSortedSet<K> f40150h;

    /* renamed from: i */
    private final transient ImmutableList<V> f40151i;

    /* renamed from: j */
    private transient ImmutableSortedMap<K, V> f40152j;

    /* loaded from: classes4.dex */
    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {

        /* renamed from: f */
        private transient Object[] f40156f;

        /* renamed from: g */
        private transient Object[] f40157g;

        /* renamed from: h */
        private final Comparator<? super K> f40158h;

        public Builder(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        /* renamed from: b */
        private void m69288b(int i) {
            Object[] objArr = this.f40156f;
            if (i > objArr.length) {
                int m69431a = ImmutableCollection.Builder.m69431a(objArr.length, i);
                this.f40156f = Arrays.copyOf(this.f40156f, m69431a);
                this.f40157g = Arrays.copyOf(this.f40157g, m69431a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
            return put((Builder<K, V>) obj, obj2);
        }

        private Builder(Comparator<? super K> comparator, int i) {
            this.f40158h = (Comparator) Preconditions.checkNotNull(comparator);
            this.f40156f = new Object[i];
            this.f40157g = new Object[i];
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public final ImmutableSortedMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> buildOrThrow() {
            int i = this.f40053c;
            if (i != 0) {
                if (i != 1) {
                    Object[] copyOf = Arrays.copyOf(this.f40156f, i);
                    Arrays.sort(copyOf, this.f40158h);
                    Object[] objArr = new Object[this.f40053c];
                    for (int i2 = 0; i2 < this.f40053c; i2++) {
                        if (i2 > 0) {
                            int i3 = i2 - 1;
                            if (this.f40158h.compare(copyOf[i3], copyOf[i2]) == 0) {
                                String valueOf = String.valueOf(copyOf[i3]);
                                String valueOf2 = String.valueOf(copyOf[i2]);
                                StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
                                sb2.append("keys required to be distinct but compared as equal: ");
                                sb2.append(valueOf);
                                sb2.append(" and ");
                                sb2.append(valueOf2);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                        Object obj = this.f40156f[i2];
                        Objects.requireNonNull(obj);
                        int binarySearch = Arrays.binarySearch(copyOf, obj, this.f40158h);
                        Object obj2 = this.f40157g[i2];
                        Objects.requireNonNull(obj2);
                        objArr[binarySearch] = obj2;
                    }
                    return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m69428f(copyOf), this.f40158h), ImmutableList.m69428f(objArr));
                }
                Comparator<? super K> comparator = this.f40158h;
                Object obj3 = this.f40156f[0];
                Objects.requireNonNull(obj3);
                Object obj4 = this.f40157g[0];
                Objects.requireNonNull(obj4);
                return ImmutableSortedMap.m69290u(comparator, obj3, obj4);
            }
            return ImmutableSortedMap.m69295p(this.f40158h);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @Beta
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        @CanIgnoreReturnValue
        public final Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            m69288b(this.f40053c + 1);
            CollectPreconditions.m69728a(k, v);
            Object[] objArr = this.f40156f;
            int i = this.f40053c;
            objArr[i] = k;
            this.f40157g[i] = v;
            this.f40053c = i + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {

        /* renamed from: d */
        private final Comparator<? super K> f40159d;

        SerializedForm(ImmutableSortedMap<K, V> immutableSortedMap) {
            super(immutableSortedMap);
            this.f40159d = immutableSortedMap.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* renamed from: c */
        public Builder<K, V> mo69287b(int i) {
            return new Builder<>(this.f40159d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return m69307o(map, (Ordering) f40148k);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f40148k;
        }
        if (sortedMap instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.mo68833i()) {
                return immutableSortedMap;
            }
        }
        return m69294q(comparator, true, sortedMap.entrySet());
    }

    public static <K extends Comparable<?>, V> Builder<K, V> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    /* renamed from: o */
    private static <K, V> ImmutableSortedMap<K, V> m69307o(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean equals;
        boolean z = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 == null) {
                if (comparator == f40148k) {
                    equals = true;
                }
            } else {
                equals = comparator.equals(comparator2);
            }
            z = equals;
        }
        if (z && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.mo68833i()) {
                return immutableSortedMap;
            }
        }
        return m69294q(comparator, z, map.entrySet());
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m69306of() {
        return (ImmutableSortedMap<K, V>) f40149l;
    }

    public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator) {
        return new Builder<>(comparator);
    }

    /* renamed from: p */
    static <K, V> ImmutableSortedMap<K, V> m69295p(Comparator<? super K> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return m69306of();
        }
        return new ImmutableSortedMap<>(ImmutableSortedSet.m69256o(comparator), ImmutableList.m69424of());
    }

    /* renamed from: q */
    private static <K, V> ImmutableSortedMap<K, V> m69294q(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) Iterables.m69227g(iterable, ImmutableMap.f40045g);
        return m69293r(comparator, z, entryArr, entryArr.length);
    }

    /* renamed from: r */
    private static <K, V> ImmutableSortedMap<K, V> m69293r(final Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i) {
        boolean z2;
        if (i != 0) {
            if (i != 1) {
                Object[] objArr = new Object[i];
                Object[] objArr2 = new Object[i];
                if (z) {
                    for (int i2 = 0; i2 < i; i2++) {
                        Map.Entry<K, V> entry = entryArr[i2];
                        Objects.requireNonNull(entry);
                        Map.Entry<K, V> entry2 = entry;
                        K key = entry2.getKey();
                        V value = entry2.getValue();
                        CollectPreconditions.m69728a(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                    }
                } else {
                    Arrays.sort(entryArr, 0, i, new Comparator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1
                        @Override // java.util.Comparator
                        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                            return compare((Map.Entry) ((Map.Entry) obj), (Map.Entry) ((Map.Entry) obj2));
                        }

                        public int compare(Map.Entry<K, V> entry3, Map.Entry<K, V> entry4) {
                            Objects.requireNonNull(entry3);
                            Objects.requireNonNull(entry4);
                            return comparator.compare(entry3.getKey(), entry4.getKey());
                        }
                    });
                    Map.Entry<K, V> entry3 = entryArr[0];
                    Objects.requireNonNull(entry3);
                    Map.Entry<K, V> entry4 = entry3;
                    Object key2 = entry4.getKey();
                    objArr[0] = key2;
                    V value2 = entry4.getValue();
                    objArr2[0] = value2;
                    CollectPreconditions.m69728a(objArr[0], value2);
                    int i3 = 1;
                    while (i3 < i) {
                        Map.Entry<K, V> entry5 = entryArr[i3 - 1];
                        Objects.requireNonNull(entry5);
                        Map.Entry<K, V> entry6 = entry5;
                        Map.Entry<K, V> entry7 = entryArr[i3];
                        Objects.requireNonNull(entry7);
                        Map.Entry<K, V> entry8 = entry7;
                        Object key3 = entry8.getKey();
                        V value3 = entry8.getValue();
                        CollectPreconditions.m69728a(key3, value3);
                        objArr[i3] = key3;
                        objArr2[i3] = value3;
                        if (comparator.compare(key2, key3) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ImmutableMap.m69401a(z2, "key", entry6, entry8);
                        i3++;
                        key2 = key3;
                    }
                }
                return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m69428f(objArr), comparator), ImmutableList.m69428f(objArr2));
            }
            Map.Entry<K, V> entry9 = entryArr[0];
            Objects.requireNonNull(entry9);
            Map.Entry<K, V> entry10 = entry9;
            return m69290u(comparator, entry10.getKey(), entry10.getValue());
        }
        return m69295p(comparator);
    }

    public static <K extends Comparable<?>, V> Builder<K, V> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    /* renamed from: s */
    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m69292s(Map.Entry<K, V>... entryArr) {
        return m69293r(Ordering.natural(), false, entryArr, entryArr.length);
    }

    /* renamed from: t */
    private ImmutableSortedMap<K, V> m69291t(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return m69295p(comparator());
        }
        return new ImmutableSortedMap<>(this.f40150h.m68812u(i, i2), this.f40151i.subList(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static <K, V> ImmutableSortedMap<K, V> m69290u(Comparator<? super K> comparator, K k, V v) {
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m69423of(k), (Comparator) Preconditions.checkNotNull(comparator)), ImmutableList.m69423of(v));
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: c */
    ImmutableSet<Map.Entry<K, V>> mo68836c() {
        if (isEmpty()) {
            return ImmutableSet.m69331of();
        }
        return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableSet
            /* renamed from: j */
            public ImmutableList<Map.Entry<K, V>> mo68824j() {
                return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.ImmutableCollection
                    public boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }

                    @Override // java.util.List
                    public Map.Entry<K, V> get(int i) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f40150h.asList().get(i), ImmutableSortedMap.this.f40151i.get(i));
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            /* renamed from: m */
            ImmutableMap<K, V> mo69289m() {
                return ImmutableSortedMap.this;
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }
        };
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap((ImmutableSortedMap<K, V>) k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return (K) Maps.m69023x(ceilingEntry(k));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: d */
    ImmutableSet<K> mo68835d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: f */
    ImmutableCollection<V> mo68834f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap((ImmutableSortedMap<K, V>) k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return (K) Maps.m69023x(floorEntry(k));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        int indexOf = this.f40150h.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.f40151i.get(indexOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return headMap((ImmutableSortedMap<K, V>) obj, z);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap((ImmutableSortedMap<K, V>) k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return (K) Maps.m69023x(higherEntry(k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: i */
    public boolean mo68833i() {
        if (!this.f40150h.isPartialView() && !this.f40151i.isPartialView()) {
            return false;
        }
        return true;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap((ImmutableSortedMap<K, V>) k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return (K) Maps.m69023x(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f40151i.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return subMap((boolean) obj, z, (boolean) obj2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return tailMap((ImmutableSortedMap<K, V>) obj, z);
    }

    @Override // com.google.common.collect.ImmutableMap
    Object writeReplace() {
        return new SerializedForm(this);
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f40150h = regularImmutableSortedSet;
        this.f40151i = immutableList;
        this.f40152j = immutableSortedMap;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69305of(Comparable comparable, Object obj) {
        return m69290u(Ordering.natural(), comparable, obj);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.f40150h.descendingSet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f40152j;
        if (immutableSortedMap == null) {
            if (isEmpty()) {
                return m69295p(Ordering.from(comparator()).reverse());
            }
            return new ImmutableSortedMap<>((RegularImmutableSortedSet) this.f40150h.descendingSet(), this.f40151i.reverse(), this);
        }
        return immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap((ImmutableSortedMap<K, V>) obj);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.f40150h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap((ImmutableSortedMap<K, V>) obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        return this.f40151i;
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return m69307o(map, (Comparator) Preconditions.checkNotNull(comparator));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69304of(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K k) {
        return headMap((ImmutableSortedMap<K, V>) k, false);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
        return this.f40150h;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap((boolean) k, true, (boolean) k2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap((ImmutableSortedMap<K, V>) k, true);
    }

    @Beta
    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (Ordering) f40148k);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69303of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return m69291t(0, this.f40150h.m68811v(Preconditions.checkNotNull(k), z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(k2);
        Preconditions.checkArgument(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap((ImmutableSortedMap<K, V>) k2, z2).tailMap((ImmutableSortedMap<K, V>) k, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return m69291t(this.f40150h.m68810w(Preconditions.checkNotNull(k), z), size());
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69302of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3), ImmutableMap.m69399g(comparable4, obj4));
    }

    @Beta
    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return m69294q((Comparator) Preconditions.checkNotNull(comparator), false, iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69301of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3), ImmutableMap.m69399g(comparable4, obj4), ImmutableMap.m69399g(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69300of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3), ImmutableMap.m69399g(comparable4, obj4), ImmutableMap.m69399g(comparable5, obj5), ImmutableMap.m69399g(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69299of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3), ImmutableMap.m69399g(comparable4, obj4), ImmutableMap.m69399g(comparable5, obj5), ImmutableMap.m69399g(comparable6, obj6), ImmutableMap.m69399g(comparable7, obj7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69298of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3), ImmutableMap.m69399g(comparable4, obj4), ImmutableMap.m69399g(comparable5, obj5), ImmutableMap.m69399g(comparable6, obj6), ImmutableMap.m69399g(comparable7, obj7), ImmutableMap.m69399g(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69297of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3), ImmutableMap.m69399g(comparable4, obj4), ImmutableMap.m69399g(comparable5, obj5), ImmutableMap.m69399g(comparable6, obj6), ImmutableMap.m69399g(comparable7, obj7), ImmutableMap.m69399g(comparable8, obj8), ImmutableMap.m69399g(comparable9, obj9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m69296of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9, Comparable comparable10, Object obj10) {
        return m69292s(ImmutableMap.m69399g(comparable, obj), ImmutableMap.m69399g(comparable2, obj2), ImmutableMap.m69399g(comparable3, obj3), ImmutableMap.m69399g(comparable4, obj4), ImmutableMap.m69399g(comparable5, obj5), ImmutableMap.m69399g(comparable6, obj6), ImmutableMap.m69399g(comparable7, obj7), ImmutableMap.m69399g(comparable8, obj8), ImmutableMap.m69399g(comparable9, obj9), ImmutableMap.m69399g(comparable10, obj10));
    }
}
