package com.mobilefuse.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import com.mobilefuse.sdk.StabilityHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.utils.ViewToBitmapKt */
/* loaded from: classes7.dex */
public final class ViewToBitmap {
    @Nullable
    public static final Bitmap crop(@NotNull Bitmap crop, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(crop, "$this$crop");
        try {
            return Bitmap.createBitmap(crop, i, i2, i3, i4);
        } catch (Exception e) {
            StabilityHelper.logException(crop, e);
            return null;
        }
    }

    @Nullable
    public static final Bitmap toBitmap(@NotNull View toBitmap) {
        Intrinsics.checkNotNullParameter(toBitmap, "$this$toBitmap");
        try {
            Bitmap createBitmap = Bitmap.createBitmap(toBitmap.getWidth(), toBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
            toBitmap.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Exception e) {
            StabilityHelper.logException(toBitmap, e);
            return null;
        }
    }

    @Nullable
    public static final Bitmap toCroppedBitmap(@NotNull View toCroppedBitmap, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(toCroppedBitmap, "$this$toCroppedBitmap");
        Bitmap bitmap = toBitmap(toCroppedBitmap);
        if (bitmap != null) {
            return crop(bitmap, i, i2, i3, i4);
        }
        return null;
    }

    @Nullable
    public static final ImageView toCroppedImageView(@NotNull View toCroppedImageView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(toCroppedImageView, "$this$toCroppedImageView");
        Bitmap croppedBitmap = toCroppedBitmap(toCroppedImageView, i, i2, i3, i4);
        if (croppedBitmap != null) {
            ImageView imageView = new ImageView(toCroppedImageView.getContext());
            imageView.setImageBitmap(croppedBitmap);
            return imageView;
        }
        return null;
    }
}
