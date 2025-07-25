package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;

    /* renamed from: a */
    private final float f31364a;

    /* renamed from: b */
    private final float f31365b;

    /* renamed from: c */
    private final long f31366c;

    /* renamed from: d */
    private final float f31367d;

    /* renamed from: e */
    private final long f31368e;

    /* renamed from: f */
    private final long f31369f;

    /* renamed from: g */
    private final float f31370g;

    /* renamed from: h */
    private long f31371h;

    /* renamed from: i */
    private long f31372i;

    /* renamed from: j */
    private long f31373j;

    /* renamed from: k */
    private long f31374k;

    /* renamed from: l */
    private long f31375l;

    /* renamed from: m */
    private long f31376m;

    /* renamed from: n */
    private float f31377n;

    /* renamed from: o */
    private float f31378o;

    /* renamed from: p */
    private float f31379p;

    /* renamed from: q */
    private long f31380q;

    /* renamed from: r */
    private long f31381r;

    /* renamed from: s */
    private long f31382s;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private float f31383a = 0.97f;

        /* renamed from: b */
        private float f31384b = 1.03f;

        /* renamed from: c */
        private long f31385c = 1000;

        /* renamed from: d */
        private float f31386d = 1.0E-7f;

        /* renamed from: e */
        private long f31387e = Util.msToUs(20);

        /* renamed from: f */
        private long f31388f = Util.msToUs(500);

        /* renamed from: g */
        private float f31389g = 0.999f;

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.f31383a, this.f31384b, this.f31385c, this.f31386d, this.f31387e, this.f31388f, this.f31389g);
        }

        @CanIgnoreReturnValue
        public Builder setFallbackMaxPlaybackSpeed(float f) {
            boolean z;
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f31384b = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFallbackMinPlaybackSpeed(float f) {
            boolean z;
            if (0.0f < f && f <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f31383a = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f31387e = Util.msToUs(j);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinPossibleLiveOffsetSmoothingFactor(float f) {
            boolean z;
            if (f >= 0.0f && f < 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f31389g = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinUpdateIntervalMs(long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f31385c = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setProportionalControlFactor(float f) {
            boolean z;
            if (f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f31386d = f / 1000000.0f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f31388f = Util.msToUs(j);
            return this;
        }
    }

    /* renamed from: a */
    private void m76094a(long j) {
        long j2 = this.f31381r + (this.f31382s * 3);
        if (this.f31376m > j2) {
            float msToUs = (float) Util.msToUs(this.f31366c);
            this.f31376m = Longs.max(j2, this.f31373j, this.f31376m - (((this.f31379p - 1.0f) * msToUs) + ((this.f31377n - 1.0f) * msToUs)));
            return;
        }
        long constrainValue = Util.constrainValue(j - (Math.max(0.0f, this.f31379p - 1.0f) / this.f31367d), this.f31376m, j2);
        this.f31376m = constrainValue;
        long j3 = this.f31375l;
        if (j3 != -9223372036854775807L && constrainValue > j3) {
            this.f31376m = j3;
        }
    }

    /* renamed from: b */
    private void m76093b() {
        long j = this.f31371h;
        if (j != -9223372036854775807L) {
            long j2 = this.f31372i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f31374k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f31375l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f31373j == j) {
            return;
        }
        this.f31373j = j;
        this.f31376m = j;
        this.f31381r = -9223372036854775807L;
        this.f31382s = -9223372036854775807L;
        this.f31380q = -9223372036854775807L;
    }

    /* renamed from: c */
    private static long m76092c(long j, long j2, float f) {
        return (((float) j) * f) + ((1.0f - f) * ((float) j2));
    }

    /* renamed from: d */
    private void m76091d(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f31381r;
        if (j4 == -9223372036854775807L) {
            this.f31381r = j3;
            this.f31382s = 0L;
            return;
        }
        long max = Math.max(j3, m76092c(j4, j3, this.f31370g));
        this.f31381r = max;
        this.f31382s = m76092c(this.f31382s, Math.abs(j3 - max), this.f31370g);
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j, long j2) {
        if (this.f31371h == -9223372036854775807L) {
            return 1.0f;
        }
        m76091d(j, j2);
        if (this.f31380q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f31380q < this.f31366c) {
            return this.f31379p;
        }
        this.f31380q = SystemClock.elapsedRealtime();
        m76094a(j);
        long j3 = j - this.f31376m;
        if (Math.abs(j3) < this.f31368e) {
            this.f31379p = 1.0f;
        } else {
            this.f31379p = Util.constrainValue((this.f31367d * ((float) j3)) + 1.0f, this.f31378o, this.f31377n);
        }
        return this.f31379p;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.f31376m;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j = this.f31376m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f31369f;
        this.f31376m = j2;
        long j3 = this.f31375l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f31376m = j3;
        }
        this.f31380q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        this.f31371h = Util.msToUs(liveConfiguration.targetOffsetMs);
        this.f31374k = Util.msToUs(liveConfiguration.minOffsetMs);
        this.f31375l = Util.msToUs(liveConfiguration.maxOffsetMs);
        float f = liveConfiguration.minPlaybackSpeed;
        if (f == -3.4028235E38f) {
            f = this.f31364a;
        }
        this.f31378o = f;
        float f2 = liveConfiguration.maxPlaybackSpeed;
        if (f2 == -3.4028235E38f) {
            f2 = this.f31365b;
        }
        this.f31377n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f31371h = -9223372036854775807L;
        }
        m76093b();
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j) {
        this.f31372i = j;
        m76093b();
    }

    private DefaultLivePlaybackSpeedControl(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f31364a = f;
        this.f31365b = f2;
        this.f31366c = j;
        this.f31367d = f3;
        this.f31368e = j2;
        this.f31369f = j3;
        this.f31370g = f4;
        this.f31371h = -9223372036854775807L;
        this.f31372i = -9223372036854775807L;
        this.f31374k = -9223372036854775807L;
        this.f31375l = -9223372036854775807L;
        this.f31378o = f;
        this.f31377n = f2;
        this.f31379p = 1.0f;
        this.f31380q = -9223372036854775807L;
        this.f31373j = -9223372036854775807L;
        this.f31376m = -9223372036854775807L;
        this.f31381r = -9223372036854775807L;
        this.f31382s = -9223372036854775807L;
    }
}
