package io.bidmachine.media3.exoplayer.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Util;

/* renamed from: io.bidmachine.media3.exoplayer.audio.k */
/* loaded from: classes9.dex */
final class AudioTimestampPoller {
    private static final int ERROR_POLL_INTERVAL_US = 500000;
    private static final int FAST_POLL_INTERVAL_US = 10000;
    private static final int INITIALIZING_DURATION_US = 500000;
    private static final int SLOW_POLL_INTERVAL_US = 10000000;
    private static final int STATE_ERROR = 4;
    private static final int STATE_INITIALIZING = 0;
    private static final int STATE_NO_TIMESTAMP = 3;
    private static final int STATE_TIMESTAMP = 1;
    private static final int STATE_TIMESTAMP_ADVANCING = 2;
    @Nullable
    private final C36110a audioTimestamp;
    private long initialTimestampPositionFrames;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private int state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioTimestampPoller.java */
    @RequiresApi(19)
    /* renamed from: io.bidmachine.media3.exoplayer.audio.k$a */
    /* loaded from: classes9.dex */
    public static final class C36110a {
        private final AudioTimestamp audioTimestamp = new AudioTimestamp();
        private final AudioTrack audioTrack;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public C36110a(AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
        }

        public long getTimestampPositionFrames() {
            return this.lastTimestampPositionFrames;
        }

        public long getTimestampSystemTimeUs() {
            return this.audioTimestamp.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.audioTrack.getTimestamp(this.audioTimestamp);
            if (timestamp) {
                long j = this.audioTimestamp.framePosition;
                if (this.lastTimestampRawPositionFrames > j) {
                    this.rawTimestampFramePositionWrapCount++;
                }
                this.lastTimestampRawPositionFrames = j;
                this.lastTimestampPositionFrames = j + (this.rawTimestampFramePositionWrapCount << 32);
            }
            return timestamp;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util.SDK_INT >= 19) {
            this.audioTimestamp = new C36110a(audioTrack);
            reset();
            return;
        }
        this.audioTimestamp = null;
        updateState(3);
    }

    private void updateState(int i) {
        this.state = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.sampleIntervalUs = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.sampleIntervalUs = 10000000L;
                return;
            }
            this.sampleIntervalUs = 10000L;
            return;
        }
        this.lastTimestampSampleTimeUs = 0L;
        this.initialTimestampPositionFrames = -1L;
        this.initializeSystemTimeUs = System.nanoTime() / 1000;
        this.sampleIntervalUs = 10000L;
    }

    public void acceptTimestamp() {
        if (this.state == 4) {
            reset();
        }
    }

    @TargetApi(19)
    public long getTimestampPositionFrames() {
        C36110a c36110a = this.audioTimestamp;
        if (c36110a != null) {
            return c36110a.getTimestampPositionFrames();
        }
        return -1L;
    }

    @TargetApi(19)
    public long getTimestampSystemTimeUs() {
        C36110a c36110a = this.audioTimestamp;
        if (c36110a != null) {
            return c36110a.getTimestampSystemTimeUs();
        }
        return -9223372036854775807L;
    }

    public boolean hasAdvancingTimestamp() {
        if (this.state == 2) {
            return true;
        }
        return false;
    }

    public boolean hasTimestamp() {
        int i = this.state;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @TargetApi(19)
    public boolean maybePollTimestamp(long j) {
        C36110a c36110a = this.audioTimestamp;
        if (c36110a == null || j - this.lastTimestampSampleTimeUs < this.sampleIntervalUs) {
            return false;
        }
        this.lastTimestampSampleTimeUs = j;
        boolean maybeUpdateTimestamp = c36110a.maybeUpdateTimestamp();
        int i = this.state;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (maybeUpdateTimestamp) {
                        reset();
                    }
                } else if (!maybeUpdateTimestamp) {
                    reset();
                }
            } else if (maybeUpdateTimestamp) {
                if (this.audioTimestamp.getTimestampPositionFrames() > this.initialTimestampPositionFrames) {
                    updateState(2);
                }
            } else {
                reset();
            }
        } else if (maybeUpdateTimestamp) {
            if (this.audioTimestamp.getTimestampSystemTimeUs() < this.initializeSystemTimeUs) {
                return false;
            }
            this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
            updateState(1);
        } else if (j - this.initializeSystemTimeUs > 500000) {
            updateState(3);
        }
        return maybeUpdateTimestamp;
    }

    public void rejectTimestamp() {
        updateState(4);
    }

    public void reset() {
        if (this.audioTimestamp != null) {
            updateState(0);
        }
    }
}
