package com.facebook.ads.redexgen.p370X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.QM */
/* loaded from: assets/audience_network.dex */
public final class C12444QM extends FrameLayout {
    public static final int A08 = (int) (AbstractC12137LP.A02 * 16.0f);
    public C11576Bq A00;
    public C12619TC A01;
    public C114319S A02;
    public C12295Nx A03;
    public C113137V A04;
    public C113027G A05;
    public final C13029Zs A06;
    public final C12008JF A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(InterfaceC12000J7 interfaceC12000J7, String str, Map<String, String> map) {
        A02();
        this.A02 = new C114319S(this.A06, interfaceC12000J7, this.A00, str, null, map);
        if (C11979Im.A1q(this.A06)) {
            this.A01 = new C12619TC(this.A06, interfaceC12000J7, this.A00, str, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C12444QM(C13029Zs c13029Zs, C12008JF c12008jf) {
        super(c13029Zs);
        this.A07 = c12008jf;
        this.A06 = c13029Zs;
        setUpView(c13029Zs);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A05();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0o();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC114008x abstractC114008x) {
        this.A00.getEventBus().A05(abstractC114008x);
    }

    public final void A05(EnumC12476Qs enumC12476Qs) {
        this.A00.A0b(enumC12476Qs, 13);
    }

    public final boolean A06() {
        return this.A00.A0l();
    }

    public C12614T7 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C13029Zs c13029Zs) {
        this.A00.A0X();
        this.A04 = new C113137V(c13029Zs);
        this.A00.A0c(this.A04);
        this.A03 = new C12295Nx(c13029Zs, this.A07);
        this.A00.A0c(new C113708S(c13029Zs));
        this.A00.A0c(this.A03);
        this.A05 = new C113027G(c13029Zs, true, this.A07);
        this.A00.A0c(this.A05);
        this.A00.A0c(new C12332OY(this.A05, EnumC12489R5.A02, true, true));
        if (!this.A00.A0g()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C13029Zs c13029Zs) {
        this.A00 = new C11576Bq(c13029Zs);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AbstractC12177M3.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new View$OnClickListenerC12443QL(this));
    }

    private void setUpView(C13029Zs c13029Zs) {
        setUpVideo(c13029Zs);
        setUpPlugins(c13029Zs);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
