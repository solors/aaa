package p643df;

import af.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: df.e */
/* loaded from: classes10.dex */
public final class TaskRunner {
    @NotNull

    /* renamed from: h */
    public static final C32874b f89613h = new C32874b(null);
    @NotNull

    /* renamed from: i */
    public static final TaskRunner f89614i = new TaskRunner(new C32875c(Util.m105752N(Intrinsics.m17064q(Util.f171i, " TaskRunner"), true)));
    @NotNull

    /* renamed from: j */
    private static final Logger f89615j;
    @NotNull

    /* renamed from: a */
    private final InterfaceC32873a f89616a;

    /* renamed from: b */
    private int f89617b;

    /* renamed from: c */
    private boolean f89618c;

    /* renamed from: d */
    private long f89619d;
    @NotNull

    /* renamed from: e */
    private final List<C32872d> f89620e;
    @NotNull

    /* renamed from: f */
    private final List<C32872d> f89621f;
    @NotNull

    /* renamed from: g */
    private final Runnable f89622g;

    /* compiled from: TaskRunner.kt */
    @Metadata
    /* renamed from: df.e$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC32873a {
        /* renamed from: a */
        void mo25622a(@NotNull TaskRunner taskRunner, long j);

        /* renamed from: b */
        void mo25621b(@NotNull TaskRunner taskRunner);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    /* compiled from: TaskRunner.kt */
    @Metadata
    /* renamed from: df.e$b */
    /* loaded from: classes10.dex */
    public static final class C32874b {
        private C32874b() {
        }

