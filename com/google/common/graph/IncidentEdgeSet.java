package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class IncidentEdgeSet<N> extends AbstractSet<EndpointPair<N>> {

    /* renamed from: b */
    final N f41011b;

    /* renamed from: c */
    final BaseGraph<N> f41012c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IncidentEdgeSet(BaseGraph<N> baseGraph, N n) {
        this.f41012c = baseGraph;
        this.f41011b = n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.f41012c.isDirected()) {
            if (!endpointPair.isOrdered()) {
                return false;
            }
            Object source = endpointPair.source();
            Object target = endpointPair.target();
            if ((!this.f41011b.equals(source) || !this.f41012c.successors((BaseGraph<N>) this.f41011b).contains(target)) && (!this.f41011b.equals(target) || !this.f41012c.predecessors((BaseGraph<N>) this.f41011b).contains(source))) {
                return false;
            }
            return true;
        } else if (endpointPair.isOrdered()) {
            return false;
        } else {
            Set<N> adjacentNodes = this.f41012c.adjacentNodes(this.f41011b);
            Object nodeU = endpointPair.nodeU();
            Object nodeV = endpointPair.nodeV();
            if ((!this.f41011b.equals(nodeV) || !adjacentNodes.contains(nodeU)) && (!this.f41011b.equals(nodeU) || !adjacentNodes.contains(nodeV))) {
                return false;
            }
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.f41012c.isDirected()) {
            return (this.f41012c.inDegree(this.f41011b) + this.f41012c.outDegree(this.f41011b)) - (this.f41012c.successors((BaseGraph<N>) this.f41011b).contains(this.f41011b) ? 1 : 0);
        }
        return this.f41012c.adjacentNodes(this.f41011b).size();
    }
}
