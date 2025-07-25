package com.facebook.ads.redexgen.p370X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.BZ */
/* loaded from: assets/audience_network.dex */
public class C11561BZ extends AbstractC12693UO {
    public C12235Mz A00;
    public InterfaceC12375PF A01;
    public C12444QM A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C12638TV A07;
    public final C13029Zs A08;
    public final AbstractC12591Sj A09;
    public final AbstractC12585Sd A0A;
    public final AbstractC12533Rn A0B;
    public final AbstractC12493R9 A0C;
    public final AbstractC12463Qf A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C12346Om A0I;
    public static String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (AbstractC12137LP.A02 * 0.0f);
    public static final int A0M = (int) (AbstractC12137LP.A02 * 9.0f);
    public static final int A0K = (int) (AbstractC12137LP.A02 * 9.0f);

    public C11561BZ(C12346Om c12346Om, boolean z, String str, C12638TV c12638tv) {
        super(c12346Om, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new C11570Bk(this);
        this.A09 = new C11569Bj(this);
        this.A0B = new C11568Bi(this);
        this.A0A = new C11565Bf(this);
        this.A0C = new C11564Be(this);
        this.A0I = c12346Om;
        this.A07 = c12638tv;
        this.A0E = str;
        this.A08 = c12346Om.A05();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        AbstractC12177M3.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    public void A02() {
        if (this.A0I.A0B() != null && this.A02 != null) {
            C12241N5 A0B = this.A0I.A0B();
            C12614T7 simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            A0B.A9r(simpleVideoView);
            if (C11979Im.A2A(getContext())) {
                this.A0I.A0B().A07(false);
            }
        }
    }

    public void A03() {
        if (this.A0I.A0B() != null) {
            this.A0I.A0B().A05();
            if (this.A02 != null) {
                this.A0I.A0B().AHD(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0023, code lost:
        if (r3 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.PF r0 = r4.A01
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r4.A18()
            if (r0 == 0) goto L25
            boolean r3 = r4.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11561BZ.A0J
            r0 = 4
            r1 = r1[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            r0 = 83
            if (r1 == r0) goto L35
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11561BZ.A0J
            java.lang.String r1 = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS"
            r0 = 4
            r2[r0] = r1
            if (r3 != 0) goto L2f
        L25:
            boolean r0 = r4.A18()
            if (r0 != 0) goto L34
            boolean r0 = r4.A04
            if (r0 == 0) goto L34
        L2f:
            com.facebook.ads.redexgen.X.PF r0 = r4.A01
            r0.ABD()
        L34:
            return
        L35:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11561BZ.A04():void");
    }

    private void A05(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A06(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC12177M3.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12342Oi
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12342Oi
    public final boolean A11() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final void A14() {
        if (A18() && this.A02 != null) {
            C12444QM c12444qm = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c12444qm.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final void A15() {
        if (A18()) {
            A16();
            if (this.A02 != null) {
                this.A02.A05(EnumC12476Qs.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final void A16() {
        float volume = this.A07.A0P().getVolume();
        if (!A18() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final boolean A17() {
        return A18() && this.A02 != null && this.A02.A06();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12693UO
    public final boolean A18() {
        return this.A03;
    }

    public final void A19(Map<String, String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A18()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C12444QM getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12342Oi, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C109501P c109501p, Map<String, String> extraData) {
        getCtaButton().setCta(c109501p, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new AsyncTaskC12718Un(this.A00, this.A08).A04().A06(new C12710Uf(this, null)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC12375PF interfaceC12375PF) {
        this.A01 = interfaceC12375PF;
    }

    public void setUpImageView(C13029Zs c13029Zs) {
        this.A00 = new C12235Mz(c13029Zs);
        if (C11979Im.A1C(c13029Zs)) {
            AbstractC12309OB.A00(this.A00, C11979Im.A1D(c13029Zs), new View$OnClickListenerC12320OM(this));
        }
        A06(this.A00);
    }

    public void setUpMediaContainer(C13029Zs c13029Zs) {
        this.A06 = new RelativeLayout(c13029Zs);
        A06(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A05(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A05(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C13029Zs c13029Zs) {
        this.A02 = new C12444QM(c13029Zs, new C12008JF(this.A0E, getAdEventManager()));
        if (C11979Im.A1E(c13029Zs)) {
            AbstractC12309OB.A00(this.A02, C11979Im.A1F(c13029Zs), new View$OnClickListenerC12321ON(this));
        }
        C12444QM c12444qm = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A06(c12444qm);
    }

    private void setUpView(C13029Zs c13029Zs) {
        setUpImageView(c13029Zs);
        setUpVideoView(c13029Zs);
        setUpMediaContainer(c13029Zs);
    }

    public void setVideoPlaceholderUrl(String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        C12444QM c12444qm = this.A02;
        String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c12444qm != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
