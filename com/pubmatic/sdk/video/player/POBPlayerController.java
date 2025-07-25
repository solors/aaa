package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.player.POBVideoPlayerView;

/* loaded from: classes7.dex */
public abstract class POBPlayerController extends FrameLayout implements POBVideoPlayerView.POBVideoPlayerListener {
    public POBPlayerController(@NonNull Context context) {
        super(context);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onMute(boolean z);

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onPause();

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onProgressUpdate(int i);

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onResume();

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onStart();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setVideoPlayerEvents(@NonNull POBVideoPlayer pOBVideoPlayer);

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onClick() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onCompletion() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onBufferUpdate(int i) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onReadyToPlay(@NonNull POBVideoPlayerView pOBVideoPlayerView) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onFailure(int i, @NonNull String str) {
    }
}
