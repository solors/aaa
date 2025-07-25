package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ay1 extends IOException {
    @NotNull

    /* renamed from: b */
    public final k30 f76964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay1(@NotNull k30 errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f76964b = errorCode;
    }
}
