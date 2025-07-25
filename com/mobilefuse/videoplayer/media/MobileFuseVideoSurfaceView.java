package com.mobilefuse.videoplayer.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.mobilefuse.sdk.StabilityHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseVideoSurfaceView.kt */
@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class MobileFuseVideoSurfaceView extends SurfaceView implements SurfaceHolder.Callback, VideoViewInterface {
    private final MediaPlayer mediaPlayer;
    private Surface surface;
    private final SurfaceHolder surfaceHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseVideoSurfaceView(@NotNull Context context, @NotNull MediaPlayer mediaPlayer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.mediaPlayer = mediaPlayer;
        SurfaceHolder holder = getHolder();
        Intrinsics.checkNotNullExpressionValue(holder, "holder");
        this.surfaceHolder = holder;
        setZOrderMediaOverlay(true);
        holder.addCallback(this);
    }

    @Override // com.mobilefuse.videoplayer.media.VideoViewInterface
    public void destroy() {
        try {
            this.surfaceHolder.removeCallback(this);
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        try {
            int videoWidth = this.mediaPlayer.getVideoWidth();
            int videoHeight = this.mediaPlayer.getVideoHeight();
            if (videoWidth != 0 && videoHeight != 0) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i4 = videoWidth * size2;
                    int i5 = size * videoHeight;
                    if (i4 < i5) {
                        size = i4 / videoHeight;
                    } else if (i4 > i5) {
                        size2 = i5 / videoWidth;
                    }
                } else if (mode == 1073741824) {
                    int i6 = (videoHeight * size) / videoWidth;
                    size2 = (mode2 != Integer.MIN_VALUE || i6 <= size2) ? i6 : size2 | 16777216;
                } else if (mode2 == 1073741824) {
                    int i7 = (videoWidth * size2) / videoHeight;
                    size = (mode != Integer.MIN_VALUE || i7 <= size) ? i7 : size | 16777216;
                } else {
                    if (mode2 == Integer.MIN_VALUE && videoHeight > size2) {
                        i3 = (size2 * videoWidth) / videoHeight;
                    } else {
                        i3 = videoWidth;
                        size2 = videoHeight;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        size2 = (videoHeight * size) / videoWidth;
                    } else {
                        size = i3;
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
            setMeasuredDimension(View.getDefaultSize(videoWidth, i), View.getDefaultSize(videoHeight, i2));
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder holder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.mediaPlayer.setDisplay(holder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.surface = holder.getSurface();
        this.mediaPlayer.setDisplay(holder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.surface = null;
        this.mediaPlayer.setDisplay(null);
    }
}
