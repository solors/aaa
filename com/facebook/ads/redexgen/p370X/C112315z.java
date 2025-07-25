package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.primitives.SignedBytes;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.5z */
/* loaded from: assets/audience_network.dex */
public final class C112315z implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final InterfaceC10846Ad A00;
    public final C13120bO A01;
    public final C11789Fc A02;
    public final C13029Zs A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 124, 121, 122, 45, 122, 123, 28, 22, 30, 25, 76, 73, 73, 75, 101, 102, 48, 53, 96, 103, 55, 102, 94, 121, 99, 114, 101, 121, 118, 123, 55, 114, 101, 101, 120, 101, 57, 29, 47, 24, 10, 28, 15, 25, 24, 25, 93, 11, 20, 25, 24, 18, 93, 28, 25, 93, 25, 24, 14, 9, 15, 18, 4, 24, 25, 105, 94, 76, 90, 73, 95, 94, 95, 27, 77, 82, 95, 94, 84, 27, 90, 95, 27, 87, 84, 90, 95, 27, 73, 94, 74, 78, 94, 72, 79, 94, 95, 59, 12, 30, 8, 27, 13, 12, 13, 73, 31, 0, 13, 12, 6, 73, 8, 13, 73, 26, 1, 6, 30, 73, 10, 8, 5, 5, 12, 13, 16, SignedBytes.MAX_POWER_OF_TWO, 22, 16, 71, 22, 68, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, 22, 13, 10, 18};
    }

    static {
        A01();
    }

    public C112315z(Context context, String str, InterfaceC10846Ad interfaceC10846Ad) {
        this.A00 = interfaceC10846Ad;
        String uuid = UUID.randomUUID().toString();
        this.A03 = C112075b.A07(context, uuid);
        InterfaceC108920S A0E = this.A03.A0E();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        A0E.A3E(adId, str);
        this.A01 = new C13120bO(this.A03, str, this.A00, new C13139bh());
        this.A03.A0N(this);
        this.A02 = new C11789Fc(this.A01, uuid);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A02 */
    public final C1123260 buildLoadAdConfig() {
        return new C1123260(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A03 */
    public final C1123361 buildShowAdConfig() {
        return new C1123361();
    }

    public final void A04() {
        if (C11979Im.A2B(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A3F();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0E().A37(rewardedVideoAdListener != null);
        String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0E().A3B();
        } else {
            C13029Zs c13029Zs = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c13029Zs.A0E().A3A();
        }
        this.A02.A0D(this.A00, str, adExperienceType, z);
        this.A03.A0E().A39();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0E().A3K();
        boolean A0H = this.A02.A0H(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0E().A3J(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC10846Ad
    public final void destroy() {
        AbstractC12047Ju.A05(A00(134, 7, 47), A00(39, 27, 116), A00(127, 7, 122));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC10846Ad
    public final String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public final boolean isAdInvalidated() {
        boolean A0F = this.A02.A0F();
        this.A03.A0E().A5E(A0F);
        return A0F;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC10846Ad
    public final void loadAd() {
        AbstractC12047Ju.A05(A00(ErrorCode.CODE_INIT_DEVICE_ERROR, 6, 44), A00(66, 32, 50), A00(7, 8, 38));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C1123260) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(2001, A00(23, 16, 30) + AbstractC12159Ll.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC10846Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC12047Ju.A05(A00(147, 4, 108), A00(98, 29, 96), A00(0, 7, 64));
        return A08(new C1123361().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        AbstractC12047Ju.A05(A00(147, 4, 108), A00(98, 29, 96), A00(15, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}
