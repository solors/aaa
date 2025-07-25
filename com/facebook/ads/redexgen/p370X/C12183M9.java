package com.facebook.ads.redexgen.p370X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.M9 */
/* loaded from: assets/audience_network.dex */
public final class C12183M9 implements InterfaceC12499RF {
    public ValueAnimator A00;
    public EnumC12498RE A01 = EnumC12498RE.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public C12183M9(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
    }

    private ValueAnimator A00(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new C12508RO(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        if (z) {
            this.A01 = EnumC12498RE.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C12507RN(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        AbstractC12177M3.A0H(this.A05);
        this.A01 = EnumC12498RE.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        AbstractC12177M3.A0L(this.A05);
        if (z) {
            this.A01 = EnumC12498RE.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C12506RM(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC12498RE.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A08(z);
        } else {
            A09(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final EnumC12498RE A8Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
