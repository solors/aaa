package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import androidx.compose.p015ui.layout.IntrinsicMeasureScope;
import androidx.compose.p015ui.layout.LayoutModifier;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Intrinsic.kt */
@Metadata
/* loaded from: classes.dex */
interface IntrinsicSizeModifier extends LayoutModifier {
    /* renamed from: calculateContentConstraints-l58MMJ0  reason: not valid java name */
    long mo106303calculateContentConstraintsl58MMJ0(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j);

    default boolean getEnforceIncoming() {
        return true;
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    default MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long mo106303calculateContentConstraintsl58MMJ0 = mo106303calculateContentConstraintsl58MMJ0(measure, measurable, j);
        if (getEnforceIncoming()) {
            mo106303calculateContentConstraintsl58MMJ0 = ConstraintsKt.m109702constrainN9IONVI(j, mo106303calculateContentConstraintsl58MMJ0);
        }
        Placeable mo109020measureBRTryo0 = measurable.mo109020measureBRTryo0(mo106303calculateContentConstraintsl58MMJ0);
        return MeasureScope.layout$default(measure, mo109020measureBRTryo0.getWidth(), mo109020measureBRTryo0.getHeight(), null, new IntrinsicSizeModifier$measure$1(mo109020measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicWidth(i);
    }
}
