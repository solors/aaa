package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    @Override // java.util.Queue
    @ParametricNullness
    public E element() {
        return delegate().element();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: j */
    public abstract Queue<E> delegate();

    @CanIgnoreReturnValue
    public boolean offer(@ParametricNullness E e) {
        return delegate().offer(e);
    }

    @Override // java.util.Queue
    public E peek() {
        return delegate().peek();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        return delegate().poll();
    }

    @Override // java.util.Queue
    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove() {
        return delegate().remove();
    }
}
