package androidx.compose.material;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Swipeable.kt */
@Stable
@Metadata
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface ThresholdConfig {
    float computeThreshold(@NotNull Density density, float f, float f2);
}
