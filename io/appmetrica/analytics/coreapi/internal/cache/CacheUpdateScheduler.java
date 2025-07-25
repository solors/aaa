package io.appmetrica.analytics.coreapi.internal.cache;

import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public interface CacheUpdateScheduler {
    void onStateUpdated();

    void scheduleUpdateIfNeededNow();
}
