package com.mobilefuse.videoplayer.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.mobilefuse.sdk.StabilityHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseVideoTextureView.kt */
@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class MobileFuseVideoTextureView extends TextureView implements TextureView.SurfaceTextureListener, VideoViewInterface {
    private final MediaPlayer mediaPlayer;
    private Surface surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseVideoTextureView(@NotNull Context context, @NotNull MediaPlayer mediaPlayer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.mediaPlayer = mediaPlayer;
        setSurfaceTextureListener(this);
    }

    @Override // com.mobilefuse.videoplayer.media.VideoViewInterface
    public void destroy() {
        try {
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    @Override // android.view.View
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

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.surface = surface;
        this.mediaPlayer.setSurface(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.surface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int i, int i2) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.surface = surface;
        this.mediaPlayer.setSurface(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.surface = surface;
        this.mediaPlayer.setSurface(surface);
    }
}
