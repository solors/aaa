package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.DarkThemeKt */
/* loaded from: classes.dex */
public final class DarkTheme {
    @Composable
    @ReadOnlyComposable
    public static final boolean isSystemInDarkTheme(@Nullable Composer composer, int i) {
        return DarkTheme_androidKt._isSystemInDarkTheme(composer, 0);
    }
}
