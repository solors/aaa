package com.yandex.mobile.ads.nativeads;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public interface NativeAdImage {
    @Nullable
    Bitmap getBitmap();

    int getHeight();

    int getWidth();
}
