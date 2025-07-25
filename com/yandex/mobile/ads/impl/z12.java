package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
abstract class z12<F, T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<? extends F> f88664b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z12(Iterator<? extends F> it) {
        this.f88664b = (Iterator) uf1.m28793a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f88664b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f88664b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f88664b.remove();
    }
}
