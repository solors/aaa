package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.GlUtil;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RequiresApi(17)
/* loaded from: classes4.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int SECURE_MODE_NONE = 0;
    public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
    public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;

    /* renamed from: j */
    private static final int[] f36063j = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f36064b;

    /* renamed from: c */
    private final int[] f36065c;
    @Nullable

    /* renamed from: d */
    private final TextureImageListener f36066d;
    @Nullable

    /* renamed from: f */
    private EGLDisplay f36067f;
    @Nullable

    /* renamed from: g */
    private EGLContext f36068g;
    @Nullable

    /* renamed from: h */
    private EGLSurface f36069h;
    @Nullable

    /* renamed from: i */
    private SurfaceTexture f36070i;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface SecureMode {
    }

    /* loaded from: classes4.dex */
    public interface TextureImageListener {
        void onFrameAvailable();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    private static EGLConfig m72657a(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        boolean z;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f36063j, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            z = true;
        } else {
            z = false;
        }
        GlUtil.checkGlException(z, Util.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    /* renamed from: b */
    private static EGLContext m72656b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws GlUtil.GlException {
        int[] iArr;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        boolean z = false;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z = true;
        }
        GlUtil.checkGlException(z, "eglCreateContext failed");
        return eglCreateContext;
    }

    /* renamed from: c */
    private static EGLSurface m72655c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws GlUtil.GlException {
        int[] iArr;
        EGLSurface eglCreatePbufferSurface;
        boolean z = true;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eglCreatePbufferSurface == null) {
                z = false;
            }
            GlUtil.checkGlException(z, "eglCreatePbufferSurface failed");
        }
        GlUtil.checkGlException(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    /* renamed from: d */
    private void m72654d() {
        TextureImageListener textureImageListener = this.f36066d;
        if (textureImageListener != null) {
            textureImageListener.onFrameAvailable();
        }
    }

    /* renamed from: e */
    private static void m72653e(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.checkGlError();
    }

    /* renamed from: f */
    private static EGLDisplay m72652f() throws GlUtil.GlException {
        boolean z;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        GlUtil.checkGlException(z, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.checkGlException(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture getSurfaceTexture() {
        return (SurfaceTexture) Assertions.checkNotNull(this.f36070i);
    }

    public void init(int i) throws GlUtil.GlException {
        EGLDisplay m72652f = m72652f();
        this.f36067f = m72652f;
        EGLConfig m72657a = m72657a(m72652f);
        EGLContext m72656b = m72656b(this.f36067f, m72657a, i);
        this.f36068g = m72656b;
        this.f36069h = m72655c(this.f36067f, m72657a, m72656b, i);
        m72653e(this.f36065c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f36065c[0]);
        this.f36070i = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f36064b.post(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public void release() {
        this.f36064b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f36070i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f36065c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f36067f;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f36067f;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f36069h;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f36067f, this.f36069h);
            }
            EGLContext eGLContext = this.f36068g;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f36067f, eGLContext);
            }
            if (Util.SDK_INT >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f36067f;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f36067f);
            }
            this.f36067f = null;
            this.f36068g = null;
            this.f36069h = null;
            this.f36070i = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        m72654d();
        SurfaceTexture surfaceTexture = this.f36070i;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public EGLSurfaceTexture(Handler handler, @Nullable TextureImageListener textureImageListener) {
        this.f36064b = handler;
        this.f36066d = textureImageListener;
        this.f36065c = new int[1];
    }
}
