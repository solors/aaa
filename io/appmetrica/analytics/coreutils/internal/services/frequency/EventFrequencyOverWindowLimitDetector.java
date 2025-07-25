package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a */
    private long f92459a;

    /* renamed from: b */
    private int f92460b;

    /* renamed from: c */
    private final EventFrequencyStorage f92461c;

    /* renamed from: d */
    private final SystemTimeProvider f92462d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j, int i, @NotNull EventFrequencyStorage eventFrequencyStorage) {
        this.f92459a = j;
        this.f92460b = i;
        this.f92461c = eventFrequencyStorage;
    }

    public final boolean detect(@NotNull String str) {
        long longValue;
        int i;
        long uptimeMillis = this.f92462d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f92461c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j = uptimeMillis - longValue;
        if (j >= 0 && j <= this.f92459a) {
            Integer windowOccurrencesCount = this.f92461c.getWindowOccurrencesCount(str);
            if (windowOccurrencesCount != null) {
                i = windowOccurrencesCount.intValue();
            } else {
                i = 0;
            }
            int i2 = i + 1;
            this.f92461c.putWindowOccurrencesCount(str, i2);
            if (i2 <= this.f92460b) {
                return false;
            }
            return true;
        }
        this.f92461c.putWindowStart(str, uptimeMillis);
        this.f92461c.putWindowOccurrencesCount(str, 1);
        return false;
    }

    public final synchronized void updateParameters(long j, int i) {
        this.f92459a = j;
        this.f92460b = i;
    }
}
