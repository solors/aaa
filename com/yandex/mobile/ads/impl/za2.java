package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class za2 {
    @NotNull

    /* renamed from: a */
    private final ya2 f88800a;

    public za2(@NotNull ya2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f88800a = videoViewProvider;
    }

    /* renamed from: a */
    public final boolean m26291a() {
        View view = this.f88800a.getView();
        if (view != null && !cc2.m35250d(view) && cc2.m35253b(view) >= 1) {
            return true;
        }
        return false;
    }
}
