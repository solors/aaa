package io.bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.EGLSurfaceTexture;
import io.bidmachine.media3.common.util.GlUtil;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;

@RequiresApi(17)
@UnstableApi
/* loaded from: classes9.dex */
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final HandlerThreadC36490b thread;
    private boolean threadReleased;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.media3.exoplayer.video.PlaceholderSurface$b */
    /* loaded from: classes9.dex */
    public static class HandlerThreadC36490b extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        @Nullable
        private Error initError;
        @Nullable
        private RuntimeException initException;
        @Nullable
        private PlaceholderSurface surface;

        public HandlerThreadC36490b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void initInternal(int i) throws GlUtil.GlException {
            boolean z;
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.init(i);
            SurfaceTexture surfaceTexture = this.eglSurfaceTexture.getSurfaceTexture();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.surface = new PlaceholderSurface(this, surfaceTexture, z);
        }

        private void releaseInternal() {
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.release();
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
                        releaseInternal();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e) {
                    Log.m19948e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e);
                    this.initException = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.m19948e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e2);
                    this.initError = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    Log.m19948e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e3);
                    this.initException = e3;
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
            this.handler = new Handler(getLooper(), this);
            this.eglSurfaceTexture = new EGLSurfaceTexture(this.handler);
            synchronized (this) {
                z = false;
                this.handler.obtainMessage(1, i, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
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
            RuntimeException runtimeException = this.initException;
            if (runtimeException == null) {
                Error error = this.initError;
                if (error == null) {
                    return (PlaceholderSurface) Assertions.checkNotNull(this.surface);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void release() {
            Assertions.checkNotNull(this.handler);
            this.handler.sendEmptyMessage(2);
        }
    }

    private static int getSecureMode(Context context) {
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
            if (!secureModeInitialized) {
                secureMode = getSecureMode(context);
                secureModeInitialized = true;
            }
            if (secureMode == 0) {
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
        HandlerThreadC36490b handlerThreadC36490b = new HandlerThreadC36490b();
        if (z) {
            i = secureMode;
        }
        return handlerThreadC36490b.init(i);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.release();
                this.threadReleased = true;
            }
        }
    }

    private PlaceholderSurface(HandlerThreadC36490b handlerThreadC36490b, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = handlerThreadC36490b;
        this.secure = z;
    }
}
