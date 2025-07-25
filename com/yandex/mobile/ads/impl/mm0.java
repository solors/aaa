package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mm0 {
    @NotNull

    /* renamed from: a */
    private final z61 f82270a;

    /* renamed from: b */
    private final int f82271b;

    public mm0(@NotNull z61 nativeValidator, int i) {
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        this.f82270a = nativeValidator;
        this.f82271b = i;
    }

    @NotNull
    /* renamed from: a */
    public final g42 m31931a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f82270a.mo26336a(context, this.f82271b);
    }
}
