package androidx.compose.runtime.snapshots;

import ae.InterfaceC0039e;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: SnapshotStateMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class StateMapMutableEntriesIterator$next$1<K, V> implements Map.Entry<K, V>, InterfaceC0039e.InterfaceC0040a {
    private final K key;
    final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
    private V value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
        this.this$0 = stateMapMutableEntriesIterator;
        Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
        Intrinsics.m17074g(current);
        this.key = current.getKey();
        Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
        Intrinsics.m17074g(current2);
        this.value = current2.getValue();
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v) {
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
        if (stateMapMutableEntriesIterator.getMap().getModification$runtime_release() == ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
            V value = getValue();
            stateMapMutableEntriesIterator.getMap().put(getKey(), v);
            setValue((StateMapMutableEntriesIterator$next$1<K, V>) v);
            return value;
        }
        throw new ConcurrentModificationException();
    }
}
