package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bY */
/* loaded from: assets/audience_network.dex */
public final class C13130bY implements InterfaceC1098922 {
    public static byte[] A0A;
    public static final String A0B;
    public long A02;
    public RewardedVideoAd A03;
    public AbstractC109391E A04;
    public C11791Fe A05;
    public final C13029Zs A07;
    public final S2SRewardedVideoAdExtendedListener A08;
    public final C13120bO A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{116, -95, 83, -108, -105, 83, -97, -94, -108, -105, 83, -100, -90, 83, -108, -97, -91, -104, -108, -105, -84, 83, -100, -95, 83, -93, -91, -94, -102, -91, -104, -90, -90, 97, 83, -116, -94, -88, 83, -90, -101, -94, -88, -97, -105, 83, -86, -108, -100, -89, 83, -103, -94, -91, 83, -108, -105, Byte.MAX_VALUE, -94, -108, -105, -104, -105, 91, 92, 83, -89, -94, 83, -107, -104, 83, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0B = C13130bY.class.getSimpleName();
    }

    public C13130bY(C13120bO c13120bO, InterfaceC110052I interfaceC110052I, String str) {
        this.A09 = c13120bO;
        this.A07 = c13120bO.A0B;
        this.A08 = new C13117bL(str, interfaceC110052I, this, c13120bO);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z) {
        String extraHints;
        if (!this.A06 && this.A05 != null) {
            Log.w(A0B, A09(0, 78, 37));
        }
        A0D(false);
        this.A06 = false;
        C109801t c109801t = new C109801t(this.A09.A0D, EnumC12038Jl.A07, AdPlacementType.REWARDED_VIDEO, EnumC12036Jj.A08, 1, this.A09.A0C);
        c109801t.A08(z);
        if (C11979Im.A2T(this.A07) && (extraHints = C12118L6.A02(this.A07, this.A09.A06)) != null) {
            this.A09.A06 = extraHints;
        }
        c109801t.A06(this.A09.A06);
        c109801t.A07(this.A09.A07);
        this.A05 = new C11791Fe(this.A09.A0B, c109801t);
        this.A05.A0R(new C13132ba(this));
        this.A05.A0W(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (this.A05 != null) {
            this.A05.A0R(new C13131bZ(this));
            this.A05.A0X(z);
            this.A05.A0J();
            this.A05 = null;
        }
    }

    public final long A0F() {
        if (this.A05 != null) {
            return this.A05.A0F();
        }
        return -1L;
    }

    public final C13120bO A0G() {
        return this.A09;
    }

    public final C13029Zs A0H() {
        return this.A07;
    }

    public final void A0I(RewardData rewardData) {
        this.A09.A03 = rewardData;
        if (this.A06 && this.A05 != null) {
            this.A05.A0Z(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A0B, A09(78, 31, 113), e);
            this.A09.A0B.A07().AA0(A09(109, 3, 126), AbstractC113568E.A0b, new C113578F(e));
            AdError internalError = AdError.internalError(2004);
            this.A09.A0B.A0E().A38(C12168Lu.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A08.onError(this.A09.A6E(), internalError);
        }
    }

    public final boolean A0K() {
        return this.A05 == null || this.A05.A0Y();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i, long j) {
        if (!this.A06) {
            this.A08.onError(this.A09.A6E(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        } else if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A08.A02(i);
            this.A05.A08.A03(j);
            this.A05.A0L();
            this.A06 = false;
            return true;
        } else {
            this.A06 = false;
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1098922
    public final void destroy() {
        A0D(true);
    }
}
