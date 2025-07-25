package com.unity3d.ads.p620gl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EglSurfaceBase.kt */
@Metadata
/* renamed from: com.unity3d.ads.gl.EglSurfaceBase */
/* loaded from: classes7.dex */
public class EglSurfaceBase {
    private EGLSurface mEGLSurface;
    @NotNull
    private EglCore mEglCore;
    private int mHeight;
    private int mWidth;

    /* JADX INFO: Access modifiers changed from: protected */
    public EglSurfaceBase(@NotNull EglCore eglCore) {
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mEglCore = eglCore;
    }

    public final void createOffscreenSurface(int i, int i2) {
        boolean z;
        if (this.mEGLSurface == EGL14.EGL_NO_SURFACE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.mEGLSurface = this.mEglCore.createOffscreenSurface(i, i2);
            this.mWidth = i;
            this.mHeight = i2;
            return;
        }
        throw new IllegalStateException("surface already created".toString());
    }

    public final void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public final void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mHeight = -1;
        this.mWidth = -1;
    }
}
