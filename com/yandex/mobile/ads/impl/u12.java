package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u12 {
    @NotNull

    /* renamed from: a */
    private final C30710k9 f86081a;

    public u12(@NotNull C30710k9 adTracker) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f86081a = adTracker;
    }

    /* renamed from: a */
    public final void m28902a(@NotNull List<String> trackingUrls) {
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        for (String str : trackingUrls) {
            this.f86081a.m32625a(str);
        }
    }
}
