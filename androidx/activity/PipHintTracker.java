package androidx.activity;

import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(19)
@Metadata
/* renamed from: androidx.activity.Api19Impl */
/* loaded from: classes.dex */
public final class PipHintTracker {
    @NotNull
    public static final PipHintTracker INSTANCE = new PipHintTracker();

    private PipHintTracker() {
    }

    public final boolean isAttachedToWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.isAttachedToWindow();
    }
}
