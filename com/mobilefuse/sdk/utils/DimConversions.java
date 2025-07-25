package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.utils.DimConversionsKt */
/* loaded from: classes7.dex */
public final class DimConversions {
    public static final int dpToPx(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public static final float pxToDp(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return i / resources.getDisplayMetrics().density;
    }

    public static final int dpToPx(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return dpToPx(i, context);
    }

    public static final float pxToDp(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return pxToDp((int) f, context);
    }

    @NotNull
    public static final Point dpToPx(@NotNull Point dpToPx, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(dpToPx, "$this$dpToPx");
        Intrinsics.checkNotNullParameter(context, "context");
        return new Point(dpToPx(dpToPx.x, context), dpToPx(dpToPx.y, context));
    }
}
