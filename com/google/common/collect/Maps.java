package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import com.ironsource.C20517nb;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Maps {

    /* loaded from: classes4.dex */
    public static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {

        /* renamed from: f */
        final Map<K, V> f40397f;

        /* renamed from: g */
        final Predicate<? super Map.Entry<K, V>> f40398g;

        AbstractFilteredMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            this.f40397f = map;
            this.f40398g = predicate;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        Collection<V> mo68744a() {
            return new FilteredMapValues(this, this.f40397f, this.f40398g);
        }

        /* renamed from: b */
        boolean m69017b(Object obj, @ParametricNullness V v) {
            return this.f40398g.apply(Maps.immutableEntry(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (this.f40397f.containsKey(obj) && m69017b(obj, this.f40397f.get(obj))) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v = this.f40397f.get(obj);
            if (v == null || !m69017b(obj, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(@ParametricNullness K k, @ParametricNullness V v) {
            Preconditions.checkArgument(m69017b(k, v));
            return this.f40397f.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                Preconditions.checkArgument(m69017b(entry.getKey(), entry.getValue()));
            }
            this.f40397f.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.f40397f.remove(obj);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {

        /* renamed from: f */
        private final Set<K> f40399f;

        /* renamed from: g */
        final Function<? super K, V> f40400g;

        AsMapView(Set<K> set, Function<? super K, V> function) {
            this.f40399f = (Set) Preconditions.checkNotNull(set);
            this.f40400g = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        Collection<V> mo68744a() {
            return Collections2.transform(this.f40399f, this.f40400g);
        }

        /* renamed from: b */
        Set<K> mo69000b() {
            return this.f40399f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            mo69000b().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return mo69000b().contains(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, V>> createEntrySet() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                {
                    AsMapView.this = this;
                }

                @Override // com.google.common.collect.Maps.EntrySet
                /* renamed from: c */
                Map<K, V> mo68588c() {
                    return AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return Maps.m69038i(AsMapView.this.mo69000b(), AsMapView.this.f40400g);
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
            return Maps.m69062D(mo69000b());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (Collections2.m69718f(mo69000b(), obj)) {
                return this.f40400g.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (mo69000b().remove(obj)) {
                return this.f40400g.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return mo69000b().size();
        }
    }

    /* loaded from: classes4.dex */
    private static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {

        /* renamed from: d */
        private final BiMap<A, B> f40402d;

        BiMapConverter(BiMap<A, B> biMap) {
            this.f40402d = (BiMap) Preconditions.checkNotNull(biMap);
        }

        /* renamed from: h */
        private static <X, Y> Y m69016h(BiMap<X, Y> biMap, X x) {
            boolean z;
            Y y = biMap.get(x);
            if (y != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "No non-null mapping present for input: %s", x);
            return y;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: d */
        protected A mo67968d(B b) {
            return (A) m69016h(this.f40402d.inverse(), b);
        }

        @Override // com.google.common.base.Converter
        /* renamed from: e */
        protected B mo67967e(A a) {
            return (B) m69016h(this.f40402d, a);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.f40402d.equals(((BiMapConverter) obj).f40402d);
            }
            return false;
        }

        public int hashCode() {
            return this.f40402d.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f40402d);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
            sb2.append("Maps.asConverter(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        /* renamed from: b */
        private transient Comparator<? super K> f40403b;

        /* renamed from: c */
        private transient Set<Map.Entry<K, V>> f40404c;

        /* renamed from: d */
        private transient NavigableSet<K> f40405d;

        /* renamed from: g */
        private static <T> Ordering<T> m69012g(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        /* renamed from: c */
        Set<Map.Entry<K, V>> m69015c() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                {
                    DescendingMap.this = this;
                }

                @Override // com.google.common.collect.Maps.EntrySet
                /* renamed from: c */
                Map<K, V> mo68588c() {
                    return DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return DescendingMap.this.mo69014d();
                }
            };
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
            return mo69013f().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
            return mo69013f().floorKey(k);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f40403b;
            if (comparator == null) {
                Comparator<? super K> comparator2 = mo69013f().comparator();
                if (comparator2 == null) {
                    comparator2 = Ordering.natural();
                }
                Ordering m69012g = m69012g(comparator2);
                this.f40403b = m69012g;
                return m69012g;
            }
            return comparator;
        }

        /* renamed from: d */
        abstract Iterator<Map.Entry<K, V>> mo69014d();

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo69013f().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return mo69013f();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f40404c;
            if (set == null) {
                Set<Map.Entry<K, V>> m69015c = m69015c();
                this.f40404c = m69015c;
                return m69015c;
            }
            return set;
        }

        /* renamed from: f */
        abstract NavigableMap<K, V> mo69013f();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return mo69013f().lastEntry();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return mo69013f().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
            return mo69013f().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
            return mo69013f().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return mo69013f().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
            return mo69013f().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
            return mo69013f().lowerKey(k);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return mo69013f().firstEntry();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return mo69013f().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
            return mo69013f().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
            return mo69013f().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f40405d;
            if (navigableSet == null) {
                NavigableKeySet navigableKeySet = new NavigableKeySet(this);
                this.f40405d = navigableKeySet;
                return navigableKeySet;
            }
            return navigableSet;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return mo69013f().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return mo69013f().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return mo69013f().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return mo69013f().headMap(k, z).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
            return new Values(this);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<K, V> delegate() {
            return mo69013f();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }
    }

    /* loaded from: classes4.dex */
    public enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        /* renamed from: c */
        abstract Map<K, V> mo68588c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo68588c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object m69059G = Maps.m69059G(mo68588c(), key);
            if (!Objects.equal(m69059G, entry.getValue())) {
                return false;
            }
            if (m69059G == null && !mo68588c().containsKey(key)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo68588c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return mo68588c().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.m68783e(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        newHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo68588c().keySet().retainAll(newHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo68588c().size();
        }
    }

    /* loaded from: classes4.dex */
    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(@ParametricNullness K k, @ParametricNullness V1 v1);
    }

    /* loaded from: classes4.dex */
    public static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {
        @RetainedWith

        /* renamed from: i */
        private final BiMap<V, K> f40408i;

        FilteredEntryBiMap(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
            super(biMap, predicate);
            this.f40408i = new FilteredEntryBiMap(biMap.inverse(), m69010f(predicate), this);
        }

        /* renamed from: f */
        private static <K, V> Predicate<Map.Entry<V, K>> m69010f(final Predicate<? super Map.Entry<K, V>> predicate) {
            return new Predicate<Map.Entry<V, K>>() { // from class: com.google.common.collect.Maps.FilteredEntryBiMap.1
                @Override // com.google.common.base.Predicate
                public /* bridge */ /* synthetic */ boolean apply(Object obj) {
                    return apply((Map.Entry) ((Map.Entry) obj));
                }

                public boolean apply(Map.Entry<V, K> entry) {
                    return predicate.apply(Maps.immutableEntry(entry.getValue(), entry.getKey()));
                }
            };
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
            Preconditions.checkArgument(m69017b(k, v));
            return m69009g().forcePut(k, v);
        }

        /* renamed from: g */
        BiMap<K, V> m69009g() {
            return (BiMap) this.f40397f;
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            return this.f40408i;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
            return this.f40408i.keySet();
        }

        private FilteredEntryBiMap(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate, BiMap<V, K> biMap2) {
            super(biMap, predicate);
            this.f40408i = biMap2;
        }
    }

    /* loaded from: classes4.dex */
    public static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {

        /* renamed from: h */
        final Set<Map.Entry<K, V>> f40410h;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            private EntrySet() {
                FilteredEntryMap.this = r1;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>>(FilteredEntryMap.this.f40410h.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    {
                        EntrySet.this = this;
                    }

                    @Override // com.google.common.collect.TransformedIterator
                    /* renamed from: b */
                    public Map.Entry<K, V> mo68681a(final Map.Entry<K, V> entry) {
                        return new ForwardingMapEntry<K, V>() { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1
                            {
                                C168181.this = this;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            /* renamed from: c */
                            public Map.Entry<K, V> delegate() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            @ParametricNullness
                            public V setValue(@ParametricNullness V v) {
                                Preconditions.checkArgument(FilteredEntryMap.this.m69017b(getKey(), v));
                                return (V) super.setValue(v);
                            }
                        };
                    }
                };
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            /* renamed from: j */
            public Set<Map.Entry<K, V>> delegate() {
                return FilteredEntryMap.this.f40410h;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class KeySet extends KeySet<K, V> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            KeySet() {
                super(r1);
                FilteredEntryMap.this = r1;
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (FilteredEntryMap.this.containsKey(obj)) {
                    FilteredEntryMap.this.f40397f.remove(obj);
                    return true;
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.m69008c(filteredEntryMap.f40397f, filteredEntryMap.f40398g, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.m69007d(filteredEntryMap.f40397f, filteredEntryMap.f40398g, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
            }
        }

        FilteredEntryMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map, predicate);
            this.f40410h = Sets.filter(map.entrySet(), this.f40398g);
        }

        /* renamed from: c */
        static <K, V> boolean m69008c(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: d */
        static <K, V> boolean m69007d(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, V>> createEntrySet() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<K> createKeySet() {
            return new KeySet();
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {

        /* renamed from: b */
        private final NavigableMap<K, V> f40416b;

        /* renamed from: c */
        private final Predicate<? super Map.Entry<K, V>> f40417c;

        /* renamed from: d */
        private final Map<K, V> f40418d;

        FilteredEntryNavigableMap(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
            this.f40416b = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.f40417c = predicate;
            this.f40418d = new FilteredEntryMap(navigableMap, predicate);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo68575a() {
            return Iterators.filter(this.f40416b.entrySet().iterator(), this.f40417c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        /* renamed from: b */
        Iterator<Map.Entry<K, V>> mo68574b() {
            return Iterators.filter(this.f40416b.descendingMap().entrySet().iterator(), this.f40417c);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f40418d.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f40416b.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f40418d.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.filterEntries((NavigableMap) this.f40416b.descendingMap(), (Predicate) this.f40417c);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f40418d.entrySet();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return this.f40418d.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return Maps.filterEntries((NavigableMap) this.f40416b.headMap(k, z), (Predicate) this.f40417c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !Iterables.any(this.f40416b.entrySet(), this.f40417c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new NavigableKeySet<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                {
                    FilteredEntryNavigableMap.this = this;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMap.m69008c(FilteredEntryNavigableMap.this.f40416b, FilteredEntryNavigableMap.this.f40417c, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMap.m69007d(FilteredEntryNavigableMap.this.f40416b, FilteredEntryNavigableMap.this.f40417c, collection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) Iterables.m69231c(this.f40416b.entrySet(), this.f40417c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) Iterables.m69231c(this.f40416b.descendingMap().entrySet(), this.f40417c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(@ParametricNullness K k, @ParametricNullness V v) {
            return this.f40418d.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f40418d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return this.f40418d.remove(obj);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f40418d.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.filterEntries((NavigableMap) this.f40416b.subMap(k, z, k2, z2), (Predicate) this.f40417c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.filterEntries((NavigableMap) this.f40416b.tailMap(k, z), (Predicate) this.f40417c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new FilteredMapValues(this, this.f40416b, this.f40417c);
        }
    }

    /* loaded from: classes4.dex */
    public static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        /* loaded from: classes4.dex */
        public class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            SortedKeySet() {
                super();
                FilteredEntrySortedMap.this = r1;
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
                return FilteredEntrySortedMap.this.m69002g().comparator();
            }

            @Override // java.util.SortedSet
            @ParametricNullness
            public K first() {
                return (K) FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@ParametricNullness K k) {
                return (SortedSet) FilteredEntrySortedMap.this.headMap(k).keySet();
            }

            @Override // java.util.SortedSet
            @ParametricNullness
            public K last() {
                return (K) FilteredEntrySortedMap.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
                return (SortedSet) FilteredEntrySortedMap.this.subMap(k, k2).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@ParametricNullness K k) {
                return (SortedSet) FilteredEntrySortedMap.this.tailMap(k).keySet();
            }
        }

        FilteredEntrySortedMap(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
            super(sortedMap, predicate);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return m69002g().comparator();
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: f */
        public SortedSet<K> createKeySet() {
            return new SortedKeySet();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return keySet().iterator().next();
        }

        /* renamed from: g */
        SortedMap<K, V> m69002g() {
            return (SortedMap) this.f40397f;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return new FilteredEntrySortedMap(m69002g().headMap(k), this.f40398g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            SortedMap<K, V> m69002g = m69002g();
            while (true) {
                K lastKey = m69002g.lastKey();
                if (m69017b(lastKey, NullnessCasts.m68906a(this.f40397f.get(lastKey)))) {
                    return lastKey;
                }
                m69002g = m69002g().headMap(lastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return new FilteredEntrySortedMap(m69002g().subMap(k, k2), this.f40398g);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return new FilteredEntrySortedMap(m69002g().tailMap(k), this.f40398g);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {

        /* renamed from: h */
        final Predicate<? super K> f40421h;

        FilteredKeyMap(Map<K, V> map, Predicate<? super K> predicate, Predicate<? super Map.Entry<K, V>> predicate2) {
            super(map, predicate2);
            this.f40421h = predicate;
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (this.f40397f.containsKey(obj) && this.f40421h.apply(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, V>> createEntrySet() {
            return Sets.filter(this.f40397f.entrySet(), this.f40398g);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<K> createKeySet() {
            return Sets.filter(this.f40397f.keySet(), this.f40421h);
        }
    }

    /* loaded from: classes4.dex */
    private static final class FilteredMapValues<K, V> extends Values<K, V> {

        /* renamed from: c */
        final Map<K, V> f40422c;

        /* renamed from: d */
        final Predicate<? super Map.Entry<K, V>> f40423d;

        FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map);
            this.f40422c = map2;
            this.f40423d = predicate;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f40422c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f40423d.apply(next) && Objects.equal(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f40422c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f40423d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f40422c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f40423d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        /* renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo68575a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.m69223c(mo68575a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                {
                    IteratorBasedAbstractMap.this = this;
                }

                @Override // com.google.common.collect.Maps.EntrySet
                /* renamed from: c */
                Map<K, V> mo68588c() {
                    return IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedAbstractMap.this.mo68575a();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* loaded from: classes4.dex */
    public static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {
        @Weak

        /* renamed from: b */
        final Map<K, V> f40425b;

        public KeySet(Map<K, V> map) {
            this.f40425b = (Map) Preconditions.checkNotNull(map);
        }

        /* renamed from: c */
        public Map<K, V> mo68998c() {
            return this.f40425b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo68998c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo68998c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo68998c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.m69024w(mo68998c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                mo68998c().remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo68998c().size();
        }
    }

    /* loaded from: classes4.dex */
    public static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {

        /* renamed from: a */
        final Map<K, V> f40426a;

        /* renamed from: b */
        final Map<K, V> f40427b;

        /* renamed from: c */
        final Map<K, V> f40428c;

        /* renamed from: d */
        final Map<K, MapDifference.ValueDifference<V>> f40429d;

        MapDifferenceImpl(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, MapDifference.ValueDifference<V>> map4) {
            this.f40426a = Maps.m69052N(map);
            this.f40427b = Maps.m69052N(map2);
            this.f40428c = Maps.m69052N(map3);
            this.f40429d = Maps.m69052N(map4);
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
            if (this.f40426a.isEmpty() && this.f40427b.isEmpty() && this.f40429d.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return this.f40429d;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesInCommon() {
            return this.f40428c;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnLeft() {
            return this.f40426a;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnRight() {
            return this.f40427b;
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            MapDifference mapDifference = (MapDifference) obj;
            if (entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) && entriesInCommon().equals(mapDifference.entriesInCommon()) && entriesDiffering().equals(mapDifference.entriesDiffering())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
            return Objects.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb2 = new StringBuilder("not equal");
            if (!this.f40426a.isEmpty()) {
                sb2.append(": only on left=");
                sb2.append(this.f40426a);
            }
            if (!this.f40427b.isEmpty()) {
                sb2.append(": only on right=");
                sb2.append(this.f40427b);
            }
            if (!this.f40429d.isEmpty()) {
                sb2.append(": value differences=");
                sb2.append(this.f40429d);
            }
            return sb2.toString();
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {

        /* renamed from: b */
        private final NavigableSet<K> f40430b;

        /* renamed from: c */
        private final Function<? super K, V> f40431c;

        NavigableAsMapView(NavigableSet<K> navigableSet, Function<? super K, V> function) {
            this.f40430b = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.f40431c = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo68575a() {
            return Maps.m69038i(this.f40430b, this.f40431c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        /* renamed from: b */
        Iterator<Map.Entry<K, V>> mo68574b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f40430b.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f40430b.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.asMap((NavigableSet) this.f40430b.descendingSet(), (Function) this.f40431c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (Collections2.m69718f(this.f40430b, obj)) {
                return this.f40431c.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return Maps.asMap((NavigableSet) this.f40430b.headSet(k, z), (Function) this.f40431c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Maps.m69063C(this.f40430b);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f40430b.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.asMap((NavigableSet) this.f40430b.subSet(k, z, k2, z2), (Function) this.f40431c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.asMap((NavigableSet) this.f40430b.tailSet(k, z), (Function) this.f40431c);
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(@ParametricNullness K k) {
            return mo68997d().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return mo68997d().descendingKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet
        /* renamed from: e */
        public NavigableMap<K, V> mo68997d() {
            return (NavigableMap) this.f40425b;
        }

        @Override // java.util.NavigableSet
        public K floor(@ParametricNullness K k) {
            return mo68997d().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
            return mo68997d().headMap(k, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(@ParametricNullness K k) {
            return mo68997d().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(@ParametricNullness K k) {
            return mo68997d().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.m69023x(mo68997d().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.m69023x(mo68997d().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return mo68997d().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
            return mo68997d().tailMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@ParametricNullness K k) {
            return headSet(k, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return tailSet(k, true);
        }
    }

    /* loaded from: classes4.dex */
    public static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        SortedAsMapView(SortedSet<K> sortedSet, Function<? super K, V> function) {
            super(sortedSet, function);
        }

        @Override // com.google.common.collect.Maps.AsMapView
        /* renamed from: c */
        public SortedSet<K> mo69000b() {
            return (SortedSet) super.mo69000b();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo69000b().comparator();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return mo69000b().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return Maps.asMap((SortedSet) mo69000b().headSet(k), (Function) this.f40400g);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return Maps.m69061E(mo69000b());
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return mo69000b().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return Maps.asMap((SortedSet) mo69000b().subSet(k, k2), (Function) this.f40400g);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return Maps.asMap((SortedSet) mo69000b().tailSet(k), (Function) this.f40400g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        public SortedKeySet(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo68998c().comparator();
        }

        @Override // com.google.common.collect.Maps.KeySet
        /* renamed from: d */
        public SortedMap<K, V> mo68998c() {
            return (SortedMap) super.mo68998c();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K first() {
            return mo68998c().firstKey();
        }

        public SortedSet<K> headSet(@ParametricNullness K k) {
            return new SortedKeySet(mo68998c().headMap(k));
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K last() {
            return mo68998c().lastKey();
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return new SortedKeySet(mo68998c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return new SortedKeySet(mo68998c().tailMap(k));
        }
    }

    /* loaded from: classes4.dex */
    public static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        SortedMapDifferenceImpl(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, MapDifference.ValueDifference<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    /* loaded from: classes4.dex */
    public static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {

        /* renamed from: b */
        final Map<K, V1> f40432b;

        /* renamed from: c */
        final EntryTransformer<? super K, ? super V1, V2> f40433c;

        TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.f40432b = (Map) Preconditions.checkNotNull(map);
            this.f40433c = (EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo68575a() {
            return Iterators.transform(this.f40432b.entrySet().iterator(), Maps.m69041f(this.f40433c));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f40432b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f40432b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.f40432b.get(obj);
            if (v1 == null && !this.f40432b.containsKey(obj)) {
                return null;
            }
            return this.f40433c.transformEntry(obj, (Object) NullnessCasts.m68906a(v1));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f40432b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f40432b.containsKey(obj)) {
                return this.f40433c.transformEntry(obj, (Object) NullnessCasts.m68906a(this.f40432b.remove(obj)));
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f40432b.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new Values(this);
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        TransformedEntriesNavigableMap(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        /* renamed from: d */
        private Map.Entry<K, V2> m68995d(Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return Maps.m69056J(this.f40433c, entry);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        /* renamed from: c */
        public NavigableMap<K, V1> mo68994b() {
            return (NavigableMap) super.mo68994b();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(@ParametricNullness K k) {
            return m68995d(mo68994b().ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
            return mo68994b().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo68994b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return Maps.transformEntries((NavigableMap) mo68994b().descendingMap(), (EntryTransformer) this.f40433c);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
            return m68995d(mo68994b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(@ParametricNullness K k) {
            return m68995d(mo68994b().floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
            return mo68994b().floorKey(k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(@ParametricNullness Object obj) {
            return headMap((TransformedEntriesNavigableMap<K, V1, V2>) obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(@ParametricNullness K k) {
            return m68995d(mo68994b().higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
            return mo68994b().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
            return m68995d(mo68994b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(@ParametricNullness K k) {
            return m68995d(mo68994b().lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
            return mo68994b().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo68994b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
            return m68995d(mo68994b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
            return m68995d(mo68994b().pollLastEntry());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(@ParametricNullness Object obj) {
            return tailMap((TransformedEntriesNavigableMap<K, V1, V2>) obj);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.transformEntries((NavigableMap) mo68994b().subMap(k, z, k2, z2), (EntryTransformer) this.f40433c);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@ParametricNullness K k, boolean z) {
            return Maps.transformEntries((NavigableMap) mo68994b().headMap(k, z), (EntryTransformer) this.f40433c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.transformEntries((NavigableMap) mo68994b().tailMap(k, z), (EntryTransformer) this.f40433c);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }
    }

    /* loaded from: classes4.dex */
    public static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        TransformedEntriesSortedMap(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        /* renamed from: b */
        protected SortedMap<K, V1> mo68994b() {
            return (SortedMap) this.f40432b;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo68994b().comparator();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return mo68994b().firstKey();
        }

        public SortedMap<K, V2> headMap(@ParametricNullness K k) {
            return Maps.transformEntries((SortedMap) mo68994b().headMap(k), (EntryTransformer) this.f40433c);
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return mo68994b().lastKey();
        }

        public SortedMap<K, V2> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return Maps.transformEntries((SortedMap) mo68994b().subMap(k, k2), (EntryTransformer) this.f40433c);
        }

        public SortedMap<K, V2> tailMap(@ParametricNullness K k) {
            return Maps.transformEntries((SortedMap) mo68994b().tailMap(k), (EntryTransformer) this.f40433c);
        }
    }

    /* loaded from: classes4.dex */
    private static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

        /* renamed from: b */
        final Map<K, V> f40434b;

        /* renamed from: c */
        final BiMap<? extends K, ? extends V> f40435c;
        @RetainedWith

        /* renamed from: d */
        BiMap<V, K> f40436d;

        /* renamed from: f */
        transient Set<V> f40437f;

        UnmodifiableBiMap(BiMap<? extends K, ? extends V> biMap, BiMap<V, K> biMap2) {
            this.f40434b = Collections.unmodifiableMap(biMap);
            this.f40435c = biMap;
            this.f40436d = biMap2;
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap = this.f40436d;
            if (biMap == null) {
                UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.f40435c.inverse(), this);
                this.f40436d = unmodifiableBiMap;
                return unmodifiableBiMap;
            }
            return biMap;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<K, V> delegate() {
            return this.f40434b;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
            Set<V> set = this.f40437f;
            if (set == null) {
                Set<V> unmodifiableSet = Collections.unmodifiableSet(this.f40435c.values());
                this.f40437f = unmodifiableSet;
                return unmodifiableSet;
            }
            return set;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {

        /* renamed from: b */
        private final Collection<Map.Entry<K, V>> f40438b;

        public UnmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
            this.f40438b = collection;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public Collection<Map.Entry<K, V>> delegate() {
            return this.f40438b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.m69054L(this.f40438b.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m69517h();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m69516i(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        UnmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m68787a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m68786b(this);
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: b */
        private final NavigableMap<K, ? extends V> f40439b;

        /* renamed from: c */
        private transient UnmodifiableNavigableMap<K, V> f40440c;

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.f40439b = navigableMap;
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.f40439b);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
            return Maps.m69051O(this.f40439b.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
            return this.f40439b.ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.unmodifiableNavigableSet(this.f40439b.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.f40440c;
            if (unmodifiableNavigableMap == null) {
                UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.f40439b.descendingMap(), this);
                this.f40440c = unmodifiableNavigableMap2;
                return unmodifiableNavigableMap2;
            }
            return unmodifiableNavigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return Maps.m69051O(this.f40439b.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
            return Maps.m69051O(this.f40439b.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
            return this.f40439b.floorKey(k);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
            return Maps.m69051O(this.f40439b.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
            return this.f40439b.higherKey(k);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return Maps.m69051O(this.f40439b.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
            return Maps.m69051O(this.f40439b.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
            return this.f40439b.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.unmodifiableNavigableSet(this.f40439b.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.f40439b.headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return Maps.unmodifiableNavigableMap(this.f40439b.subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.f40439b.tailMap(k, z));
        }

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.f40439b = navigableMap;
            this.f40440c = unmodifiableNavigableMap;
        }
    }

    /* loaded from: classes4.dex */
    public static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        @ParametricNullness

        /* renamed from: a */
        private final V f40441a;
        @ParametricNullness

        /* renamed from: b */
        private final V f40442b;

        private ValueDifferenceImpl(@ParametricNullness V v, @ParametricNullness V v2) {
            this.f40441a = v;
            this.f40442b = v2;
        }

        /* renamed from: a */
        static <V> MapDifference.ValueDifference<V> m68992a(@ParametricNullness V v, @ParametricNullness V v2) {
            return new ValueDifferenceImpl(v, v2);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
            if (!Objects.equal(this.f40441a, valueDifference.leftValue()) || !Objects.equal(this.f40442b, valueDifference.rightValue())) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
            return Objects.hashCode(this.f40441a, this.f40442b);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @ParametricNullness
        public V leftValue() {
            return this.f40441a;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @ParametricNullness
        public V rightValue() {
            return this.f40442b;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f40441a);
            String valueOf2 = String.valueOf(this.f40442b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb2.append("(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static class Values<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: b */
        final Map<K, V> f40443b;

        public Values(Map<K, V> map) {
            this.f40443b = (Map) Preconditions.checkNotNull(map);
        }

        /* renamed from: c */
        final Map<K, V> m68991c() {
            return this.f40443b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m68991c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m68991c().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m68991c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.m69049Q(m68991c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m68991c().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        m68991c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry<K, V> entry : m68991c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return m68991c().keySet().removeAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry<K, V> entry : m68991c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return m68991c().keySet().retainAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m68991c().size();
        }
    }

    @GwtCompatible
    /* loaded from: classes4.dex */
    public static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {

        /* renamed from: b */
        private transient Set<Map.Entry<K, V>> f40444b;

        /* renamed from: c */
        private transient Set<K> f40445c;

        /* renamed from: d */
        private transient Collection<V> f40446d;

        /* renamed from: a */
        Collection<V> mo68744a() {
            return new Values(this);
        }

        abstract Set<Map.Entry<K, V>> createEntrySet();

        Set<K> createKeySet() {
            return new KeySet(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f40444b;
            if (set == null) {
                Set<Map.Entry<K, V>> createEntrySet = createEntrySet();
                this.f40444b = createEntrySet;
                return createEntrySet;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f40445c;
            if (set == null) {
                Set<K> createKeySet = createKeySet();
                this.f40445c = createKeySet;
                return createKeySet;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
            Collection<V> collection = this.f40446d;
            if (collection == null) {
                Collection<V> mo68744a = mo68744a();
                this.f40446d = mo68744a;
                return mo68744a;
            }
            return collection;
        }
    }

    private Maps() {
    }

    /* renamed from: A */
    public static <K, V> void m69065A(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: B */
    public static <K, V> boolean m69064B(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(m69055K((Map.Entry) obj));
    }

    @GwtIncompatible
    /* renamed from: C */
    public static <E> NavigableSet<E> m69063C(final NavigableSet<E> navigableSet) {
        return new ForwardingNavigableSet<E>() { // from class: com.google.common.collect.Maps.6
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@ParametricNullness E e) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<E> descendingSet() {
                return Maps.m69063C(super.descendingSet());
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<E> headSet(@ParametricNullness E e) {
                return Maps.m69061E(super.headSet(e));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
            /* renamed from: n */
            public NavigableSet<E> mo68774m() {
                return navigableSet;
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
                return Maps.m69061E(super.subSet(e, e2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<E> tailSet(@ParametricNullness E e) {
                return Maps.m69061E(super.tailSet(e));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
                return Maps.m69063C(super.headSet(e, z));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
                return Maps.m69063C(super.subSet(e, z, e2, z2));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
                return Maps.m69063C(super.tailSet(e, z));
            }
        };
    }

    /* renamed from: D */
    public static <E> Set<E> m69062D(final Set<E> set) {
        return new ForwardingSet<E>() { // from class: com.google.common.collect.Maps.4
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@ParametricNullness E e) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            /* renamed from: j */
            public Set<E> delegate() {
                return set;
            }
        };
    }

    /* renamed from: E */
    public static <E> SortedSet<E> m69061E(final SortedSet<E> sortedSet) {
        return new ForwardingSortedSet<E>() { // from class: com.google.common.collect.Maps.5
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@ParametricNullness E e) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<E> headSet(@ParametricNullness E e) {
                return Maps.m69061E(super.headSet(e));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
            /* renamed from: m */
            public SortedSet<E> mo67841j() {
                return sortedSet;
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
                return Maps.m69061E(super.subSet(e, e2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<E> tailSet(@ParametricNullness E e) {
                return Maps.m69061E(super.tailSet(e));
            }
        };
    }

    /* renamed from: F */
    public static boolean m69060F(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: G */
    public static <V> V m69059G(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static <V> V m69058H(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static String m69057I(Map<?, ?> map) {
        StringBuilder m69719e = Collections2.m69719e(map.size());
        m69719e.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                m69719e.append(", ");
            }
            m69719e.append(entry.getKey());
            m69719e.append(C20517nb.f52173T);
            m69719e.append(entry.getValue());
            z = false;
        }
        m69719e.append('}');
        return m69719e.toString();
    }

    /* renamed from: J */
    static <V2, K, V1> Map.Entry<K, V2> m69056J(final EntryTransformer<? super K, ? super V1, V2> entryTransformer, final Map.Entry<K, V1> entry) {
        Preconditions.checkNotNull(entryTransformer);
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<K, V2>() { // from class: com.google.common.collect.Maps.12
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public K getKey() {
                return (K) entry.getKey();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public V2 getValue() {
                return (V2) entryTransformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    /* renamed from: K */
    static <K, V> Map.Entry<K, V> m69055K(final Map.Entry<? extends K, ? extends V> entry) {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<K, V>() { // from class: com.google.common.collect.Maps.7
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public K getKey() {
                return (K) entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public V getValue() {
                return (V) entry.getValue();
            }
        };
    }

    /* renamed from: L */
    public static <K, V> UnmodifiableIterator<Map.Entry<K, V>> m69054L(final Iterator<Map.Entry<K, V>> it) {
        return new UnmodifiableIterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.Maps.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return Maps.m69055K((Map.Entry) it.next());
            }
        };
    }

    /* renamed from: M */
    public static <K, V> Set<Map.Entry<K, V>> m69053M(Set<Map.Entry<K, V>> set) {
        return new UnmodifiableEntrySet(Collections.unmodifiableSet(set));
    }

    /* renamed from: N */
    public static <K, V> Map<K, V> m69052N(Map<K, ? extends V> map) {
        if (map instanceof SortedMap) {
            return Collections.unmodifiableSortedMap((SortedMap) map);
        }
        return Collections.unmodifiableMap(map);
    }

    /* renamed from: O */
    public static <K, V> Map.Entry<K, V> m69051O(Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return m69055K(entry);
    }

    /* renamed from: P */
    public static <V> Function<Map.Entry<?, V>, V> m69050P() {
        return EntryFunction.VALUE;
    }

    /* renamed from: Q */
    public static <K, V> Iterator<V> m69049Q(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator<Map.Entry<K, V>, V>(it) { // from class: com.google.common.collect.Maps.2
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* renamed from: b */
            public V mo68681a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: R */
    public static <V> V m69048R(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* renamed from: S */
    public static <V> Predicate<Map.Entry<?, V>> m69047S(Predicate<? super V> predicate) {
        return Predicates.compose(predicate, m69050P());
    }

    public static <A, B> Converter<A, B> asConverter(BiMap<A, B> biMap) {
        return new BiMapConverter(biMap);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, Function<? super K, V> function) {
        return new AsMapView(set, function);
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        if (map instanceof SortedMap) {
            return difference((SortedMap) map, (Map) map2);
        }
        return difference(map, map2, Equivalence.equals());
    }

    /* renamed from: f */
    public static <K, V1, V2> Function<Map.Entry<K, V1>, Map.Entry<K, V2>> m69041f(final EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<Map.Entry<K, V1>, Map.Entry<K, V2>>() { // from class: com.google.common.collect.Maps.13
            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Map.Entry) ((Map.Entry) obj));
            }

            public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
                return Maps.m69056J(entryTransformer, entry);
            }
        };
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (map instanceof AbstractFilteredMap) {
            return m69029r((AbstractFilteredMap) map, predicate);
        }
        return new FilteredEntryMap((Map) Preconditions.checkNotNull(map), predicate);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        Predicate m69022y = m69022y(predicate);
        if (map instanceof AbstractFilteredMap) {
            return m69029r((AbstractFilteredMap) map, m69022y);
        }
        return new FilteredKeyMap((Map) Preconditions.checkNotNull(map), predicate, m69022y);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, Predicate<? super V> predicate) {
        return filterEntries(map, m69047S(predicate));
    }

    @GwtIncompatible
    public static ImmutableMap<String, String> fromProperties(Properties properties) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            Object nextElement = propertyNames.nextElement();
            java.util.Objects.requireNonNull(nextElement);
            String str = (String) nextElement;
            String property = properties.getProperty(str);
            java.util.Objects.requireNonNull(property);
            builder.put(str, property);
        }
        return builder.buildOrThrow();
    }

    /* renamed from: g */
    public static <K, V1, V2> Function<Map.Entry<K, V1>, V2> m69040g(final EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<Map.Entry<K, V1>, V2>() { // from class: com.google.common.collect.Maps.11
            @Override // com.google.common.base.Function
            @ParametricNullness
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Map.Entry) ((Map.Entry) obj));
            }

            @ParametricNullness
            public V2 apply(Map.Entry<K, V1> entry) {
                return (V2) entryTransformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    /* renamed from: h */
    public static <K, V1, V2> EntryTransformer<K, V1, V2> m69039h(final Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return new EntryTransformer<K, V1, V2>() { // from class: com.google.common.collect.Maps.9
            @Override // com.google.common.collect.Maps.EntryTransformer
            @ParametricNullness
            public V2 transformEntry(@ParametricNullness K k, @ParametricNullness V1 v1) {
                return (V2) function.apply(v1);
            }
        };
    }

    /* renamed from: i */
    public static <K, V> Iterator<Map.Entry<K, V>> m69038i(Set<K> set, final Function<? super K, V> function) {
        return new TransformedIterator<K, Map.Entry<K, V>>(set.iterator()) { // from class: com.google.common.collect.Maps.3
            @Override // com.google.common.collect.TransformedIterator
            /* renamed from: b */
            public Map.Entry<K, V> mo68681a(@ParametricNullness K k) {
                return Maps.immutableEntry(k, function.apply(k));
            }
        };
    }

    @GwtCompatible(serializable = true)
    public static <K, V> Map.Entry<K, V> immutableEntry(@ParametricNullness K k, @ParametricNullness V v) {
        return new ImmutableEntry(k, v);
    }

    @GwtCompatible(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof ImmutableEnumMap) {
            return (ImmutableEnumMap) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ImmutableMap.m69397of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        CollectPreconditions.m69728a(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((EnumMap) key, (K) value);
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            CollectPreconditions.m69728a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return ImmutableEnumMap.m69430m(enumMap);
    }

    /* renamed from: j */
    public static <K, V1, V2> Function<V1, V2> m69037j(final EntryTransformer<? super K, V1, V2> entryTransformer, @ParametricNullness final K k) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<V1, V2>() { // from class: com.google.common.collect.Maps.10
            @Override // com.google.common.base.Function
            @ParametricNullness
            public V2 apply(@ParametricNullness V1 v1) {
                return (V2) entryTransformer.transformEntry(k, v1);
            }
        };
    }

    /* renamed from: k */
    public static int m69036k(int i) {
        if (i < 3) {
            CollectPreconditions.m69727b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: l */
    public static <K, V> boolean m69035l(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(m69055K((Map.Entry) obj));
    }

    /* renamed from: m */
    public static boolean m69034m(Map<?, ?> map, Object obj) {
        return Iterators.contains(m69024w(map.entrySet().iterator()), obj);
    }

    /* renamed from: n */
    public static boolean m69033n(Map<?, ?> map, Object obj) {
        return Iterators.contains(m69049Q(map.entrySet().iterator()), obj);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) Preconditions.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap<>(m69036k(i));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new LinkedHashMap<>(m69036k(i));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private static <K, V> void m69032o(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, MapDifference.ValueDifference<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                Object obj = (Object) NullnessCasts.m68906a(map4.remove(key));
                if (equivalence.equivalent(value, obj)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, ValueDifferenceImpl.m68992a(value, obj));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    /* renamed from: p */
    public static boolean m69031p(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: q */
    private static <K, V> BiMap<K, V> m69030q(FilteredEntryBiMap<K, V> filteredEntryBiMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredEntryBiMap(filteredEntryBiMap.m69009g(), Predicates.and(filteredEntryBiMap.f40398g, predicate));
    }

    /* renamed from: r */
    private static <K, V> Map<K, V> m69029r(AbstractFilteredMap<K, V> abstractFilteredMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredEntryMap(abstractFilteredMap.f40397f, Predicates.and(abstractFilteredMap.f40398g, predicate));
    }

    @GwtIncompatible
    /* renamed from: s */
    private static <K, V> NavigableMap<K, V> m69028s(FilteredEntryNavigableMap<K, V> filteredEntryNavigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredEntryNavigableMap(((FilteredEntryNavigableMap) filteredEntryNavigableMap).f40416b, Predicates.and(((FilteredEntryNavigableMap) filteredEntryNavigableMap).f40417c, predicate));
    }

    @Beta
    @GwtIncompatible
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, Range<K> range) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (navigableMap.comparator() != null && navigableMap.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            if (navigableMap.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            K lowerEndpoint = range.lowerEndpoint();
            BoundType lowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            if (lowerBoundType == boundType) {
                z = true;
            } else {
                z = false;
            }
            K upperEndpoint = range.upperEndpoint();
            if (range.upperBoundType() != boundType) {
                z3 = false;
            }
            return navigableMap.subMap(lowerEndpoint, z, upperEndpoint, z3);
        } else if (range.hasLowerBound()) {
            K lowerEndpoint2 = range.lowerEndpoint();
            if (range.lowerBoundType() != BoundType.CLOSED) {
                z3 = false;
            }
            return navigableMap.tailMap(lowerEndpoint2, z3);
        } else if (range.hasUpperBound()) {
            K upperEndpoint2 = range.upperEndpoint();
            if (range.upperBoundType() != BoundType.CLOSED) {
                z3 = false;
            }
            return navigableMap.headMap(upperEndpoint2, z3);
        } else {
            return (NavigableMap) Preconditions.checkNotNull(navigableMap);
        }
    }

    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
        return Synchronized.m68733g(biMap, null);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return Synchronized.m68725o(navigableMap);
    }

    /* renamed from: t */
    private static <K, V> SortedMap<K, V> m69027t(FilteredEntrySortedMap<K, V> filteredEntrySortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredEntrySortedMap(filteredEntrySortedMap.m69002g(), Predicates.and(filteredEntrySortedMap.f40398g, predicate));
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, Function<? super K, V> function) {
        return toMap(iterable.iterator(), function);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMap(map, entryTransformer);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, Function<? super V1, V2> function) {
        return transformEntries(map, m69039h(function));
    }

    /* renamed from: u */
    public static <E> ImmutableMap<E, Integer> m69026u(Collection<E> collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        for (E e : collection) {
            builder.put(e, Integer.valueOf(i));
            i++;
        }
        return builder.buildOrThrow();
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, Function<? super V, K> function) {
        return uniqueIndex(iterable.iterator(), function);
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
        return new UnmodifiableBiMap(biMap, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        Preconditions.checkNotNull(navigableMap);
        if (navigableMap instanceof UnmodifiableNavigableMap) {
            return navigableMap;
        }
        return new UnmodifiableNavigableMap(navigableMap);
    }

    /* renamed from: v */
    public static <K> Function<Map.Entry<K, ?>, K> m69025v() {
        return EntryFunction.KEY;
    }

    /* renamed from: w */
    public static <K, V> Iterator<K> m69024w(Iterator<Map.Entry<K, V>> it) {
        return new TransformedIterator<Map.Entry<K, V>, K>(it) { // from class: com.google.common.collect.Maps.1
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* renamed from: b */
            public K mo68681a(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    /* renamed from: x */
    public static <K> K m69023x(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: y */
    public static <K> Predicate<Map.Entry<K, ?>> m69022y(Predicate<? super K> predicate) {
        return Predicates.compose(predicate, m69025v());
    }

    /* renamed from: z */
    static <E> Comparator<? super E> m69021z(Comparator<? super E> comparator) {
        if (comparator != null) {
            return comparator;
        }
        return Ordering.natural();
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, Function<? super K, V> function) {
        return new SortedAsMapView(sortedSet, function);
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, Predicate<? super V> predicate) {
        return filterEntries((SortedMap) sortedMap, m69047S(predicate));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it, Function<? super K, V> function) {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        while (it.hasNext()) {
            K next = it.next();
            builder.put(next, function.apply(next));
        }
        return builder.buildKeepingLast();
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesSortedMap(sortedMap, entryTransformer);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, Function<? super V1, V2> function) {
        return transformEntries((SortedMap) sortedMap, m69039h(function));
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it, Function<? super V, K> function) {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        while (it.hasNext()) {
            V next = it.next();
            builder.put(function.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, Function<? super K, V> function) {
        return new NavigableAsMapView(navigableSet, function);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, Predicate<? super V> predicate) {
        return filterEntries((NavigableMap) navigableMap, m69047S(predicate));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
        return new TreeMap<>((Comparator<? super K>) comparator);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesNavigableMap(navigableMap, entryTransformer);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, Function<? super V1, V2> function) {
        return transformEntries((NavigableMap) navigableMap, m69039h(function));
    }

    public static <K, V> BiMap<K, V> filterValues(BiMap<K, V> biMap, Predicate<? super V> predicate) {
        return filterEntries((BiMap) biMap, m69047S(predicate));
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence) {
        Preconditions.checkNotNull(equivalence);
        LinkedHashMap newLinkedHashMap = newLinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap newLinkedHashMap2 = newLinkedHashMap();
        LinkedHashMap newLinkedHashMap3 = newLinkedHashMap();
        m69032o(map, map2, equivalence, newLinkedHashMap, linkedHashMap, newLinkedHashMap2, newLinkedHashMap3);
        return new MapDifferenceImpl(newLinkedHashMap, linkedHashMap, newLinkedHashMap2, newLinkedHashMap3);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (sortedMap instanceof FilteredEntrySortedMap) {
            return m69027t((FilteredEntrySortedMap) sortedMap, predicate);
        }
        return new FilteredEntrySortedMap((SortedMap) Preconditions.checkNotNull(sortedMap), predicate);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, Predicate<? super K> predicate) {
        return filterEntries((SortedMap) sortedMap, m69022y(predicate));
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, Predicate<? super K> predicate) {
        return filterEntries((NavigableMap) navigableMap, m69022y(predicate));
    }

    public static <K, V> BiMap<K, V> filterKeys(BiMap<K, V> biMap, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        return filterEntries((BiMap) biMap, m69022y(predicate));
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (navigableMap instanceof FilteredEntryNavigableMap) {
            return m69028s((FilteredEntryNavigableMap) navigableMap, predicate);
        }
        return new FilteredEntryNavigableMap((NavigableMap) Preconditions.checkNotNull(navigableMap), predicate);
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        Preconditions.checkNotNull(sortedMap);
        Preconditions.checkNotNull(map);
        Comparator m69021z = m69021z(sortedMap.comparator());
        TreeMap newTreeMap = newTreeMap(m69021z);
        TreeMap newTreeMap2 = newTreeMap(m69021z);
        newTreeMap2.putAll(map);
        TreeMap newTreeMap3 = newTreeMap(m69021z);
        TreeMap newTreeMap4 = newTreeMap(m69021z);
        m69032o(sortedMap, map, Equivalence.equals(), newTreeMap, newTreeMap2, newTreeMap3, newTreeMap4);
        return new SortedMapDifferenceImpl(newTreeMap, newTreeMap2, newTreeMap3, newTreeMap4);
    }

    public static <K, V> BiMap<K, V> filterEntries(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(biMap);
        Preconditions.checkNotNull(predicate);
        if (biMap instanceof FilteredEntryBiMap) {
            return m69030q((FilteredEntryBiMap) biMap, predicate);
        }
        return new FilteredEntryBiMap(biMap, predicate);
    }
}
