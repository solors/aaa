package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.u9 */
/* loaded from: classes8.dex */
public final class C31564u9 implements g51 {
    @NotNull

    /* renamed from: a */
    private final s90 f86162a;

    public C31564u9(@NotNull s90 noticeForceClickController) {
        Intrinsics.checkNotNullParameter(noticeForceClickController, "noticeForceClickController");
        this.f86162a = noticeForceClickController;
    }

    @Override // com.yandex.mobile.ads.impl.g51
    /* renamed from: a */
    public final void mo28848a(@NotNull th0 eventsObservable) {
        Intrinsics.checkNotNullParameter(eventsObservable, "eventsObservable");
        this.f86162a.m29671a(eventsObservable);
    }
}
