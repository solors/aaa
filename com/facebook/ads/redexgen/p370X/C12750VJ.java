package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.VJ */
/* loaded from: assets/audience_network.dex */
public final class C12750VJ extends AbstractC12216Mg {
    public C114319S A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final C112726f A04;
    public final InterfaceC12000J7 A05;
    public final C12614T7 A06;
    public final AbstractC12591Sj A07;
    public final AbstractC12589Sh A08;
    public final C12372PC A09;
    public final View$OnClickListenerC12311OD A0A;
    public final C12295Nx A0B;
    public final AbstractC12529Rj A0C;
    public final C12530Rk A0D;

    public C12750VJ(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, C112726f c112726f, C12008JF c12008jf, View.OnClickListener onClickListener) {
        super(c13029Zs, onClickListener);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new C11579Bt(this);
        this.A08 = new C11578Bs(this);
        this.A05 = interfaceC12000J7;
        this.A04 = c112726f;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new FrameLayout(c13029Zs);
        addView(this.A03, new RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(c12008jf);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(c12008jf);
        A0C();
    }

    private C12752VL A00() {
        return new C12752VL(this);
    }

    private C12614T7 A01(C12008JF c12008jf) {
        C12614T7 c12614t7 = new C12614T7(super.A01);
        AbstractC12177M3.A0K(c12614t7);
        c12614t7.setFunnelLoggingHandler(c12008jf);
        c12614t7.getEventBus().A03(this.A07, this.A08);
        if (C11979Im.A1O(super.A01)) {
            c12614t7.setVolume(0.0f);
        }
        if (!C11979Im.A1J(super.A01)) {
            c12614t7.setOnClickListener(new View$OnClickListenerC12218Mi(this));
        }
        RelativeLayout.LayoutParams videoLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(c12614t7, videoLayoutParams);
        return c12614t7;
    }

    private C12372PC A03() {
        C12372PC c12372pc = new C12372PC(super.A01);
        c12372pc.setTextColor(-1);
        AbstractC12177M3.A0Y(c12372pc, false, 12);
        c12372pc.setGravity(17);
        this.A06.A0c(c12372pc);
        return c12372pc;
    }

    private View$OnClickListenerC12311OD A04() {
        View$OnClickListenerC12311OD view$OnClickListenerC12311OD = new View$OnClickListenerC12311OD(super.A01);
        this.A06.A0c(view$OnClickListenerC12311OD);
        return view$OnClickListenerC12311OD;
    }

    private C12295Nx A06(C12008JF c12008jf) {
        C12295Nx c12295Nx = new C12295Nx(super.A01, c12008jf, true);
        c12295Nx.setBackgroundPaintColor(855638016);
        this.A06.A0c(c12295Nx);
        return c12295Nx;
    }

    private C12530Rk A07() {
        return new C12530Rk(this, 50, true, new WeakReference(this.A0C), super.A01);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
        } else {
            this.A0D.A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12216Mg
    public final void A0A() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0V();
        AbstractC12177M3.A0J(this.A06);
        if (this.A00 != null) {
            this.A00.A0o();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12216Mg
    public final void A0B() {
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12216Mg
    public final void A0C() {
        super.A0C();
        if (C11979Im.A1P(super.A01)) {
            AbstractC12177M3.A0J(this.A0A);
            this.A0A.setLayoutParams(A00(true, false));
            addView(this.A0A);
        }
        if (C11979Im.A1L(super.A01)) {
            AbstractC12177M3.A0J(this.A09);
            this.A09.setLayoutParams(A00(true, true));
            addView(this.A09);
        }
        if (C11979Im.A1N(super.A01)) {
            AbstractC12177M3.A0J(this.A0B);
            this.A0B.setLayoutParams(A00(false, false));
            addView(this.A0B);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12216Mg
    public final boolean A0D() {
        return this.A06.A0h();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12216Mg
    public final boolean A0E() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) ((getMeasuredWidth() - this.A06.getMeasuredWidth()) / 2.0d);
        int i = AbstractC12216Mg.A05;
        int widthGap = AbstractC12216Mg.A04;
        return measuredWidth > i + (widthGap * 2);
    }

    public final C12750VJ A0F(String str, String str2, String str3, String str4, String str5) {
        this.A06.setVideoURI(this.A04.A0S(str2));
        this.A00 = new C114319S(super.A01, this.A05, this.A06, str);
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            new AsyncTaskC12718Un(this.A03, super.A01).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C12751VK(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12216Mg
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A08();
    }
}
