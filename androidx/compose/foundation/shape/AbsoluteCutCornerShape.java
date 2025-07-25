package androidx.compose.foundation.shape;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.AndroidPath_androidKt;
import androidx.compose.p015ui.graphics.Outline;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbsoluteCutCornerShape.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsoluteCutCornerShape(@NotNull CornerSize topLeft, @NotNull CornerSize topRight, @NotNull CornerSize bottomRight, @NotNull CornerSize bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    /* renamed from: createOutline-LjSzlW0  reason: not valid java name */
    public Outline mo106552createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @NotNull LayoutDirection layoutDirection) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (f + f2 + f4 + f3 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Outline.Rectangle(SizeKt.m107381toRectuvyYCjk(j));
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, f);
        Path.lineTo(f, 0.0f);
        Path.lineTo(Size.m107360getWidthimpl(j) - f2, 0.0f);
        Path.lineTo(Size.m107360getWidthimpl(j), f2);
        Path.lineTo(Size.m107360getWidthimpl(j), Size.m107357getHeightimpl(j) - f3);
        Path.lineTo(Size.m107360getWidthimpl(j) - f3, Size.m107357getHeightimpl(j));
        Path.lineTo(f4, Size.m107357getHeightimpl(j));
        Path.lineTo(0.0f, Size.m107357getHeightimpl(j) - f4);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        if (Intrinsics.m17075f(getTopStart(), absoluteCutCornerShape.getTopStart()) && Intrinsics.m17075f(getTopEnd(), absoluteCutCornerShape.getTopEnd()) && Intrinsics.m17075f(getBottomEnd(), absoluteCutCornerShape.getBottomEnd()) && Intrinsics.m17075f(getBottomStart(), absoluteCutCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @NotNull
    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    public AbsoluteCutCornerShape copy(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        return new AbsoluteCutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
