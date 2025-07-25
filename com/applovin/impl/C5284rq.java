package com.applovin.impl;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.work.Data;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.applovin.impl.rq */
/* loaded from: classes2.dex */
public final class C5284rq extends GLSurfaceView implements InterfaceC5578tq {

    /* renamed from: b */
    public static final /* synthetic */ int f9508b = 0;

    /* renamed from: a */
    private final C5285a f9509a;

    public C5284rq(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(AbstractC5524sq abstractC5524sq) {
        this.f9509a.m95795a(abstractC5524sq);
    }

    public C5284rq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5285a c5285a = new C5285a(this);
        this.f9509a = c5285a;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c5285a);
        setRenderMode(0);
    }

    /* renamed from: com.applovin.impl.rq$a */
    /* loaded from: classes2.dex */
    private static final class C5285a implements GLSurfaceView.Renderer {

        /* renamed from: j */
        private static final float[] f9510j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: k */
        private static final float[] f9511k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: l */
        private static final float[] f9512l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: m */
        private static final String[] f9513m = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: n */
        private static final FloatBuffer f9514n = AbstractC4000aa.m101005a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a */
        private final GLSurfaceView f9515a;

        /* renamed from: b */
        private final int[] f9516b = new int[3];

        /* renamed from: c */
        private final int[] f9517c = new int[3];

        /* renamed from: d */
        private final int[] f9518d = new int[3];

        /* renamed from: e */
        private final int[] f9519e = new int[3];

        /* renamed from: f */
        private final AtomicReference f9520f = new AtomicReference();

        /* renamed from: g */
        private final FloatBuffer[] f9521g = new FloatBuffer[3];

        /* renamed from: h */
        private int f9522h;

        /* renamed from: i */
        private int f9523i;

        public C5285a(GLSurfaceView gLSurfaceView) {
            this.f9515a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f9518d;
                this.f9519e[i] = -1;
                iArr[i] = -1;
            }
        }

        /* renamed from: a */
        public void m95795a(AbstractC5524sq abstractC5524sq) {
            AbstractC4172c8.m100235a(this.f9520f.getAndSet(abstractC5524sq));
            this.f9515a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            AbstractC4172c8.m100235a(this.f9520f.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int m101006a = AbstractC4000aa.m101006a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f9522h = m101006a;
            GLES20.glUseProgram(m101006a);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f9522h, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f9514n);
            this.f9517c[0] = GLES20.glGetAttribLocation(this.f9522h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f9517c[0]);
            this.f9517c[1] = GLES20.glGetAttribLocation(this.f9522h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f9517c[1]);
            this.f9517c[2] = GLES20.glGetAttribLocation(this.f9522h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f9517c[2]);
            AbstractC4000aa.m101011a();
            this.f9523i = GLES20.glGetUniformLocation(this.f9522h, "mColorConversion");
            AbstractC4000aa.m101011a();
            m95796a();
            AbstractC4000aa.m101011a();
        }

        /* renamed from: a */
        private void m95796a() {
            GLES20.glGenTextures(3, this.f9516b, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f9522h, f9513m[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GLES20.glBindTexture(3553, this.f9516b[i]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            AbstractC4000aa.m101011a();
        }
    }

    @Deprecated
    public InterfaceC5578tq getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
