package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;

@RequiresApi(17)
/* loaded from: classes4.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d */
    private static int f36305d;

    /* renamed from: f */
    private static boolean f36306f;

    /* renamed from: b */
    private final PlaceholderSurfaceThread f36307b;

    /* renamed from: c */
    private boolean f36308c;
    public final boolean secure;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        private EGLSurfaceTexture f36309b;

        /* renamed from: c */
        private Handler f36310c;
        @Nullable

        /* renamed from: d */
        private Error f36311d;
        @Nullable

        /* renamed from: f */
        private RuntimeException f36312f;
        @Nullable

        /* renamed from: g */
        private PlaceholderSurface f36313g;

        public PlaceholderSurfaceThread() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: a */
        private void m72405a(int i) throws GlUtil.GlException {
            boolean z;
            Assertions.checkNotNull(this.f36309b);
            this.f36309b.init(i);
            SurfaceTexture surfaceTexture = this.f36309b.getSurfaceTexture();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f36313g = new PlaceholderSurface(this, surfaceTexture, z);
        }

        /* renamed from: b */
        private void m72404b() {
            Assertions.checkNotNull(this.f36309b);
            this.f36309b.release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        m72404b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m72405a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e) {
                    Log.m72605e("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f36312f = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.m72605e("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f36311d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    Log.m72605e("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f36312f = e3;
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

        public PlaceholderSurface init(int i) {
            boolean z;
            start();
            this.f36310c = new Handler(getLooper(), this);
            this.f36309b = new EGLSurfaceTexture(this.f36310c);
            synchronized (this) {
                z = false;
                this.f36310c.obtainMessage(1, i, 0).sendToTarget();
                while (this.f36313g == null && this.f36312f == null && this.f36311d == null) {
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
            RuntimeException runtimeException = this.f36312f;
            if (runtimeException == null) {
                Error error = this.f36311d;
                if (error == null) {
                    return (PlaceholderSurface) Assertions.checkNotNull(this.f36313g);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void release() {
            Assertions.checkNotNull(this.f36310c);
            this.f36310c.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    private static int m72406a(Context context) {
        if (GlUtil.isProtectedContentExtensionSupported(context)) {
            if (GlUtil.isSurfacelessContextExtensionSupported()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            z = true;
            if (!f36306f) {
                f36305d = m72406a(context);
                f36306f = true;
            }
            if (f36305d == 0) {
                z = false;
            }
        }
        return z;
    }

    public static PlaceholderSurface newInstanceV17(Context context, boolean z) {
        boolean z2;
        int i = 0;
        if (z && !isSecureSupported(context)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Assertions.checkState(z2);
        PlaceholderSurfaceThread placeholderSurfaceThread = new PlaceholderSurfaceThread();
        if (z) {
            i = f36305d;
        }
        return placeholderSurfaceThread.init(i);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f36307b) {
            if (!this.f36308c) {
                this.f36307b.release();
                this.f36308c = true;
            }
        }
    }

    private PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f36307b = placeholderSurfaceThread;
        this.secure = z;
    }
}
