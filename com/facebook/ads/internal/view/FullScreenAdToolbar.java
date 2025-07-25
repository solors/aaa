package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.redexgen.p370X.AbstractC12137LP;
import com.facebook.ads.redexgen.p370X.AbstractC12177M3;
import com.facebook.ads.redexgen.p370X.AbstractC12200MQ;
import com.facebook.ads.redexgen.p370X.AbstractC12339Of;
import com.facebook.ads.redexgen.p370X.C109491O;
import com.facebook.ads.redexgen.p370X.C109601Z;
import com.facebook.ads.redexgen.p370X.C109661f;
import com.facebook.ads.redexgen.p370X.C12008JF;
import com.facebook.ads.redexgen.p370X.C12198MO;
import com.facebook.ads.redexgen.p370X.C12229Mt;
import com.facebook.ads.redexgen.p370X.C12237N1;
import com.facebook.ads.redexgen.p370X.C12441QJ;
import com.facebook.ads.redexgen.p370X.C13029Zs;
import com.facebook.ads.redexgen.p370X.EnumC12185MB;
import com.facebook.ads.redexgen.p370X.InterfaceC12199MP;
import com.facebook.ads.redexgen.p370X.InterfaceC12201MR;
import com.facebook.ads.redexgen.p370X.View$OnClickListenerC12210Ma;
import com.facebook.ads.redexgen.p370X.View$OnClickListenerC12713Ui;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC12200MQ {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C12198MO A00;
    public InterfaceC12199MP A01;
    public InterfaceC12199MP A02;
    public C12229Mt A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final C12008JF A07;
    public final InterfaceC12201MR A08;
    public final C12237N1 A09;
    public final C12441QJ A0A;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 22);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (AbstractC12137LP.A02 * 10.0f);
        A0H = (int) (AbstractC12137LP.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (AbstractC12137LP.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C13029Zs c13029Zs, InterfaceC12201MR interfaceC12201MR, C12008JF c12008jf, int i, int i2, boolean z) {
        super(c13029Zs);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z;
        this.A08 = interfaceC12201MR;
        this.A07 = c12008jf;
        setGravity(16);
        this.A09 = new C12237N1(c13029Zs, i, z);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new View$OnClickListenerC12210Ma(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c13029Zs);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C12441QJ(c13029Zs);
            AbstractC12177M3.A0G(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i2 != -1) {
                A0C(c13029Zs, i2);
                return;
            }
            return;
        }
        if (i2 != -1) {
            A0C(c13029Zs, i2);
        }
        this.A06 = new RelativeLayout(c13029Zs);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C12441QJ(c13029Zs);
        AbstractC12177M3.A0G(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public final void A05() {
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public final void A06() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public final void A07() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public final void A08(float f, int i) {
        this.A09.A03(f, i);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public final void A09(C109491O c109491o, boolean z) {
        boolean z2 = this.A04;
        int A04 = c109491o.A04(z2);
        this.A0A.A02(c109491o.A0A(z2), A04);
        boolean z3 = this.A05;
        String A02 = A02(8, 9, 52);
        if (!z3) {
            if (this.A00 != null) {
                this.A00.setIconColors(A04);
                this.A00.setContentDescription(A02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(A04);
            this.A03.setContentDescription(A02);
        }
        this.A09.A04(c109491o, z2, z);
        if (z2) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            AbstractC12177M3.A0S(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        AbstractC12177M3.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public final boolean A0A() {
        return this.A09.A05();
    }

    public final void A0B(C109601Z c109601z, String str, int i) {
        this.A09.setInitialUnskippableSeconds(i);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c109601z, str, this.A07, this.A08);
            }
        } else if (this.A00 == null) {
        } else {
            this.A00.setAdDetails(c109601z, str, this.A07, this.A08);
        }
    }

    public final void A0C(C13029Zs c13029Zs, int i) {
        if (this.A00 != null) {
            AbstractC12177M3.A0J(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new C12198MO(c13029Zs, i);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
            return;
        }
        this.A03 = new C12229Mt(c13029Zs);
        layoutParams.setMargins(A0F, A0F, A0G, A0F);
        addView(this.A03, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public View getDetailsContainer() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public int getToolbarHeight() {
        return AbstractC12200MQ.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public InterfaceC12199MP getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setAdReportingVisible(boolean z) {
        A04(!this.A05 ? this.A00 : this.A03, z);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setCTAClickListener(View$OnClickListenerC12713Ui view$OnClickListenerC12713Ui) {
        this.A0A.setOnClickListener(AbstractC12339Of.A03(view$OnClickListenerC12713Ui, A02(17, 7, 47)));
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setFullscreen(boolean z) {
        this.A04 = z;
    }

    public void setOnlyPageDetails(C109601Z c109601z) {
        if (c109601z != null) {
            this.A0A.setPageDetails(c109601z);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setPageDetails(C109601Z c109601z, String str, int i, C109661f c109661f) {
        this.A09.setInitialUnskippableSeconds(i);
        this.A0A.setPageDetails(c109601z);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c109601z, str, this.A07, this.A08);
            }
        } else if (this.A00 == null) {
        } else {
            this.A00.setAdDetails(c109601z, str, this.A07, this.A08);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setPageDetailsVisible(boolean z) {
        this.A06.removeAllViews();
        if (z) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setProgress(float f) {
        this.A09.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setProgressImage(EnumC12185MB enumC12185MB) {
        this.A09.setProgressImage(enumC12185MB);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setProgressImmediate(float f) {
        this.A09.setProgressImmediate(f);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setProgressSpinnerInvisible(boolean z) {
        this.A09.setProgressSpinnerInvisible(z);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            AbstractC12177M3.A0Q(view, 0, ViewCompat.MEASURED_STATE_MASK, A0E);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setToolbarActionMode(int i) {
        this.A09.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12200MQ
    public void setToolbarListener(InterfaceC12199MP interfaceC12199MP) {
        this.A02 = interfaceC12199MP;
    }
}
