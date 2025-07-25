package com.pubmatic.sdk.common.session;

import com.pubmatic.sdk.common.session.POBAppStateMonitor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBAppStateMonitoring.kt */
@Metadata
/* loaded from: classes7.dex */
public interface POBAppStateMonitoring {
    void addAppLifecycleListener(@NotNull POBAppStateMonitor.POBAppLifecycleListener pOBAppLifecycleListener);

    void release();

    void removeAppLifecycleListener(@NotNull POBAppStateMonitor.POBAppLifecycleListener pOBAppLifecycleListener);
}
