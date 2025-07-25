package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityResultLauncher.kt */
@Metadata
/* loaded from: classes.dex */
public final class ActivityResultLauncherKt {
    public static final void launch(@NotNull ActivityResultLauncher<Void> activityResultLauncher, @Nullable ActivityOptionsCompat activityOptionsCompat) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<this>");
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    public static final void launchUnit(@NotNull ActivityResultLauncher<Unit> activityResultLauncher, @Nullable ActivityOptionsCompat activityOptionsCompat) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<this>");
        activityResultLauncher.launch(Unit.f99208a, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }
}
