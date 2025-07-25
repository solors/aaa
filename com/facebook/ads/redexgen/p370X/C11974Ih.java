package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ih */
/* loaded from: assets/audience_network.dex */
public final class C11974Ih {
    public final Handler A00;
    public final InterfaceC11975Ii A01;

    public C11974Ih(Handler handler, InterfaceC11975Ii interfaceC11975Ii) {
        this.A00 = interfaceC11975Ii != null ? (Handler) AbstractC11914Hf.A01(handler) : null;
        this.A01 = interfaceC11975Ii;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11971Ie(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11970Id(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11972If(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11969Ic(this, format));
        }
    }

    public final void A05(C11543BH c11543bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11973Ig(this, c11543bh));
        }
    }

    public final void A06(C11543BH c11543bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11967Ia(this, c11543bh));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11968Ib(this, str, j, j2));
        }
    }
}
