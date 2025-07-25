package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class ListenerCallQueue<L> {

    /* renamed from: b */
    private static final Logger f41869b = Logger.getLogger(ListenerCallQueue.class.getName());

    /* renamed from: a */
    private final List<PerListenerQueue<L>> f41870a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface Event<L> {
        void call(L l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PerListenerQueue<L> implements Runnable {

        /* renamed from: b */
        final L f41871b;

        /* renamed from: c */
        final Executor f41872c;
        @GuardedBy("this")

        /* renamed from: d */
        final Queue<Event<L>> f41873d = Queues.newArrayDeque();
        @GuardedBy("this")

        /* renamed from: f */
        final Queue<Object> f41874f = Queues.newArrayDeque();
        @GuardedBy("this")

        /* renamed from: g */
        boolean f41875g;

        PerListenerQueue(L l, Executor executor) {
            this.f41871b = (L) Preconditions.checkNotNull(l);
            this.f41872c = (Executor) Preconditions.checkNotNull(executor);
        }

        /* renamed from: a */
        synchronized void m67558a(Event<L> event, Object obj) {
            this.f41873d.add(event);
            this.f41874f.add(obj);
        }

        /* renamed from: b */
        void m67557b() {
            boolean z;
            synchronized (this) {
                if (!this.f41875g) {
                    z = true;
                    this.f41875g = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                try {
                    this.f41872c.execute(this);
                } catch (RuntimeException e) {
                    synchronized (this) {
                        this.f41875g = false;
                        Logger logger = ListenerCallQueue.f41869b;
                        Level level = Level.SEVERE;
                        String valueOf = String.valueOf(this.f41871b);
                        String valueOf2 = String.valueOf(this.f41872c);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 42 + valueOf2.length());
                        sb2.append("Exception while running callbacks for ");
                        sb2.append(valueOf);
                        sb2.append(" on ");
                        sb2.append(valueOf2);
                        logger.log(level, sb2.toString(), (Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
            r2.call(r10.f41871b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
            r4 = com.google.common.util.concurrent.ListenerCallQueue.f41869b;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r10.f41871b);
            r3 = java.lang.String.valueOf(r3);
            r8 = new java.lang.StringBuilder((r6.length() + 37) + r3.length());
            r8.append("Exception while executing callback: ");
            r8.append(r6);
            r8.append(" ");
            r8.append(r3);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r10 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L6c
                boolean r2 = r10.f41875g     // Catch: java.lang.Throwable -> L5f
                com.google.common.base.Preconditions.checkState(r2)     // Catch: java.lang.Throwable -> L5f
                java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue$Event<L>> r2 = r10.f41873d     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L5f
                com.google.common.util.concurrent.ListenerCallQueue$Event r2 = (com.google.common.util.concurrent.ListenerCallQueue.Event) r2     // Catch: java.lang.Throwable -> L5f
                java.util.Queue<java.lang.Object> r3 = r10.f41874f     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L5f
                if (r2 != 0) goto L1f
                r10.f41875g = r0     // Catch: java.lang.Throwable -> L5f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L63
            L1f:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L5f
                L r4 = r10.f41871b     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L6c
                r2.call(r4)     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L6c
                goto L0
            L26:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.ListenerCallQueue.m67560a()     // Catch: java.lang.Throwable -> L6c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L6c
                L r6 = r10.f41871b     // Catch: java.lang.Throwable -> L6c
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L6c
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L6c
                int r7 = r7 + 37
                int r8 = r3.length()     // Catch: java.lang.Throwable -> L6c
                int r7 = r7 + r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r7 = "Exception while executing callback: "
                r8.append(r7)     // Catch: java.lang.Throwable -> L6c
                r8.append(r6)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r6 = " "
                r8.append(r6)     // Catch: java.lang.Throwable -> L6c
                r8.append(r3)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L6c
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L6c
                goto L0
            L5f:
                r2 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
            L63:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L6a
                throw r1     // Catch: java.lang.Throwable -> L65
            L65:
                r1 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
                goto L6d
            L6a:
                r1 = move-exception
                goto L63
            L6c:
                r2 = move-exception
            L6d:
                if (r1 == 0) goto L77
                monitor-enter(r10)
                r10.f41875g = r0     // Catch: java.lang.Throwable -> L74
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
                goto L77
            L74:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
                throw r0
            L77:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue.run():void");
        }
    }

    /* renamed from: b */
    private void m67559b(Event<L> event, Object obj) {
        Preconditions.checkNotNull(event, "event");
        Preconditions.checkNotNull(obj, "label");
        synchronized (this.f41870a) {
            for (PerListenerQueue<L> perListenerQueue : this.f41870a) {
                perListenerQueue.m67558a(event, obj);
            }
        }
    }

    public void addListener(L l, Executor executor) {
        Preconditions.checkNotNull(l, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.checkNotNull(executor, "executor");
        this.f41870a.add(new PerListenerQueue<>(l, executor));
    }

    public void dispatch() {
        for (int i = 0; i < this.f41870a.size(); i++) {
            this.f41870a.get(i).m67557b();
        }
    }

    public void enqueue(Event<L> event) {
        m67559b(event, event);
    }

    public void enqueue(Event<L> event, String str) {
        m67559b(event, str);
    }
}
