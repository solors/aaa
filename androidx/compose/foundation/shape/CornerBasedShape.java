package androidx.compose.foundation.shape;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.Outline;
import androidx.compose.p015ui.graphics.Shape;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CornerBasedShape.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    @NotNull
    private final CornerSize bottomEnd;
    @NotNull
    private final CornerSize bottomStart;
    @NotNull
    private final CornerSize topEnd;
    @NotNull
    private final CornerSize topStart;

    public CornerBasedShape(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        this.topStart = topStart;
        this.topEnd = topEnd;
        this.bottomEnd = bottomEnd;
        this.bottomStart = bottomStart;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                cornerSize = cornerBasedShape.topStart;
            }
            if ((i & 2) != 0) {
                cornerSize2 = cornerBasedShape.topEnd;
            }
            if ((i & 4) != 0) {
                cornerSize3 = cornerBasedShape.bottomEnd;
            }
            if ((i & 8) != 0) {
                cornerSize4 = cornerBasedShape.bottomStart;
            }
            return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @NotNull
    public final CornerBasedShape copy(@NotNull CornerSize all) {
        Intrinsics.checkNotNullParameter(all, "all");
        return copy(all, all, all, all);
    }

    @NotNull
    public abstract CornerBasedShape copy(@NotNull CornerSize cornerSize, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3, @NotNull CornerSize cornerSize4);

    @NotNull
    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo106552createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @NotNull LayoutDirection layoutDirection);

    @Override // androidx.compose.p015ui.graphics.Shape
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo106107createOutlinePq9zytI(long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float mo106560toPxTmRCtEA = this.topStart.mo106560toPxTmRCtEA(j, density);
        float mo106560toPxTmRCtEA2 = this.topEnd.mo106560toPxTmRCtEA(j, density);
        float mo106560toPxTmRCtEA3 = this.bottomEnd.mo106560toPxTmRCtEA(j, density);
        float mo106560toPxTmRCtEA4 = this.bottomStart.mo106560toPxTmRCtEA(j, density);
        float m107359getMinDimensionimpl = Size.m107359getMinDimensionimpl(j);
        float f = mo106560toPxTmRCtEA + mo106560toPxTmRCtEA4;
        if (f > m107359getMinDimensionimpl) {
            float f2 = m107359getMinDimensionimpl / f;
            mo106560toPxTmRCtEA *= f2;
            mo106560toPxTmRCtEA4 *= f2;
        }
        float f3 = mo106560toPxTmRCtEA4;
        float f4 = mo106560toPxTmRCtEA2 + mo106560toPxTmRCtEA3;
        if (f4 > m107359getMinDimensionimpl) {
            float f5 = m107359getMinDimensionimpl / f4;
            mo106560toPxTmRCtEA2 *= f5;
            mo106560toPxTmRCtEA3 *= f5;
        }
        if (mo106560toPxTmRCtEA >= 0.0f && mo106560toPxTmRCtEA2 >= 0.0f && mo106560toPxTmRCtEA3 >= 0.0f && f3 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo106552createOutlineLjSzlW0(j, mo106560toPxTmRCtEA, mo106560toPxTmRCtEA2, mo106560toPxTmRCtEA3, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo106560toPxTmRCtEA + ", topEnd = " + mo106560toPxTmRCtEA2 + ", bottomEnd = " + mo106560toPxTmRCtEA3 + ", bottomStart = " + f3 + ")!").toString());
    }

    @NotNull
    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    @NotNull
    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @NotNull
    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    @NotNull
    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
