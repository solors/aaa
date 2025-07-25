package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* renamed from: b */
    static final ReverseNaturalOrdering f40640b = new ReverseNaturalOrdering();

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return f40640b;
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object max(Iterable iterable) {
        return max((Iterable<Comparable>) iterable);
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object min(Iterable iterable) {
        return min((Iterable<Comparable>) iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> reverse() {
        return Ordering.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object max(Iterator it) {
        return max((Iterator<Comparable>) it);
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object min(Iterator it) {
        return min((Iterator<Comparable>) it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(E e, E e2) {
        return (E) NaturalOrdering.f40553d.min(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(E e, E e2) {
        return (E) NaturalOrdering.f40553d.max(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(E e, E e2, E e3, E... eArr) {
        return (E) NaturalOrdering.f40553d.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(E e, E e2, E e3, E... eArr) {
        return (E) NaturalOrdering.f40553d.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(Iterator<E> it) {
        return (E) NaturalOrdering.f40553d.min(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(Iterator<E> it) {
        return (E) NaturalOrdering.f40553d.max(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(Iterable<E> iterable) {
        return (E) NaturalOrdering.f40553d.min(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(Iterable<E> iterable) {
        return (E) NaturalOrdering.f40553d.max(iterable);
    }
}
