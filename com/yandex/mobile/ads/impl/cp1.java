package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class cp1 implements y82, InterfaceC31671vm {

    /* renamed from: j */
    private int f77719j;

    /* renamed from: k */
    private SurfaceTexture f77720k;
    @Nullable

    /* renamed from: n */
    private byte[] f77723n;

    /* renamed from: b */
    private final AtomicBoolean f77711b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f77712c = new AtomicBoolean(true);

    /* renamed from: d */
    private final ei1 f77713d = new ei1();

    /* renamed from: e */
    private final ca0 f77714e = new ca0();

    /* renamed from: f */
    private final f02<Long> f77715f = new f02<>();

    /* renamed from: g */
    private final f02<ci1> f77716g = new f02<>();

    /* renamed from: h */
    private final float[] f77717h = new float[16];

    /* renamed from: i */
    private final float[] f77718i = new float[16];

    /* renamed from: l */
    private volatile int f77721l = 0;

    /* renamed from: m */
    private int f77722m = -1;

    @Override // com.yandex.mobile.ads.impl.InterfaceC31671vm
    /* renamed from: f */
    public final void mo28258f() {
        this.f77715f.m34401a();
        this.f77714e.m35327a();
        this.f77712c.set(true);
    }

    /* renamed from: a */
    public final void m35187a(float[] fArr) {
        GLES20.glClear(16384);
        ac0.m35929a();
        if (this.f77711b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f77720k;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            ac0.m35929a();
            if (this.f77712c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f77717h, 0);
            }
            long timestamp = this.f77720k.getTimestamp();
            Long m34400a = this.f77715f.m34400a(timestamp);
            if (m34400a != null) {
                this.f77714e.m35326a(m34400a.longValue(), this.f77717h);
            }
            ci1 m34397b = this.f77716g.m34397b(timestamp);
            if (m34397b != null) {
                this.f77713d.m34560a(m34397b);
            }
        }
        Matrix.multiplyMM(this.f77718i, 0, fArr, 0, this.f77717h, 0);
        this.f77713d.m34561a(this.f77719j, this.f77718i);
    }

    /* renamed from: a */
    public final SurfaceTexture m35191a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        ac0.m35929a();
        this.f77713d.m34562a();
        ac0.m35929a();
        this.f77719j = ac0.m35925b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f77719j);
        this.f77720k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.yandex.mobile.ads.impl.sl2
            {
                cp1.this = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                cp1.this.m35189a(surfaceTexture2);
            }
        });
        return this.f77720k;
    }

    /* renamed from: a */
    public /* synthetic */ void m35189a(SurfaceTexture surfaceTexture) {
        this.f77711b.set(true);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31671vm
    /* renamed from: a */
    public final void mo28259a(long j, float[] fArr) {
        this.f77714e.m35324b(j, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0059, code lost:
        if (r6.m35230a().f77637a == 0) goto L23;
     */
    @Override // com.yandex.mobile.ads.impl.y82
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo26984a(long r33, long r35, com.yandex.mobile.ads.impl.v90 r37, @androidx.annotation.Nullable android.media.MediaFormat r38) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cp1.mo26984a(long, long, com.yandex.mobile.ads.impl.v90, android.media.MediaFormat):void");
    }

    /* renamed from: a */
    public final void m35190a(int i) {
        this.f77721l = i;
    }
}
