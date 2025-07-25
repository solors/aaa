package com.facebook.ads.redexgen.p370X;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kw */
/* loaded from: assets/audience_network.dex */
public final class C12108Kw {
    public static final C12108Kw A04 = new C12108Kw(new C12783Vr(), new C12782Vq());
    public final InterfaceC12107Kv A02;
    public final InterfaceC12167Lt A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C12108Kw(InterfaceC12167Lt interfaceC12167Lt, InterfaceC12107Kv interfaceC12107Kv) {
        this.A03 = interfaceC12167Lt;
        this.A02 = interfaceC12107Kv;
    }

    public static C12108Kw A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5M();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7e();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C12108Kw.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5M() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
