package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(24)
@Metadata
/* renamed from: androidx.window.layout.ActivityCompatHelperApi24 */
/* loaded from: classes2.dex */
public final class ActivityCompatHelper {
    @NotNull
    public static final ActivityCompatHelper INSTANCE = new ActivityCompatHelper();

    private ActivityCompatHelper() {
    }

    public final boolean isInMultiWindowMode(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
