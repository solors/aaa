package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class ForwardingCondition implements Condition {
    /* renamed from: a */
    abstract Condition mo67453a();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        mo67453a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) throws InterruptedException {
        return mo67453a().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        mo67453a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return mo67453a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        mo67453a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        mo67453a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo67453a().await(j, timeUnit);
    }
}
