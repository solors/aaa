package com.google.common.graph;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class DirectedNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    DirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <N, E> DirectedNetworkConnections<N, E> m68481b() {
        return new DirectedNetworkConnections<>(HashBiMap.create(2), HashBiMap.create(2), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <N, E> DirectedNetworkConnections<N, E> m68480c(Map<E, N> map, Map<E, N> map2, int i) {
        return new DirectedNetworkConnections<>(ImmutableBiMap.copyOf((Map) map), ImmutableBiMap.copyOf((Map) map2), i);
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n) {
        return new EdgesConnecting(((BiMap) this.f40946b).inverse(), n);
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return Collections.unmodifiableSet(((BiMap) this.f40945a).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return Collections.unmodifiableSet(((BiMap) this.f40946b).values());
    }
}
