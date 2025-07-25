package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Density.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.DensityKt */
/* loaded from: classes.dex */
public final class DensityKt {
    @Stable
    @NotNull
    public static final Density Density(float f, float f2) {
        return new DensityImpl(f, f2);
    }

    public static /* synthetic */ Density Density$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return Density(f, f2);
    }
}
