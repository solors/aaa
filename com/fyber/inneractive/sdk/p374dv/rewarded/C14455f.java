package com.fyber.inneractive.sdk.p374dv.rewarded;

import com.fyber.inneractive.sdk.p374dv.interstitial.InterfaceC14441a;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.f */
/* loaded from: classes4.dex */
public final class C14455f extends RewardedAdCallback {

    /* renamed from: a */
    public final /* synthetic */ C14456g f27326a;

    public C14455f(C14456g c14456g) {
        this.f27326a = c14456g;
    }

    public final void onRewardedAdClosed() {
        InterfaceC14441a interfaceC14441a = this.f27326a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77897g();
        }
    }

    public final void onRewardedAdOpened() {
        InterfaceC14441a interfaceC14441a = this.f27326a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77896u();
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        InterfaceC14441a interfaceC14441a = this.f27326a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.onReward();
        }
    }

    public final void onRewardedAdFailedToShow(int i) {
    }
}
