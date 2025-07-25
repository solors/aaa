package androidx.compose.runtime.snapshots;

import ae.KMarkers;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SnapshotStateMap.kt */
@Metadata
/* loaded from: classes.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMarkers {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMapMutableEntriesIterator(@NotNull SnapshotStateMap<K, V> map, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
