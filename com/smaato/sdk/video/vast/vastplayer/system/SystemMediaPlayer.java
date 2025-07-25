package com.smaato.sdk.video.vast.vastplayer.system;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.vastplayer.MediaPlayerAction;
import com.smaato.sdk.video.vast.vastplayer.MediaPlayerState;
import com.smaato.sdk.video.vast.vastplayer.MediaPlayerTransition;
import com.smaato.sdk.video.vast.vastplayer.VideoPlayer;
import com.smaato.sdk.video.vast.vastplayer.exception.VideoPlayerException;
import java.io.IOException;

/* loaded from: classes7.dex */
public class SystemMediaPlayer implements VideoPlayer {
    @Nullable
    AudioManager audioManager;
    @NonNull
    private final Context context;
    @Nullable
    private VideoPlayer.LifecycleListener lifecycleListener;
    @NonNull
    private final Logger logger;
    @NonNull
    private final MediaPlayer mediaPlayer;
    @NonNull
    private final EventValidator<MediaPlayerAction, MediaPlayerState> mediaPlayerActionsValidator;
    @NonNull
    private final StateMachine<MediaPlayerTransition, MediaPlayerState> mediaPlayerStatMachine;
    @NonNull
    private final EventValidator<MediaPlayerTransition, MediaPlayerState> mediaPlayerTransitionsValidator;
    @Nullable
    private VideoPlayer.PrepareListener prepareListener;
    @Nullable
    private VideoPlayer.OnVolumeChangeListener volumeChangeListener;
    private float currentVolume = -1.0f;
    private long videoPausedAt = 0;
    boolean isCompleted = false;

    /* renamed from: com.smaato.sdk.video.vast.vastplayer.system.SystemMediaPlayer$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C28071a {

        /* renamed from: a */
        static final /* synthetic */ int[] f72976a;

