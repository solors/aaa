package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.vastplayer.VideoPlayerView;

/* loaded from: classes7.dex */
public class SurfaceViewVideoPlayerViewFactory implements VideoPlayerViewFactory {
    @Override // com.smaato.sdk.video.vast.widget.VideoPlayerViewFactory
    @NonNull
    public VideoPlayerView getVideoPlayerView(@NonNull Context context) {
        return new SurfaceViewVideoPlayerView(context);
    }
}
