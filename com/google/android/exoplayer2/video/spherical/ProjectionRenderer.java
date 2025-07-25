package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.GlProgram;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes4.dex */
final class ProjectionRenderer {

    /* renamed from: j */
    private static final float[] f36406j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k */
    private static final float[] f36407k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l */
    private static final float[] f36408l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    private static final float[] f36409m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n */
    private static final float[] f36410n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f36411a;
    @Nullable

    /* renamed from: b */
    private MeshData f36412b;
    @Nullable

    /* renamed from: c */
    private MeshData f36413c;

    /* renamed from: d */
    private GlProgram f36414d;

    /* renamed from: e */
    private int f36415e;

    /* renamed from: f */
    private int f36416f;

    /* renamed from: g */
    private int f36417g;

    /* renamed from: h */
    private int f36418h;

    /* renamed from: i */
    private int f36419i;

    /* loaded from: classes4.dex */
    private static class MeshData {

        /* renamed from: a */
        private final int f36420a;

        /* renamed from: b */
        private final FloatBuffer f36421b;

        /* renamed from: c */
        private final FloatBuffer f36422c;

        /* renamed from: d */
        private final int f36423d;

        public MeshData(Projection.SubMesh subMesh) {
            this.f36420a = subMesh.getVertexCount();
            this.f36421b = GlUtil.createBuffer(subMesh.vertices);
            this.f36422c = GlUtil.createBuffer(subMesh.textureCoords);
            int i = subMesh.mode;
            if (i != 1) {
                if (i != 2) {
                    this.f36423d = 4;
                    return;
                } else {
                    this.f36423d = 6;
                    return;
                }
            }
            this.f36423d = 5;
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
        MeshData meshData;
        float[] fArr2;
        if (z) {
            meshData = this.f36413c;
        } else {
            meshData = this.f36412b;
        }
        if (meshData == null) {
            return;
        }
        int i2 = this.f36411a;
        if (i2 == 1) {
            if (z) {
                fArr2 = f36408l;
            } else {
                fArr2 = f36407k;
            }
        } else if (i2 == 2) {
            if (z) {
                fArr2 = f36410n;
            } else {
                fArr2 = f36409m;
            }
        } else {
            fArr2 = f36406j;
        }
        GLES20.glUniformMatrix3fv(this.f36416f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f36415e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f36419i, 0);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e);
        }
        GLES20.glVertexAttribPointer(this.f36417g, 3, 5126, false, 12, (Buffer) meshData.f36421b);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e2) {
            Log.e("ProjectionRenderer", "Failed to load position data", e2);
        }
        GLES20.glVertexAttribPointer(this.f36418h, 2, 5126, false, 8, (Buffer) meshData.f36422c);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e3) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e3);
        }
        GLES20.glDrawArrays(meshData.f36423d, 0, meshData.f36420a);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e4) {
            Log.e("ProjectionRenderer", "Failed to render", e4);
        }
    }

    public void init() {
        try {
            GlProgram glProgram = new GlProgram("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f36414d = glProgram;
            this.f36415e = glProgram.getUniformLocation("uMvpMatrix");
            this.f36416f = this.f36414d.getUniformLocation("uTexMatrix");
            this.f36417g = this.f36414d.getAttributeArrayLocationAndEnable("aPosition");
            this.f36418h = this.f36414d.getAttributeArrayLocationAndEnable("aTexCoords");
            this.f36419i = this.f36414d.getUniformLocation("uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    public void setProjection(Projection projection) {
        if (!isSupported(projection)) {
            return;
        }
        this.f36411a = projection.stereoMode;
        MeshData meshData = new MeshData(projection.leftMesh.getSubMesh(0));
        this.f36412b = meshData;
        if (!projection.singleMesh) {
            meshData = new MeshData(projection.rightMesh.getSubMesh(0));
        }
        this.f36413c = meshData;
    }

    public void shutdown() {
        GlProgram glProgram = this.f36414d;
        if (glProgram != null) {
            try {
                glProgram.delete();
            } catch (GlUtil.GlException e) {
                Log.e("ProjectionRenderer", "Failed to delete the shader program", e);
            }
        }
    }
}
