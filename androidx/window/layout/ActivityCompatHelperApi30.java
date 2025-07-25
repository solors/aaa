package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActivityCompatHelper.kt */
@RequiresApi(30)
@Metadata
/* loaded from: classes2.dex */
public final class ActivityCompatHelperApi30 {
    @NotNull
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    @NotNull
    public final Rect currentWindowBounds(@NotNull Activity activity) {
        android.view.WindowMetrics currentWindowMetrics;
        Rect bounds;
        Intrinsics.checkNotNullParameter(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @NotNull
    public final Rect maximumWindowBounds(@NotNull Activity activity) {
        android.view.WindowMetrics maximumWindowMetrics;
        Rect bounds;
        Intrinsics.checkNotNullParameter(activity, "activity");
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
