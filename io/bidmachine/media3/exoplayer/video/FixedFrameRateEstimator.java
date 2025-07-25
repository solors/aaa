package io.bidmachine.media3.exoplayer.video;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* renamed from: io.bidmachine.media3.exoplayer.video.a */
/* loaded from: classes9.dex */
final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;
    @VisibleForTesting
    static final long MAX_MATCHING_FRAME_DIFFERENCE_NS = 1000000;
    private boolean candidateMatcherActive;
    private int framesWithoutSyncCount;
    private boolean switchToCandidateMatcherWhenSynced;
    private C36496a currentMatcher = new C36496a();
    private C36496a candidateMatcher = new C36496a();
    private long lastFramePresentationTimeNs = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FixedFrameRateEstimator.java */
    /* renamed from: io.bidmachine.media3.exoplayer.video.a$a */
    /* loaded from: classes9.dex */
    public static final class C36496a {
        private long firstFrameDurationNs;
        private long firstFramePresentationTimeNs;
        private long frameCount;
        private long lastFramePresentationTimeNs;
        private long matchingFrameCount;
        private long matchingFrameDurationSumNs;
        private int recentFrameOutlierCount;
        private final boolean[] recentFrameOutlierFlags = new boolean[15];

        private static int getRecentFrameOutlierIndex(long j) {
            return (int) (j % 15);
        }

        public long getFrameDurationNs() {
            long j = this.matchingFrameCount;
            if (j == 0) {
                return 0L;
            }
            return this.matchingFrameDurationSumNs / j;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.matchingFrameDurationSumNs;
        }

        public boolean isLastFrameOutlier() {
            long j = this.frameCount;
            if (j == 0) {
                return false;
            }
            return this.recentFrameOutlierFlags[getRecentFrameOutlierIndex(j - 1)];
        }

        public boolean isSynced() {
            if (this.frameCount > 15 && this.recentFrameOutlierCount == 0) {
                return true;
            }
            return false;
        }

        public void onNextFrame(long j) {
            long j2 = this.frameCount;
            if (j2 == 0) {
                this.firstFramePresentationTimeNs = j;
            } else if (j2 == 1) {
                long j3 = j - this.firstFramePresentationTimeNs;
                this.firstFrameDurationNs = j3;
                this.matchingFrameDurationSumNs = j3;
                this.matchingFrameCount = 1L;
            } else {
                long j4 = j - this.lastFramePresentationTimeNs;
                int recentFrameOutlierIndex = getRecentFrameOutlierIndex(j2);
                if (Math.abs(j4 - this.firstFrameDurationNs) <= 1000000) {
                    this.matchingFrameCount++;
                    this.matchingFrameDurationSumNs += j4;
                    boolean[] zArr = this.recentFrameOutlierFlags;
                    if (zArr[recentFrameOutlierIndex]) {
                        zArr[recentFrameOutlierIndex] = false;
                        this.recentFrameOutlierCount--;
                    }
                } else {
                    boolean[] zArr2 = this.recentFrameOutlierFlags;
                    if (!zArr2[recentFrameOutlierIndex]) {
                        zArr2[recentFrameOutlierIndex] = true;
                        this.recentFrameOutlierCount++;
                    }
                }
            }
            this.frameCount++;
            this.lastFramePresentationTimeNs = j;
        }

        public void reset() {
            this.frameCount = 0L;
            this.matchingFrameCount = 0L;
            this.matchingFrameDurationSumNs = 0L;
            this.recentFrameOutlierCount = 0;
            Arrays.fill(this.recentFrameOutlierFlags, false);
        }
    }

    public long getFrameDurationNs() {
        if (isSynced()) {
            return this.currentMatcher.getFrameDurationNs();
        }
        return -9223372036854775807L;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.currentMatcher.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.framesWithoutSyncCount;
    }

    public long getMatchingFrameDurationSumNs() {
        if (isSynced()) {
            return this.currentMatcher.getMatchingFrameDurationSumNs();
        }
        return -9223372036854775807L;
    }

    public boolean isSynced() {
        return this.currentMatcher.isSynced();
    }

    public void onNextFrame(long j) {
        this.currentMatcher.onNextFrame(j);
        int i = 0;
        if (this.currentMatcher.isSynced() && !this.switchToCandidateMatcherWhenSynced) {
            this.candidateMatcherActive = false;
        } else if (this.lastFramePresentationTimeNs != -9223372036854775807L) {
            if (!this.candidateMatcherActive || this.candidateMatcher.isLastFrameOutlier()) {
                this.candidateMatcher.reset();
                this.candidateMatcher.onNextFrame(this.lastFramePresentationTimeNs);
            }
            this.candidateMatcherActive = true;
            this.candidateMatcher.onNextFrame(j);
        }
        if (this.candidateMatcherActive && this.candidateMatcher.isSynced()) {
            C36496a c36496a = this.currentMatcher;
            this.currentMatcher = this.candidateMatcher;
            this.candidateMatcher = c36496a;
            this.candidateMatcherActive = false;
            this.switchToCandidateMatcherWhenSynced = false;
        }
        this.lastFramePresentationTimeNs = j;
        if (!this.currentMatcher.isSynced()) {
            i = this.framesWithoutSyncCount + 1;
        }
        this.framesWithoutSyncCount = i;
    }

    public void reset() {
        this.currentMatcher.reset();
        this.candidateMatcher.reset();
        this.candidateMatcherActive = false;
        this.lastFramePresentationTimeNs = -9223372036854775807L;
        this.framesWithoutSyncCount = 0;
    }
}
