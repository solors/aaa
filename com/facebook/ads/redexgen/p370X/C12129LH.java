package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.LH */
/* loaded from: assets/audience_network.dex */
public final class C12129LH {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final InterfaceC12128LG A06;

    public C12129LH(int i, float f, long j, Handler handler, InterfaceC12128LG interfaceC12128LG) {
        this(i, interfaceC12128LG, handler);
        this.A02 = j;
        this.A01 = f;
    }

    public C12129LH(int i, InterfaceC12128LG interfaceC12128LG) {
        this(i, interfaceC12128LG, new Handler());
    }

    public C12129LH(int i, InterfaceC12128LG interfaceC12128LG, Handler handler) {
        this.A04 = false;
        this.A00 = i;
        this.A06 = interfaceC12128LG;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        this.A00 -= this.A01;
        this.A06.ADF(this.A00);
        if (this.A00 <= 0.0f && !this.A03) {
            this.A03 = true;
            this.A06.ABb();
            this.A04 = false;
        }
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A04;
    }

    public final boolean A06() {
        if (A05()) {
            this.A04 = false;
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if (A04() && !this.A03) {
            this.A03 = true;
            this.A06.ABb();
        }
        if (A04() || A05()) {
            return false;
        }
        this.A04 = true;
        this.A06.ADF(this.A00);
        this.A05.postDelayed(new C12780Vo(this), this.A02);
        return true;
    }
}
