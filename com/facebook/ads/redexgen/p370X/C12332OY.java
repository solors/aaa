package com.facebook.ads.redexgen.p370X;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OY */
/* loaded from: assets/audience_network.dex */
public final class C12332OY implements InterfaceC12477Qt {
    public View A00;
    public C12614T7 A01;
    public EnumC12489R5 A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC12591Sj A05;
    public final AbstractC12585Sd A06;
    public final AbstractC12533Rn A07;
    public final AbstractC12481Qx A08;
    public final boolean A09;
    public final boolean A0A;

    public C12332OY(View view, EnumC12489R5 enumC12489R5, boolean z) {
        this(view, enumC12489R5, z, false);
    }

    public C12332OY(View view, EnumC12489R5 enumC12489R5, boolean z, boolean z2) {
        this.A06 = new AbstractC12585Sd() { // from class: com.facebook.ads.redexgen.X.8R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
            /* renamed from: A00 */
            public final void A03(C114289P c114289p) {
                C12332OY.A0A(C12332OY.this, 1, 0);
            }
        };
        this.A07 = new AbstractC12533Rn() { // from class: com.facebook.ads.redexgen.X.8Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
            /* renamed from: A00 */
            public final void A03(C12581SZ c12581sz) {
                if (!C12332OY.A0C(C12332OY.this)) {
                    return;
                }
                if (C12332OY.A03(C12332OY.this) == EnumC12489R5.A02 || C12332OY.A0D(C12332OY.this)) {
                    C12332OY.A04(C12332OY.this, null);
                    C12332OY.A09(C12332OY.this);
                    return;
                }
                C12332OY.A0A(C12332OY.this, 0, 8);
            }
        };
        this.A05 = new AbstractC12591Sj() { // from class: com.facebook.ads.redexgen.X.8P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
            /* renamed from: A00 */
            public final void A03(C114309R c114309r) {
                if (C12332OY.A03(C12332OY.this) != EnumC12489R5.A03) {
                    C12332OY.A01(C12332OY.this).setAlpha(1.0f);
                    C12332OY.A01(C12332OY.this).setVisibility(0);
                }
            }
        };
        this.A08 = new C113598H(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC12489R5);
    }

    public static /* synthetic */ View A01(C12332OY c12332oy) {
        return c12332oy.A00;
    }

    public static /* synthetic */ EnumC12489R5 A03(C12332OY c12332oy) {
        return c12332oy.A02;
    }

    public static /* synthetic */ EnumC12489R5 A04(C12332OY c12332oy, EnumC12489R5 enumC12489R5) {
        c12332oy.A02 = enumC12489R5;
        return enumC12489R5;
    }

    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C12488R4(this));
    }

    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC12489R5 enumC12489R5) {
        this.A02 = enumC12489R5;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC12489R5 == EnumC12489R5.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    public static /* synthetic */ void A09(C12332OY c12332oy) {
        c12332oy.A05();
    }

    public static /* synthetic */ void A0A(C12332OY c12332oy, int i, int i2) {
        c12332oy.A06(i, i2);
    }

    public static /* synthetic */ boolean A0C(C12332OY c12332oy) {
        return c12332oy.A03;
    }

    public static /* synthetic */ boolean A0D(C12332OY c12332oy) {
        return c12332oy.A09;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12477Qt
    public final void A9r(C12614T7 c12614t7) {
        this.A01 = c12614t7;
        c12614t7.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12477Qt
    public final void AHD(C12614T7 c12614t7) {
        A06(1, 0);
        c12614t7.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
