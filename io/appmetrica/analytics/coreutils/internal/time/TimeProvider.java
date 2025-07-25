package io.appmetrica.analytics.coreutils.internal.time;

import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public interface TimeProvider {
    long currentTimeMillis();

    long currentTimeSeconds();

    long elapsedRealtime();

    long systemNanoTime();

    long uptimeMillis();
}
