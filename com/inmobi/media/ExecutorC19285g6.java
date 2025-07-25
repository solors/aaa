package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.g6 */
/* loaded from: classes6.dex */
public final class ExecutorC19285g6 implements Executor {

    /* renamed from: a */
    public final Handler f48256a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f48256a.post(runnable);
    }
}
