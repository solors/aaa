package androidx.compose.foundation.shape;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.platform.InspectableValue;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CornerSize.kt */
@Metadata
/* loaded from: classes.dex */
public final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float percent;

    public PercentCornerSize(float f) {
        this.percent = f;
        if (f >= 0.0f && f <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }

    private final float component1() {
        return this.percent;
    }

    public static /* synthetic */ PercentCornerSize copy$default(PercentCornerSize percentCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = percentCornerSize.percent;
        }
        return percentCornerSize.copy(f);
    }

    @NotNull
    public final PercentCornerSize copy(float f) {
        return new PercentCornerSize(f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PercentCornerSize) && Intrinsics.m17075f(Float.valueOf(this.percent), Float.valueOf(((PercentCornerSize) obj).percent))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.percent);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo106560toPxTmRCtEA(long j, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Size.m107359getMinDimensionimpl(j) * (this.percent / 100.0f);
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }

    @Override // androidx.compose.p015ui.platform.InspectableValue
    @NotNull
    public String getValueOverride() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.percent);
        sb2.append('%');
        return sb2.toString();
    }
}
