package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.FiveAdErrorCode;
import com.five_corp.p372ad.FiveAdInterstitial;
import com.five_corp.p372ad.FiveAdInterstitialEventListener;

/* renamed from: com.five_corp.ad.internal.e */
/* loaded from: classes4.dex */
public final class C13770e implements InterfaceC13780h {

    /* renamed from: a */
    public final /* synthetic */ FiveAdInterstitialEventListener f25628a;

    /* renamed from: b */
    public final /* synthetic */ FiveAdInterstitial f25629b;

    public C13770e(FiveAdInterstitial fiveAdInterstitial, FiveAdInterstitialEventListener fiveAdInterstitialEventListener) {
        this.f25628a = fiveAdInterstitialEventListener;
        this.f25629b = fiveAdInterstitial;
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: a */
    public final void mo78382a() {
        this.f25628a.onPlay(this.f25629b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: b */
    public final void mo78380b() {
        this.f25628a.onViewThrough(this.f25629b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: c */
    public final void mo78379c() {
        this.f25628a.onPause(this.f25629b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: d */
    public final void mo78378d() {
        this.f25628a.onClick(this.f25629b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: e */
    public final void mo78377e() {
        this.f25628a.onImpression(this.f25629b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: a */
    public final void mo78381a(FiveAdErrorCode fiveAdErrorCode) {
        this.f25628a.onViewError(this.f25629b, fiveAdErrorCode);
    }
}
