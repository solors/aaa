package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class zb0 {

    /* renamed from: a */
    private final int f88803a;

    /* renamed from: b */
    private final C31968a[] f88804b;

    /* renamed from: c */
    private final C31969b[] f88805c;

    /* renamed from: d */
    private final HashMap f88806d;

    /* renamed from: e */
    private final HashMap f88807e;

    /* renamed from: com.yandex.mobile.ads.impl.zb0$a */
    /* loaded from: classes8.dex */
    private static final class C31968a {

        /* renamed from: a */
        public final String f88808a;

        private C31968a(String str) {
            this.f88808a = str;
        }

        /* renamed from: a */
        public static C31968a m26285a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                } else if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            String str = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i, str);
            return new C31968a(str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zb0$b */
    /* loaded from: classes8.dex */
    private static final class C31969b {

        /* renamed from: a */
        public final String f88809a;

        private C31969b(String str) {
            this.f88809a = str;
        }

        /* renamed from: a */
        public static C31969b m26284a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                } else if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            String str = new String(bArr, 0, i3);
            GLES20.glGetUniformLocation(i, str);
            return new C31969b(str);
        }
    }

    public zb0() {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f88803a = glCreateProgram;
        ac0.m35929a();
        m26288a(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        m26288a(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            ac0.m35927a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        GLES20.glUseProgram(glCreateProgram);
        this.f88806d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f88804b = new C31968a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C31968a m26285a = C31968a.m26285a(this.f88803a, i);
            this.f88804b[i] = m26285a;
            this.f88806d.put(m26285a.f88808a, m26285a);
        }
        this.f88807e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f88803a, 35718, iArr3, 0);
        this.f88805c = new C31969b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C31969b m26284a = C31969b.m26284a(this.f88803a, i2);
            this.f88805c[i2] = m26284a;
            this.f88807e.put(m26284a.f88809a, m26284a);
        }
        ac0.m35929a();
    }

    /* renamed from: a */
    private static void m26288a(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            int i3 = ac0.f76754b;
            gq0.m33795b("GlUtil", GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        ac0.m35929a();
    }

    /* renamed from: b */
    public final int m26286b(String str) {
        return GLES20.glGetUniformLocation(this.f88803a, str);
    }

    /* renamed from: a */
    public final int m26287a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f88803a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        ac0.m35929a();
        return glGetAttribLocation;
    }
}
