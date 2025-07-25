package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.PlaybackParameters;

/* loaded from: classes4.dex */
public final class StandaloneMediaClock implements MediaClock {

    /* renamed from: b */
    private final Clock f36160b;

    /* renamed from: c */
    private boolean f36161c;

    /* renamed from: d */
    private long f36162d;

    /* renamed from: f */
    private long f36163f;

    /* renamed from: g */
    private PlaybackParameters f36164g = PlaybackParameters.DEFAULT;

    public StandaloneMediaClock(Clock clock) {
        this.f36160b = clock;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.f36164g;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        long mediaTimeUsForPlayoutTimeMs;
        long j = this.f36162d;
        if (this.f36161c) {
            long elapsedRealtime = this.f36160b.elapsedRealtime() - this.f36163f;
            PlaybackParameters playbackParameters = this.f36164g;
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
        this.f36162d = j;
        if (this.f36161c) {
            this.f36163f = this.f36160b.elapsedRealtime();
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (this.f36161c) {
            resetPosition(getPositionUs());
        }
        this.f36164g = playbackParameters;
    }

    public void start() {
        if (!this.f36161c) {
            this.f36163f = this.f36160b.elapsedRealtime();
            this.f36161c = true;
        }
    }

    public void stop() {
        if (this.f36161c) {
            resetPosition(getPositionUs());
            this.f36161c = false;
        }
    }
}
