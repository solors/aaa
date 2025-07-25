package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieNodeMutableEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<K, V>> {
    @NotNull
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;

    public TrieNodeMutableEntriesIterator(@NotNull PersistentHashMapBuilderEntriesIterator<K, V> parentIterator) {
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.parentIterator = parentIterator;
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        commonFunctions.m107194assert(hasNextKey());
        setIndex(getIndex() + 2);
        return new PersistentHashMapBuilderContentIterators(this.parentIterator, getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
