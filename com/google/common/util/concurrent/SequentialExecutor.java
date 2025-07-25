package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.RetainedWith;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class SequentialExecutor implements Executor {

    /* renamed from: h */
    private static final Logger f41905h = Logger.getLogger(SequentialExecutor.class.getName());

    /* renamed from: b */
    private final Executor f41906b;
    @GuardedBy("queue")

    /* renamed from: c */
    private final Deque<Runnable> f41907c = new ArrayDeque();
    @GuardedBy("queue")

    /* renamed from: d */
    private WorkerRunningState f41908d = WorkerRunningState.IDLE;
    @GuardedBy("queue")

    /* renamed from: f */
    private long f41909f = 0;
    @RetainedWith

    /* renamed from: g */
    private final QueueWorker f41910g = new QueueWorker();

    /* loaded from: classes4.dex */
    private final class QueueWorker implements Runnable {

        /* renamed from: b */
        Runnable f41912b;

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
            r9.f41912b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
            r4 = com.google.common.util.concurrent.SequentialExecutor.f41905h;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r9.f41912b);
            r8 = new java.lang.StringBuilder(r6.length() + 35);
            r8.append("Exception while executing runnable ");
            r8.append(r6);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m67511a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.SequentialExecutor r2 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L8c
                java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.m67516a(r2)     // Catch: java.lang.Throwable -> L8c
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L8c
                if (r0 != 0) goto L2b
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.m67515b(r0)     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L89
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.m67513d(r0)     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.m67514c(r0, r3)     // Catch: java.lang.Throwable -> L89
                r0 = 1
            L2b:
                com.google.common.util.concurrent.SequentialExecutor r3 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                java.util.Deque r3 = com.google.common.util.concurrent.SequentialExecutor.m67516a(r3)     // Catch: java.lang.Throwable -> L89
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L89
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L89
                r9.f41912b = r3     // Catch: java.lang.Throwable -> L89
                if (r3 != 0) goto L4d
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.m67514c(r0, r3)     // Catch: java.lang.Throwable -> L89
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8c
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f41912b     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r9.f41912b = r2     // Catch: java.lang.Throwable -> L8c
                goto L2
            L5c:
                r0 = move-exception
                goto L86
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.SequentialExecutor.m67512e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r6 = r9.f41912b     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L5c
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L5c
                int r7 = r7 + 35
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r8.append(r7)     // Catch: java.lang.Throwable -> L5c
                r8.append(r6)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L86:
                r9.f41912b = r2     // Catch: java.lang.Throwable -> L8c
                throw r0     // Catch: java.lang.Throwable -> L8c
            L89:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                throw r0     // Catch: java.lang.Throwable -> L8c
            L8c:
                r0 = move-exception
                if (r1 == 0) goto L96
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L96:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.QueueWorker.m67511a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m67511a();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.f41907c) {
                    SequentialExecutor.this.f41908d = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f41912b;
            if (runnable != null) {
                String valueOf = String.valueOf(runnable);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                sb2.append("SequentialExecutorWorker{running=");
                sb2.append(valueOf);
                sb2.append("}");
                return sb2.toString();
            }
            String valueOf2 = String.valueOf(SequentialExecutor.this.f41908d);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 32);
            sb3.append("SequentialExecutorWorker{state=");
            sb3.append(valueOf2);
            sb3.append("}");
            return sb3.toString();
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
        this.f41906b = (Executor) Preconditions.checkNotNull(executor);
    }

    /* renamed from: d */
    static /* synthetic */ long m67513d(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.f41909f;
        sequentialExecutor.f41909f = 1 + j;
        return j;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f41907c) {
            WorkerRunningState workerRunningState2 = this.f41908d;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j = this.f41909f;
                Runnable runnable2 = new Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.f41907c.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.f41908d = workerRunningState3;
                boolean z = true;
                try {
                    this.f41906b.execute(this.f41910g);
                    if (this.f41908d == workerRunningState3) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    synchronized (this.f41907c) {
                        if (this.f41909f == j && this.f41908d == workerRunningState3) {
                            this.f41908d = workerRunningState;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f41907c) {
                        WorkerRunningState workerRunningState4 = this.f41908d;
                        if ((workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) || !this.f41907c.removeLastOccurrence(runnable2)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f41907c.add(runnable);
        }
    }

    public String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.f41906b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
        sb2.append("SequentialExecutor@");
        sb2.append(identityHashCode);
        sb2.append("{");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
