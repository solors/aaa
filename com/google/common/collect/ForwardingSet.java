package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this && !delegate().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: j */
    public abstract Set<E> delegate();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public boolean m69508l(Collection<?> collection) {
        return Sets.m68784d(this, (Collection) Preconditions.checkNotNull(collection));
    }
}
