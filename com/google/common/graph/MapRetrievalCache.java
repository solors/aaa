package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Map;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {

    /* renamed from: c */
    private volatile transient CacheEntry<K, V> f41018c;

    /* renamed from: d */
    private volatile transient CacheEntry<K, V> f41019d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class CacheEntry<K, V> {

        /* renamed from: a */
        final K f41020a;

        /* renamed from: b */
        final V f41021b;

        CacheEntry(K k, V v) {
            this.f41020a = k;
            this.f41021b = v;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapRetrievalCache(Map<K, V> map) {
        super(map);
    }

    /* renamed from: k */
    private void m68424k(CacheEntry<K, V> cacheEntry) {
        this.f41019d = this.f41018c;
        this.f41018c = cacheEntry;
    }

    /* renamed from: l */
    private void m68423l(K k, V v) {
        m68424k(new CacheEntry<>(k, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.graph.MapIteratorCache
    /* renamed from: c */
    public void mo68427c() {
        super.mo68427c();
        this.f41018c = null;
        this.f41019d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MapIteratorCache
    /* renamed from: e */
    public V mo68426e(Object obj) {
        Preconditions.checkNotNull(obj);
        V mo68425f = mo68425f(obj);
        if (mo68425f != null) {
            return mo68425f;
        }
        V m68431g = m68431g(obj);
        if (m68431g != null) {
            m68423l(obj, m68431g);
        }
        return m68431g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.graph.MapIteratorCache
    /* renamed from: f */
    public V mo68425f(Object obj) {
        V v = (V) super.mo68425f(obj);
        if (v != null) {
            return v;
        }
        CacheEntry<K, V> cacheEntry = this.f41018c;
        if (cacheEntry != null && cacheEntry.f41020a == obj) {
            return cacheEntry.f41021b;
        }
        CacheEntry<K, V> cacheEntry2 = this.f41019d;
        if (cacheEntry2 != null && cacheEntry2.f41020a == obj) {
            m68424k(cacheEntry2);
            return cacheEntry2.f41021b;
        }
        return null;
    }
}
