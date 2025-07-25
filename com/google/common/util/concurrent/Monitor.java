package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Monitor {

    /* renamed from: a */
    private final boolean f41876a;

    /* renamed from: b */
    private final ReentrantLock f41877b;
    @GuardedBy("lock")

    /* renamed from: c */
    private Guard f41878c;

    /* loaded from: classes4.dex */
    public static abstract class Guard {
        @Weak

        /* renamed from: a */
        final Monitor f41879a;

        /* renamed from: b */
        final Condition f41880b;
        @GuardedBy("monitor.lock")

        /* renamed from: c */
        int f41881c = 0;
        @GuardedBy("monitor.lock")

        /* renamed from: d */
        Guard f41882d;

        /* JADX INFO: Access modifiers changed from: protected */
        public Guard(Monitor monitor) {
            this.f41879a = (Monitor) Preconditions.checkNotNull(monitor, "monitor");
            this.f41880b = monitor.f41877b.newCondition();
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
        this(false);
    }

    @GuardedBy("lock")
    /* renamed from: b */
    private void m67555b(Guard guard, boolean z) throws InterruptedException {
        if (z) {
            m67546k();
        }
        m67552e(guard);
        do {
            try {
                guard.f41880b.await();
            } finally {
                m67551f(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    /* renamed from: c */
    private boolean m67554c(Guard guard, long j, boolean z) throws InterruptedException {
        boolean z2 = true;
        while (j > 0) {
            if (z2) {
                if (z) {
                    try {
                        m67546k();
                    } finally {
                        if (!z2) {
                            m67551f(guard);
                        }
                    }
                }
                m67552e(guard);
                z2 = false;
            }
            j = guard.f41880b.awaitNanos(j);
            if (guard.isSatisfied()) {
                if (!z2) {
                    m67551f(guard);
                }
                return true;
            }
        }
        return false;
    }

    @GuardedBy("lock")
    /* renamed from: d */
    private void m67553d(Guard guard, boolean z) {
        if (z) {
            m67546k();
        }
        m67552e(guard);
        do {
            try {
                guard.f41880b.awaitUninterruptibly();
            } finally {
                m67551f(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    /* renamed from: e */
    private void m67552e(Guard guard) {
        int i = guard.f41881c;
        guard.f41881c = i + 1;
        if (i == 0) {
            guard.f41882d = this.f41878c;
            this.f41878c = guard;
        }
    }

    @GuardedBy("lock")
    /* renamed from: f */
    private void m67551f(Guard guard) {
        int i = guard.f41881c - 1;
        guard.f41881c = i;
        if (i == 0) {
            Guard guard2 = this.f41878c;
            Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.f41882d;
            }
            if (guard3 == null) {
                this.f41878c = guard2.f41882d;
            } else {
                guard3.f41882d = guard2.f41882d;
            }
            guard2.f41882d = null;
        }
    }

    /* renamed from: g */
    private static long m67550g(long j) {
        if (j <= 0) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    @GuardedBy("lock")
    /* renamed from: h */
    private boolean m67549h(Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (Throwable th) {
            m67547j();
            throw th;
        }
    }

    /* renamed from: i */
    private static long m67548i(long j, long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 - (System.nanoTime() - j);
    }

    @GuardedBy("lock")
    /* renamed from: j */
    private void m67547j() {
        for (Guard guard = this.f41878c; guard != null; guard = guard.f41882d) {
            guard.f41880b.signalAll();
        }
    }

    @GuardedBy("lock")
    /* renamed from: k */
    private void m67546k() {
        for (Guard guard = this.f41878c; guard != null; guard = guard.f41882d) {
            if (m67549h(guard)) {
                guard.f41880b.signal();
                return;
            }
        }
    }

    /* renamed from: l */
    private static long m67545l(long j, TimeUnit timeUnit) {
        return Longs.constrainToRange(timeUnit.toNanos(j), 0L, 6917529027641081853L);
    }

    public void enter() {
        this.f41877b.lock();
    }

    public boolean enterIf(Guard guard) {
        if (guard.f41879a == this) {
            ReentrantLock reentrantLock = this.f41877b;
            reentrantLock.lock();
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard) throws InterruptedException {
        if (guard.f41879a == this) {
            ReentrantLock reentrantLock = this.f41877b;
            reentrantLock.lockInterruptibly();
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void enterInterruptibly() throws InterruptedException {
        this.f41877b.lockInterruptibly();
    }

    public void enterWhen(Guard guard) throws InterruptedException {
        if (guard.f41879a == this) {
            ReentrantLock reentrantLock = this.f41877b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lockInterruptibly();
            try {
                if (guard.isSatisfied()) {
                    return;
                }
                m67555b(guard, isHeldByCurrentThread);
                return;
            } catch (Throwable th) {
                leave();
                throw th;
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void enterWhenUninterruptibly(Guard guard) {
        if (guard.f41879a == this) {
            ReentrantLock reentrantLock = this.f41877b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lock();
            try {
                if (guard.isSatisfied()) {
                    return;
                }
                m67553d(guard, isHeldByCurrentThread);
                return;
            } catch (Throwable th) {
                leave();
                throw th;
            }
        }
        throw new IllegalMonitorStateException();
    }

    public int getOccupiedDepth() {
        return this.f41877b.getHoldCount();
    }

    public int getQueueLength() {
        return this.f41877b.getQueueLength();
    }

    public int getWaitQueueLength(Guard guard) {
        if (guard.f41879a == this) {
            this.f41877b.lock();
            try {
                return guard.f41881c;
            } finally {
                this.f41877b.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean hasQueuedThread(Thread thread) {
        return this.f41877b.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads() {
        return this.f41877b.hasQueuedThreads();
    }

    public boolean hasWaiters(Guard guard) {
        if (getWaitQueueLength(guard) > 0) {
            return true;
        }
        return false;
    }

    public boolean isFair() {
        return this.f41876a;
    }

    public boolean isOccupied() {
        return this.f41877b.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.f41877b.isHeldByCurrentThread();
    }

    public void leave() {
        ReentrantLock reentrantLock = this.f41877b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                m67546k();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnter() {
        return this.f41877b.tryLock();
    }

    public boolean tryEnterIf(Guard guard) {
        if (guard.f41879a == this) {
            ReentrantLock reentrantLock = this.f41877b;
            if (!reentrantLock.tryLock()) {
                return false;
            }
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void waitFor(Guard guard) throws InterruptedException {
        if (guard.f41879a == this && this.f41877b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return;
            }
            m67555b(guard, true);
            return;
        }
        throw new IllegalMonitorStateException();
    }

    public void waitForUninterruptibly(Guard guard) {
        if (guard.f41879a == this && this.f41877b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return;
            }
            m67553d(guard, true);
            return;
        }
        throw new IllegalMonitorStateException();
    }

    public Monitor(boolean z) {
        this.f41878c = null;
        this.f41876a = z;
        this.f41877b = new ReentrantLock(z);
    }

    public boolean enter(long j, TimeUnit timeUnit) {
        boolean tryLock;
        long m67545l = m67545l(j, timeUnit);
        ReentrantLock reentrantLock = this.f41877b;
        boolean z = true;
        if (!this.f41876a && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = Thread.interrupted();
        try {
            long nanoTime = System.nanoTime();
            long j2 = m67545l;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j2, TimeUnit.NANOSECONDS);
                        break;
                    } catch (InterruptedException unused) {
                        j2 = m67548i(nanoTime, m67545l);
                        interrupted = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            return tryLock;
        } catch (Throwable th2) {
            th = th2;
            z = interrupted;
        }
    }

    public boolean enterInterruptibly(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f41877b.tryLock(j, timeUnit);
    }

    public boolean waitFor(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
        long m67545l = m67545l(j, timeUnit);
        if (guard.f41879a == this && this.f41877b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return m67554c(guard, m67545l, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
            r6 = this;
            long r8 = m67545l(r8, r10)
            com.google.common.util.concurrent.Monitor r10 = r7.f41879a
            if (r10 != r6) goto L53
            java.util.concurrent.locks.ReentrantLock r10 = r6.f41877b
            boolean r10 = r10.isHeldByCurrentThread()
            if (r10 == 0) goto L53
            boolean r10 = r7.isSatisfied()
            r0 = 1
            if (r10 == 0) goto L18
            return r0
        L18:
            long r1 = m67550g(r8)
            boolean r10 = java.lang.Thread.interrupted()
            r3 = r8
            r5 = r0
        L22:
            boolean r7 = r6.m67554c(r7, r3, r5)     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L33
            if (r10 == 0) goto L2f
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L2f:
            return r7
        L30:
            r7 = move-exception
            r0 = r10
            goto L49
        L33:
            boolean r10 = r7.isSatisfied()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L41
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            return r0
        L41:
            long r3 = m67548i(r1, r8)     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r10 = r0
            goto L22
        L48:
            r7 = move-exception
        L49:
            if (r0 == 0) goto L52
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L52:
            throw r7
        L53:
            java.lang.IllegalMonitorStateException r7 = new java.lang.IllegalMonitorStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.waitForUninterruptibly(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }

    public boolean enterIf(Guard guard, long j, TimeUnit timeUnit) {
        if (guard.f41879a == this) {
            if (enter(j, timeUnit)) {
                try {
                    boolean isSatisfied = guard.isSatisfied();
                    if (!isSatisfied) {
                    }
                    return isSatisfied;
                } finally {
                    this.f41877b.unlock();
                }
            }
            return false;
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
        if (guard.f41879a == this) {
            ReentrantLock reentrantLock = this.f41877b;
            if (reentrantLock.tryLock(j, timeUnit)) {
                try {
                    boolean isSatisfied = guard.isSatisfied();
                    if (!isSatisfied) {
                    }
                    return isSatisfied;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return false;
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (m67554c(r11, r0, r3) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
        /*
            r10 = this;
            long r0 = m67545l(r12, r14)
            com.google.common.util.concurrent.Monitor r2 = r11.f41879a
            if (r2 != r10) goto L60
            java.util.concurrent.locks.ReentrantLock r2 = r10.f41877b
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.f41876a
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = m67550g(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.isSatisfied()     // Catch: java.lang.Throwable -> L50
            if (r12 != 0) goto L49
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = m67548i(r8, r0)     // Catch: java.lang.Throwable -> L50
        L43:
            boolean r11 = r10.m67554c(r11, r0, r3)     // Catch: java.lang.Throwable -> L50
            if (r11 == 0) goto L4a
        L49:
            r5 = 1
        L4a:
            if (r5 != 0) goto L4f
            r2.unlock()
        L4f:
            return r5
        L50:
            r11 = move-exception
            if (r3 != 0) goto L5c
            r10.m67546k()     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5c:
            r2.unlock()
            throw r11
        L60:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.enterWhen(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:5:0x0012, B:7:0x001a, B:24:0x004b, B:11:0x0023, B:13:0x0028, B:15:0x0030, B:20:0x003b, B:22:0x0045, B:21:0x0041), top: B:45:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r12, long r13, java.util.concurrent.TimeUnit r15) {
        /*
            r11 = this;
            long r13 = m67545l(r13, r15)
            com.google.common.util.concurrent.Monitor r15 = r12.f41879a
            if (r15 != r11) goto L7e
            java.util.concurrent.locks.ReentrantLock r15 = r11.f41877b
            boolean r0 = r15.isHeldByCurrentThread()
            boolean r1 = java.lang.Thread.interrupted()
            boolean r2 = r11.f41876a     // Catch: java.lang.Throwable -> L73
            r3 = 0
            r4 = 0
            r6 = 1
            if (r2 != 0) goto L23
            boolean r2 = r15.tryLock()     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L21
            goto L23
        L21:
            r7 = r4
            goto L30
        L23:
            long r7 = m67550g(r13)     // Catch: java.lang.Throwable -> L73
            r9 = r13
        L28:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L6a java.lang.Throwable -> L73
            boolean r2 = r15.tryLock(r9, r2)     // Catch: java.lang.InterruptedException -> L6a java.lang.Throwable -> L73
            if (r2 == 0) goto L60
        L30:
            boolean r2 = r12.isSatisfied()     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L37
            goto L49
        L37:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L41
            long r7 = m67550g(r13)     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
            r9 = r13
            goto L45
        L41:
            long r9 = m67548i(r7, r13)     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
        L45:
            boolean r6 = r11.m67554c(r12, r9, r0)     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
        L49:
            if (r6 != 0) goto L4e
            r15.unlock()     // Catch: java.lang.Throwable -> L73
        L4e:
            if (r1 == 0) goto L57
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L57:
            return r6
        L58:
            r12 = move-exception
            r15.unlock()     // Catch: java.lang.Throwable -> L73
            throw r12     // Catch: java.lang.Throwable -> L73
        L5d:
            r0 = r3
            r1 = r6
            goto L30
        L60:
            if (r1 == 0) goto L69
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L69:
            return r3
        L6a:
            long r9 = m67548i(r7, r13)     // Catch: java.lang.Throwable -> L70
            r1 = r6
            goto L28
        L70:
            r12 = move-exception
            r1 = r6
            goto L74
        L73:
            r12 = move-exception
        L74:
            if (r1 == 0) goto L7d
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L7d:
            throw r12
        L7e:
            java.lang.IllegalMonitorStateException r12 = new java.lang.IllegalMonitorStateException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }
}
