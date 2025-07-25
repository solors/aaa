package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import com.facebook.ads.AdSettings;

/* renamed from: com.facebook.ads.redexgen.X.bh */
/* loaded from: assets/audience_network.dex */
public final class C13139bh implements InterfaceC113808d {
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final String A6c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final String A6q() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final C113397x A78(C113257j c113257j) {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final String A7o() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final String A8V() {
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            return AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final boolean A9Y() {
        return AdSettings.isMixedAudience();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final boolean A9d() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final Boolean A9i() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113808d
    public final boolean isTestMode(Context context) {
        return AdSettings.isTestMode(context);
    }
}
