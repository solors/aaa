package com.p551my.target;

import android.content.Context;
import android.net.Uri;
import com.p551my.target.common.models.AudioData;
import com.p551my.target.instreamads.InstreamAudioAdPlayer;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.Stack;

/* renamed from: com.my.target.p2 */
/* loaded from: classes7.dex */
public class C25998p2 {

    /* renamed from: g */
    public InstreamAudioAdPlayer f67529g;

    /* renamed from: h */
    public InterfaceC26000b f67530h;

    /* renamed from: i */
    public C25704d5 f67531i;

    /* renamed from: j */
    public int f67532j;

    /* renamed from: k */
    public float f67533k;

    /* renamed from: m */
    public boolean f67535m;

    /* renamed from: f */
    public float f67528f = 1.0f;

    /* renamed from: l */
    public int f67534l = 10;

    /* renamed from: n */
    public int f67536n = 0;

    /* renamed from: a */
    public final C25999a f67523a = new C25999a();

    /* renamed from: b */
    public final C26252y8 f67524b = C26252y8.m42300a(200);

    /* renamed from: c */
    public final RunnableC26001c f67525c = new RunnableC26001c();

    /* renamed from: d */
    public final Stack f67526d = new Stack();

    /* renamed from: e */
    public final C26193w7 f67527e = C26193w7.m42574b();

    /* renamed from: com.my.target.p2$a */
    /* loaded from: classes7.dex */
    public class C25999a implements InstreamAudioAdPlayer.AdPlayerListener {

        /* renamed from: a */
        public float f67537a = 1.0f;

        public C25999a() {
        }

        @Override // com.p551my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioCompleted() {
            C25998p2 c25998p2 = C25998p2.this;
            if (c25998p2.f67536n != 2) {
                if (c25998p2.f67531i != null && c25998p2.f67530h != null) {
                    c25998p2.m43225a();
                    C25998p2 c25998p22 = C25998p2.this;
                    C25704d5 c25704d5 = c25998p22.f67531i;
                    c25998p22.f67531i = null;
                    if (c25704d5 != null) {
                        float duration = c25704d5.getDuration();
                        C25998p2.this.f67527e.m42581a(duration, duration);
                        C25998p2.this.f67527e.m42569e();
                        C25998p2.this.f67530h.mo42361a(c25704d5);
                    }
                }
                C25998p2.this.f67536n = 2;
            }
            C25998p2 c25998p23 = C25998p2.this;
            c25998p23.f67524b.m42297b(c25998p23.f67525c);
        }

