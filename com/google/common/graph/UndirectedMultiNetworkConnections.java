package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class UndirectedMultiNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {
    @LazyInit

    /* renamed from: b */
    private transient Reference<Multiset<N>> f41064b;

    private UndirectedMultiNetworkConnections(Map<E, N> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public Multiset<N> m68390b() {
        Multiset<N> multiset = (Multiset) m68389c(this.f41064b);
        if (multiset == null) {
            HashMultiset create = HashMultiset.create(this.f40961a.values());
            this.f41064b = new SoftReference(create);
            return create;
        }
        return multiset;
    }

    /* renamed from: c */
    private static <T> T m68389c(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <N, E> UndirectedMultiNetworkConnections<N, E> m68388d() {
        return new UndirectedMultiNetworkConnections<>(new HashMap(2, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <N, E> UndirectedMultiNetworkConnections<N, E> m68387e(Map<E, N> map) {
        return new UndirectedMultiNetworkConnections<>(ImmutableMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
        if (!z) {
            addOutEdge(e, n);
        }
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
        super.addOutEdge(e, n);
        Multiset multiset = (Multiset) m68389c(this.f41064b);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n));
        }
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(m68390b().elementSet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(final N n) {
        return new MultiEdgesConnecting<E>(this.f40961a, n) { // from class: com.google.common.graph.UndirectedMultiNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return UndirectedMultiNetworkConnections.this.m68390b().count(n);
            }
        };
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        if (!z) {
            return removeOutEdge(e);
        }
        return null;
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        Multiset multiset = (Multiset) m68389c(this.f41064b);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }
}
