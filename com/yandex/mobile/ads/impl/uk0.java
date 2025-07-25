package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class uk0 implements ib1 {
    @NotNull

    /* renamed from: a */
    private final Context f86312a;
    @NotNull

    /* renamed from: b */
    private final al0 f86313b;
    @NotNull

    /* renamed from: c */
    private final r32 f86314c;

    public uk0(@NotNull Context context, @NotNull al0 instreamInteractionTracker, @NotNull r32 urlViewerLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamInteractionTracker, "instreamInteractionTracker");
        Intrinsics.checkNotNullParameter(urlViewerLauncher, "urlViewerLauncher");
        this.f86312a = context;
        this.f86313b = instreamInteractionTracker;
        this.f86314c = urlViewerLauncher;
    }

    @Override // com.yandex.mobile.ads.impl.ib1
    /* renamed from: a */
    public final void mo28740a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.f86314c.m30157a(this.f86312a, url)) {
            this.f86313b.m35836a();
        }
    }
}
