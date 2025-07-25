package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.graphics.drawable.BitmapDrawableKt */
/* loaded from: classes.dex */
public final class BitmapDrawable {
    @NotNull
    public static final android.graphics.drawable.BitmapDrawable toDrawable(@NotNull Bitmap bitmap, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new android.graphics.drawable.BitmapDrawable(resources, bitmap);
    }
}
