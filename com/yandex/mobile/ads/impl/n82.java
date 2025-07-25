package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n82 {
    @NotNull

    /* renamed from: a */
    private final List<String> f82631a;
    @Nullable

    /* renamed from: b */
    private final String f82632b;

    public n82(@Nullable String str, @NotNull List clickTrackings) {
        Intrinsics.checkNotNullParameter(clickTrackings, "clickTrackings");
        this.f82631a = clickTrackings;
        this.f82632b = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m31647a() {
        return this.f82632b;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m31646b() {
        return this.f82631a;
    }
}
