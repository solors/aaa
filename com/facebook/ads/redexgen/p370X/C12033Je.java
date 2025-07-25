package com.facebook.ads.redexgen.p370X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Je */
/* loaded from: assets/audience_network.dex */
public final class C12033Je {
    public final InterfaceC12031Jc A0B;
    public final boolean A0F;
    public final String A0C = C12033Je.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C12032Jd> A0D = new LinkedList();

    public C12033Je(C113257j c113257j, InterfaceC12031Jc interfaceC12031Jc) {
        int nativeViewabilityHistorySamplingRate = AbstractC11981Io.A0D(c113257j);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c113257j.A08().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC12031Jc;
    }

    private int A00() {
        return this.A0B.A70();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C12032Jd c12032Jd) {
        synchronized (this.A0D) {
            this.A0D.add(c12032Jd);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C12032Jd(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 102, A00(), null));
    }

    public final void A0C(C113257j c113257j, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C12032Jd(A01(), 103, A00(), null));
        ExecutorC12182M8.A06.execute(new RunnableC12030Jb(this, str, c113257j));
    }
}
