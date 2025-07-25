package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mz1 {
    @NotNull

    /* renamed from: h */
    public static final mz1 f82495h;
    @NotNull

    /* renamed from: i */
    private static final Logger f82496i;
    @NotNull

    /* renamed from: a */
    private final InterfaceC30892a f82497a;

    /* renamed from: b */
    private int f82498b;

    /* renamed from: c */
    private boolean f82499c;

    /* renamed from: d */
    private long f82500d;
    @NotNull

    /* renamed from: e */
    private final ArrayList f82501e;
    @NotNull

    /* renamed from: f */
    private final ArrayList f82502f;
    @NotNull

    /* renamed from: g */
    private final nz1 f82503g;

    /* renamed from: com.yandex.mobile.ads.impl.mz1$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30892a {
        /* renamed from: a */
        long mo31724a();

        /* renamed from: a */
        void mo31723a(@NotNull mz1 mz1Var);

        /* renamed from: a */
        void mo31722a(@NotNull mz1 mz1Var, long j);

        void execute(@NotNull Runnable runnable);
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz1$b */
    /* loaded from: classes8.dex */
    public static final class C30893b {
        @NotNull
        /* renamed from: a */
        public static Logger m31725a() {
            return mz1.f82496i;
        }
    }

    static {
        String str = z32.f88703g;
        f82495h = new mz1(new C30894c(z32.m26414a(str + " TaskRunner", true)));
        Logger logger = Logger.getLogger(mz1.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f82496i = logger;
    }

    public mz1(@NotNull C30894c backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f82497a = backend;
        this.f82498b = 10000;
        this.f82501e = new ArrayList();
        this.f82502f = new ArrayList();
        this.f82503g = new nz1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m31729b(iz1 iz1Var) {
        if (z32.f88702f && Thread.holdsLock(this)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name2 = currentThread.getName();
        currentThread.setName(iz1Var.m33085b());
        try {
            long mo29204e = iz1Var.mo29204e();
            synchronized (this) {
                m31733a(iz1Var, mo29204e);
                Unit unit = Unit.f99208a;
            }
            currentThread.setName(name2);
        } catch (Throwable th) {
            synchronized (this) {
                m31733a(iz1Var, -1L);
                Unit unit2 = Unit.f99208a;
                currentThread.setName(name2);
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m31728c() {
        int size = this.f82501e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            ((lz1) this.f82501e.get(size)).m32180b();
        }
        for (int size2 = this.f82502f.size() - 1; -1 < size2; size2--) {
            lz1 lz1Var = (lz1) this.f82502f.get(size2);
            lz1Var.m32180b();
            if (lz1Var.m32177e().isEmpty()) {
                this.f82502f.remove(size2);
            }
        }
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC30892a m31727d() {
        return this.f82497a;
    }

    @NotNull
    /* renamed from: e */
    public final lz1 m31726e() {
        int i;
        synchronized (this) {
            i = this.f82498b;
            this.f82498b = i + 1;
        }
        return new lz1(this, "Q" + i);
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz1$c */
    /* loaded from: classes8.dex */
    public static final class C30894c implements InterfaceC30892a {
        @NotNull

        /* renamed from: a */
        private final ThreadPoolExecutor f82504a;

        public C30894c(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f82504a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.yandex.mobile.ads.impl.mz1.InterfaceC30892a
        /* renamed from: a */
        public final void mo31723a(@NotNull mz1 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // com.yandex.mobile.ads.impl.mz1.InterfaceC30892a
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f82504a.execute(runnable);
        }

        @Override // com.yandex.mobile.ads.impl.mz1.InterfaceC30892a
        /* renamed from: a */
        public final void mo31722a(@NotNull mz1 taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // com.yandex.mobile.ads.impl.mz1.InterfaceC30892a
        /* renamed from: a */
        public final long mo31724a() {
            return System.nanoTime();
        }
    }

    /* renamed from: a */
    public final void m31732a(@NotNull lz1 taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (z32.f88702f && !Thread.holdsLock(this)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST hold lock on " + this);
        }
        if (taskQueue.m32179c() == null) {
            if (!taskQueue.m32177e().isEmpty()) {
                z32.m26409a(this.f82502f, taskQueue);
            } else {
                this.f82502f.remove(taskQueue);
            }
        }
        if (this.f82499c) {
            this.f82497a.mo31723a(this);
        } else {
            this.f82497a.execute(this.f82503g);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Logger m31735a() {
        return f82496i;
    }

    /* renamed from: a */
    private final void m31734a(iz1 iz1Var) {
        if (z32.f88702f && !Thread.holdsLock(this)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST hold lock on " + this);
        }
        iz1Var.m33087a(-1L);
        lz1 m33083d = iz1Var.m33083d();
        Intrinsics.m17074g(m33083d);
        m33083d.m32177e().remove(iz1Var);
        this.f82502f.remove(m33083d);
        m33083d.m32184a(iz1Var);
        this.f82501e.add(m33083d);
    }

    @Nullable
    /* renamed from: b */
    public final iz1 m31730b() {
        boolean z;
        if (z32.f88702f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f82502f.isEmpty()) {
            long mo31724a = this.f82497a.mo31724a();
            Iterator it = this.f82502f.iterator();
            long j = Long.MAX_VALUE;
            iz1 iz1Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                iz1 iz1Var2 = (iz1) ((lz1) it.next()).m32177e().get(0);
                long max = Math.max(0L, iz1Var2.m33084c() - mo31724a);
                if (max > 0) {
                    j = Math.min(max, j);
                } else if (iz1Var != null) {
                    z = true;
                    break;
                } else {
                    iz1Var = iz1Var2;
                }
            }
            if (iz1Var != null) {
                m31734a(iz1Var);
                if (z || (!this.f82499c && (!this.f82502f.isEmpty()))) {
                    this.f82497a.execute(this.f82503g);
                }
                return iz1Var;
            } else if (this.f82499c) {
                if (j < this.f82500d - mo31724a) {
                    this.f82497a.mo31723a(this);
                }
                return null;
            } else {
                this.f82499c = true;
                this.f82500d = mo31724a + j;
                try {
                    try {
                        this.f82497a.mo31722a(this, j);
                    } catch (InterruptedException unused) {
                        m31728c();
                    }
                } finally {
                    this.f82499c = false;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m31733a(iz1 iz1Var, long j) {
        if (z32.f88702f && !Thread.holdsLock(this)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST hold lock on " + this);
        }
        lz1 m33083d = iz1Var.m33083d();
        Intrinsics.m17074g(m33083d);
        if (m33083d.m32179c() == iz1Var) {
            boolean m32178d = m33083d.m32178d();
            m33083d.m32173i();
            m33083d.m32184a(null);
            this.f82501e.remove(m33083d);
            if (j != -1 && !m32178d && !m33083d.m32175g()) {
                m33083d.m32182a(iz1Var, j, true);
            }
            if (!m33083d.m32177e().isEmpty()) {
                this.f82502f.add(m33083d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
