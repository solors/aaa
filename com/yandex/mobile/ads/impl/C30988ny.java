package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.ny */
/* loaded from: classes8.dex */
public final class C30988ny implements ep0 {

    /* renamed from: a */
    private final C31316rx f83187a;

    /* renamed from: b */
    private final long f83188b;

    /* renamed from: c */
    private final long f83189c;

    /* renamed from: d */
    private final long f83190d;

    /* renamed from: e */
    private final long f83191e;

    /* renamed from: f */
    private final int f83192f;

    /* renamed from: g */
    private final boolean f83193g;

    /* renamed from: h */
    private final long f83194h;

    /* renamed from: i */
    private final boolean f83195i;

    /* renamed from: j */
    private int f83196j;

    /* renamed from: k */
    private boolean f83197k;

    public C30988ny() {
        this(new C31316rx());
    }

    /* renamed from: a */
    private static void m31239a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C30937nf.m31568a(str + " cannot be less than " + str2, z);
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: b */
    public final void mo31235b() {
        int i = this.f83192f;
        if (i == -1) {
            i = 13107200;
        }
        this.f83196j = i;
        this.f83197k = false;
        this.f83187a.m29907d();
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: c */
    public final C31316rx mo31234c() {
        return this.f83187a;
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: d */
    public final void mo31233d() {
        int i = this.f83192f;
        if (i == -1) {
            i = 13107200;
        }
        this.f83196j = i;
        this.f83197k = false;
        this.f83187a.m29907d();
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: e */
    public final long mo31232e() {
        return this.f83194h;
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: f */
    public final void mo31231f() {
        int i = this.f83192f;
        if (i == -1) {
            i = 13107200;
        }
        this.f83196j = i;
        this.f83197k = false;
    }

    protected C30988ny(C31316rx c31316rx) {
        m31239a(2500, 0, "bufferForPlaybackMs", "0");
        m31239a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m31239a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m31239a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m31239a(50000, 50000, "maxBufferMs", "minBufferMs");
        m31239a(0, 0, "backBufferDurationMs", "0");
        this.f83187a = c31316rx;
        long j = 50000;
        this.f83188b = y32.m27089a(j);
        this.f83189c = y32.m27089a(j);
        this.f83190d = y32.m27089a(2500);
        this.f83191e = y32.m27089a(5000);
        this.f83192f = -1;
        this.f83196j = 13107200;
        this.f83193g = false;
        this.f83194h = y32.m27089a(0);
        this.f83195i = false;
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: a */
    public final void mo31236a(pk1[] pk1VarArr, v40[] v40VarArr) {
        int i = this.f83192f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < pk1VarArr.length) {
                    if (v40VarArr[i2] != null) {
                        switch (pk1VarArr[i2].mo29126m()) {
                            case -2:
                                i4 = 0;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i4 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i4 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                break;
                        }
                        i3 += i4;
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        this.f83196j = i;
        this.f83187a.m29912a(i);
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: a */
    public final boolean mo31240a() {
        return this.f83195i;
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: a */
    public final boolean mo31238a(long j, float f) {
        boolean z = true;
        boolean z2 = this.f83187a.m29908c() >= this.f83196j;
        long j2 = this.f83188b;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i > 0) {
            int i2 = y32.f88010a;
            if (i != 0) {
                j2 = Math.round(j2 * f);
            }
            j2 = Math.min(j2, this.f83189c);
        }
        if (j < Math.max(j2, 500000L)) {
            if (!this.f83193g && z2) {
                z = false;
            }
            this.f83197k = z;
            if (!z && j < 500000) {
                gq0.m33792d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.f83189c || z2) {
            this.f83197k = false;
        }
        return this.f83197k;
    }

    @Override // com.yandex.mobile.ads.impl.ep0
    /* renamed from: a */
    public final boolean mo31237a(long j, float f, boolean z, long j2) {
        int i = y32.f88010a;
        if (f != 1.0f) {
            j = Math.round(j / f);
        }
        long j3 = z ? this.f83191e : this.f83190d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || j >= j3 || (!this.f83193g && this.f83187a.m29908c() >= this.f83196j);
    }
}
