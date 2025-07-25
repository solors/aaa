package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bu1 implements tr0 {
    @NotNull

    /* renamed from: a */
    private final tr0.C31476a f77405a;

    public /* synthetic */ bu1() {
        this(new tr0.C31476a());
    }

    @Override // com.yandex.mobile.ads.impl.tr0
    @NotNull
    /* renamed from: a */
    public final tr0.C31476a mo27438a(int i, int i2) {
        tr0.C31476a c31476a = this.f77405a;
        c31476a.f85812a = i;
        c31476a.f85813b = i2;
        return c31476a;
    }

    public bu1(@NotNull tr0.C31476a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f77405a = measureSpecHolder;
    }
}
