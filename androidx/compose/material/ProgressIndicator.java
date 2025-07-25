package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.material.ProgressIndicatorDefaults */
/* loaded from: classes.dex */
public final class ProgressIndicator {
    public static final int $stable = 0;
    public static final float IndicatorBackgroundOpacity = 0.24f;
    @NotNull
    public static final ProgressIndicator INSTANCE = new ProgressIndicator();
    private static final float StrokeWidth = C1059Dp.m109734constructorimpl(4);
    @NotNull
    private static final SpringSpec<Float> ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));

    private ProgressIndicator() {
    }

    @NotNull
    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM  reason: not valid java name */
    public final float m107011getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }
}
