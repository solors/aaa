package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cl1 {
    @NotNull

    /* renamed from: a */
    private final C32027zz f77670a;

    public /* synthetic */ cl1() {
        this(new C32027zz());
    }

    @NotNull
    /* renamed from: a */
    public final Button m35221a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Button button = new Button(context);
        button.setBackground(ContextCompat.getDrawable(context, C29880R.C29882drawable.monetization_ads_video_ic_replay));
        this.f77670a.getClass();
        int m25947a = C32027zz.m25947a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m25947a, m25947a);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public cl1(@NotNull C32027zz dimensionConverter) {
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f77670a = dimensionConverter;
    }
}
