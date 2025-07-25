package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.d5 */
/* loaded from: classes8.dex */
public final class C30143d5 implements g51 {
    @NotNull

    /* renamed from: a */
    private final t90 f77884a;

    public C30143d5(@NotNull t90 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f77884a = forceImpressionTrackingListener;
    }

    @Override // com.yandex.mobile.ads.impl.g51
    /* renamed from: a */
    public final void mo28848a(@NotNull th0 eventsObservable) {
        Intrinsics.checkNotNullParameter(eventsObservable, "eventsObservable");
        eventsObservable.m29167a(this.f77884a);
    }
}
