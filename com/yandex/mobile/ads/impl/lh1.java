package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lh1 {
    @NotNull

    /* renamed from: a */
    private final C32027zz f81816a;

    public /* synthetic */ lh1() {
        this(new C32027zz());
    }

    @NotNull
    /* renamed from: a */
    public final ProgressBar m32264a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(ContextCompat.getDrawable(context, C29880R.C29882drawable.monetization_ads_video_progress_bar_background));
        this.f81816a.getClass();
        int m25947a = C32027zz.m25947a(context, 45.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m25947a, m25947a);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    public lh1(@NotNull C32027zz dimensionConverter) {
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f81816a = dimensionConverter;
    }
}
