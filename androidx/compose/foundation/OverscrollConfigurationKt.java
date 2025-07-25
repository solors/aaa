package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OverscrollConfiguration.kt */
@Metadata
/* loaded from: classes.dex */
public final class OverscrollConfigurationKt {
    @NotNull
    private static final ProvidableCompositionLocal<OverscrollConfiguration> LocalOverscrollConfiguration = CompositionLocalKt.compositionLocalOf$default(null, OverscrollConfigurationKt$LocalOverscrollConfiguration$1.INSTANCE, 1, null);

    @ExperimentalFoundationApi
    @NotNull
    public static final ProvidableCompositionLocal<OverscrollConfiguration> getLocalOverscrollConfiguration() {
        return LocalOverscrollConfiguration;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getLocalOverscrollConfiguration$annotations() {
    }
}
