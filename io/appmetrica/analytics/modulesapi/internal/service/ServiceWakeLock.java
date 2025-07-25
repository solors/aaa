package io.appmetrica.analytics.modulesapi.internal.service;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ServiceWakeLock {
    boolean acquireWakeLock(@NotNull String str);

    void releaseWakeLock(@NotNull String str);
}
