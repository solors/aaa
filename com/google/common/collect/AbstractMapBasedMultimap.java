package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {

    /* renamed from: h */
    private transient Map<K, Collection<V>> f39726h;

    /* renamed from: i */
    private transient int f39727i;

    /* loaded from: classes4.dex */
    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* renamed from: f */
        final transient Map<K, Collection<V>> f39728f;

        /* loaded from: classes4.dex */
        class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            AsMapEntries() {
                AsMap.this = r1;
            }

            @Override // com.google.common.collect.Maps.EntrySet
            /* renamed from: c */
            Map<K, Collection<V>> mo68588c() {
                return AsMap.this;
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.m69718f(AsMap.this.f39728f.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.m69790w(entry.getKey());
                return true;
            }
        }

        /* loaded from: classes4.dex */
        class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b */
            final Iterator<Map.Entry<K, Collection<V>>> f39731b;

            /* renamed from: c */
            Collection<V> f39732c;

            AsMapIterator() {
                AsMap.this = r1;
                this.f39731b = r1.f39728f.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f39731b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.f39732c != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "no calls to next() since the last call to remove()");
                this.f39731b.remove();
                AbstractMapBasedMultimap.m69797m(AbstractMapBasedMultimap.this, this.f39732c.size());
                this.f39732c.clear();
                this.f39732c = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f39731b.next();
                this.f39732c = next.getValue();
                return AsMap.this.m69787b(next);
            }
        }

        AsMap(Map<K, Collection<V>> map) {
            AbstractMapBasedMultimap.this = r1;
            this.f39728f = map;
        }

        /* renamed from: b */
        Map.Entry<K, Collection<V>> m69787b(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.immutableEntry(key, AbstractMapBasedMultimap.this.mo68941z(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f39728f == AbstractMapBasedMultimap.this.f39726h) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m69223c(new AsMapIterator());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.m69060F(this.f39728f, obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            if (this != obj && !this.f39728f.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f39728f.hashCode();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f39728f.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f39728f.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Maps.m69059G(this.f39728f, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.mo68941z(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f39728f.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> mo68667p = AbstractMapBasedMultimap.this.mo68667p();
            mo68667p.addAll(remove);
            AbstractMapBasedMultimap.m69797m(AbstractMapBasedMultimap.this, remove.size());
            remove.clear();
            return mo68667p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: b */
        final Iterator<Map.Entry<K, Collection<V>>> f39734b;

        /* renamed from: c */
        K f39735c = null;

        /* renamed from: d */
        Collection<V> f39736d = null;

        /* renamed from: f */
        Iterator<V> f39737f = Iterators.m69218h();

        Itr() {
            AbstractMapBasedMultimap.this = r1;
            this.f39734b = (Iterator<Map.Entry<K, V>>) r1.f39726h.entrySet().iterator();
        }

        /* renamed from: a */
        abstract T mo69786a(@ParametricNullness K k, @ParametricNullness V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f39734b.hasNext() && !this.f39737f.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f39737f.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f39734b.next();
                this.f39735c = next.getKey();
                Collection<V> value = next.getValue();
                this.f39736d = value;
                this.f39737f = value.iterator();
            }
            return mo69786a(NullnessCasts.m68906a(this.f39735c), this.f39737f.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f39737f.remove();
            Collection<V> collection = this.f39736d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f39734b.remove();
            }
            AbstractMapBasedMultimap.m69799k(AbstractMapBasedMultimap.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class KeySet extends Maps.KeySet<K, Collection<V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        KeySet(Map<K, Collection<V>> map) {
            super(map);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.m69223c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo68998c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (this != obj && !mo68998c().keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return mo68998c().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = mo68998c().entrySet().iterator();
            return new Iterator<K>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1

                /* renamed from: b */
                Map.Entry<K, Collection<V>> f39740b;

                {
                    KeySet.this = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f39740b = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    boolean z;
                    if (this.f39740b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkState(z, "no calls to next() since the last call to remove()");
                    Collection<V> value = this.f39740b.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.m69797m(AbstractMapBasedMultimap.this, value.size());
                    value.clear();
                    this.f39740b = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection<V> remove = mo68998c().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                AbstractMapBasedMultimap.m69797m(AbstractMapBasedMultimap.this, i);
            } else {
                i = 0;
            }
            if (i <= 0) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        NavigableAsMap(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo69780d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return m69787b(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
            return mo69780d().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new NavigableAsMap(mo69780d().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: f */
        public NavigableSet<K> createKeySet() {
            return new NavigableKeySet(mo69780d());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo69780d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m69787b(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> floorEntry = mo69780d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return m69787b(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
            return mo69780d().floorKey(k);
        }

        /* renamed from: g */
        Map.Entry<K, Collection<V>> m69784g(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> mo68667p = AbstractMapBasedMultimap.this.mo68667p();
            mo68667p.addAll(next.getValue());
            it.remove();
            return Maps.immutableEntry(next.getKey(), AbstractMapBasedMultimap.this.mo68942y(mo68667p));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* renamed from: h */
        public NavigableMap<K, Collection<V>> mo69780d() {
            return (NavigableMap) super.mo69780d();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(@ParametricNullness Object obj) {
            return headMap((NavigableAsMap) obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> higherEntry = mo69780d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return m69787b(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
            return mo69780d().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo69780d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m69787b(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> lowerEntry = mo69780d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return m69787b(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
            return mo69780d().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m69784g(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m69784g(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(@ParametricNullness Object obj) {
            return tailMap((NavigableAsMap) obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k) {
            return headMap(k, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k, boolean z) {
            return new NavigableAsMap(mo69780d().headMap(k, z));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return new NavigableAsMap(mo69780d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k, boolean z) {
            return new NavigableAsMap(mo69780d().tailMap(k, z));
        }
    }

    /* loaded from: classes4.dex */
    public class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        NavigableKeySet(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.NavigableSet
        public K ceiling(@ParametricNullness K k) {
            return mo69779d().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new NavigableKeySet(mo69779d().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        /* renamed from: e */
        public NavigableMap<K, Collection<V>> mo69779d() {
            return (NavigableMap) super.mo69779d();
        }

        @Override // java.util.NavigableSet
        public K floor(@ParametricNullness K k) {
            return mo69779d().floorKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet headSet(@ParametricNullness Object obj) {
            return headSet((NavigableKeySet) obj);
        }

        @Override // java.util.NavigableSet
        public K higher(@ParametricNullness K k) {
            return mo69779d().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(@ParametricNullness K k) {
            return mo69779d().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.m69215k(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.m69215k(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet tailSet(@ParametricNullness Object obj) {
            return tailSet((NavigableKeySet) obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k) {
            return headSet(k, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
            return new NavigableKeySet(mo69779d().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return new NavigableKeySet(mo69779d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
            return new NavigableKeySet(mo69779d().tailMap(k, z));
        }
    }

    /* loaded from: classes4.dex */
    public class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        RandomAccessWrappedList(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
        }
    }

    /* loaded from: classes4.dex */
    public class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {

        /* renamed from: h */
        SortedSet<K> f39745h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        SortedAsMap(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: c */
        public SortedSet<K> createKeySet() {
            return new SortedKeySet(mo69780d());
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo69780d().comparator();
        }

        /* renamed from: d */
        SortedMap<K, Collection<V>> mo69780d() {
            return (SortedMap) this.f39728f;
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return mo69780d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(@ParametricNullness K k) {
            return new SortedAsMap(mo69780d().headMap(k));
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return mo69780d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return new SortedAsMap(mo69780d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(@ParametricNullness K k) {
            return new SortedAsMap(mo69780d().tailMap(k));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f39745h;
            if (sortedSet == null) {
                SortedSet<K> createKeySet = createKeySet();
                this.f39745h = createKeySet;
                return createKeySet;
            }
            return sortedSet;
        }
    }

    /* loaded from: classes4.dex */
    public class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        SortedKeySet(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo69779d().comparator();
        }

        /* renamed from: d */
        SortedMap<K, Collection<V>> mo69779d() {
            return (SortedMap) super.mo68998c();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K first() {
            return mo69779d().firstKey();
        }

        public SortedSet<K> headSet(@ParametricNullness K k) {
            return new SortedKeySet(mo69779d().headMap(k));
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K last() {
            return mo69779d().lastKey();
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return new SortedKeySet(mo69779d().subMap(k, k2));
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return new SortedKeySet(mo69779d().tailMap(k));
        }
    }

    /* loaded from: classes4.dex */
    class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrappedNavigableSet(@ParametricNullness K k, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, navigableSet, wrappedCollection);
            AbstractMapBasedMultimap.this = r1;
        }

        /* renamed from: k */
        private NavigableSet<V> m69767k(NavigableSet<V> navigableSet) {
            AbstractMapBasedMultimap<K, V>.WrappedCollection m69777d;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f39748b;
            if (m69777d() == null) {
                m69777d = this;
            } else {
                m69777d = m69777d();
            }
            return new WrappedNavigableSet(k, navigableSet, m69777d);
        }

        @Override // java.util.NavigableSet
        public V ceiling(@ParametricNullness V v) {
            return mo69766i().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new WrappedCollection.WrappedIterator(mo69766i().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m69767k(mo69766i().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(@ParametricNullness V v) {
            return mo69766i().floor(v);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@ParametricNullness V v, boolean z) {
            return m69767k(mo69766i().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public V higher(@ParametricNullness V v) {
            return mo69766i().higher(v);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        /* renamed from: j */
        public NavigableSet<V> mo69766i() {
            return (NavigableSet) super.mo69766i();
        }

        @Override // java.util.NavigableSet
        public V lower(@ParametricNullness V v) {
            return mo69766i().lower(v);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.m69215k(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.m69215k(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@ParametricNullness V v, boolean z, @ParametricNullness V v2, boolean z2) {
            return m69767k(mo69766i().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@ParametricNullness V v, boolean z) {
            return m69767k(mo69766i().tailSet(v, z));
        }
    }

    /* loaded from: classes4.dex */
    class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrappedSet(@ParametricNullness K k, Set<V> set) {
            super(k, set, null);
            AbstractMapBasedMultimap.this = r2;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean m68784d = Sets.m68784d((Set) this.f39749c, collection);
            if (m68784d) {
                AbstractMapBasedMultimap.m69798l(AbstractMapBasedMultimap.this, this.f39749c.size() - size);
                m69773h();
            }
            return m68784d;
        }
    }

    /* loaded from: classes4.dex */
    public class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrappedSortedSet(@ParametricNullness K k, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, sortedSet, wrappedCollection);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return mo69766i().comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public V first() {
            m69774g();
            return mo69766i().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@ParametricNullness V v) {
            AbstractMapBasedMultimap<K, V>.WrappedCollection m69777d;
            m69774g();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m69775f = m69775f();
            SortedSet<V> headSet = mo69766i().headSet(v);
            if (m69777d() == null) {
                m69777d = this;
            } else {
                m69777d = m69777d();
            }
            return new WrappedSortedSet(m69775f, headSet, m69777d);
        }

        /* renamed from: i */
        SortedSet<V> mo69766i() {
            return (SortedSet) m69776e();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public V last() {
            m69774g();
            return mo69766i().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@ParametricNullness V v, @ParametricNullness V v2) {
            AbstractMapBasedMultimap<K, V>.WrappedCollection m69777d;
            m69774g();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m69775f = m69775f();
            SortedSet<V> subSet = mo69766i().subSet(v, v2);
            if (m69777d() == null) {
                m69777d = this;
            } else {
                m69777d = m69777d();
            }
            return new WrappedSortedSet(m69775f, subSet, m69777d);
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@ParametricNullness V v) {
            AbstractMapBasedMultimap<K, V>.WrappedCollection m69777d;
            m69774g();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m69775f = m69775f();
            SortedSet<V> tailSet = mo69766i().tailSet(v);
            if (m69777d() == null) {
                m69777d = this;
            } else {
                m69777d = m69777d();
            }
            return new WrappedSortedSet(m69775f, tailSet, m69777d);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f39726h = map;
    }

    /* renamed from: j */
    static /* synthetic */ int m69800j(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f39727i;
        abstractMapBasedMultimap.f39727i = i + 1;
        return i;
    }

    /* renamed from: k */
    static /* synthetic */ int m69799k(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f39727i;
        abstractMapBasedMultimap.f39727i = i - 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m69798l(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.f39727i + i;
        abstractMapBasedMultimap.f39727i = i2;
        return i2;
    }

    /* renamed from: m */
    static /* synthetic */ int m69797m(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.f39727i - i;
        abstractMapBasedMultimap.f39727i = i2;
        return i2;
    }

    /* renamed from: u */
    private Collection<V> m69792u(@ParametricNullness K k) {
        Collection<V> collection = this.f39726h.get(k);
        if (collection == null) {
            Collection<V> mo68666q = mo68666q(k);
            this.f39726h.put(k, mo68666q);
            return mo68666q;
        }
        return collection;
    }

    /* renamed from: v */
    public static <E> Iterator<E> m69791v(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* renamed from: w */
    public void m69790w(Object obj) {
        Collection collection = (Collection) Maps.m69058H(this.f39726h, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f39727i -= size;
        }
    }

    /* renamed from: A */
    public final List<V> m69803A(@ParametricNullness K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        if (list instanceof RandomAccess) {
            return new RandomAccessWrappedList(this, k, list, wrappedCollection);
        }
        return new WrappedList(k, list, wrappedCollection);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: a */
    Map<K, Collection<V>> mo68668a() {
        return new AsMap(this.f39726h);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: b */
    Collection<Map.Entry<K, V>> mo68937b() {
        if (this instanceof SetMultimap) {
            return new AbstractMultimap.EntrySet(this);
        }
        return new AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    Set<K> mo68936c() {
        return new KeySet(this.f39726h);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        for (Collection<V> collection : this.f39726h.values()) {
            collection.clear();
        }
        this.f39726h.clear();
        this.f39727i = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.f39726h.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    Multiset<K> mo68935d() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    Collection<V> mo68934e() {
        return new AbstractMultimap.Values();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: f */
    Iterator<Map.Entry<K, V>> mo68933f() {
        return new AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            /* renamed from: b */
            public Map.Entry<K, V> mo69786a(@ParametricNullness K k, @ParametricNullness V v) {
                return Maps.immutableEntry(k, v);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: g */
    Iterator<V> mo69201g() {
        return new AbstractMapBasedMultimap<K, V>.Itr<V>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            @ParametricNullness
            /* renamed from: a */
            V mo69786a(@ParametricNullness K k, @ParametricNullness V v) {
                return v;
            }
        };
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k) {
        Collection<V> collection = this.f39726h.get(k);
        if (collection == null) {
            collection = mo68666q(k);
        }
        return mo68941z(k, collection);
    }

    /* renamed from: o */
    public Map<K, Collection<V>> m69795o() {
        return this.f39726h;
    }

    /* renamed from: p */
    abstract Collection<V> mo68667p();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        Collection<V> collection = this.f39726h.get(k);
        if (collection == null) {
            Collection<V> mo68666q = mo68666q(k);
            if (mo68666q.add(v)) {
                this.f39727i++;
                this.f39726h.put(k, mo68666q);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.f39727i++;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: q */
    public Collection<V> mo68666q(@ParametricNullness K k) {
        return mo68667p();
    }

    /* renamed from: r */
    public final Map<K, Collection<V>> m69794r() {
        Map<K, Collection<V>> map = this.f39726h;
        if (map instanceof NavigableMap) {
            return new NavigableAsMap((NavigableMap) this.f39726h);
        }
        if (map instanceof SortedMap) {
            return new SortedAsMap((SortedMap) this.f39726h);
        }
        return new AsMap(this.f39726h);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
        Collection<V> remove = this.f39726h.remove(obj);
        if (remove == null) {
            return mo69756t();
        }
        Collection mo68667p = mo68667p();
        mo68667p.addAll(remove);
        this.f39727i -= remove.size();
        remove.clear();
        return (Collection<V>) mo68942y(mo68667p);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection<V> m69792u = m69792u(k);
        Collection mo68667p = mo68667p();
        mo68667p.addAll(m69792u);
        this.f39727i -= m69792u.size();
        m69792u.clear();
        while (it.hasNext()) {
            if (m69792u.add(it.next())) {
                this.f39727i++;
            }
        }
        return (Collection<V>) mo68942y(mo68667p);
    }

    /* renamed from: s */
    public final Set<K> m69793s() {
        Map<K, Collection<V>> map = this.f39726h;
        if (map instanceof NavigableMap) {
            return new NavigableKeySet((NavigableMap) this.f39726h);
        }
        if (map instanceof SortedMap) {
            return new SortedKeySet((SortedMap) this.f39726h);
        }
        return new KeySet(this.f39726h);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f39727i;
    }

    /* renamed from: t */
    Collection<V> mo69756t() {
        return (Collection<V>) mo68942y(mo68667p());
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: x */
    public final void m69789x(Map<K, Collection<V>> map) {
        this.f39726h = map;
        this.f39727i = 0;
        for (Collection<V> collection : map.values()) {
            Preconditions.checkArgument(!collection.isEmpty());
            this.f39727i += collection.size();
        }
    }

    /* renamed from: y */
    <E> Collection<E> mo68942y(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    /* renamed from: z */
    Collection<V> mo68941z(@ParametricNullness K k, Collection<V> collection) {
        return new WrappedCollection(k, collection, null);
    }

    /* loaded from: classes4.dex */
    public class WrappedCollection extends AbstractCollection<V> {
        @ParametricNullness

        /* renamed from: b */
        final K f39748b;

        /* renamed from: c */
        Collection<V> f39749c;

        /* renamed from: d */
        final AbstractMapBasedMultimap<K, V>.WrappedCollection f39750d;

        /* renamed from: f */
        final Collection<V> f39751f;

        public WrappedCollection(@ParametricNullness K k, Collection<V> collection, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            Collection<V> m69776e;
            AbstractMapBasedMultimap.this = r1;
            this.f39748b = k;
            this.f39749c = collection;
            this.f39750d = wrappedCollection;
            if (wrappedCollection == null) {
                m69776e = null;
            } else {
                m69776e = wrappedCollection.m69776e();
            }
            this.f39751f = m69776e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@ParametricNullness V v) {
            m69774g();
            boolean isEmpty = this.f39749c.isEmpty();
            boolean add = this.f39749c.add(v);
            if (add) {
                AbstractMapBasedMultimap.m69800j(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    m69778c();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f39749c.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.m69798l(AbstractMapBasedMultimap.this, this.f39749c.size() - size);
                if (size == 0) {
                    m69778c();
                }
            }
            return addAll;
        }

        /* renamed from: c */
        void m69778c() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f39750d;
            if (wrappedCollection != null) {
                wrappedCollection.m69778c();
            } else {
                AbstractMapBasedMultimap.this.f39726h.put(this.f39748b, this.f39749c);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f39749c.clear();
            AbstractMapBasedMultimap.m69797m(AbstractMapBasedMultimap.this, size);
            m69773h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m69774g();
            return this.f39749c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m69774g();
            return this.f39749c.containsAll(collection);
        }

        /* renamed from: d */
        AbstractMapBasedMultimap<K, V>.WrappedCollection m69777d() {
            return this.f39750d;
        }

        /* renamed from: e */
        Collection<V> m69776e() {
            return this.f39749c;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m69774g();
            return this.f39749c.equals(obj);
        }

        @ParametricNullness
        /* renamed from: f */
        K m69775f() {
            return this.f39748b;
        }

        /* renamed from: g */
        void m69774g() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f39750d;
            if (wrappedCollection != null) {
                wrappedCollection.m69774g();
                if (this.f39750d.m69776e() != this.f39751f) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f39749c.isEmpty() && (collection = (Collection) AbstractMapBasedMultimap.this.f39726h.get(this.f39748b)) != null) {
                this.f39749c = collection;
            }
        }

        /* renamed from: h */
        void m69773h() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f39750d;
            if (wrappedCollection != null) {
                wrappedCollection.m69773h();
            } else if (this.f39749c.isEmpty()) {
                AbstractMapBasedMultimap.this.f39726h.remove(this.f39748b);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m69774g();
            return this.f39749c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m69774g();
            return new WrappedIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m69774g();
            boolean remove = this.f39749c.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.m69799k(AbstractMapBasedMultimap.this);
                m69773h();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f39749c.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.m69798l(AbstractMapBasedMultimap.this, this.f39749c.size() - size);
                m69773h();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f39749c.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.m69798l(AbstractMapBasedMultimap.this, this.f39749c.size() - size);
                m69773h();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m69774g();
            return this.f39749c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m69774g();
            return this.f39749c.toString();
        }

        /* loaded from: classes4.dex */
        public class WrappedIterator implements Iterator<V> {

            /* renamed from: b */
            final Iterator<V> f39753b;

            /* renamed from: c */
            final Collection<V> f39754c;

            WrappedIterator() {
                WrappedCollection.this = r1;
                Collection<V> collection = r1.f39749c;
                this.f39754c = collection;
                this.f39753b = AbstractMapBasedMultimap.m69791v(collection);
            }

            /* renamed from: a */
            Iterator<V> m69772a() {
                m69771b();
                return this.f39753b;
            }

            /* renamed from: b */
            void m69771b() {
                WrappedCollection.this.m69774g();
                if (WrappedCollection.this.f39749c == this.f39754c) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m69771b();
                return this.f39753b.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public V next() {
                m69771b();
                return this.f39753b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f39753b.remove();
                AbstractMapBasedMultimap.m69799k(AbstractMapBasedMultimap.this);
                WrappedCollection.this.m69773h();
            }

            WrappedIterator(Iterator<V> it) {
                WrappedCollection.this = r1;
                this.f39754c = r1.f39749c;
                this.f39753b = it;
            }
        }
    }

    /* loaded from: classes4.dex */
    public class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        /* loaded from: classes4.dex */
        private class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            WrappedListIterator() {
                super();
                WrappedList.this = r1;
            }

            /* renamed from: c */
            private ListIterator<V> m69769c() {
                return (ListIterator) m69772a();
            }

            @Override // java.util.ListIterator
            public void add(@ParametricNullness V v) {
                boolean isEmpty = WrappedList.this.isEmpty();
                m69769c().add(v);
                AbstractMapBasedMultimap.m69800j(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    WrappedList.this.m69778c();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m69769c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m69769c().nextIndex();
            }

            @Override // java.util.ListIterator
            @ParametricNullness
            public V previous() {
                return m69769c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m69769c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@ParametricNullness V v) {
                m69769c().set(v);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WrappedListIterator(int i) {
                super(r2.m69770i().listIterator(i));
                WrappedList.this = r2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        WrappedList(@ParametricNullness K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
            AbstractMapBasedMultimap.this = r1;
        }

        @Override // java.util.List
        public void add(int i, @ParametricNullness V v) {
            m69774g();
            boolean isEmpty = m69776e().isEmpty();
            m69770i().add(i, v);
            AbstractMapBasedMultimap.m69800j(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                m69778c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m69770i().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.m69798l(AbstractMapBasedMultimap.this, m69776e().size() - size);
                if (size == 0) {
                    m69778c();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        @ParametricNullness
        public V get(int i) {
            m69774g();
            return m69770i().get(i);
        }

        /* renamed from: i */
        List<V> m69770i() {
            return (List) m69776e();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m69774g();
            return m69770i().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m69774g();
            return m69770i().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m69774g();
            return new WrappedListIterator();
        }

        @Override // java.util.List
        @ParametricNullness
        public V remove(int i) {
            m69774g();
            V remove = m69770i().remove(i);
            AbstractMapBasedMultimap.m69799k(AbstractMapBasedMultimap.this);
            m69773h();
            return remove;
        }

        @Override // java.util.List
        @ParametricNullness
        public V set(int i, @ParametricNullness V v) {
            m69774g();
            return m69770i().set(i, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            AbstractMapBasedMultimap<K, V>.WrappedCollection m69777d;
            m69774g();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object m69775f = m69775f();
            List<V> subList = m69770i().subList(i, i2);
            if (m69777d() == null) {
                m69777d = this;
            } else {
                m69777d = m69777d();
            }
            return abstractMapBasedMultimap.m69803A(m69775f, subList, m69777d);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            m69774g();
            return new WrappedListIterator(i);
        }
    }
}
