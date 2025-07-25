package androidx.compose.runtime.snapshots;

import ae.KMarkers;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class StateMapMutableValuesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<V>, KMarkers {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMapMutableValuesIterator(@NotNull SnapshotStateMap<K, V> map, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> next = getNext();
        if (next != null) {
            advance();
            return next.getValue();
        }
        throw new IllegalStateException();
    }
}
