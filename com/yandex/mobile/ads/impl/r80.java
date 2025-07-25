package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r80 {
    @NotNull

    /* renamed from: a */
    private final Context f84673a;

    public r80(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84673a = context;
    }

    @NotNull
    /* renamed from: a */
    public final ImageView m30119a(int i, int i2) {
        ImageView imageView = new ImageView(this.f84673a);
        int m35261a = cc2.m35261a(this.f84673a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m35261a, m35261a);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = i;
        layoutParams.topMargin = i2;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
