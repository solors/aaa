package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingDeque;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    protected ForwardingBlockingDeque() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return mo67599l().drainTo(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingDeque
    /* renamed from: m */
    public abstract BlockingDeque<E> mo67599l();

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67599l().offer(e, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67599l().offerFirst(e, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67599l().offerLast(e, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67599l().poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollFirst(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67599l().pollFirst(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollLast(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67599l().pollLast(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e) throws InterruptedException {
        mo67599l().put(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e) throws InterruptedException {
        mo67599l().putFirst(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e) throws InterruptedException {
        mo67599l().putLast(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return mo67599l().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return mo67599l().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return mo67599l().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return mo67599l().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        return mo67599l().drainTo(collection, i);
    }
}
