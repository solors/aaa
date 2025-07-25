package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.5e */
/* loaded from: assets/audience_network.dex */
public final class C112105e implements InterstitialAdApi, Repairable {
    public static byte[] A04;
    public final InterstitialAd A00;
    public final C13129bX A01;
    public final C11790Fd A02;
    public final C13029Zs A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-64, -65, -61, -15, -62, -12, -63, -58, -28, -22, 20, -27, -22, -27, -24, 21, -39, 9, 9, 6, -36, -40, -38, 10, 2, 39, 45, 30, 43, 39, 26, 37, -39, 30, 43, 43, 40, 43, -25, -61, 44, 81, 87, 72, 85, 86, 87, 76, 87, 76, 68, 79, 3, 68, 71, 3, 71, 72, 86, 87, 85, 82, 92, 72, 71, 50, 87, 93, 78, 91, 92, 93, 82, 93, 82, 74, 85, 9, 74, 77, 9, 85, 88, 74, 77, 9, 91, 78, 90, 94, 78, 92, 93, 78, 77, 39, 76, 82, 67, 80, 81, 82, 71, 82, 71, 63, 74, -2, 63, 66, -2, 81, 70, 77, 85, -2, 65, 63, 74, 74, 67, 66, -13, -12, 2, 3, 1, -2, 8, 88, 99, SignedBytes.MAX_POWER_OF_TWO, 99, 85, 88, 53, 88, -8, -19, -12, -4};
    }

    public C112105e(Context context, String str, InterstitialAd interstitialAd) {
        this.A00 = interstitialAd;
        String uuid = UUID.randomUUID().toString();
        this.A03 = C112075b.A06(context, uuid);
        InterfaceC108920S A0E = this.A03.A0E();
        String adId = AdPlacementType.INTERSTITIAL.toString();
        A0E.A3E(adId, str);
        this.A01 = new C13129bX(this.A03, interstitialAd, str);
        this.A03.A0N(this);
        this.A02 = new C11790Fd(this.A01, uuid);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A03.A0E().A37(interstitialAdListener != null);
        this.A01.A0E(interstitialAdListener);
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A01.A0G(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, String str) {
        AbstractC12047Ju.A05(A00(129, 8, 122), A00(65, 30, 111), A00(16, 8, 42));
        if (str == null) {
            this.A03.A0E().A3B();
        } else {
            this.A03.A0E().A3A();
        }
        this.A02.A0D(this.A00, enumSet, str);
        this.A03.A0E().A39();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C112115f(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C112125g();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public final void destroy() {
        AbstractC12047Ju.A05(A00(122, 7, 21), A00(40, 25, 105), A00(8, 8, 56));
        if (C11979Im.A2B(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A3F();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public final String getPlacementId() {
        return this.A01.A0A();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public final boolean isAdInvalidated() {
        boolean A0F = this.A02.A0F();
        this.A03.A0E().A5E(A0F);
        return A0F;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public final void loadAd() {
        A05(CacheFlag.ALL, null);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((C112115f) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A6I() != null) {
            this.A01.A6I().onError(this.A00, new AdError(2001, A00(24, 16, 63) + AbstractC12159Ll.A03(this.A03, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.InterfaceC10846Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A0I(extraHints.getHints());
        this.A01.A0J(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC12047Ju.A05(A00(137, 4, 11), A00(95, 27, 100), A00(0, 8, 21));
        this.A03.A0E().A3K();
        boolean A0H = this.A02.A0H(this.A00, new C112125g());
        this.A03.A0E().A3J(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0E().A3K();
        boolean A0H = this.A02.A0H(this.A00, interstitialShowAdConfig);
        this.A03.A0E().A3J(A0H);
        return A0H;
    }
}
