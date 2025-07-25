package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class AudioTimestampPoller {
    @Nullable

    /* renamed from: a */
    private final AudioTimestampV19 f32369a;

    /* renamed from: b */
    private int f32370b;

    /* renamed from: c */
    private long f32371c;

    /* renamed from: d */
    private long f32372d;

    /* renamed from: e */
    private long f32373e;

    /* renamed from: f */
    private long f32374f;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(19)
    /* loaded from: classes4.dex */
    public static final class AudioTimestampV19 {

        /* renamed from: a */
        private final AudioTrack f32375a;

        /* renamed from: b */
        private final AudioTimestamp f32376b = new AudioTimestamp();

        /* renamed from: c */
        private long f32377c;

        /* renamed from: d */
        private long f32378d;

        /* renamed from: e */
        private long f32379e;

        public AudioTimestampV19(AudioTrack audioTrack) {
            this.f32375a = audioTrack;
        }

        public long getTimestampPositionFrames() {
            return this.f32379e;
        }

        public long getTimestampSystemTimeUs() {
            return this.f32376b.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.f32375a.getTimestamp(this.f32376b);
            if (timestamp) {
                long j = this.f32376b.framePosition;
                if (this.f32378d > j) {
                    this.f32377c++;
                }
                this.f32378d = j;
                this.f32379e = j + (this.f32377c << 32);
            }
            return timestamp;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util.SDK_INT >= 19) {
            this.f32369a = new AudioTimestampV19(audioTrack);
            reset();
            return;
        }
        this.f32369a = null;
        m75057a(3);
    }

    /* renamed from: a */
    private void m75057a(int i) {
        this.f32370b = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.f32372d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f32372d = 10000000L;
                return;
            }
            this.f32372d = 10000L;
            return;
        }
        this.f32373e = 0L;
        this.f32374f = -1L;
        this.f32371c = System.nanoTime() / 1000;
        this.f32372d = 10000L;
    }

    public void acceptTimestamp() {
        if (this.f32370b == 4) {
            reset();
        }
    }

    @TargetApi(19)
    public long getTimestampPositionFrames() {
        AudioTimestampV19 audioTimestampV19 = this.f32369a;
        if (audioTimestampV19 != null) {
            return audioTimestampV19.getTimestampPositionFrames();
        }
        return -1L;
    }

    @TargetApi(19)
    public long getTimestampSystemTimeUs() {
        AudioTimestampV19 audioTimestampV19 = this.f32369a;
        if (audioTimestampV19 != null) {
            return audioTimestampV19.getTimestampSystemTimeUs();
        }
        return -9223372036854775807L;
    }

    public boolean hasAdvancingTimestamp() {
        if (this.f32370b == 2) {
            return true;
        }
        return false;
    }

    public boolean hasTimestamp() {
        int i = this.f32370b;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @TargetApi(19)
    public boolean maybePollTimestamp(long j) {
        AudioTimestampV19 audioTimestampV19 = this.f32369a;
        if (audioTimestampV19 == null || j - this.f32373e < this.f32372d) {
            return false;
        }
        this.f32373e = j;
        boolean maybeUpdateTimestamp = audioTimestampV19.maybeUpdateTimestamp();
        int i = this.f32370b;
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
                if (this.f32369a.getTimestampPositionFrames() > this.f32374f) {
                    m75057a(2);
                }
            } else {
                reset();
            }
        } else if (maybeUpdateTimestamp) {
            if (this.f32369a.getTimestampSystemTimeUs() < this.f32371c) {
                return false;
            }
            this.f32374f = this.f32369a.getTimestampPositionFrames();
            m75057a(1);
        } else if (j - this.f32371c > 500000) {
            m75057a(3);
        }
        return maybeUpdateTimestamp;
    }

    public void rejectTimestamp() {
        m75057a(4);
    }

    public void reset() {
        if (this.f32369a != null) {
            m75057a(0);
        }
    }
}
