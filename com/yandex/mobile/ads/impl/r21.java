package com.yandex.mobile.ads.impl;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r21 {

    /* renamed from: b */
    private static final int f84607b = Color.parseColor("#eaeaea");
    @NotNull

    /* renamed from: a */
    private final ImageView[] f84608a;

    public r21(@NotNull ImageView... imageViews) {
        Intrinsics.checkNotNullParameter(imageViews, "imageViews");
        this.f84608a = imageViews;
        m30163b();
    }

    /* renamed from: a */
    public final void m30164a() {
        ImageView[] imageViewArr;
        for (ImageView imageView : this.f84608a) {
            Drawable background = imageView.getBackground();
            Intrinsics.m17073h(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            ColorDrawable colorDrawable = (ColorDrawable) background;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", 255, 0));
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
                ofPropertyValuesHolder.setTarget(colorDrawable);
                ofPropertyValuesHolder.setDuration(500L);
                ofPropertyValuesHolder.start();
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, 255));
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder2, "ofPropertyValuesHolder(...)");
                ofPropertyValuesHolder2.setTarget(drawable);
                ofPropertyValuesHolder2.setDuration(500L);
                ofPropertyValuesHolder2.start();
            }
        }
    }

    /* renamed from: b */
    public final void m30163b() {
        ImageView[] imageViewArr;
        for (ImageView imageView : this.f84608a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f84607b);
                }
            }
        }
    }
}
