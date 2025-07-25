package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentOrderedMapContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentOrderedMapKeysIterator<K, V> implements Iterator<K>, KMarkers {
    @NotNull
    private final PersistentOrderedMapLinksIterator<K, V> internal;

    public PersistentOrderedMapKeysIterator(@NotNull PersistentOrderedMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.internal = new PersistentOrderedMapLinksIterator<>(map.getFirstKey$runtime_release(), map.getHashMap$runtime_release());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        K k = (K) this.internal.getNextKey$runtime_release();
        this.internal.next();
        return k;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
