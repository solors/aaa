package androidx.compose.foundation.shape;

import androidx.compose.p015ui.geometry.CornerRadiusKt;
import androidx.compose.p015ui.geometry.RoundRectKt;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.Outline;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbsoluteRoundedCornerShape.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsoluteRoundedCornerShape(@NotNull CornerSize topLeft, @NotNull CornerSize topRight, @NotNull CornerSize bottomRight, @NotNull CornerSize bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
    }

    /* renamed from: toRadius-Bz7bX_o  reason: not valid java name */
    private final long m106556toRadiusBz7bX_o(float f) {
        return CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo106552createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @NotNull LayoutDirection layoutDirection) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Outline.Rectangle(SizeKt.m107381toRectuvyYCjk(j));
        }
        return new Outline.Rounded(RoundRectKt.m107343RoundRectZAM2FJo(SizeKt.m107381toRectuvyYCjk(j), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f3, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f4, 0.0f, 2, null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        if (Intrinsics.m17075f(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && Intrinsics.m17075f(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && Intrinsics.m17075f(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && Intrinsics.m17075f(getBottomStart(), absoluteRoundedCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @NotNull
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    public AbsoluteRoundedCornerShape copy(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        return new AbsoluteRoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
