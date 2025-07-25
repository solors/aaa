package com.applovin.impl;

import android.opengl.GLES20;
import com.applovin.impl.C4188ci;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: com.applovin.impl.ei */
/* loaded from: classes2.dex */
final class C4333ei {

    /* renamed from: j */
    private static final String[] f5918j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k */
    private static final String[] f5919k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l */
    private static final float[] f5920l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    private static final float[] f5921m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    private static final float[] f5922n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o */
    private static final float[] f5923o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p */
    private static final float[] f5924p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f5925a;

    /* renamed from: b */
    private C4334a f5926b;

    /* renamed from: c */
    private C4334a f5927c;

    /* renamed from: d */
    private int f5928d;

    /* renamed from: e */
    private int f5929e;

    /* renamed from: f */
    private int f5930f;

    /* renamed from: g */
    private int f5931g;

    /* renamed from: h */
    private int f5932h;

    /* renamed from: i */
    private int f5933i;

    /* renamed from: com.applovin.impl.ei$a */
    /* loaded from: classes2.dex */
    private static class C4334a {

        /* renamed from: a */
        private final int f5934a;

        /* renamed from: b */
        private final FloatBuffer f5935b;

        /* renamed from: c */
        private final FloatBuffer f5936c;

        /* renamed from: d */
        private final int f5937d;

        public C4334a(C4188ci.C4190b c4190b) {
            this.f5934a = c4190b.m100182a();
            this.f5935b = AbstractC4000aa.m101005a(c4190b.f5285c);
            this.f5936c = AbstractC4000aa.m101005a(c4190b.f5286d);
            int i = c4190b.f5284b;
            if (i != 1) {
                if (i != 2) {
                    this.f5937d = 4;
                    return;
                } else {
                    this.f5937d = 6;
                    return;
                }
            }
            this.f5937d = 5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m99509a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        C4334a c4334a = z ? this.f5927c : this.f5926b;
        if (c4334a == null) {
            return;
        }
        GLES20.glUseProgram(this.f5928d);
        AbstractC4000aa.m101011a();
        GLES20.glEnableVertexAttribArray(this.f5931g);
        GLES20.glEnableVertexAttribArray(this.f5932h);
        AbstractC4000aa.m101011a();
        int i2 = this.f5925a;
        if (i2 == 1) {
            fArr2 = z ? f5922n : f5921m;
        } else if (i2 == 2) {
            fArr2 = z ? f5924p : f5923o;
        } else {
            fArr2 = f5920l;
        }
        GLES20.glUniformMatrix3fv(this.f5930f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f5929e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f5933i, 0);
        AbstractC4000aa.m101011a();
        GLES20.glVertexAttribPointer(this.f5931g, 3, 5126, false, 12, (Buffer) c4334a.f5935b);
        AbstractC4000aa.m101011a();
        GLES20.glVertexAttribPointer(this.f5932h, 2, 5126, false, 8, (Buffer) c4334a.f5936c);
        AbstractC4000aa.m101011a();
        GLES20.glDrawArrays(c4334a.f5937d, 0, c4334a.f5934a);
        AbstractC4000aa.m101011a();
        GLES20.glDisableVertexAttribArray(this.f5931g);
        GLES20.glDisableVertexAttribArray(this.f5932h);
    }

    /* renamed from: b */
    public void m99507b(C4188ci c4188ci) {
        if (!m99508a(c4188ci)) {
            return;
        }
        this.f5925a = c4188ci.f5280c;
        C4334a c4334a = new C4334a(c4188ci.f5278a.m100183a(0));
        this.f5926b = c4334a;
        if (!c4188ci.f5281d) {
            c4334a = new C4334a(c4188ci.f5279b.m100183a(0));
        }
        this.f5927c = c4334a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m99510a() {
        int m101004a = AbstractC4000aa.m101004a(f5918j, f5919k);
        this.f5928d = m101004a;
        this.f5929e = GLES20.glGetUniformLocation(m101004a, "uMvpMatrix");
        this.f5930f = GLES20.glGetUniformLocation(this.f5928d, "uTexMatrix");
        this.f5931g = GLES20.glGetAttribLocation(this.f5928d, "aPosition");
        this.f5932h = GLES20.glGetAttribLocation(this.f5928d, "aTexCoords");
        this.f5933i = GLES20.glGetUniformLocation(this.f5928d, "uTexture");
    }

    /* renamed from: a */
    public static boolean m99508a(C4188ci c4188ci) {
        C4188ci.C4189a c4189a = c4188ci.f5278a;
        C4188ci.C4189a c4189a2 = c4188ci.f5279b;
        return c4189a.m100184a() == 1 && c4189a.m100183a(0).f5283a == 0 && c4189a2.m100184a() == 1 && c4189a2.m100183a(0).f5283a == 0;
    }
}
