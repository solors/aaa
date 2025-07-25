package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30990o;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
abstract class jr0<K, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private transient Set<Map.Entry<K, V>> f81068b;

    /* renamed from: c */
    private transient Collection<V> f81069c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f81068b;
        if (set == null) {
            AbstractC30990o.C30991a.C30992a c30992a = new AbstractC30990o.C30991a.C30992a();
            this.f81068b = c30992a;
            return c30992a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f81069c;
        if (collection == null) {
            ir0 ir0Var = new ir0(this);
            this.f81069c = ir0Var;
            return ir0Var;
        }
        return collection;
    }
}
