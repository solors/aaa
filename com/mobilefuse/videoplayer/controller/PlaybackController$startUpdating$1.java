package com.mobilefuse.videoplayer.controller;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.videoplayer.VideoPlayer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PlaybackController.kt */
@Metadata
/* loaded from: classes7.dex */
public final class PlaybackController$startUpdating$1 extends TimerTask {
    final /* synthetic */ Function2 $updateBlock;
    final /* synthetic */ PlaybackController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaybackController$startUpdating$1(PlaybackController playbackController, Function2 function2) {
        this.this$0 = playbackController;
        this.$updateBlock = function2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.this$0.getHandler().post(new Runnable() { // from class: com.mobilefuse.videoplayer.controller.PlaybackController$startUpdating$1$run$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (PlaybackController$startUpdating$1.this.this$0.getPlayerState() != VideoPlayer.PlayerState.PLAYING) {
                        return;
                    }
                    PlaybackController playbackController = PlaybackController$startUpdating$1.this.this$0;
                    playbackController.onVideoProgress(playbackController.getVideoPlayer().getCurrentPlaybackPositionMillis(), PlaybackController$startUpdating$1.this.this$0.getVideoPlayer().getPlaybackDurationMillis());
                    PlaybackController$startUpdating$1 playbackController$startUpdating$1 = PlaybackController$startUpdating$1.this;
                    playbackController$startUpdating$1.$updateBlock.mo105910invoke(Long.valueOf(playbackController$startUpdating$1.this$0.getVideoPosition()), Long.valueOf(PlaybackController$startUpdating$1.this.this$0.getVideoDuration()));
                } catch (Throwable th) {
                    StabilityHelper.logException(PlaybackController$startUpdating$1.this, th);
                }
            }
        });
    }
}
