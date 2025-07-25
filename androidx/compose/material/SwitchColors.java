package androidx.compose.material;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Switch.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public interface SwitchColors {
    @Composable
    @NotNull
    State<Color> thumbColor(boolean z, boolean z2, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> trackColor(boolean z, boolean z2, @Nullable Composer composer, int i);
}
