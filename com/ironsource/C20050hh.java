package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.hh */
/* loaded from: classes6.dex */
public final class C20050hh {
    @NotNull

    /* renamed from: a */
    private final Handler f50459a;

    @Metadata
    /* renamed from: com.ironsource.hh$a */
    /* loaded from: classes6.dex */
    public static final class C20051a extends AbstractRunnableC21276yp {

        /* renamed from: a */
        final /* synthetic */ Runnable f50460a;

        C20051a(Runnable runnable) {
            this.f50460a = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            this.f50460a.run();
        }
    }

    public C20050hh() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.ironsource.yp] */
    /* renamed from: c */
    private final void m58145c(Runnable runnable) {
        C20051a c20051a;
        if (runnable instanceof AbstractRunnableC21276yp) {
            c20051a = (AbstractRunnableC21276yp) runnable;
        } else {
            c20051a = new C20051a(runnable);
        }
        if (Thread.currentThread().getId() == this.f50459a.getLooper().getThread().getId()) {
            c20051a.run();
        } else {
            m58150a(this, c20051a, 0L, 2, null);
        }
    }

    @NotNull
    /* renamed from: a */
    public final Handler m58151a() {
        return this.f50459a;
    }

    /* renamed from: b */
    public final void m58146b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        m58145c(runnable);
    }

    public C20050hh(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f50459a = handler;
    }

    /* renamed from: a */
    public static /* synthetic */ void m58150a(C20050hh c20050hh, AbstractRunnableC21276yp abstractRunnableC21276yp, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c20050hh.m58148a(abstractRunnableC21276yp, j);
    }

    public /* synthetic */ C20050hh(Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    /* renamed from: a */
    public final void m58149a(@NotNull AbstractRunnableC21276yp task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f50459a.removeCallbacks(task);
    }

    /* renamed from: a */
    public final void m58148a(@NotNull AbstractRunnableC21276yp task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f50459a.postDelayed(task, j);
    }

    /* renamed from: a */
    public final void m58147a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        m58145c(callback);
    }
}
