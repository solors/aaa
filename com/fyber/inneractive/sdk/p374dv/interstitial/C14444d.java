package com.fyber.inneractive.sdk.p374dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.AbstractC14177a;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.p374dv.C14427c;
import com.fyber.inneractive.sdk.p374dv.C14440i;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.d */
/* loaded from: classes4.dex */
public final class C14444d extends AbstractC14177a {

    /* renamed from: k */
    public final C14442b f27311k;

    /* renamed from: l */
    public final C14443c f27312l;

    public C14444d(InterfaceC14327U interfaceC14327U, C14388r c14388r, C14440i c14440i) {
        super(interfaceC14327U, c14388r, c14440i);
        this.f27311k = new C14442b(this);
        this.f27312l = new C14443c(this);
    }

    @Override // com.fyber.inneractive.sdk.p374dv.AbstractC14422a
    /* renamed from: a */
    public final void mo77899a(AdRequest adRequest, C14427c c14427c) {
        this.f27289g = c14427c;
        InterstitialAd.load(AbstractC15459m.f30607a, "FyberInterstitial", adRequest, this.f27311k);
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
            ((InterstitialAd) obj).setFullScreenContentCallback(this.f27312l);
            ((InterstitialAd) this.f27291i).show(activity);
        }
    }
}
