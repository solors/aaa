package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import ae.KMarkers;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: AbstractListIterator.kt */
@Metadata
/* loaded from: classes.dex */
public abstract class AbstractListIterator<E> implements ListIterator<E>, KMarkers {
    private int index;
    private int size;

    public AbstractListIterator(int i, int i2) {
        this.index = i;
        this.size = i2;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime_release() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    public final void checkHasPrevious$runtime_release() {
        if (hasPrevious()) {
            return;
        }
        throw new NoSuchElementException();
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.size) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.index > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setSize(int i) {
        this.size = i;
    }
}
