package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import androidx.compose.p015ui.layout.IntrinsicMeasureScope;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Intrinsic.kt */
@Metadata
/* loaded from: classes.dex */
final class RequiredMaxIntrinsicWidthModifier implements IntrinsicSizeModifier {
    @NotNull
    public static final RequiredMaxIntrinsicWidthModifier INSTANCE = new RequiredMaxIntrinsicWidthModifier();
    private static final boolean enforceIncoming = false;

    private RequiredMaxIntrinsicWidthModifier() {
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo106303calculateContentConstraintsl58MMJ0(@NotNull MeasureScope calculateContentConstraints, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(calculateContentConstraints, "$this$calculateContentConstraints");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return Constraints.Companion.m109700fixedWidthOenEA2s(measurable.maxIntrinsicWidth(Constraints.m109689getMaxHeightimpl(j)));
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return enforceIncoming;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p015ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i);
    }
}
