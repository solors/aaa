package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderValues<K, V> extends AbstractMutableCollection<V> {
    @NotNull
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderValues(@NotNull PersistentHashMapBuilder<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
    }

    @Override // kotlin.collections.AbstractMutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.builder.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new PersistentHashMapBuilderValuesIterator(this.builder);
    }
}
