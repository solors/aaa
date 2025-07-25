package com.google.firebase.concurrent;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SequentialExecutor implements Executor {

    /* renamed from: h */
    private static final Logger f42182h = Logger.getLogger(SequentialExecutor.class.getName());

    /* renamed from: b */
    private final Executor f42183b;
    @GuardedBy("queue")

    /* renamed from: c */
    private final Deque<Runnable> f42184c = new ArrayDeque();
    @GuardedBy("queue")

    /* renamed from: d */
    private WorkerRunningState f42185d = WorkerRunningState.IDLE;
    @GuardedBy("queue")

    /* renamed from: f */
    private long f42186f = 0;

    /* renamed from: g */
    private final QueueWorker f42187g = new QueueWorker();

    /* loaded from: classes4.dex */
    private final class QueueWorker implements Runnable {

        /* renamed from: b */
        Runnable f42190b;

        private QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
            r8.f42190b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
            com.google.firebase.concurrent.SequentialExecutor.f42182h.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f42190b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m67244a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = com.google.firebase.concurrent.SequentialExecutor.m67249a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.m67248b(r0)     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.SequentialExecutor.m67246d(r0)     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.SequentialExecutor.m67247c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = com.google.firebase.concurrent.SequentialExecutor.m67249a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f42190b = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L7f
                com.google.firebase.concurrent.SequentialExecutor.m67247c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f42190b     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f42190b = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.m67245e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f42190b     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f42190b = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.m67244a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m67244a();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.f42184c) {
                    SequentialExecutor.this.f42185d = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f42190b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.f42185d + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SequentialExecutor(Executor executor) {
        this.f42183b = (Executor) Preconditions.checkNotNull(executor);
    }

    /* renamed from: d */
    static /* synthetic */ long m67246d(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.f42186f;
        sequentialExecutor.f42186f = 1 + j;
        return j;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f42184c) {
            WorkerRunningState workerRunningState2 = this.f42185d;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j = this.f42186f;
                Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.f42184c.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.f42185d = workerRunningState3;
                boolean z = true;
                try {
                    this.f42183b.execute(this.f42187g);
                    if (this.f42185d == workerRunningState3) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    synchronized (this.f42184c) {
                        if (this.f42186f == j && this.f42185d == workerRunningState3) {
                            this.f42185d = workerRunningState;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f42184c) {
                        WorkerRunningState workerRunningState4 = this.f42185d;
                        if ((workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) || !this.f42184c.removeLastOccurrence(runnable2)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f42184c.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f42183b + "}";
    }
}
