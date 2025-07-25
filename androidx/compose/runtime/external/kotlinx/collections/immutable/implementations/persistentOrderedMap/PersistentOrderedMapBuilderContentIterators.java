package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import ae.InterfaceC0039e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapContentIterators;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.MutableMapEntry */
/* loaded from: classes.dex */
final class PersistentOrderedMapBuilderContentIterators<K, V> extends PersistentHashMapContentIterators<K, V> implements InterfaceC0039e.InterfaceC0040a {
    @NotNull
    private LinkedValue<V> links;
    @NotNull
    private final Map<K, LinkedValue<V>> mutableMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentOrderedMapBuilderContentIterators(@NotNull Map<K, LinkedValue<V>> mutableMap, K k, @NotNull LinkedValue<V> links) {
        super(k, links.getValue());
        Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        Intrinsics.checkNotNullParameter(links, "links");
        this.mutableMap = mutableMap;
        this.links = links;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapContentIterators, java.util.Map.Entry
    public V getValue() {
        return this.links.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapContentIterators, java.util.Map.Entry
    public V setValue(V v) {
        V value = this.links.getValue();
        this.links = this.links.withValue(v);
        this.mutableMap.put(getKey(), this.links);
        return value;
    }
}
