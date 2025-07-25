package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.ColorKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextSelectionColors.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextSelectionColorsKt {
    private static final long DefaultSelectionColor;
    @NotNull
    private static final TextSelectionColors DefaultTextSelectionColors;
    @NotNull
    private static final ProvidableCompositionLocal<TextSelectionColors> LocalTextSelectionColors = CompositionLocalKt.compositionLocalOf$default(null, TextSelectionColorsKt$LocalTextSelectionColors$1.INSTANCE, 1, null);

    static {
        long Color = ColorKt.Color(4282550004L);
        DefaultSelectionColor = Color;
        DefaultTextSelectionColors = new TextSelectionColors(Color, Color.m107526copywmQWz5c$default(Color, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }

    @Stable
    private static /* synthetic */ void getDefaultTextSelectionColors$annotations() {
    }
}
