package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a8 */
/* loaded from: classes8.dex */
public final class C29924a8 {
    @NotNull

    /* renamed from: a */
    public static final GradientDrawable f76731a;
    @NotNull

    /* renamed from: b */
    public static final ColorDrawable f76732b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f76731a = gradientDrawable;
        f76732b = new ColorDrawable(Color.parseColor("#ff000000"));
    }
}
