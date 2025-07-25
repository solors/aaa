package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;

/* loaded from: classes4.dex */
final class DefaultMediaClock implements MediaClock {

    /* renamed from: b */
    private final StandaloneMediaClock f31411b;

    /* renamed from: c */
    private final PlaybackParametersListener f31412c;
    @Nullable

    /* renamed from: d */
    private Renderer f31413d;
    @Nullable

    /* renamed from: f */
    private MediaClock f31414f;

    /* renamed from: g */
    private boolean f31415g = true;

    /* renamed from: h */
    private boolean f31416h;

    /* loaded from: classes4.dex */
    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, Clock clock) {
        this.f31412c = playbackParametersListener;
        this.f31411b = new StandaloneMediaClock(clock);
    }

    /* renamed from: a */
    private boolean m76085a(boolean z) {
        Renderer renderer = this.f31413d;
        if (renderer != null && !renderer.isEnded() && (this.f31413d.isReady() || (!z && !this.f31413d.hasReadStreamToEnd()))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m76084b(boolean z) {
        if (m76085a(z)) {
            this.f31415g = true;
            if (this.f31416h) {
                this.f31411b.start();
                return;
            }
            return;
        }
        MediaClock mediaClock = (MediaClock) Assertions.checkNotNull(this.f31414f);
        long positionUs = mediaClock.getPositionUs();
        if (this.f31415g) {
            if (positionUs < this.f31411b.getPositionUs()) {
                this.f31411b.stop();
                return;
            }
            this.f31415g = false;
            if (this.f31416h) {
                this.f31411b.start();
            }
        }
        this.f31411b.resetPosition(positionUs);
        PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
        if (!playbackParameters.equals(this.f31411b.getPlaybackParameters())) {
            this.f31411b.setPlaybackParameters(playbackParameters);
            this.f31412c.onPlaybackParametersChanged(playbackParameters);
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.f31414f;
        if (mediaClock != null) {
            return mediaClock.getPlaybackParameters();
        }
        return this.f31411b.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        if (this.f31415g) {
            return this.f31411b.getPositionUs();
        }
        return ((MediaClock) Assertions.checkNotNull(this.f31414f)).getPositionUs();
    }

    public void onRendererDisabled(Renderer renderer) {
        if (renderer == this.f31413d) {
            this.f31414f = null;
            this.f31413d = null;
            this.f31415g = true;
        }
    }

    public void onRendererEnabled(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 != null && mediaClock2 != (mediaClock = this.f31414f)) {
            if (mediaClock == null) {
                this.f31414f = mediaClock2;
                this.f31413d = renderer;
                mediaClock2.setPlaybackParameters(this.f31411b.getPlaybackParameters());
                return;
            }
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void resetPosition(long j) {
        this.f31411b.resetPosition(j);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.f31414f;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = this.f31414f.getPlaybackParameters();
        }
        this.f31411b.setPlaybackParameters(playbackParameters);
    }

    public void start() {
        this.f31416h = true;
        this.f31411b.start();
    }

    public void stop() {
        this.f31416h = false;
        this.f31411b.stop();
    }

    public long syncAndGetPositionUs(boolean z) {
        m76084b(z);
        return getPositionUs();
    }
}
