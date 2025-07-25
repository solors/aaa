package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.w2 */
/* loaded from: classes2.dex */
public final class C5738w2 extends AbstractC4301e2 {

    /* renamed from: n */
    private final C5048o5 f11598n;

    /* renamed from: o */
    private final C4066ah f11599o;

    /* renamed from: p */
    private long f11600p;

    /* renamed from: q */
    private InterfaceC5672v2 f11601q;

    /* renamed from: r */
    private long f11602r;

    public C5738w2() {
        super(6);
        this.f11598n = new C5048o5(1);
        this.f11599o = new C4066ah();
    }

    /* renamed from: z */
    private void m93744z() {
        InterfaceC5672v2 interfaceC5672v2 = this.f11601q;
        if (interfaceC5672v2 != null) {
            interfaceC5672v2.mo93978a();
        }
    }

    @Override // com.applovin.impl.AbstractC4301e2, com.applovin.impl.C5266rh.InterfaceC5268b
    /* renamed from: a */
    public void mo93753a(int i, Object obj) {
        if (i == 8) {
            this.f11601q = (InterfaceC5672v2) obj;
        } else {
            super.mo93753a(i, obj);
        }
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: c */
    public boolean mo93747c() {
        return mo96292j();
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: d */
    public boolean mo93746d() {
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5201qi, com.applovin.impl.InterfaceC5269ri
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.applovin.impl.AbstractC4301e2
    /* renamed from: v */
    protected void mo93745v() {
        m93744z();
    }

    @Override // com.applovin.impl.AbstractC4301e2
    /* renamed from: a */
    protected void mo93751a(long j, boolean z) {
        this.f11602r = Long.MIN_VALUE;
        m93744z();
    }

    @Override // com.applovin.impl.AbstractC4301e2
    /* renamed from: a */
    protected void mo93748a(C4310e9[] c4310e9Arr, long j, long j2) {
        this.f11600p = j2;
    }

    /* renamed from: a */
    private float[] m93749a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f11599o.m100791a(byteBuffer.array(), byteBuffer.limit());
        this.f11599o.m100780f(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f11599o.m100772m());
        }
        return fArr;
    }

    @Override // com.applovin.impl.InterfaceC5201qi
    /* renamed from: a */
    public void mo93752a(long j, long j2) {
        while (!mo96292j() && this.f11602r < 100000 + j) {
            this.f11598n.mo94598b();
            if (m99692a(m99687r(), this.f11598n, 0) != -4 || this.f11598n.m97866e()) {
                return;
            }
            C5048o5 c5048o5 = this.f11598n;
            this.f11602r = c5048o5.f8727f;
            if (this.f11601q != null && !c5048o5.m97868d()) {
                this.f11598n.m96869g();
                float[] m93749a = m93749a((ByteBuffer) AbstractC5863xp.m93017a(this.f11598n.f8725c));
                if (m93749a != null) {
                    ((InterfaceC5672v2) AbstractC5863xp.m93017a(this.f11601q)).mo93977a(this.f11602r - this.f11600p, m93749a);
                }
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5269ri
    /* renamed from: a */
    public int mo93750a(C4310e9 c4310e9) {
        if ("application/x-camera-motion".equals(c4310e9.f5813m)) {
            return InterfaceC5269ri.m95843a(4);
        }
        return InterfaceC5269ri.m95843a(0);
    }
}
