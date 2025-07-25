package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.measurement.C14588g;
import com.fyber.inneractive.sdk.player.C14746c;
import com.fyber.inneractive.sdk.player.C15154h;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;
import com.fyber.inneractive.sdk.player.mediaplayer.InterfaceC15173n;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.controller.q */
/* loaded from: classes4.dex */
public abstract class AbstractC14782q implements InterfaceC15173n {

    /* renamed from: a */
    public final Context f28030a;

    /* renamed from: d */
    public C14789x f28033d;

    /* renamed from: f */
    public C14746c f28035f;

    /* renamed from: g */
    public boolean f28036g;

    /* renamed from: i */
    public final Handler f28038i;

    /* renamed from: j */
    public TextureView f28039j;

    /* renamed from: k */
    public SurfaceTexture f28040k;

    /* renamed from: l */
    public Surface f28041l;

    /* renamed from: m */
    public TextureView$SurfaceTextureListenerC14774i f28042m;

    /* renamed from: o */
    public boolean f28044o;

    /* renamed from: e */
    public EnumC14795b f28034e = EnumC14795b.Idle;

    /* renamed from: n */
    public boolean f28043n = false;

    /* renamed from: b */
    public final CopyOnWriteArrayList f28031b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final CopyOnWriteArrayList f28032c = new CopyOnWriteArrayList();

    /* renamed from: h */
    public C15154h f28037h = new C15154h(this);

    public AbstractC14782q(Context context) {
        this.f28030a = context.getApplicationContext();
        this.f28038i = new Handler(context.getMainLooper());
        mo77626a(true);
    }

    /* renamed from: a */
    public void mo77634a() {
        IAlog.m76529a("%sdestroy started", IAlog.m76531a(this));
        m77613k();
        this.f28037h = null;
        AbstractC15471s.m76465a(this.f28039j);
        this.f28039j = null;
        SurfaceTexture surfaceTexture = this.f28040k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f28040k = null;
        }
        Surface surface = this.f28041l;
        if (surface != null) {
            surface.release();
            this.f28041l = null;
        }
        this.f28038i.removeCallbacksAndMessages(null);
        this.f28031b.clear();
        this.f28035f = null;
        this.f28036g = true;
        IAlog.m76529a("%sdestroy finished", IAlog.m76531a(this));
    }

    /* renamed from: a */
    public abstract void mo77632a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo77631a(Surface surface);

    /* renamed from: a */
    public abstract void mo77627a(String str, int i);

    /* renamed from: a */
    public abstract void mo77626a(boolean z);

    /* renamed from: b */
    public abstract int mo77625b();

    /* renamed from: b */
    public abstract void mo77624b(boolean z);

    /* renamed from: c */
    public abstract int mo77623c();

    /* renamed from: c */
    public final void m77622c(boolean z) {
        C14588g c14588g;
        C14746c c14746c = this.f28035f;
        if (c14746c != null && (c14588g = c14746c.f27942a.f29937e) != null) {
            if (z) {
                if (c14588g.f27630c != null && c14588g.f27631d) {
                    IAlog.m76529a("%s mute", "OMVideo");
                    try {
                        c14588g.f27630c.volumeChange(0.0f);
                    } catch (Throwable th) {
                        c14588g.m77784a(th);
                    }
                }
            } else if (c14588g.f27630c != null && c14588g.f27631d) {
                IAlog.m76529a("%s unMute", "OMVideo");
                try {
                    c14588g.f27630c.volumeChange(1.0f);
                } catch (Throwable th2) {
                    c14588g.m77784a(th2);
                }
            }
        }
    }

    /* renamed from: d */
    public abstract String mo77621d();

    /* renamed from: d */
    public abstract void mo77620d(boolean z);

    /* renamed from: e */
    public abstract int mo77619e();

    /* renamed from: f */
    public abstract int mo77618f();

    /* renamed from: g */
    public abstract boolean mo77617g();

    /* renamed from: h */
    public boolean mo77616h() {
        if (this.f28034e == EnumC14795b.Playing) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public abstract void mo77615i();

    /* renamed from: j */
    public abstract void mo77614j();

    /* renamed from: k */
    public final void m77613k() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C15154h c15154h = this.f28037h;
        if (c15154h != null && (scheduledThreadPoolExecutor = c15154h.f29950b) != null) {
            scheduledThreadPoolExecutor.shutdownNow();
            c15154h.f29950b = null;
        }
    }

    /* renamed from: a */
    public final void m77630a(TextureView textureView) {
        TextureView textureView2 = this.f28039j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.f28039j = textureView;
            if (textureView != null) {
                TextureView$SurfaceTextureListenerC14774i textureView$SurfaceTextureListenerC14774i = this.f28042m;
                if (textureView$SurfaceTextureListenerC14774i == null) {
                    textureView$SurfaceTextureListenerC14774i = new TextureView$SurfaceTextureListenerC14774i(this);
                    this.f28042m = textureView$SurfaceTextureListenerC14774i;
                }
                textureView.setSurfaceTextureListener(textureView$SurfaceTextureListenerC14774i);
            }
            if (this.f28040k != null) {
                IAlog.m76529a("%scalling setSurfaceTexture with cached texture", IAlog.m76531a(this));
                if (this.f28039j.getSurfaceTexture() != null && this.f28039j.getSurfaceTexture().equals(this.f28040k)) {
                    IAlog.m76529a("%scalling setSurfaceTexture with cached texture failed", IAlog.m76531a(this));
                    return;
                }
                IAlog.m76529a("%scalling setSurfaceTexture with cached texture success", IAlog.m76531a(this));
                this.f28039j.setSurfaceTexture(this.f28040k);
            }
        }
    }

    /* renamed from: a */
    public static void m77629a(AbstractC14782q abstractC14782q, SurfaceTexture surfaceTexture) {
        boolean z = !surfaceTexture.equals(abstractC14782q.f28040k);
        SurfaceTexture surfaceTexture2 = abstractC14782q.f28040k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        abstractC14782q.f28040k = surfaceTexture;
        Surface surface = abstractC14782q.f28041l;
        if (surface == null || z) {
            if (surface != null) {
                surface.release();
            }
            abstractC14782q.f28041l = new Surface(abstractC14782q.f28040k);
        }
        abstractC14782q.mo77631a(abstractC14782q.f28041l);
    }

    /* renamed from: a */
    public void mo77633a(int i) {
        this.f28038i.post(new RunnableC14777l(this, i));
    }

    /* renamed from: a */
    public final void m77628a(EnumC14795b enumC14795b) {
        if (enumC14795b == this.f28034e) {
            return;
        }
        this.f28034e = enumC14795b;
        if (enumC14795b == EnumC14795b.Playing) {
            C15154h c15154h = this.f28037h;
            if (c15154h != null && c15154h.f29950b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                c15154h.f29950b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(c15154h.f29951c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (enumC14795b == EnumC14795b.Paused || enumC14795b == EnumC14795b.Idle || enumC14795b == EnumC14795b.Completed) {
            m77613k();
        }
        this.f28038i.post(new RunnableC14778m(this, enumC14795b));
    }
}
