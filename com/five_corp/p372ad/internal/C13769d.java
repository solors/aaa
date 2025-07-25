package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.FiveAdCustomLayout;
import com.five_corp.p372ad.FiveAdCustomLayoutEventListener;
import com.five_corp.p372ad.FiveAdErrorCode;

/* renamed from: com.five_corp.ad.internal.d */
/* loaded from: classes4.dex */
public final class C13769d implements InterfaceC13780h {

    /* renamed from: a */
    public final /* synthetic */ FiveAdCustomLayoutEventListener f25626a;

    /* renamed from: b */
    public final /* synthetic */ FiveAdCustomLayout f25627b;

    public C13769d(FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener, FiveAdCustomLayout fiveAdCustomLayout) {
        this.f25626a = fiveAdCustomLayoutEventListener;
        this.f25627b = fiveAdCustomLayout;
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: a */
    public final void mo78382a() {
        this.f25626a.onPlay(this.f25627b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: b */
    public final void mo78380b() {
        this.f25626a.onViewThrough(this.f25627b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: c */
    public final void mo78379c() {
        this.f25626a.onPause(this.f25627b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: d */
    public final void mo78378d() {
        this.f25626a.onClick(this.f25627b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: e */
    public final void mo78377e() {
        this.f25626a.onImpression(this.f25627b);
    }

    @Override // com.five_corp.p372ad.internal.InterfaceC13780h
    /* renamed from: a */
    public final void mo78381a(FiveAdErrorCode fiveAdErrorCode) {
        this.f25626a.onViewError(this.f25627b, fiveAdErrorCode);
    }
}
