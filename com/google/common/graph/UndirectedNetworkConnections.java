package com.google.common.graph;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class UndirectedNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {
    UndirectedNetworkConnections(Map<E, N> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <N, E> UndirectedNetworkConnections<N, E> m68386a() {
        return new UndirectedNetworkConnections<>(HashBiMap.create(2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <N, E> UndirectedNetworkConnections<N, E> m68385b(Map<E, N> map) {
        return new UndirectedNetworkConnections<>(ImmutableBiMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(((BiMap) this.f40961a).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n) {
        return new EdgesConnecting(((BiMap) this.f40961a).inverse(), n);
    }
}
