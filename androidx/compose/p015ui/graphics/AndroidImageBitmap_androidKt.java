package androidx.compose.p015ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.p015ui.graphics.ImageBitmapConfig;
import androidx.compose.p015ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidImageBitmap_androidKt */
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    @NotNull
    /* renamed from: ActualImageBitmap-x__-hDU */
    public static final ImageBitmap m107400ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, @NotNull ColorSpace colorSpace) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap.Config m107401toBitmapConfig1JJdX4A = m107401toBitmapConfig1JJdX4A(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Api26Bitmap.m107436createBitmapx__hDU$ui_graphics_release(i, i2, i3, z, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m107401toBitmapConfig1JJdX4A);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z);
        }
        return new AndroidImageBitmap(createBitmap);
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(imageBitmap, "<this>");
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new AndroidImageBitmap(bitmap);
    }

    @NotNull
    /* renamed from: toBitmapConfig-1JJdX4A */
    public static final Bitmap.Config m107401toBitmapConfig1JJdX4A(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m107708equalsimpl0(i, companion.m107713getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m107708equalsimpl0(i, companion.m107712getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m107708equalsimpl0(i, companion.m107716getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && ImageBitmapConfig.m107708equalsimpl0(i, companion.m107714getF16_sVssgQ())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i2 >= 26 && ImageBitmapConfig.m107708equalsimpl0(i, companion.m107715getGpu_sVssgQ())) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    public static final int toImageConfig(@NotNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m107712getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m107716getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m107713getArgb8888_sVssgQ();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return ImageBitmapConfig.Companion.m107714getF16_sVssgQ();
            }
        }
        if (i >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return ImageBitmapConfig.Companion.m107715getGpu_sVssgQ();
            }
        }
        return ImageBitmapConfig.Companion.m107713getArgb8888_sVssgQ();
    }
}
