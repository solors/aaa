package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mobile.ads.impl.ec2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e50 {
    @NotNull

    /* renamed from: a */
    private final ec2 f78456a;

    public /* synthetic */ e50() {
        this(new ec2());
    }

    @NotNull
    /* renamed from: a */
    public final <T extends View & ec2.InterfaceC30229a> d50 m34665a(@NotNull T view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f78456a.getClass();
        RectF rectF = null;
        if (ec2.m34638a(view)) {
            i = cc2.m35258a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (rect != null) {
                float m35260a = cc2.m35260a(context, rect.left);
                float m35260a2 = cc2.m35260a(context, rect.top);
                float m35260a3 = cc2.m35260a(context, rect.right);
                float m35260a4 = cc2.m35260a(context, rect.bottom);
                float f = m35260a4 - m35260a2;
                if (m35260a3 - m35260a > 0.0f && f > 0.0f) {
                    rectF = new RectF(m35260a, m35260a2, m35260a3, m35260a4);
                }
            }
        } else {
            i = 0;
        }
        return new d50(i, rectF);
    }

    public e50(@NotNull ec2 viewableChecker) {
        Intrinsics.checkNotNullParameter(viewableChecker, "viewableChecker");
        this.f78456a = viewableChecker;
    }
}
