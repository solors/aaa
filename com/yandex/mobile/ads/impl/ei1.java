package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ci1;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes8.dex */
final class ei1 {

    /* renamed from: i */
    private static final float[] f78624i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j */
    private static final float[] f78625j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final float[] f78626k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f78627a;
    @Nullable

    /* renamed from: b */
    private C30250a f78628b;

    /* renamed from: c */
    private zb0 f78629c;

    /* renamed from: d */
    private int f78630d;

    /* renamed from: e */
    private int f78631e;

    /* renamed from: f */
    private int f78632f;

    /* renamed from: g */
    private int f78633g;

    /* renamed from: h */
    private int f78634h;

    /* renamed from: com.yandex.mobile.ads.impl.ei1$a */
    /* loaded from: classes8.dex */
    private static class C30250a {

        /* renamed from: a */
        private final int f78635a;

        /* renamed from: b */
        private final FloatBuffer f78636b;

        /* renamed from: c */
        private final FloatBuffer f78637c;

        /* renamed from: d */
        private final int f78638d;

        public C30250a(ci1.C30096b c30096b) {
            this.f78635a = c30096b.m35228a();
            this.f78636b = ac0.m35926a(c30096b.f77639c);
            this.f78637c = ac0.m35926a(c30096b.f77640d);
            int i = c30096b.f77638b;
            if (i != 1) {
                if (i != 2) {
                    this.f78638d = 4;
                    return;
                } else {
                    this.f78638d = 6;
                    return;
                }
            }
            this.f78638d = 5;
        }
    }

    /* renamed from: a */
    public final void m34561a(int i, float[] fArr) {
        float[] fArr2;
        C30250a c30250a = this.f78628b;
        if (c30250a == null) {
            return;
        }
        int i2 = this.f78627a;
        if (i2 == 1) {
            fArr2 = f78625j;
        } else if (i2 == 2) {
            fArr2 = f78626k;
        } else {
            fArr2 = f78624i;
        }
        GLES20.glUniformMatrix3fv(this.f78631e, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f78630d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f78634h, 0);
        ac0.m35929a();
        GLES20.glVertexAttribPointer(this.f78632f, 3, 5126, false, 12, (Buffer) c30250a.f78636b);
        ac0.m35929a();
        GLES20.glVertexAttribPointer(this.f78633g, 2, 5126, false, 8, (Buffer) c30250a.f78637c);
        ac0.m35929a();
        GLES20.glDrawArrays(c30250a.f78638d, 0, c30250a.f78635a);
        ac0.m35929a();
    }

    /* renamed from: a */
    public final void m34562a() {
        zb0 zb0Var = new zb0();
        this.f78629c = zb0Var;
        this.f78630d = zb0Var.m26286b("uMvpMatrix");
        this.f78631e = this.f78629c.m26286b("uTexMatrix");
        this.f78632f = this.f78629c.m26287a("aPosition");
        this.f78633g = this.f78629c.m26287a("aTexCoords");
        this.f78634h = this.f78629c.m26286b("uTexture");
    }

    /* renamed from: a */
    public final void m34560a(ci1 ci1Var) {
        ci1.C30095a c30095a = ci1Var.f77632a;
        ci1.C30095a c30095a2 = ci1Var.f77633b;
        if (c30095a.m35229b() == 1 && c30095a.m35230a().f77637a == 0 && c30095a2.m35229b() == 1 && c30095a2.m35230a().f77637a == 0) {
            this.f78627a = ci1Var.f77634c;
            this.f78628b = new C30250a(ci1Var.f77632a.m35230a());
            if (ci1Var.f77635d) {
                return;
            }
            new C30250a(ci1Var.f77633b.m35230a());
        }
    }
}
