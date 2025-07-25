package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.AudioFocusManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes9.dex */
public final class AudioFocusManager {
    private static final int AUDIOFOCUS_GAIN = 1;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final int AUDIOFOCUS_NONE = 0;
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 1;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 3;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 0;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    @Nullable
    private AudioAttributes audioAttributes;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private int focusGainToRequest;
    private final C35972a focusListener;
    @Nullable
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier = 1.0f;
    private int audioFocusState = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface PlayerCommand {
    }

    /* loaded from: classes9.dex */
    public interface PlayerControl {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f);
    }

    /* renamed from: io.bidmachine.media3.exoplayer.AudioFocusManager$a */
    /* loaded from: classes9.dex */
    public class C35972a implements AudioManager.OnAudioFocusChangeListener {
        private final Handler eventHandler;

        public C35972a(Handler handler) {
            AudioFocusManager.this = r1;
            this.eventHandler = handler;
        }

        public /* synthetic */ void lambda$onAudioFocusChange$0(int i) {
            AudioFocusManager.this.handlePlatformAudioFocusChange(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.eventHandler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.a
                {
                    AudioFocusManager.C35972a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager.C35972a.this.lambda$onAudioFocusChange$0(i);
                }
            });
        }
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        this.audioManager = (AudioManager) Assertions.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.playerControl = playerControl;
        this.focusListener = new C35972a(handler);
    }

    private void abandonAudioFocusDefault() {
        this.audioManager.abandonAudioFocus(this.focusListener);
    }

    private void abandonAudioFocusIfHeld() {
        if (this.audioFocusState == 0) {
            return;
        }
        if (Util.SDK_INT >= 26) {
            abandonAudioFocusV26();
        } else {
            abandonAudioFocusDefault();
        }
        setAudioFocusState(0);
    }

    @RequiresApi(26)
    private void abandonAudioFocusV26() {
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null) {
            this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int convertAudioAttributesToFocusGain(@Nullable AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.usage) {
            case 0:
                Log.m19945w(TAG, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                Log.m19945w(TAG, "Unidentified audio usage: " + audioAttributes.usage);
                return 0;
            case 16:
                if (Util.SDK_INT < 19) {
                    return 2;
                }
                return 4;
        }
        return 3;
    }

    private void executePlayerCommand(int i) {
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i);
        }
    }

    public void handlePlatformAudioFocusChange(int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i != 1) {
                    Log.m19945w(TAG, "Unknown focus change type: " + i);
                    return;
                }
                setAudioFocusState(1);
                executePlayerCommand(1);
                return;
            }
            executePlayerCommand(-1);
            abandonAudioFocusIfHeld();
        } else if (i != -2 && !willPauseWhenDucked()) {
            setAudioFocusState(3);
        } else {
            executePlayerCommand(0);
            setAudioFocusState(2);
        }
    }

    private int requestAudioFocus() {
        int requestAudioFocusDefault;
        if (this.audioFocusState == 1) {
            return 1;
        }
        if (Util.SDK_INT >= 26) {
            requestAudioFocusDefault = requestAudioFocusV26();
        } else {
            requestAudioFocusDefault = requestAudioFocusDefault();
        }
        if (requestAudioFocusDefault == 1) {
            setAudioFocusState(1);
            return 1;
        }
        setAudioFocusState(0);
        return -1;
    }

    private int requestAudioFocusDefault() {
        return this.audioManager.requestAudioFocus(this.focusListener, Util.getStreamTypeForAudioUsage(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).usage), this.focusGainToRequest);
    }

    @RequiresApi(26)
    private int requestAudioFocusV26() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || this.rebuildAudioFocusRequest) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.focusGainToRequest);
            } else {
                builder = new AudioFocusRequest.Builder(this.audioFocusRequest);
            }
            boolean willPauseWhenDucked2 = willPauseWhenDucked();
            audioAttributes = builder.setAudioAttributes(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).getAudioAttributesV21().audioAttributes);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(willPauseWhenDucked2);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.focusListener);
            build = onAudioFocusChangeListener.build();
            this.audioFocusRequest = build;
            this.rebuildAudioFocusRequest = false;
        }
        requestAudioFocus = this.audioManager.requestAudioFocus(this.audioFocusRequest);
        return requestAudioFocus;
    }

    private void setAudioFocusState(int i) {
        float f;
        if (this.audioFocusState == i) {
            return;
        }
        this.audioFocusState = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.volumeMultiplier == f) {
            return;
        }
        this.volumeMultiplier = f;
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f);
        }
    }

    private boolean shouldAbandonAudioFocusIfHeld(int i) {
        if (i == 1 || this.focusGainToRequest != 1) {
            return true;
        }
        return false;
    }

    private boolean willPauseWhenDucked() {
        AudioAttributes audioAttributes = this.audioAttributes;
        if (audioAttributes != null && audioAttributes.contentType == 1) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    AudioManager.OnAudioFocusChangeListener getFocusListener() {
        return this.focusListener;
    }

    public float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public void release() {
        this.playerControl = null;
        abandonAudioFocusIfHeld();
    }

    public void setAudioAttributes(@Nullable AudioAttributes audioAttributes) {
        if (!Util.areEqual(this.audioAttributes, audioAttributes)) {
            this.audioAttributes = audioAttributes;
            int convertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(audioAttributes);
            this.focusGainToRequest = convertAudioAttributesToFocusGain;
            boolean z = true;
            if (convertAudioAttributesToFocusGain != 1 && convertAudioAttributesToFocusGain != 0) {
                z = false;
            }
            Assertions.checkArgument(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int updateAudioFocus(boolean z, int i) {
        if (shouldAbandonAudioFocusIfHeld(i)) {
            abandonAudioFocusIfHeld();
            if (!z) {
                return -1;
            }
            return 1;
        } else if (!z) {
            return -1;
        } else {
            return requestAudioFocus();
        }
    }
}
