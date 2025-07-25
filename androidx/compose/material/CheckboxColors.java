package androidx.compose.material;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Checkbox.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public interface CheckboxColors {
    @Composable
    @NotNull
    State<Color> borderColor(boolean z, @NotNull ToggleableState toggleableState, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> boxColor(boolean z, @NotNull ToggleableState toggleableState, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> checkmarkColor(@NotNull ToggleableState toggleableState, @Nullable Composer composer, int i);
}
