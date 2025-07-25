package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class s41 {
    @NotNull

    /* renamed from: a */
    private final w82 f85014a;
    @NotNull

    /* renamed from: b */
    private final b61 f85015b;

    public s41(@NotNull w82 videoEventController, @NotNull b61 nativeMediaContent) {
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        this.f85014a = videoEventController;
        this.f85015b = nativeMediaContent;
    }

    @Nullable
    /* renamed from: a */
    public final t41 m29865a() {
        o71 m35635a = this.f85015b.m35635a();
        if (m35635a != null) {
            w82 w82Var = this.f85014a;
            return new t41(m35635a, w82Var, w82Var);
        }
        return null;
    }
}
