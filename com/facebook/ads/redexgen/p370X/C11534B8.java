package com.facebook.ads.redexgen.p370X;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.B8 */
/* loaded from: assets/audience_network.dex */
public final class C11534B8 extends AbstractC12675U6 {
    public static final RelativeLayout.LayoutParams A07 = new RelativeLayout.LayoutParams(-1, -1);
    public C12129LH A00;
    public AbstractC12342Oi A01;
    public final int A02;
    public final ImageView A03;
    public final AbstractC12200MQ A04;
    public final InterfaceC12426Q4 A05;
    public final AtomicBoolean A06;

    public C11534B8(C13029Zs c13029Zs, InterfaceC12245N9 interfaceC12245N9, int i, InterfaceC12000J7 interfaceC12000J7, AbstractC13171cD abstractC13171cD, InterfaceC12201MR interfaceC12201MR, FullScreenAdToolbar fullScreenAdToolbar, boolean z, boolean z2, InterfaceC12426Q4 interfaceC12426Q4, int i2) {
        super(c13029Zs, interfaceC12245N9, interfaceC12000J7, abstractC13171cD, i, z, z2, interfaceC12201MR);
        this.A06 = new AtomicBoolean(false);
        this.A02 = i2;
        this.A05 = interfaceC12426Q4;
        this.A03 = new ImageView(getContext());
        this.A04 = fullScreenAdToolbar;
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setAdjustViewBounds(true);
        new AsyncTaskC12718Un(this.A03, c13029Zs).A05(abstractC13171cD.A1P().A0E().A00(), abstractC13171cD.A1P().A0E().A01()).A06(new C12674U5(this)).A07(abstractC13171cD.A1P().A0E().A07());
        A05(c13029Zs.getResources().getConfiguration().orientation);
    }

    private AbstractC12342Oi A01(int i) {
        if (this.A03.getParent() != null) {
            AbstractC12177M3.A0J(this.A03);
        }
        return AbstractC12343Oj.A00(new C12345Ol(super.A06, this.A07, this.A0A, super.A05, this.A03, this.A0C, this.A09).A0F(this.A04.getToolbarHeight()).A0J(this.A04).A0E(i).A0L(i != 2).A0M(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A06.get()) {
            A10();
        }
    }

    private void A05(int i) {
        AbstractC12177M3.A0J(this.A01);
        this.A01 = A01(i);
        addView(this.A01, 0, A07);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public final void A0z() {
        if (C11979Im.A1p(super.A06)) {
            super.A06.A0A().AHC(this.A03);
        }
        if (this.A01 != null) {
            this.A01.A0v();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public final void A11() {
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public final void A12() {
        if (this.A02 > 0) {
            this.A00 = new C12129LH(this.A02, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C12673U4(this));
            this.A00.A07();
            return;
        }
        this.A05.ADa(false);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public final void A13(boolean z) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public final void A14(boolean z) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public final boolean A15() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public final boolean A16() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6
    public C12425Q3 getFullScreenAdStyle() {
        C109491O colors = this.A01.getColors();
        return new C12425Q3(this.A01.A11(), C12425Q3.A07, colors, View$OnClickListenerC12713Ui.A08(super.A05), colors.A07(this.A01.A11() || (this.A01 instanceof AbstractC12708Ud)), null);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12675U6, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A05.A1P().A0P()) {
            A05(configuration.orientation);
        }
    }
}
