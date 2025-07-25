package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C19208b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.b */
/* loaded from: classes6.dex */
public final class C19208b extends AbstractC19145W2 {

    /* renamed from: b */
    public final long f48073b;

    /* renamed from: c */
    public final RunnableC19194a f48074c;

    /* renamed from: d */
    public final AtomicBoolean f48075d;

    /* renamed from: e */
    public final AtomicBoolean f48076e;

    /* renamed from: f */
    public final Handler f48077f;

    /* renamed from: g */
    public ScheduledExecutorService f48078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19208b(long j, InterfaceC19132V2 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f48073b = j;
        this.f48074c = new RunnableC19194a(this);
        this.f48075d = new AtomicBoolean(false);
        this.f48076e = new AtomicBoolean(false);
        this.f48077f = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static final StackTraceElement[] m60492a(C19208b c19208b) {
        c19208b.getClass();
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    /* renamed from: b */
    public static final void m60490b(C19208b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f48075d.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this$0.f48078g;
        if (scheduledExecutorService == null || scheduledExecutorService.scheduleAtFixedRate(this$0.f48074c, 0L, this$0.f48073b, TimeUnit.MILLISECONDS) == null) {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18962I4("ANRWatchDog"));
            this$0.f48078g = newSingleThreadScheduledExecutor;
            if (newSingleThreadScheduledExecutor != null) {
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(this$0.f48074c, 0L, this$0.f48073b, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC19145W2
    /* renamed from: a */
    public final void mo60493a() {
        Runnable runnable = new Runnable() { // from class: o3.a3
            {
                C19208b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19208b.m60490b(C19208b.this);
            }
        };
        ScheduledExecutorService scheduledExecutorService = AbstractC19141Vb.f47871a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC19141Vb.f47871a.execute(runnable);
    }

    @Override // com.inmobi.media.AbstractC19145W2
    /* renamed from: b */
    public final void mo60491b() {
        if (this.f48075d.getAndSet(false)) {
            this.f48075d.set(false);
            this.f48076e.set(false);
            ScheduledExecutorService scheduledExecutorService = this.f48078g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.f48078g = null;
        }
    }
}
