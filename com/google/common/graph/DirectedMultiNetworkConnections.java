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
final class DirectedMultiNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    @LazyInit

    /* renamed from: d */
    private transient Reference<Multiset<N>> f40983d;
    @LazyInit

    /* renamed from: e */
    private transient Reference<Multiset<N>> f40984e;

    private DirectedMultiNetworkConnections(Map<E, N> map, Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    /* renamed from: c */
    private static <T> T m68486c(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <N, E> DirectedMultiNetworkConnections<N, E> m68485d() {
        return new DirectedMultiNetworkConnections<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <N, E> DirectedMultiNetworkConnections<N, E> m68484e(Map<E, N> map, Map<E, N> map2, int i) {
        return new DirectedMultiNetworkConnections<>(ImmutableMap.copyOf((Map) map), ImmutableMap.copyOf((Map) map2), i);
    }

    /* renamed from: f */
    private Multiset<N> m68483f() {
        Multiset<N> multiset = (Multiset) m68486c(this.f40983d);
        if (multiset == null) {
            HashMultiset create = HashMultiset.create(this.f40945a.values());
            this.f40983d = new SoftReference(create);
            return create;
        }
        return multiset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public Multiset<N> m68482g() {
        Multiset<N> multiset = (Multiset) m68486c(this.f40984e);
        if (multiset == null) {
            HashMultiset create = HashMultiset.create(this.f40946b.values());
            this.f40984e = new SoftReference(create);
            return create;
        }
        return multiset;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
        super.addInEdge(e, n, z);
        Multiset multiset = (Multiset) m68486c(this.f40983d);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n));
        }
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
        super.addOutEdge(e, n);
        Multiset multiset = (Multiset) m68486c(this.f40984e);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n));
        }
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(final N n) {
        return new MultiEdgesConnecting<E>(this.f40946b, n) { // from class: com.google.common.graph.DirectedMultiNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedMultiNetworkConnections.this.m68482g().count(n);
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return Collections.unmodifiableSet(m68483f().elementSet());
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        N n = (N) super.removeInEdge(e, z);
        Multiset multiset = (Multiset) m68486c(this.f40983d);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        Multiset multiset = (Multiset) m68486c(this.f40984e);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return Collections.unmodifiableSet(m68482g().elementSet());
    }
}
