package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class ForwardingValueGraph<N, V> extends AbstractValueGraph<N, V> {
    @Override // com.google.common.graph.AbstractBaseGraph
    /* renamed from: a */
    protected long mo68411a() {
        return mo68454e().edges().size();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n) {
        return mo68454e().adjacentNodes(n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return mo68454e().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int degree(N n) {
        return mo68454e().degree(n);
    }

    /* renamed from: e */
    abstract ValueGraph<N, V> mo68454e();

    @Override // com.google.common.graph.ValueGraph
    public V edgeValueOrDefault(N n, N n2, V v) {
        return mo68454e().edgeValueOrDefault(n, n2, v);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
        return mo68454e().hasEdgeConnecting(n, n2);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int inDegree(N n) {
        return mo68454e().inDegree(n);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return mo68454e().incidentEdgeOrder();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return mo68454e().isDirected();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return mo68454e().nodeOrder();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> nodes() {
        return mo68454e().nodes();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int outDegree(N n) {
        return mo68454e().outDegree(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        return predecessors((ForwardingValueGraph<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        return successors((ForwardingValueGraph<N, V>) obj);
    }

    @Override // com.google.common.graph.ValueGraph
    public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v) {
        return mo68454e().edgeValueOrDefault(endpointPair, v);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        return mo68454e().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n) {
        return mo68454e().predecessors((ValueGraph<N, V>) n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n) {
        return mo68454e().successors((ValueGraph<N, V>) n);
    }
}
