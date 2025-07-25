package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bp1 {
    @NotNull

    /* renamed from: a */
    private final C31662vk f77382a;

    public /* synthetic */ bp1() {
        this(new C31662vk());
    }

    @NotNull
    /* renamed from: a */
    public final Bitmap m35453a(@NotNull Drawable drawable) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            C31662vk c31662vk = this.f77382a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            c31662vk.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        } else {
            C31662vk c31662vk2 = this.f77382a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            c31662vk2.getClass();
            Intrinsics.checkNotNullParameter(config2, "config");
            createBitmap = Bitmap.createBitmap(1, 1, config2);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public bp1(@NotNull C31662vk bitmapProvider) {
        Intrinsics.checkNotNullParameter(bitmapProvider, "bitmapProvider");
        this.f77382a = bitmapProvider;
    }
}
