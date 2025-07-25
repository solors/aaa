package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.FiveAdInterstitial;
import com.five_corp.p372ad.FiveAdInterstitialEventListener;

/* renamed from: com.five_corp.ad.internal.x */
/* loaded from: classes4.dex */
public final class C14160x implements InterfaceC14162z {

    /* renamed from: a */
    public final /* synthetic */ FiveAdInterstitialEventListener f26830a;

    /* renamed from: b */
    public final /* synthetic */ FiveAdInterstitial f26831b;

    public C14160x(FiveAdInterstitial fiveAdInterstitial, FiveAdInterstitialEventListener fiveAdInterstitialEventListener) {
        this.f26830a = fiveAdInterstitialEventListener;
        this.f26831b = fiveAdInterstitial;
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC14162z
    /* renamed from: b */
    public final void mo78041b() {
        this.f26830a.onFullScreenOpen(this.f26831b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC14162z
    /* renamed from: c */
    public final void mo78040c() {
        this.f26830a.onFullScreenClose(this.f26831b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC14162z
    /* renamed from: a */
    public final void mo78042a() {
    }
}
