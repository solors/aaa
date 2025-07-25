package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nc2 {
    @NotNull

    /* renamed from: a */
    private final ub1 f82694a;
    @NotNull

    /* renamed from: b */
    private final oc2 f82695b;

    public nc2(@NotNull ub1 overlappingAreaProvider, @NotNull oc2 visibleRectProvider) {
        Intrinsics.checkNotNullParameter(overlappingAreaProvider, "overlappingAreaProvider");
        Intrinsics.checkNotNullParameter(visibleRectProvider, "visibleRectProvider");
        this.f82694a = overlappingAreaProvider;
        this.f82695b = visibleRectProvider;
    }

    /* renamed from: a */
    public final int m31598a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean m35250d = cc2.m35250d(view);
        Rect m31054a = this.f82695b.m31054a(view);
        if (!m35250d && m31054a != null) {
            return (m31054a.width() * m31054a.height()) - this.f82694a.m28827a(view, m31054a);
        }
        return 0;
    }
}
