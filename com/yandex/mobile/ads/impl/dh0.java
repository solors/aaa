package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dh0 {
    /* renamed from: a */
    public static boolean m34934a(@NotNull bh0 imageValue, @NotNull Map images) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(images, "images");
        Bitmap bitmap = (Bitmap) images.get(imageValue.m35470f());
        if ((bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !imageValue.m35474b()) {
            return true;
        }
        return false;
    }
}
