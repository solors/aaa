package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Deque;
import java.util.Iterator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(@ParametricNullness E e) {
        mo67596j().addFirst(e);
    }

    @Override // java.util.Deque
    public void addLast(@ParametricNullness E e) {
        mo67596j().addLast(e);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return mo67596j().descendingIterator();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getFirst() {
        return mo67596j().getFirst();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getLast() {
        return mo67596j().getLast();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue
    /* renamed from: l */
    public abstract Deque<E> mo67596j();

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerFirst(@ParametricNullness E e) {
        return mo67596j().offerFirst(e);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerLast(@ParametricNullness E e) {
        return mo67596j().offerLast(e);
    }

    @Override // java.util.Deque
    public E peekFirst() {
        return mo67596j().peekFirst();
    }

    @Override // java.util.Deque
    public E peekLast() {
        return mo67596j().peekLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollFirst() {
        return mo67596j().pollFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollLast() {
        return mo67596j().pollLast();
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E pop() {
        return mo67596j().pop();
    }

    @Override // java.util.Deque
    public void push(@ParametricNullness E e) {
        mo67596j().push(e);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeFirst() {
        return mo67596j().removeFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(Object obj) {
        return mo67596j().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeLast() {
        return mo67596j().removeLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(Object obj) {
        return mo67596j().removeLastOccurrence(obj);
    }
}