        @Override // com.p551my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioError(String str) {
            InterfaceC26000b interfaceC26000b;
            InstreamAudioAdPlayer instreamAudioAdPlayer = C25998p2.this.f67529g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            C25998p2 c25998p2 = C25998p2.this;
            C25704d5 c25704d5 = c25998p2.f67531i;
            if (c25704d5 != null && (interfaceC26000b = c25998p2.f67530h) != null) {
                interfaceC26000b.mo42360a(str, c25704d5);
            }
            C25998p2.this.f67527e.m42567g();
            C25998p2 c25998p22 = C25998p2.this;
            c25998p22.f67524b.m42297b(c25998p22.f67525c);
        }

        @Override // com.p551my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioPaused() {
            Context m43214d = C25998p2.this.m43214d();
            C25998p2 c25998p2 = C25998p2.this;
            if (c25998p2.f67531i != null && m43214d != null) {
                c25998p2.f67527e.m42568f();
            }
            C25998p2 c25998p22 = C25998p2.this;
            c25998p22.f67524b.m42297b(c25998p22.f67525c);
        }

        @Override // com.p551my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioResumed() {
            Context m43214d = C25998p2.this.m43214d();
            C25998p2 c25998p2 = C25998p2.this;
            if (c25998p2.f67531i != null && m43214d != null) {
                c25998p2.f67527e.m42565i();
            }
            C25998p2 c25998p22 = C25998p2.this;
            c25998p22.f67524b.m42299a(c25998p22.f67525c);
        }

        @Override // com.p551my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStarted() {
            InstreamAudioAdPlayer instreamAudioAdPlayer;
            C25998p2 c25998p2 = C25998p2.this;
            c25998p2.f67536n = 1;
            if (!c25998p2.f67535m && (instreamAudioAdPlayer = c25998p2.f67529g) != null) {
                c25998p2.m43217b(instreamAudioAdPlayer.getAdAudioDuration());
            }
            C25998p2 c25998p22 = C25998p2.this;
            c25998p22.f67524b.m42299a(c25998p22.f67525c);
        }

        @Override // com.p551my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStopped() {
            C25998p2 c25998p2 = C25998p2.this;
            if (c25998p2.f67536n == 1) {
                if (c25998p2.f67531i != null && c25998p2.f67530h != null) {
                    c25998p2.f67527e.m42564j();
                    C25998p2 c25998p22 = C25998p2.this;
                    c25998p22.f67530h.mo42359b(c25998p22.f67531i);
                }
                C25998p2.this.f67536n = 0;
            }
            C25998p2 c25998p23 = C25998p2.this;
            c25998p23.f67524b.m42297b(c25998p23.f67525c);
        }

        @Override // com.p551my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onVolumeChanged(float f) {
            C26193w7 c26193w7;
            boolean z;
            float f2 = this.f67537a;
            if (f == f2) {
                return;
            }
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i > 0 && f <= 0.0f) {
                if (C25998p2.this.m43214d() != null) {
                    C25998p2 c25998p2 = C25998p2.this;
                    if (c25998p2.f67531i != null) {
                        c26193w7 = c25998p2.f67527e;
                        z = false;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i == 0 && f > 0.0f && C25998p2.this.m43214d() != null) {
                C25998p2 c25998p22 = C25998p2.this;
                if (c25998p22.f67531i != null) {
                    c26193w7 = c25998p22.f67527e;
                    z = true;
                } else {
                    return;
                }
            } else {
                return;
            }
            c26193w7.m42572b(z);
            this.f67537a = f;
            C25998p2.this.f67528f = f;
        }
    }

    /* renamed from: com.my.target.p2$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC26000b {
        /* renamed from: a */
        void mo42362a(float f, float f2, C25704d5 c25704d5);

        /* renamed from: a */
        void mo42361a(C25704d5 c25704d5);

        /* renamed from: a */
        void mo42360a(String str, C25704d5 c25704d5);

        /* renamed from: b */
        void mo42359b(C25704d5 c25704d5);

        /* renamed from: c */
        void mo42358c(C25704d5 c25704d5);
    }

    /* renamed from: com.my.target.p2$c */
    /* loaded from: classes7.dex */
    public class RunnableC26001c implements Runnable {
        public RunnableC26001c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C25998p2.this.m43225a();
        }
    }

    /* renamed from: h */
    public static C25998p2 m43210h() {
        return new C25998p2();
    }

    /* renamed from: a */
    public void m43225a() {
        float f;
        float f2;
        float f3;
        InstreamAudioAdPlayer instreamAudioAdPlayer;
        C25704d5 c25704d5 = this.f67531i;
        float duration = c25704d5 != null ? c25704d5.getDuration() : 0.0f;
        if (this.f67531i == null) {
            this.f67524b.m42297b(this.f67525c);
            return;
        }
        if (this.f67536n != 1 || (instreamAudioAdPlayer = this.f67529g) == null) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f = instreamAudioAdPlayer.getAdAudioDuration();
            f2 = this.f67529g.getAdAudioPosition();
            f3 = duration - f2;
        }
        if (this.f67536n != 1 || this.f67533k == f2 || f <= 0.0f) {
            this.f67532j++;
        } else {
            m43223a(f3, f2, duration);
        }
        if (this.f67532j >= (this.f67534l * 1000) / 200) {
            m43211g();
        }
    }

    /* renamed from: b */
    public final void m43218b() {
        this.f67524b.m42297b(this.f67525c);
        if (this.f67536n != 2) {
            this.f67536n = 2;
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            if (this.f67531i == null || this.f67530h == null) {
                return;
            }
            this.f67527e.m42569e();
            C25704d5 c25704d5 = this.f67531i;
            this.f67531i = null;
            this.f67530h.mo42361a(c25704d5);
        }
    }

    /* renamed from: c */
    public void m43216c() {
        this.f67524b.close();
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.destroy();
        }
        this.f67529g = null;
    }

    /* renamed from: d */
    public Context m43214d() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer == null) {
            return null;
        }
        return instreamAudioAdPlayer.getCurrentContext();
    }

    /* renamed from: e */
    public InstreamAudioAdPlayer m43213e() {
        return this.f67529g;
    }

    /* renamed from: f */
    public float m43212f() {
        return this.f67528f;
    }

    /* renamed from: g */
    public final void m43211g() {
        C25704d5 c25704d5;
        AbstractC25846ja.m43680a("InstreamAdAudioController: Video freeze more then " + this.f67534l + " seconds, stopping");
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
        this.f67524b.m42297b(this.f67525c);
        this.f67527e.m42566h();
        InterfaceC26000b interfaceC26000b = this.f67530h;
        if (interfaceC26000b != null && (c25704d5 = this.f67531i) != null) {
            interfaceC26000b.mo42360a(AndroidInitializeBoldSDK.MSG_TIMEOUT, c25704d5);
        }
    }

    /* renamed from: i */
    public void m43209i() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.pauseAdAudio();
        }
    }

    /* renamed from: j */
    public void m43208j() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.resumeAdAudio();
        }
    }

    /* renamed from: k */
    public void m43207k() {
        if (this.f67536n == 1) {
            if (this.f67531i != null && this.f67530h != null) {
                this.f67527e.m42564j();
                this.f67530h.mo42359b(this.f67531i);
            }
            this.f67536n = 0;
        }
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
    }

    /* renamed from: a */
    public final void m43224a(float f) {
        C25704d5 c25704d5;
        this.f67527e.m42581a(f, f);
        InterfaceC26000b interfaceC26000b = this.f67530h;
        if (interfaceC26000b != null && (c25704d5 = this.f67531i) != null) {
            interfaceC26000b.mo42362a(0.0f, f, c25704d5);
        }
        m43218b();
    }

    /* renamed from: b */
    public final void m43217b(float f) {
        C25704d5 c25704d5;
        InterfaceC26000b interfaceC26000b;
        C25704d5 c25704d52 = this.f67531i;
        if (c25704d52 != null && (interfaceC26000b = this.f67530h) != null) {
            interfaceC26000b.mo42358c(c25704d52);
        }
        InterfaceC26000b interfaceC26000b2 = this.f67530h;
        if (interfaceC26000b2 != null && (c25704d5 = this.f67531i) != null) {
            interfaceC26000b2.mo42362a(0.0f, f, c25704d5);
        }
        this.f67527e.m42581a(0.0f, f);
        this.f67535m = true;
    }

    /* renamed from: c */
    public void m43215c(float f) {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(f);
        }
        this.f67528f = f;
    }

    /* renamed from: a */
    public final void m43223a(float f, float f2, float f3) {
        C25704d5 c25704d5;
        this.f67532j = 0;
        this.f67533k = f2;
        if (f2 >= f3) {
            m43224a(f3);
            return;
        }
        this.f67527e.m42581a(f2, f3);
        InterfaceC26000b interfaceC26000b = this.f67530h;
        if (interfaceC26000b == null || (c25704d5 = this.f67531i) == null) {
            return;
        }
        interfaceC26000b.mo42362a(f, f3, c25704d5);
    }

    /* renamed from: a */
    public void m43221a(C25704d5 c25704d5) {
        this.f67531i = c25704d5;
        this.f67527e.m42579a(c25704d5);
        this.f67535m = false;
        c25704d5.getStatHolder().m43996b(this.f67526d);
        AudioData audioData = (AudioData) c25704d5.getMediaData();
        if (audioData == null) {
            return;
        }
        Uri parse = Uri.parse(audioData.getUrl());
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f67529g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(this.f67528f);
            this.f67529g.playAdAudio(parse);
        }
    }

    /* renamed from: a */
    public void m43222a(int i) {
        this.f67534l = i;
    }

    /* renamed from: a */
    public void m43219a(InterfaceC26000b interfaceC26000b) {
        this.f67530h = interfaceC26000b;
    }

    /* renamed from: a */
    public void m43220a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        InstreamAudioAdPlayer instreamAudioAdPlayer2 = this.f67529g;
        if (instreamAudioAdPlayer2 != null) {
            instreamAudioAdPlayer2.setAdPlayerListener(null);
        }
        this.f67529g = instreamAudioAdPlayer;
        if (instreamAudioAdPlayer == null) {
            this.f67527e.m42580a((Context) null);
            return;
        }
        instreamAudioAdPlayer.setAdPlayerListener(this.f67523a);
        this.f67527e.m42580a(instreamAudioAdPlayer.getCurrentContext());
    }
}
