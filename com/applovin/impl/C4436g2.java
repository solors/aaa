package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.g2 */
/* loaded from: classes2.dex */
final class C4436g2 extends C5048o5 {

    /* renamed from: j */
    private long f6280j;

    /* renamed from: k */
    private int f6281k;

    /* renamed from: l */
    private int f6282l;

    public C4436g2() {
        super(2);
        this.f6282l = 32;
    }

    /* renamed from: b */
    private boolean m99032b(C5048o5 c5048o5) {
        ByteBuffer byteBuffer;
        if (m99027m()) {
            if (this.f6281k < this.f6282l && c5048o5.m97868d() == m97868d()) {
                ByteBuffer byteBuffer2 = c5048o5.f8725c;
                return byteBuffer2 == null || (byteBuffer = this.f8725c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m99033a(C5048o5 c5048o5) {
        AbstractC4100b1.m100580a(!c5048o5.m96867h());
        AbstractC4100b1.m100580a(!c5048o5.m97870c());
        AbstractC4100b1.m100580a(!c5048o5.m97866e());
        if (!m99032b(c5048o5)) {
            return false;
        }
        int i = this.f6281k;
        this.f6281k = i + 1;
        if (i == 0) {
            this.f8727f = c5048o5.f8727f;
            if (c5048o5.m97864f()) {
                m97865e(1);
            }
        }
        if (c5048o5.m97868d()) {
            m97865e(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = c5048o5.f8725c;
        if (byteBuffer != null) {
            m96868g(byteBuffer.remaining());
            this.f8725c.put(byteBuffer);
        }
        this.f6280j = c5048o5.f8727f;
        return true;
    }

    /* renamed from: i */
    public void m99031i(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        this.f6282l = i;
    }

    /* renamed from: j */
    public long m99030j() {
        return this.f8727f;
    }

    /* renamed from: k */
    public long m99029k() {
        return this.f6280j;
    }

    /* renamed from: l */
    public int m99028l() {
        return this.f6281k;
    }

    /* renamed from: m */
    public boolean m99027m() {
        if (this.f6281k > 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.C5048o5, com.applovin.impl.AbstractC4746l2
    /* renamed from: b */
    public void mo94598b() {
        super.mo94598b();
        this.f6281k = 0;
    }
}
