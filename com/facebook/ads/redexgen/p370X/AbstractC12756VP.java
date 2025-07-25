package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.VP */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12756VP extends RelativeLayout implements InterfaceC12202MS {
    public static byte[] A0F;
    public View A00;
    public C12129LH A01;
    public C12429Q7 A02;
    public boolean A03;
    public boolean A04;
    public C109361B A05;
    public C12460Qc A06;
    public boolean A07;
    public final View$OnSystemUiVisibilityChangeListenerC12164Lq A08;
    public final InterfaceC12201MR A09;
    public final AbstractC13171cD A0A;
    public final C13029Zs A0B;
    public final InterfaceC12000J7 A0C;
    public final C12008JF A0D;
    public final AbstractC12200MQ A0E;

    static {
        A0P();
    }

    public static String A0M(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0F = new byte[]{-93, -81, -83, 110, -90, -95, -93, -91, -94, -81, -81, -85, 110, -95, -92, -77, 110, -87, -82, -76, -91, -78, -77, -76, -87, -76, -87, -95, -84, 110, -87, -83, -80, -78, -91, -77, -77, -87, -81, -82, 110, -84, -81, -89, -89, -91, -92};
    }

    public abstract boolean A0b();

    public abstract int getCloseButtonStyle();

    public AbstractC12756VP(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, InterfaceC12201MR interfaceC12201MR, AbstractC13171cD abstractC13171cD) {
        super(c13029Zs);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = c13029Zs;
        this.A0C = interfaceC12000J7;
        this.A09 = interfaceC12201MR;
        this.A08 = new View$OnSystemUiVisibilityChangeListenerC12164Lq(this);
        this.A0A = abstractC13171cD;
        this.A0D = new C12008JF(this.A0A.A1U(), this.A0C);
        this.A0E = new FullScreenAdToolbar(this.A0B, getAudienceNetworkListener(), this.A0D, 0, this.A0A.A1J(), false);
    }

    private C109491O A0K(int i) {
        if (i == 1) {
            return this.A05.A01();
        }
        return this.A05.A00();
    }

    private void A0N() {
        removeAllViews();
        AbstractC12177M3.A0J(this);
    }

    private void A0O() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0Y() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new C12427Q5(this.A0B, this.A0A.A1P().A0F(), this.A0A.A1S()).A0A(this.A0A.A1O().A01()).A0F();
            AbstractC12010JH.A04(this.A02, this.A0D, EnumC12007JE.A0U);
            this.A09.A3p(this, 0, layoutParams);
            this.A09.A3p(this.A02, 1, layoutParams);
            this.A02.A04(new C12758VR(this));
            return;
        }
        this.A09.A3p(this, 0, layoutParams);
    }

    private void A0Q(C109491O c109491o, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A09(c109491o, View$OnClickListenerC12713Ui.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0T() {
        if (this.A00 == null || !(this.A00 instanceof AbstractC12342Oi)) {
            return;
        }
        if (A0Z()) {
            ((AbstractC12342Oi) this.A00).A0z();
        } else {
            ((AbstractC12342Oi) this.A00).A0y();
        }
    }

    public final void A0U(int i) {
        this.A01 = new C12129LH(i, new C12757VQ(this, i));
        this.A03 = true;
        A0T();
        this.A01.A07();
    }

    public final void A0V(View view, boolean z, int i) {
        this.A0E.setFullscreen(z);
        this.A00 = view;
        this.A08.A05(EnumC12163Lp.A02);
        A0N();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C109491O A0K = A0K(i);
        A0Q(A0K, z);
        AbstractC12177M3.A0M(this, A0K.A07(false));
        if (this.A09 != null) {
            A0O();
            if (z && Build.VERSION.SDK_INT >= 19) {
                this.A08.A05(EnumC12163Lp.A03);
            }
        }
    }

    public final void A0W(C111965Q c111965q) {
        this.A08.A04(c111965q.A05().getWindow());
        this.A05 = this.A0A.A1O();
        C109401F c109401f = null;
        C109401F adInfo = this.A0A.A1P();
        if (adInfo != null) {
            C109401F adInfo2 = this.A0A.A1P();
            if (adInfo2 != null) {
                c109401f = this.A0A.A1P();
            }
        }
        this.A0E.setPageDetails(this.A0A.A1S(), this.A0A.A1U(), c109401f != null ? c109401f.A0E().A03() : 0, this.A0A.A1T());
        this.A0E.setToolbarListener(new C12760VT(this, c111965q));
    }

    public final void A0X(C111965Q c111965q) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new animationAnimation$AnimationListenerC12213Md(this, this, c111965q));
        startAnimation(alphaAnimation);
    }

    public final boolean A0Y() {
        return !this.A0A.A1W().isEmpty() && this.A0A.A1P().A0R();
    }

    public final boolean A0Z() {
        return this.A03;
    }

    public final boolean A0a() {
        return this.A04;
    }

    public void ACz(boolean z) {
        if (this.A01 != null && this.A01.A05()) {
            this.A01.A06();
        }
    }

    public void ADN(boolean z) {
        if (this.A01 != null && !this.A01.A04()) {
            this.A01.A07();
        }
    }

    public InterfaceC12000J7 getAdEventManager() {
        return this.A0C;
    }

    public InterfaceC12201MR getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public String getCurrentClientToken() {
        return this.A0A.A1U();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0N();
    }

    public void setImpressionRecordingFlag(C12169Lv c12169Lv) {
        c12169Lv.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A4P(new C12736V5().A7Z());
            } else {
                getAudienceNetworkListener().A4P(A0M(0, 47, 27));
            }
        }
    }

    public void setListener(InterfaceC12201MR interfaceC12201MR) {
    }

    public void setServerSideRewardHandler(C12460Qc c12460Qc) {
        this.A06 = c12460Qc;
    }
}
