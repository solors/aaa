package com.fyber.inneractive.sdk.p374dv.rewarded;

import com.fyber.inneractive.sdk.p374dv.interstitial.InterfaceC14441a;
import com.google.android.gms.ads.FullScreenContentCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b */
/* loaded from: classes4.dex */
public final class C14451b extends FullScreenContentCallback {

    /* renamed from: a */
    public final /* synthetic */ C14453d f27320a;

    public C14451b(C14453d c14453d) {
        this.f27320a = c14453d;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        InterfaceC14441a interfaceC14441a = this.f27320a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77897g();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        InterfaceC14441a interfaceC14441a = this.f27320a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77896u();
        }
    }
}
