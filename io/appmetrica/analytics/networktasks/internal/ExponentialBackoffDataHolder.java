package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes9.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a */
    private final TimePassedChecker f95870a;

    /* renamed from: b */
    private final TimeProvider f95871b;

    /* renamed from: c */
    private final HostRetryInfoProvider f95872c;

    /* renamed from: d */
    private long f95873d;

    /* renamed from: e */
    private int f95874e;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker());
    }

    public void reset() {
        this.f95874e = 1;
        this.f95873d = 0L;
        this.f95872c.saveNextSendAttemptNumber(1);
        this.f95872c.saveLastAttemptTimeSeconds(this.f95873d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f95871b.currentTimeSeconds();
        this.f95873d = currentTimeSeconds;
        this.f95874e++;
        this.f95872c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f95872c.saveNextSendAttemptNumber(this.f95874e);
    }

    public boolean wasLastAttemptLongAgoEnough(@Nullable RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j = this.f95873d;
            if (j != 0) {
                TimePassedChecker timePassedChecker = this.f95870a;
                int i = ((1 << (this.f95874e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i2 = retryPolicyConfig.maxIntervalSeconds;
                if (i > i2) {
                    i = i2;
                }
                return timePassedChecker.didTimePassSeconds(j, i, "last send attempt");
            }
        }
        return true;
    }

    ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker) {
        this.f95872c = hostRetryInfoProvider;
        this.f95871b = systemTimeProvider;
        this.f95870a = timePassedChecker;
        this.f95873d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f95874e = hostRetryInfoProvider.getNextSendAttemptNumber();
    }
}
