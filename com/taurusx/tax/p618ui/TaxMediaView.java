package com.taurusx.tax.p618ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p604i.RunnableC28450k;
import com.taurusx.tax.p604i.RunnableC28451l;
import com.taurusx.tax.p604i.View$OnClickListenerC28449j;
import com.taurusx.tax.p606j.C28521h;
import com.taurusx.tax.p606j.C28549x;
import com.taurusx.tax.vast.VastConfig;

/* renamed from: com.taurusx.tax.ui.TaxMediaView */
/* loaded from: classes7.dex */
public class TaxMediaView extends RelativeLayout implements TextureView.SurfaceTextureListener {

    /* renamed from: A */
    public AdSession f74177A;

    /* renamed from: B */
    public boolean f74178B;

    /* renamed from: a */
    public String f74179a;

    /* renamed from: b */
    public int f74180b;

    /* renamed from: c */
    public int f74181c;

    /* renamed from: d */
    public int f74182d;

    /* renamed from: e */
    public int f74183e;

    /* renamed from: f */
    public int f74184f;

    /* renamed from: g */
    public boolean f74185g;

    /* renamed from: h */
    public boolean f74186h;

    /* renamed from: i */
    public boolean f74187i;

    /* renamed from: j */
    public int f74188j;

    /* renamed from: k */
    public int f74189k;

    /* renamed from: l */
    public boolean f74190l;

    /* renamed from: m */
    public boolean f74191m;

    /* renamed from: n */
    public boolean f74192n;

    /* renamed from: o */
    public boolean f74193o;

    /* renamed from: p */
    public InterfaceC28588f f74194p;

    /* renamed from: q */
    public Handler f74195q;

    /* renamed from: r */
    public ImageView f74196r;

    /* renamed from: s */
    public boolean f74197s;

    /* renamed from: t */
    public Thread f74198t;

    /* renamed from: u */
    public int f74199u;

    /* renamed from: v */
    public MediaPlayer f74200v;

    /* renamed from: w */
    public SurfaceTexture f74201w;

    /* renamed from: x */
    public TextureView f74202x;

    /* renamed from: y */
    public Surface f74203y;

    /* renamed from: z */
    public MediaEvents f74204z;

