package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.jb */
/* loaded from: classes6.dex */
public final class C20144jb implements InterfaceC21019tk {
    @NotNull

    /* renamed from: a */
    private final RewardedAdRequest f50697a;
    @NotNull

    /* renamed from: b */
    private final C19783dp f50698b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC20128j3 f50699c;
    @NotNull

    /* renamed from: d */
    private final IronSourceError f50700d;

    public C20144jb(@NotNull RewardedAdRequest adRequest, @NotNull C19783dp adLoadTaskListener, @NotNull InterfaceC20128j3 analytics, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f50697a = adRequest;
        this.f50698b = adLoadTaskListener;
        this.f50699c = analytics;
        this.f50700d = error;
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m57856a() {
        return this.f50700d;
    }

    @Override // com.ironsource.InterfaceC21019tk
    public void start() {
        C19810eb c19810eb = new C19810eb(this.f50699c, this.f50697a.getAdId$mediationsdk_release(), this.f50697a.getProviderName$mediationsdk_release());
        c19810eb.m58820a();
        c19810eb.m58819a(this.f50700d);
        this.f50698b.onAdLoadFailed(this.f50700d);
    }
}
