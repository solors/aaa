package com.fyber.inneractive.sdk.p374dv.interstitial;

import com.google.android.gms.ads.FullScreenContentCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c */
/* loaded from: classes4.dex */
public final class C14443c extends FullScreenContentCallback {

    /* renamed from: a */
    public final /* synthetic */ C14444d f27310a;

    public C14443c(C14444d c14444d) {
        this.f27310a = c14444d;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        InterfaceC14441a interfaceC14441a = this.f27310a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77897g();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        InterfaceC14441a interfaceC14441a = this.f27310a.f26850j;
        if (interfaceC14441a != null) {
            interfaceC14441a.mo77896u();
        }
    }
}
