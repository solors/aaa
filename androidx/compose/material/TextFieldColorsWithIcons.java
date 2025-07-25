package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDefaults.kt */
@Metadata
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface TextFieldColorsWithIcons extends TextFieldColors {

    /* compiled from: TextFieldDefaults.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Composable
        @NotNull
        public static State<Color> leadingIconColor(@NotNull TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            composer.startReplaceableGroup(1279189910);
            State<Color> leadingIconColor = textFieldColorsWithIcons.leadingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & 896));
            composer.endReplaceableGroup();
            return leadingIconColor;
        }

        @Composable
        @NotNull
        public static State<Color> trailingIconColor(@NotNull TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            composer.startReplaceableGroup(-712140408);
            State<Color> trailingIconColor = textFieldColorsWithIcons.trailingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & 896));
            composer.endReplaceableGroup();
            return trailingIconColor;
        }
    }

    @Composable
    @NotNull
    State<Color> leadingIconColor(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> trailingIconColor(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i);
}
