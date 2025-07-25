package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class m81 implements ya2 {
    @NotNull

    /* renamed from: a */
    private final xa2 f82081a;

    public m81(@NotNull xa2 videoViewAdapter) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        this.f82081a = videoViewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.ya2
    @NotNull
    /* renamed from: a */
    public final List<k62> mo26144a() {
        List<k62> m17166m;
        m17166m = C37563v.m17166m();
        return m17166m;
    }

    @Override // com.yandex.mobile.ads.impl.ya2
    @Nullable
    public final View getView() {
        return this.f82081a.m35513b();
    }
}
