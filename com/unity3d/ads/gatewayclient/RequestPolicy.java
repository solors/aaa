package com.unity3d.ads.gatewayclient;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RequestPolicy.kt */
@Metadata
/* loaded from: classes7.dex */
public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z) {
        this.maxDuration = i;
        this.retryMaxInterval = i2;
        this.retryWaitBase = i3;
        this.retryJitterPct = f;
        this.retryScalingFactor = f2;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.writeTimeout = i6;
        this.overallTimeout = i7;
        this.shouldStoreLocally = z;
    }

    public static /* synthetic */ RequestPolicy copy$default(RequestPolicy requestPolicy, int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z, int i8, Object obj) {
        int i9;
        int i10;
        int i11;
        float f3;
        float f4;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        if ((i8 & 1) != 0) {
            i9 = requestPolicy.maxDuration;
        } else {
            i9 = i;
        }
        if ((i8 & 2) != 0) {
            i10 = requestPolicy.retryMaxInterval;
        } else {
            i10 = i2;
        }
        if ((i8 & 4) != 0) {
            i11 = requestPolicy.retryWaitBase;
        } else {
            i11 = i3;
        }
        if ((i8 & 8) != 0) {
            f3 = requestPolicy.retryJitterPct;
        } else {
            f3 = f;
        }
        if ((i8 & 16) != 0) {
            f4 = requestPolicy.retryScalingFactor;
        } else {
            f4 = f2;
        }
        if ((i8 & 32) != 0) {
            i12 = requestPolicy.connectTimeout;
        } else {
            i12 = i4;
        }
        if ((i8 & 64) != 0) {
            i13 = requestPolicy.readTimeout;
        } else {
            i13 = i5;
        }
        if ((i8 & 128) != 0) {
            i14 = requestPolicy.writeTimeout;
        } else {
            i14 = i6;
        }
        if ((i8 & 256) != 0) {
            i15 = requestPolicy.overallTimeout;
        } else {
            i15 = i7;
        }
        if ((i8 & 512) != 0) {
            z2 = requestPolicy.shouldStoreLocally;
        } else {
            z2 = z;
        }
        return requestPolicy.copy(i9, i10, i11, f3, f4, i12, i13, i14, i15, z2);
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final boolean component10() {
        return this.shouldStoreLocally;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final float component5() {
        return this.retryScalingFactor;
    }

    public final int component6() {
        return this.connectTimeout;
    }

    public final int component7() {
        return this.readTimeout;
    }

    public final int component8() {
        return this.writeTimeout;
    }

    public final int component9() {
        return this.overallTimeout;
    }

    @NotNull
    public final RequestPolicy copy(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z) {
        return new RequestPolicy(i, i2, i3, f, f2, i4, i5, i6, i7, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) obj;
        if (this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && Float.compare(this.retryScalingFactor, requestPolicy.retryScalingFactor) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.overallTimeout == requestPolicy.overallTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally) {
            return true;
        }
        return false;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((Integer.hashCode(this.maxDuration) * 31) + Integer.hashCode(this.retryMaxInterval)) * 31) + Integer.hashCode(this.retryWaitBase)) * 31) + Float.hashCode(this.retryJitterPct)) * 31) + Float.hashCode(this.retryScalingFactor)) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.overallTimeout)) * 31;
        boolean z = this.shouldStoreLocally;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", retryScalingFactor=" + this.retryScalingFactor + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", overallTimeout=" + this.overallTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }
}
