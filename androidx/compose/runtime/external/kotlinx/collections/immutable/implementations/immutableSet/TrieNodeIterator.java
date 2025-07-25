package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentHashSetIterator.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {
    @NotNull
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        trieNodeIterator.reset(objArr, i);
    }

    public final E currentElement() {
        commonFunctions.m107194assert(hasNextElement());
        return (E) this.buffer[this.index];
    }

    @NotNull
    public final TrieNode<? extends E> currentNode() {
        commonFunctions.m107194assert(hasNextNode());
        Object obj = this.buffer[this.index];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
    }

    public final boolean hasNextCell() {
        if (this.index < this.buffer.length) {
            return true;
        }
        return false;
    }

    public final boolean hasNextElement() {
        if (hasNextCell() && !(this.buffer[this.index] instanceof TrieNode)) {
            return true;
        }
        return false;
    }

    public final boolean hasNextNode() {
        if (hasNextCell() && (this.buffer[this.index] instanceof TrieNode)) {
            return true;
        }
        return false;
    }

    public final void moveToNextCell() {
        commonFunctions.m107194assert(hasNextCell());
        this.index++;
    }

    public final E nextElement() {
        commonFunctions.m107194assert(hasNextElement());
        Object[] objArr = this.buffer;
        int i = this.index;
        this.index = i + 1;
        return (E) objArr[i];
    }

    public final void reset(@NotNull Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.index = i;
    }
}
