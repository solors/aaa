package com.p551my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import com.p551my.target.C25884l4;
import com.p551my.target.C25891l8;
import com.p551my.target.C26078s4;
import com.p551my.target.common.models.VideoData;

/* renamed from: com.my.target.l4 */
/* loaded from: classes7.dex */
public class C25884l4 {

    /* renamed from: a */
    public final C25704d5 f67171a;

    /* renamed from: b */
    public final C25885a f67172b;

    /* renamed from: c */
    public final InterfaceC26163v4 f67173c;

    /* renamed from: d */
    public final C25690cb f67174d;

    /* renamed from: e */
    public final C26193w7 f67175e;

    /* renamed from: f */
    public final C26078s4.InterfaceC26081c f67176f;

    /* renamed from: g */
    public final C26078s4.InterfaceC26080b f67177g;

    /* renamed from: h */
    public float f67178h;

    /* renamed from: i */
    public boolean f67179i;

    /* renamed from: j */
    public boolean f67180j;

    /* renamed from: k */
    public boolean f67181k;

    /* renamed from: l */
    public boolean f67182l;

    /* renamed from: m */
    public boolean f67183m = true;

    /* renamed from: com.my.target.l4$a */
    /* loaded from: classes7.dex */
    public class C25885a implements C25891l8.InterfaceC25892a {
        public C25885a() {
            C25884l4.this = r1;
        }

        @Override // com.p551my.target.C25891l8.InterfaceC25892a
        /* renamed from: c */
        public void mo43511c() {
            C25884l4 c25884l4 = C25884l4.this;
            c25884l4.m43554a(c25884l4.f67173c.getView().getContext());
            C25884l4.this.f67175e.m42568f();
            C25884l4.this.f67173c.pause();
        }

        @Override // com.p551my.target.C25891l8.InterfaceC25892a
        /* renamed from: h */
        public void mo43510h() {
            C25884l4.this.f67175e.m42565i();
            C25884l4.this.f67173c.mo42720a();
            C25884l4 c25884l4 = C25884l4.this;
            if (c25884l4.f67179i) {
                c25884l4.m43548c();
            } else {
                c25884l4.m43542i();
            }
        }

