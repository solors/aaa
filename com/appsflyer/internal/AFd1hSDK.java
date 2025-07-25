package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface AFd1hSDK {
    @WorkerThread
    @Nullable
    String AFInAppEventParameterName(@NotNull Throwable th, @NotNull String str);

    @WorkerThread
    @NotNull
    List<AFd1jSDK> AFInAppEventType();

    @WorkerThread
    boolean AFKeystoreWrapper();

    @WorkerThread
    boolean AFKeystoreWrapper(@NotNull String... strArr);

    @WorkerThread
    int valueOf();

    @WorkerThread
    void valueOf(int i, int i2);
}
