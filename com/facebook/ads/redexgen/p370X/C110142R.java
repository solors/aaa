package com.facebook.ads.redexgen.p370X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.2R */
/* loaded from: assets/audience_network.dex */
public final class C110142R implements Serializable {
    public C110132Q A00;
    public C110132Q A01;

    public C110142R() {
        this(0.5d, 0.5d);
    }

    public C110142R(double d) {
        this(d, 0.5d);
    }

    public C110142R(double d, double d2) {
        this.A00 = new C110132Q(d);
        this.A01 = new C110132Q(d2);
        A02();
    }

    public final C110132Q A00() {
        return this.A00;
    }

    public final C110132Q A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d, double d2) {
        this.A00.A09(d, d2);
    }

    public final void A05(double d, double d2) {
        this.A01.A09(d, d2);
    }
}
