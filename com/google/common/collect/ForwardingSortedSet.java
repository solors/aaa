package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return mo67841j().comparator();
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E first() {
        return mo67841j().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@ParametricNullness E e) {
        return mo67841j().headSet(e);
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        return mo67841j().last();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSet
    /* renamed from: m */
    public abstract SortedSet<E> mo67841j();

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        return mo67841j().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@ParametricNullness E e) {
        return mo67841j().tailSet(e);
    }
}
