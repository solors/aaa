package com.pubmatic.sdk.video.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.video.player.POBPlayer;
import com.pubmatic.sdk.video.player.POBVideoPlayer;

@SuppressLint({"LongLogTag"})
@MainThread
/* loaded from: classes7.dex */
public class POBVideoPlayerView extends FrameLayout implements POBVideoPlayer, SurfaceHolder.Callback, POBPlayer.POBPlayerListener {

    /* renamed from: a */
    private int f70973a;
    @NonNull

    /* renamed from: b */
    private final SurfaceView f70974b;
    @Nullable

    /* renamed from: c */
    private POBPlayer f70975c;
    @Nullable

    /* renamed from: d */
    private POBVideoPlayerListener f70976d;
    @Nullable

    /* renamed from: e */
    private POBPlayerController f70977e;

    /* renamed from: f */
    private boolean f70978f;

    /* renamed from: g */
    private boolean f70979g;
    @NonNull

    /* renamed from: h */
    private POBVideoPlayer.VideoPlayerState f70980h;

    /* renamed from: i */
    private boolean f70981i;
    @NonNull

    /* renamed from: j */
    private final View.OnClickListener f70982j;

    /* loaded from: classes7.dex */
    public interface POBVideoPlayerListener {
        void onBufferUpdate(int i);

        void onClick();

        void onCompletion();

        void onFailure(int i, @NonNull String str);

        void onMute(boolean z);

        void onPause();

        void onProgressUpdate(int i);

        void onReadyToPlay(@NonNull POBVideoPlayerView pOBVideoPlayerView);

        void onResume();

        void onStart();
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBVideoPlayerView$a */
    /* loaded from: classes7.dex */
    class View$OnClickListenerC26861a implements View.OnClickListener {
        View$OnClickListenerC26861a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVideoPlayerView.this.f70976d != null) {
                POBVideoPlayerView.this.f70976d.onClick();
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBVideoPlayerView$b */
    /* loaded from: classes7.dex */
    class RunnableC26862b implements Runnable {
        RunnableC26862b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVideoPlayerView.this.f70975c != null) {
                POBVideoPlayerView pOBVideoPlayerView = POBVideoPlayerView.this;
                pOBVideoPlayerView.setVideoSize(pOBVideoPlayerView.f70975c);
            }
        }
    }

    public POBVideoPlayerView(@NonNull Context context) {
        super(context);
        this.f70973a = 20000;
        this.f70982j = new View$OnClickListenerC26861a();
        this.f70974b = new SurfaceView(getContext());
        m39991a();
        this.f70980h = POBVideoPlayer.VideoPlayerState.UNKNOWN;
    }

