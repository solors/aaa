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

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.d */
/* loaded from: classes4.dex */
public final class C14453d extends AbstractC14177a {

    /* renamed from: k */
    public final C14450a f27322k;

    /* renamed from: l */
    public final C14451b f27323l;

    /* renamed from: m */
    public final C14452c f27324m;

    public C14453d(InterfaceC14327U interfaceC14327U, C14388r c14388r, C14440i c14440i) {
        super(interfaceC14327U, c14388r, c14440i);
        this.f27322k = new C14450a(this);
        this.f27323l = new C14451b(this);
        this.f27324m = new C14452c(this);
    }

    @Override // com.fyber.inneractive.sdk.p374dv.AbstractC14422a
    /* renamed from: a */
    public final void mo77899a(AdRequest adRequest, C14427c c14427c) {
        this.f27289g = c14427c;
        RewardedAd.load(AbstractC15459m.f30607a, "FyberRewarded", adRequest, this.f27322k);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: d */
    public final boolean mo77806d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: f */
    public final boolean mo77804f() {
        if (this.f27291i != null) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.AbstractC14177a
    /* renamed from: a */
    public final void mo77900a(InterfaceC14441a interfaceC14441a, Activity activity) {
        this.f26850j = interfaceC14441a;
        Object obj = this.f27291i;
        if (obj != null) {
            ((RewardedAd) obj).setFullScreenContentCallback(this.f27323l);
            ((RewardedAd) this.f27291i).show(activity, this.f27324m);
        }
    }
}
