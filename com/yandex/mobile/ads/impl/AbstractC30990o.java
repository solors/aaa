package com.yandex.mobile.ads.impl;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.impl.o */
/* loaded from: classes8.dex */
public abstract class AbstractC30990o<K, V> extends AbstractC31164q<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: e */
    private transient Map<K, Collection<V>> f83202e;

    /* renamed from: f */
    private transient int f83203f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o$a */
    /* loaded from: classes8.dex */
    public class C30991a extends jr0<K, Collection<V>> {

        /* renamed from: d */
        final transient Map<K, Collection<V>> f83204d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.yandex.mobile.ads.impl.o$a$a */
        /* loaded from: classes8.dex */
        public class C30992a extends gr0<K, Collection<V>> {
            /* JADX INFO: Access modifiers changed from: package-private */
            public C30992a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = C30991a.this.f83204d.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C30993b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Object obj2;
                Set<Map.Entry<K, Collection<V>>> entrySet = C30991a.this.f83204d.entrySet();
                entrySet.getClass();
                try {
                    if (entrySet.contains(obj)) {
                        Map.Entry entry = (Map.Entry) obj;
                        Objects.requireNonNull(entry);
                        AbstractC30990o abstractC30990o = AbstractC30990o.this;
                        Object key = entry.getKey();
                        Map map = abstractC30990o.f83202e;
                        map.getClass();
                        try {
                            obj2 = map.remove(key);
                        } catch (ClassCastException | NullPointerException unused) {
                            obj2 = null;
                        }
                        Collection collection = (Collection) obj2;
                        if (collection != null) {
                            int size = collection.size();
                            collection.clear();
                            abstractC30990o.f83203f -= size;
                            return true;
                        }
                        return true;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.yandex.mobile.ads.impl.o$a$b */
        /* loaded from: classes8.dex */
        public class C30993b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b */
            final Iterator<Map.Entry<K, Collection<V>>> f83207b;

            /* renamed from: c */
            Collection<V> f83208c;

            C30993b() {
                this.f83207b = C30991a.this.f83204d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f83207b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f83207b.next();
                this.f83208c = next.getValue();
                return C30991a.this.m31218a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                boolean z;
                if (this.f83208c != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f83207b.remove();
                    AbstractC30990o.this.f83203f -= this.f83208c.size();
                    this.f83208c.clear();
                    this.f83208c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        C30991a(Map<K, Collection<V>> map) {
            this.f83204d = map;
        }

        /* renamed from: a */
        final Map.Entry<K, Collection<V>> m31218a(Map.Entry<K, Collection<V>> entry) {
            Object c31004j;
            K key = entry.getKey();
            AbstractC30817m abstractC30817m = (AbstractC30817m) AbstractC30990o.this;
            abstractC30817m.getClass();
            List list = (List) entry.getValue();
            if (list instanceof RandomAccess) {
                c31004j = new C30999f(abstractC30817m, key, list, null);
            } else {
                c31004j = new C31004j(key, list, null);
            }
            return new nh0(key, c31004j);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Map<K, Collection<V>> map = this.f83204d;
            AbstractC30990o abstractC30990o = AbstractC30990o.this;
            if (map == abstractC30990o.f83202e) {
                abstractC30990o.m31225d();
                return;
            }
            C30993b c30993b = new C30993b();
            while (c30993b.hasNext()) {
                c30993b.next();
                c30993b.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f83204d;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            if (this != obj && !this.f83204d.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Object c31004j;
            Map<K, Collection<V>> map = this.f83204d;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractC30817m abstractC30817m = (AbstractC30817m) AbstractC30990o.this;
            abstractC30817m.getClass();
            List list = (List) collection2;
            if (list instanceof RandomAccess) {
                c31004j = new C30999f(abstractC30817m, obj, list, null);
            } else {
                c31004j = new C31004j(obj, list, null);
            }
            return c31004j;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f83204d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC30990o.this.m30545b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.f83204d.remove(obj);
            if (remove == null) {
                return null;
            }
            List<V> list = ((q01) AbstractC30990o.this).f84139g.get();
            list.addAll(remove);
            AbstractC30990o.this.f83203f -= remove.size();
            remove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f83204d.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f83204d.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o$b */
    /* loaded from: classes8.dex */
    public abstract class AbstractC30994b<T> implements Iterator<T> {

        /* renamed from: b */
        final Iterator<Map.Entry<K, Collection<V>>> f83210b;

        /* renamed from: c */
        K f83211c = null;

        /* renamed from: d */
        Collection<V> f83212d = null;

        /* renamed from: e */
        Iterator<V> f83213e = on0.f83563b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC30994b() {
            this.f83210b = (Iterator<Map.Entry<K, V>>) AbstractC30990o.this.f83202e.entrySet().iterator();
        }

        /* renamed from: a */
        abstract T mo31217a(K k, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (!this.f83210b.hasNext() && !this.f83213e.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f83213e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f83210b.next();
                this.f83211c = next.getKey();
                Collection<V> value = next.getValue();
                this.f83212d = value;
                this.f83213e = value.iterator();
            }
            return mo31217a(this.f83211c, this.f83213e.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f83213e.remove();
            Collection<V> collection = this.f83212d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f83210b.remove();
            }
            AbstractC30990o abstractC30990o = AbstractC30990o.this;
            abstractC30990o.f83203f--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o$c */
    /* loaded from: classes8.dex */
    public class C30995c extends hr0<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.yandex.mobile.ads.impl.o$c$a */
        /* loaded from: classes8.dex */
        public final class C30996a implements Iterator<K> {

            /* renamed from: b */
            Map.Entry<K, Collection<V>> f83216b;

            /* renamed from: c */
            final /* synthetic */ Iterator f83217c;

            C30996a(Iterator it) {
                this.f83217c = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f83217c.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f83217c.next();
                this.f83216b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                boolean z;
                Map.Entry<K, Collection<V>> entry = this.f83216b;
                if (entry != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Collection<V> value = entry.getValue();
                    this.f83217c.remove();
                    AbstractC30990o.this.f83203f -= value.size();
                    value.clear();
                    this.f83216b = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        C30995c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                C30996a c30996a = (C30996a) it;
                if (c30996a.hasNext()) {
                    c30996a.next();
                    c30996a.remove();
                } else {
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f80165b.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (this != obj && !this.f80165b.keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f80165b.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C30996a(this.f80165b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Collection collection = (Collection) this.f80165b.remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                AbstractC30990o.this.f83203f -= size;
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.o$d */
    /* loaded from: classes8.dex */
    public class C30997d extends AbstractC30990o<K, V>.C31000g implements NavigableMap<K, Collection<V>> {
        C30997d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31000g
        /* renamed from: a */
        final SortedSet mo31214a() {
            return new C30998e(mo31213b());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31000g
        /* renamed from: c */
        public final NavigableMap<K, Collection<V>> mo31213b() {
            return (NavigableMap) ((SortedMap) this.f83204d);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo31213b().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return m31218a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return mo31213b().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((C30997d) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C30997d(mo31213b().descendingMap());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo31213b().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m31218a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = mo31213b().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return m31218a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return mo31213b().floorKey(k);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31000g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = mo31213b().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return m31218a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return mo31213b().higherKey(k);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31000g, com.yandex.mobile.ads.impl.AbstractC30990o.C30991a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo31213b().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m31218a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = mo31213b().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return m31218a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return mo31213b().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            Iterator<Map.Entry<K, Collection<V>>> it = entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = ((q01) AbstractC30990o.this).f84139g.get();
            list.addAll(next.getValue());
            it.remove();
            K key = next.getKey();
            ((AbstractC30817m) AbstractC30990o.this).getClass();
            return new nh0(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            Iterator<Map.Entry<K, V>> it = ((jr0) descendingMap()).entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, V> next = it.next();
            List<V> list = ((q01) AbstractC30990o.this).f84139g.get();
            list.addAll((Collection) next.getValue());
            it.remove();
            K key = next.getKey();
            ((AbstractC30817m) AbstractC30990o.this).getClass();
            return new nh0(key, Collections.unmodifiableList(list));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31000g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31000g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C30997d(mo31213b().headMap(k, z));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31000g, com.yandex.mobile.ads.impl.AbstractC30990o.C30991a, java.util.AbstractMap, java.util.Map
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C30997d(mo31213b().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C30997d(mo31213b().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.o$e */
    /* loaded from: classes8.dex */
    public class C30998e extends AbstractC30990o<K, V>.C31001h implements NavigableSet<K> {
        C30998e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31001h
        /* renamed from: c */
        public final NavigableMap<K, Collection<V>> mo31212b() {
            return (NavigableMap) ((SortedMap) this.f80165b);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return mo31212b().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((C30995c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C30998e(mo31212b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return mo31212b().floorKey(k);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31001h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return mo31212b().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return mo31212b().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            C30995c.C30996a c30996a = (C30995c.C30996a) iterator();
            if (c30996a.hasNext()) {
                K k = (K) c30996a.next();
                c30996a.remove();
                return k;
            }
            return null;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            C30995c.C30996a c30996a = (C30995c.C30996a) ((C30995c) descendingSet()).iterator();
            if (c30996a.hasNext()) {
                K k = (K) c30996a.next();
                c30996a.remove();
                return k;
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31001h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C31001h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C30998e(mo31212b().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C30998e(mo31212b().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C30998e(mo31212b().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o$f */
    /* loaded from: classes8.dex */
    public class C30999f extends AbstractC30990o<K, V>.C31004j implements RandomAccess {
        C30999f(AbstractC30990o abstractC30990o, K k, List<V> list, AbstractC30990o<K, V>.C31002i c31002i) {
            super(k, list, c31002i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o$g */
    /* loaded from: classes8.dex */
    public class C31000g extends AbstractC30990o<K, V>.C30991a implements SortedMap<K, Collection<V>> {

        /* renamed from: f */
        SortedSet<K> f83221f;

        C31000g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: a */
        SortedSet<K> mo31214a() {
            return new C31001h(mo31213b());
        }

        /* renamed from: b */
        SortedMap<K, Collection<V>> mo31213b() {
            return (SortedMap) this.f83204d;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return mo31213b().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return mo31213b().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C31000g(mo31213b().headMap(k));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return mo31213b().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C31000g(mo31213b().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C31000g(mo31213b().tailMap(k));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30990o.C30991a, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f83221f;
            if (sortedSet == null) {
                SortedSet<K> mo31214a = mo31214a();
                this.f83221f = mo31214a;
                return mo31214a;
            }
            return sortedSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o$h */
    /* loaded from: classes8.dex */
    public class C31001h extends AbstractC30990o<K, V>.C30995c implements SortedSet<K> {
        C31001h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        SortedMap<K, Collection<V>> mo31212b() {
            return (SortedMap) this.f80165b;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return mo31212b().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return mo31212b().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C31001h(mo31212b().headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return mo31212b().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C31001h(mo31212b().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C31001h(mo31212b().tailMap(k));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC30990o(Map<K, Collection<V>> map) {
        uf1.m28792a(map.isEmpty());
        this.f83202e = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static <E> Iterator<E> m31229a(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* renamed from: g */
    public final int m31219g() {
        return this.f83203f;
    }

    @Override // com.yandex.mobile.ads.impl.m01
    public boolean put(K k, V v) {
        Collection<V> collection = this.f83202e.get(k);
        if (collection == null) {
            List<V> list = ((q01) this).f84139g.get();
            if (list.add(v)) {
                this.f83203f++;
                this.f83202e.put(k, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.f83203f++;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31164q, com.yandex.mobile.ads.impl.m01
    public final Collection<V> values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.o$i */
    /* loaded from: classes8.dex */
    public class C31002i extends AbstractCollection<V> {

        /* renamed from: b */
        final K f83224b;

        /* renamed from: c */
        Collection<V> f83225c;

        /* renamed from: d */
        final AbstractC30990o<K, V>.C31002i f83226d;

        /* renamed from: e */
        final Collection<V> f83227e;

        C31002i(K k, Collection<V> collection, AbstractC30990o<K, V>.C31002i c31002i) {
            Collection<V> m31210c;
            this.f83224b = k;
            this.f83225c = collection;
            this.f83226d = c31002i;
            if (c31002i == null) {
                m31210c = null;
            } else {
                m31210c = c31002i.m31210c();
            }
            this.f83227e = m31210c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            m31209d();
            boolean isEmpty = this.f83225c.isEmpty();
            boolean add = this.f83225c.add(v);
            if (add) {
                AbstractC30990o.this.f83203f++;
                if (isEmpty) {
                    m31211b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            m31209d();
            int size = this.f83225c.size();
            boolean addAll = this.f83225c.addAll(collection);
            if (addAll) {
                int size2 = this.f83225c.size();
                AbstractC30990o abstractC30990o = AbstractC30990o.this;
                abstractC30990o.f83203f = (size2 - size) + abstractC30990o.f83203f;
                if (size == 0) {
                    m31211b();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        final void m31211b() {
            AbstractC30990o<K, V>.C31002i c31002i = this.f83226d;
            if (c31002i != null) {
                c31002i.m31211b();
            } else {
                AbstractC30990o.this.f83202e.put(this.f83224b, this.f83225c);
            }
        }

        /* renamed from: c */
        final Collection<V> m31210c() {
            return this.f83225c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            m31209d();
            int size = this.f83225c.size();
            if (size == 0) {
                return;
            }
            this.f83225c.clear();
            AbstractC30990o.this.f83203f -= size;
            m31208e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            m31209d();
            return this.f83225c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            m31209d();
            return this.f83225c.containsAll(collection);
        }

        /* renamed from: d */
        final void m31209d() {
            Collection<V> collection;
            AbstractC30990o<K, V>.C31002i c31002i = this.f83226d;
            if (c31002i != null) {
                c31002i.m31209d();
                if (this.f83226d.f83225c != this.f83227e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f83225c.isEmpty() && (collection = (Collection) AbstractC30990o.this.f83202e.get(this.f83224b)) != null) {
                this.f83225c = collection;
            }
        }

        /* renamed from: e */
        final void m31208e() {
            AbstractC30990o<K, V>.C31002i c31002i = this.f83226d;
            if (c31002i != null) {
                c31002i.m31208e();
            } else if (this.f83225c.isEmpty()) {
                AbstractC30990o.this.f83202e.remove(this.f83224b);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m31209d();
            return this.f83225c.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            m31209d();
            return this.f83225c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            m31209d();
            return new C31003a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            m31209d();
            boolean remove = this.f83225c.remove(obj);
            if (remove) {
                AbstractC30990o abstractC30990o = AbstractC30990o.this;
                abstractC30990o.f83203f--;
                m31208e();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            m31209d();
            int size = this.f83225c.size();
            boolean removeAll = this.f83225c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f83225c.size();
                AbstractC30990o abstractC30990o = AbstractC30990o.this;
                abstractC30990o.f83203f = (size2 - size) + abstractC30990o.f83203f;
                m31208e();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            m31209d();
            int size = this.f83225c.size();
            boolean retainAll = this.f83225c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f83225c.size();
                AbstractC30990o abstractC30990o = AbstractC30990o.this;
                abstractC30990o.f83203f = (size2 - size) + abstractC30990o.f83203f;
                m31208e();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            m31209d();
            return this.f83225c.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            m31209d();
            return this.f83225c.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.yandex.mobile.ads.impl.o$i$a */
        /* loaded from: classes8.dex */
        public class C31003a implements Iterator<V> {

            /* renamed from: b */
            final Iterator<V> f83229b;

            /* renamed from: c */
            final Collection<V> f83230c;

            C31003a() {
                Collection<V> collection = C31002i.this.f83225c;
                this.f83230c = collection;
                this.f83229b = AbstractC30990o.m31229a(collection);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                C31002i.this.m31209d();
                if (C31002i.this.f83225c == this.f83230c) {
                    return this.f83229b.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                C31002i.this.m31209d();
                if (C31002i.this.f83225c == this.f83230c) {
                    return this.f83229b.next();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f83229b.remove();
                C31002i c31002i = C31002i.this;
                AbstractC30990o abstractC30990o = AbstractC30990o.this;
                abstractC30990o.f83203f--;
                c31002i.m31208e();
            }

            C31003a(ListIterator listIterator) {
                this.f83230c = C31002i.this.f83225c;
                this.f83229b = listIterator;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.o$j */
    /* loaded from: classes8.dex */
    public class C31004j extends AbstractC30990o<K, V>.C31002i implements List<V> {

        /* renamed from: com.yandex.mobile.ads.impl.o$j$a */
        /* loaded from: classes8.dex */
        private class C31005a extends AbstractC30990o<K, V>.C31002i.C31003a implements ListIterator<V> {
            C31005a() {
                super();
            }

            /* renamed from: a */
            private ListIterator<V> m31206a() {
                C31002i.this.m31209d();
                if (C31002i.this.f83225c == this.f83230c) {
                    return (ListIterator) this.f83229b;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean isEmpty = C31004j.this.isEmpty();
                m31206a().add(v);
                C31004j c31004j = C31004j.this;
                AbstractC30990o.this.f83203f++;
                if (isEmpty) {
                    c31004j.m31211b();
                }
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return m31206a().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return m31206a().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return m31206a().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return m31206a().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                m31206a().set(v);
            }

            public C31005a(int i) {
                super(C31004j.this.m31207f().listIterator(i));
            }
        }

        C31004j(K k, List<V> list, AbstractC30990o<K, V>.C31002i c31002i) {
            super(k, list, c31002i);
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            m31209d();
            boolean isEmpty = this.f83225c.isEmpty();
            ((List) this.f83225c).add(i, v);
            AbstractC30990o.this.f83203f++;
            if (isEmpty) {
                m31211b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            m31209d();
            int size = this.f83225c.size();
            boolean addAll = ((List) this.f83225c).addAll(i, collection);
            if (addAll) {
                int size2 = this.f83225c.size();
                AbstractC30990o abstractC30990o = AbstractC30990o.this;
                abstractC30990o.f83203f = (size2 - size) + abstractC30990o.f83203f;
                if (size == 0) {
                    m31211b();
                }
            }
            return addAll;
        }

        /* renamed from: f */
        final List<V> m31207f() {
            return (List) this.f83225c;
        }

        @Override // java.util.List
        public final V get(int i) {
            m31209d();
            return (V) ((List) this.f83225c).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            m31209d();
            return ((List) this.f83225c).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            m31209d();
            return ((List) this.f83225c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            m31209d();
            return new C31005a();
        }

        @Override // java.util.List
        public final V remove(int i) {
            m31209d();
            V v = (V) ((List) this.f83225c).remove(i);
            AbstractC30990o abstractC30990o = AbstractC30990o.this;
            abstractC30990o.f83203f--;
            m31208e();
            return v;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            m31209d();
            return (V) ((List) this.f83225c).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            m31209d();
            AbstractC30990o abstractC30990o = AbstractC30990o.this;
            K k = this.f83224b;
            List subList = ((List) this.f83225c).subList(i, i2);
            AbstractC30990o<K, V>.C31002i c31002i = this.f83226d;
            if (c31002i == null) {
                c31002i = this;
            }
            abstractC30990o.getClass();
            if (subList instanceof RandomAccess) {
                return new C30999f(abstractC30990o, k, subList, c31002i);
            }
            return new C31004j(k, subList, c31002i);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            m31209d();
            return new C31005a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<K, Collection<V>> m31227c() {
        return this.f83202e;
    }

    /* renamed from: d */
    public final void m31225d() {
        for (Collection<V> collection : this.f83202e.values()) {
            collection.clear();
        }
        this.f83202e.clear();
        this.f83203f = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<K, Collection<V>> m31223e() {
        Map<K, Collection<V>> map = this.f83202e;
        if (map instanceof NavigableMap) {
            return new C30997d((NavigableMap) this.f83202e);
        }
        if (map instanceof SortedMap) {
            return new C31000g((SortedMap) this.f83202e);
        }
        return new C30991a(this.f83202e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final Set<K> m31221f() {
        Map<K, Collection<V>> map = this.f83202e;
        if (map instanceof NavigableMap) {
            return new C30998e((NavigableMap) this.f83202e);
        }
        if (map instanceof SortedMap) {
            return new C31001h((SortedMap) this.f83202e);
        }
        return new C30995c(this.f83202e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31228a(Map<K, Collection<V>> map) {
        this.f83202e = map;
        this.f83203f = 0;
        for (Collection<V> collection : map.values()) {
            if (!(!collection.isEmpty())) {
                throw new IllegalArgumentException();
            }
            this.f83203f = collection.size() + this.f83203f;
        }
    }
}
