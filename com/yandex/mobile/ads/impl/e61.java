package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e61 implements ib1 {
    @NotNull

    /* renamed from: a */
    private final C30710k9 f78466a;
    @NotNull

    /* renamed from: b */
    private final gz1 f78467b;
    @NotNull

    /* renamed from: c */
    private final kl1 f78468c;

    public e61(@NotNull C30710k9 adTracker, @NotNull gz1 targetUrlHandler, @NotNull kl1 reporter) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f78466a = adTracker;
        this.f78467b = targetUrlHandler;
        this.f78468c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.ib1
    /* renamed from: a */
    public final void mo28740a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f78466a.m32623a(url, this.f78467b, this.f78468c);
    }
}
