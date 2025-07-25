package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    @Beta
    /* loaded from: classes4.dex */
    protected class StandardDescendingSet extends Sets.DescendingSet<E> {
        public StandardDescendingSet(ForwardingNavigableSet forwardingNavigableSet) {
            super(forwardingNavigableSet);
        }
    }

    @Override // java.util.NavigableSet
    public E ceiling(@ParametricNullness E e) {
        return mo68774m().ceiling(e);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return mo68774m().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return mo68774m().descendingSet();
    }

    @Override // java.util.NavigableSet
    public E floor(@ParametricNullness E e) {
        return mo68774m().floor(e);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
        return mo68774m().headSet(e, z);
    }

    @Override // java.util.NavigableSet
    public E higher(@ParametricNullness E e) {
        return mo68774m().higher(e);
    }

    @Override // java.util.NavigableSet
    public E lower(@ParametricNullness E e) {
        return mo68774m().lower(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet
    /* renamed from: n */
    public abstract NavigableSet<E> mo68774m();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public SortedSet<E> m69511o(@ParametricNullness E e) {
        return headSet(e, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public SortedSet<E> m69510p(@ParametricNullness E e, @ParametricNullness E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return mo68774m().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return mo68774m().pollLast();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public SortedSet<E> m69509q(@ParametricNullness E e) {
        return tailSet(e, true);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
        return mo68774m().subSet(e, z, e2, z2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
        return mo68774m().tailSet(e, z);
    }
}
