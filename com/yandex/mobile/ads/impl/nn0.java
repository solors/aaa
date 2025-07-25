package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
final class nn0 extends d32<Object> {

    /* renamed from: b */
    boolean f82835b;

    /* renamed from: c */
    final /* synthetic */ Object f82836c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nn0(Object obj) {
        this.f82836c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f82835b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f82835b) {
            this.f82835b = true;
            return this.f82836c;
        }
        throw new NoSuchElementException();
    }
}
