package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.V7 */
/* loaded from: assets/audience_network.dex */
public final class C12738V7 implements InterfaceC12202MS {
    public static byte[] A0D;
    public int A00;
    public C12619TC A01;
    public C114319S A02;
    public String A03;
    public final C13029Zs A04;
    public final InterfaceC12000J7 A05;
    public final InterfaceC12201MR A06;
    public final InterfaceC12240N4 A07;
    public final C12614T7 A08;
    public final AbstractC12533Rn A0C = new C11575Bp(this);
    public final AbstractC12585Sd A0B = new C11574Bo(this);
    public final AbstractC12591Sj A09 = new C11573Bn(this);
    public final AbstractC12589Sh A0A = new C11572Bm(this);

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, 61, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, 63, 32, 45, 44, 38, 28, 27, 5};
    }

    public C12738V7(C13029Zs c13029Zs, InterfaceC12240N4 interfaceC12240N4, InterfaceC12000J7 interfaceC12000J7, InterfaceC12201MR interfaceC12201MR) {
        this.A04 = c13029Zs;
        this.A05 = interfaceC12000J7;
        this.A07 = interfaceC12240N4;
        this.A08 = new C12614T7(c13029Zs);
        this.A08.A0c(new C113708S(c13029Zs));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = interfaceC12201MR;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC12201MR.A3q(this.A08, layoutParams);
        C12209MZ closeButton = new C12209MZ(c13029Zs);
        closeButton.setOnClickListener(new View$OnClickListenerC12238N2(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC12201MR.A3q(closeButton, params);
    }

    public final void A04(int i) {
        this.A08.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void A9q(Intent intent, Bundle bundle, C111965Q c111965q) {
        String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C12440QI c12440qi = new C12440QI(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * AbstractC12137LP.A02);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c12440qi.setOnClickListener(new View$OnClickListenerC12239N3(this));
            this.A06.A3q(c12440qi, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 119), 0);
        this.A02 = new C114319S(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C11979Im.A1q(this.A04)) {
            this.A01 = new C12619TC(this.A04, this.A05, this.A08, this.A03, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0Y(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0b(EnumC12476Qs.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ACz(boolean z) {
        this.A06.A4Q(A02(37, 21, 39), new C12587Sf());
        this.A08.A0W();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ADN(boolean z) {
        this.A06.A4Q(A02(37, 21, 39), new C12586Se());
        if (!this.A08.A0k()) {
            this.A08.A0b(EnumC12476Qs.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void onDestroy() {
        this.A06.A4Q(A02(37, 21, 39), new C12490R6(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0i(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A06();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}
