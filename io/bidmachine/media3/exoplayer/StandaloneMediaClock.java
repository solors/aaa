package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

@UnstableApi
/* loaded from: classes9.dex */
public final class StandaloneMediaClock implements MediaClock {
    private long baseElapsedMs;
    private long baseUs;
    private final Clock clock;
    private PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
    private boolean started;

    public StandaloneMediaClock(Clock clock) {
        this.clock = clock;
    }

    @Override // io.bidmachine.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // io.bidmachine.media3.exoplayer.MediaClock
    public long getPositionUs() {
        long mediaTimeUsForPlayoutTimeMs;
        long j = this.baseUs;
        if (this.started) {
            long elapsedRealtime = this.clock.elapsedRealtime() - this.baseElapsedMs;
            PlaybackParameters playbackParameters = this.playbackParameters;
            if (playbackParameters.speed == 1.0f) {
                mediaTimeUsForPlayoutTimeMs = Util.msToUs(elapsedRealtime);
            } else {
                mediaTimeUsForPlayoutTimeMs = playbackParameters.getMediaTimeUsForPlayoutTimeMs(elapsedRealtime);
            }
            return j + mediaTimeUsForPlayoutTimeMs;
        }
        return j;
    }

    public void resetPosition(long j) {
        this.baseUs = j;
        if (this.started) {
            this.baseElapsedMs = this.clock.elapsedRealtime();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (this.started) {
            resetPosition(getPositionUs());
        }
        this.playbackParameters = playbackParameters;
    }

    public void start() {
        if (!this.started) {
            this.baseElapsedMs = this.clock.elapsedRealtime();
            this.started = true;
        }
    }

    public void stop() {
        if (this.started) {
            resetPosition(getPositionUs());
            this.started = false;
        }
    }
}
