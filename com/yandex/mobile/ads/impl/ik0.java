package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ik0 {
    @Nullable

    /* renamed from: a */
    private hk0 f80513a;

    @Nullable
    /* renamed from: a */
    public final hk0 m33219a() {
        return this.f80513a;
    }

    /* renamed from: b */
    public final void m33217b() {
        this.f80513a = null;
    }

    /* renamed from: a */
    public final void m33218a(@NotNull h50 instreamAdView, @NotNull List<k62> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f80513a = new hk0(instreamAdView, friendlyOverlays);
    }
}
