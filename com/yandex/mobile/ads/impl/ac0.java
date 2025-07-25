package com.yandex.mobile.ads.impl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes8.dex */
public final class ac0 {

    /* renamed from: a */
    private static final bc0 f76753a = ii1.m33271c();

    /* renamed from: b */
    public static final /* synthetic */ int f76754b = 0;

    /* renamed from: a */
    public static void m35929a() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            gq0.m33795b("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            gq0.m33795b("GlUtil", "glError: " + GLU.gluErrorString(i));
        }
    }

    /* renamed from: b */
    public static int m35925b() {
        if (!(!y32.m27076a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT))) {
            gq0.m33795b("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m35929a();
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m35929a();
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9729);
        m35929a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        m35929a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        m35929a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        m35929a();
        return i;
    }

    /* renamed from: c */
    public static boolean m35924c() {
        String eglQueryString;
        if (y32.f88010a < 17 || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static FloatBuffer m35926a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (new java.lang.String(r3, r6).equals(com.yandex.mobile.ads.impl.y32.f88013d) != false) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m35928a(android.content.Context r7) {
        /*
            int r0 = com.yandex.mobile.ads.impl.y32.f88010a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            r1 = 26
            if (r0 >= r1) goto L42
            com.yandex.mobile.ads.impl.bc0 r3 = com.yandex.mobile.ads.impl.ac0.f76753a
            r3.getClass()
            java.lang.String r3 = "c2Ftc3VuZw=="
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.lang.String r4 = "decode(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r3, r6)
            java.lang.String r3 = com.yandex.mobile.ads.impl.y32.f88012c
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L41
            java.lang.String r3 = "WFQxNjUw"
            byte[] r3 = android.util.Base64.decode(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3, r6)
            java.lang.String r3 = com.yandex.mobile.ads.impl.y32.f88013d
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L42
        L41:
            return r2
        L42:
            if (r0 >= r1) goto L51
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r0)
            if (r7 != 0) goto L51
            return r2
        L51:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r2)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r0)
            if (r7 == 0) goto L66
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L66
            r2 = 1
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ac0.m35928a(android.content.Context):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35927a(String str) {
        gq0.m33795b("GlUtil", str);
    }
}
