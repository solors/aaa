package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {

    /* renamed from: b */
    private final Queue<E> f39947b;
    @VisibleForTesting

    /* renamed from: c */
    final int f39948c;

    private EvictingQueue(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "maxSize (%s) must >= 0", i);
        this.f39947b = new ArrayDeque(i);
        this.f39948c = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e) {
        Preconditions.checkNotNull(e);
        if (this.f39948c == 0) {
            return true;
        }
        if (size() == this.f39948c) {
            this.f39947b.remove();
        }
        this.f39947b.add(e);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size >= this.f39948c) {
            clear();
            return Iterables.addAll(this, Iterables.skip(collection, size - this.f39948c));
        }
        return m69520d(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: j */
    public Queue<E> delegate() {
        return this.f39947b;
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.f39948c - size();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }
}
