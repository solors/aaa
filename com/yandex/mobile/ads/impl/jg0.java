package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class jg0 {
    @NotNull

    /* renamed from: a */
    private final zg0 f80897a;
    @NotNull

    /* renamed from: b */
    private final yg0 f80898b;

    public /* synthetic */ jg0(Context context, zg0 zg0Var) {
        this(context, zg0Var, new yg0(context));
    }

    @Nullable
    /* renamed from: a */
    public final bh0 m32931a(@NotNull Map<String, Bitmap> imageValues, @Nullable MediatedNativeAdImage mediatedNativeAdImage) {
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        if (mediatedNativeAdImage == null) {
            return null;
        }
        String url = mediatedNativeAdImage.getUrl();
        int width = mediatedNativeAdImage.getWidth();
        int height = mediatedNativeAdImage.getHeight();
        this.f80897a.getClass();
        if (width > 0 && height > 0) {
            return new bh0(width, height, url, this.f80898b.m26914a(width, height), 112);
        }
        Bitmap bitmap = imageValues.get(url);
        if (bitmap == null) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        return new bh0(width2, height2, url, this.f80898b.m26914a(width2, height2), 112);
    }

    public jg0(@NotNull Context context, @NotNull zg0 imageSizeValidator, @NotNull yg0 imageSizeTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageSizeValidator, "imageSizeValidator");
        Intrinsics.checkNotNullParameter(imageSizeTypeProvider, "imageSizeTypeProvider");
        this.f80897a = imageSizeValidator;
        this.f80898b = imageSizeTypeProvider;
    }
}
