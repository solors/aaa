package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C21114v8;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: classes4.dex */
public abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b */
    private static final Runnable f41859b = new DoNothingRunnable();

    /* renamed from: c */
    private static final Runnable f41860c = new DoNothingRunnable();

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: b */
        private final InterruptibleTask<?> f41861b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m67564b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f41861b.toString();
        }

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.f41861b = interruptibleTask;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: g */
    private void m67566g(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof Blocker;
            if (!z2 && runnable != f41860c) {
                break;
            }
            if (z2) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f41860c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* renamed from: a */
    abstract void mo67437a(Throwable th);

    /* renamed from: b */
    abstract void mo67436b(@ParametricNullness T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m67567c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.m67564b(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f41859b) == f41860c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    abstract boolean mo67435d();

    @ParametricNullness
    /* renamed from: e */
    abstract T mo67434e() throws Exception;

    /* renamed from: f */
    abstract String mo67433f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !mo67435d();
        if (z) {
            try {
                obj = mo67434e();
            } catch (Throwable th) {
                if (!compareAndSet(currentThread, f41859b)) {
                    m67566g(currentThread);
                }
                if (z) {
                    mo67437a(th);
                    return;
                }
                return;
            }
        }
        if (!compareAndSet(currentThread, f41859b)) {
            m67566g(currentThread);
        }
        if (z) {
            mo67436b(NullnessCasts.m67529a(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f41859b) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append(C21114v8.C21123i.f54139e);
            str = sb2.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String mo67433f = mo67433f();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(mo67433f).length());
        sb3.append(str);
        sb3.append(", ");
        sb3.append(mo67433f);
        return sb3.toString();
    }

    /* loaded from: classes4.dex */
    private static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
