package io.bidmachine.media3.common.util;

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
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public final class GlUtil {
    private static final String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    /* loaded from: classes9.dex */
    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(17)
    /* renamed from: io.bidmachine.media3.common.util.GlUtil$a */
    /* loaded from: classes9.dex */
    public static final class C35903a {
        private C35903a() {
        }

        @DoNotInline
        public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws GlException {
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
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
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), iArr2, 0);
            GlUtil.checkEglException("Error creating surface");
            return eglCreatePbufferSurface;
        }

        @DoNotInline
        public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
            GlUtil.checkEglException("Error creating surface");
            return eglCreateWindowSurface;
        }

        @DoNotInline
        public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            GlUtil.checkEglException("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                GlUtil.checkEglException("Error destroying context");
            }
            EGL14.eglReleaseThread();
            GlUtil.checkEglException("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            GlUtil.checkEglException("Error terminating display");
        }

        @DoNotInline
        public static void destroyEglSurface(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface) throws GlException {
            if (eGLDisplay != null && eGLSurface != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                GlUtil.checkEglException("Error destroying surface");
            }
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
            GlUtil.checkEglException("Error making context current");
            focusFramebufferUsingCurrentContext(i, i2, i3);
        }

        @DoNotInline
        private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new GlException("eglChooseConfig failed.");
        }
    }

    private GlUtil() {
    }

    private static void assertValidTextureSize(int i, int i2) throws GlException {
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
    public static void checkEglException(String str) throws GlException {
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
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    @RequiresApi(17)
    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws GlException {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    @RequiresApi(17)
    public static EGLDisplay createEglDisplay() throws GlException {
        return C35903a.createEglDisplay();
    }

    @RequiresApi(17)
    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlException {
        int[] iArr;
        int[] iArr2;
        if (i != 3 && i != 10) {
            if (i == 6) {
                iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
                if (z) {
                    iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
                } else {
                    iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
                }
            } else if (i == 7) {
                Assertions.checkArgument(z, "Outputting HLG to the screen is not supported.");
                iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
            } else {
                throw new IllegalArgumentException("Unsupported color transfer: " + i);
            }
        } else {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
        }
        return C35903a.createEglSurface(eGLDisplay, obj, iArr, iArr2);
    }

    public static int createExternalTexture() throws GlException {
        int generateTexture = generateTexture();
        bindTexture(36197, generateTexture);
        return generateTexture;
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
        EGLSurface createPbufferSurface;
        if (isSurfacelessContextExtensionSupported()) {
            createPbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            createPbufferSurface = createPbufferSurface(eGLDisplay, 1, 1, iArr);
        }
        focusEglSurface(eGLDisplay, eGLContext, createPbufferSurface, 1, 1);
        return createPbufferSurface;
    }

    @RequiresApi(17)
    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws GlException {
        return C35903a.createEglPbufferSurface(eGLDisplay, iArr, new int[]{12375, i, 12374, i2, 12344});
    }

    public static int createTexture(int i, int i2, boolean z) throws GlException {
        if (z) {
            Assertions.checkState(Util.SDK_INT >= 18, "GLES30 extensions are not supported below API 18.");
            return createTexture(i, i2, 34842, 5131);
        }
        return createTexture(i, i2, 6408, 5121);
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static void deleteFbo(int i) throws GlException {
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i) throws GlException {
        GLES20.glDeleteRenderbuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteTexture(int i) throws GlException {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    @RequiresApi(17)
    public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
        C35903a.destroyEglContext(eGLDisplay, eGLContext);
    }

    @RequiresApi(17)
    public static void destroyEglSurface(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface) throws GlException {
        C35903a.destroyEglSurface(eGLDisplay, eGLSurface);
    }

    @RequiresApi(17)
    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws GlException {
        C35903a.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    @RequiresApi(17)
    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws GlException {
        C35903a.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    @RequiresApi(17)
    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws GlException {
        C35903a.focusFramebufferUsingCurrentContext(i, i2, i3);
    }

    @RequiresApi(17)
    public static EGLSurface focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
        return createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    private static int generateTexture() throws GlException {
        checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020PqExtensionSupported() {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(EXTENSION_COLORSPACE_BT2020_PQ)) {
            return false;
        }
        return true;
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
        if ((i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(EXTENSION_PROTECTED_CONTENT)) {
            return false;
        }
        return true;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String eglQueryString;
        if (Util.SDK_INT < 17 || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT)) {
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
        if (glGetString == null || !glGetString.contains(EXTENSION_YUV_TARGET)) {
            return false;
        }
        return true;
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    private static FloatBuffer createBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    @RequiresApi(17)
    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, @IntRange(from = 2, m105510to = 3) int i, int[] iArr) throws GlException {
        boolean z = false;
        Assertions.checkArgument(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        if (i == 2 || i == 3) {
            z = true;
        }
        Assertions.checkArgument(z);
        return C35903a.createEglContext(eGLContext, eGLDisplay, i, iArr);
    }

    private static int createTexture(int i, int i2, int i3, int i4) throws GlException {
        assertValidTextureSize(i, i2);
        int generateTexture = generateTexture();
        bindTexture(3553, generateTexture);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, ByteBuffer.allocateDirect(i * i2 * 4));
        checkGlError();
        return generateTexture;
    }
}
