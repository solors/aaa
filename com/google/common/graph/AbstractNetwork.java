package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.graph.AbstractNetwork$1 */
    /* loaded from: classes4.dex */
    public class C169471 extends AbstractGraph<N> {
        C169471() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> adjacentNodes(N n) {
            return AbstractNetwork.this.adjacentNodes(n);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> edges() {
            if (AbstractNetwork.this.allowsParallelEdges()) {
                return super.edges();
            }
            return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractNetwork.1.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    if (!(obj instanceof EndpointPair)) {
                        return false;
                    }
                    EndpointPair<?> endpointPair = (EndpointPair) obj;
                    if (!C169471.this.m68519b(endpointPair) || !C169471.this.nodes().contains(endpointPair.nodeU()) || !C169471.this.successors((C169471) endpointPair.nodeU()).contains(endpointPair.nodeV())) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<EndpointPair<N>> iterator() {
                    return Iterators.transform(AbstractNetwork.this.edges().iterator(), new Function<E, EndpointPair<N>>() { // from class: com.google.common.graph.AbstractNetwork.1.1.1
                        @Override // com.google.common.base.Function
                        public /* bridge */ /* synthetic */ Object apply(Object obj) {
                            return apply((C169491) obj);
                        }

                        @Override // com.google.common.base.Function
                        public EndpointPair<N> apply(E e) {
                            return AbstractNetwork.this.incidentNodes(e);
                        }
                    });
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return AbstractNetwork.this.edges().size();
                }
            };
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public ElementOrder<N> incidentEdgeOrder() {
            return ElementOrder.unordered();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
            return AbstractNetwork.this.isDirected();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public ElementOrder<N> nodeOrder() {
            return AbstractNetwork.this.nodeOrder();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> nodes() {
            return AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
            return predecessors((C169471) obj);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
            return successors((C169471) obj);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n) {
            return AbstractNetwork.this.predecessors((AbstractNetwork) n);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n) {
            return AbstractNetwork.this.successors((AbstractNetwork) n);
        }
    }

    /* renamed from: a */
    private Predicate<E> m68510a(final N n, final N n2) {
        return new Predicate<E>() { // from class: com.google.common.graph.AbstractNetwork.2
            @Override // com.google.common.base.Predicate
            public boolean apply(E e) {
                return AbstractNetwork.this.incidentNodes(e).adjacentNode((N) n).equals(n2);
            }
        };
    }

    /* renamed from: b */
    private static <N, E> Map<E, EndpointPair<N>> m68509b(final Network<N, E> network) {
        return Maps.asMap(network.edges(), new Function<E, EndpointPair<N>>() { // from class: com.google.common.graph.AbstractNetwork.3
            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C169513) obj);
            }

            @Override // com.google.common.base.Function
            public EndpointPair<N> apply(E e) {
                return Network.this.incidentNodes(e);
            }
        });
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e) {
        EndpointPair<N> incidentNodes = incidentNodes(e);
        return Sets.difference(Sets.union(incidentEdges(incidentNodes.nodeU()), incidentEdges(incidentNodes.nodeV())), ImmutableSet.m69330of((Object) e));
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
        return new C169471();
    }

    /* renamed from: c */
    protected final boolean m68508c(EndpointPair<?> endpointPair) {
        if (!endpointPair.isOrdered() && isDirected()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m68507d(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(m68508c(endpointPair), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.Network
    public int degree(N n) {
        if (isDirected()) {
            return IntMath.saturatedAdd(inEdges(n).size(), outEdges(n).size());
        }
        return IntMath.saturatedAdd(incidentEdges(n).size(), edgesConnecting(n, n).size());
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(N n, N n2) {
        Set<E> edgesConnecting = edgesConnecting(n, n2);
        int size = edgesConnecting.size();
        if (size != 0) {
            if (size == 1) {
                return edgesConnecting.iterator().next();
            }
            throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n, n2));
        }
        return null;
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n, N n2) {
        Set<E> outEdges = outEdges(n);
        Set<E> inEdges = inEdges(n2);
        if (outEdges.size() <= inEdges.size()) {
            return Collections.unmodifiableSet(Sets.filter(outEdges, m68510a(n, n2)));
        }
        return Collections.unmodifiableSet(Sets.filter(inEdges, m68510a(n2, n)));
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (isDirected() == network.isDirected() && nodes().equals(network.nodes()) && m68509b(this).equals(m68509b(network))) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((AbstractNetwork<N, E>) n).contains(n2);
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return m68509b(this).hashCode();
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n) {
        if (isDirected()) {
            return inEdges(n).size();
        }
        return degree(n);
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n) {
        if (isDirected()) {
            return outEdges(n).size();
        }
        return degree(n);
    }

    public String toString() {
        boolean isDirected = isDirected();
        boolean allowsParallelEdges = allowsParallelEdges();
        boolean allowsSelfLoops = allowsSelfLoops();
        String valueOf = String.valueOf(nodes());
        String valueOf2 = String.valueOf(m68509b(this));
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 87 + valueOf2.length());
        sb2.append("isDirected: ");
        sb2.append(isDirected);
        sb2.append(", allowsParallelEdges: ");
        sb2.append(allowsParallelEdges);
        sb2.append(", allowsSelfLoops: ");
        sb2.append(allowsSelfLoops);
        sb2.append(", nodes: ");
        sb2.append(valueOf);
        sb2.append(", edges: ");
        sb2.append(valueOf2);
        return sb2.toString();
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (m68508c(endpointPair)) {
            return hasEdgeConnecting(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        m68507d(endpointPair);
        return edgeConnectingOrNull(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        m68507d(endpointPair);
        return edgesConnecting(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
