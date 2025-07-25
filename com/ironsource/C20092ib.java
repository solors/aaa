package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ib */
/* loaded from: classes6.dex */
public final class C20092ib implements InterfaceC21019tk {
    @NotNull

    /* renamed from: a */
    private final InterstitialAdRequest f50566a;
    @NotNull

    /* renamed from: b */
    private final C21016th f50567b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC20128j3 f50568c;
    @NotNull

    /* renamed from: d */
    private final IronSourceError f50569d;

    public C20092ib(@NotNull InterstitialAdRequest adRequest, @NotNull C21016th adLoadTaskListener, @NotNull InterfaceC20128j3 analytics, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f50566a = adRequest;
        this.f50567b = adLoadTaskListener;
        this.f50568c = analytics;
        this.f50569d = error;
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m57986a() {
        return this.f50569d;
    }

    @Override // com.ironsource.InterfaceC21019tk
    public void start() {
        C19810eb c19810eb = new C19810eb(this.f50568c, this.f50566a.getAdId$mediationsdk_release(), this.f50566a.getProviderName$mediationsdk_release());
        c19810eb.m58820a();
        c19810eb.m58819a(this.f50569d);
        this.f50567b.onAdLoadFailed(this.f50569d);
    }
}
