package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    @LazyInit

    /* renamed from: b */
    private transient Collection<Map.Entry<K, V>> f39769b;
    @LazyInit

    /* renamed from: c */
    private transient Set<K> f39770c;
    @LazyInit

    /* renamed from: d */
    private transient Multiset<K> f39771d;
    @LazyInit

    /* renamed from: f */
    private transient Collection<V> f39772f;
    @LazyInit

    /* renamed from: g */
    private transient Map<K, Collection<V>> f39773g;

    /* loaded from: classes4.dex */
    class Entries extends Multimaps.Entries<K, V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        /* renamed from: c */
        Multimap<K, V> mo68940c() {
            return AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractMultimap.this.mo68933f();
        }
    }

    /* loaded from: classes4.dex */
    class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public EntrySet(AbstractMultimap abstractMultimap) {
            super();
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

    /* loaded from: classes4.dex */
    class Values extends AbstractCollection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractMultimap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractMultimap.this.mo69201g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultimap.this.size();
        }
    }

    /* renamed from: a */
    abstract Map<K, Collection<V>> mo68668a();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f39773g;
        if (map == null) {
            Map<K, Collection<V>> mo68668a = mo68668a();
            this.f39773g = mo68668a;
            return mo68668a;
        }
        return map;
    }

    /* renamed from: b */
    abstract Collection<Map.Entry<K, V>> mo68937b();

    /* renamed from: c */
    abstract Set<K> mo68936c();

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        for (Collection<V> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    abstract Multiset<K> mo68935d();

    /* renamed from: e */
    abstract Collection<V> mo68934e();

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f39769b;
        if (collection == null) {
            Collection<Map.Entry<K, V>> mo68937b = mo68937b();
            this.f39769b = mo68937b;
            return mo68937b;
        }
        return collection;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object obj) {
        return Multimaps.m68950c(this, obj);
    }

    /* renamed from: f */
    abstract Iterator<Map.Entry<K, V>> mo68933f();

    /* renamed from: g */
    Iterator<V> mo69201g() {
        return Maps.m69049Q(entries().iterator());
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
        Set<K> set = this.f39770c;
        if (set == null) {
            Set<K> mo68936c = mo68936c();
            this.f39770c = mo68936c;
            return mo68936c;
        }
        return set;
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<K> keys() {
        Multiset<K> multiset = this.f39771d;
        if (multiset == null) {
            Multiset<K> mo68935d = mo68935d();
            this.f39771d = mo68935d;
            return mo68935d;
        }
        return multiset;
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return get(k).add(v);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@ParametricNullness K k, Iterable<? extends V> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.addAll(get(k), it);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        Preconditions.checkNotNull(iterable);
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
        Collection<V> collection = this.f39772f;
        if (collection == null) {
            Collection<V> mo68934e = mo68934e();
            this.f39772f = mo68934e;
            return mo68934e;
        }
        return collection;
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }
}
