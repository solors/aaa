package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.Ya */
/* loaded from: classes9.dex */
public final class HandlerThreadC34348Ya extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a */
    public volatile boolean f93820a;

    public HandlerThreadC34348Ya(@NonNull String str) {
        super(str);
        this.f93820a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f93820a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f93820a = false;
        interrupt();
    }
}
