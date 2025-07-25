package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Map;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class EdgesConnecting<E> extends AbstractSet<E> {

    /* renamed from: b */
    private final Map<?, E> f40987b;

    /* renamed from: c */
    private final Object f40988c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EdgesConnecting(Map<?, E> map, Object obj) {
        this.f40987b = (Map) Preconditions.checkNotNull(map);
        this.f40988c = Preconditions.checkNotNull(obj);
    }

    /* renamed from: c */
    private E m68479c() {
        return this.f40987b.get(this.f40988c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        E m68479c = m68479c();
        if (m68479c != null && m68479c.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (m68479c() == null) {
            return 0;
        }
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
        E m68479c = m68479c();
        if (m68479c == null) {
            return ImmutableSet.m69331of().iterator();
        }
        return Iterators.singletonIterator(m68479c);
    }
}
