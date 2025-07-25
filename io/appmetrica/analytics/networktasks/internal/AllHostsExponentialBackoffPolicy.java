package io.appmetrica.analytics.networktasks.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class AllHostsExponentialBackoffPolicy implements ExponentialBackoffPolicy {

    /* renamed from: a */
    private final ExponentialBackoffDataHolder f95858a;

    public AllHostsExponentialBackoffPolicy(@NotNull ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f95858a = exponentialBackoffDataHolder;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public boolean canBeExecuted(@Nullable RetryPolicyConfig retryPolicyConfig) {
        return this.f95858a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onAllHostsAttemptsFinished(boolean z) {
        if (z) {
            this.f95858a.reset();
        } else {
            this.f95858a.updateLastAttemptInfo();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onHostAttemptFinished(boolean z) {
    }
}
