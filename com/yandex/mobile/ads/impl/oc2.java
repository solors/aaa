package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class oc2 {
    @NotNull

    /* renamed from: a */
    private final me2 f83454a;

    public /* synthetic */ oc2() {
        this(new me2());
    }

    @Nullable
    /* renamed from: a */
    public final Rect m31054a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i = as1.f76895l;
            yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
            if (m35796a != null && m35796a.m26741o0()) {
                this.f83454a.getClass();
                Rect m32026a = me2.m32026a(view);
                Rect rect2 = new Rect(rect);
                if (rect2.intersect(m32026a)) {
                    return rect2;
                }
            } else {
                return rect;
            }
        }
        return null;
    }

    public oc2(@NotNull me2 windowVisibleRectProvider) {
        Intrinsics.checkNotNullParameter(windowVisibleRectProvider, "windowVisibleRectProvider");
        this.f83454a = windowVisibleRectProvider;
    }
}
