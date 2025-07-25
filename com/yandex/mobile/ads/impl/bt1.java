package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.base.model.reward.ServerSideReward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bt1 implements do1 {
    @NotNull

    /* renamed from: a */
    private final ServerSideReward f77398a;
    @NotNull

    /* renamed from: b */
    private final C30710k9 f77399b;

    public bt1(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull ServerSideReward serverSideReward, @NotNull C30710k9 adTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(serverSideReward, "serverSideReward");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f77398a = serverSideReward;
        this.f77399b = adTracker;
    }

    @Override // com.yandex.mobile.ads.impl.do1
    /* renamed from: a */
    public final void mo34877a() {
        this.f77399b.m32625a(this.f77398a.m44530c());
    }
}
