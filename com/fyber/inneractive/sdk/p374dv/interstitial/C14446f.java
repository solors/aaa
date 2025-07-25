package com.fyber.inneractive.sdk.p374dv.interstitial;

import com.google.android.gms.ads.AdListener;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.f */
/* loaded from: classes4.dex */
public final class C14446f extends AdListener {

    /* renamed from: a */
    public final /* synthetic */ C14447g f27314a;

    public C14446f(C14447g c14447g) {
        this.f27314a = c14447g;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        InterfaceC14441a interfaceC14441a = this.f27314a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77898b();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        InterfaceC14441a interfaceC14441a = this.f27314a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77897g();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        InterfaceC14441a interfaceC14441a = this.f27314a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77896u();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        InterfaceC14441a interfaceC14441a = this.f27314a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77896u();
        }
    }
}
