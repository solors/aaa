package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
public final class AudioFocusManager {
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;

    /* renamed from: a */
    private final AudioManager f31337a;

    /* renamed from: b */
    private final AudioFocusListener f31338b;
    @Nullable

    /* renamed from: c */
    private PlayerControl f31339c;
    @Nullable

    /* renamed from: d */
    private AudioAttributes f31340d;

    /* renamed from: f */
    private int f31342f;

    /* renamed from: h */
    private AudioFocusRequest f31344h;

    /* renamed from: i */
    private boolean f31345i;

    /* renamed from: g */
    private float f31343g = 1.0f;

    /* renamed from: e */
    private int f31341e = 0;

    /* loaded from: classes4.dex */
    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: b */
        private final Handler f31346b;

        public AudioFocusListener(Handler handler) {
            AudioFocusManager.this = r1;
            this.f31346b = handler;
        }

        /* renamed from: b */
        public /* synthetic */ void m76113b(int i) {
            AudioFocusManager.this.m76121g(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f31346b.post(new Runnable() { // from class: com.google.android.exoplayer2.a
                {
                    AudioFocusManager.AudioFocusListener.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager.AudioFocusListener.this.m76113b(i);
                }
            });
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PlayerCommand {
    }

    /* loaded from: classes4.dex */
    public interface PlayerControl {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f);
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        this.f31337a = (AudioManager) Assertions.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f31339c = playerControl;
        this.f31338b = new AudioFocusListener(handler);
    }

    /* renamed from: a */
    private void m76127a() {
        this.f31337a.abandonAudioFocus(this.f31338b);
    }

    /* renamed from: b */
    private void m76126b() {
        if (this.f31341e == 0) {
            return;
        }
        if (Util.SDK_INT >= 26) {
            m76125c();
        } else {
            m76127a();
        }
        m76117k(0);
    }

    @RequiresApi(26)
    /* renamed from: c */
    private void m76125c() {
        AudioFocusRequest audioFocusRequest = this.f31344h;
        if (audioFocusRequest != null) {
            this.f31337a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static int m76123e(@Nullable AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.usage) {
            case 0:
                Log.m72602w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                Log.m72602w("AudioFocusManager", "Unidentified audio usage: " + audioAttributes.usage);
                return 0;
            case 16:
                if (Util.SDK_INT < 19) {
                    return 2;
                }
                return 4;
        }
        return 3;
    }

    /* renamed from: f */
    private void m76122f(int i) {
        PlayerControl playerControl = this.f31339c;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i);
        }
    }

    /* renamed from: g */
    public void m76121g(int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i != 1) {
                    Log.m72602w("AudioFocusManager", "Unknown focus change type: " + i);
                    return;
                }
                m76117k(1);
                m76122f(1);
                return;
            }
            m76122f(-1);
            m76126b();
        } else if (i != -2 && !m76115m()) {
            m76117k(3);
        } else {
            m76122f(0);
            m76117k(2);
        }
    }

    /* renamed from: h */
    private int m76120h() {
        int m76119i;
        if (this.f31341e == 1) {
            return 1;
        }
        if (Util.SDK_INT >= 26) {
            m76119i = m76118j();
        } else {
            m76119i = m76119i();
        }
        if (m76119i == 1) {
            m76117k(1);
            return 1;
        }
        m76117k(0);
        return -1;
    }

    /* renamed from: i */
    private int m76119i() {
        return this.f31337a.requestAudioFocus(this.f31338b, Util.getStreamTypeForAudioUsage(((AudioAttributes) Assertions.checkNotNull(this.f31340d)).usage), this.f31342f);
    }

    @RequiresApi(26)
    /* renamed from: j */
    private int m76118j() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f31344h;
        if (audioFocusRequest == null || this.f31345i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f31342f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f31344h);
            }
            boolean m76115m = m76115m();
            audioAttributes = builder.setAudioAttributes(((AudioAttributes) Assertions.checkNotNull(this.f31340d)).getAudioAttributesV21().audioAttributes);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(m76115m);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f31338b);
            build = onAudioFocusChangeListener.build();
            this.f31344h = build;
            this.f31345i = false;
        }
        requestAudioFocus = this.f31337a.requestAudioFocus(this.f31344h);
        return requestAudioFocus;
    }

    /* renamed from: k */
    private void m76117k(int i) {
        float f;
        if (this.f31341e == i) {
            return;
        }
        this.f31341e = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.f31343g == f) {
            return;
        }
        this.f31343g = f;
        PlayerControl playerControl = this.f31339c;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f);
        }
    }

    /* renamed from: l */
    private boolean m76116l(int i) {
        if (i == 1 || this.f31342f != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m76115m() {
        AudioAttributes audioAttributes = this.f31340d;
        if (audioAttributes != null && audioAttributes.contentType == 1) {
            return true;
        }
        return false;
    }

    public float getVolumeMultiplier() {
        return this.f31343g;
    }

    public void release() {
        this.f31339c = null;
        m76126b();
    }

    public void setAudioAttributes(@Nullable AudioAttributes audioAttributes) {
        if (!Util.areEqual(this.f31340d, audioAttributes)) {
            this.f31340d = audioAttributes;
            int m76123e = m76123e(audioAttributes);
            this.f31342f = m76123e;
            boolean z = true;
            if (m76123e != 1 && m76123e != 0) {
                z = false;
            }
            Assertions.checkArgument(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int updateAudioFocus(boolean z, int i) {
        if (m76116l(i)) {
            m76126b();
            if (!z) {
                return -1;
            }
            return 1;
        } else if (!z) {
            return -1;
        } else {
            return m76120h();
        }
    }
}
