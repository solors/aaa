package androidx.compose.foundation.shape;

import androidx.compose.p015ui.geometry.CornerRadiusKt;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.RoundRectKt;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.Outline;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoundedCornerShape.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerShape(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
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
        float f7;
        float f8;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Outline.Rectangle(SizeKt.m107381toRectuvyYCjk(j));
        }
        Rect m107381toRectuvyYCjk = SizeKt.m107381toRectuvyYCjk(j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long CornerRadius$default = CornerRadiusKt.CornerRadius$default(f5, 0.0f, 2, null);
        if (layoutDirection == layoutDirection2) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long CornerRadius$default2 = CornerRadiusKt.CornerRadius$default(f6, 0.0f, 2, null);
        if (layoutDirection == layoutDirection2) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long CornerRadius$default3 = CornerRadiusKt.CornerRadius$default(f7, 0.0f, 2, null);
        if (layoutDirection == layoutDirection2) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new Outline.Rounded(RoundRectKt.m107343RoundRectZAM2FJo(m107381toRectuvyYCjk, CornerRadius$default, CornerRadius$default2, CornerRadius$default3, CornerRadiusKt.CornerRadius$default(f8, 0.0f, 2, null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        if (Intrinsics.m17075f(getTopStart(), roundedCornerShape.getTopStart()) && Intrinsics.m17075f(getTopEnd(), roundedCornerShape.getTopEnd()) && Intrinsics.m17075f(getBottomEnd(), roundedCornerShape.getBottomEnd()) && Intrinsics.m17075f(getBottomStart(), roundedCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @NotNull
    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    public RoundedCornerShape copy(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        return new RoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
