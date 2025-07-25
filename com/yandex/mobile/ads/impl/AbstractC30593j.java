package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.j */
/* loaded from: classes8.dex */
abstract class AbstractC30593j<E> extends e32<E> {

    /* renamed from: b */
    private final int f80696b;

    /* renamed from: c */
    private int f80697c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC30593j(int i, int i2) {
        uf1.m28791b(i2, i);
        this.f80696b = i;
        this.f80697c = i2;
    }

    /* renamed from: a */
    protected abstract E mo31006a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f80697c < this.f80696b) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f80697c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f80697c;
            this.f80697c = i + 1;
            return mo31006a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f80697c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f80697c - 1;
            this.f80697c = i;
            return mo31006a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f80697c - 1;
    }
}
