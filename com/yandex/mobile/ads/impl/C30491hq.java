package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hq */
/* loaded from: classes8.dex */
public final class C30491hq {
    @NotNull

    /* renamed from: a */
    private final tj1 f80156a;

    public C30491hq() {
        this(TimeUnit.MINUTES);
    }

    @NotNull
    /* renamed from: a */
    public final tj1 m33480a() {
        return this.f80156a;
    }

    public C30491hq(@NotNull tj1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f80156a = delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30491hq(@NotNull TimeUnit timeUnit) {
        this(new tj1(mz1.f82495h, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }
}
