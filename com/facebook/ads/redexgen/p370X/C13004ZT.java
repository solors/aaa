package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ZT */
/* loaded from: assets/audience_network.dex */
public final class C13004ZT implements InterfaceC113307o {
    public static byte[] A01;
    public final C113257j A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public C13004ZT(C113257j c113257j) {
        this.A00 = c113257j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A6c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A7R() {
        return AbstractC12067KE.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A7S() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A7n() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A7t() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final InterfaceC113297n A8D() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C13005ZU(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A8d() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A8f() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final String A8g() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113307o
    public final boolean A9O() {
        return BuildConfigApi.isDebug();
    }
}
