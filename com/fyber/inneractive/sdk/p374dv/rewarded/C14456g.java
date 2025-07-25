package com.fyber.inneractive.sdk.p374dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.AbstractC14177a;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.p374dv.C14427c;
import com.fyber.inneractive.sdk.p374dv.C14440i;
import com.fyber.inneractive.sdk.p374dv.interstitial.InterfaceC14441a;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.g */
/* loaded from: classes4.dex */
public final class C14456g extends AbstractC14177a {

    /* renamed from: k */
    public final C14454e f27327k;

    /* renamed from: l */
    public final C14455f f27328l;

    public C14456g(InterfaceC14327U interfaceC14327U, C14388r c14388r, C14440i c14440i) {
        super(interfaceC14327U, c14388r, c14440i);
        this.f27327k = new C14454e(this);
        this.f27328l = new C14455f(this);
    }

    @Override // com.fyber.inneractive.sdk.p374dv.AbstractC14422a
    /* renamed from: a */
    public final void mo77899a(AdRequest adRequest, C14427c c14427c) {
        this.f27289g = c14427c;
        RewardedAd rewardedAd = new RewardedAd(AbstractC15459m.f30607a, "FyberRewarded");
        this.f27291i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f27327k);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: d */
    public final boolean mo77806d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: f */
    public final boolean mo77804f() {
        Object obj = this.f27291i;
        if (obj != null) {
            return ((RewardedAd) obj).isLoaded();
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.AbstractC14177a
    /* renamed from: a */
    public final void mo77900a(InterfaceC14441a interfaceC14441a, Activity activity) {
        this.f26850j = interfaceC14441a;
        ((RewardedAd) this.f27291i).show(activity, this.f27328l);
    }
}
