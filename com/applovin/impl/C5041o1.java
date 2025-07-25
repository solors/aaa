package com.applovin.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.impl.C5041o1;

/* renamed from: com.applovin.impl.o1 */
/* loaded from: classes2.dex */
public final class C5041o1 {

    /* renamed from: a */
    private final AudioManager f8695a;

    /* renamed from: b */
    private final C5042a f8696b;

    /* renamed from: c */
    private InterfaceC5043b f8697c;

    /* renamed from: d */
    private C4743l1 f8698d;

    /* renamed from: f */
    private int f8700f;

    /* renamed from: h */
    private AudioFocusRequest f8702h;

    /* renamed from: i */
    private boolean f8703i;

    /* renamed from: g */
    private float f8701g = 1.0f;

    /* renamed from: e */
    private int f8699e = 0;

    /* renamed from: com.applovin.impl.o1$a */
    /* loaded from: classes2.dex */
    public class C5042a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f8704a;

        public C5042a(Handler handler) {
            C5041o1.this = r1;
            this.f8704a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f8704a.post(new Runnable() { // from class: com.applovin.impl.zz
                {
                    C5041o1.C5042a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5041o1.C5042a.this.m96884a(i);
                }
            });
        }

        /* renamed from: a */
        public /* synthetic */ void m96884a(int i) {
            C5041o1.this.m96895b(i);
        }
    }

    /* renamed from: com.applovin.impl.o1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5043b {
        /* renamed from: b */
        void mo96882b(float f);

        /* renamed from: f */
        void mo96881f(int i);
    }

    public C5041o1(Context context, Handler handler, InterfaceC5043b interfaceC5043b) {
        this.f8695a = (AudioManager) AbstractC4100b1.m100583a((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f8697c = interfaceC5043b;
        this.f8696b = new C5042a(handler);
    }

    /* renamed from: a */
    private void m96901a() {
        this.f8695a.abandonAudioFocus(this.f8696b);
    }

    /* renamed from: b */
    private void m96896b() {
        if (this.f8699e == 0) {
            return;
        }
        if (AbstractC5863xp.f12151a >= 26) {
            m96893c();
        } else {
            m96901a();
        }
        m96892c(0);
    }

    /* renamed from: c */
    private void m96893c() {
        AudioFocusRequest audioFocusRequest = this.f8702h;
        if (audioFocusRequest != null) {
            this.f8695a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: f */
    private int m96888f() {
        int m96887g;
        if (this.f8699e == 1) {
            return 1;
        }
        if (AbstractC5863xp.f12151a >= 26) {
            m96887g = m96886h();
        } else {
            m96887g = m96887g();
        }
        if (m96887g == 1) {
            m96892c(1);
            return 1;
        }
        m96892c(0);
        return -1;
    }

    /* renamed from: g */
    private int m96887g() {
        return this.f8695a.requestAudioFocus(this.f8696b, AbstractC5863xp.m92964e(((C4743l1) AbstractC4100b1.m100583a(this.f8698d)).f7608c), this.f8700f);
    }

    /* renamed from: h */
    private int m96886h() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f8702h;
        if (audioFocusRequest == null || this.f8703i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f8700f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f8702h);
            }
            boolean m96885i = m96885i();
            audioAttributes = builder.setAudioAttributes(((C4743l1) AbstractC4100b1.m100583a(this.f8698d)).m97880a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(m96885i);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f8696b);
            build = onAudioFocusChangeListener.build();
            this.f8702h = build;
            this.f8703i = false;
        }
        requestAudioFocus = this.f8695a.requestAudioFocus(this.f8702h);
        return requestAudioFocus;
    }

    /* renamed from: i */
    private boolean m96885i() {
        C4743l1 c4743l1 = this.f8698d;
        if (c4743l1 != null && c4743l1.f7606a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public float m96891d() {
        return this.f8701g;
    }

    /* renamed from: e */
    public void m96889e() {
        this.f8697c = null;
        m96896b();
    }

    /* renamed from: d */
    private boolean m96890d(int i) {
        return i == 1 || this.f8700f != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static int m96899a(C4743l1 c4743l1) {
        if (c4743l1 == null) {
            return 0;
        }
        switch (c4743l1.f7608c) {
            case 0:
                AbstractC5063oc.m96800d("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (c4743l1.f7606a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                AbstractC5063oc.m96800d("AudioFocusManager", "Unidentified audio usage: " + c4743l1.f7608c);
                return 0;
            case 16:
                return AbstractC5863xp.f12151a >= 19 ? 4 : 2;
        }
        return 3;
    }

    /* renamed from: c */
    private void m96892c(int i) {
        if (this.f8699e == i) {
            return;
        }
        this.f8699e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f8701g == f) {
            return;
        }
        this.f8701g = f;
        InterfaceC5043b interfaceC5043b = this.f8697c;
        if (interfaceC5043b != null) {
            interfaceC5043b.mo96882b(f);
        }
    }

    /* renamed from: b */
    public void m96895b(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !m96885i()) {
                m96892c(3);
                return;
            }
            m96900a(0);
            m96892c(2);
        } else if (i == -1) {
            m96900a(-1);
            m96896b();
        } else if (i != 1) {
            AbstractC5063oc.m96800d("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            m96892c(1);
            m96900a(1);
        }
    }

    /* renamed from: a */
    private void m96900a(int i) {
        InterfaceC5043b interfaceC5043b = this.f8697c;
        if (interfaceC5043b != null) {
            interfaceC5043b.mo96881f(i);
        }
    }

    /* renamed from: a */
    public int m96897a(boolean z, int i) {
        if (m96890d(i)) {
            m96896b();
            return z ? 1 : -1;
        } else if (z) {
            return m96888f();
        } else {
            return -1;
        }
    }

    /* renamed from: b */
    public void m96894b(C4743l1 c4743l1) {
        if (AbstractC5863xp.m93016a(this.f8698d, c4743l1)) {
            return;
        }
        this.f8698d = c4743l1;
        int m96899a = m96899a(c4743l1);
        this.f8700f = m96899a;
        boolean z = true;
        if (m96899a != 1 && m96899a != 0) {
            z = false;
        }
        AbstractC4100b1.m100579a(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }
}
