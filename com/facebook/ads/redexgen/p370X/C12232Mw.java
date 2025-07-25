package com.facebook.ads.redexgen.p370X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Mw */
/* loaded from: assets/audience_network.dex */
public final class C12232Mw implements InterfaceC12499RF {
    public int A00;
    public ValueAnimator A01;
    public EnumC12498RE A02 = EnumC12498RE.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public C12232Mw(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C12502RI(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC12498RE.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C12501RH(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        AbstractC12177M3.A0H(this.A05);
        this.A02 = EnumC12498RE.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        AbstractC12177M3.A0L(this.A05);
        if (z) {
            this.A02 = EnumC12498RE.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C12500RG(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC12498RE.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final EnumC12498RE A8Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
