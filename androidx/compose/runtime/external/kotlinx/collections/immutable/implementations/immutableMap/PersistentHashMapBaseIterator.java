package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata
/* loaded from: classes.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMarkers {
    private boolean hasNext;
    @NotNull
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    public PersistentHashMapBaseIterator(@NotNull TrieNode<K, V> node, @NotNull TrieNodeBaseIterator<K, V, T>[] path) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.hasNext = true;
        path[0].reset(node.getBuffer$runtime_release(), node.entryCount$runtime_release() * 2);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    private final void checkHasNext() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    private final void ensureNextEntryIsReady() {
        if (this.path[this.pathLastIndex].hasNextKey()) {
            return;
        }
        for (int i = this.pathLastIndex; -1 < i; i--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i);
            if (moveToNextNodeWithData == -1 && this.path[i].hasNextNode()) {
                this.path[i].moveToNextNode();
                moveToNextNodeWithData = moveToNextNodeWithData(i);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i > 0) {
                this.path[i - 1].moveToNextNode();
            }
            this.path[i].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.path[i].hasNextKey()) {
            return i;
        }
        if (this.path[i].hasNextNode()) {
            TrieNode<? extends K, ? extends V> currentNode = this.path[i].currentNode();
            if (i == 6) {
                this.path[i + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.getBuffer$runtime_release().length);
            } else {
                this.path[i + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.entryCount$runtime_release() * 2);
            }
            return moveToNextNodeWithData(i + 1);
        }
        return -1;
    }

    public final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    @NotNull
    public final TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        checkHasNext();
        T next = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }
}
