package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.yandex.mobile.ads.impl.gj1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class ColorizedRatingView extends gj1 {

    /* renamed from: a */
    private static final int f66437a = Color.parseColor("#FFF4C900");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorizedRatingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                Intrinsics.m17074g(drawable2);
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    blendMode3 = BlendMode.SRC_ATOP;
                    drawable2.setColorFilter(new BlendModeColorFilter(-3355444, blendMode3));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                Intrinsics.m17074g(drawable3);
                int i2 = f66437a;
                if (i >= 29) {
                    blendMode2 = BlendMode.SRC_ATOP;
                    drawable3.setColorFilter(new BlendModeColorFilter(i2, blendMode2));
                } else {
                    drawable3.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                Intrinsics.m17074g(drawable4);
                if (i >= 29) {
                    blendMode = BlendMode.SRC_ATOP;
                    drawable4.setColorFilter(new BlendModeColorFilter(i2, blendMode));
                    return;
                }
                drawable4.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorizedRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorizedRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
