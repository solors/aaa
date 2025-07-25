package io.bidmachine.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.GlUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final Map<String, C35901a> attributeByName;
    private final C35901a[] attributes;
    private final int programId;
    private final Map<String, C35902b> uniformByName;
    private final C35902b[] uniforms;

    /* renamed from: io.bidmachine.media3.common.util.GlProgram$a */
    /* loaded from: classes9.dex */
    private static final class C35901a {
        @Nullable
        private Buffer buffer;
        private final int index;
        private final int location;
        public final String name;
        private int size;

        private C35901a(String str, int i, int i2) {
            this.name = str;
            this.index = i;
            this.location = i2;
        }

        public static C35901a create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new C35901a(str, i2, GlProgram.getAttributeLocation(i, str));
        }

        public void bind() throws GlUtil.GlException {
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.location, this.size, 5126, false, 0, (Buffer) Assertions.checkNotNull(this.buffer, "call setBuffer before bind"));
            GLES20.glEnableVertexAttribArray(this.index);
            GlUtil.checkGlError();
        }

        public void setBuffer(float[] fArr, int i) {
            this.buffer = GlUtil.createBuffer(fArr);
            this.size = i;
        }
    }

    /* renamed from: io.bidmachine.media3.common.util.GlProgram$b */
    /* loaded from: classes9.dex */
    private static final class C35902b {
        private final float[] floatValue = new float[16];
        private int intValue;
        private final int location;
        public final String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;

        private C35902b(String str, int i, int i2) {
            this.name = str;
            this.location = i;
            this.type = i2;
        }

        public static C35902b create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new C35902b(str, GlProgram.getUniformLocation(i, str), iArr2[0]);
        }

        public void bind() throws GlUtil.GlException {
            int i;
            switch (this.type) {
                case 5124:
                    GLES20.glUniform1i(this.location, this.intValue);
                    return;
                case 5126:
                    GLES20.glUniform1fv(this.location, 1, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case 35664:
                    GLES20.glUniform2fv(this.location, 1, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.location, 1, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case 35675:
                    GLES20.glUniformMatrix3fv(this.location, 1, false, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case 35676:
                    GLES20.glUniformMatrix4fv(this.location, 1, false, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case 35678:
                case GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT /* 35815 */:
                case 36198:
                    if (this.texIdValue != 0) {
                        GLES20.glActiveTexture(this.texUnitIndex + 33984);
                        GlUtil.checkGlError();
                        if (this.type == 35678) {
                            i = 3553;
                        } else {
                            i = 36197;
                        }
                        GlUtil.bindTexture(i, this.texIdValue);
                        GLES20.glUniform1i(this.location, this.texUnitIndex);
                        GlUtil.checkGlError();
                        return;
                    }
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                default:
                    throw new IllegalStateException("Unexpected uniform type: " + this.type);
            }
        }

        public void setFloat(float f) {
            this.floatValue[0] = f;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void setInt(int i) {
            this.intValue = i;
        }

        public void setSamplerTexId(int i, int i2) {
            this.texIdValue = i;
            this.texUnitIndex = i2;
        }
    }

    public GlProgram(Context context, String str, String str2) throws IOException, GlUtil.GlException {
        this(loadAsset(context, str), loadAsset(context, str2));
    }

    private static void addShader(int i, int i2, String str) throws GlUtil.GlException {
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
    public static int getAttributeLocation(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    private static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return Util.fromUtf8Bytes(Util.toByteArray(inputStream));
        } finally {
            Util.closeQuietly(inputStream);
        }
    }

    public void bindAttributesAndUniforms() throws GlUtil.GlException {
        for (C35901a c35901a : this.attributes) {
            c35901a.bind();
        }
        for (C35902b c35902b : this.uniforms) {
            c35902b.bind();
        }
    }

    public void delete() throws GlUtil.GlException {
        GLES20.glDeleteProgram(this.programId);
        GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws GlUtil.GlException {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        GlUtil.checkGlError();
        return attributeLocation;
    }

    public void setBufferAttribute(String str, float[] fArr, int i) {
        ((C35901a) Assertions.checkNotNull(this.attributeByName.get(str))).setBuffer(fArr, i);
    }

    public void setFloatUniform(String str, float f) {
        ((C35902b) Assertions.checkNotNull(this.uniformByName.get(str))).setFloat(f);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((C35902b) Assertions.checkNotNull(this.uniformByName.get(str))).setFloats(fArr);
    }

    public void setIntUniform(String str, int i) {
        ((C35902b) Assertions.checkNotNull(this.uniformByName.get(str))).setInt(i);
    }

    public void setSamplerTexIdUniform(String str, int i, int i2) {
        ((C35902b) Assertions.checkNotNull(this.uniformByName.get(str))).setSamplerTexId(i, i2);
    }

    public void use() throws GlUtil.GlException {
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError();
    }

    public GlProgram(String str, String str2) throws GlUtil.GlException {
        int glCreateProgram = GLES20.glCreateProgram();
        this.programId = glCreateProgram;
        GlUtil.checkGlError();
        addShader(glCreateProgram, 35633, str);
        addShader(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.attributeByName = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.attributes = new C35901a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C35901a create = C35901a.create(this.programId, i);
            this.attributes[i] = create;
            this.attributeByName.put(create.name, create);
        }
        this.uniformByName = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
        this.uniforms = new C35902b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C35902b create2 = C35902b.create(this.programId, i2);
            this.uniforms[i2] = create2;
            this.uniformByName.put(create2.name, create2);
        }
        GlUtil.checkGlError();
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.programId, str);
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.programId, str);
    }
}
