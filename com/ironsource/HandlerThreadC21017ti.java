package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ti */
/* loaded from: classes6.dex */
public final class HandlerThreadC21017ti extends HandlerThread {
    @Nullable

    /* renamed from: a */
    private Handler f53563a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC21017ti(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* renamed from: a */
    public final void m54792a() {
        this.f53563a = new Handler(getLooper());
    }

    /* renamed from: b */
    public final void m54788b(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f53563a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m54791a(HandlerThreadC21017ti handlerThreadC21017ti, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        handlerThreadC21017ti.m54789a(runnable, j);
    }

    /* renamed from: a */
    public final void m54790a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        m54791a(this, task, 0L, 2, null);
    }

    /* renamed from: a */
    public final void m54789a(@NotNull Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f53563a;
        if (handler != null) {
            handler.postDelayed(task, j);
        }
    }
}
