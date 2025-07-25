package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import ae.KMarkers;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, KMarkers {
    @NotNull
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    public final K currentKey() {
        commonFunctions.m107194assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    @NotNull
    public final TrieNode<? extends K, ? extends V> currentNode() {
        commonFunctions.m107194assert(hasNextNode());
        Object obj = this.buffer[this.index];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final Object[] getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        if (this.index < this.dataSize) {
            return true;
        }
        return false;
    }

    public final boolean hasNextNode() {
        boolean z;
        if (this.index >= this.dataSize) {
            z = true;
        } else {
            z = false;
        }
        commonFunctions.m107194assert(z);
        if (this.index < this.buffer.length) {
            return true;
        }
        return false;
    }

    public final void moveToNextKey() {
        commonFunctions.m107194assert(hasNextKey());
        this.index += 2;
    }

    public final void moveToNextNode() {
        commonFunctions.m107194assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(@NotNull Object[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.dataSize = i;
        this.index = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIndex(int i) {
        this.index = i;
    }

    public final void reset(@NotNull Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        reset(buffer, i, 0);
    }
}
