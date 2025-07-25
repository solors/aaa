package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.FiveAdVideoReward;
import com.five_corp.p372ad.FiveAdVideoRewardEventListener;

/* renamed from: com.five_corp.ad.internal.y */
/* loaded from: classes4.dex */
public final class C14161y implements InterfaceC14162z {

    /* renamed from: a */
    public final /* synthetic */ FiveAdVideoRewardEventListener f26832a;

    /* renamed from: b */
    public final /* synthetic */ FiveAdVideoReward f26833b;

    public C14161y(FiveAdVideoReward fiveAdVideoReward, FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener) {
        this.f26832a = fiveAdVideoRewardEventListener;
        this.f26833b = fiveAdVideoReward;
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC14162z
    /* renamed from: a */
    public final void mo78042a() {
        this.f26832a.onReward(this.f26833b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC14162z
    /* renamed from: b */
    public final void mo78041b() {
        this.f26832a.onFullScreenOpen(this.f26833b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC14162z
    /* renamed from: c */
    public final void mo78040c() {
        this.f26832a.onFullScreenClose(this.f26833b);
    }
}
