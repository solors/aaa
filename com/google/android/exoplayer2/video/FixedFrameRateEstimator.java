package com.google.android.exoplayer2.video;

import java.util.Arrays;

/* loaded from: classes4.dex */
final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;

    /* renamed from: c */
    private boolean f36252c;

    /* renamed from: d */
    private boolean f36253d;

    /* renamed from: f */
    private int f36255f;

    /* renamed from: a */
    private Matcher f36250a = new Matcher();

    /* renamed from: b */
    private Matcher f36251b = new Matcher();

    /* renamed from: e */
    private long f36254e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Matcher {

        /* renamed from: a */
        private long f36256a;

        /* renamed from: b */
        private long f36257b;

        /* renamed from: c */
        private long f36258c;

        /* renamed from: d */
        private long f36259d;

        /* renamed from: e */
        private long f36260e;

        /* renamed from: f */
        private long f36261f;

        /* renamed from: g */
        private final boolean[] f36262g = new boolean[15];

        /* renamed from: h */
        private int f36263h;

        /* renamed from: a */
        private static int m72473a(long j) {
            return (int) (j % 15);
        }

        public long getFrameDurationNs() {
            long j = this.f36260e;
            if (j == 0) {
                return 0L;
            }
            return this.f36261f / j;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.f36261f;
        }

        public boolean isLastFrameOutlier() {
            long j = this.f36259d;
            if (j == 0) {
                return false;
            }
            return this.f36262g[m72473a(j - 1)];
        }

        public boolean isSynced() {
            if (this.f36259d > 15 && this.f36263h == 0) {
                return true;
            }
            return false;
        }

        public void onNextFrame(long j) {
            long j2 = this.f36259d;
            if (j2 == 0) {
                this.f36256a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f36256a;
                this.f36257b = j3;
                this.f36261f = j3;
                this.f36260e = 1L;
            } else {
                long j4 = j - this.f36258c;
                int m72473a = m72473a(j2);
                if (Math.abs(j4 - this.f36257b) <= 1000000) {
                    this.f36260e++;
                    this.f36261f += j4;
                    boolean[] zArr = this.f36262g;
                    if (zArr[m72473a]) {
                        zArr[m72473a] = false;
                        this.f36263h--;
                    }
                } else {
                    boolean[] zArr2 = this.f36262g;
                    if (!zArr2[m72473a]) {
                        zArr2[m72473a] = true;
                        this.f36263h++;
                    }
                }
            }
            this.f36259d++;
            this.f36258c = j;
        }

        public void reset() {
            this.f36259d = 0L;
            this.f36260e = 0L;
            this.f36261f = 0L;
            this.f36263h = 0;
            Arrays.fill(this.f36262g, false);
        }
    }

    public long getFrameDurationNs() {
        if (isSynced()) {
            return this.f36250a.getFrameDurationNs();
        }
        return -9223372036854775807L;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.f36250a.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.f36255f;
    }

    public long getMatchingFrameDurationSumNs() {
        if (isSynced()) {
            return this.f36250a.getMatchingFrameDurationSumNs();
        }
        return -9223372036854775807L;
    }

    public boolean isSynced() {
        return this.f36250a.isSynced();
    }

    public void onNextFrame(long j) {
        this.f36250a.onNextFrame(j);
        int i = 0;
        if (this.f36250a.isSynced() && !this.f36253d) {
            this.f36252c = false;
        } else if (this.f36254e != -9223372036854775807L) {
            if (!this.f36252c || this.f36251b.isLastFrameOutlier()) {
                this.f36251b.reset();
                this.f36251b.onNextFrame(this.f36254e);
            }
            this.f36252c = true;
            this.f36251b.onNextFrame(j);
        }
        if (this.f36252c && this.f36251b.isSynced()) {
            Matcher matcher = this.f36250a;
            this.f36250a = this.f36251b;
            this.f36251b = matcher;
            this.f36252c = false;
            this.f36253d = false;
        }
        this.f36254e = j;
        if (!this.f36250a.isSynced()) {
            i = this.f36255f + 1;
        }
        this.f36255f = i;
    }

    public void reset() {
        this.f36250a.reset();
        this.f36251b.reset();
        this.f36252c = false;
        this.f36254e = -9223372036854775807L;
        this.f36255f = 0;
    }
}
