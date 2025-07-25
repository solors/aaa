package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.impl.gt1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class y90<K, V> extends z90 implements Map<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m26980a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((gt1.C30413a) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: b */
    protected abstract Map<K, V> mo26979b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final int m26978c() {
        return gt1.m33776a(entrySet());
    }

    @Override // java.util.Map
    public final void clear() {
        mo26979b().clear();
    }

    public boolean containsKey(Object obj) {
        return mo26979b().containsKey(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo26979b().entrySet();
    }

    public V get(Object obj) {
        return mo26979b().get(obj);
    }

    public boolean isEmpty() {
        return mo26979b().isEmpty();
    }

    public Set<K> keySet() {
        return mo26979b().keySet();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    public final V put(K k, V v) {
        return mo26979b().put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        mo26979b().putAll(map);
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    public final V remove(Object obj) {
        return mo26979b().remove(obj);
    }

    public int size() {
        return mo26979b().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return mo26979b().values();
    }
}
