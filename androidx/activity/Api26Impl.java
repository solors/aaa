package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PipHintTracker.kt */
@RequiresApi(26)
@Metadata
/* loaded from: classes.dex */
public final class Api26Impl {
    @NotNull
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final void setPipParamsSourceRectHint(@NotNull Activity activity, @NotNull Rect hint) {
        PictureInPictureParams.Builder sourceRectHint;
        PictureInPictureParams build;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(hint, "hint");
        sourceRectHint = new PictureInPictureParams.Builder().setSourceRectHint(hint);
        build = sourceRectHint.build();
        activity.setPictureInPictureParams(build);
    }
}
