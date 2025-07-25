package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.amazon.device.iap.internal.p106c.C3718b;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.p */
/* loaded from: classes4.dex */
public final class C15175p extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a */
    public final Context f29974a;

    /* renamed from: h */
    public final Handler f29981h;

    /* renamed from: i */
    public InterfaceC15173n f29982i;

    /* renamed from: j */
    public Surface f29983j;

    /* renamed from: k */
    public SurfaceHolder f29984k;

    /* renamed from: l */
    public long f29985l;

    /* renamed from: n */
    public HandlerThread f29987n;

    /* renamed from: o */
    public Handler f29988o;

    /* renamed from: p */
    public RunnableC15162c f29989p;

    /* renamed from: q */
    public RunnableC15161b f29990q;

    /* renamed from: b */
    public volatile EnumC14795b f29975b = EnumC14795b.Idle;

    /* renamed from: c */
    public boolean f29976c = false;

    /* renamed from: d */
    public boolean f29977d = false;

    /* renamed from: e */
    public boolean f29978e = false;

    /* renamed from: f */
    public boolean f29979f = false;

    /* renamed from: g */
    public boolean f29980g = false;

    /* renamed from: m */
    public int f29986m = 0;

    /* renamed from: r */
    public int f29991r = 0;

    /* renamed from: s */
    public int f29992s = 0;

    /* renamed from: t */
    public int f29993t = 0;

    public C15175p(Context context, InterfaceC15173n interfaceC15173n, Handler handler) {
        this.f29974a = context;
        this.f29982i = interfaceC15173n;
        this.f29981h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f29987n = handlerThread;
        handlerThread.start();
        this.f29988o = new Handler(this.f29987n.getLooper());
        this.f29990q = new RunnableC15161b(this);
    }

    /* renamed from: b */
    public static void m77111b(C15175p c15175p) {
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.m76525e(m77112b + "timelog: release took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: c */
    public static void m77109c(C15175p c15175p) {
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        EnumC14795b enumC14795b = c15175p.f29975b;
        if (enumC14795b != EnumC14795b.Paused && enumC14795b != EnumC14795b.Prepared && enumC14795b != EnumC14795b.Completed && enumC14795b != EnumC14795b.Start_in_progress) {
            IAlog.m76529a("%s Start called in wrong mState! %s", c15175p.m77112b(), enumC14795b);
            if (c15175p.f29975b == EnumC14795b.Seeking) {
                c15175p.f29976c = true;
            }
        } else {
            super.start();
            c15175p.m77118a(EnumC14795b.Playing);
        }
        IAlog.m76525e(m77112b + "timelog: start took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: a */
    public final boolean m77119a() {
        return (this.f29975b == EnumC14795b.Idle || this.f29975b == EnumC14795b.Preparing) ? false : true;
    }

    /* renamed from: d */
    public final void m77108d() {
        this.f29977d = true;
        if (m77119a()) {
            m77114a(new RunnableC15171l(this));
        } else {
            IAlog.m76529a("%s mute called when player is not ready!", m77112b());
        }
        IAlog.m76529a("%s mute", m77112b());
    }

    /* renamed from: e */
    public final void m77106e() {
        String m77112b = m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        EnumC14795b enumC14795b = this.f29975b;
        EnumC14795b enumC14795b2 = EnumC14795b.Idle;
        if (enumC14795b == enumC14795b2) {
            IAlog.m76529a("%s reset called, but player is already resetted. Do nothing", m77112b());
            return;
        }
        m77118a(enumC14795b2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.m76525e(m77112b + "timelog: " + C3718b.f3282au + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (m77119a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.f29991r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.f29993t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.f29992s;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        if (m77119a() && this.f29975b != EnumC14795b.Paused && super.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        m77118a(EnumC14795b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m76524f("%s onError code = %d code2 = %d", m77112b(), Integer.valueOf(i), Integer.valueOf(i2));
        m77106e();
        this.f29981h.post(new RunnableC15160a(this, i, i2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m76529a("%s onPrepared %s gotPrepared = %s", m77112b(), this, Boolean.valueOf(this.f29980g));
        IAlog.m76529a("%sMedia prepare time took %d msec", m77112b(), Long.valueOf(System.currentTimeMillis() - this.f29985l));
        if (this.f29975b != EnumC14795b.Preparing && this.f29975b != EnumC14795b.Seeking) {
            IAlog.m76524f("%s onPrepared: previous error encountered. Aborting", m77112b());
        } else if (!this.f29980g) {
            this.f29980g = true;
            m77110c();
        } else {
            IAlog.m76529a("%s onPrepared called again??? We are already prepared", m77112b());
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.m76529a("%s onSeekComplete called current position = %d", m77112b(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f29975b != EnumC14795b.Seeking) {
            IAlog.m76529a("%s onSeekComplete called when Story is not seeking", m77112b());
            return;
        }
        if (this.f29977d) {
            m77108d();
        }
        if (this.f29976c) {
            IAlog.m76529a("%s onSeekComplete mPlayAfterSeek = true", m77112b());
            this.f29975b = EnumC14795b.Paused;
            start();
            return;
        }
        IAlog.m76529a("%s onSeekComplete mPlayAfterSeek = false", m77112b());
        m77118a(EnumC14795b.Paused);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m76529a("%s onVideoSizeChanged %d, %d", m77112b(), Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f29979f) {
            return;
        }
        RunnableC15162c runnableC15162c = this.f29989p;
        if (runnableC15162c != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnableC15162c);
            IAlog.m76529a("%s onVideoSizeChanged cancelling prepared runnable", m77112b());
        }
        this.f29979f = true;
        if (i != 0 && i2 != 0) {
            IAlog.m76529a("%sMedia got video size time took %d msec", m77112b(), Long.valueOf(System.currentTimeMillis() - this.f29985l));
            this.f29992s = i;
            this.f29993t = i2;
            m77110c();
            return;
        }
        IAlog.m76524f("%s onVideoSizeChanged - Invalid video size!", m77112b());
        onError(this, 0, 0);
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.f29975b != EnumC14795b.Idle && this.f29975b != EnumC14795b.Completed) {
            EnumC14795b enumC14795b = this.f29975b;
            EnumC14795b enumC14795b2 = EnumC14795b.Paused;
            if (enumC14795b != enumC14795b2 && this.f29975b != EnumC14795b.Prepared) {
                m77118a(enumC14795b2);
                if (m77119a()) {
                    m77114a(new RunnableC15170k(this));
                } else {
                    IAlog.m76529a("%s paused called when player is not ready!", m77112b());
                }
                IAlog.m76529a("%s pause", m77112b());
                return;
            }
        }
        IAlog.m76529a("%s paused called when player is in mState: %s ignoring", m77112b(), this.f29975b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.f29978e) {
            m77114a(new RunnableC15166g(this));
        }
        this.f29982i = null;
        this.f29990q = null;
        this.f29978e = true;
        IAlog.m76529a("%s release called", m77112b());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.m76529a("%s reset called", m77112b());
        RunnableC15162c runnableC15162c = this.f29989p;
        if (runnableC15162c != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnableC15162c);
        }
        m77114a(new RunnableC15167h(this));
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.m76529a("%s setDisplay called", m77112b());
        if (!m77119a()) {
            IAlog.m76529a("%s setDisplay called when player is not ready!", m77112b());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f29984k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.m76529a("%s setDisplay called with existing surface. ignoring!", m77112b());
            return;
        }
        this.f29984k = surfaceHolder;
        m77114a(new RunnableC15164e(this, surfaceHolder));
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(Surface surface) {
        IAlog.m76529a("%s setSurface called", m77112b());
        Surface surface2 = this.f29983j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.m76529a("%s setSurface called with existing surface. ignoring!", m77112b());
            return;
        }
        this.f29983j = surface;
        m77114a(new RunnableC15165f(this, surface));
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.m76529a("%s Start called", m77112b());
        if (!m77119a()) {
            IAlog.m76529a("%s MediaPlayer: Start called when player is not ready! - mState = %s", m77112b(), this.f29975b);
        } else if (this.f29975b == EnumC14795b.Seeking) {
            this.f29976c = true;
        } else if (isPlaying()) {
            IAlog.m76529a("%s MediaPlayer: Start called when player is already playing. do nothing", m77112b());
        } else {
            m77118a(EnumC14795b.Start_in_progress);
            m77114a(new RunnableC15168i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        String m77112b = m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        if (m77119a()) {
            super.stop();
        }
        IAlog.m76529a("%s stop called", m77112b());
        IAlog.m76525e(m77112b + "timelog: " + C32664c2oc2i.c2oc2o + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: a */
    public final void m77113a(String str) {
        String m77112b = m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        this.f29979f = false;
        this.f29980g = false;
        if (isPlaying()) {
            IAlog.m76529a("%s loadUri stopping play before refresh", m77112b());
            stop();
        }
        this.f29985l = System.currentTimeMillis();
        m77106e();
        IAlog.m76529a("%s calling setDataSource with %s", m77112b(), str);
        try {
            setDataSource(str);
            IAlog.m76529a("%s setDataSource succeeded, calling prepareAsync", m77112b());
            m77118a(EnumC14795b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e) {
                IAlog.m76528b("%s prepareAsync failed with illegal mState exception: %s", m77112b(), e.getMessage());
                this.f29986m++;
                if (this.f29986m < 5) {
                    m77113a(str);
                }
                this.f29986m = 0;
            }
            IAlog.m76525e(m77112b + "timelog: loadUri took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e2) {
            IAlog.m76528b("%s error setting data source %s", m77112b(), str);
            IAlog.m76528b("%s exception message: %s", m77112b(), e2.getMessage());
        }
    }

    /* renamed from: d */
    public static void m77107d(C15175p c15175p) {
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.m76529a("%s paused called cannot set to pause, canceled", c15175p.m77112b());
        }
        IAlog.m76525e(m77112b + "timelog: delayed pause took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: b */
    public final String m77112b() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    /* renamed from: c */
    public final void m77110c() {
        if (this.f29980g) {
            if (this.f29979f) {
                IAlog.m76529a("%sMedia load time took %d msec", m77112b(), Long.valueOf(System.currentTimeMillis() - this.f29985l));
                this.f29991r = super.getDuration();
                m77118a(EnumC14795b.Prepared);
                if (this.f29977d) {
                    m77108d();
                    return;
                }
                return;
            }
            IAlog.m76529a("%sGot prepared only, waiting for video size", m77112b());
            if (this.f29989p == null) {
                this.f29989p = new RunnableC15162c(this);
            }
            AbstractC15465p.f30612b.postDelayed(this.f29989p, 2000L);
        }
    }

    /* renamed from: a */
    public final void m77118a(EnumC14795b enumC14795b) {
        IAlog.m76529a("%s updatePlayerState - %s", m77112b(), enumC14795b);
        if (this.f29975b == enumC14795b) {
            IAlog.m76529a("%s updatePlayerState - mState didn't change!", m77112b());
            return;
        }
        IAlog.m76529a("%s updatePlayerState - changing from %s to %s", m77112b(), this.f29975b, enumC14795b);
        this.f29975b = enumC14795b;
        this.f29981h.post(new RunnableC15163d(this, enumC14795b));
    }

    /* renamed from: a */
    public static void m77116a(C15175p c15175p, Surface surface) {
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m76529a("%s setSurface called with %s", c15175p.m77112b(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.m76529a("%s setSurface with null! current surface cleared", c15175p.m77112b());
            } else {
                IAlog.m76529a("%s setSurface - replacing surface!", c15175p.m77112b());
            }
            IAlog.m76525e(m77112b + "timelog: setSurface took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m76529a("%s super.setSurface threw exception!", c15175p.m77112b());
        }
    }

    /* renamed from: a */
    public static void m77115a(C15175p c15175p, SurfaceHolder surfaceHolder) {
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m76529a("%s setDisplay called with %s", c15175p.m77112b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.m76529a("%s setDisplay with null! current display cleared", c15175p.m77112b());
            } else {
                IAlog.m76529a("%s setDisplay - replacing surface holder!", c15175p.m77112b());
            }
            IAlog.m76525e(m77112b + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m76529a("%s super.setDisplay threw exception!", c15175p.m77112b());
        }
    }

    /* renamed from: a */
    public final void m77114a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f29987n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f29987n.isInterrupted() && (handler2 = this.f29988o) != null) {
            handler2.post(runnable);
        }
        if ((this.f29992s == 0 || this.f29993t == 0 || this.f29991r == 0) && (handler = this.f29988o) != null) {
            handler.post(this.f29990q);
        }
    }

    /* renamed from: a */
    public static void m77117a(C15175p c15175p) {
        if (c15175p.m77119a()) {
            c15175p.f29992s = super.getVideoWidth();
            c15175p.f29993t = super.getVideoHeight();
            c15175p.f29991r = super.getDuration();
        }
    }
}
