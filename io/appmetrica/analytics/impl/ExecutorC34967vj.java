package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.vj */
/* loaded from: classes9.dex */
public final class ExecutorC34967vj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f95520a;

    public ExecutorC34967vj(Handler handler) {
        this.f95520a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f95520a.post(runnable);
    }
}
