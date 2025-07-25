package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Mv */
/* loaded from: assets/audience_network.dex */
public final class C12231Mv implements InterfaceC12499RF {
    public ViewPropertyAnimator A00;
    public EnumC12498RE A01 = EnumC12498RE.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public C12231Mv(View view, int i, boolean z) {
        this.A02 = i;
        this.A03 = view;
        this.A04 = z;
    }

    private void A04(boolean z) {
        this.A01 = EnumC12498RE.A03;
        if (this.A04) {
            AbstractC12177M3.A0L(this.A03);
        }
        if (!z) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC12498RE.A02;
            return;
        }
        this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new C12503RJ(this));
    }

    private void A05(boolean z) {
        this.A01 = EnumC12498RE.A05;
        if (!z) {
            this.A03.setAlpha(0.0f);
            this.A01 = EnumC12498RE.A04;
            return;
        }
        this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new C12504RK(this));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A05(z);
        } else {
            A04(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final EnumC12498RE A8Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
