package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wr */
/* loaded from: classes8.dex */
public final class C31763wr {
    @NotNull

    /* renamed from: a */
    private final List<C31920yr> f87336a;

    public C31763wr(@NotNull ArrayList adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        this.f87336a = adBreaks;
    }

    @NotNull
    /* renamed from: a */
    public final List<C31920yr> m27849a() {
        return this.f87336a;
    }

    /* renamed from: b */
    public final void m27848b() {
        for (C31920yr c31920yr : this.f87336a) {
            c31920yr.m26634a(null);
        }
    }
}
