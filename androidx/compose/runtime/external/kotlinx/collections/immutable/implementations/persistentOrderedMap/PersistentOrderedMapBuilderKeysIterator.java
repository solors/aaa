package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderKeysIterator<K, V> implements Iterator<K>, KMarkers {
    @NotNull
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderKeysIterator(@NotNull PersistentOrderedMapBuilder<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(map.getFirstKey$runtime_release(), map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.internal.next();
        return (K) this.internal.getLastIteratedKey$runtime_release();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }
}
