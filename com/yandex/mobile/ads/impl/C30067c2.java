package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.c2 */
/* loaded from: classes8.dex */
public final class C30067c2 {
    @NotNull

    /* renamed from: a */
    private final C30432h2 f77475a;

    public /* synthetic */ C30067c2(Context context) {
        this(context, new C30432h2(context));
    }

    /* renamed from: a */
    public final boolean m35378a(@NotNull C29982b2 adBlockerState) {
        Intrinsics.checkNotNullParameter(adBlockerState, "adBlockerState");
        if (adBlockerState.m35683b() + this.f77475a.m33722a() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public C30067c2(@NotNull Context context, @NotNull C30432h2 adBlockerStatusValidityDurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBlockerStatusValidityDurationProvider, "adBlockerStatusValidityDurationProvider");
        this.f77475a = adBlockerStatusValidityDurationProvider;
    }
}
