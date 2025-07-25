package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* renamed from: a */
    final Map<E, N> f40945a;

    /* renamed from: b */
    final Map<E, N> f40946b;

    /* renamed from: c */
    private int f40947c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i) {
        boolean z;
        this.f40945a = (Map) Preconditions.checkNotNull(map);
        this.f40946b = (Map) Preconditions.checkNotNull(map2);
        this.f40947c = Graphs.m68465b(i);
        if (i <= map.size() && i <= map2.size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
        Preconditions.checkNotNull(e);
        Preconditions.checkNotNull(n);
        boolean z2 = true;
        if (z) {
            int i = this.f40947c + 1;
            this.f40947c = i;
            Graphs.m68463d(i);
        }
        if (this.f40945a.put(e, n) != null) {
            z2 = false;
        }
        Preconditions.checkState(z2);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
        boolean z;
        Preconditions.checkNotNull(e);
        Preconditions.checkNotNull(n);
        if (this.f40946b.put(e, n) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e) {
        N n = this.f40946b.get(e);
        Objects.requireNonNull(n);
        return n;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Sets.union(predecessors(), successors());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return Collections.unmodifiableSet(this.f40945a.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return new AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!AbstractDirectedNetworkConnections.this.f40945a.containsKey(obj) && !AbstractDirectedNetworkConnections.this.f40946b.containsKey(obj)) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return IntMath.saturatedAdd(AbstractDirectedNetworkConnections.this.f40945a.size(), AbstractDirectedNetworkConnections.this.f40946b.size() - AbstractDirectedNetworkConnections.this.f40947c);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                Iterable union;
                if (AbstractDirectedNetworkConnections.this.f40947c == 0) {
                    union = Iterables.concat(AbstractDirectedNetworkConnections.this.f40945a.keySet(), AbstractDirectedNetworkConnections.this.f40946b.keySet());
                } else {
                    union = Sets.union(AbstractDirectedNetworkConnections.this.f40945a.keySet(), AbstractDirectedNetworkConnections.this.f40946b.keySet());
                }
                return Iterators.unmodifiableIterator(union.iterator());
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return Collections.unmodifiableSet(this.f40946b.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        if (z) {
            int i = this.f40947c - 1;
            this.f40947c = i;
            Graphs.m68465b(i);
        }
        N remove = this.f40945a.remove(e);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        N remove = this.f40946b.remove(e);
        Objects.requireNonNull(remove);
        return remove;
    }
}
