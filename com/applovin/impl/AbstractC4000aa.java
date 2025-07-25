package com.applovin.impl;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: com.applovin.impl.aa */
/* loaded from: classes2.dex */
public abstract class AbstractC4000aa {

    /* renamed from: a */
    public static boolean f4539a = false;

    /* renamed from: com.applovin.impl.aa$a */
    /* loaded from: classes2.dex */
    public static final class C4001a extends RuntimeException {
        public C4001a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static void m101009a(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            m101007a(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m101011a();
    }

    /* renamed from: b */
    public static int m101003b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m101011a();
        return iArr[0];
    }

    /* renamed from: c */
    public static boolean m101002c() {
        String eglQueryString;
        if (AbstractC5863xp.f12151a < 17 || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m101011a() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            AbstractC5063oc.m96805b("GlUtil", "glError " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            m101007a("glError " + GLU.gluErrorString(i));
        }
    }

    /* renamed from: a */
    public static FloatBuffer m101010a(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: a */
    public static FloatBuffer m101005a(float[] fArr) {
        return (FloatBuffer) m101010a(fArr.length).put(fArr).flip();
    }

    /* renamed from: a */
    public static boolean m101008a(Context context) {
        String eglQueryString;
        int i = AbstractC5863xp.f12151a;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !("samsung".equals(AbstractC5863xp.f12153c) || "XT1650".equals(AbstractC5863xp.f12154d))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    /* renamed from: a */
    public static int m101004a(String[] strArr, String[] strArr2) {
        return m101006a(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
    }

    /* renamed from: a */
    public static int m101006a(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m101011a();
        m101009a(35633, str, glCreateProgram);
        m101009a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            m101007a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        m101011a();
        return glCreateProgram;
    }

    /* renamed from: a */
    private static void m101007a(String str) {
        AbstractC5063oc.m96805b("GlUtil", str);
        if (f4539a) {
            throw new C4001a(str);
        }
    }
}
