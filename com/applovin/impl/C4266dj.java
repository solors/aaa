package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.dj */
/* loaded from: classes2.dex */
public final class C4266dj implements InterfaceC5656uq, InterfaceC5672v2 {

    /* renamed from: j */
    private int f5661j;

    /* renamed from: k */
    private SurfaceTexture f5662k;

    /* renamed from: n */
    private byte[] f5665n;

    /* renamed from: a */
    private final AtomicBoolean f5653a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f5654b = new AtomicBoolean(true);

    /* renamed from: c */
    private final C4333ei f5655c = new C4333ei();

    /* renamed from: d */
    private final C4642j9 f5656d = new C4642j9();

    /* renamed from: f */
    private final C4342eo f5657f = new C4342eo();

    /* renamed from: g */
    private final C4342eo f5658g = new C4342eo();

    /* renamed from: h */
    private final float[] f5659h = new float[16];

    /* renamed from: i */
    private final float[] f5660i = new float[16];

    /* renamed from: l */
    private volatile int f5663l = 0;

    /* renamed from: m */
    private int f5664m = -1;

    /* renamed from: b */
    public SurfaceTexture m99750b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        AbstractC4000aa.m101011a();
        this.f5655c.m99510a();
        AbstractC4000aa.m101011a();
        this.f5661j = AbstractC4000aa.m101003b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f5661j);
        this.f5662k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.applovin.impl.vu
            {
                C4266dj.this = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C4266dj.this.m99754a(surfaceTexture2);
            }
        });
        return this.f5662k;
    }

    /* renamed from: a */
    public void m99751a(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        AbstractC4000aa.m101011a();
        if (this.f5653a.compareAndSet(true, false)) {
            ((SurfaceTexture) AbstractC4100b1.m100583a(this.f5662k)).updateTexImage();
            AbstractC4000aa.m101011a();
            if (this.f5654b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f5659h, 0);
            }
            long timestamp = this.f5662k.getTimestamp();
            Long l = (Long) this.f5657f.m99473b(timestamp);
            if (l != null) {
                this.f5656d.m98285a(this.f5659h, l.longValue());
            }
            C4188ci c4188ci = (C4188ci) this.f5658g.m99470c(timestamp);
            if (c4188ci != null) {
                this.f5655c.m99507b(c4188ci);
            }
        }
        Matrix.multiplyMM(this.f5660i, 0, fArr, 0, this.f5659h, 0);
        this.f5655c.m99509a(this.f5661j, this.f5660i, z);
    }

    /* renamed from: a */
    public /* synthetic */ void m99754a(SurfaceTexture surfaceTexture) {
        this.f5653a.set(true);
    }

    @Override // com.applovin.impl.InterfaceC5672v2
    /* renamed from: a */
    public void mo93977a(long j, float[] fArr) {
        this.f5656d.m98286a(j, fArr);
    }

    @Override // com.applovin.impl.InterfaceC5672v2
    /* renamed from: a */
    public void mo93978a() {
        this.f5657f.m99479a();
        this.f5656d.m98287a();
        this.f5654b.set(true);
    }

    @Override // com.applovin.impl.InterfaceC5656uq
    /* renamed from: a */
    public void mo94004a(long j, long j2, C4310e9 c4310e9, MediaFormat mediaFormat) {
        this.f5657f.m99476a(j2, Long.valueOf(j));
        m99752a(c4310e9.f5823w, c4310e9.f5824x, j2);
    }

    /* renamed from: a */
    public void m99755a(int i) {
        this.f5663l = i;
    }

    /* renamed from: a */
    private void m99752a(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f5665n;
        int i2 = this.f5664m;
        this.f5665n = bArr;
        if (i == -1) {
            i = this.f5663l;
        }
        this.f5664m = i;
        if (i2 == i && Arrays.equals(bArr2, this.f5665n)) {
            return;
        }
        byte[] bArr3 = this.f5665n;
        C4188ci m99760a = bArr3 != null ? AbstractC4265di.m99760a(bArr3, this.f5664m) : null;
        if (m99760a == null || !C4333ei.m99508a(m99760a)) {
            m99760a = C4188ci.m100185a(this.f5664m);
        }
        this.f5658g.m99476a(j, m99760a);
    }
}
