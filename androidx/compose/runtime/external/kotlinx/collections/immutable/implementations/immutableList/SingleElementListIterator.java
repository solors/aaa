package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;

/* compiled from: AbstractListIterator.kt */
@Metadata
/* loaded from: classes.dex */
public final class SingleElementListIterator<E> extends AbstractListIterator<E> {
    private final E element;

    public SingleElementListIterator(E e, int i) {
        super(i, 1);
        this.element = e;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        checkHasNext$runtime_release();
        setIndex(getIndex() + 1);
        return this.element;
    }

    @Override // java.util.ListIterator
    public E previous() {
        checkHasPrevious$runtime_release();
        setIndex(getIndex() - 1);
        return this.element;
    }
}
