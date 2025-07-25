package com.google.common.graph;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingNetwork<N, E> extends AbstractNetwork<N, E> {
    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> adjacentEdges(E e) {
        return mo68456e().adjacentEdges(e);
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n) {
        return mo68456e().adjacentNodes(n);
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return mo68456e().allowsParallelEdges();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return mo68456e().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(N n) {
        return mo68456e().degree(n);
    }

    /* renamed from: e */
    abstract Network<N, E> mo68456e();

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(N n, N n2) {
        return mo68456e().edgeConnectingOrNull(n, n2);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return mo68456e().edgeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return mo68456e().edges();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n, N n2) {
        return mo68456e().edgesConnecting(n, n2);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n, N n2) {
        return mo68456e().hasEdgeConnecting(n, n2);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int inDegree(N n) {
        return mo68456e().inDegree(n);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n) {
        return mo68456e().inEdges(n);
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n) {
        return mo68456e().incidentEdges(n);
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e) {
        return mo68456e().incidentNodes(e);
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return mo68456e().isDirected();
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return mo68456e().nodeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return mo68456e().nodes();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int outDegree(N n) {
        return mo68456e().outDegree(n);
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n) {
        return mo68456e().outEdges(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        return predecessors((ForwardingNetwork<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        return successors((ForwardingNetwork<N, E>) obj);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        return mo68456e().edgeConnectingOrNull(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        return mo68456e().edgesConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        return mo68456e().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n) {
        return mo68456e().predecessors((Network<N, E>) n);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n) {
        return mo68456e().successors((Network<N, E>) n);
    }
}
