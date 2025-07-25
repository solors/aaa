package com.p551my.target;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.internal.AnalyticsEvents;
import com.p551my.target.InterfaceC26180w;

/* renamed from: com.my.target.i1 */
/* loaded from: classes7.dex */
public class TextureView$SurfaceTextureListenerC25811i1 implements InterfaceC26180w, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {

    /* renamed from: a */
    public final C26252y8 f66948a;

    /* renamed from: b */
    public final RunnableC25812a f66949b;

    /* renamed from: c */
    public final MediaPlayer f66950c;

    /* renamed from: d */
    public InterfaceC26180w.InterfaceC26181a f66951d;

    /* renamed from: e */
    public Surface f66952e;

    /* renamed from: f */
    public int f66953f;

    /* renamed from: g */
    public float f66954g;

    /* renamed from: h */
    public int f66955h;

    /* renamed from: i */
    public long f66956i;

    /* renamed from: j */
    public C26203x f66957j;

    /* renamed from: k */
    public Uri f66958k;

    /* renamed from: com.my.target.i1$a */
    /* loaded from: classes7.dex */
    public static class RunnableC25812a implements Runnable {

        /* renamed from: a */
        public final int f66959a;

        /* renamed from: b */
        public TextureView$SurfaceTextureListenerC25811i1 f66960b;

        /* renamed from: c */
        public InterfaceC26180w.InterfaceC26181a f66961c;

        /* renamed from: d */
        public int f66962d;

        /* renamed from: e */
        public float f66963e;

        public RunnableC25812a(int i) {
            this.f66959a = i;
        }

        /* renamed from: a */
        public void m43769a(TextureView$SurfaceTextureListenerC25811i1 textureView$SurfaceTextureListenerC25811i1) {
            this.f66960b = textureView$SurfaceTextureListenerC25811i1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextureView$SurfaceTextureListenerC25811i1 textureView$SurfaceTextureListenerC25811i1 = this.f66960b;
            if (textureView$SurfaceTextureListenerC25811i1 == null) {
                return;
            }
            float mo42631j = ((float) textureView$SurfaceTextureListenerC25811i1.mo42631j()) / 1000.0f;
            float duration = this.f66960b.getDuration();
            if (this.f66963e == mo42631j) {
                this.f66962d++;
            } else {
                InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66961c;
                if (interfaceC26181a != null) {
                    interfaceC26181a.mo42475a(mo42631j, duration);
                }
                this.f66963e = mo42631j;
                if (this.f66962d > 0) {
                    this.f66962d = 0;
                }
            }
            if (this.f66962d > this.f66959a) {
                InterfaceC26180w.InterfaceC26181a interfaceC26181a2 = this.f66961c;
                if (interfaceC26181a2 != null) {
                    interfaceC26181a2.mo42451m();
                }
                this.f66962d = 0;
            }
        }

        /* renamed from: a */
        public void m43768a(InterfaceC26180w.InterfaceC26181a interfaceC26181a) {
            this.f66961c = interfaceC26181a;
        }
    }

    public TextureView$SurfaceTextureListenerC25811i1() {
        this(new MediaPlayer(), new RunnableC25812a(50));
    }

