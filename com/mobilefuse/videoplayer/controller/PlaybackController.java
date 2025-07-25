package com.mobilefuse.videoplayer.controller;

import android.os.Handler;
import android.os.Looper;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.VideoPlayerController;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlaybackController.kt */
@Metadata
/* loaded from: classes7.dex */
public final class PlaybackController extends BaseModuleController {
    private boolean firstQuartile;
    private boolean midpoint;
    private boolean thirdQuartile;
    private long videoPosition;
    private Timer videoWatcher;
    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private long videoDuration = -1;

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoPosition() {
        return this.videoPosition;
    }

    public final void onVideoProgress(long j, long j2) {
        this.videoPosition = j;
        VideoPlayerController controller$mobilefuse_video_player_release = getVideoPlayer().getController$mobilefuse_video_player_release();
        if (this.videoDuration == -1) {
            this.videoDuration = j2;
            controller$mobilefuse_video_player_release.prepareProgressTrackingEvents();
        }
        controller$mobilefuse_video_player_release.onPlaying(this.videoPosition);
        float f = ((float) this.videoPosition) / ((float) j2);
        if (f > 0.25f && !this.firstQuartile) {
            this.firstQuartile = true;
            controller$mobilefuse_video_player_release.sendTrackingEvent(VastTrackingEventType.firstQuartile);
            VideoPlayer.PlaybackListener playbackListener$mobilefuse_video_player_release = getVideoPlayer().getPlaybackListener$mobilefuse_video_player_release();
            if (playbackListener$mobilefuse_video_player_release != null) {
                playbackListener$mobilefuse_video_player_release.onVideoFirstQuartile();
            }
        }
        if (f > 0.5f && !this.midpoint) {
            this.midpoint = true;
            controller$mobilefuse_video_player_release.sendTrackingEvent(VastTrackingEventType.midpoint);
            VideoPlayer.PlaybackListener playbackListener$mobilefuse_video_player_release2 = getVideoPlayer().getPlaybackListener$mobilefuse_video_player_release();
            if (playbackListener$mobilefuse_video_player_release2 != null) {
                playbackListener$mobilefuse_video_player_release2.onVideoMidpoint();
            }
        }
        if (f > 0.75f && !this.thirdQuartile) {
            this.thirdQuartile = true;
            controller$mobilefuse_video_player_release.sendTrackingEvent(VastTrackingEventType.thirdQuartile);
            VideoPlayer.PlaybackListener playbackListener$mobilefuse_video_player_release3 = getVideoPlayer().getPlaybackListener$mobilefuse_video_player_release();
            if (playbackListener$mobilefuse_video_player_release3 != null) {
                playbackListener$mobilefuse_video_player_release3.onVideoThirdQuartile();
            }
        }
    }

    public final void startUpdating(@NotNull Function2<? super Long, ? super Long, Unit> updateBlock) {
        Intrinsics.checkNotNullParameter(updateBlock, "updateBlock");
        Timer timer = new Timer();
        this.videoWatcher = timer;
        timer.schedule(new PlaybackController$startUpdating$1(this, updateBlock), 0L, 50L);
    }

    public final void stopUpdating() {
        Timer timer = this.videoWatcher;
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
        this.videoWatcher = null;
    }
}
