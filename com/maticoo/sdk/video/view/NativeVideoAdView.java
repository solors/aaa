package com.maticoo.sdk.video.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import com.maticoo.sdk.bean.TrackEventType;
import com.maticoo.sdk.utils.WorkExecutor;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class NativeVideoAdView extends BaseVideoView implements SurfaceHolder.Callback {
    boolean isFirstResume;
    private boolean isSurfaceCreated;
    private SurfaceHolder mSurfaceHolder;
    private SurfaceView mSurfaceView;

    public NativeVideoAdView(Context context) {
        super(context);
        this.isSurfaceCreated = false;
        this.isFirstResume = false;
    }

    private void startPlayer() {
        MediaPlayer mediaPlayer;
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null && (mediaPlayer = this.mMediaPlayer) != null) {
            this.isStartPlayer = true;
            mediaPlayer.setDisplay(surfaceHolder);
            this.mMediaPlayer.start();
            int i = this.savedPosition;
            if (i > 0) {
                if (this.isCompletion) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                        mediaPlayer2.seekTo(mediaPlayer2.getDuration(), 2);
                    } else {
                        MediaPlayer mediaPlayer3 = this.mMediaPlayer;
                        mediaPlayer3.seekTo(mediaPlayer3.getDuration());
                    }
                    this.mMediaPlayer.stop();
                } else if (Build.VERSION.SDK_INT >= 26) {
                    this.mMediaPlayer.seekTo(i, 2);
                } else {
                    this.mMediaPlayer.seekTo(i);
                }
            }
            this.videoProgressHandler.sendEmptyMessageDelayed(1, 100L);
        }
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    protected View createSurfaceView() {
        SurfaceView surfaceView = new SurfaceView(this.context);
        this.mSurfaceView = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.mSurfaceHolder = holder;
        holder.addCallback(this);
        this.mSurfaceHolder.setType(3);
        return this.mSurfaceView;
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    View getSurfaceView() {
        return this.mSurfaceView;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        DeveloperLog.LogD("NativeVideoAdView entered onPrepared --(MediaPlayer callback) width:" + mediaPlayer.getVideoWidth() + ", height:" + mediaPlayer.getVideoHeight() + ", hashCode:" + hashCode());
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
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null && surfaceHolder.getSurface().isValid() && this.isSurfaceCreated && this.videoLayout.getVisibility() == 0) {
                DeveloperLog.LogD("NativeVideoAdView entered startPlayer onPrepared hashCode:" + hashCode());
                startPlayer();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        DeveloperLog.LogD("NativeVideoAdView onVisibilityChanged visibility=" + i);
        if (i == 0) {
            this.isFirstResume = true;
            resumeMe();
        } else if (!this.isShowCompanion && this.mMediaPlayer != null && this.isFirstResume) {
            pauseMe();
        }
        super.onVisibilityChanged(view, i);
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    public void pauseMe() {
        this.isMediaPlayerPrepared = false;
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView != null) {
            surfaceView.setVisibility(8);
        }
        if (this.mMediaPlayer != null) {
            try {
                this.videoProgressHandler.removeMessages(1);
                this.savedPosition = this.mMediaPlayer.getCurrentPosition();
                DeveloperLog.LogD("NativeVideoAdView pauseMe savedPosition=" + this.savedPosition);
                releaseMe();
            } catch (Throwable th) {
                DeveloperLog.LogE("NativeVideoAdView pauseMe Exception -> ", th);
                processErrorEvent(-3, 1000);
            }
        }
        if (!this.isCompletion && this.isStartPlayer) {
            processEvent(TrackEventType.pause);
        }
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    public void releaseMe() {
        DeveloperLog.LogD("NativeVideoAdView releaseMe savedPosition=" + this.savedPosition + ", hashCode=" + hashCode());
        final MediaPlayer mediaPlayer = this.mMediaPlayer;
        WorkExecutor.execute(new Runnable() { // from class: com.maticoo.sdk.video.view.NativeVideoAdView.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MediaPlayer mediaPlayer2 = mediaPlayer;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.stop();
                        mediaPlayer.reset();
                        mediaPlayer.release();
                    }
                } catch (Exception unused) {
                }
            }
        });
        this.mMediaPlayer = null;
    }

    @Override // com.maticoo.sdk.video.view.BaseVideoView
    public void resumeMe() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView == null) {
            return;
        }
        surfaceView.setZOrderOnTop(false);
        this.mSurfaceView.setVisibility(0);
        if (!this.isCompletion && this.isStartPlayer) {
            processEvent(TrackEventType.resume);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        DeveloperLog.LogD("NativeVideoAdView entered surfaceChanged -- (SurfaceHolder callback) hashCode:" + hashCode());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
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
            DeveloperLog.LogD("NativeVideoAdView entered startPlayer surfaceCreated hashCode:" + hashCode());
            startPlayer();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        DeveloperLog.LogD("NativeVideoAdView entered surfaceDestroyed -- (SurfaceHolder callback)");
        this.isSurfaceCreated = false;
        this.videoProgressHandler.removeMessages(1);
    }
}
