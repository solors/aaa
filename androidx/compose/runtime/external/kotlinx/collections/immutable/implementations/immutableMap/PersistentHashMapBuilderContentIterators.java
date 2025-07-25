package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import ae.InterfaceC0039e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MutableMapEntry */
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderContentIterators<K, V> extends PersistentHashMapContentIterators<K, V> implements InterfaceC0039e.InterfaceC0040a {
    @NotNull
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
    private V value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentHashMapBuilderContentIterators(@NotNull PersistentHashMapBuilderEntriesIterator<K, V> parentIterator, K k, V v) {
        super(k, v);
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.parentIterator = parentIterator;
        this.value = v;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapContentIterators, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v) {
        this.value = v;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapContentIterators, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        setValue((PersistentHashMapBuilderContentIterators<K, V>) v);
        this.parentIterator.setValue(getKey(), v);
        return value;
    }
}
