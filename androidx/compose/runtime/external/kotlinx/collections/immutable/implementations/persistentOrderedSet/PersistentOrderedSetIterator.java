package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import ae.KMarkers;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PersistentOrderedSetIterator.kt */
@Metadata
/* loaded from: classes.dex */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, KMarkers {
    private int index;
    @NotNull
    private final Map<E, Links> map;
    @Nullable
    private Object nextElement;

    public PersistentOrderedSetIterator(@Nullable Object obj, @NotNull Map<E, Links> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.nextElement = obj;
        this.map = map;
    }

    private final void checkHasNext() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    @NotNull
    public final Map<E, Links> getMap$runtime_release() {
        return this.map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.map.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        checkHasNext();
        E e = (E) this.nextElement;
        this.index++;
        Links links = this.map.get(e);
        if (links != null) {
            this.nextElement = links.getNext();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i) {
        this.index = i;
    }
}
