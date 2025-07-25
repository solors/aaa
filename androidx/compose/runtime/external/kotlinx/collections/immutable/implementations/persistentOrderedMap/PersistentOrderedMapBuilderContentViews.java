package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderContentViews;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderEntries */
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderContentViews<K, V> extends PersistentHashMapBuilderContentViews<Map.Entry<K, V>, K, V> {
    @NotNull
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderContentViews(@NotNull PersistentOrderedMapBuilder<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((Map.Entry) ((Map.Entry) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderContentViews
    public boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        V v = this.builder.get(element.getKey());
        if (v != null) {
            return Intrinsics.m17075f(v, element.getValue());
        }
        if (element.getValue() == null && this.builder.containsKey(element.getKey())) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapBuilderEntriesIterator(this.builder);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderContentViews
    public boolean removeEntry(@NotNull Map.Entry<? extends K, ? extends V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.builder.remove(element.getKey(), element.getValue());
    }

    public boolean add(@NotNull Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }
}
