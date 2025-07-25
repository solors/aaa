package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Lx */
/* loaded from: assets/audience_network.dex */
public final class ExecutorC12171Lx implements Executor {
    public static final ExecutorC12171Lx A01 = new ExecutorC12171Lx();
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            A01.execute(runnable);
        }
    }

    public final Handler A01() {
        return this.A00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
