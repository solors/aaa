package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* renamed from: g */
    private final ImmutableSortedSet<E> f39918g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DescendingImmutableSortedSet(ImmutableSortedSet<E> immutableSortedSet) {
        super(Ordering.from(immutableSortedSet.comparator()).reverse());
        this.f39918g = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e) {
        return this.f39918g.floor(e);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f39918g.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e) {
        return this.f39918g.ceiling(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e) {
        return this.f39918g.lower(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f39918g.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e) {
        return this.f39918g.higher(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible("NavigableSet")
    /* renamed from: n */
    ImmutableSortedSet<E> mo68816n() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: p */
    public ImmutableSortedSet<E> mo68815p(E e, boolean z) {
        return this.f39918g.tailSet((ImmutableSortedSet<E>) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: q */
    ImmutableSortedSet<E> mo68814q(E e, boolean z, E e2, boolean z2) {
        return this.f39918g.subSet((boolean) e2, z2, (boolean) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: r */
    ImmutableSortedSet<E> mo68813r(E e, boolean z) {
        return this.f39918g.headSet((ImmutableSortedSet<E>) e, z).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f39918g.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    public UnmodifiableIterator<E> descendingIterator() {
        return this.f39918g.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    public ImmutableSortedSet<E> descendingSet() {
        return this.f39918g;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return this.f39918g.descendingIterator();
    }
}
