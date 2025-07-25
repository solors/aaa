package io.appmetrica.analytics.coreutils.internal.time;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class TimePassedChecker {

    /* renamed from: a */
    private final TimeProvider f92470a;

    @VisibleForTesting
    public TimePassedChecker(@NotNull TimeProvider timeProvider) {
        this.f92470a = timeProvider;
    }

    public final boolean didTimePassMillis(long j, long j2, @NotNull String str) {
        long currentTimeMillis = this.f92470a.currentTimeMillis();
        if (currentTimeMillis < j || currentTimeMillis - j >= j2) {
            return true;
        }
        return false;
    }

    public final boolean didTimePassSeconds(long j, long j2, @NotNull String str) {
        long currentTimeSeconds = this.f92470a.currentTimeSeconds();
        if (currentTimeSeconds < j || currentTimeSeconds - j >= j2) {
            return true;
        }
        return false;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