        static {
            int[] iArr = new int[MediaPlayerState.values().length];
            f72976a = iArr;
            try {
                iArr[MediaPlayerState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72976a[MediaPlayerState.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72976a[MediaPlayerState.PREPARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72976a[MediaPlayerState.PREPARED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72976a[MediaPlayerState.STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72976a[MediaPlayerState.RESUMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72976a[MediaPlayerState.PAUSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f72976a[MediaPlayerState.STOPPED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f72976a[MediaPlayerState.PLAYBACK_COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f72976a[MediaPlayerState.ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f72976a[MediaPlayerState.END.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public SystemMediaPlayer(@NonNull Context context, @NonNull MediaPlayer mediaPlayer, @NonNull StateMachine<MediaPlayerTransition, MediaPlayerState> stateMachine, @NonNull EventValidator<MediaPlayerAction, MediaPlayerState> eventValidator, @NonNull EventValidator<MediaPlayerTransition, MediaPlayerState> eventValidator2, @Nullable AudioManager audioManager, @Nullable Logger logger) {
        this.context = (Context) Objects.requireNonNull(context, "Parameter context should not be null for SystemMediaPlayer::new");
        this.mediaPlayer = (MediaPlayer) Objects.requireNonNull(mediaPlayer, "Parameter mediaPlayer should not be null for SystemMediaPlayer::new");
        this.mediaPlayerStatMachine = (StateMachine) Objects.requireNonNull(stateMachine, "Parameter mediaPlayerStatMachine should not be null for SystemMediaPlayer::new");
        this.mediaPlayerActionsValidator = (EventValidator) Objects.requireNonNull(eventValidator, "Parameter mediaPlayerActionsValidator should not be null for SystemMediaPlayer::new");
        this.mediaPlayerTransitionsValidator = (EventValidator) Objects.requireNonNull(eventValidator2, "Parameter mediaPlayerTransitionsValidator should not be null for SystemMediaPlayer::new");
        this.logger = (Logger) Objects.requireNonNull(logger, "Parameter logger should not be null for SystemMediaPlayer::new");
        this.audioManager = audioManager;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.smaato.sdk.video.vast.vastplayer.system.c
            {
                SystemMediaPlayer.this = this;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                SystemMediaPlayer.this.onCompletion(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.smaato.sdk.video.vast.vastplayer.system.d
            {
                SystemMediaPlayer.this = this;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                boolean onError;
                onError = SystemMediaPlayer.this.onError(mediaPlayer2, i, i2);
                return onError;
            }
        });
        mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.smaato.sdk.video.vast.vastplayer.system.e
            {
                SystemMediaPlayer.this = this;
            }

            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                boolean onInfo;
                onInfo = SystemMediaPlayer.this.onInfo(mediaPlayer2, i, i2);
                return onInfo;
            }
        });
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.smaato.sdk.video.vast.vastplayer.system.f
            {
                SystemMediaPlayer.this = this;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                SystemMediaPlayer.this.onPrepared(mediaPlayer2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.smaato.sdk.video.vast.vastplayer.system.g
            {
                SystemMediaPlayer.this = this;
            }

            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                SystemMediaPlayer.this.onSeekComplete(mediaPlayer2);
            }
        });
        stateMachine.addListener(new StateMachine.Listener() { // from class: com.smaato.sdk.video.vast.vastplayer.system.h
            {
                SystemMediaPlayer.this = this;
            }

            @Override // com.smaato.sdk.core.util.StateMachine.Listener
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                SystemMediaPlayer.this.onStateChanged((MediaPlayerState) obj, (MediaPlayerState) obj2, metadata);
            }
        });
    }

    private boolean isValidStateForAction(@NonNull MediaPlayerAction mediaPlayerAction) {
        MediaPlayerState currentState = this.mediaPlayerStatMachine.getCurrentState();
        if (this.mediaPlayerActionsValidator.isValid(mediaPlayerAction, currentState)) {
            return true;
        }
        this.logger.error(LogDomain.VAST, "Invalid MediaPlayer state: %s, for action: %s ", currentState, mediaPlayerAction);
        return false;
    }

    private boolean isValidStateForTransition(@NonNull MediaPlayerTransition mediaPlayerTransition) {
        MediaPlayerState currentState = this.mediaPlayerStatMachine.getCurrentState();
        if (this.mediaPlayerTransitionsValidator.isValid(mediaPlayerTransition, currentState)) {
            return true;
        }
        this.logger.error(LogDomain.VAST, "Invalid MediaPlayer state: %s, for transition: %s ", currentState, mediaPlayerTransition);
        return false;
    }

    public /* synthetic */ void lambda$setVolume$0(VideoPlayer.OnVolumeChangeListener onVolumeChangeListener) {
        onVolumeChangeListener.onVolumeChanged(this.currentVolume);
    }

    public void onCompletion(@NonNull MediaPlayer mediaPlayer) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.ON_COMPLETE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        } else {
            this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
        }
    }

    public boolean onError(@NonNull MediaPlayer mediaPlayer, int i, int i2) {
        this.logger.error(LogDomain.VAST, "MediaPlayer Error: [what: %d, extra: %d]; For more details check android.media.MediaPlayer error codes", Integer.valueOf(i), Integer.valueOf(i2));
        this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR, MetadataMapperUtils.m38534b(i, i2));
        return true;
    }

    public boolean onInfo(@NonNull MediaPlayer mediaPlayer, int i, int i2) {
        this.logger.info(LogDomain.VAST, "MediaPlayer Info: [what: %d, extra: %d]; For more details check android.media.MediaPlayer info codes", Integer.valueOf(i), Integer.valueOf(i2));
        return false;
    }

    public void onPrepared(@NonNull MediaPlayer mediaPlayer) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.ON_PREPARED;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        } else {
            this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
        }
    }

    public void onSeekComplete(@NonNull MediaPlayer mediaPlayer) {
        if (isValidStateForAction(MediaPlayerAction.SEEK_TO) && this.lifecycleListener != null) {
            if (!this.isCompleted) {
                mediaPlayer.start();
            }
            this.lifecycleListener.onSeekComplete(this);
        }
    }

    public void onStateChanged(@NonNull MediaPlayerState mediaPlayerState, @NonNull MediaPlayerState mediaPlayerState2, @Nullable Metadata metadata) {
        switch (C28071a.f72976a[mediaPlayerState2.ordinal()]) {
            case 1:
                VideoPlayer.LifecycleListener lifecycleListener = this.lifecycleListener;
                if (lifecycleListener != null) {
                    lifecycleListener.onReset(this);
                    return;
                }
                return;
            case 2:
                VideoPlayer.PrepareListener prepareListener = this.prepareListener;
                if (prepareListener != null) {
                    prepareListener.onInitialized(this);
                    return;
                }
                return;
            case 3:
                VideoPlayer.PrepareListener prepareListener2 = this.prepareListener;
                if (prepareListener2 != null) {
                    prepareListener2.onPreparing(this);
                    return;
                }
                return;
            case 4:
                VideoPlayer.PrepareListener prepareListener3 = this.prepareListener;
                if (prepareListener3 != null) {
                    prepareListener3.onPrepared(this);
                    return;
                }
                return;
            case 5:
                VideoPlayer.LifecycleListener lifecycleListener2 = this.lifecycleListener;
                if (lifecycleListener2 != null) {
                    lifecycleListener2.onStarted(this);
                    return;
                }
                return;
            case 6:
                VideoPlayer.LifecycleListener lifecycleListener3 = this.lifecycleListener;
                if (lifecycleListener3 != null) {
                    lifecycleListener3.onResumed(this);
                    return;
                }
                return;
            case 7:
                VideoPlayer.LifecycleListener lifecycleListener4 = this.lifecycleListener;
                if (lifecycleListener4 != null) {
                    lifecycleListener4.onPaused(this);
                    return;
                }
                return;
            case 8:
                VideoPlayer.LifecycleListener lifecycleListener5 = this.lifecycleListener;
                if (lifecycleListener5 != null) {
                    lifecycleListener5.onStopped(this);
                    return;
                }
                return;
            case 9:
                VideoPlayer.LifecycleListener lifecycleListener6 = this.lifecycleListener;
                if (lifecycleListener6 != null) {
                    lifecycleListener6.onCompleted(this);
                    return;
                }
                return;
            case 10:
                VideoPlayerException m38533c = MetadataMapperUtils.m38533c(metadata);
                VideoPlayer.LifecycleListener lifecycleListener7 = this.lifecycleListener;
                if (lifecycleListener7 != null) {
                    lifecycleListener7.onError(this, m38533c);
                }
                VideoPlayer.PrepareListener prepareListener4 = this.prepareListener;
                if (prepareListener4 != null) {
                    prepareListener4.onError(this, m38533c);
                    return;
                }
                return;
            case 11:
                VideoPlayer.LifecycleListener lifecycleListener8 = this.lifecycleListener;
                if (lifecycleListener8 != null) {
                    lifecycleListener8.onReleased(this);
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException(String.format("Unexpected MediaPlayerState: %s", mediaPlayerState2));
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public long getCurrentPositionMillis() {
        if (isValidStateForAction(MediaPlayerAction.GET_CURRENT_POSITION)) {
            return this.mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public float getCurrentVolume() {
        return this.currentVolume;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public long getDuration() {
        if (isValidStateForAction(MediaPlayerAction.GET_DURATION)) {
            return this.mediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public int getMediaHeight() {
        return this.mediaPlayer.getVideoHeight();
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public int getMediaWidth() {
        return this.mediaPlayer.getVideoWidth();
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public int getRingerMode() {
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return 0;
    }

    @NonNull
    public MediaPlayerState getState() {
        return this.mediaPlayerStatMachine.getCurrentState();
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void isCompleted(boolean z) {
        this.isCompleted = z;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void pause() {
        long currentPositionMillis;
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.PAUSE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.pause();
            if (this.isCompleted) {
                currentPositionMillis = getDuration();
            } else {
                currentPositionMillis = getCurrentPositionMillis();
            }
            this.videoPausedAt = currentPositionMillis;
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void prepare() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.PREPARE_ASYNC;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            try {
                this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
                this.mediaPlayer.prepare();
            } catch (IOException e) {
                this.logger.error(LogDomain.VAST, "Unable to prepare DataSource for MediaPlayer. Exception %s", e);
                this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
            }
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void release() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RELEASE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.release();
            this.mediaPlayer.setOnCompletionListener(null);
            this.mediaPlayer.setOnErrorListener(null);
            this.mediaPlayer.setOnInfoListener(null);
            this.mediaPlayer.setOnPreparedListener(null);
            this.mediaPlayer.setOnSeekCompleteListener(null);
            this.volumeChangeListener = null;
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
            this.mediaPlayerStatMachine.deleteListeners();
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void reset() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RESET;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.reset();
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void seekTo(long j) {
        if (this.isCompleted) {
            j = getDuration() - 100;
        }
        if (isValidStateForAction(MediaPlayerAction.SEEK_TO)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mediaPlayer.seekTo(j, 3);
            } else {
                this.mediaPlayer.seekTo((int) j);
            }
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void setDataSource(@NonNull Uri uri) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.SET_DATA_SOURCE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            try {
                this.mediaPlayer.setDataSource(this.context, uri);
                this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                this.logger.error(LogDomain.VAST, "Unable to set DataSource uri:[%s] to MediaPlayer. Exception %s", uri, e);
                this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
            }
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void setLifecycleListener(@Nullable VideoPlayer.LifecycleListener lifecycleListener) {
        this.lifecycleListener = lifecycleListener;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void setOnVolumeChangeListener(@Nullable VideoPlayer.OnVolumeChangeListener onVolumeChangeListener) {
        this.volumeChangeListener = onVolumeChangeListener;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void setPrepareListener(@Nullable VideoPlayer.PrepareListener prepareListener) {
        this.prepareListener = prepareListener;
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void setSurface(@Nullable Surface surface) {
        if (isValidStateForAction(MediaPlayerAction.SET_SURFACE)) {
            this.mediaPlayer.setSurface(surface);
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void setVolume(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        boolean z;
        if (Math.abs(f - this.currentVolume) > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && isValidStateForAction(MediaPlayerAction.SET_VOLUME)) {
            this.mediaPlayer.setVolume(f, f);
            this.currentVolume = f;
            Objects.onNotNull(this.volumeChangeListener, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.system.b
                {
                    SystemMediaPlayer.this = this;
                }

                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    SystemMediaPlayer.this.lambda$setVolume$0((VideoPlayer.OnVolumeChangeListener) obj);
                }
            });
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void start() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.START;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            long j = this.videoPausedAt;
            if (j > 0) {
                seekTo(j);
            } else {
                this.mediaPlayer.start();
            }
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void stop() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.stop();
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    @Override // com.smaato.sdk.video.vast.vastplayer.VideoPlayer
    public void setDataSource(@NonNull String str) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.SET_DATA_SOURCE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            try {
                this.mediaPlayer.setDataSource(str);
                this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                this.logger.error(LogDomain.VAST, "Unable to set DataSource path:[%s] to MediaPlayer. Exception %s", str, e);
                this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
            }
        }
    }
}
