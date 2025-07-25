package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.impl.c */
/* loaded from: classes2.dex */
abstract class AbstractC4154c extends AbstractC5211qp {

    /* renamed from: a */
    private final int f5158a;

    /* renamed from: b */
    private int f5159b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4154c(int i, int i2) {
        Preconditions.checkPositionIndex(i2, i);
        this.f5158a = i;
        this.f5159b = i2;
    }

    /* renamed from: a */
    protected abstract Object mo93585a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f5159b < this.f5158a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f5159b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f5159b;
            this.f5159b = i + 1;
            return mo93585a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5159b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f5159b - 1;
            this.f5159b = i;
            return mo93585a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5159b - 1;
    }
}
