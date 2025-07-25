package io.bidmachine.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.GlProgram;
import io.bidmachine.media3.common.util.GlUtil;
import io.bidmachine.media3.exoplayer.video.spherical.Projection;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: io.bidmachine.media3.exoplayer.video.spherical.c */
/* loaded from: classes9.dex */
final class ProjectionRenderer {
    private static final String FRAGMENT_SHADER = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";
    private static final String TAG = "ProjectionRenderer";
    private static final String VERTEX_SHADER = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";
    @Nullable
    private C36509a leftMeshData;
    private int mvpMatrixHandle;
    private int positionHandle;
    private GlProgram program;
    @Nullable
    private C36509a rightMeshData;
    private int stereoMode;
    private int texCoordsHandle;
    private int textureHandle;
    private int uTexMatrixHandle;
    private static final float[] TEX_MATRIX_WHOLE = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_TOP = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] TEX_MATRIX_BOTTOM = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_LEFT = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_RIGHT = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* compiled from: ProjectionRenderer.java */
    /* renamed from: io.bidmachine.media3.exoplayer.video.spherical.c$a */
    /* loaded from: classes9.dex */
    private static class C36509a {
        private final int drawMode;
        private final FloatBuffer textureBuffer;
        private final FloatBuffer vertexBuffer;
        private final int vertexCount;

        public C36509a(Projection.SubMesh subMesh) {
            this.vertexCount = subMesh.getVertexCount();
            this.vertexBuffer = GlUtil.createBuffer(subMesh.vertices);
            this.textureBuffer = GlUtil.createBuffer(subMesh.textureCoords);
            int i = subMesh.mode;
            if (i != 1) {
                if (i != 2) {
                    this.drawMode = 4;
                    return;
                } else {
                    this.drawMode = 6;
                    return;
                }
            }
            this.drawMode = 5;
        }
    }

    public static boolean isSupported(Projection projection) {
        Projection.Mesh mesh = projection.leftMesh;
        Projection.Mesh mesh2 = projection.rightMesh;
        if (mesh.getSubMeshCount() != 1 || mesh.getSubMesh(0).textureId != 0 || mesh2.getSubMeshCount() != 1 || mesh2.getSubMesh(0).textureId != 0) {
            return false;
        }
        return true;
    }

    public void draw(int i, float[] fArr, boolean z) {
        C36509a c36509a;
        float[] fArr2;
        if (z) {
            c36509a = this.rightMeshData;
        } else {
            c36509a = this.leftMeshData;
        }
        if (c36509a == null) {
            return;
        }
        int i2 = this.stereoMode;
        if (i2 == 1) {
            if (z) {
                fArr2 = TEX_MATRIX_BOTTOM;
            } else {
                fArr2 = TEX_MATRIX_TOP;
            }
        } else if (i2 == 2) {
            if (z) {
                fArr2 = TEX_MATRIX_RIGHT;
            } else {
                fArr2 = TEX_MATRIX_LEFT;
            }
        } else {
            fArr2 = TEX_MATRIX_WHOLE;
        }
        GLES20.glUniformMatrix3fv(this.uTexMatrixHandle, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.mvpMatrixHandle, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.textureHandle, 0);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e) {
            Log.e(TAG, "Failed to bind uniforms", e);
        }
        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) c36509a.vertexBuffer);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e2) {
            Log.e(TAG, "Failed to load position data", e2);
        }
        GLES20.glVertexAttribPointer(this.texCoordsHandle, 2, 5126, false, 8, (Buffer) c36509a.textureBuffer);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e3) {
            Log.e(TAG, "Failed to load texture data", e3);
        }
        GLES20.glDrawArrays(c36509a.drawMode, 0, c36509a.vertexCount);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e4) {
            Log.e(TAG, "Failed to render", e4);
        }
    }

    public void init() {
        try {
            GlProgram glProgram = new GlProgram(VERTEX_SHADER, FRAGMENT_SHADER);
            this.program = glProgram;
            this.mvpMatrixHandle = glProgram.getUniformLocation("uMvpMatrix");
            this.uTexMatrixHandle = this.program.getUniformLocation("uTexMatrix");
            this.positionHandle = this.program.getAttributeArrayLocationAndEnable("aPosition");
            this.texCoordsHandle = this.program.getAttributeArrayLocationAndEnable("aTexCoords");
            this.textureHandle = this.program.getUniformLocation("uTexture");
        } catch (GlUtil.GlException e) {
            Log.e(TAG, "Failed to initialize the program", e);
        }
    }

    public void setProjection(Projection projection) {
        if (!isSupported(projection)) {
            return;
        }
        this.stereoMode = projection.stereoMode;
        C36509a c36509a = new C36509a(projection.leftMesh.getSubMesh(0));
        this.leftMeshData = c36509a;
        if (!projection.singleMesh) {
            c36509a = new C36509a(projection.rightMesh.getSubMesh(0));
        }
        this.rightMeshData = c36509a;
    }

    public void shutdown() {
        GlProgram glProgram = this.program;
        if (glProgram != null) {
            try {
                glProgram.delete();
            } catch (GlUtil.GlException e) {
                Log.e(TAG, "Failed to delete the shader program", e);
            }
        }
    }
}
