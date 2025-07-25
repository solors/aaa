package com.five_corp.p372ad.internal.movie;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.five_corp.p372ad.internal.logger.C13836a;

/* renamed from: com.five_corp.ad.internal.movie.M */
/* loaded from: classes4.dex */
public final class TextureView$SurfaceTextureListenerC13853M implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final C13836a f25885a;

    /* renamed from: b */
    public final Object f25886b;

    /* renamed from: c */
    public SurfaceTexture f25887c;

    /* renamed from: d */
    public Surface f25888d;

    /* renamed from: e */
    public InterfaceC13852L f25889e;

    /* renamed from: f */
    public Handler f25890f;

    /* renamed from: g */
    public boolean f25891g;

    public TextureView$SurfaceTextureListenerC13853M(TextureView textureView, C13836a c13836a) {
        System.identityHashCode(this);
        this.f25886b = new Object();
        this.f25891g = false;
        this.f25885a = c13836a;
        textureView.setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public final void m78266a() {
        synchronized (this.f25886b) {
            Surface surface = this.f25888d;
            if (surface == null) {
                return;
            }
            this.f25888d = null;
            InterfaceC13852L interfaceC13852L = this.f25889e;
            Handler handler = this.f25890f;
            if (interfaceC13852L == null || handler == null) {
                surface.release();
            } else {
                handler.post(new RunnableC13849I(interfaceC13852L, surface));
            }
        }
    }

    /* renamed from: b */
    public final void m78264b() {
        synchronized (this.f25886b) {
            Surface surface = this.f25888d;
            if (surface != null) {
                this.f25891g = false;
            } else if (this.f25887c != null) {
                this.f25891g = false;
                surface = new Surface(this.f25887c);
                this.f25888d = surface;
            } else {
                this.f25891g = true;
                return;
            }
            InterfaceC13852L interfaceC13852L = this.f25889e;
            Handler handler = this.f25890f;
            if (interfaceC13852L != null && handler != null) {
                handler.post(new RunnableC13848H(interfaceC13852L, surface));
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface;
        boolean z;
        InterfaceC13852L interfaceC13852L;
        Handler handler;
        try {
            synchronized (this.f25886b) {
                this.f25887c = surfaceTexture;
                surface = new Surface(surfaceTexture);
                this.f25888d = surface;
                z = this.f25891g;
                this.f25891g = false;
                interfaceC13852L = this.f25889e;
                handler = this.f25890f;
            }
            if (interfaceC13852L != null && handler != null && z) {
                handler.post(new RunnableC13850J(interfaceC13852L, surface));
            }
        } catch (Throwable th) {
            this.f25885a.m78269a(th);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        try {
            synchronized (this.f25886b) {
                if (this.f25887c != surfaceTexture) {
                    return true;
                }
                this.f25887c = null;
                Surface surface = this.f25888d;
                if (surface == null) {
                    return true;
                }
                this.f25888d = null;
                InterfaceC13852L interfaceC13852L = this.f25889e;
                Handler handler = this.f25890f;
                if (interfaceC13852L == null || handler == null) {
                    return true;
                }
                handler.post(new RunnableC13851K(interfaceC13852L, surface, surfaceTexture));
                return false;
            }
        } catch (Throwable th) {
            this.f25885a.m78269a(th);
            return true;
        }
    }

    /* renamed from: a */
    public final void m78265a(InterfaceC13852L interfaceC13852L, Handler handler) {
        synchronized (this.f25886b) {
            this.f25891g = false;
            this.f25889e = interfaceC13852L;
            this.f25890f = handler;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
