package com.facebook.ads.redexgen.p370X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.V2 */
/* loaded from: assets/audience_network.dex */
public final class C12733V2 extends AbstractC12250NE {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C110152S A04;
    public final C13029Zs A05;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, 18, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A0C();
        A09 = (int) (AbstractC12137LP.A02 * 4.0f);
        A08 = (int) (AbstractC12137LP.A02 * 10.0f);
        A07 = (int) (AbstractC12137LP.A02 * 44.0f);
    }

    public C12733V2(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str) {
        super(c13029Zs, interfaceC12000J7, str);
        this.A05 = c13029Zs;
        this.A04 = AbstractC110162T.A00(c13029Zs.A01());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        AbstractC12177M3.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12250NE
    public final void A0L() {
        this.A01.setImageBitmap(AbstractC12186MC.A01(EnumC12185MB.CROSS));
        this.A01.setOnClickListener(new View$OnClickListenerC12259NN(this));
        this.A01.setContentDescription(A0B(4, 18, 84));
        C12254NI c12254ni = new C12254NI(this.A05);
        c12254ni.setData(this.A04.A0H(), EnumC12185MB.HIDE_AD);
        c12254ni.setOnClickListener(new View$OnClickListenerC12260NO(this, c12254ni));
        C12254NI c12254ni2 = new C12254NI(this.A05);
        c12254ni2.setData(this.A04.A0L(), EnumC12185MB.REPORT_AD);
        c12254ni2.setOnClickListener(new View$OnClickListenerC12261NP(this, c12254ni2));
        C12254NI c12254ni3 = new C12254NI(this.A05);
        c12254ni3.setData(this.A04.A0M(), EnumC12185MB.AD_CHOICES_ICON);
        c12254ni3.setOnClickListener(new View$OnClickListenerC12262NQ(this, c12254ni3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        AbstractC12177M3.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c12254ni, layoutParams);
        this.A02.addView(c12254ni2, layoutParams);
        this.A02.addView(c12254ni3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12250NE
    public final void A0M() {
        AbstractC12177M3.A0I(this);
        AbstractC12177M3.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12250NE
    public final void A0N(C110192W c110192w, EnumC110172U enumC110172U) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        AbstractC12177M3.A0Y(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        AbstractC12177M3.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12250NE
    public final void A0O(C110192W c110192w, EnumC110172U enumC110172U) {
        AbstractC12177M3.A0T(this.A03);
        this.A01.setImageBitmap(AbstractC12186MC.A01(EnumC12185MB.BACK_ARROW));
        this.A01.setOnClickListener(new View$OnClickListenerC12263NR(this));
        this.A01.setContentDescription(A0B(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C110192W c110192w2 : c110192w.A05()) {
            C12254NI c12254ni = new C12254NI(this.A05);
            c12254ni.setData(c110192w2.A04(), null);
            c12254ni.setOnClickListener(new View$OnClickListenerC12264NS(this, c12254ni, c110192w2));
            this.A02.addView(c12254ni, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12250NE
    public final boolean A0P() {
        return true;
    }
}
