package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class t21 extends Exception {
    @NotNull

    /* renamed from: b */
    private final String f85490b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(@NotNull String detailMessage) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        this.f85490b = detailMessage;
    }

    @NotNull
    /* renamed from: a */
    public final String m29314a() {
        return this.f85490b;
    }
}
