package androidx.compose.material;

import androidx.compose.p015ui.graphics.ColorKt;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ElevationOverlay.kt */
@Metadata
/* loaded from: classes.dex */
final class DefaultElevationOverlay implements ElevationOverlay {
    @NotNull
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    @Composable
    @ReadOnlyComposable
    /* renamed from: apply-7g2Lkgo  reason: not valid java name */
    public long mo106909apply7g2Lkgo(long j, float f, @Nullable Composer composer, int i) {
        long m106943calculateForegroundColorCLU3JFs;
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (C1059Dp.m109733compareTo0680j_4(f, C1059Dp.m109734constructorimpl(0)) > 0 && !colors.isLight()) {
            m106943calculateForegroundColorCLU3JFs = ElevationOverlayKt.m106943calculateForegroundColorCLU3JFs(j, f, composer, (i & 112) | (i & 14));
            return ColorKt.m107573compositeOverOWjLjI(m106943calculateForegroundColorCLU3JFs, j);
        }
        return j;
    }
}
