package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* renamed from: a */
    final Map<E, N> f40961a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractUndirectedNetworkConnections(Map<E, N> map) {
        this.f40961a = (Map) Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
        if (!z) {
            addOutEdge(e, n);
        }
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
        boolean z;
        if (this.f40961a.put(e, n) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e) {
        N n = this.f40961a.get(e);
        Objects.requireNonNull(n);
        return n;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return Collections.unmodifiableSet(this.f40961a.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        if (!z) {
            return removeOutEdge(e);
        }
        return null;
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        N remove = this.f40961a.remove(e);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return adjacentNodes();
    }
}
