package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vv1 {
    @NotNull

    /* renamed from: a */
    private final yv1 f86890a = new yv1();
    @NotNull

    /* renamed from: b */
    private final C31752wh f86891b = new C31752wh();
    @NotNull

    /* renamed from: c */
    private final C30100ck f86892c = new C30100ck();
    @Nullable

    /* renamed from: d */
    private xv1 f86893d;

    /* renamed from: a */
    public final void m28209a(@NotNull ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this.f86893d);
    }

    /* renamed from: a */
    public final void m28210a(@NotNull Bitmap originalBitmap, @NotNull ImageView view, @NotNull bh0 imageValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        xv1 xv1Var = new xv1(this.f86891b, this.f86892c, this.f86890a, imageValue, originalBitmap);
        this.f86893d = xv1Var;
        view.addOnLayoutChangeListener(xv1Var);
        if (view.getLayoutParams().width == -1 || view.getLayoutParams().height == -1 || view.getLayoutParams().width == -2 || view.getLayoutParams().height == -2) {
            view.setImageBitmap(originalBitmap);
        }
    }
}
