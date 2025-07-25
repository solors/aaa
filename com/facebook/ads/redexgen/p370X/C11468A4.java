package com.facebook.ads.redexgen.p370X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.A4 */
/* loaded from: assets/audience_network.dex */
public final class C11468A4 extends AbstractC12659Tq {
    public static String[] A06 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC12342Oi A00;
    public final ImageView A01;
    public final InterfaceC112025W A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C11468A4(C13029Zs c13029Zs, InterfaceC12245N9 interfaceC12245N9, InterfaceC12000J7 interfaceC12000J7, AbstractC13171cD abstractC13171cD, C112726f c112726f, InterfaceC12201MR interfaceC12201MR) {
        super(c13029Zs, interfaceC12245N9, interfaceC12000J7, abstractC13171cD, c112726f, interfaceC12201MR);
        this.A02 = new C12654Tl(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new AsyncTaskC12718Un(this.A01, super.A03).A05(super.A01.A1P().A0E().A00(), super.A01.A1P().A0E().A01()).A06(new C12653Tk(this)).A07(super.A01.A1P().A0E().A07());
    }

    private AbstractC12342Oi A01(int i) {
        if (this.A01.getParent() != null) {
            AbstractC12177M3.A0J(this.A01);
        }
        return AbstractC12343Oj.A00(new C12345Ol(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0F(this.A07.getToolbarHeight()).A0J(this.A07).A0E(i).A0M(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0V();
        }
    }

    private void A06(int i) {
        AbstractC12177M3.A0J(this.A00);
        this.A00 = A01(i);
        C109491O colors = this.A00.getColors();
        boolean z = true;
        AbstractC12177M3.A0M(this, colors.A07(this.A00 != null && (this.A00.A11() || (this.A00 instanceof AbstractC12708Ud))));
        this.A07.setFullscreen(this.A00.A11());
        this.A07.A09(colors, View$OnClickListenerC12713Ui.A08(super.A01));
        addView(this.A00, 0, AbstractC12659Tq.A0E);
        setUpFullscreenMode((this.A00 == null || !this.A00.A11()) ? false : false);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12659Tq
    public final void A0W() {
        AbstractC12177M3.A0L(this.A00);
        AbstractC12177M3.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A1P().A0E().A03();
        if (A03 > 0) {
            if (this.A00 != null) {
                this.A00.A0z();
            }
            A0X(A03, new C12652Tj(this));
            return;
        }
        this.A05.set(true);
        AbstractC12200MQ abstractC12200MQ = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC12200MQ.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12659Tq
    public final void A0Y(C111965Q c111965q) {
        c111965q.A0A(this.A02);
        int orientation = c111965q.A05().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        AbstractC12177M3.A0H(this.A00);
        AbstractC12177M3.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12659Tq
    public final boolean A0Z() {
        if (this.A00 != null) {
            AbstractC12342Oi abstractC12342Oi = this.A00;
            if (A06[4].length() != 3) {
                throw new RuntimeException();
            }
            A06[4] = "kMg";
            return abstractC12342Oi.A12(false);
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ACz(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ADN(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12659Tq, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A1P().A0P()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12659Tq, com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void onDestroy() {
        if (C11979Im.A1p(super.A03)) {
            super.A03.A0A().AHC(this.A01);
        }
        if (this.A00 != null) {
            AbstractC12342Oi abstractC12342Oi = this.A00;
            String[] strArr = A06;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A06[4] = "hIQ";
            abstractC12342Oi.A0v();
        }
        super.onDestroy();
    }
}
