package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qd1;
import com.yandex.mobile.ads.impl.qj1;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class tj1 {

    /* renamed from: a */
    private final int f85727a;

    /* renamed from: b */
    private final long f85728b;
    @NotNull

    /* renamed from: c */
    private final lz1 f85729c;
    @NotNull

    /* renamed from: d */
    private final sj1 f85730d;
    @NotNull

    /* renamed from: e */
    private final ConcurrentLinkedQueue<rj1> f85731e;

    public tj1(@NotNull mz1 taskRunner, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f85727a = 5;
        this.f85728b = timeUnit.toNanos(5L);
        this.f85729c = taskRunner.m31726e();
        String str = z32.f88703g;
        this.f85730d = new sj1(this, str + " ConnectionPool");
        this.f85731e = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r1.m30011h() != false) goto L7;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m29117a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C31026oa r4, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.qj1 r5, @org.jetbrains.annotations.Nullable java.util.List<com.yandex.mobile.ads.impl.ko1> r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<com.yandex.mobile.ads.impl.rj1> r0 = r3.f85731e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.rj1 r1 = (com.yandex.mobile.ads.impl.rj1) r1
            kotlin.jvm.internal.Intrinsics.m17074g(r1)
            monitor-enter(r1)
            if (r7 == 0) goto L28
            boolean r2 = r1.m30011h()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L34
        L28:
            boolean r2 = r1.m30023a(r4, r6)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L34
            r5.m30312a(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)
            r4 = 1
            return r4
        L34:
            kotlin.Unit r2 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)
            goto L10
        L38:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L3b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.tj1.m29117a(com.yandex.mobile.ads.impl.oa, com.yandex.mobile.ads.impl.qj1, java.util.List, boolean):boolean");
    }

    /* renamed from: b */
    public final void m29114b(@NotNull rj1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (z32.f88702f && !Thread.holdsLock(connection)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST hold lock on " + connection);
        }
        this.f85731e.add(connection);
        this.f85729c.m32183a(this.f85730d, 0L);
    }

    /* renamed from: a */
    public final long m29118a(long j) {
        Iterator<rj1> it = this.f85731e.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        rj1 rj1Var = null;
        int i2 = 0;
        while (it.hasNext()) {
            rj1 next = it.next();
            Intrinsics.m17074g(next);
            synchronized (next) {
                if (m29115a(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long m30016c = j - next.m30016c();
                    if (m30016c > j2) {
                        rj1Var = next;
                        j2 = m30016c;
                    }
                    Unit unit = Unit.f99208a;
                }
            }
        }
        long j3 = this.f85728b;
        if (j2 < j3 && i <= this.f85727a) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.m17074g(rj1Var);
        synchronized (rj1Var) {
            if (!rj1Var.m30017b().isEmpty()) {
                return 0L;
            }
            if (rj1Var.m30016c() + j2 != j) {
                return 0L;
            }
            rj1Var.m30007l();
            this.f85731e.remove(rj1Var);
            z32.m26411a(rj1Var.m30006m());
            if (this.f85731e.isEmpty()) {
                this.f85729c.m32185a();
            }
            return 0L;
        }
    }

    /* renamed from: a */
    public final boolean m29116a(@NotNull rj1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (z32.f88702f && !Thread.holdsLock(connection)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST hold lock on " + connection);
        } else if (!connection.m30015d() && this.f85727a != 0) {
            this.f85729c.m32183a(this.f85730d, 0L);
            return false;
        } else {
            connection.m30007l();
            this.f85731e.remove(connection);
            if (this.f85731e.isEmpty()) {
                this.f85729c.m32185a();
            }
            return true;
        }
    }

    /* renamed from: a */
    private final int m29115a(rj1 rj1Var, long j) {
        if (z32.f88702f && !Thread.holdsLock(rj1Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + rj1Var);
        }
        ArrayList m30017b = rj1Var.m30017b();
        int i = 0;
        while (i < m30017b.size()) {
            Reference reference = (Reference) m30017b.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Intrinsics.m17073h(reference, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.connection.RealCall.CallReference");
                int i2 = qd1.f84303c;
                qd1.C31196a.m30396a().mo30402a(((qj1.C31216b) reference).m30285a(), "A connection to " + rj1Var.m30008k().m32474a().m31122k() + " was leaked. Did you forget to close a response body?");
                m30017b.remove(i);
                rj1Var.m30007l();
                if (m30017b.isEmpty()) {
                    rj1Var.m30028a(j - this.f85728b);
                    return 0;
                }
            }
        }
        return m30017b.size();
    }
}
