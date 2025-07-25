package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wv1 {
    /* renamed from: a */
    public static final float m27737a(@NotNull sv1 sv1Var, @NotNull RectF view, @NotNull RectF image) {
        float f;
        Intrinsics.checkNotNullParameter(sv1Var, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(image, "image");
        float height = view.height();
        float width = view.width();
        float height2 = image.height();
        float width2 = image.width();
        if (height == 0.0f || width == 0.0f || height2 == 0.0f || width2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        if (width2 / height2 > width / height) {
            f = height / height2;
        } else {
            f = width / width2;
        }
        float min = Math.min(1.0f, f);
        if (width < ((int) (sv1Var.m29526c() * min)) || height < ((int) (sv1Var.m29527b() * min))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(height - (sv1Var.m29527b() * min)) + Math.abs(width - (sv1Var.m29526c() * min));
    }
}
