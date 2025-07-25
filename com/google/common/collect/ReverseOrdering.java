package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ReverseOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    final Ordering<? super T> f40641b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReverseOrdering(Ordering<? super T> ordering) {
        this.f40641b = (Ordering) Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        return this.f40641b.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f40641b.equals(((ReverseOrdering) obj).f40641b);
        }
        return false;
    }

    public int hashCode() {
        return -this.f40641b.hashCode();
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2) {
        return (E) this.f40641b.min(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2) {
        return (E) this.f40641b.max(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
        return (Ordering<? super T>) this.f40641b;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f40641b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
        return (E) this.f40641b.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
        return (E) this.f40641b.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterator<E> it) {
        return (E) this.f40641b.min(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterator<E> it) {
        return (E) this.f40641b.max(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) this.f40641b.min(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) this.f40641b.max(iterable);
    }
}
