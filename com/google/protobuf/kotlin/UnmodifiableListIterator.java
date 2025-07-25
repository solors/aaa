package com.google.protobuf.kotlin;

import ae.KMarkers;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnmodifiableCollections.kt */
@Metadata
/* loaded from: classes5.dex */
public final class UnmodifiableListIterator<E> implements ListIterator<E>, KMarkers {
    private final /* synthetic */ ListIterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableListIterator(@NotNull ListIterator<? extends E> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$$delegate_0.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$$delegate_0.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.$$delegate_0.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$$delegate_0.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
