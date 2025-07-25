package za;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

@Metadata
/* renamed from: za.b */
/* loaded from: classes8.dex */
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E> {
    @NotNull

    /* renamed from: b */
    private final Queue<E> f118908b;
    @NotNull

    /* renamed from: c */
    private final ReentrantLock f118909c;

    /* renamed from: d */
    private final Condition f118910d;

    public BatchBlockingQueue(@NotNull Queue<E> backingQueue) {
        Intrinsics.checkNotNullParameter(backingQueue, "backingQueue");
        this.f118908b = backingQueue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f118909c = reentrantLock;
        this.f118910d = reentrantLock.newCondition();
    }

    /* renamed from: d */
    private final Void m589d() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e) {
        return offer(e);
    }

    /* renamed from: c */
    public int m590c() {
        this.f118909c.lock();
        try {
            return this.f118908b.size();
        } finally {
            this.f118909c.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> collection) {
        m589d();
        throw new ExceptionsH();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        m589d();
        throw new ExceptionsH();
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return offer(e);
    }

    @Override // java.util.Queue
    public E peek() {
        this.f118909c.lock();
        try {
            return this.f118908b.peek();
        } finally {
            this.f118909c.unlock();
        }
    }

    @Override // java.util.Queue
    @Nullable
    public E poll() {
        this.f118909c.lock();
        try {
            return this.f118908b.poll();
        } finally {
            this.f118909c.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) {
        offer(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        this.f118909c.lock();
        try {
            return this.f118908b.remove(obj);
        } finally {
            this.f118909c.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return m590c();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Spliterator<E> spliterator() {
        m589d();
        throw new ExceptionsH();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.f118909c.lockInterruptibly();
        while (this.f118908b.isEmpty()) {
            try {
                this.f118910d.await();
            } finally {
                this.f118909c.unlock();
            }
        }
        return this.f118908b.poll();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> collection, int i) {
        m589d();
        throw new ExceptionsH();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e) {
        this.f118909c.lock();
        try {
            this.f118908b.offer(e);
            this.f118910d.signal();
            Unit unit = Unit.f99208a;
            this.f118909c.unlock();
            return true;
        } catch (Throwable th) {
            this.f118909c.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    @Nullable
    public E poll(long j, @NotNull TimeUnit unit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f118909c.lockInterruptibly();
        try {
            long nanos = unit.toNanos(j);
            while (this.f118908b.isEmpty() && nanos > 0) {
                nanos = this.f118910d.awaitNanos(nanos);
            }
            return this.f118908b.poll();
        } finally {
            this.f118909c.unlock();
        }
    }
}