    /* renamed from: k */
    public static InterfaceC26180w m43772k() {
        return new TextureView$SurfaceTextureListenerC25811i1();
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42643a(Uri uri, Context context) {
        this.f66958k = uri;
        AbstractC25846ja.m43680a("DefaultVideoPlayer: Play video in Android MediaPlayer - " + uri);
        if (this.f66953f != 0) {
            try {
                this.f66950c.reset();
            } catch (Throwable unused) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's reset method called in wrong state");
            }
            this.f66953f = 0;
        }
        this.f66950c.setOnCompletionListener(this);
        this.f66950c.setOnErrorListener(this);
        this.f66950c.setOnPreparedListener(this);
        this.f66950c.setOnInfoListener(this);
        try {
            this.f66950c.setDataSource(context, uri);
            InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66951d;
            if (interfaceC26181a != null) {
                interfaceC26181a.mo42457e();
            }
            try {
                this.f66950c.prepareAsync();
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's prepare async method called in wrong state, " + th.getMessage());
            }
            this.f66948a.m42299a(this.f66949b);
        } catch (Throwable th2) {
            if (this.f66951d != null) {
                this.f66951d.mo42466a("DefaultVideoPlayer data source error: " + th2.getMessage());
            }
            AbstractC25846ja.m43680a("DefaultVideoPlayer: Unable to parse video source, " + th2.getMessage());
            this.f66953f = 5;
            th2.printStackTrace();
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: b */
    public void mo42639b() {
        if (this.f66954g == 1.0f) {
            setVolume(0.0f);
        } else {
            setVolume(1.0f);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: c */
    public boolean mo42638c() {
        if (this.f66953f == 2) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: d */
    public void mo42637d() {
        setVolume(0.2f);
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void destroy() {
        this.f66951d = null;
        this.f66953f = 5;
        this.f66948a.m42297b(this.f66949b);
        m43771l();
        if (m43770m()) {
            try {
                this.f66950c.stop();
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th.getMessage());
            }
        }
        try {
            this.f66950c.release();
        } catch (Throwable th2) {
            AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's release method called in wrong state, " + th2.getMessage());
        }
        this.f66957j = null;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: e */
    public void mo42636e() {
        setVolume(0.0f);
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: f */
    public boolean mo42635f() {
        int i = this.f66953f;
        if (i >= 1 && i < 3) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: g */
    public void mo42634g() {
        try {
            this.f66950c.start();
            this.f66953f = 1;
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th.getMessage());
        }
        seekTo(0L);
    }

    @Override // com.p551my.target.InterfaceC26180w
    public float getDuration() {
        if (m43770m()) {
            try {
                return this.f66950c.getDuration() / 1000.0f;
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's get duration method called in wrong state, " + th.getMessage());
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.p551my.target.InterfaceC26180w
    public Uri getUri() {
        return this.f66958k;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: h */
    public boolean mo42633h() {
        if (this.f66954g == 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: i */
    public void mo42632i() {
        setVolume(1.0f);
    }

    @Override // com.p551my.target.InterfaceC26180w
    public boolean isPlaying() {
        if (this.f66953f == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: j */
    public long mo42631j() {
        if (!m43770m() || this.f66953f == 3) {
            return 0L;
        }
        try {
            return this.f66950c.getCurrentPosition();
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("DefaultVideoPlayer: media player's get current position method called in wrong state, " + th.getMessage());
            return 0L;
        }
    }

    /* renamed from: l */
    public final void m43771l() {
        TextureView textureView;
        C26203x c26203x = this.f66957j;
        if (c26203x != null) {
            textureView = c26203x.getTextureView();
        } else {
            textureView = null;
        }
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this) {
                Log.w("DefaultVideoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                textureView.setSurfaceTextureListener(null);
            }
        }
    }

    /* renamed from: m */
    public final boolean m43770m() {
        int i = this.f66953f;
        if (i >= 1 && i <= 4) {
            return true;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        InterfaceC26180w.InterfaceC26181a interfaceC26181a;
        float duration = getDuration();
        this.f66953f = 4;
        if (duration > 0.0f && (interfaceC26181a = this.f66951d) != null) {
            interfaceC26181a.mo42475a(duration, duration);
        }
        InterfaceC26180w.InterfaceC26181a interfaceC26181a2 = this.f66951d;
        if (interfaceC26181a2 != null) {
            interfaceC26181a2.onVideoCompleted();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        String str2;
        this.f66948a.m42297b(this.f66949b);
        m43771l();
        m43773a((Surface) null);
        if (i == 100) {
            str = "Server died";
        } else {
            str = "Unknown error";
        }
        if (i2 == -1004) {
            str2 = "IO error";
        } else if (i2 == -1007) {
            str2 = "Malformed error";
        } else if (i2 == -1010) {
            str2 = "Unsupported error";
        } else if (i2 == -110) {
            str2 = "Timed out error";
        } else if (i2 == Integer.MIN_VALUE) {
            str2 = "Low-level system error";
        } else {
            str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        String str3 = str + " (reason: " + str2 + ")";
        AbstractC25846ja.m43680a("DefaultVideoPlayer: Video error - " + str3);
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66951d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42466a(str3);
        }
        if (this.f66953f > 0) {
            try {
                this.f66950c.reset();
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's reset method called in wrong state, " + th.getMessage());
            }
        }
        this.f66953f = 0;
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66951d;
            if (interfaceC26181a != null) {
                interfaceC26181a.mo42450o();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            float f = this.f66954g;
            mediaPlayer.setVolume(f, f);
            this.f66953f = 1;
            mediaPlayer.start();
            long j = this.f66956i;
            if (j > 0) {
                seekTo(j);
            }
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th.getMessage());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        m43773a(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m43773a((Surface) null);
        return true;
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void pause() {
        if (this.f66953f == 1) {
            this.f66948a.m42297b(this.f66949b);
            try {
                this.f66955h = this.f66950c.getCurrentPosition();
                this.f66950c.pause();
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's pause or get current position method called in wrong state, " + th.getMessage());
            }
            this.f66953f = 2;
            InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66951d;
            if (interfaceC26181a != null) {
                interfaceC26181a.mo42459d();
            }
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void seekTo(long j) {
        this.f66956i = j;
        if (m43770m()) {
            try {
                this.f66950c.seekTo((int) j);
                this.f66956i = 0L;
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: media player's seek to method called in wrong state, " + th.getMessage());
            }
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void setVolume(float f) {
        this.f66954g = f;
        if (m43770m()) {
            try {
                this.f66950c.setVolume(f, f);
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's set volume method called in wrong state, " + th.getMessage());
            }
        }
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66951d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42476a(f);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void stop() {
        this.f66948a.m42297b(this.f66949b);
        try {
            this.f66950c.stop();
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th.getMessage());
        }
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66951d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42453k();
        }
        this.f66953f = 3;
    }

    public TextureView$SurfaceTextureListenerC25811i1(MediaPlayer mediaPlayer, RunnableC25812a runnableC25812a) {
        this.f66948a = C26252y8.m42300a(200);
        this.f66953f = 0;
        this.f66954g = 1.0f;
        this.f66956i = 0L;
        this.f66950c = mediaPlayer;
        this.f66949b = runnableC25812a;
        runnableC25812a.m43769a(this);
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42642a(Uri uri, C26203x c26203x) {
        mo42640a(c26203x);
        mo42643a(uri, c26203x.getContext());
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42644a() {
        if (this.f66953f == 2) {
            this.f66948a.m42299a(this.f66949b);
            try {
                this.f66950c.start();
            } catch (Throwable unused) {
                AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's start method called in wrong state");
            }
            int i = this.f66955h;
            if (i > 0) {
                try {
                    this.f66950c.seekTo(i);
                } catch (Throwable unused2) {
                    AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's seek to method called in wrong state");
                }
                this.f66955h = 0;
            }
            this.f66953f = 1;
            InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f66951d;
            if (interfaceC26181a != null) {
                interfaceC26181a.mo42456f();
            }
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42640a(C26203x c26203x) {
        m43771l();
        if (!(c26203x instanceof C26203x)) {
            this.f66957j = null;
            m43773a((Surface) null);
            return;
        }
        this.f66957j = c26203x;
        TextureView textureView = c26203x.getTextureView();
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("DefaultVideoPlayer", "Replacing existing SurfaceTextureListener");
        }
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        m43773a(surfaceTexture != null ? new Surface(surfaceTexture) : null);
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42641a(InterfaceC26180w.InterfaceC26181a interfaceC26181a) {
        this.f66951d = interfaceC26181a;
        this.f66949b.m43768a(interfaceC26181a);
    }

    /* renamed from: a */
    public final void m43773a(Surface surface) {
        try {
            this.f66950c.setSurface(surface);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("DefaultVideoPlayer: Media player's set surface method called in wrong state, " + th.getMessage());
        }
        Surface surface2 = this.f66952e;
        if (surface2 != null && surface2 != surface) {
            surface2.release();
        }
        this.f66952e = surface;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
