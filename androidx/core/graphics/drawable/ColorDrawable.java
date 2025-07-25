package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.graphics.drawable.ColorDrawableKt */
/* loaded from: classes.dex */
public final class ColorDrawable {
    @NotNull
    public static final android.graphics.drawable.ColorDrawable toDrawable(@ColorInt int i) {
        return new android.graphics.drawable.ColorDrawable(i);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final android.graphics.drawable.ColorDrawable toDrawable(@NotNull Color color) {
        int argb;
        Intrinsics.checkNotNullParameter(color, "<this>");
        argb = color.toArgb();
        return new android.graphics.drawable.ColorDrawable(argb);
    }
}
