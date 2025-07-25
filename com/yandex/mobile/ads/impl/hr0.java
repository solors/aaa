package com.yandex.mobile.ads.impl;

import com.google.j2objc.annotations.Weak;
import com.yandex.mobile.ads.impl.gt1;
import java.util.Map;

/* loaded from: classes8.dex */
class hr0<K, V> extends gt1.AbstractC30415c<K> {
    @Weak

    /* renamed from: b */
    final Map<K, V> f80165b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hr0(Map<K, V> map) {
        this.f80165b = (Map) uf1.m28793a(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f80165b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f80165b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f80165b.size();
    }
}
