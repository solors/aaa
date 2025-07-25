package com.smaato.sdk.core.util.collections;

import java.util.ListIterator;

/* renamed from: com.smaato.sdk.core.util.collections.c */
/* loaded from: classes7.dex */
abstract class MappedListIterator<F, T> extends MappedIterator<F, T> implements ListIterator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MappedListIterator(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    /* renamed from: b */
    private ListIterator<? extends F> m39338b() {
        return Iterators.m39340a(this.f71950b);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m39338b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m39338b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return mo39339a(m39338b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m39338b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
