package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.AD */
/* loaded from: assets/audience_network.dex */
public final class C11477AD {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC11475AB A0A;
    public final InterfaceC11476AC A0B;
    public final AbstractC11486AM A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C11477AD(InterfaceC11475AB interfaceC11475AB, InterfaceC11476AC interfaceC11476AC, AbstractC11486AM abstractC11486AM, int i, Handler handler) {
        this.A0A = interfaceC11475AB;
        this.A0B = interfaceC11476AC;
        this.A0C = abstractC11486AM;
        this.A03 = handler;
        this.A01 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC11476AC A04() {
        return this.A0B;
    }

    public final C11477AD A05() {
        AbstractC11914Hf.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            AbstractC11914Hf.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AGF(this);
        return this;
    }

    public final C11477AD A06(int i) {
        AbstractC11914Hf.A04(!this.A09);
        this.A00 = i;
        return this;
    }

    public final C11477AD A07(Object obj) {
        AbstractC11914Hf.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC11486AM A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        AbstractC11914Hf.A04(this.A09);
        AbstractC11914Hf.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
