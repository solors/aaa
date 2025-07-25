package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.reward.ClientSideReward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bo */
/* loaded from: classes8.dex */
public final class C30036bo implements do1 {
    @NotNull

    /* renamed from: a */
    private final fo1 f77365a;
    @NotNull

    /* renamed from: b */
    private final zr1 f77366b;

    public C30036bo(@NotNull ClientSideReward clientSideReward, @NotNull fo1 rewardedListener, @NotNull zr1 reward) {
        Intrinsics.checkNotNullParameter(clientSideReward, "clientSideReward");
        Intrinsics.checkNotNullParameter(rewardedListener, "rewardedListener");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f77365a = rewardedListener;
        this.f77366b = reward;
    }

    @Override // com.yandex.mobile.ads.impl.do1
    /* renamed from: a */
    public final void mo34877a() {
        this.f77365a.mo30651a(this.f77366b);
    }
}
