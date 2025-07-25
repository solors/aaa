package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class AudioTrackPositionTracker {

    /* renamed from: A */
    private long f32380A;

    /* renamed from: B */
    private long f32381B;

    /* renamed from: C */
    private long f32382C;

    /* renamed from: D */
    private long f32383D;

    /* renamed from: E */
    private boolean f32384E;

    /* renamed from: F */
    private long f32385F;

    /* renamed from: G */
    private long f32386G;

    /* renamed from: a */
    private final Listener f32387a;

    /* renamed from: b */
    private final long[] f32388b;
    @Nullable

    /* renamed from: c */
    private AudioTrack f32389c;

    /* renamed from: d */
    private int f32390d;

    /* renamed from: e */
    private int f32391e;
    @Nullable

    /* renamed from: f */
    private AudioTimestampPoller f32392f;

    /* renamed from: g */
    private int f32393g;

    /* renamed from: h */
    private boolean f32394h;

    /* renamed from: i */
    private long f32395i;

    /* renamed from: j */
    private float f32396j;

    /* renamed from: k */
    private boolean f32397k;

    /* renamed from: l */
    private long f32398l;

    /* renamed from: m */
    private long f32399m;
    @Nullable

    /* renamed from: n */
    private Method f32400n;

    /* renamed from: o */
    private long f32401o;

    /* renamed from: p */
    private boolean f32402p;

    /* renamed from: q */
    private boolean f32403q;

    /* renamed from: r */
    private long f32404r;

    /* renamed from: s */
    private long f32405s;

    /* renamed from: t */
    private long f32406t;

    /* renamed from: u */
    private long f32407u;

    /* renamed from: v */
    private long f32408v;

    /* renamed from: w */
    private int f32409w;

    /* renamed from: x */
    private int f32410x;

    /* renamed from: y */
    private long f32411y;

    /* renamed from: z */
    private long f32412z;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onInvalidLatency(long j);

        void onPositionAdvancing(long j);

        void onPositionFramesMismatch(long j, long j2, long j3, long j4);

        void onSystemTimeUsMismatch(long j, long j2, long j3, long j4);

        void onUnderrun(int i, long j);
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.f32387a = (Listener) Assertions.checkNotNull(listener);
        if (Util.SDK_INT >= 18) {
            try {
                this.f32400n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f32388b = new long[10];
    }

    /* renamed from: a */
    private boolean m75056a() {
        if (this.f32394h && ((AudioTrack) Assertions.checkNotNull(this.f32389c)).getPlayState() == 2 && m75054c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private long m75055b(long j) {
        return (j * 1000000) / this.f32393g;
    }

    /* renamed from: c */
    private long m75054c() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f32411y;
        if (j != -9223372036854775807L) {
            return Math.min(this.f32381B, this.f32380A + ((Util.getMediaDurationForPlayoutDuration((elapsedRealtime * 1000) - j, this.f32396j) * this.f32393g) / 1000000));
        }
        if (elapsedRealtime - this.f32405s >= 5) {
            m75047j(elapsedRealtime);
            this.f32405s = elapsedRealtime;
        }
        return this.f32406t + (this.f32407u << 32);
    }

    /* renamed from: d */
    private long m75053d() {
        return m75055b(m75054c());
    }

    /* renamed from: e */
    private void m75052e(long j) {
        AudioTimestampPoller audioTimestampPoller = (AudioTimestampPoller) Assertions.checkNotNull(this.f32392f);
        if (!audioTimestampPoller.maybePollTimestamp(j)) {
            return;
        }
        long timestampSystemTimeUs = audioTimestampPoller.getTimestampSystemTimeUs();
        long timestampPositionFrames = audioTimestampPoller.getTimestampPositionFrames();
        long m75053d = m75053d();
        if (Math.abs(timestampSystemTimeUs - j) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
            this.f32387a.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j, m75053d);
            audioTimestampPoller.rejectTimestamp();
        } else if (Math.abs(m75055b(timestampPositionFrames) - m75053d) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
            this.f32387a.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j, m75053d);
            audioTimestampPoller.rejectTimestamp();
        } else {
            audioTimestampPoller.acceptTimestamp();
        }
    }

    /* renamed from: f */
    private void m75051f() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f32399m >= 30000) {
            long m75053d = m75053d();
            if (m75053d == 0) {
                return;
            }
            this.f32388b[this.f32409w] = Util.getPlayoutDurationForMediaDuration(m75053d, this.f32396j) - nanoTime;
            this.f32409w = (this.f32409w + 1) % 10;
            int i = this.f32410x;
            if (i < 10) {
                this.f32410x = i + 1;
            }
            this.f32399m = nanoTime;
            this.f32398l = 0L;
            int i2 = 0;
            while (true) {
                int i3 = this.f32410x;
                if (i2 >= i3) {
                    break;
                }
                this.f32398l += this.f32388b[i2] / i3;
                i2++;
            }
        }
        if (this.f32394h) {
            return;
        }
        m75052e(nanoTime);
        m75050g(nanoTime);
    }

    /* renamed from: g */
    private void m75050g(long j) {
        Method method;
        if (this.f32403q && (method = this.f32400n) != null && j - this.f32404r >= 500000) {
            try {
                long intValue = (((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(this.f32389c), new Object[0]))).intValue() * 1000) - this.f32395i;
                this.f32401o = intValue;
                long max = Math.max(intValue, 0L);
                this.f32401o = max;
                if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                    this.f32387a.onInvalidLatency(max);
                    this.f32401o = 0L;
                }
            } catch (Exception unused) {
                this.f32400n = null;
            }
            this.f32404r = j;
        }
    }

    /* renamed from: h */
    private static boolean m75049h(int i) {
        if (Util.SDK_INT < 23 && (i == 5 || i == 6)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m75048i() {
        this.f32398l = 0L;
        this.f32410x = 0;
        this.f32409w = 0;
        this.f32399m = 0L;
        this.f32383D = 0L;
        this.f32386G = 0L;
        this.f32397k = false;
    }

    /* renamed from: j */
    private void m75047j(long j) {
        AudioTrack audioTrack;
        int playState = ((AudioTrack) Assertions.checkNotNull(this.f32389c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f32394h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f32408v = this.f32406t;
            }
            playbackHeadPosition += this.f32408v;
        }
        if (Util.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f32406t > 0 && playState == 3) {
                if (this.f32412z == -9223372036854775807L) {
                    this.f32412z = j;
                    return;
                }
                return;
            }
            this.f32412z = -9223372036854775807L;
        }
        if (this.f32406t > playbackHeadPosition) {
            this.f32407u++;
        }
        this.f32406t = playbackHeadPosition;
    }

    public int getAvailableBufferSize(long j) {
        return this.f32391e - ((int) (j - (m75054c() * this.f32390d)));
    }

    public long getCurrentPositionUs(boolean z) {
        long mediaDurationForPlayoutDuration;
        if (((AudioTrack) Assertions.checkNotNull(this.f32389c)).getPlayState() == 3) {
            m75051f();
        }
        long nanoTime = System.nanoTime() / 1000;
        AudioTimestampPoller audioTimestampPoller = (AudioTimestampPoller) Assertions.checkNotNull(this.f32392f);
        boolean hasAdvancingTimestamp = audioTimestampPoller.hasAdvancingTimestamp();
        if (hasAdvancingTimestamp) {
            mediaDurationForPlayoutDuration = m75055b(audioTimestampPoller.getTimestampPositionFrames()) + Util.getMediaDurationForPlayoutDuration(nanoTime - audioTimestampPoller.getTimestampSystemTimeUs(), this.f32396j);
        } else {
            if (this.f32410x == 0) {
                mediaDurationForPlayoutDuration = m75053d();
            } else {
                mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(this.f32398l + nanoTime, this.f32396j);
            }
            if (!z) {
                mediaDurationForPlayoutDuration = Math.max(0L, mediaDurationForPlayoutDuration - this.f32401o);
            }
        }
        if (this.f32384E != hasAdvancingTimestamp) {
            this.f32386G = this.f32383D;
            this.f32385F = this.f32382C;
        }
        long j = nanoTime - this.f32386G;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            mediaDurationForPlayoutDuration = ((mediaDurationForPlayoutDuration * j2) + ((1000 - j2) * (this.f32385F + Util.getMediaDurationForPlayoutDuration(j, this.f32396j)))) / 1000;
        }
        if (!this.f32397k) {
            long j3 = this.f32382C;
            if (mediaDurationForPlayoutDuration > j3) {
                this.f32397k = true;
                this.f32387a.onPositionAdvancing(System.currentTimeMillis() - Util.usToMs(Util.getPlayoutDurationForMediaDuration(Util.usToMs(mediaDurationForPlayoutDuration - j3), this.f32396j)));
            }
        }
        this.f32383D = nanoTime;
        this.f32382C = mediaDurationForPlayoutDuration;
        this.f32384E = hasAdvancingTimestamp;
        return mediaDurationForPlayoutDuration;
    }

    public void handleEndOfStream(long j) {
        this.f32380A = m75054c();
        this.f32411y = SystemClock.elapsedRealtime() * 1000;
        this.f32381B = j;
    }

    public boolean hasPendingData(long j) {
        if (j <= m75054c() && !m75056a()) {
            return false;
        }
        return true;
    }

    public boolean isPlaying() {
        if (((AudioTrack) Assertions.checkNotNull(this.f32389c)).getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public boolean isStalled(long j) {
        if (this.f32412z != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f32412z >= 200) {
            return true;
        }
        return false;
    }

    public boolean mayHandleBuffer(long j) {
        int playState = ((AudioTrack) Assertions.checkNotNull(this.f32389c)).getPlayState();
        if (this.f32394h) {
            if (playState == 2) {
                this.f32402p = false;
                return false;
            } else if (playState == 1 && m75054c() == 0) {
                return false;
            }
        }
        boolean z = this.f32402p;
        boolean hasPendingData = hasPendingData(j);
        this.f32402p = hasPendingData;
        if (z && !hasPendingData && playState != 1) {
            this.f32387a.onUnderrun(this.f32391e, Util.usToMs(this.f32395i));
        }
        return true;
    }

    public boolean pause() {
        m75048i();
        if (this.f32411y == -9223372036854775807L) {
            ((AudioTimestampPoller) Assertions.checkNotNull(this.f32392f)).reset();
            return true;
        }
        return false;
    }

    public void reset() {
        m75048i();
        this.f32389c = null;
        this.f32392f = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        long j;
        this.f32389c = audioTrack;
        this.f32390d = i2;
        this.f32391e = i3;
        this.f32392f = new AudioTimestampPoller(audioTrack);
        this.f32393g = audioTrack.getSampleRate();
        if (z && m75049h(i)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f32394h = z2;
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(i);
        this.f32403q = isEncodingLinearPcm;
        if (isEncodingLinearPcm) {
            j = m75055b(i3 / i2);
        } else {
            j = -9223372036854775807L;
        }
        this.f32395i = j;
        this.f32406t = 0L;
        this.f32407u = 0L;
        this.f32408v = 0L;
        this.f32402p = false;
        this.f32411y = -9223372036854775807L;
        this.f32412z = -9223372036854775807L;
        this.f32404r = 0L;
        this.f32401o = 0L;
        this.f32396j = 1.0f;
    }

    public void setAudioTrackPlaybackSpeed(float f) {
        this.f32396j = f;
        AudioTimestampPoller audioTimestampPoller = this.f32392f;
        if (audioTimestampPoller != null) {
            audioTimestampPoller.reset();
        }
        m75048i();
    }

    public void start() {
        ((AudioTimestampPoller) Assertions.checkNotNull(this.f32392f)).reset();
    }
}
