package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f80 {

    /* renamed from: d */
    private static final int f79004d = Color.parseColor("#66000000");

    /* renamed from: e */
    private static final int f79005e = Color.parseColor("#00000000");

    /* renamed from: f */
    private static final int f79006f = Color.parseColor("#7f7f7f");
    @NotNull

    /* renamed from: a */
    private final Context f79007a;
    @NotNull

    /* renamed from: b */
    private final C30578is f79008b;
    @NotNull

    /* renamed from: c */
    private final g80 f79009c;

    public f80(@NotNull Context context, @NotNull C30578is nativeAdAssets, @NotNull g80 feedbackAppearanceResolver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(feedbackAppearanceResolver, "feedbackAppearanceResolver");
        this.f79007a = context;
        this.f79008b = nativeAdAssets;
        this.f79009c = feedbackAppearanceResolver;
    }

    /* renamed from: a */
    public final void m34201a(@NotNull ImageView feedbackView, @NotNull FrameLayout feedbackContainer, int i) {
        Intrinsics.checkNotNullParameter(feedbackView, "feedbackView");
        Intrinsics.checkNotNullParameter(feedbackContainer, "feedbackContainer");
        if (this.f79009c.m33911a()) {
            if (this.f79008b.m33138i() != null) {
                int i2 = f79006f;
                Drawable drawable = ContextCompat.getDrawable(this.f79007a, C29880R.C29882drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                if (drawable != null) {
                    drawable.setColorFilter(porterDuffColorFilter);
                }
                feedbackView.setImageDrawable(drawable);
                feedbackContainer.setPadding(0, 0, 0, 0);
                feedbackContainer.setBackground(null);
                feedbackContainer.setVisibility(8);
                return;
            } else if (this.f79008b.m33139h() != null) {
                Drawable drawable2 = ContextCompat.getDrawable(this.f79007a, C29880R.C29882drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                if (drawable2 != null) {
                    drawable2.setColorFilter(porterDuffColorFilter2);
                }
                feedbackView.setImageDrawable(drawable2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f79004d, f79005e});
                feedbackContainer.setPadding(0, 0, 0, i);
                feedbackContainer.setBackground(gradientDrawable);
                feedbackContainer.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        int i3 = f79006f;
        Drawable drawable3 = ContextCompat.getDrawable(this.f79007a, C29880R.C29882drawable.monetization_ads_internal_ic_close_gray);
        PorterDuffColorFilter porterDuffColorFilter3 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
        if (drawable3 != null) {
            drawable3.setColorFilter(porterDuffColorFilter3);
        }
        feedbackView.setImageDrawable(drawable3);
        feedbackContainer.setPadding(0, 0, 0, 0);
        feedbackContainer.setBackground(null);
        feedbackContainer.setVisibility(0);
    }
}
