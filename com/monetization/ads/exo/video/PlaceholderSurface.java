package com.monetization.ads.exo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.gq0;
import com.yandex.mobile.ads.impl.q20;

@RequiresApi(17)
/* loaded from: classes7.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: e */
    private static int f66426e;

    /* renamed from: f */
    private static boolean f66427f;

    /* renamed from: b */
    public final boolean f66428b;

    /* renamed from: c */
    private final HandlerThreadC25592a f66429c;

    /* renamed from: d */
    private boolean f66430d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.monetization.ads.exo.video.PlaceholderSurface$a */
    /* loaded from: classes7.dex */
    public static class HandlerThreadC25592a extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        private q20 f66431b;

        /* renamed from: c */
        private Handler f66432c;
        @Nullable

        /* renamed from: d */
        private Error f66433d;
        @Nullable

        /* renamed from: e */
        private RuntimeException f66434e;
        @Nullable

        /* renamed from: f */
        private PlaceholderSurface f66435f;

        public HandlerThreadC25592a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: b */
        private void m44296b(int i) {
            boolean z;
            this.f66431b.getClass();
            this.f66431b.m30538a(i);
            SurfaceTexture m30539a = this.f66431b.m30539a();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f66435f = new PlaceholderSurface(this, m30539a, z);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        this.f66431b.getClass();
                        this.f66431b.m30537b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m44296b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    gq0.m33797a("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f66433d = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    gq0.m33797a("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f66434e = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public final PlaceholderSurface m44298a(int i) {
            boolean z;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f66432c = handler;
            this.f66431b = new q20(handler);
            synchronized (this) {
                z = false;
                this.f66432c.obtainMessage(1, i, 0).sendToTarget();
                while (this.f66435f == null && this.f66434e == null && this.f66433d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f66434e;
            if (runtimeException == null) {
                Error error = this.f66433d;
                if (error == null) {
                    PlaceholderSurface placeholderSurface = this.f66435f;
                    placeholderSurface.getClass();
                    return placeholderSurface;
                }
                throw error;
            }
            throw runtimeException;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m44300a(Context context) {
        boolean z;
        int i;
        synchronized (PlaceholderSurface.class) {
            if (!f66427f) {
                if (ac0.m35928a(context)) {
                    i = ac0.m35924c() ? 1 : 2;
                } else {
                    i = 0;
                }
                f66426e = i;
                f66427f = true;
            }
            z = f66426e != 0;
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f66429c) {
            if (!this.f66430d) {
                HandlerThreadC25592a handlerThreadC25592a = this.f66429c;
                handlerThreadC25592a.f66432c.getClass();
                handlerThreadC25592a.f66432c.sendEmptyMessage(2);
                this.f66430d = true;
            }
        }
    }

    private PlaceholderSurface(HandlerThreadC25592a handlerThreadC25592a, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f66429c = handlerThreadC25592a;
        this.f66428b = z;
    }

    /* renamed from: a */
    public static PlaceholderSurface m44299a(Context context, boolean z) {
        if (!z || m44300a(context)) {
            return new HandlerThreadC25592a().m44298a(z ? f66426e : 0);
        }
        throw new IllegalStateException();
    }
}
