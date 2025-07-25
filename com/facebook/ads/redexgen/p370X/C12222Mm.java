package com.facebook.ads.redexgen.p370X;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.common.primitives.SignedBytes;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mm */
/* loaded from: assets/audience_network.dex */
public final class C12222Mm extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0E;
    public boolean A00;
    public final C13176cI A01;
    public final C13029Zs A02;
    public final InterfaceC12000J7 A03;
    public final C12008JF A04;
    public final C12169Lv A05;
    public final C12755VO A06;
    public final AbstractC12216Mg A07;
    public final AbstractC12529Rj A08;
    public final C12530Rk A09;
    public final String A0A;
    public final WeakReference<InterfaceC12221Ml> A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C12222Mm(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, C112726f c112726f, WeakReference<InterfaceC12221Ml> weakReference, int i, int i2, int i3, int i4, C13176cI c13176cI, String str) {
        super(c13029Zs);
        this.A05 = new C12169Lv();
        this.A02 = c13029Zs;
        this.A03 = interfaceC12000J7;
        this.A01 = c13176cI;
        this.A0B = weakReference;
        this.A0A = str;
        AbstractC13171cD A0C2 = this.A01.A0C();
        if (A0C2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        AbstractC12177M3.A0M(this, -1);
        this.A04 = new C12008JF(this.A01.A6r(), this.A03);
        this.A08 = A06();
        this.A09 = A07(i, i4, i2, i3);
        LinearLayout linearLayout = new LinearLayout(c13029Zs);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A07 = A04(c112726f);
        if (this.A07 != null) {
            linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A06 = A02(A0C2);
        linearLayout.addView(this.A06, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 99);
            if (A0D[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0D[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0C = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, SignedBytes.MAX_POWER_OF_TWO, 62, -1, 55, 50, 52, 54, 51, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0E = (int) (AbstractC12137LP.A02 * 40.0f);
    }

    private C12755VO A02(AbstractC13171cD abstractC13171cD) {
        C109491O A00;
        C109401F A1P = abstractC13171cD.A1P();
        C11577Br c11577Br = new C11577Br(this);
        if (getOrientation() == 1) {
            A00 = abstractC13171cD.A1O().A01();
        } else {
            C109361B A1O = abstractC13171cD.A1O();
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0D[7] = "bY8FFe1Y";
            A00 = A1O.A00();
        }
        C12755VO c12755vo = new C12755VO(this.A02, A0E, A00, A1P.A0G().A06(), A09(32, 31, 110), this.A03, c11577Br, this.A09, this.A05, abstractC13171cD.A1Q());
        c12755vo.setInfo(A1P.A0F(), A1P.A0G(), this.A01.A6r(), abstractC13171cD.A1S().A01(), null, null);
        if (C11979Im.A1G(this.A02)) {
            c12755vo.A0C();
        }
        return c12755vo;
    }

    private AbstractC12216Mg A04(C112726f c112726f) {
        View$OnClickListenerC12219Mj view$OnClickListenerC12219Mj = new View$OnClickListenerC12219Mj(this);
        String A0b = this.A01.A0b();
        if (A0H(c112726f, this.A01) && A0b != null) {
            C12750VJ c12750vj = new C12750VJ(this.A02, this.A03, c112726f, this.A04, view$OnClickListenerC12219Mj);
            String A6r = this.A01.A6r();
            String videoUrl = this.A01.A0E() != null ? this.A01.A0E().getUrl() : null;
            C12750VJ videoView = c12750vj.A0F(A6r, A0b, videoUrl, this.A01.A0O(), this.A01.A0N());
            if (C11979Im.A1K(this.A02)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C12023JU A0E2 = this.A01.A0E();
        if (A0E2 != null) {
            C12753VM A0F = new C12753VM(this.A02, view$OnClickListenerC12219Mj).A0F(A0E2.getUrl());
            if (C11979Im.A1I(this.A02)) {
                setViewAsCTA(A0F);
            }
            return A0F;
        }
        return null;
    }

    private C12749VI A06() {
        return new C12749VI(this);
    }

    private C12530Rk A07(int i, int i2, int i3, int i4) {
        C12530Rk c12530Rk = new C12530Rk(this, i, i2, true, new WeakReference(this.A08), this.A02);
        c12530Rk.A0W(i3);
        c12530Rk.A0X(i4);
        return c12530Rk;
    }

    private void A0C() {
        String A0J = this.A01.A0J();
        if (!TextUtils.isEmpty(A0J)) {
            C12114L2 c12114l2 = new C12114L2();
            C13029Zs c13029Zs = this.A02;
            Uri A00 = AbstractC12117L5.A00(A0J);
            String adChoicesLinkUrl = this.A01.A6r();
            C12114L2.A0M(c12114l2, c13029Zs, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A04.A04(EnumC12007JE.A0A, null);
        if (!AbstractC110162T.A00(this.A02.A01()).A0O(this.A02, false)) {
            A0C();
            return;
        }
        AbstractC12250NE A01 = AbstractC12251NF.A01(this.A02, this.A03, this.A01.A6r(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        AbstractC12177M3.A0T(this);
        addView(A01, new FrameLayout.LayoutParams(-1, -1));
        A01.A0K();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A09.A0U();
        } else {
            this.A09.A0V();
        }
    }

    public static boolean A0H(C112726f c112726f, C13176cI c13176cI) {
        String A0b = c13176cI.A0b();
        if (!TextUtils.isEmpty(A0b) && Build.VERSION.SDK_INT >= 14) {
            String videoUrl = c112726f.A0S(A0b);
            return !TextUtils.isEmpty(videoUrl);
        }
        return false;
    }

    public final void A0I() {
        if (this.A07 != null) {
            this.A07.A0A();
        }
        if (this.A09 != null) {
            this.A09.A0V();
        }
        AbstractC12177M3.A0J(this);
    }

    public final void A0J() {
        if (this.A07 != null) {
            AbstractC12216Mg abstractC12216Mg = this.A07;
            if (A0D[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC12216Mg.A0B();
        }
    }

    private int getOrientation() {
        Activity activity = this.A02.A0D();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C12530Rk getViewabilityChecker() {
        return this.A09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A05.A06(this.A02, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new View$OnClickListenerC12220Mk(this));
    }
}
