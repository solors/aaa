package com.yandex.mobile.ads.impl;

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
import java.util.Locale;

@RequiresApi(17)
/* loaded from: classes8.dex */
public final class q20 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h */
    private static final int[] f84163h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f84164b;

    /* renamed from: c */
    private final int[] f84165c = new int[1];
    @Nullable

    /* renamed from: d */
    private EGLDisplay f84166d;
    @Nullable

    /* renamed from: e */
    private EGLContext f84167e;
    @Nullable

    /* renamed from: f */
    private EGLSurface f84168f;
    @Nullable

    /* renamed from: g */
    private SurfaceTexture f84169g;

    /* renamed from: com.yandex.mobile.ads.impl.q20$a */
    /* loaded from: classes8.dex */
    public static final class C31170a extends RuntimeException {
        private C31170a(String str) {
            super(str);
        }
    }

    public q20(Handler handler) {
        this.f84164b = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture m30539a() {
        SurfaceTexture surfaceTexture = this.f84169g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    /* renamed from: b */
    public final void m30537b() {
        this.f84164b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f84169g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f84165c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f84166d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f84166d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f84168f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f84166d, this.f84168f);
            }
            EGLContext eGLContext = this.f84167e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f84166d, eGLContext);
            }
            if (y32.f88010a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f84166d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f84166d);
            }
            this.f84166d = null;
            this.f84167e = null;
            this.f84168f = null;
            this.f84169g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f84164b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f84169g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void m30538a(int i) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.f84166d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f84163h, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (eglChooseConfig && iArr2[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f84166d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                    if (eglCreateContext != null) {
                        this.f84167e = eglCreateContext;
                        EGLDisplay eGLDisplay = this.f84166d;
                        if (i == 1) {
                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                            if (eglCreatePbufferSurface == null) {
                                throw new C31170a("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            this.f84168f = eglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f84165c, 0);
                            ac0.m35929a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f84165c[0]);
                            this.f84169g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new C31170a("eglMakeCurrent failed");
                    }
                    throw new C31170a("eglCreateContext failed");
                }
                Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
                int i2 = y32.f88010a;
                throw new C31170a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
            }
            throw new C31170a("eglInitialize failed");
        }
        throw new C31170a("eglGetDisplay failed");
    }
}
