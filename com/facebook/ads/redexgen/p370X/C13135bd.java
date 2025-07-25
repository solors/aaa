package com.facebook.ads.redexgen.p370X;

import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bd */
/* loaded from: assets/audience_network.dex */
public class C13135bd extends AbstractC109150q {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C13133bb A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C13135bd(C13133bb c13133bb) {
        this.A00 = c13133bb;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C11795Fi c11795Fi;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C13129bX c13129bX;
        C11795Fi c11795Fi2;
        C11795Fi c11795Fi3;
        C11795Fi c11795Fi4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c11795Fi = this.A00.A03;
        if (c11795Fi != null && C11979Im.A22(this.A00.A06)) {
            c11795Fi2 = this.A00.A03;
            c11795Fi2.A0R(new C13136be(this));
            c11795Fi3 = this.A00.A03;
            c11795Fi3.A0M();
            c11795Fi4 = this.A00.A03;
            c11795Fi4.A0J();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c13129bX = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c13129bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C13129bX c13129bX;
        interstitialAdExtendedListener = this.A00.A07;
        c13129bX = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c13129bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C13129bX c13129bX;
        this.A00.A06.A0E().A35();
        interstitialAdExtendedListener = this.A00.A07;
        c13129bX = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c13129bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C13129bX c13129bX;
        interstitialAdExtendedListener = this.A00.A07;
        c13129bX = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c13129bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A0F(InterfaceC109140p interfaceC109140p) {
        C11795Fi c11795Fi;
        C11795Fi c11795Fi2;
        AbstractC109391E abstractC109391E;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C13129bX c13129bX;
        AbstractC109391E abstractC109391E2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C13129bX c13129bX2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C13129bX c13129bX3;
        InterstitialAd interstitialAd2;
        C13129bX c13129bX4;
        C13129bX c13129bX5;
        InterstitialAd interstitialAd3;
        C13129bX c13129bX6;
        C13129bX c13129bX7;
        C13129bX c13129bX8;
        c11795Fi = this.A00.A03;
        if (c11795Fi != null) {
            this.A00.A05 = true;
            C13133bb c13133bb = this.A00;
            c11795Fi2 = this.A00.A03;
            c13133bb.A02 = c11795Fi2.A0H();
            abstractC109391E = this.A00.A02;
            if (!(abstractC109391E instanceof AbstractC13171cD)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c13129bX = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c13129bX.A6E());
                    return;
                }
            } else {
                abstractC109391E2 = this.A00.A02;
                final AbstractC13171cD abstractC13171cD = (AbstractC13171cD) abstractC109391E2;
                if (abstractC13171cD.A1N() > 0) {
                    C12118L6 c12118l6 = new C12118L6();
                    C13029Zs c13029Zs = this.A00.A06;
                    c13129bX6 = this.A00.A08;
                    if (c12118l6.A09(c13029Zs, c13129bX6.A08(), abstractC13171cD.A1N())) {
                        c12118l6.A08(this.A00.A06, true);
                        C13133bb c13133bb2 = this.A00;
                        C13029Zs c13029Zs2 = this.A00.A06;
                        c13129bX7 = this.A00.A08;
                        String A0A = c13129bX7.A0A();
                        c13129bX8 = this.A00.A08;
                        c13133bb2.A01 = c12118l6.A06(c13029Zs2, A0A, c13129bX8.A08());
                    } else {
                        C13133bb c13133bb3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            c12118l6.A08(c13133bb3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            c12118l6.A08(c13133bb3.A06, false);
                        }
                    }
                }
                C13133bb c13133bb4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c13133bb4.A01;
                    if (interstitialAd != null) {
                        abstractC13171cD.A1Z(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.23
                            @Override // com.facebook.ads.AdListener
                            public final void onAdClicked(InterfaceC10846Ad interfaceC10846Ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onAdLoaded(InterfaceC10846Ad interfaceC10846Ad) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C13129bX c13129bX9;
                                interstitialAdExtendedListener4 = C13135bd.this.A00.A07;
                                c13129bX9 = C13135bd.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c13129bX9.A6E());
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onError(InterfaceC10846Ad interfaceC10846Ad, AdError adError) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C13129bX c13129bX9;
                                C13135bd.this.A00.A01 = null;
                                abstractC13171cD.A1Z(false);
                                interstitialAdExtendedListener4 = C13135bd.this.A00.A07;
                                c13129bX9 = C13135bd.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c13129bX9.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDismissed(InterfaceC10846Ad interfaceC10846Ad) {
                                C11795Fi c11795Fi3;
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C13129bX c13129bX9;
                                C11795Fi c11795Fi4;
                                C11795Fi c11795Fi5;
                                C11795Fi c11795Fi6;
                                C13135bd.this.A00.A04 = false;
                                c11795Fi3 = C13135bd.this.A00.A03;
                                if (c11795Fi3 != null) {
                                    c11795Fi4 = C13135bd.this.A00.A03;
                                    c11795Fi4.A0R(new C13137bf(this));
                                    c11795Fi5 = C13135bd.this.A00.A03;
                                    c11795Fi5.A0M();
                                    c11795Fi6 = C13135bd.this.A00.A03;
                                    c11795Fi6.A0J();
                                    C13135bd.this.A00.A03 = null;
                                }
                                interstitialAdExtendedListener4 = C13135bd.this.A00.A07;
                                c13129bX9 = C13135bd.this.A00.A08;
                                interstitialAdExtendedListener4.onInterstitialDismissed(c13129bX9.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDisplayed(InterfaceC10846Ad interfaceC10846Ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onLoggingImpression(InterfaceC10846Ad interfaceC10846Ad) {
                            }
                        });
                        c13129bX4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c13129bX4.A0B());
                        c13129bX5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c13129bX5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C13133bb c13133bb5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c13133bb5.A07;
                        c13129bX3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c13129bX3.A6E());
                        return;
                    }
                    A02[2] = "joZPUUFug9Ts";
                    interstitialAdExtendedListener2 = c13133bb5.A07;
                    c13129bX2 = this.A00.A08;
                    interstitialAdExtendedListener2.onAdLoaded(c13129bX2.A6E());
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A07().AA0(A00(0, 3, 98), AbstractC113568E.A0N, new C113578F(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109150q
    public final void A0G(C12034Jg c12034Jg) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C13129bX c13129bX;
        InterfaceC108920S A0E = this.A00.A06.A0E();
        j = this.A00.A00;
        A0E.A38(C12168Lu.A01(j), c12034Jg.A03().getErrorCode(), c12034Jg.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c13129bX = this.A00.A08;
        interstitialAdExtendedListener.onError(c13129bX.A6E(), AbstractC12120L8.A00(c12034Jg));
    }
}
