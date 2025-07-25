package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@UnstableApi
/* loaded from: classes2.dex */
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        @CanIgnoreReturnValue
        public Builder setLastRebufferRealtimeMs(long j) {
            boolean z;
            if (j < 0 && j != -9223372036854775807L) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkArgument(z);
            this.lastRebufferRealtimeMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackPositionUs(long j) {
            this.playbackPositionUs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackSpeed(float f) {
            boolean z;
            if (f <= 0.0f && f != -3.4028235E38f) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkArgument(z);
            this.playbackSpeed = f;
            return this;
        }

        public Builder() {
            this.playbackPositionUs = -9223372036854775807L;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = -9223372036854775807L;
        }

        private Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        if (this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    public boolean rebufferedSince(long j) {
        long j2 = this.lastRebufferRealtimeMs;
        if (j2 != -9223372036854775807L && j != -9223372036854775807L && j2 >= j) {
            return true;
        }
        return false;
    }

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }
}
