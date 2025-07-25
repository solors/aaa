package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class GlUtil {
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: a */
    private static final int[] f36096a = {12344};

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(17)
    /* loaded from: classes4.dex */
    public static final class Api17 {
        private Api17() {
        }

        @DoNotInline
        /* renamed from: a */
        private static EGLConfig m72617a(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new GlException("eglChooseConfig failed.");
        }

        @DoNotInline
        public static EGLContext createEglContext(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlException {
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, m72617a(eGLDisplay, iArr), EGL14.EGL_NO_CONTEXT, new int[]{12440, i, 12344}, 0);
            if (eglCreateContext != null) {
                GlUtil.checkGlError();
                return eglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
        }

        @DoNotInline
        public static EGLDisplay createEglDisplay() throws GlException {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.checkGlException(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            GlUtil.checkGlException(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
            GlUtil.checkGlError();
            return eglGetDisplay;
        }

        @DoNotInline
        public static EGLSurface createEglPbufferSurface(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, m72617a(eGLDisplay, iArr), iArr2, 0);
            GlUtil.m72622c("Error creating surface");
            return eglCreatePbufferSurface;
        }

        @DoNotInline
        public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            GlUtil.m72622c("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                GlUtil.m72622c("Error destroying context");
            }
            EGL14.eglReleaseThread();
            GlUtil.m72622c("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            GlUtil.m72622c("Error terminating display");
        }

        @DoNotInline
        public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws GlException {
            GlUtil.checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i) {
                GLES20.glBindFramebuffer(36160, i);
            }
            GlUtil.checkGlError();
            GLES20.glViewport(0, 0, i2, i3);
            GlUtil.checkGlError();
        }

        @DoNotInline
        public static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws GlException {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GlUtil.m72622c("Error making context current");
            focusFramebufferUsingCurrentContext(i, i2, i3);
        }

        @DoNotInline
        public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, m72617a(eGLDisplay, iArr), obj, iArr2, 0);
            GlUtil.m72622c("Error creating surface");
            return eglCreateWindowSurface;
        }
    }

    /* loaded from: classes4.dex */
    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    private GlUtil() {
    }

    /* renamed from: b */
    private static void m72623b(int i, int i2) throws GlException {
        boolean z = true;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        if (i3 <= 0) {
            z = false;
        }
        Assertions.checkState(z, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i >= 0 && i2 >= 0) {
            if (i <= i3 && i2 <= i3) {
                return;
            }
            throw new GlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + i3);
        }
        throw new GlException("width or height is less than 0");
    }

    public static void bindTexture(int i, int i2) throws GlException {
        GLES20.glBindTexture(i, i2);
        checkGlError();
        GLES20.glTexParameteri(i, Data.MAX_DATA_BYTES, 9729);
        checkGlError();
        GLES20.glTexParameteri(i, 10241, 9729);
        checkGlError();
        GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m72622c(String str) throws GlException {
        boolean z;
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            z = true;
        } else {
            z = false;
        }
        checkGlException(z, str + ", error code: " + eglGetError);
    }

    public static void checkGlError() throws GlException {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (!z) {
            return;
        }
        throw new GlException(sb2.toString());
    }

    public static void checkGlException(boolean z, String str) throws GlException {
        if (z) {
            return;
        }
        throw new GlException(str);
    }

    public static void clearOutputFrame() throws GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) m72621d(fArr.length).put(fArr).flip();
    }

    @RequiresApi(17)
    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws GlException {
        return createEglContext(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    @RequiresApi(17)
    public static EGLDisplay createEglDisplay() throws GlException {
        return Api17.createEglDisplay();
    }

    public static int createExternalTexture() throws GlException {
        int m72618g = m72618g();
        bindTexture(36197, m72618g);
        return m72618g;
    }

    public static int createFboForTexture(int i) throws GlException {
        checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    @RequiresApi(17)
    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        EGLSurface m72620e;
        if (isSurfacelessContextExtensionSupported()) {
            m72620e = EGL14.EGL_NO_SURFACE;
        } else {
            m72620e = m72620e(eGLDisplay, 1, 1, iArr);
        }
        focusEglSurface(eGLDisplay, eGLContext, m72620e, 1, 1);
        return m72620e;
    }

    public static int createTexture(int i, int i2, boolean z) throws GlException {
        boolean z2;
        if (z) {
            if (Util.SDK_INT >= 18) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkState(z2, "GLES30 extensions are not supported below API 18.");
            return m72619f(i, i2, 34842, 5131);
        }
        return m72619f(i, i2, 6408, 5121);
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    /* renamed from: d */
    private static FloatBuffer m72621d(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static void deleteTexture(int i) throws GlException {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    @RequiresApi(17)
    public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
        Api17.destroyEglContext(eGLDisplay, eGLContext);
    }

    @RequiresApi(17)
    /* renamed from: e */
    private static EGLSurface m72620e(EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws GlException {
        return Api17.createEglPbufferSurface(eGLDisplay, iArr, new int[]{12375, i, 12374, i2, 12344});
    }

    /* renamed from: f */
    private static int m72619f(int i, int i2, int i3, int i4) throws GlException {
        m72623b(i, i2);
        int m72618g = m72618g();
        bindTexture(3553, m72618g);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, ByteBuffer.allocateDirect(i * i2 * 4));
        checkGlError();
        return m72618g;
    }

    @RequiresApi(17)
    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws GlException {
        Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    @RequiresApi(17)
    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws GlException {
        Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    @RequiresApi(17)
    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws GlException {
        Api17.focusFramebufferUsingCurrentContext(i, i2, i3);
    }

    @RequiresApi(17)
    public static EGLSurface focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
        return createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    /* renamed from: g */
    private static int m72618g() throws GlException {
        checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    @RequiresApi(17)
    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) throws GlException {
        return Api17.getEglSurface(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_8888, f36096a);
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String eglQueryString;
        int i = Util.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return false;
        }
        if ((i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")) {
            return false;
        }
        return true;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String eglQueryString;
        if (Util.SDK_INT < 17 || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return false;
        }
        return true;
    }

    public static boolean isYuvTargetExtensionSupported() {
        String glGetString;
        if (Util.SDK_INT < 17) {
            return false;
        }
        if (Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay createEglDisplay = createEglDisplay();
                EGLContext createEglContext = createEglContext(createEglDisplay);
                focusPlaceholderEglSurface(createEglContext, createEglDisplay);
                glGetString = GLES20.glGetString(7939);
                destroyEglContext(createEglDisplay, createEglContext);
            } catch (GlException unused) {
                return false;
            }
        } else {
            glGetString = GLES20.glGetString(7939);
        }
        if (glGetString == null || !glGetString.contains("GL_EXT_YUV_target")) {
            return false;
        }
        return true;
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    @RequiresApi(17)
    public static EGLContext createEglContext(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        Assertions.checkArgument(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        return Api17.createEglContext(eGLDisplay, Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102) ? 3 : 2, iArr);
    }

    @RequiresApi(17)
    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr) throws GlException {
        return Api17.getEglSurface(eGLDisplay, obj, iArr, f36096a);
    }
}
