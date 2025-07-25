package io.bidmachine.media3.common;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.GlUtil;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface GlObjectsProvider {
    @Deprecated
    public static final GlObjectsProvider DEFAULT = new C35802a();

    /* renamed from: io.bidmachine.media3.common.GlObjectsProvider$a */
    /* loaded from: classes9.dex */
    class C35802a implements GlObjectsProvider {
        C35802a() {
        }

        @Override // io.bidmachine.media3.common.GlObjectsProvider
        public GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws GlUtil.GlException {
            return new GlTextureInfo(i, GlUtil.createFboForTexture(i), -1, i2, i3);
        }

        @Override // io.bidmachine.media3.common.GlObjectsProvider
        @RequiresApi(17)
        public EGLContext createEglContext(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException {
            return GlUtil.createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, i, iArr);
        }

        @Override // io.bidmachine.media3.common.GlObjectsProvider
        @RequiresApi(17)
        public EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException {
            return GlUtil.createEglSurface(eGLDisplay, obj, i, z);
        }

        @Override // io.bidmachine.media3.common.GlObjectsProvider
        @RequiresApi(17)
        public EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws GlUtil.GlException {
            return GlUtil.createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, iArr);
        }
    }

    GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws GlUtil.GlException;

    @RequiresApi(17)
    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange(from = 2, m105510to = 3) int i, int[] iArr) throws GlUtil.GlException;

    @RequiresApi(17)
    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException;

    @RequiresApi(17)
    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws GlUtil.GlException;
}
