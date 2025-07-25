package com.fyber.inneractive.sdk.p374dv.rewarded;

import com.fyber.inneractive.sdk.p374dv.interstitial.InterfaceC14441a;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.c */
/* loaded from: classes4.dex */
public final class C14452c implements OnUserEarnedRewardListener {

    /* renamed from: a */
    public final /* synthetic */ C14453d f27321a;

    public C14452c(C14453d c14453d) {
        this.f27321a = c14453d;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        InterfaceC14441a interfaceC14441a = this.f27321a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.onReward();
        }
    }
}
