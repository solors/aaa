package com.smaato.sdk.core.util.collections;

import com.smaato.sdk.core.util.Objects;
import java.util.Iterator;

/* renamed from: com.smaato.sdk.core.util.collections.b */
/* loaded from: classes7.dex */
abstract class MappedIterator<F, T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<? extends F> f71950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MappedIterator(Iterator<? extends F> it) {
        this.f71950b = (Iterator) Objects.requireNonNull(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo39339a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71950b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo39339a(this.f71950b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f71950b.remove();
    }
}
