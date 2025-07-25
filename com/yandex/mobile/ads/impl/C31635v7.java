package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.v7 */
/* loaded from: classes8.dex */
public final class C31635v7 {
    @NotNull

    /* renamed from: a */
    public static final ColorDrawable f86585a = new ColorDrawable(Color.parseColor("#80ffffff"));
    @NotNull

    /* renamed from: b */
    private static final LayerDrawable f86586b;

    static {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{C31555u7.m28864c(), C31555u7.m28864c()});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        f86586b = layerDrawable;
    }

    @NotNull
    /* renamed from: a */
    public static LayerDrawable m28520a() {
        return f86586b;
    }
}
