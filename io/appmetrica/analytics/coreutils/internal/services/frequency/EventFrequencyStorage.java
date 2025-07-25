package io.appmetrica.analytics.coreutils.internal.services.frequency;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface EventFrequencyStorage {
    @Nullable
    Integer getWindowOccurrencesCount(@NotNull String str);

    @Nullable
    Long getWindowStart(@NotNull String str);

    void putWindowOccurrencesCount(@NotNull String str, int i);

    void putWindowStart(@NotNull String str, long j);
}
