package com.mobilefuse.sdk.p542ad.rendering.omniad;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.WindowUtils */
/* loaded from: classes7.dex */
public final class GetWindowRect {
    @NotNull
    public static final Rect getWindowRect(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        View contentView = decorView.findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        ViewParent parent = contentView.getParent();
        if (parent != null) {
            Rect rect = new Rect();
            ((View) parent).getGlobalVisibleRect(rect);
            return rect;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }
}
