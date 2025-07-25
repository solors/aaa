package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderValuesIterator<K, V> implements Iterator<V>, KMarkers {
    @NotNull
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderValuesIterator(@NotNull PersistentOrderedMapBuilder<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(map.getFirstKey$runtime_release(), map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.internal.next().getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }
}
