package com.smaato.sdk.core.p568ad;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.CurrentTimeProvider;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.core.ad.Expiration */
/* loaded from: classes7.dex */
public class Expiration {
    @NonNull
    private final CurrentTimeProvider currentTimeProvider;
    private final long expirationTimestamp;

    public Expiration(long j, @NonNull CurrentTimeProvider currentTimeProvider) {
        this.expirationTimestamp = j;
        this.currentTimeProvider = (CurrentTimeProvider) Objects.requireNonNull(currentTimeProvider);
    }

    public long getRemainingTime() {
        long currentMillisUtc = this.expirationTimestamp - this.currentTimeProvider.currentMillisUtc();
        if (currentMillisUtc <= 0) {
            return 0L;
        }
        return currentMillisUtc;
    }

    public long getTimestamp() {
        return this.expirationTimestamp;
    }

    public boolean isExpired() {
        if (this.expirationTimestamp <= this.currentTimeProvider.currentMillisUtc()) {
            return true;
        }
        return false;
    }

    @NonNull
    public String toString() {
        return String.valueOf(this.expirationTimestamp);
    }
}
