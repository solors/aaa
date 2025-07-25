package androidx.compose.material;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata
@ExperimentalMaterialApi
/* renamed from: androidx.compose.material.ChipColors */
/* loaded from: classes.dex */
public interface Chip {
    @Composable
    @NotNull
    State<Color> backgroundColor(boolean z, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> contentColor(boolean z, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> leadingIconContentColor(boolean z, @Nullable Composer composer, int i);
}
