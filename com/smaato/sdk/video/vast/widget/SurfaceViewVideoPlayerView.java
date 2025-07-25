package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.vastplayer.VideoPlayerView;

/* loaded from: classes7.dex */
public class SurfaceViewVideoPlayerView extends VideoPlayerView {
    public SurfaceViewVideoPlayerView(@NonNull Context context) {
        super(context);
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayerView
    @NonNull
    protected VastSurfaceHolder initVastSurfaceHolder(@NonNull Context context) {
        return new SurfaceViewVastSurfaceHolder(new SurfaceView(context));
    }
}
