package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes8.dex */
final class nh0<K, V> extends AbstractC31078p<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final K f82783b;

    /* renamed from: c */
    final V f82784c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nh0(K k, V v) {
        this.f82783b = k;
        this.f82784c = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f82783b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f82784c;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
