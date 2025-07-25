package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: DarkTheme.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class DarkTheme_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean _isSystemInDarkTheme(@Nullable Composer composer, int i) {
        if ((((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
