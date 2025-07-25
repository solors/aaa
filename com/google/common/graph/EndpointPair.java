package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import com.ironsource.C21114v8;
import java.util.Iterator;

@Immutable(containerOf = {"N"})
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class EndpointPair<N> implements Iterable<N> {

    /* renamed from: b */
    private final N f40993b;

    /* renamed from: c */
    private final N f40994c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Ordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (source().equals(endpointPair.source()) && target().equals(endpointPair.target())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return Objects.hashCode(source(), target());
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            return nodeV();
        }

        public String toString() {
            String valueOf = String.valueOf(source());
            String valueOf2 = String.valueOf(target());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 6 + valueOf2.length());
            sb2.append("<");
            sb2.append(valueOf);
            sb2.append(" -> ");
            sb2.append(valueOf2);
            sb2.append(">");
            return sb2.toString();
        }

        private Ordered(N n, N n2) {
            super(n, n2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Unordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (nodeU().equals(endpointPair.nodeU())) {
                return nodeV().equals(endpointPair.nodeV());
            }
            if (nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeU().hashCode() + nodeV().hashCode();
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            String valueOf = String.valueOf(nodeU());
            String valueOf2 = String.valueOf(nodeV());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb2.append(C21114v8.C21123i.f54137d);
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(C21114v8.C21123i.f54139e);
            return sb2.toString();
        }

        private Unordered(N n, N n2) {
            super(n, n2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <N> EndpointPair<N> m68475a(Graph<?> graph, N n, N n2) {
        if (graph.isDirected()) {
            return ordered(n, n2);
        }
        return unordered(n, n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <N> EndpointPair<N> m68474b(Network<?, ?> network, N n, N n2) {
        if (network.isDirected()) {
            return ordered(n, n2);
        }
        return unordered(n, n2);
    }

    public static <N> EndpointPair<N> ordered(N n, N n2) {
        return new Ordered(n, n2);
    }

    public static <N> EndpointPair<N> unordered(N n, N n2) {
        return new Unordered(n2, n);
    }

    public final N adjacentNode(N n) {
        if (n.equals(this.f40993b)) {
            return this.f40994c;
        }
        if (n.equals(this.f40994c)) {
            return this.f40993b;
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(n);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 36 + valueOf2.length());
        sb2.append("EndpointPair ");
        sb2.append(valueOf);
        sb2.append(" does not contain node ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public final N nodeU() {
        return this.f40993b;
    }

    public final N nodeV() {
        return this.f40994c;
    }

    public abstract N source();

    public abstract N target();

    private EndpointPair(N n, N n2) {
        this.f40993b = (N) Preconditions.checkNotNull(n);
        this.f40994c = (N) Preconditions.checkNotNull(n2);
    }

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.forArray(this.f40993b, this.f40994c);
    }
}
