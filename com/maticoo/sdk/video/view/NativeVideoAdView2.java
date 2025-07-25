package com.maticoo.sdk.video.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import com.maticoo.sdk.bean.TrackEventType;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class NativeVideoAdView2 extends BaseVideoView implements TextureView.SurfaceTextureListener {
    private boolean isSurfaceCreated;
    private TextureView mSurfaceView;

    public NativeVideoAdView2(Context context) {
        super(context);
        this.isSurfaceCreated = false;
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    protected View createSurfaceView() {
        TextureView textureView = new TextureView(this.context);
        this.mSurfaceView = textureView;
        textureView.setLayerType(1, null);
        this.mSurfaceView.setSurfaceTextureListener(this);
        return this.mSurfaceView;
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    View getSurfaceView() {
        return this.mSurfaceView;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        DeveloperLog.LogD("NativeVideoAdView entered onPrepared --(MediaPlayer callback) width:" + mediaPlayer.getVideoWidth() + ", height:" + mediaPlayer.getVideoHeight());
        try {
            if (!this.safeState.isOnLoad()) {
                this.safeState.setOnLoad(true);
                prepared();
            }
            this.mVideoWidth = mediaPlayer.getVideoWidth();
            this.mVideoHeight = mediaPlayer.getVideoHeight();
            this.isMediaPlayerPrepared = true;
            this.loadingProgressBar.setVisibility(8);
            if (this.mMediaPlayer == null) {
                this.mMediaPlayer = mediaPlayer;
            }
            if (this.isSurfaceCreated && this.videoLayout.getVisibility() == 0) {
                DeveloperLog.LogD("NativeVideoAdView entered startPlayer onPrepared");
                startPlayer();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
        DeveloperLog.LogD("NativeVideoAdView entered onSurfaceTextureAvailable -- (SurfaceHolder callback) isMediaPlayerPrepared=" + this.isMediaPlayerPrepared);
        this.isSurfaceCreated = true;
        if (!this.hasProcessCreativeView) {
            changeVideoSize(this.mVideoWidth, this.mVideoHeight);
        }
        if (this.mMediaPlayer == null) {
            createMediaPlayer();
            prepareMediaPlayer();
        }
        if (!this.hasProcessCreativeView) {
            processEvent(TrackEventType.creativeView);
            this.hasProcessCreativeView = true;
        }
        setVolume();
        if (this.isMediaPlayerPrepared) {
            DeveloperLog.LogD("NativeVideoAdView entered startPlayer surfaceCreated");
            startPlayer();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
        DeveloperLog.LogD("NativeVideoAdView entered onSurfaceTextureDestroyed");
        this.isSurfaceCreated = false;
        this.videoProgressHandler.removeMessages(1);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
        DeveloperLog.LogD("NativeVideoAdView entered onSurfaceTextureSizeChanged width:" + i + ", height:" + i2);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        DeveloperLog.LogD("NativeVideoAdView Video onWindowVisibilityChanged visibility=" + i + "， hashCode=" + hashCode());
        if (!this.isStartPlayer) {
            return;
        }
        if (i == 0) {
            resumeMe();
        } else if (!this.isShowCompanion && this.mMediaPlayer != null) {
            pauseMe();
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    public void pauseMe() {
        if (this.mMediaPlayer != null) {
            try {
                this.videoProgressHandler.removeMessages(1);
                this.savedPosition = this.mMediaPlayer.getCurrentPosition();
                DeveloperLog.LogD("NativeVideoAdView pauseMe savedPosition=" + this.savedPosition);
                MediaPlayer mediaPlayer = this.mMediaPlayer;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    this.mMediaPlayer.pause();
                }
            } catch (Exception e) {
                DeveloperLog.LogE("NativeVideoAdView", e);
                processErrorEvent(-3, 1000);
            }
        }
        if (!this.isCompletion) {
            processEvent(TrackEventType.pause);
        }
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    public void releaseMe() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
                TextureView textureView = this.mSurfaceView;
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(null);
                    this.mSurfaceView.destroyDrawingCache();
                }
                this.mMediaPlayer = null;
                this.mSurfaceView = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    public void resumeMe() {
        DeveloperLog.LogD("NativeVideoAdView resumeMe savedPosition=" + this.savedPosition);
        this.videoProgressHandler.sendEmptyMessageDelayed(1, 100L);
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && !mediaPlayer.isPlaying() && this.isStartPlayer && !this.isCompletion) {
            DeveloperLog.LogD("NativeVideoAdView resumeMe mMediaPlayer.start()");
            this.mMediaPlayer.start();
        }
        if (!this.isCompletion) {
            processEvent(TrackEventType.resume);
        }
    }

    protected void startPlayer() {
        MediaPlayer mediaPlayer;
        if (this.mSurfaceView != null && (mediaPlayer = this.mMediaPlayer) != null) {
            this.isStartPlayer = true;
            mediaPlayer.setSurface(new Surface(this.mSurfaceView.getSurfaceTexture()));
            this.mMediaPlayer.start();
            int i = this.savedPosition;
            if (i > 0) {
                if (this.isCompletion) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                        mediaPlayer2.seekTo(mediaPlayer2.getDuration(), 3);
                    } else {
                        MediaPlayer mediaPlayer3 = this.mMediaPlayer;
                        mediaPlayer3.seekTo(mediaPlayer3.getDuration());
                    }
                } else if (Build.VERSION.SDK_INT >= 26) {
                    this.mMediaPlayer.seekTo(i, 2);
                } else {
                    this.mMediaPlayer.seekTo(i);
                }
            }
            this.videoProgressHandler.sendEmptyMessageDelayed(1, 100L);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
    }
}
