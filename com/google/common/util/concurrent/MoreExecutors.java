package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.ironsource.C21114v8;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1 */
    /* loaded from: classes4.dex */
    class RunnableC171371 implements Runnable {

        /* renamed from: b */
        final /* synthetic */ BlockingQueue f41883b;

        /* renamed from: c */
        final /* synthetic */ ListenableFuture f41884c;

        @Override // java.lang.Runnable
        public void run() {
            this.f41883b.add(this.f41884c);
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3 */
    /* loaded from: classes4.dex */
    class C171393 extends WrappingExecutorService {

        /* renamed from: c */
        final /* synthetic */ Supplier f41887c;

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        /* renamed from: c */
        public Runnable mo67430c(Runnable runnable) {
            return Callables.m67679i(runnable, this.f41887c);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        /* renamed from: d */
        public <T> Callable<T> mo67429d(Callable<T> callable) {
            return Callables.m67678j(callable, this.f41887c);
        }
    }

    @VisibleForTesting
    @GwtIncompatible
    /* loaded from: classes4.dex */
    static class Application {
        Application() {
        }

        /* renamed from: a */
        final void m67537a(final ExecutorService executorService, final long j, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(executorService);
            Preconditions.checkNotNull(timeUnit);
            String valueOf = String.valueOf(executorService);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("DelayedShutdownHook-for-");
            sb2.append(valueOf);
            m67536b(MoreExecutors.m67542c(sb2.toString(), new Runnable(this) { // from class: com.google.common.util.concurrent.MoreExecutors.Application.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        executorService.shutdown();
                        executorService.awaitTermination(j, timeUnit);
                    } catch (InterruptedException unused) {
                    }
                }
            }));
        }

        @VisibleForTesting
        /* renamed from: b */
        void m67536b(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        /* renamed from: c */
        final ExecutorService m67535c(ThreadPoolExecutor threadPoolExecutor) {
            return m67534d(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        /* renamed from: d */
        final ExecutorService m67534d(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
            MoreExecutors.m67538g(threadPoolExecutor);
            ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            m67537a(threadPoolExecutor, j, timeUnit);
            return unconfigurableExecutorService;
        }

        /* renamed from: e */
        final ScheduledExecutorService m67533e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return m67532f(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        /* renamed from: f */
        final ScheduledExecutorService m67532f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
            MoreExecutors.m67538g(scheduledThreadPoolExecutor);
            ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            m67537a(scheduledThreadPoolExecutor, j, timeUnit);
            return unconfigurableScheduledExecutorService;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class ListeningDecorator extends AbstractListeningExecutorService {

        /* renamed from: b */
        private final ExecutorService f41897b;

        ListeningDecorator(ExecutorService executorService) {
            this.f41897b = (ExecutorService) Preconditions.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f41897b.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f41897b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f41897b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f41897b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f41897b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f41897b.shutdownNow();
        }

        public final String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.f41897b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
            sb2.append(obj);
            sb2.append(C21114v8.C21123i.f54137d);
            sb2.append(valueOf);
            sb2.append(C21114v8.C21123i.f54139e);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {

        /* renamed from: c */
        final ScheduledExecutorService f41898c;

        /* loaded from: classes4.dex */
        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {

            /* renamed from: c */
            private final ScheduledFuture<?> f41899c;

            public ListenableScheduledTask(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.f41899c = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.f41899c.cancel(z);
                }
                return cancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f41899c.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed delayed) {
                return this.f41899c.compareTo(delayed);
            }
        }

        @GwtIncompatible
        /* loaded from: classes4.dex */
        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {

            /* renamed from: j */
            private final Runnable f41900j;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                this.f41900j = (Runnable) Preconditions.checkNotNull(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f41900j.run();
                } catch (Throwable th) {
                    setException(th);
                    throw Throwables.propagate(th);
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            /* renamed from: y */
            public String mo67440y() {
                String valueOf = String.valueOf(this.f41900j);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
                sb2.append("task=[");
                sb2.append(valueOf);
                sb2.append(C21114v8.C21123i.f54139e);
                return sb2.toString();
            }
        }

        ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f41898c = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f41898c.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f41898c.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask m67443D = TrustedListenableFutureTask.m67443D(runnable, null);
            return new ListenableScheduledTask(m67443D, this.f41898c.schedule(m67443D, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask m67442E = TrustedListenableFutureTask.m67442E(callable);
            return new ListenableScheduledTask(m67442E, this.f41898c.schedule(m67442E, j, timeUnit));
        }
    }

    private MoreExecutors() {
    }

    @Beta
    @GwtIncompatible
    public static void addDelayedShutdownHook(ExecutorService executorService, long j, TimeUnit timeUnit) {
        new Application().m67537a(executorService, j, timeUnit);
    }

    @GwtIncompatible
    /* renamed from: b */
    private static boolean m67543b() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) == null) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @GwtIncompatible
    /* renamed from: c */
    public static Thread m67542c(String str, Runnable runnable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(runnable);
        Thread newThread = platformThreadFactory().newThread(runnable);
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    /* renamed from: d */
    public static Executor m67541d(final Executor executor, final AbstractFuture<?> abstractFuture) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(abstractFuture);
        if (executor == directExecutor()) {
            return executor;
        }
        return new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.5
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    abstractFuture.setException(e);
                }
            }
        };
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    @GwtIncompatible
    /* renamed from: e */
    public static Executor m67540e(final Executor executor, final Supplier<String> supplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(supplier);
        return new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.2
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                executor.execute(Callables.m67679i(runnable, supplier));
            }
        };
    }

    @GwtIncompatible
    /* renamed from: f */
    public static ScheduledExecutorService m67539f(ScheduledExecutorService scheduledExecutorService, final Supplier<String> supplier) {
        Preconditions.checkNotNull(scheduledExecutorService);
        Preconditions.checkNotNull(supplier);
        return new WrappingScheduledExecutorService(scheduledExecutorService) { // from class: com.google.common.util.concurrent.MoreExecutors.4
            @Override // com.google.common.util.concurrent.WrappingExecutorService
            /* renamed from: c */
            public Runnable mo67430c(Runnable runnable) {
                return Callables.m67679i(runnable, supplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            /* renamed from: d */
            public <T> Callable<T> mo67429d(Callable<T> callable) {
                return Callables.m67678j(callable, supplier);
            }
        };
    }

    @GwtIncompatible
    /* renamed from: g */
    public static void m67538g(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
    }

    @Beta
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        return new Application().m67534d(threadPoolExecutor, j, timeUnit);
    }

    @Beta
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        return new Application().m67532f(scheduledThreadPoolExecutor, j, timeUnit);
    }

    @GwtIncompatible
    public static ListeningExecutorService listeningDecorator(ExecutorService executorService) {
        ListeningExecutorService listeningDecorator;
        if (executorService instanceof ListeningExecutorService) {
            return (ListeningExecutorService) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            listeningDecorator = new ScheduledListeningDecorator((ScheduledExecutorService) executorService);
        } else {
            listeningDecorator = new ListeningDecorator(executorService);
        }
        return listeningDecorator;
    }

    @GwtIncompatible
    public static ListeningExecutorService newDirectExecutorService() {
        return new DirectExecutorService(null);
    }

    @GwtIncompatible
    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }

    @Beta
    @GwtIncompatible
    public static ThreadFactory platformThreadFactory() {
        if (!m67543b()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (InvocationTargetException e4) {
            throw Throwables.propagate(e4.getCause());
        }
    }

    @CanIgnoreReturnValue
    @Beta
    @GwtIncompatible
    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @Beta
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        return new Application().m67535c(threadPoolExecutor);
    }

    @Beta
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new Application().m67533e(scheduledThreadPoolExecutor);
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static final class DirectExecutorService extends AbstractListeningExecutorService {

        /* renamed from: b */
        private final Object f41894b;
        @GuardedBy("lock")

        /* renamed from: c */
        private int f41895c;
        @GuardedBy("lock")

        /* renamed from: d */
        private boolean f41896d;

        private DirectExecutorService() {
            this.f41894b = new Object();
            this.f41895c = 0;
            this.f41896d = false;
        }

        /* renamed from: a */
        private void m67531a() {
            synchronized (this.f41894b) {
                int i = this.f41895c - 1;
                this.f41895c = i;
                if (i == 0) {
                    this.f41894b.notifyAll();
                }
            }
        }

        /* renamed from: b */
        private void m67530b() {
            synchronized (this.f41894b) {
                if (!this.f41896d) {
                    this.f41895c++;
                } else {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            long nanos = timeUnit.toNanos(j);
            synchronized (this.f41894b) {
                while (true) {
                    if (this.f41896d && this.f41895c == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f41894b, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            m67530b();
            try {
                runnable.run();
            } finally {
                m67531a();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z;
            synchronized (this.f41894b) {
                z = this.f41896d;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z;
            synchronized (this.f41894b) {
                if (this.f41896d && this.f41895c == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.f41894b) {
                this.f41896d = true;
                if (this.f41895c == 0) {
                    this.f41894b.notifyAll();
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        /* synthetic */ DirectExecutorService(RunnableC171371 runnableC171371) {
            this();
        }
    }

    @GwtIncompatible
    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof ListeningScheduledExecutorService) {
            return (ListeningScheduledExecutorService) scheduledExecutorService;
        }
        return new ScheduledListeningDecorator(scheduledExecutorService);
    }
}
