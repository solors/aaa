package com.smaato.sdk.video.vast.vastplayer;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class SkipButtonVisibilityManagerImpl extends SkipButtonVisibilityManager {
    private final long durationMillis;
    private long lastUpdatedCountdownValue;
    private final long skipOffsetMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SkipButtonVisibilityManagerImpl(long j, long j2) {
        this.skipOffsetMillis = Math.min(j, j2);
        this.durationMillis = j2;
        this.lastUpdatedCountdownValue = j2;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.SkipButtonVisibilityManager
    void onProgressChange(long j, @NonNull VideoPlayerView videoPlayerView) {
        long j2;
        long j3 = this.skipOffsetMillis;
        if (j3 < 0) {
            return;
        }
        if (j >= j3 && j < this.durationMillis) {
            videoPlayerView.hideCountdownText();
            videoPlayerView.showSkipButton();
        }
        if (j >= 0) {
            if (j <= this.skipOffsetMillis && j < this.durationMillis) {
                int ceil = (int) Math.ceil((j2 - j) / 1000.0d);
                long j4 = ceil;
                if (this.lastUpdatedCountdownValue > j4) {
                    videoPlayerView.updateCountdownText(ceil);
                    this.lastUpdatedCountdownValue = j4;
                }
            }
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.SkipButtonVisibilityManager
    void onVideoComplete(@NonNull VideoPlayerView videoPlayerView) {
        videoPlayerView.hideSkipButton();
        videoPlayerView.hideProgressBar();
        videoPlayerView.hideMuteButton();
        videoPlayerView.hideCountdownText();
    }
}