        @Override // com.p551my.target.C25891l8.InterfaceC25892a
        /* renamed from: j */
        public void mo43509j() {
            C25884l4.this.m43545f();
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: m */
        public void mo42451m() {
            C25884l4.this.f67175e.m42566h();
            C25884l4.this.m43557a();
            AbstractC25846ja.m43680a("InterstitialMediaPresenter$MyMediaViewListener: Video playing timeout");
            C25884l4.this.f67177g.mo42645b();
        }

        @Override // com.p551my.target.C25891l8.InterfaceC25892a
        /* renamed from: n */
        public void mo43508n() {
            C25884l4 c25884l4 = C25884l4.this;
            if (!c25884l4.f67179i) {
                c25884l4.m43549b(c25884l4.f67173c.getView().getContext());
            }
            C25884l4.this.m43545f();
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: o */
        public void mo42450o() {
            C25884l4 c25884l4 = C25884l4.this;
            if (c25884l4.f67180j && c25884l4.f67171a.getAllowCloseDelay() == 0.0f) {
                C25884l4.this.f67173c.mo42591d();
            }
            C25884l4.this.f67173c.mo42716b();
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            if (Looper.getMainLooper().isCurrentThread()) {
                C25884l4.this.m43555a(i);
            } else {
                AbstractC25671c0.m44121e(new Runnable() { // from class: com.my.target.qc
                    {
                        C25884l4.C25885a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C25884l4.C25885a.this.m43540a(i);
                    }
                });
            }
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        public void onVideoCompleted() {
            C25884l4 c25884l4 = C25884l4.this;
            if (c25884l4.f67182l) {
                return;
            }
            c25884l4.f67182l = true;
            AbstractC25846ja.m43680a("InterstitialMediaPresenter$MyMediaViewListener: Video playing complete");
            C25884l4.this.f67175e.m42569e();
            C25884l4.this.m43543h();
            C25884l4 c25884l42 = C25884l4.this;
            c25884l42.f67176f.mo42842a(c25884l42.f67173c.getView().getContext());
            C25884l4.this.f67173c.mo42591d();
            C25884l4.this.f67173c.mo42712e();
            C25884l4.this.f67175e.m42571c();
        }

        /* renamed from: a */
        public /* synthetic */ void m43540a(int i) {
            C25884l4.this.m43555a(i);
        }

        /* renamed from: a */
        public void m43541a() {
            C25884l4 c25884l4 = C25884l4.this;
            if (c25884l4.f67179i) {
                c25884l4.m43542i();
                C25884l4.this.f67175e.m42572b(true);
                C25884l4.this.f67179i = false;
                return;
            }
            c25884l4.m43548c();
            C25884l4.this.f67175e.m42572b(false);
            C25884l4.this.f67179i = true;
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: a */
        public void mo42475a(float f, float f2) {
            C25884l4.this.f67173c.setTimeChanged(f);
            C25884l4 c25884l4 = C25884l4.this;
            c25884l4.f67182l = false;
            if (!c25884l4.f67181k) {
                c25884l4.f67181k = true;
            }
            if (c25884l4.f67180j && c25884l4.f67171a.isAutoPlay() && C25884l4.this.f67171a.getAllowCloseDelay() <= f) {
                C25884l4.this.f67173c.mo42591d();
            }
            C25884l4 c25884l42 = C25884l4.this;
            float f3 = c25884l42.f67178h;
            if (f > f3) {
                mo42475a(f3, f3);
                return;
            }
            c25884l42.m43556a(f, f2);
            if (f == C25884l4.this.f67178h) {
                onVideoCompleted();
            }
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: a */
        public void mo42466a(String str) {
            AbstractC25846ja.m43680a("InterstitialMediaPresenter$MyMediaViewListener: Video playing error: " + str);
            C25884l4.this.f67175e.m42567g();
            C25884l4 c25884l4 = C25884l4.this;
            if (!c25884l4.f67183m) {
                c25884l4.m43557a();
                C25884l4.this.f67177g.mo42645b();
                return;
            }
            AbstractC25846ja.m43680a("InterstitialMediaPresenter$MyMediaViewListener: Try to play video stream from URL");
            C25884l4 c25884l42 = C25884l4.this;
            c25884l42.f67183m = false;
            c25884l42.m43545f();
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: a */
        public void mo42476a(float f) {
            C25884l4.this.f67173c.mo42715b(f <= 0.0f);
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: d */
        public void mo42459d() {
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: e */
        public void mo42457e() {
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: f */
        public void mo42456f() {
        }

        @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
        /* renamed from: k */
        public void mo42453k() {
        }
    }

    public C25884l4(C25844j8 c25844j8, C25704d5 c25704d5, InterfaceC26163v4 interfaceC26163v4, C26078s4.InterfaceC26081c interfaceC26081c, C26078s4.InterfaceC26080b interfaceC26080b) {
        this.f67171a = c25704d5;
        this.f67176f = interfaceC26081c;
        this.f67177g = interfaceC26080b;
        C25885a c25885a = new C25885a();
        this.f67172b = c25885a;
        this.f67173c = interfaceC26163v4;
        interfaceC26163v4.setMediaListener(c25885a);
        C25690cb m44058a = C25690cb.m44058a(c25704d5.getStatHolder());
        this.f67174d = m44058a;
        m44058a.m44059a(interfaceC26163v4.getPromoMediaView());
        this.f67175e = c25844j8.m43687a(c25704d5);
    }

    /* renamed from: a */
    public final void m43554a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f67172b);
        }
    }

    /* renamed from: b */
    public final void m43550b() {
        this.f67173c.mo42719a(1);
    }

    /* renamed from: c */
    public final void m43548c() {
        m43554a(this.f67173c.getView().getContext());
        this.f67173c.mo42719a(0);
    }

    /* renamed from: d */
    public void m43547d() {
        this.f67173c.mo42717a(true);
        m43554a(this.f67173c.getView().getContext());
        if (this.f67181k) {
            this.f67175e.m42570d();
        }
    }

    /* renamed from: e */
    public void m43546e() {
        this.f67173c.pause();
        m43554a(this.f67173c.getView().getContext());
        if (this.f67173c.isPlaying() && !this.f67173c.mo42714c()) {
            this.f67175e.m42568f();
        }
    }

    /* renamed from: f */
    public final void m43545f() {
        this.f67173c.mo42713c(this.f67183m);
    }

    /* renamed from: g */
    public void m43544g() {
        m43554a(this.f67173c.getView().getContext());
    }

    /* renamed from: h */
    public final void m43543h() {
        this.f67173c.mo42591d();
        m43554a(this.f67173c.getView().getContext());
        this.f67173c.mo42717a(this.f67171a.isAllowReplay());
    }

    /* renamed from: i */
    public final void m43542i() {
        if (this.f67173c.isPlaying()) {
            m43549b(this.f67173c.getView().getContext());
        }
        this.f67173c.mo42719a(2);
    }

    /* renamed from: a */
    public final void m43555a(int i) {
        if (i == -3) {
            AbstractC25846ja.m43680a("InterstitialMediaPresenter: Audiofocus loss can duck, set volume to 0.3");
            if (this.f67179i) {
                return;
            }
            m43550b();
        } else if (i == -2 || i == -1) {
            m43546e();
            AbstractC25846ja.m43680a("InterstitialMediaPresenter: Audiofocus loss, pausing");
        } else if (i == 1 || i == 2 || i == 4) {
            AbstractC25846ja.m43680a("InterstitialMediaPresenter: Audiofocus gain, unmuting");
            if (this.f67179i) {
                return;
            }
            m43542i();
        }
    }

    /* renamed from: b */
    public final void m43549b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f67172b, 3, 2);
        }
    }

    /* renamed from: a */
    public void m43557a() {
        m43554a(this.f67173c.getView().getContext());
        this.f67173c.destroy();
    }

    /* renamed from: a */
    public void m43553a(C25655b4 c25655b4) {
        this.f67173c.mo42591d();
        this.f67173c.mo42718a(c25655b4);
    }

    /* renamed from: a */
    public final void m43556a(float f, float f2) {
        this.f67174d.m44060a(f, f2);
        this.f67175e.m42581a(f, f2);
    }

    /* renamed from: a */
    public void m43552a(C25704d5 c25704d5, Context context) {
        VideoData videoData = (VideoData) c25704d5.getMediaData();
        if (videoData != null && videoData.getData() == null) {
            this.f67183m = false;
        }
        boolean isAllowClose = c25704d5.isAllowClose();
        this.f67180j = isAllowClose;
        if (isAllowClose && c25704d5.getAllowCloseDelay() == 0.0f && c25704d5.isAutoPlay()) {
            AbstractC25846ja.m43680a("InterstitialMediaPresenter: Banner is allowed to close");
            this.f67173c.mo42591d();
        }
        this.f67178h = c25704d5.getDuration();
        boolean isAutoMute = c25704d5.isAutoMute();
        this.f67179i = isAutoMute;
        if (isAutoMute) {
            this.f67173c.mo42719a(0);
            return;
        }
        if (c25704d5.isAutoPlay()) {
            m43549b(context);
        }
        this.f67173c.mo42719a(2);
    }

    /* renamed from: a */
    public static C25884l4 m43551a(C25844j8 c25844j8, C25704d5 c25704d5, InterfaceC26163v4 interfaceC26163v4, C26078s4.InterfaceC26081c interfaceC26081c, C26078s4.InterfaceC26080b interfaceC26080b) {
        return new C25884l4(c25844j8, c25704d5, interfaceC26163v4, interfaceC26081c, interfaceC26080b);
    }
}
