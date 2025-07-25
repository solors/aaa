package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MapBuilder<K, V> {

    /* renamed from: a */
    private final Map<K, V> f31107a;

    private MapBuilder(int i) {
        this.f31107a = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i) {
        return new MapBuilder<>(i);
    }

    public Map<K, V> build() {
        if (this.f31107a.size() != 0) {
            return Collections.unmodifiableMap(this.f31107a);
        }
        return Collections.emptyMap();
    }

    public MapBuilder<K, V> put(K k, V v) {
        this.f31107a.put(k, v);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.f31107a.putAll(map);
        return this;
    }
}
