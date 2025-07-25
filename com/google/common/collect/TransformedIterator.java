package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<? extends F> f40777b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransformedIterator(Iterator<? extends F> it) {
        this.f40777b = (Iterator) Preconditions.checkNotNull(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ParametricNullness
    /* renamed from: a */
    public abstract T mo68681a(@ParametricNullness F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40777b.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        return mo68681a(this.f40777b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40777b.remove();
    }
}
