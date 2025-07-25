package androidx.compose.material;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@Metadata
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface SelectableChipColors {
    @Composable
    @NotNull
    State<Color> backgroundColor(boolean z, boolean z2, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> contentColor(boolean z, boolean z2, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> leadingIconColor(boolean z, boolean z2, @Nullable Composer composer, int i);
}
