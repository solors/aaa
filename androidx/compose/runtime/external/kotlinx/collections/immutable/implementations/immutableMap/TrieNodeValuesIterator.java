package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import kotlin.Metadata;

/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieNodeValuesIterator<K, V> extends TrieNodeBaseIterator<K, V, V> {
    @Override // java.util.Iterator
    public V next() {
        commonFunctions.m107194assert(hasNextKey());
        setIndex(getIndex() + 2);
        return (V) getBuffer()[getIndex() - 1];
    }
}
