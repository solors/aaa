package androidx.compose.p015ui.platform;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.platform.InspectionModeKt */
/* loaded from: classes.dex */
public final class InspectionMode {
    @NotNull
    private static final ProvidableCompositionLocal<Boolean> LocalInspectionMode = CompositionLocalKt.staticCompositionLocalOf(InspectionModeKt$LocalInspectionMode$1.INSTANCE);

    @NotNull
    public static final ProvidableCompositionLocal<Boolean> getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}
