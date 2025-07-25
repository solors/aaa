package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface AFb1tSDK {
    @WorkerThread
    @NotNull
    List<AFb1qSDK> AFInAppEventParameterName();

    @WorkerThread
    @Nullable
    String AFInAppEventType(@NotNull AFb1qSDK aFb1qSDK);

    void AFInAppEventType();

    @WorkerThread
    void AFKeystoreWrapper();

    @WorkerThread
    boolean valueOf(@Nullable String str);
}
