package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.sp1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class kq0 {
    @NotNull

    /* renamed from: a */
    private final Handler f81521a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void m32466a() {
        this.f81521a.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m32464a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f81521a.post(runnable);
    }

    /* renamed from: a */
    public final void m32465a(@NotNull sp1.RunnableC31387a runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f81521a.postDelayed(runnable, 50L);
    }
}
