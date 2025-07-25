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

/* compiled from: CutCornerShape.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutCornerShape(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo106552createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @NotNull LayoutDirection layoutDirection) {
        boolean z;
        float f5;
        float f6;
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
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        Path.moveTo(0.0f, f5);
        Path.lineTo(f5, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f = f2;
        }
        Path.lineTo(Size.m107360getWidthimpl(j) - f, 0.0f);
        Path.lineTo(Size.m107360getWidthimpl(j), f);
        if (layoutDirection == layoutDirection2) {
            f6 = f3;
        } else {
            f6 = f4;
        }
        Path.lineTo(Size.m107360getWidthimpl(j), Size.m107357getHeightimpl(j) - f6);
        Path.lineTo(Size.m107360getWidthimpl(j) - f6, Size.m107357getHeightimpl(j));
        if (layoutDirection == layoutDirection2) {
            f3 = f4;
        }
        Path.lineTo(f3, Size.m107357getHeightimpl(j));
        Path.lineTo(0.0f, Size.m107357getHeightimpl(j) - f3);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        if (Intrinsics.m17075f(getTopStart(), cutCornerShape.getTopStart()) && Intrinsics.m17075f(getTopEnd(), cutCornerShape.getTopEnd()) && Intrinsics.m17075f(getBottomEnd(), cutCornerShape.getBottomEnd()) && Intrinsics.m17075f(getBottomStart(), cutCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @NotNull
    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    public CutCornerShape copy(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        return new CutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
