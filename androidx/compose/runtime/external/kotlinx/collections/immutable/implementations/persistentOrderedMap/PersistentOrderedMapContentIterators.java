package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import ae.KMarkers;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapContentIterators;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapEntriesIterator */
/* loaded from: classes.dex */
public final class PersistentOrderedMapContentIterators<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, KMarkers {
    @NotNull
    private final PersistentOrderedMapLinksIterator<K, V> internal;

    public PersistentOrderedMapContentIterators(@NotNull PersistentOrderedMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.internal = new PersistentOrderedMapLinksIterator<>(map.getFirstKey$runtime_release(), map.getHashMap$runtime_release());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        return new PersistentHashMapContentIterators(this.internal.getNextKey$runtime_release(), this.internal.next().getValue());
    }
}
