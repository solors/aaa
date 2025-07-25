package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.FiveAdErrorCode;
import com.five_corp.p372ad.FiveAdVideoReward;
import com.five_corp.p372ad.FiveAdVideoRewardEventListener;

/* renamed from: com.five_corp.ad.internal.f */
/* loaded from: classes4.dex */
public final class C13773f implements InterfaceC13780h {

    /* renamed from: a */
    public final /* synthetic */ FiveAdVideoRewardEventListener f25631a;

    /* renamed from: b */
    public final /* synthetic */ FiveAdVideoReward f25632b;

    public C13773f(FiveAdVideoReward fiveAdVideoReward, FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener) {
        this.f25631a = fiveAdVideoRewardEventListener;
        this.f25632b = fiveAdVideoReward;
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: a */
    public final void mo78382a() {
        this.f25631a.onPlay(this.f25632b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: b */
    public final void mo78380b() {
        this.f25631a.onViewThrough(this.f25632b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: c */
    public final void mo78379c() {
        this.f25631a.onPause(this.f25632b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: d */
    public final void mo78378d() {
        this.f25631a.onClick(this.f25632b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: e */
    public final void mo78377e() {
        this.f25631a.onImpression(this.f25632b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: a */
    public final void mo78381a(FiveAdErrorCode fiveAdErrorCode) {
        this.f25631a.onViewError(this.f25632b, fiveAdErrorCode);
    }
}
