package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.cH */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13175cH implements InterfaceC109140p {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0G();

    public abstract AbstractC109391E A0H();

    public abstract boolean A0I();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109140p
    public final AdPlacementType A82() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
