package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Tm */
/* loaded from: assets/audience_network.dex */
public final class C12655Tm extends FrameLayout implements InterfaceC12202MS {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public C12318OK A03;
    public AbstractC12675U6 A04;
    public C12460Qc A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C13169cB A0A;
    public final InterfaceC112025W A0B;
    public final C112726f A0C;
    public final C13029Zs A0D;
    public final InterfaceC12000J7 A0E;
    public final C12008JF A0F;
    public final View$OnSystemUiVisibilityChangeListenerC12164Lq A0G;
    public final InterfaceC12201MR A0H;
    public final FullScreenAdToolbar A0I;
    public final InterfaceC12245N9 A0J;
    public final ArrayList<C12425Q3> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private AbstractC12675U6 A08(boolean z, int i) {
        C12657To c12657To = new C12657To(this, i);
        AbstractC13171cD A1N = this.A0A.A1N(this.A00);
        boolean z2 = this.A0A.A1V() && this.A00 > 0;
        C13169cB c13169cB = this.A0A;
        String[] strArr = A0M;
        if (strArr[0].length() != strArr[1].length()) {
            String[] strArr2 = A0M;
            strArr2[5] = "3gdOFv01Kz0ZnyucWuUEmXxf6IoafQ";
            strArr2[7] = "fC48jcODpmlfGlCBCMGbrb6lg5xDB9";
            boolean z3 = c13169cB.A1U() && this.A00 > 0;
            String A1P = this.A0A.A1P();
            if (!A0V(A1N)) {
                if (A1N.A1P().A0P()) {
                    this.A0D.A0E().AGg(EnumC109040e.A07);
                    this.A0D.A0E().AGL(this.A00);
                    this.A0D.A0E().A4Z(A1P);
                    return new C11470A6(this.A0D, this.A0E, this.A0I, A1N, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, i, z2, z3, c12657To);
                }
                this.A0D.A0E().AGg(EnumC109040e.A07);
                this.A0D.A0E().AGL(this.A00);
                this.A0D.A0E().A4Z(A1P);
                return new C11501Ab(this.A0D, this.A0E, A1N, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, this.A0A.A0S(), i, this.A0A.A1J(), z, this.A0A.A1L(), this.A0A.A1W(), z2, z3, c12657To);
            }
            int i2 = this.A00;
            String[] strArr3 = A0M;
            if (strArr3[2].charAt(19) != strArr3[4].charAt(19)) {
                String[] strArr4 = A0M;
                strArr4[0] = "X43UyhT2SnEGqWLDn0";
                strArr4[1] = "NDqgRgGPAErBzSE9x3wi";
                int A01 = A01(i2);
                if (A01 == 0) {
                    this.A09 = true;
                }
                this.A0D.A0E().AGg(EnumC109040e.A06);
                this.A0D.A0E().AGL(this.A00);
                this.A0D.A0E().A4Z(A1P);
                return new C11534B8(this.A0D, this.A0J, this.A00, this.A0E, A1N, this.A0H, this.A0I, z2, z3, c12657To, A01);
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0D();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C12655Tm(C13029Zs c13029Zs, InterfaceC12245N9 interfaceC12245N9, InterfaceC12000J7 interfaceC12000J7, C13169cB c13169cB, C112726f c112726f, InterfaceC12201MR interfaceC12201MR) {
        super(c13029Zs);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new C12658Tp(this);
        this.A0D = c13029Zs;
        this.A0J = interfaceC12245N9;
        this.A0E = interfaceC12000J7;
        this.A0A = c13169cB;
        this.A0C = c112726f;
        this.A0H = interfaceC12201MR;
        this.A0F = new C12008JF(this.A0A.A1N(0).A1U(), this.A0E);
        this.A0G = new View$OnSystemUiVisibilityChangeListenerC12164Lq(this);
        this.A0G.A05(EnumC12163Lp.A02);
        this.A05 = new C12460Qc(this.A0D, this.A0J, this.A0A.A0m(), interfaceC12201MR);
        this.A0I = A05();
        addView(this.A0I, new FrameLayout.LayoutParams(-1, this.A0I.getToolbarHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        if (r5 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r5 == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12655Tm.A00():int");
    }

    private int A01(int i) {
        if (this.A0A.A1W()) {
            C13169cB c13169cB = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i < c13169cB.A1R().size() && i >= 0) {
                return this.A0A.A1R().get(i).intValue();
            }
        }
        return this.A0A.A0S();
    }

    public static /* synthetic */ int A02(C12655Tm c12655Tm, int i) {
        int i2 = c12655Tm.A01 + i;
        c12655Tm.A01 = i2;
        return i2;
    }

    private FullScreenAdToolbar A05() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2, -1, false);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new C12656Tn(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        int A00 = A00();
        if (A00 != 0) {
            this.A0D.A0E().A4c(A00);
        }
    }

    private void A0B() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A1N(this.A00 - 1).A1U())) {
            InterfaceC12000J7 interfaceC12000J7 = this.A0E;
            String A1U = this.A0A.A1N(this.A00 - 1).A1U();
            C12306O8 A03 = new C12306O8().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC12675U6 abstractC12675U6 = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            interfaceC12000J7.A9x(A1U, A03.A02(abstractC12675U6 != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0C() {
        this.A0D.A0E().A4a();
        this.A07 = true;
        this.A03 = new C12318OK(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        C12425Q3 c12425q3 = null;
        Iterator<C12425Q3> it = this.A0K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C12425Q3 s = it.next();
            if (s.A00 == C12425Q3.A06) {
                c12425q3 = s;
                break;
            }
        }
        if (c12425q3 != null) {
            A0I(this.A03, c12425q3);
        } else if (!this.A0K.isEmpty()) {
            A0I(this.A03, this.A0K.get(0));
        }
        A0Q(true);
        this.A0I.setOnlyPageDetails(null);
        if (this.A04 != null) {
            AbstractC12177M3.A0J(this.A04);
            this.A04.A0z();
            this.A04 = null;
        }
        AbstractC12177M3.A0J(this.A03);
        AbstractC12177M3.A0G(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0E() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0G.A05(EnumC12163Lp.A03);
    }

    private synchronized void A0F() {
        this.A0H.A4P(this.A0J.A6F());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(float f) {
        float seenCurrentPosMS;
        float A01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A1W() ? 0 : this.A01) + f;
        if (A01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A1W()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            this.A09 = true;
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(int i) {
        this.A0D.A0E().A4X(i);
        this.A09 = true;
        A0F();
        A0B();
        this.A0H.A4P(this.A0J.A7I());
    }

    private void A0I(ViewGroup viewGroup, C12425Q3 c12425q3) {
        if (c12425q3.A00 == C12425Q3.A06 && c12425q3.A03 != null) {
            AbstractC12335Ob.A00(this.A0D, viewGroup, c12425q3.A03);
        } else {
            int i = c12425q3.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            AbstractC12177M3.A0M(viewGroup, i);
        }
        this.A0I.setFullscreen(c12425q3.A05);
        this.A0I.A09(c12425q3.A02, c12425q3.A04);
    }

    private void A0J(AbstractC13171cD abstractC13171cD) {
        if (A0V(abstractC13171cD) && this.A02 == 2) {
            this.A0I.setOnlyPageDetails(abstractC13171cD.A1S());
        } else {
            this.A0I.setOnlyPageDetails(null);
        }
    }

    private final void A0K(C111965Q c111965q) {
        c111965q.A0A(this.A0B);
        int i = c111965q.A05().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0R(this.A0A.A1T(), i);
        A0E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Q(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0T()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto La4
            boolean r0 = r6.A0S()
            if (r0 != 0) goto La4
            boolean r5 = r6.A0U()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12655Tm.A0M
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lac
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12655Tm.A0M
            java.lang.String r1 = "abX2oERzf98UggHhJlwc5xOu8ehA434Q"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE"
            r0 = 4
            r2[r0] = r1
            if (r5 != 0) goto La4
            r1 = 1
        L33:
            boolean r0 = r6.A0S()
            if (r0 != 0) goto L70
            if (r1 != 0) goto L70
            r6.A09 = r3
            if (r7 == 0) goto L4c
            com.facebook.ads.internal.view.FullScreenAdToolbar r3 = r6.A0I
            r2 = 0
            r1 = 0
            r0 = 85
            java.lang.String r0 = A09(r2, r1, r0)
            r3.setToolbarActionMessage(r0)
        L4c:
            com.facebook.ads.internal.view.FullScreenAdToolbar r3 = r6.A0I
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12655Tm.A0M
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto La6
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12655Tm.A0M
            java.lang.String r1 = "6hDdRvQvhZI2wvmWyf"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "dfELTL2TgrvtcbRt37j2"
            r0 = 1
            r2[r0] = r1
            r3.setToolbarActionMode(r4)
        L6f:
            return
        L70:
            com.facebook.ads.internal.view.FullScreenAdToolbar r4 = r6.A0I
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12655Tm.A0M
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L94
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12655Tm.A0M
            java.lang.String r1 = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3"
            r0 = 4
            r2[r0] = r1
            r4.setToolbarActionMode(r3)
            goto L6f
        L94:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12655Tm.A0M
            java.lang.String r1 = "uCb48oA3"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "eCwSqnipc7icS"
            r0 = 3
            r2[r0] = r1
            r4.setToolbarActionMode(r3)
            goto L6f
        La4:
            r1 = 0
            goto L33
        La6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lac:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12655Tm.A0Q(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(boolean z, int i) {
        if (this.A04 != null) {
            this.A04.A0z();
            this.A04.removeAllViews();
            AbstractC12177M3.A0J(this.A04);
        }
        if (!A0S()) {
            this.A09 = true;
            if (A0T()) {
                A0C();
                return;
            } else {
                A0H(1);
                return;
            }
        }
        if (this.A0A.A1W()) {
            this.A09 = false;
            FullScreenAdToolbar fullScreenAdToolbar = this.A0I;
            String[] strArr = A0M;
            if (strArr[0].length() != strArr[1].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "hirdpqFqEpTGRF7TvzfLNB23PEQWY5";
                strArr2[7] = "Eb3FssofDa3ImZpKtnPvm2BrdUNNTg";
                fullScreenAdToolbar.setProgressImmediate(0.0f);
            }
            throw new RuntimeException();
        }
        boolean isLoaded = this.A0D.A00().A9M(this.A0A.A1N(this.A00).A1U(), this.A0A.A1O());
        if (!isLoaded) {
            this.A0D.A0E().A4Y();
            A0H(2);
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                return;
            }
            throw new RuntimeException();
        }
        AbstractC12675U6 A08 = A08(z, i);
        this.A04 = A08;
        setupToolbarForAd(A08);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A12();
    }

    private boolean A0S() {
        return this.A00 < this.A0A.A1K();
    }

    private boolean A0T() {
        return this.A0A.A1J() == 2;
    }

    private final boolean A0U() {
        return this.A07;
    }

    public static boolean A0V(AbstractC13171cD abstractC13171cD) {
        return TextUtils.isEmpty(abstractC13171cD.A1P().A0E().A08());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void A9q(Intent intent, Bundle bundle, C111965Q c111965q) {
        this.A0H.A3q(this, A0N);
        A0K(c111965q);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ACz(boolean z) {
        if (this.A04 != null) {
            this.A04.A13(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ADN(boolean z) {
        if (this.A04 != null) {
            this.A04.A14(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void AFx(Bundle bundle) {
    }

    public AbstractC12675U6 getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof C11534B8) {
            A0I(this.A04, this.A04.getFullScreenAdStyle());
            A0J(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0z();
            this.A04 = null;
        }
        this.A0D.A00().A4d(this.A0A.A1O());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC12201MR interfaceC12201MR) {
    }

    public void setServerSideRewardHandler(C12460Qc c12460Qc) {
        this.A05 = c12460Qc;
    }

    private void setupToolbarForAd(AbstractC12675U6 abstractC12675U6) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC13171cD A1N = this.A0A.A1N(this.A00);
        this.A0I.A0C(this.A0D, A1N.A1J());
        this.A0I.A0B(A1N.A1S(), A1N.A1U(), A01(this.A00));
        C12425Q3 fullScreenAdStyle = abstractC12675U6.getFullScreenAdStyle();
        A0I(abstractC12675U6, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A09(4, 3, 90) + (this.A00 + 1) + A09(0, 4, 21) + this.A0A.A1K());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0J(A1N);
    }
}
