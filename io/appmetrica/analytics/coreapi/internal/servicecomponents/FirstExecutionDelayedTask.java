package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public interface FirstExecutionDelayedTask {
    void setInitialDelaySeconds(long j);

    boolean tryExecute(long j);
}
