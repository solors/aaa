package androidx.compose.material;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnackbarHost.kt */
@Metadata
/* loaded from: classes.dex */
public interface SnackbarData {
    void dismiss();

    @Nullable
    String getActionLabel();

    @NotNull
    SnackbarDuration getDuration();

    @NotNull
    String getMessage();

    void performAction();
}
