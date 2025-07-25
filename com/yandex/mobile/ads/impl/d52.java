package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class d52 {
    @Nullable

    /* renamed from: a */
    private final o52 f77893a;

    public d52(@NotNull Context context, @NotNull q52 verificationResourcesLoaderProvider, @Nullable o52 o52Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationResourcesLoaderProvider, "verificationResourcesLoaderProvider");
        this.f77893a = o52Var;
    }

    /* renamed from: a */
    public final void m35098a(@NotNull List<z52> videoAds, @NotNull p52 listener) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f77893a != null && (!(videoAds instanceof Collection) || !videoAds.isEmpty())) {
            for (z52 z52Var : videoAds) {
                if (!z52Var.m26367d().isEmpty()) {
                    this.f77893a.mo31157a(listener);
                    return;
                }
            }
        }
        listener.mo28830b();
    }
}
