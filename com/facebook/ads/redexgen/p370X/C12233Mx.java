package com.facebook.ads.redexgen.p370X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mx */
/* loaded from: assets/audience_network.dex */
public final class C12233Mx implements InterfaceC12499RF {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public EnumC12498RE A02 = EnumC12498RE.A04;

    public C12233Mx(View view, int i, Drawable drawable, Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        AbstractC12177M3.A0S(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC12498RE.A05;
            AbstractC12177M3.A0S(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C12234My(this), this.A03);
            return;
        }
        AbstractC12177M3.A0S(this.A07, this.A05);
        this.A02 = EnumC12498RE.A04;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC12498RE.A03;
            AbstractC12177M3.A0S(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new C12236N0(this), this.A03);
            return;
        }
        AbstractC12177M3.A0S(this.A07, this.A04);
        this.A02 = EnumC12498RE.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final EnumC12498RE A8Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12499RF
    public final void cancel() {
        EnumC12498RE enumC12498RE;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == EnumC12498RE.A03) {
            enumC12498RE = EnumC12498RE.A04;
        } else {
            enumC12498RE = EnumC12498RE.A02;
        }
        this.A02 = enumC12498RE;
    }
}
