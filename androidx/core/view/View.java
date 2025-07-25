package androidx.core.view;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(16)
@Metadata
/* renamed from: androidx.core.view.Api16Impl */
/* loaded from: classes.dex */
final class View {
    @NotNull
    public static final View INSTANCE = new View();

    private View() {
    }

    @DoNotInline
    public static final void postOnAnimationDelayed(@NotNull android.view.View view, @NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        view.postOnAnimationDelayed(action, j);
    }
}