    private void setPlayerState(@NonNull POBVideoPlayer.VideoPlayerState videoPlayerState) {
        this.f70980h = videoPlayerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSize(@NonNull POBPlayer pOBPlayer) {
        float videoWidth = pOBPlayer.getVideoWidth() / pOBPlayer.getVideoHeight();
        int width = getWidth();
        int height = getHeight();
        float f = width;
        float f2 = height;
        ViewGroup.LayoutParams layoutParams = this.f70974b.getLayoutParams();
        if (videoWidth > f / f2) {
            layoutParams.width = width;
            layoutParams.height = (int) (f / videoWidth);
        } else {
            layoutParams.width = (int) (videoWidth * f2);
            layoutParams.height = height;
        }
        this.f70974b.setLayoutParams(layoutParams);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void destroy() {
        removeAllViews();
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null) {
            pOBPlayer.destroy();
            this.f70975c = null;
        }
        this.f70976d = null;
        this.f70977e = null;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    @Nullable
    public POBPlayerController getControllerView() {
        return this.f70977e;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public int getMediaDuration() {
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null) {
            return pOBPlayer.getDuration();
        }
        return 0;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    @NonNull
    public POBVideoPlayer.VideoPlayerState getPlayerState() {
        return this.f70980h;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public boolean isMute() {
        return this.f70979g;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void load(@NonNull String str) {
        POBMediaPlayer pOBMediaPlayer = new POBMediaPlayer(str, new Handler(Looper.getMainLooper()));
        this.f70975c = pOBMediaPlayer;
        pOBMediaPlayer.setPlayerListener(this);
        this.f70975c.setPrepareTimeout(this.f70973a);
        this.f70975c.setStallTimeout(15000);
        this.f70981i = false;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void mute() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onMute(true);
        }
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null) {
            this.f70979g = true;
            pOBPlayer.setVolume(0, 0);
            return;
        }
        POBLog.warn("POBVideoPlayerView", "Media player is null", new Object[0]);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onBufferUpdate(int i) {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onBufferUpdate(i);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onCompletion() {
        setPlayerState(POBVideoPlayer.VideoPlayerState.COMPLETE);
        POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onProgressUpdate(getMediaDuration());
            this.f70976d.onCompletion();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        POBLog.info("POBVideoPlayerView", "onConfigurationChanged", new Object[0]);
        postDelayed(new RunnableC26862b(), 5L);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onFailure(int i, @NonNull String str) {
        m39989a(i, str);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onPause() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onPause();
        }
        POBPlayerController pOBPlayerController = this.f70977e;
        if (pOBPlayerController != null) {
            pOBPlayerController.onPause();
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onPrepared() {
        POBPlayer pOBPlayer;
        if (this.f70976d != null) {
            if (this.f70979g && (pOBPlayer = this.f70975c) != null) {
                pOBPlayer.setVolume(0, 0);
            }
            setPlayerState(POBVideoPlayer.VideoPlayerState.LOADED);
            this.f70976d.onReadyToPlay(this);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onProgressUpdate(int i) {
        m39990a(i);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onResume() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
        if (pOBVideoPlayerListener != null && this.f70980h == POBVideoPlayer.VideoPlayerState.PAUSED) {
            pOBVideoPlayerListener.onResume();
        }
        setPlayerState(POBVideoPlayer.VideoPlayerState.PLAYING);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onStart() {
        if (!this.f70981i) {
            m39986b();
            this.f70981i = true;
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onStop() {
        setPlayerState(POBVideoPlayer.VideoPlayerState.STOPPED);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void pause() {
        if (this.f70975c != null && this.f70980h == POBVideoPlayer.VideoPlayerState.PLAYING) {
            setPlayerState(POBVideoPlayer.VideoPlayerState.PAUSED);
            this.f70975c.pause();
            return;
        }
        POBLog.warn("POBVideoPlayerView", "mediaPlayer :" + this.f70975c, new Object[0]);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void play() {
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null && this.f70980h != POBVideoPlayer.VideoPlayerState.ERROR) {
            pOBPlayer.start();
            return;
        }
        POBLog.warn("POBVideoPlayerView", "mediaPlayer :" + ((Object) null), new Object[0]);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void playOnMute(boolean z) {
        this.f70979g = z;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setAutoPlayOnForeground(boolean z) {
        this.f70978f = z;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setControllerView(@NonNull POBPlayerController pOBPlayerController, @NonNull FrameLayout.LayoutParams layoutParams) {
        this.f70977e = pOBPlayerController;
        pOBPlayerController.setVideoPlayerEvents(this);
        addView(pOBPlayerController, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFSCEnabled(boolean z) {
        View.OnClickListener onClickListener;
        if (z) {
            onClickListener = this.f70982j;
        } else {
            onClickListener = null;
        }
        setOnClickListener(onClickListener);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setListener(@NonNull POBVideoPlayerListener pOBVideoPlayerListener) {
        this.f70976d = pOBVideoPlayerListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setPrepareTimeout(int i) {
        this.f70973a = i;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void stop() {
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null) {
            pOBPlayer.stop();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null && this.f70980h != POBVideoPlayer.VideoPlayerState.ERROR) {
            setVideoSize(pOBPlayer);
            this.f70975c.onSurfaceCreated(surfaceHolder.getSurface());
            if (this.f70978f && this.f70980h != POBVideoPlayer.VideoPlayerState.COMPLETE) {
                play();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        if (this.f70980h != POBVideoPlayer.VideoPlayerState.ERROR) {
            pause();
        }
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null) {
            pOBPlayer.onSurfaceDestroyed(surfaceHolder.getSurface());
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void unMute() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onMute(false);
        }
        POBPlayer pOBPlayer = this.f70975c;
        if (pOBPlayer != null) {
            this.f70979g = false;
            pOBPlayer.setVolume(1, 1);
            return;
        }
        POBLog.warn("POBVideoPlayerView", "Media player is null", new Object[0]);
    }

    /* renamed from: b */
    private void m39986b() {
        POBPlayerController pOBPlayerController = this.f70977e;
        if (pOBPlayerController != null) {
            pOBPlayerController.onStart();
        }
        POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onStart();
        }
    }

    /* renamed from: a */
    private void m39991a() {
        this.f70974b.getHolder().addCallback(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f70974b, layoutParams);
        setBackgroundColor(getResources().getColor(17170444));
    }

    /* renamed from: a */
    private void m39989a(int i, @NonNull String str) {
        POBVideoPlayer.VideoPlayerState videoPlayerState = this.f70980h;
        POBVideoPlayer.VideoPlayerState videoPlayerState2 = POBVideoPlayer.VideoPlayerState.ERROR;
        if (videoPlayerState != videoPlayerState2) {
            setPlayerState(videoPlayerState2);
            POBLog.error("POBVideoPlayerView", "errorCode: " + i + ", errorMsg:" + str, new Object[0]);
            POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
            if (pOBVideoPlayerListener != null) {
                if (i != -1) {
                    i = -2;
                }
                pOBVideoPlayerListener.onFailure(i, str);
            }
        }
    }

    /* renamed from: a */
    private void m39990a(int i) {
        if (this.f70975c != null) {
            POBPlayerController pOBPlayerController = this.f70977e;
            if (pOBPlayerController != null) {
                pOBPlayerController.onProgressUpdate(i);
            }
            POBVideoPlayerListener pOBVideoPlayerListener = this.f70976d;
            if (pOBVideoPlayerListener != null) {
                pOBVideoPlayerListener.onProgressUpdate(i);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
