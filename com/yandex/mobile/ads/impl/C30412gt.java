package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gt */
/* loaded from: classes8.dex */
public final class C30412gt {
    @NotNull
    /* renamed from: a */
    public static C30338ft m33779a(@NotNull Context context, @NotNull View roundView, @Nullable AttributeSet attributeSet, int i) {
        float f;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roundView, "view");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29880R.styleable.MonetizationAdsInternalRoundImageView, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            f = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76509xe4619fe7, 0);
            obtainStyledAttributes.recycle();
        } else {
            f = 0.0f;
        }
        float f2 = f;
        Intrinsics.checkNotNullParameter(roundView, "roundView");
        return new C30338ft(roundView, f2, f2, f2, f2);
    }
}
