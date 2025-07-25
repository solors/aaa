package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public TransformedListIterator(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    /* renamed from: b */
    private ListIterator<? extends F> m68680b() {
        return Iterators.m69225a(this.f40777b);
    }

    @Override // java.util.ListIterator
    public void add(@ParametricNullness T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m68680b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m68680b().nextIndex();
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final T previous() {
        return mo68681a(m68680b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m68680b().previousIndex();
    }

    public void set(@ParametricNullness T t) {
        throw new UnsupportedOperationException();
    }
}
