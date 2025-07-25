package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlProgram;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes4.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {

    /* renamed from: c */
    public static final /* synthetic */ int f36314c = 0;

    /* renamed from: b */
    private final Renderer f36315b;

    /* loaded from: classes4.dex */
    private static final class Renderer implements GLSurfaceView.Renderer {

        /* renamed from: m */
        private static final float[] f36316m = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: n */
        private static final float[] f36317n = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: o */
        private static final float[] f36318o = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: p */
        private static final String[] f36319p = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: q */
        private static final FloatBuffer f36320q = GlUtil.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b */
        private final GLSurfaceView f36321b;

        /* renamed from: c */
        private final int[] f36322c = new int[3];

        /* renamed from: d */
        private final int[] f36323d = new int[3];

        /* renamed from: f */
        private final int[] f36324f = new int[3];

        /* renamed from: g */
        private final int[] f36325g = new int[3];

        /* renamed from: h */
        private final AtomicReference<VideoDecoderOutputBuffer> f36326h = new AtomicReference<>();

        /* renamed from: i */
        private final FloatBuffer[] f36327i = new FloatBuffer[3];

        /* renamed from: j */
        private GlProgram f36328j;

        /* renamed from: k */
        private int f36329k;

        /* renamed from: l */
        private VideoDecoderOutputBuffer f36330l;

        public Renderer(GLSurfaceView gLSurfaceView) {
            this.f36321b = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f36324f;
                this.f36325g[i] = -1;
                iArr[i] = -1;
            }
        }

        /* renamed from: a */
        private void m72403a() {
            try {
                GLES20.glGenTextures(3, this.f36322c, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f36328j.getUniformLocation(f36319p[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    GlUtil.bindTexture(3553, this.f36322c[i]);
                }
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            boolean z;
            int i;
            VideoDecoderOutputBuffer andSet = this.f36326h.getAndSet(null);
            if (andSet == null && this.f36330l == null) {
                return;
            }
            if (andSet != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f36330l;
                if (videoDecoderOutputBuffer != null) {
                    videoDecoderOutputBuffer.release();
                }
                this.f36330l = andSet;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) Assertions.checkNotNull(this.f36330l);
            float[] fArr = f36317n;
            int i2 = videoDecoderOutputBuffer2.colorspace;
            if (i2 != 1) {
                if (i2 == 3) {
                    fArr = f36318o;
                }
            } else {
                fArr = f36316m;
            }
            GLES20.glUniformMatrix3fv(this.f36329k, 1, false, fArr, 0);
            int[] iArr = (int[]) Assertions.checkNotNull(videoDecoderOutputBuffer2.yuvStrides);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) Assertions.checkNotNull(videoDecoderOutputBuffer2.yuvPlanes);
            for (int i3 = 0; i3 < 3; i3++) {
                if (i3 == 0) {
                    i = videoDecoderOutputBuffer2.height;
                } else {
                    i = (videoDecoderOutputBuffer2.height + 1) / 2;
                }
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.f36322c[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i, 0, 6409, 5121, byteBufferArr[i3]);
            }
            int i4 = videoDecoderOutputBuffer2.width;
            int i5 = (i4 + 1) / 2;
            int[] iArr2 = {i4, i5, i5};
            for (int i6 = 0; i6 < 3; i6++) {
                if (this.f36324f[i6] != iArr2[i6] || this.f36325g[i6] != iArr[i6]) {
                    if (iArr[i6] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Assertions.checkState(z);
                    float f = iArr2[i6] / iArr[i6];
                    this.f36327i[i6] = GlUtil.createBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.f36323d[i6], 2, 5126, false, 0, (Buffer) this.f36327i[i6]);
                    this.f36324f[i6] = iArr2[i6];
                    this.f36325g[i6] = iArr[i6];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                GlProgram glProgram = new GlProgram("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f36328j = glProgram;
                GLES20.glVertexAttribPointer(glProgram.getAttributeArrayLocationAndEnable("in_pos"), 2, 5126, false, 0, (Buffer) f36320q);
                this.f36323d[0] = this.f36328j.getAttributeArrayLocationAndEnable("in_tc_y");
                this.f36323d[1] = this.f36328j.getAttributeArrayLocationAndEnable("in_tc_u");
                this.f36323d[2] = this.f36328j.getAttributeArrayLocationAndEnable("in_tc_v");
                this.f36329k = this.f36328j.getUniformLocation("mColorConversion");
                GlUtil.checkGlError();
                m72403a();
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }

        public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
            VideoDecoderOutputBuffer andSet = this.f36326h.getAndSet(videoDecoderOutputBuffer);
            if (andSet != null) {
                andSet.release();
            }
            this.f36321b.requestRender();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer
    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.f36315b.setOutputBuffer(videoDecoderOutputBuffer);
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Renderer renderer = new Renderer(this);
        this.f36315b = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
