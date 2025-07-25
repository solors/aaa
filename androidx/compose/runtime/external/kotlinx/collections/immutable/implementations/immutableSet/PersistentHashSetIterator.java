package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import ae.KMarkers;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistentHashSetIterator.kt */
@Metadata
/* loaded from: classes.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, KMarkers {
    private boolean hasNext;
    @NotNull
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(@NotNull TrieNode<E> node) {
        List<TrieNodeIterator<E>> m17160s;
        Intrinsics.checkNotNullParameter(node, "node");
        m17160s = C37563v.m17160s(new TrieNodeIterator());
        this.path = m17160s;
        this.hasNext = true;
        TrieNodeIterator.reset$default(m17160s.get(0), node.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i = this.pathLastIndex; -1 < i; i--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i);
            if (moveToNextNodeWithData == -1 && this.path.get(i).hasNextCell()) {
                this.path.get(i).moveToNextCell();
                moveToNextNodeWithData = moveToNextNodeWithData(i);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i > 0) {
                this.path.get(i - 1).moveToNextCell();
            }
            this.path.get(i).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.path.get(i).hasNextElement()) {
            return i;
        }
        if (this.path.get(i).hasNextNode()) {
            TrieNode<? extends E> currentNode = this.path.get(i).currentNode();
            int i2 = i + 1;
            if (i2 == this.path.size()) {
                this.path.add(new TrieNodeIterator<>());
            }
            TrieNodeIterator.reset$default(this.path.get(i2), currentNode.getBuffer(), 0, 2, null);
            return moveToNextNodeWithData(i2);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E currentElement() {
        commonFunctions.m107194assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final List<TrieNodeIterator<E>> getPath() {
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
    public E next() {
        if (this.hasNext) {
            E nextElement = this.path.get(this.pathLastIndex).nextElement();
            ensureNextElementIsReady();
            return nextElement;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }
}
