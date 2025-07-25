package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: com.applovin.impl.m7 */
/* loaded from: classes2.dex */
public final class RunnableC4819m7 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h */
    private static final int[] f7918h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    private final Handler f7919a;

    /* renamed from: b */
    private final int[] f7920b;

    /* renamed from: c */
    private EGLDisplay f7921c;

    /* renamed from: d */
    private EGLContext f7922d;

    /* renamed from: f */
    private EGLSurface f7923f;

    /* renamed from: g */
    private SurfaceTexture f7924g;

    /* renamed from: com.applovin.impl.m7$b */
    /* loaded from: classes2.dex */
    public static final class C4821b extends RuntimeException {
        private C4821b(String str) {
            super(str);
        }
    }

    /* renamed from: com.applovin.impl.m7$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4822c {
    }

    public RunnableC4819m7(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    private void m97572a() {
    }

    /* renamed from: b */
    private static EGLDisplay m97566b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C4821b("eglInitialize failed");
        }
        throw new C4821b("eglGetDisplay failed");
    }

    /* renamed from: c */
    public SurfaceTexture m97565c() {
        return (SurfaceTexture) AbstractC4100b1.m100583a(this.f7924g);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    /* renamed from: d */
    public void m97564d() {
        this.f7919a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f7924g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f7920b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f7921c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f7921c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f7923f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f7921c, this.f7923f);
            }
            EGLContext eGLContext = this.f7922d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f7921c, eGLContext);
            }
            if (AbstractC5863xp.f12151a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f7921c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f7921c);
            }
            this.f7921c = null;
            this.f7922d = null;
            this.f7923f = null;
            this.f7924g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7919a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m97572a();
        SurfaceTexture surfaceTexture = this.f7924g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC4819m7(Handler handler, InterfaceC4822c interfaceC4822c) {
        this.f7919a = handler;
        this.f7920b = new int[1];
    }

    /* renamed from: a */
    private static EGLConfig m97570a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f7918h, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new C4821b(AbstractC5863xp.m93012a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    /* renamed from: a */
    private static EGLContext m97569a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C4821b("eglCreateContext failed");
    }

    /* renamed from: a */
    private static EGLSurface m97568a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new C4821b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new C4821b("eglMakeCurrent failed");
    }

    /* renamed from: a */
    private static void m97567a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC4000aa.m101011a();
    }

    /* renamed from: a */
    public void m97571a(int i) {
        EGLDisplay m97566b = m97566b();
        this.f7921c = m97566b;
        EGLConfig m97570a = m97570a(m97566b);
        EGLContext m97569a = m97569a(this.f7921c, m97570a, i);
        this.f7922d = m97569a;
        this.f7923f = m97568a(this.f7921c, m97570a, m97569a, i);
        m97567a(this.f7920b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f7920b[0]);
        this.f7924g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }
}
