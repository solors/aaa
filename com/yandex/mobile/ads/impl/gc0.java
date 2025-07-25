package com.yandex.mobile.ads.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class gc0 implements ServiceConnection {
    @NotNull

    /* renamed from: a */
    private final LinkedBlockingQueue f79594a = new LinkedBlockingQueue();

    @Nullable
    /* renamed from: a */
    public final IBinder m33887a() throws InterruptedException {
        return (IBinder) this.f79594a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder binder) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(binder, "binder");
        try {
            this.f79594a.put(binder);
        } catch (InterruptedException unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        try {
            this.f79594a.clear();
        } catch (UnsupportedOperationException unused) {
            um0.m28726c(new Object[0]);
        }
    }
}