        public /* synthetic */ C32874b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Logger m25623a() {
            return TaskRunner.f89615j;
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata
    /* renamed from: df.e$c */
    /* loaded from: classes10.dex */
    public static final class C32875c implements InterfaceC32873a {
        @NotNull

        /* renamed from: a */
        private final ThreadPoolExecutor f89623a;

        public C32875c(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f89623a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p643df.TaskRunner.InterfaceC32873a
        /* renamed from: a */
        public void mo25622a(@NotNull TaskRunner taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // p643df.TaskRunner.InterfaceC32873a
        /* renamed from: b */
        public void mo25621b(@NotNull TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p643df.TaskRunner.InterfaceC32873a
        public void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f89623a.execute(runnable);
        }

        @Override // p643df.TaskRunner.InterfaceC32873a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata
    /* renamed from: df.e$d */
    /* loaded from: classes10.dex */
    public static final class RunnableC32876d implements Runnable {
        RunnableC32876d() {
            TaskRunner.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC32871a m25630d;
            long j;
            while (true) {
                TaskRunner taskRunner = TaskRunner.this;
                synchronized (taskRunner) {
                    m25630d = taskRunner.m25630d();
                }
                if (m25630d == null) {
                    return;
                }
                C32872d m25654d = m25630d.m25654d();
                Intrinsics.m17074g(m25654d);
                TaskRunner taskRunner2 = TaskRunner.this;
                boolean isLoggable = TaskRunner.f89613h.m25623a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j = m25654d.m25641h().m25627g().nanoTime();
                    TaskLogger.m25649c(m25630d, m25654d, "starting");
                } else {
                    j = -1;
                }
                try {
                    taskRunner2.m25624j(m25630d);
                    Unit unit = Unit.f99208a;
                    if (isLoggable) {
                        TaskLogger.m25649c(m25630d, m25654d, Intrinsics.m17064q("finished run in ", TaskLogger.m25650b(m25654d.m25641h().m25627g().nanoTime() - j)));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        TaskLogger.m25649c(m25630d, m25654d, Intrinsics.m17064q("failed a run in ", TaskLogger.m25650b(m25654d.m25641h().m25627g().nanoTime() - j)));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f89615j = logger;
    }

    public TaskRunner(@NotNull InterfaceC32873a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f89616a = backend;
        this.f89617b = 10000;
        this.f89620e = new ArrayList();
        this.f89621f = new ArrayList();
        this.f89622g = new RunnableC32876d();
    }

    /* renamed from: c */
    private final void m25631c(AbstractC32871a abstractC32871a, long j) {
        boolean z;
        if (Util.f170h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        C32872d m25654d = abstractC32871a.m25654d();
        Intrinsics.m17074g(m25654d);
        if (m25654d.m25646c() == abstractC32871a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean m25645d = m25654d.m25645d();
            m25654d.m25636m(false);
            m25654d.m25637l(null);
            this.f89620e.remove(m25654d);
            if (j != -1 && !m25645d && !m25654d.m25642g()) {
                m25654d.m25638k(abstractC32871a, j, true);
            }
            if (!m25654d.m25644e().isEmpty()) {
                this.f89621f.add(m25654d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: e */
    private final void m25629e(AbstractC32871a abstractC32871a) {
        if (Util.f170h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        abstractC32871a.m25652g(-1L);
        C32872d m25654d = abstractC32871a.m25654d();
        Intrinsics.m17074g(m25654d);
        m25654d.m25644e().remove(abstractC32871a);
        this.f89621f.remove(m25654d);
        m25654d.m25637l(abstractC32871a);
        this.f89620e.add(m25654d);
    }

    /* renamed from: j */
    public final void m25624j(AbstractC32871a abstractC32871a) {
        if (Util.f170h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(abstractC32871a.m25656b());
        try {
            long mo23439f = abstractC32871a.mo23439f();
            synchronized (this) {
                m25631c(abstractC32871a, mo23439f);
                Unit unit = Unit.f99208a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                m25631c(abstractC32871a, -1L);
                Unit unit2 = Unit.f99208a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    @Nullable
    /* renamed from: d */
    public final AbstractC32871a m25630d() {
        boolean z;
        if (Util.f170h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f89621f.isEmpty()) {
            long nanoTime = this.f89616a.nanoTime();
            Iterator<C32872d> it = this.f89621f.iterator();
            long j = Long.MAX_VALUE;
            AbstractC32871a abstractC32871a = null;
            while (true) {
                if (it.hasNext()) {
                    AbstractC32871a abstractC32871a2 = it.next().m25644e().get(0);
                    long max = Math.max(0L, abstractC32871a2.m25655c() - nanoTime);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else if (abstractC32871a != null) {
                        z = true;
                        break;
                    } else {
                        abstractC32871a = abstractC32871a2;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (abstractC32871a != null) {
                m25629e(abstractC32871a);
                if (z || (!this.f89618c && (!this.f89621f.isEmpty()))) {
                    this.f89616a.execute(this.f89622g);
                }
                return abstractC32871a;
            } else if (this.f89618c) {
                if (j < this.f89619d - nanoTime) {
                    this.f89616a.mo25621b(this);
                }
                return null;
            } else {
                this.f89618c = true;
                this.f89619d = nanoTime + j;
                try {
                    try {
                        this.f89616a.mo25622a(this, j);
                    } catch (InterruptedException unused) {
                        m25628f();
                    }
                } finally {
                    this.f89618c = false;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m25628f() {
        int size = this.f89620e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                this.f89620e.get(size).m25647b();
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        int size2 = this.f89621f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            C32872d c32872d = this.f89621f.get(size2);
            c32872d.m25647b();
            if (c32872d.m25644e().isEmpty()) {
                this.f89621f.remove(size2);
            }
            if (i2 >= 0) {
                size2 = i2;
            } else {
                return;
            }
        }
    }

    @NotNull
    /* renamed from: g */
    public final InterfaceC32873a m25627g() {
        return this.f89616a;
    }

    /* renamed from: h */
    public final void m25626h(@NotNull C32872d taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (Util.f170h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.m25646c() == null) {
            if (!taskQueue.m25644e().isEmpty()) {
                Util.m105736c(this.f89621f, taskQueue);
            } else {
                this.f89621f.remove(taskQueue);
            }
        }
        if (this.f89618c) {
            this.f89616a.mo25621b(this);
        } else {
            this.f89616a.execute(this.f89622g);
        }
    }

    @NotNull
    /* renamed from: i */
    public final C32872d m25625i() {
        int i;
        synchronized (this) {
            i = this.f89617b;
            this.f89617b = i + 1;
        }
        return new C32872d(this, Intrinsics.m17064q("Q", Integer.valueOf(i)));
    }
}
