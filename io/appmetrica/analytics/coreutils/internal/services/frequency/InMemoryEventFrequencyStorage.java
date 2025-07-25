package io.appmetrica.analytics.coreutils.internal.services.frequency;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class InMemoryEventFrequencyStorage implements EventFrequencyStorage {

    /* renamed from: a */
    private final LinkedHashMap f92463a = new LinkedHashMap();

    /* renamed from: b */
    private final LinkedHashMap f92464b = new LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    @Nullable
    public Integer getWindowOccurrencesCount(@NotNull String str) {
        return (Integer) this.f92464b.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    @Nullable
    public Long getWindowStart(@NotNull String str) {
        return (Long) this.f92463a.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowOccurrencesCount(@NotNull String str, int i) {
        this.f92464b.put(str, Integer.valueOf(i));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowStart(@NotNull String str, long j) {
        this.f92463a.put(str, Long.valueOf(j));
    }
}
