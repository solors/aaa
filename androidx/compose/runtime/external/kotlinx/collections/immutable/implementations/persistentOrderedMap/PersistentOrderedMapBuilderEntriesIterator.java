package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import ae.KMarkers;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMarkers {
    @NotNull
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderEntriesIterator(@NotNull PersistentOrderedMapBuilder<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(map.getFirstKey$runtime_release(), map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        return new PersistentOrderedMapBuilderContentIterators(this.internal.getBuilder$runtime_release().getHashMapBuilder$runtime_release(), this.internal.getLastIteratedKey$runtime_release(), this.internal.next());
    }
}
