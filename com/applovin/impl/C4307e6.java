package com.applovin.impl;

/* renamed from: com.applovin.impl.e6 */
/* loaded from: classes2.dex */
public class C4307e6 implements InterfaceC4709kc {

    /* renamed from: a */
    private final C5170q5 f5771a;

    /* renamed from: b */
    private final long f5772b;

    /* renamed from: c */
    private final long f5773c;

    /* renamed from: d */
    private final long f5774d;

    /* renamed from: e */
    private final long f5775e;

    /* renamed from: f */
    private final int f5776f;

    /* renamed from: g */
    private final boolean f5777g;

    /* renamed from: h */
    private final long f5778h;

    /* renamed from: i */
    private final boolean f5779i;

    /* renamed from: j */
    private int f5780j;

    /* renamed from: k */
    private boolean f5781k;

    public C4307e6() {
        this(new C5170q5(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* renamed from: a */
    private static void m99657a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        AbstractC4100b1.m100579a(z, str + " cannot be less than " + str2);
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: b */
    public InterfaceC4982n0 mo97986b() {
        return this.f5771a;
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: c */
    public void mo97985c() {
        m99656a(true);
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: d */
    public long mo97984d() {
        return this.f5778h;
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: e */
    public void mo97983e() {
        m99656a(true);
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: f */
    public void mo97982f() {
        m99656a(false);
    }

    protected C4307e6(C5170q5 c5170q5, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m99657a(i3, 0, "bufferForPlaybackMs", "0");
        m99657a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m99657a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m99657a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m99657a(i2, i, "maxBufferMs", "minBufferMs");
        m99657a(i6, 0, "backBufferDurationMs", "0");
        this.f5771a = c5170q5;
        this.f5772b = AbstractC5538t2.m94555a(i);
        this.f5773c = AbstractC5538t2.m94555a(i2);
        this.f5774d = AbstractC5538t2.m94555a(i3);
        this.f5775e = AbstractC5538t2.m94555a(i4);
        this.f5776f = i5;
        this.f5780j = i5 == -1 ? 13107200 : i5;
        this.f5777g = z;
        this.f5778h = AbstractC5538t2.m94555a(i6);
        this.f5779i = z2;
    }

    /* renamed from: a */
    protected int m99655a(InterfaceC5201qi[] interfaceC5201qiArr, InterfaceC4445g8[] interfaceC4445g8Arr) {
        int i = 0;
        for (int i2 = 0; i2 < interfaceC5201qiArr.length; i2++) {
            if (interfaceC4445g8Arr[i2] != null) {
                i += m99658a(interfaceC5201qiArr[i2].mo95839e());
            }
        }
        return Math.max(13107200, i);
    }

    /* renamed from: a */
    private static int m99658a(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: a */
    public void mo97987a(InterfaceC5201qi[] interfaceC5201qiArr, C5138po c5138po, InterfaceC4445g8[] interfaceC4445g8Arr) {
        int i = this.f5776f;
        if (i == -1) {
            i = m99655a(interfaceC5201qiArr, interfaceC4445g8Arr);
        }
        this.f5780j = i;
        this.f5771a.m96424a(i);
    }

    /* renamed from: a */
    private void m99656a(boolean z) {
        int i = this.f5776f;
        if (i == -1) {
            i = 13107200;
        }
        this.f5780j = i;
        this.f5781k = false;
        if (z) {
            this.f5771a.m96418e();
        }
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: a */
    public boolean mo97990a() {
        return this.f5779i;
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: a */
    public boolean mo97988a(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f5771a.m96419d() >= this.f5780j;
        long j3 = this.f5772b;
        if (f > 1.0f) {
            j3 = Math.min(AbstractC5863xp.m93037a(j3, f), this.f5773c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            if (!this.f5777g && z2) {
                z = false;
            }
            this.f5781k = z;
            if (!z && j2 < 500000) {
                AbstractC5063oc.m96800d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f5773c || z2) {
            this.f5781k = false;
        }
        return this.f5781k;
    }

    @Override // com.applovin.impl.InterfaceC4709kc
    /* renamed from: a */
    public boolean mo97989a(long j, float f, boolean z, long j2) {
        long m92991b = AbstractC5863xp.m92991b(j, f);
        long j3 = z ? this.f5775e : this.f5774d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || m92991b >= j3 || (!this.f5777g && this.f5771a.m96419d() >= this.f5780j);
    }
}
