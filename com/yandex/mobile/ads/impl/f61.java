package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f61 {
    @NotNull

    /* renamed from: a */
    private final C30710k9 f78993a;
    @NotNull

    /* renamed from: b */
    private final gz1 f78994b;

    public f61(@NotNull C30710k9 adTracker, @NotNull gz1 targetUrlHandler) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        this.f78993a = adTracker;
        this.f78994b = targetUrlHandler;
    }

    @NotNull
    /* renamed from: a */
    public final e61 m34212a(@NotNull kl1 clickReporter) {
        Intrinsics.checkNotNullParameter(clickReporter, "clickReporter");
        return new e61(this.f78993a, this.f78994b, clickReporter);
    }
}
