package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class SortedMultisets {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {
        @Weak

        /* renamed from: b */
        private final SortedMultiset<E> f40689b;

        ElementSet(SortedMultiset<E> sortedMultiset) {
            this.f40689b = sortedMultiset;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return mo68763c().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets.ElementSet
        /* renamed from: d */
        public final SortedMultiset<E> mo68763c() {
            return this.f40689b;
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) SortedMultisets.m68764d(mo68763c().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
            return mo68763c().headMultiset(e, BoundType.OPEN).elementSet();
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.m68927e(mo68763c().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) SortedMultisets.m68764d(mo68763c().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return mo68763c().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return mo68763c().tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public NavigableElementSet(SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e) {
            return (E) SortedMultisets.m68765c(mo68763c().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new NavigableElementSet(mo68763c().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e) {
            return (E) SortedMultisets.m68765c(mo68763c().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return new NavigableElementSet(mo68763c().headMultiset(e, BoundType.m69733c(z)));
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e) {
            return (E) SortedMultisets.m68765c(mo68763c().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e) {
            return (E) SortedMultisets.m68765c(mo68763c().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) SortedMultisets.m68765c(mo68763c().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) SortedMultisets.m68765c(mo68763c().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return new NavigableElementSet(mo68763c().subMultiset(e, BoundType.m69733c(z), e2, BoundType.m69733c(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return new NavigableElementSet(mo68763c().tailMultiset(e, BoundType.m69733c(z)));
        }
    }

    private SortedMultisets() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static <E> E m68765c(Multiset.Entry<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static <E> E m68764d(Multiset.Entry<E> entry) {
        if (entry != null) {
            return entry.getElement();
        }
        throw new NoSuchElementException();
    }
}