    /* renamed from: com.taurusx.tax.ui.TaxMediaView$a */
    /* loaded from: classes7.dex */
    public class HandlerC28583a extends Handler {
        public HandlerC28583a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            float f;
            TaxMediaView taxMediaView = TaxMediaView.this;
            int i = message.what;
            taxMediaView.f74188j = i;
            if (i <= 0) {
                return;
            }
            if (!taxMediaView.f74191m && !taxMediaView.f74192n) {
                taxMediaView.f74191m = true;
                TaxMediaView taxMediaView2 = TaxMediaView.this;
                MediaEvents mediaEvents = taxMediaView2.f74204z;
                if (mediaEvents != null && taxMediaView2.f74177A != null) {
                    float duration = taxMediaView2.f74200v.getDuration();
                    if (TaxMediaView.this.f74197s) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    mediaEvents.start(duration, f);
                }
                InterfaceC28588f interfaceC28588f = TaxMediaView.this.f74194p;
                if (interfaceC28588f != null) {
                    interfaceC28588f.mo37851c();
                }
            }
            TaxMediaView taxMediaView3 = TaxMediaView.this;
            InterfaceC28588f interfaceC28588f2 = taxMediaView3.f74194p;
            if (interfaceC28588f2 != null) {
                interfaceC28588f2.mo37853a(taxMediaView3.f74188j, taxMediaView3.f74189k);
            }
            TaxMediaView taxMediaView4 = TaxMediaView.this;
            if (!taxMediaView4.f74185g && taxMediaView4.f74188j >= taxMediaView4.f74182d) {
                taxMediaView4.f74185g = true;
                TaxMediaView taxMediaView5 = TaxMediaView.this;
                MediaEvents mediaEvents2 = taxMediaView5.f74204z;
                if (mediaEvents2 != null && taxMediaView5.f74177A != null) {
                    mediaEvents2.firstQuartile();
                }
                InterfaceC28588f interfaceC28588f3 = TaxMediaView.this.f74194p;
                if (interfaceC28588f3 != null) {
                    interfaceC28588f3.mo37854a(25);
                }
            } else if (!taxMediaView4.f74186h && taxMediaView4.f74188j >= taxMediaView4.f74183e) {
                taxMediaView4.f74186h = true;
                TaxMediaView taxMediaView6 = TaxMediaView.this;
                MediaEvents mediaEvents3 = taxMediaView6.f74204z;
                if (mediaEvents3 != null && taxMediaView6.f74177A != null) {
                    mediaEvents3.midpoint();
                }
                InterfaceC28588f interfaceC28588f4 = TaxMediaView.this.f74194p;
                if (interfaceC28588f4 != null) {
                    interfaceC28588f4.mo37854a(50);
                }
            } else if (!taxMediaView4.f74187i && taxMediaView4.f74188j >= taxMediaView4.f74184f) {
                taxMediaView4.f74187i = true;
                TaxMediaView taxMediaView7 = TaxMediaView.this;
                MediaEvents mediaEvents4 = taxMediaView7.f74204z;
                if (mediaEvents4 != null && taxMediaView7.f74177A != null) {
                    mediaEvents4.thirdQuartile();
                }
                InterfaceC28588f interfaceC28588f5 = TaxMediaView.this.f74194p;
                if (interfaceC28588f5 != null) {
                    interfaceC28588f5.mo37854a(75);
                }
            }
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxMediaView$b */
    /* loaded from: classes7.dex */
    public class C28584b implements MediaPlayer.OnPreparedListener {
        public C28584b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            LogUtil.m37900v("TaxMediaView", "TaxMediaView MediaPlayer onPrepared()...");
            TaxMediaView.this.f74193o = true;
            TaxMediaView taxMediaView = TaxMediaView.this;
            taxMediaView.f74189k = taxMediaView.f74200v.getDuration();
            TaxMediaView taxMediaView2 = TaxMediaView.this;
            taxMediaView2.f74182d = Math.round(taxMediaView2.f74189k * 0.25f);
            TaxMediaView taxMediaView3 = TaxMediaView.this;
            taxMediaView3.f74183e = Math.round(taxMediaView3.f74189k * 0.5f);
            TaxMediaView taxMediaView4 = TaxMediaView.this;
            taxMediaView4.f74184f = Math.round(taxMediaView4.f74189k * 0.75f);
            TaxMediaView taxMediaView5 = TaxMediaView.this;
            int i = taxMediaView5.f74188j;
            if (i > 0) {
                taxMediaView5.f74200v.seekTo(i);
            } else {
                taxMediaView5.m37859f();
            }
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxMediaView$c */
    /* loaded from: classes7.dex */
    public class C28585c implements MediaPlayer.OnSeekCompleteListener {
        public C28585c() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            TaxMediaView taxMediaView = TaxMediaView.this;
            if (taxMediaView.f74192n && taxMediaView.f74188j == taxMediaView.f74189k) {
                return;
            }
            taxMediaView.m37859f();
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxMediaView$d */
    /* loaded from: classes7.dex */
    public class C28586d implements MediaPlayer.OnCompletionListener {
        public C28586d() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            TaxMediaView.this.m37857g();
            TaxMediaView.this.f74192n = true;
            TaxMediaView taxMediaView = TaxMediaView.this;
            int i = taxMediaView.f74189k;
            taxMediaView.f74188j = i;
            taxMediaView.f74200v.seekTo(i);
            LogUtil.m37900v("TaxMediaView", "TaxMediaView onCompletion");
            TaxMediaView taxMediaView2 = TaxMediaView.this;
            MediaEvents mediaEvents = taxMediaView2.f74204z;
            if (mediaEvents != null && taxMediaView2.f74177A != null) {
                mediaEvents.complete();
            }
            InterfaceC28588f interfaceC28588f = TaxMediaView.this.f74194p;
            if (interfaceC28588f != null) {
                interfaceC28588f.mo37849e();
            }
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxMediaView$e */
    /* loaded from: classes7.dex */
    public class C28587e implements MediaPlayer.OnErrorListener {
        public C28587e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            InterfaceC28588f interfaceC28588f = TaxMediaView.this.f74194p;
            if (interfaceC28588f != null) {
                interfaceC28588f.mo37850d();
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxMediaView$f */
    /* loaded from: classes7.dex */
    public interface InterfaceC28588f {
        /* renamed from: a */
        void mo37855a();

        /* renamed from: a */
        void mo37854a(int i);

        /* renamed from: a */
        void mo37853a(int i, int i2);

        /* renamed from: b */
        void mo37852b();

        /* renamed from: c */
        void mo37851c();

        /* renamed from: d */
        void mo37850d();

        /* renamed from: e */
        void mo37849e();
    }

    public TaxMediaView(Context context) {
        super(context);
        this.f74188j = -1;
        this.f74190l = false;
        this.f74191m = false;
        this.f74192n = false;
        this.f74193o = false;
        m37871a();
    }

    public int getCurrentProgress() {
        int i = this.f74188j;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public int getDuration() {
        return this.f74189k;
    }

    public int getVideoLength() {
        return this.f74189k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m37861e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        r9 = r3;
        r3 = r1;
        r1 = r9;
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p618ui.TaxMediaView.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LogUtil.m37900v("TaxMediaView", "TaxMediaView onSurfaceTextureDestroyed()...");
        m37861e();
        return true;
    }

    public void setIsMute(boolean z) {
        LogUtil.m37905d("TaxMediaView", "TaxMediaView setIsMute " + z);
        this.f74197s = z;
    }

    public void setMute(boolean z) {
        if (z) {
            MediaPlayer mediaPlayer = this.f74200v;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(0.0f, 0.0f);
                MediaEvents mediaEvents = this.f74204z;
                if (mediaEvents != null && this.f74177A != null) {
                    mediaEvents.volumeChange(0.0f);
                }
                InterfaceC28588f interfaceC28588f = this.f74194p;
                if (interfaceC28588f != null) {
                    interfaceC28588f.mo37852b();
                    return;
                }
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer2 = this.f74200v;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(1.0f, 1.0f);
            MediaEvents mediaEvents2 = this.f74204z;
            if (mediaEvents2 != null && this.f74177A != null) {
                mediaEvents2.volumeChange(1.0f);
            }
            InterfaceC28588f interfaceC28588f2 = this.f74194p;
            if (interfaceC28588f2 != null) {
                interfaceC28588f2.mo37855a();
            }
        }
    }

    public void setOnPlayerListener(InterfaceC28588f interfaceC28588f) {
        this.f74194p = interfaceC28588f;
    }

    public void setOrientation(int i) {
        this.f74199u = i;
    }

    /* renamed from: b */
    public final void m37867b() {
        if (this.f74200v == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f74200v = mediaPlayer;
            boolean z = this.f74197s;
            mediaPlayer.setVolume(z ? 0.0f : 1.0f, z ? 0.0f : 1.0f);
            this.f74200v.setAudioStreamType(3);
            this.f74200v.setOnPreparedListener(new C28584b());
            this.f74200v.setOnSeekCompleteListener(new C28585c());
            if (!this.f74192n) {
                this.f74200v.setOnCompletionListener(new C28586d());
            }
            this.f74200v.setOnErrorListener(new C28587e());
        }
    }

    /* renamed from: c */
    public boolean m37865c() {
        MediaPlayer mediaPlayer = this.f74200v;
        if (mediaPlayer == null || !this.f74193o) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    /* renamed from: d */
    public void m37863d() {
        LogUtil.m37905d("taurusx", "pause()");
        m37857g();
        if (m37865c()) {
            this.f74200v.pause();
            MediaEvents mediaEvents = this.f74204z;
            if (mediaEvents == null || this.f74177A == null) {
                return;
            }
            mediaEvents.pause();
        }
    }

    /* renamed from: e */
    public void m37861e() {
        if (this.f74193o) {
            LogUtil.m37900v("TaxMediaView", "TaxMediaView release");
            m37857g();
            this.f74201w = null;
            this.f74203y = null;
            MediaPlayer mediaPlayer = this.f74200v;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    this.f74200v.stop();
                }
                this.f74200v.reset();
                this.f74200v.release();
                this.f74200v = null;
            }
            Handler handler = this.f74195q;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f74193o = false;
        }
    }

    /* renamed from: f */
    public void m37859f() {
        LogUtil.m37900v("TaxMediaView", "TaxMediaView start");
        MediaPlayer mediaPlayer = this.f74200v;
        if (mediaPlayer != null && this.f74193o) {
            mediaPlayer.start();
        }
        MediaEvents mediaEvents = this.f74204z;
        if (mediaEvents != null && this.f74177A != null) {
            mediaEvents.resume();
        }
        if (!this.f74178B) {
            this.f74178B = true;
            C28521h.m38003b(new RunnableC28451l(this), 500L);
        }
        if (this.f74198t != null) {
            return;
        }
        this.f74190l = true;
        Thread thread = new Thread(new RunnableC28450k(this));
        this.f74198t = thread;
        thread.start();
    }

    /* renamed from: g */
    public final void m37857g() {
        this.f74190l = false;
        this.f74198t = null;
    }

    /* renamed from: a */
    public final void m37871a() {
        setSaveEnabled(true);
        this.f74195q = new HandlerC28583a(Looper.getMainLooper());
        if (this.f74202x == null) {
            TextureView textureView = new TextureView(getContext());
            this.f74202x = textureView;
            textureView.setSurfaceTextureListener(this);
            this.f74202x.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f74202x, layoutParams);
        }
        m37867b();
        this.f74196r = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C28549x.m37974a(getContext(), 10), C28549x.m37974a(getContext(), 10));
        layoutParams2.addRule(10);
        layoutParams2.addRule(11);
        this.f74196r.setVisibility(4);
        addView(this.f74196r, layoutParams2);
        if (this.f74197s) {
            this.f74196r.setBackgroundResource(C28154R.C28156drawable.taurusx_inner_video_mute);
        } else {
            this.f74196r.setBackgroundResource(C28154R.C28156drawable.taurusx_inner_video_no_mute);
        }
        this.f74196r.setOnClickListener(new View$OnClickListenerC28449j(this));
    }

    public TaxMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74188j = -1;
        this.f74190l = false;
        this.f74191m = false;
        this.f74192n = false;
        this.f74193o = false;
        m37871a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setIsSkip(boolean z) {
    }

    /* renamed from: a */
    public void m37870a(C28210c.C28211a c28211a, VastConfig vastConfig) {
        if (c28211a != null && vastConfig != null) {
            this.f74179a = vastConfig.getDiskMediaFileUrl();
            this.f74181c = vastConfig.getVideoHeight();
            this.f74180b = vastConfig.getVideoWidth();
            LogUtil.m37900v("TaxMediaView", "TaxMediaView setVastConfig config DiskMediaFileUrl:" + vastConfig.getDiskMediaFileUrl() + " width:" + this.f74180b + " height:" + this.f74181c);
            return;
        }
        LogUtil.m37900v("TaxMediaView", "TaxMediaView setVastConfig config is null");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
