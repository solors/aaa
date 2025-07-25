package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class AFd1rSDK {
    @NotNull
    public static final ExecutorService AFInAppEventParameterName() {
        return new AFd1tSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
    }
}
