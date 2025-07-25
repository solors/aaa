package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieNodeEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        commonFunctions.m107194assert(hasNextKey());
        setIndex(getIndex() + 2);
        return new PersistentHashMapContentIterators(getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
