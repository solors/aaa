package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.GlUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class GlProgram {

    /* renamed from: a */
    private final int f36081a;

    /* renamed from: b */
    private final Attribute[] f36082b;

    /* renamed from: c */
    private final Uniform[] f36083c;

    /* renamed from: d */
    private final Map<String, Attribute> f36084d;

    /* renamed from: e */
    private final Map<String, Uniform> f36085e;

    /* loaded from: classes4.dex */
    private static final class Attribute {

        /* renamed from: a */
        private final int f36086a;

        /* renamed from: b */
        private final int f36087b;
        @Nullable

        /* renamed from: c */
        private Buffer f36088c;

        /* renamed from: d */
        private int f36089d;
        public final String name;

        private Attribute(String str, int i, int i2) {
            this.name = str;
            this.f36086a = i;
            this.f36087b = i2;
        }

        public static Attribute create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.m72626g(bArr));
            return new Attribute(str, i2, GlProgram.m72628e(i, str));
        }

        public void bind() throws GlUtil.GlException {
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f36087b, this.f36089d, 5126, false, 0, (Buffer) Assertions.checkNotNull(this.f36088c, "call setBuffer before bind"));
            GLES20.glEnableVertexAttribArray(this.f36086a);
            GlUtil.checkGlError();
        }

        public void setBuffer(float[] fArr, int i) {
            this.f36088c = GlUtil.createBuffer(fArr);
            this.f36089d = i;
        }
    }

    /* loaded from: classes4.dex */
    private static final class Uniform {

        /* renamed from: a */
        private final int f36090a;

        /* renamed from: b */
        private final int f36091b;

        /* renamed from: c */
        private final float[] f36092c = new float[16];

        /* renamed from: d */
        private int f36093d;

        /* renamed from: e */
        private int f36094e;

        /* renamed from: f */
        private int f36095f;
        public final String name;

        private Uniform(String str, int i, int i2) {
            this.name = str;
            this.f36090a = i;
            this.f36091b = i2;
        }

        public static Uniform create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.m72626g(bArr));
            return new Uniform(str, GlProgram.m72625h(i, str), iArr2[0]);
        }

        public void bind() throws GlUtil.GlException {
            int i;
            switch (this.f36091b) {
                case 5124:
                    GLES20.glUniform1i(this.f36090a, this.f36093d);
                    return;
                case 5126:
                    GLES20.glUniform1fv(this.f36090a, 1, this.f36092c, 0);
                    GlUtil.checkGlError();
                    return;
                case 35664:
                    GLES20.glUniform2fv(this.f36090a, 1, this.f36092c, 0);
                    GlUtil.checkGlError();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.f36090a, 1, this.f36092c, 0);
                    GlUtil.checkGlError();
                    return;
                case 35675:
                    GLES20.glUniformMatrix3fv(this.f36090a, 1, false, this.f36092c, 0);
                    GlUtil.checkGlError();
                    return;
                case 35676:
                    GLES20.glUniformMatrix4fv(this.f36090a, 1, false, this.f36092c, 0);
                    GlUtil.checkGlError();
                    return;
                case 35678:
                case 35815:
                case 36198:
                    if (this.f36094e != 0) {
                        GLES20.glActiveTexture(this.f36095f + 33984);
                        GlUtil.checkGlError();
                        if (this.f36091b == 35678) {
                            i = 3553;
                        } else {
                            i = 36197;
                        }
                        GlUtil.bindTexture(i, this.f36094e);
                        GLES20.glUniform1i(this.f36090a, this.f36095f);
                        GlUtil.checkGlError();
                        return;
                    }
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                default:
                    throw new IllegalStateException("Unexpected uniform type: " + this.f36091b);
            }
        }

        public void setFloat(float f) {
            this.f36092c[0] = f;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.f36092c, 0, fArr.length);
        }

        public void setInt(int i) {
            this.f36093d = i;
        }

        public void setSamplerTexId(int i, int i2) {
            this.f36094e = i;
            this.f36095f = i2;
        }
    }

    public GlProgram(Context context, String str, String str2) throws IOException, GlUtil.GlException {
        this(loadAsset(context, str), loadAsset(context, str2));
    }

    /* renamed from: d */
    private static void m72629d(int i, int i2, String str) throws GlUtil.GlException {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = true;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            z = false;
        }
        GlUtil.checkGlException(z, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        GlUtil.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static int m72628e(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* renamed from: f */
    private int m72627f(String str) {
        return m72628e(this.f36081a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m72626g(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m72625h(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return Util.fromUtf8Bytes(Util.toByteArray(inputStream));
        } finally {
            Util.closeQuietly(inputStream);
        }
    }

    public void bindAttributesAndUniforms() throws GlUtil.GlException {
        for (Attribute attribute : this.f36082b) {
            attribute.bind();
        }
        for (Uniform uniform : this.f36083c) {
            uniform.bind();
        }
    }

    public void delete() throws GlUtil.GlException {
        GLES20.glDeleteProgram(this.f36081a);
        GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws GlUtil.GlException {
        int m72627f = m72627f(str);
        GLES20.glEnableVertexAttribArray(m72627f);
        GlUtil.checkGlError();
        return m72627f;
    }

    public int getUniformLocation(String str) {
        return m72625h(this.f36081a, str);
    }

    public void setBufferAttribute(String str, float[] fArr, int i) {
        ((Attribute) Assertions.checkNotNull(this.f36084d.get(str))).setBuffer(fArr, i);
    }

    public void setFloatUniform(String str, float f) {
        ((Uniform) Assertions.checkNotNull(this.f36085e.get(str))).setFloat(f);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((Uniform) Assertions.checkNotNull(this.f36085e.get(str))).setFloats(fArr);
    }

    public void setIntUniform(String str, int i) {
        ((Uniform) Assertions.checkNotNull(this.f36085e.get(str))).setInt(i);
    }

    public void setSamplerTexIdUniform(String str, int i, int i2) {
        ((Uniform) Assertions.checkNotNull(this.f36085e.get(str))).setSamplerTexId(i, i2);
    }

    public void use() throws GlUtil.GlException {
        GLES20.glUseProgram(this.f36081a);
        GlUtil.checkGlError();
    }

    public GlProgram(String str, String str2) throws GlUtil.GlException {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f36081a = glCreateProgram;
        GlUtil.checkGlError();
        m72629d(glCreateProgram, 35633, str);
        m72629d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.f36084d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f36082b = new Attribute[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            Attribute create = Attribute.create(this.f36081a, i);
            this.f36082b[i] = create;
            this.f36084d.put(create.name, create);
        }
        this.f36085e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f36081a, 35718, iArr3, 0);
        this.f36083c = new Uniform[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            Uniform create2 = Uniform.create(this.f36081a, i2);
            this.f36083c[i2] = create2;
            this.f36085e.put(create2.name, create2);
        }
        GlUtil.checkGlError();
    }
}
