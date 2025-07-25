package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidActualDefaultDecayAnimationSpec.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class AndroidActualDefaultDecayAnimationSpec_androidKt {
    @Composable
    @NotNull
    public static final DecayAnimationSpec<Float> defaultDecayAnimationSpec(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1468328074);
        DecayAnimationSpec<Float> rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.endReplaceableGroup();
        return rememberSplineBasedDecay;
    }
}
