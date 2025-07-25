package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class ForwardingLock implements Lock {
    /* renamed from: a */
    abstract Lock mo67452a();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        mo67452a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws InterruptedException {
        mo67452a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        return mo67452a().newCondition();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return mo67452a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        mo67452a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67452a().tryLock(j, timeUnit);
    }
}
