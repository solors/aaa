package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.C20086i9;
import com.ironsource.C21327zp;
import com.ironsource.HandlerThreadC21017ti;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* loaded from: classes6.dex */
public final class IronSourceThreadManager {

    /* renamed from: a */
    private static boolean f49932a;
    @NotNull

    /* renamed from: c */
    private static final Handler f49934c;
    @NotNull

    /* renamed from: d */
    private static final HandlerThreadC21017ti f49935d;
    @NotNull

    /* renamed from: e */
    private static final HandlerThreadC21017ti f49936e;
    @NotNull

    /* renamed from: f */
    private static final HandlerThreadC21017ti f49937f;
    @NotNull

    /* renamed from: g */
    private static final InterfaceC38501j f49938g;
    @NotNull

    /* renamed from: h */
    private static final InterfaceC38501j f49939h;
    @NotNull
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();
    @NotNull

    /* renamed from: b */
    private static final Handler f49933b = new Handler(Looper.getMainLooper());

    @Metadata
    /* renamed from: com.ironsource.environment.thread.IronSourceThreadManager$a */
    /* loaded from: classes6.dex */
    static final class C19843a extends Lambda implements Functions<C21327zp> {

        /* renamed from: a */
        public static final C19843a f49940a = new C19843a();

        C19843a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final C21327zp invoke() {
            return new C21327zp(0, null, null, 7, null);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.environment.thread.IronSourceThreadManager$b */
    /* loaded from: classes6.dex */
    static final class C19844b extends Lambda implements Functions<HandlerThreadC21017ti> {

        /* renamed from: a */
        public static final C19844b f49941a = new C19844b();

        C19844b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final HandlerThreadC21017ti invoke() {
            HandlerThreadC21017ti handlerThreadC21017ti = new HandlerThreadC21017ti("managersThread");
            handlerThreadC21017ti.start();
            handlerThreadC21017ti.m54792a();
            return handlerThreadC21017ti;
        }
    }

    static {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        f49934c = new Handler(handlerThread.getLooper());
        HandlerThreadC21017ti handlerThreadC21017ti = new HandlerThreadC21017ti("mediationBackground");
        handlerThreadC21017ti.start();
        handlerThreadC21017ti.m54792a();
        f49935d = handlerThreadC21017ti;
        HandlerThreadC21017ti handlerThreadC21017ti2 = new HandlerThreadC21017ti("adapterBackground");
        handlerThreadC21017ti2.start();
        handlerThreadC21017ti2.m54792a();
        f49936e = handlerThreadC21017ti2;
        HandlerThreadC21017ti handlerThreadC21017ti3 = new HandlerThreadC21017ti("publisher-callbacks");
        handlerThreadC21017ti3.start();
        handlerThreadC21017ti3.m54792a();
        f49937f = handlerThreadC21017ti3;
        m14554a = LazyJVM.m14554a(C19843a.f49940a);
        f49938g = m14554a;
        m14554a2 = LazyJVM.m14554a(C19844b.f49941a);
        f49939h = m14554a2;
    }

    private IronSourceThreadManager() {
    }

    /* renamed from: a */
    private final C21327zp m58762a() {
        return (C21327zp) f49938g.getValue();
    }

    /* renamed from: b */
    public static /* synthetic */ void m58758b(Runnable runnable, CountDownLatch countDownLatch) {
        m58760a(runnable, countDownLatch);
    }

    /* renamed from: c */
    public static /* synthetic */ void m58757c(CountDownLatch countDownLatch) {
        m58759a(countDownLatch);
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean z, boolean z2, @NotNull List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z) {
            for (Runnable runnable : tasks) {
                runnable.run();
            }
        } else if (!z2) {
            for (Runnable runnable2 : tasks) {
                postMediationBackgroundTask$default(INSTANCE, runnable2, 0L, 2, null);
            }
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
            for (final Runnable runnable3 : tasks) {
                postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronSourceThreadManager.m58758b(runnable3, countDownLatch);
                    }
                }, 0L, 2, null);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                C20086i9.m57997d().m58003a(e);
            }
        }
    }

    @NotNull
    public final Handler getInitHandler() {
        return f49934c;
    }

    @NotNull
    public final HandlerThreadC21017ti getSharedManagersThread() {
        return (HandlerThreadC21017ti) f49939h.getValue();
    }

    @NotNull
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f49932a;
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (m58761a(action)) {
            m58762a().remove(action);
        } else {
            f49936e.m54788b(action);
        }
    }

    public final void removeMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (m58761a(action)) {
            m58762a().remove(action);
        } else {
            f49935d.m54788b(action);
        }
    }

    public final void removeUiThreadTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        f49933b.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        f49932a = z;
    }

    /* renamed from: a */
    public static final void m58760a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.m58757c(latch);
            }
        }.run();
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f49932a) {
            m58762a().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            f49936e.m54789a(action, j);
        }
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f49932a) {
            m58762a().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            f49935d.m54789a(action, j);
        }
    }

    public final void postOnUiThreadTask(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f49933b.postDelayed(action, j);
    }

    public final void postPublisherCallback(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f49937f.m54789a(action, j);
    }

    /* renamed from: a */
    public static final void m58759a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    /* renamed from: a */
    private final boolean m58761a(Runnable runnable) {
        return f49932a && m58762a().getQueue().contains(runnable);
    }
}
