package com.facebook.ads.redexgen.p370X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bM */
/* loaded from: assets/audience_network.dex */
public final class C13118bM extends AbstractC110032G implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final C13133bb A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-62, -57, -51, -40, -66, -53, -53, -56, -53, -40, -68, -56, -67, -66, -40, -60, -66, -46, 117, 120, 119, 112, -120, 114, 119, Byte.MAX_VALUE, 106, 117, 114, 109, 106, 125, 114, 120, 119, -120, 125, 114, 118, 110, -120, 116, 110, -126, -66, -65, -67, -54, -80, -67, -67, -70, -67, -54, -72, -80, -66, -66, -84, -78, -80, -54, -74, -80, -60};
    }

    public C13118bM(String str, InterfaceC110052I interfaceC110052I, C13133bb c13133bb) {
        super(str, interfaceC110052I);
        this.A00 = c13133bb;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC10846Ad interfaceC10846Ad) {
        super.A00.ACk(1024, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC10846Ad interfaceC10846Ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 14), this.A00.A0D());
        super.A00.ACk(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC10846Ad interfaceC10846Ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, 80), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 94), adError.getErrorCode());
        super.A00.ACk(1023, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.ACk(1026, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(InterfaceC10846Ad interfaceC10846Ad) {
        super.A00.ACk(1022, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(InterfaceC10846Ad interfaceC10846Ad) {
        super.A00.ACk(1021, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC10846Ad interfaceC10846Ad) {
        super.A00.ACk(1025, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.ACk(3000, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.ACk(3002, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.ACk(3001, this.A01, null);
    }
}
