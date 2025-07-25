package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class h92 {
    @NotNull

    /* renamed from: a */
    private final lh1 f80011a;
    @NotNull

    /* renamed from: b */
    private final v92 f80012b;

    public /* synthetic */ h92() {
        this(new lh1(), new v92());
    }

    @NotNull
    /* renamed from: a */
    public final g92 m33589a(@NotNull Context context, @Nullable y52 y52Var) {
        bh0 bh0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80012b.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = null;
        if (y52Var != null) {
            bh0Var = y52Var.m27027a();
        } else {
            bh0Var = null;
        }
        if (bh0Var != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ProgressBar m32264a = this.f80011a.m32264a(context);
        m32264a.setVisibility(8);
        g92 g92Var = new g92(context, m32264a, imageView);
        g92Var.addView(m32264a);
        if (imageView != null) {
            g92Var.addView(imageView);
        }
        g92Var.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        return g92Var;
    }

    public h92(@NotNull lh1 progressBarCreator, @NotNull v92 videoPreviewCreator) {
        Intrinsics.checkNotNullParameter(progressBarCreator, "progressBarCreator");
        Intrinsics.checkNotNullParameter(videoPreviewCreator, "videoPreviewCreator");
        this.f80011a = progressBarCreator;
        this.f80012b = videoPreviewCreator;
    }
}
