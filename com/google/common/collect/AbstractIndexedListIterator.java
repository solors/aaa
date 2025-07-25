package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {

    /* renamed from: b */
    private final int f39720b;

    /* renamed from: c */
    private int f39721c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractIndexedListIterator(int i) {
        this(i, 0);
    }

    @ParametricNullness
    protected abstract E get(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f39721c < this.f39720b) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f39721c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @ParametricNullness
    public final E next() {
        if (hasNext()) {
            int i = this.f39721c;
            this.f39721c = i + 1;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39721c;
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f39721c - 1;
            this.f39721c = i;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39721c - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractIndexedListIterator(int i, int i2) {
        Preconditions.checkPositionIndex(i2, i);
        this.f39720b = i;
        this.f39721c = i2;
    }
}
