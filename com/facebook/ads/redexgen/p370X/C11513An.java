package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.An */
/* loaded from: assets/audience_network.dex */
public final class C11513An {
    public final Handler A00;
    public final InterfaceC11514Ao A01;

    public C11513An(Handler handler, InterfaceC11514Ao interfaceC11514Ao) {
        this.A00 = interfaceC11514Ao != null ? (Handler) AbstractC11914Hf.A01(handler) : null;
        this.A01 = interfaceC11514Ao;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11512Am(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11510Ak(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11509Aj(this, format));
        }
    }

    public final void A04(C11543BH c11543bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11511Al(this, c11543bh));
        }
    }

    public final void A05(C11543BH c11543bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11507Ah(this, c11543bh));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC11508Ai(this, str, j, j2));
        }
    }
}
