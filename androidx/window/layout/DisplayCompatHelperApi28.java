package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DisplayCompatHelper.kt */
@RequiresApi(28)
@Metadata
/* loaded from: classes2.dex */
public final class DisplayCompatHelperApi28 {
    @NotNull
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(@NotNull DisplayCutout displayCutout) {
        int safeInsetBottom;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int safeInsetLeft(@NotNull DisplayCutout displayCutout) {
        int safeInsetLeft;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int safeInsetRight(@NotNull DisplayCutout displayCutout) {
        int safeInsetRight;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int safeInsetTop(@NotNull DisplayCutout displayCutout) {
        int safeInsetTop;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
