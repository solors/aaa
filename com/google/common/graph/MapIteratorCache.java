package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class MapIteratorCache<K, V> {

    /* renamed from: a */
    private final Map<K, V> f41013a;

    /* renamed from: b */
    private volatile transient Map.Entry<K, V> f41014b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapIteratorCache(Map<K, V> map) {
        this.f41013a = (Map) Preconditions.checkNotNull(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo68427c() {
        this.f41014b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m68432d(Object obj) {
        if (mo68425f(obj) == null && !this.f41013a.containsKey(obj)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public V mo68426e(Object obj) {
        Preconditions.checkNotNull(obj);
        V mo68425f = mo68425f(obj);
        if (mo68425f == null) {
            return m68431g(obj);
        }
        return mo68425f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public V mo68425f(Object obj) {
        Map.Entry<K, V> entry = this.f41014b;
        if (entry != null && entry.getKey() == obj) {
            return entry.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final V m68431g(Object obj) {
        Preconditions.checkNotNull(obj);
        return this.f41013a.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: h */
    public final V m68430h(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        mo68427c();
        return this.f41013a.put(k, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: i */
    public final V m68429i(Object obj) {
        Preconditions.checkNotNull(obj);
        mo68427c();
        return this.f41013a.remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final Set<K> m68428j() {
        return new AbstractSet<K>() { // from class: com.google.common.graph.MapIteratorCache.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return MapIteratorCache.this.m68432d(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return MapIteratorCache.this.f41013a.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<K> iterator() {
                final Iterator<Map.Entry<K, V>> it = MapIteratorCache.this.f41013a.entrySet().iterator();
                return new UnmodifiableIterator<K>() { // from class: com.google.common.graph.MapIteratorCache.1.1
                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public K next() {
                        Map.Entry entry = (Map.Entry) it.next();
                        MapIteratorCache.this.f41014b = entry;
                        return (K) entry.getKey();
                    }
                };
            }
        };
    }
}
