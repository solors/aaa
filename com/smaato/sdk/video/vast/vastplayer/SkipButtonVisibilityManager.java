package com.smaato.sdk.video.vast.vastplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public abstract class SkipButtonVisibilityManager {
    @NonNull
    public static SkipButtonVisibilityManager create(@Nullable VideoSettings videoSettings) {
        if (videoSettings == null) {
            return new C27987b();
        }
        if (videoSettings.isVideoSkippable) {
            return new SkipButtonVisibilityManagerImpl(videoSettings.skipOffsetMillis, videoSettings.videoDurationMillis);
        }
        return new C27987b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void onProgressChange(long j, @NonNull VideoPlayerView videoPlayerView);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void onVideoComplete(@NonNull VideoPlayerView videoPlayerView);

    /* renamed from: com.smaato.sdk.video.vast.vastplayer.SkipButtonVisibilityManager$b */
    /* loaded from: classes7.dex */
    private static class C27987b extends SkipButtonVisibilityManager {
        private C27987b() {
        }

        @Override // com.smaato.sdk.video.vast.vastplayer.SkipButtonVisibilityManager
        public void onVideoComplete(@NonNull VideoPlayerView videoPlayerView) {
            videoPlayerView.hideMuteButton();
            videoPlayerView.hideProgressBar();
        }

        @Override // com.smaato.sdk.video.vast.vastplayer.SkipButtonVisibilityManager
        public void onProgressChange(long j, @NonNull VideoPlayerView videoPlayerView) {
        }
    }
}
