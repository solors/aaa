package com.smaato.sdk.core.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.smaato.sdk.core.p568ad.Expiration;
import com.smaato.sdk.core.util.CurrentTimeProvider;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class ExpirationTimestampFactory {
    @VisibleForTesting
    public static final long DEFAULT_AD_EXPIRATION_PERIOD_MS = 300000;
    @NonNull
    private final CurrentTimeProvider currentTimeProvider;

    public ExpirationTimestampFactory(@NonNull CurrentTimeProvider currentTimeProvider) {
        this.currentTimeProvider = (CurrentTimeProvider) Objects.requireNonNull(currentTimeProvider);
    }

    public Expiration createDefaultExpirationTimestamp() {
        return new Expiration(this.currentTimeProvider.currentMillisUtc() + 300000, this.currentTimeProvider);
    }

    @NonNull
    public Expiration createExpirationTimestampFor(long j, @Nullable Long l) {
        long currentMillisUtc = j - this.currentTimeProvider.currentMillisUtc();
        if (l != null) {
            long longValue = j - l.longValue();
            if (longValue >= 30000) {
                return new Expiration(this.currentTimeProvider.currentMillisUtc() + longValue, this.currentTimeProvider);
            }
        } else if (currentMillisUtc >= 30000) {
            return new Expiration(j, this.currentTimeProvider);
        }
        return createDefaultExpirationTimestamp();
    }
}
