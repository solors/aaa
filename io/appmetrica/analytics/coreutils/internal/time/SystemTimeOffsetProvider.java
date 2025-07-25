package io.appmetrica.analytics.coreutils.internal.time;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a */
    private final SystemTimeProvider f92469a;

    @VisibleForTesting
    public SystemTimeOffsetProvider(@NotNull SystemTimeProvider systemTimeProvider) {
        this.f92469a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j, @NotNull TimeUnit timeUnit) {
        return this.f92469a.elapsedRealtime() - timeUnit.toMillis(j);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j, @NotNull TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j, @NotNull TimeUnit timeUnit) {
        if (j == 0) {
            return 0L;
        }
        return this.f92469a.currentTimeSeconds() - timeUnit.toSeconds(j);
    }

    public final long systemNanoTimeOffsetInNanos(long j, @NotNull TimeUnit timeUnit) {
        return this.f92469a.systemNanoTime() - timeUnit.toNanos(j);
    }

    public final long systemNanoTimeOffsetInSeconds(long j, @NotNull TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
