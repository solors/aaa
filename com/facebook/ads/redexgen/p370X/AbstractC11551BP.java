package com.facebook.ads.redexgen.p370X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.BP */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11551BP extends AbstractC12693UO implements InterfaceC12131LJ {
    public static byte[] A0L;
    public static String[] A0M = {"XgHadHW09EVAxZ9Csjyh8Iwd", "cGY", "0gnHO0byxZtUV0t5q6", "nitlVKI6s75UlUdu4qHy2TBluRJ6Vnqb", "dqu", "CAnKNEP5j3LNWAO1IgUwk41cBq", "Gj8h5dX0pUMTu0Q6FRM85YsFx7LjGw4a", "ydUjPQqek3X4wwrCfoz9Rz5n"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public RelativeLayout A00;
    public C12235Mz A01;
    public InterfaceC12375PF A02;
    public C12638TV A03;
    public C12444QM A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C13029Zs A0B;
    public final C12133LL A0C;
    public final InterfaceC12201MR A0D;
    public final C12346Om A0E;
    public final AbstractC12591Sj A0F;
    public final AbstractC12585Sd A0G;
    public final AbstractC12533Rn A0H;
    public final AbstractC12493R9 A0I;
    public final AbstractC12463Qf A0J;
    public final String A0K;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0M;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[1] = "5LW";
            strArr2[4] = "hlZ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
            i4++;
        }
    }

    public static void A06() {
        A0L = new byte[]{68, 70, 85, 72, 82, 84, 66, 75, 120, 68, 70, 85, 67};
    }

    public abstract void A1A(C13029Zs c13029Zs);

    static {
        A06();
        A0O = (int) (AbstractC12137LP.A02 * 1.0f);
        A0P = (int) (AbstractC12137LP.A02 * 4.0f);
        A0N = (int) (AbstractC12137LP.A02 * 6.0f);
    }

    public AbstractC11551BP(C12346Om c12346Om, boolean z, String str, C12638TV c12638tv) {
        super(c12346Om, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0J = new C11556BU(this);
        this.A0F = new C11555BT(this);
        this.A0H = new C11554BS(this);
        this.A0G = new C11553BR(this);
        this.A0I = new C11552BQ(this);
        this.A0D = c12346Om.A0A();
        this.A0E = c12346Om;
        this.A03 = c12638tv;
        this.A0K = str;
        this.A0B = c12346Om.A05();
        this.A0C = C12133LL.A01(c12346Om.A05(), c12346Om.A04(), this);
        setGravity(17);
        setPadding(A0O, 0, A0O, A0O);
        AbstractC12177M3.A0M(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    public void A05() {
        if (this.A02 == null) {
            return;
        }
        if ((A18() && this.A07) || (!A18() && this.A06)) {
            this.A02.ABD();
        }
    }

    private void A07(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC12177M3.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12342Oi
    public boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12342Oi
    public final void A0v() {
        super.A0v();
        this.A0C.A0B();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12342Oi
    public final boolean A11() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final void A14() {
        if (A18()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final void A15() {
        if (A18()) {
            A16();
            C12444QM c12444qm = this.A04;
            EnumC12476Qs enumC12476Qs = EnumC12476Qs.A02;
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "GrzUS";
            c12444qm.A05(enumC12476Qs);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final void A16() {
        float volume = this.A03.A0P().getVolume();
        if (A18()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                C12444QM c12444qm = this.A04;
                if (A0M[5].length() == 9) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[1] = "cdp";
                strArr[4] = "iOc";
                c12444qm.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final boolean A17() {
        if (A18()) {
            boolean A06 = this.A04.A06();
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "SbvNib3Q04NWLkmSI4CaBbpy";
            if (A06) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final boolean A18() {
        return this.A05;
    }

    public final /* synthetic */ void A19(View view) {
        getCtaButton().A09(A04(0, 13, 44));
    }

    public final void A1B(Map<String, String> extraParams) {
        this.A04.A02();
        if (A18()) {
            this.A04.A04(getAdEventManager(), this.A0K, extraParams);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12131LJ
    public final void ACa() {
        this.A0D.A4P(this.A0E.A04().A0Y());
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C12444QM getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A09.addRoundRect(this.A0A, A0N, A0N, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0O, 0.0f, getWidth() - A0O, getHeight() - A0O);
        this.A09.addRoundRect(this.A0A, A0P, A0P, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A03(str, str2, null, true, false);
    }

    public void setCTAInfo(C109501P c109501p, Map<String, String> extraData) {
        getCtaButton().setCta(c109501p, this.A0K, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC12718Un(this.A01, this.A0B).A04().A06(new C12692UN(this, null)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC12375PF interfaceC12375PF) {
        this.A02 = interfaceC12375PF;
    }

    public void setUpImageView(C13029Zs c13029Zs) {
        this.A01 = new C12235Mz(c13029Zs);
        if (C11979Im.A1C(c13029Zs)) {
            AbstractC12309OB.A00(this.A01, C11979Im.A1D(c13029Zs), new View$OnClickListenerC12381PL(this));
        }
        A07(this.A01);
    }

    public void setUpMediaContainer(C13029Zs c13029Zs) {
        this.A00 = new RelativeLayout(c13029Zs);
        A07(this.A00);
        C12132LK A0A = this.A0C.A0A(this.A0E.A04());
        this.A0E.A05().A0G().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0C);
        if (this.A0E.A04().A17() && C11979Im.A2j(this.A0B)) {
            this.A00.setOnClickListener(new View$OnClickListenerC12380PK(this));
        } else if (!A0A.A00) {
        } else {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.PJ
                {
                    AbstractC11551BP.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC11551BP.this.A19(view);
                }
            });
        }
    }

    public void setUpVideoView(C13029Zs c13029Zs) {
        this.A04 = new C12444QM(c13029Zs, new C12008JF(this.A0K, getAdEventManager()));
        if (C11979Im.A1E(c13029Zs)) {
            AbstractC12309OB.A00(this.A04, C11979Im.A1F(c13029Zs), new View$OnClickListenerC12382PM(this));
        }
        A07(this.A04);
    }

    private void setUpView(C13029Zs c13029Zs) {
        setUpImageView(c13029Zs);
        setUpVideoView(c13029Zs);
        setUpMediaContainer(c13029Zs);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A1A(c13029Zs);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0J);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0I);
    }
}
