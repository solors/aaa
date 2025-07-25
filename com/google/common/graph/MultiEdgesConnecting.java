package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {

    /* renamed from: b */
    private final Map<E, ?> f41022b;

    /* renamed from: c */
    private final Object f41023c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiEdgesConnecting(Map<E, ?> map, Object obj) {
        this.f41022b = (Map) Preconditions.checkNotNull(map);
        this.f41023c = Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f41023c.equals(this.f41022b.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
        final Iterator<Map.Entry<E, ?>> it = this.f41022b.entrySet().iterator();
        return new AbstractIterator<E>() { // from class: com.google.common.graph.MultiEdgesConnecting.1
            @Override // com.google.common.collect.AbstractIterator
            protected E computeNext() {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (MultiEdgesConnecting.this.f41023c.equals(entry.getValue())) {
                        return (E) entry.getKey();
                    }
                }
                return m69807a();
            }
        };
    }
}
