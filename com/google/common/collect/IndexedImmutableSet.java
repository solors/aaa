package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    /* renamed from: a */
    public int mo68773a(Object[] objArr, int i) {
        return asList().mo68773a(objArr, i);
    }

    abstract E get(int i);

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: j */
    public ImmutableList<E> mo68824j() {
        return new ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            {
                IndexedImmutableSet.this = this;
            }

            @Override // java.util.List
            public E get(int i) {
                return (E) IndexedImmutableSet.this.get(i);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return IndexedImmutableSet.this.isPartialView();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }
}
