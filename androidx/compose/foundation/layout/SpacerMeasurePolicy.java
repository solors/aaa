package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasurePolicy;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Spacer.kt */
@Metadata
/* loaded from: classes.dex */
final class SpacerMeasurePolicy implements MeasurePolicy {
    @NotNull
    public static final SpacerMeasurePolicy INSTANCE = new SpacerMeasurePolicy();

    private SpacerMeasurePolicy() {
    }

    @Override // androidx.compose.p015ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105914measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j) {
        int i;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int i2 = 0;
        if (Constraints.m109688getHasFixedWidthimpl(j)) {
            i = Constraints.m109690getMaxWidthimpl(j);
        } else {
            i = 0;
        }
        if (Constraints.m109687getHasFixedHeightimpl(j)) {
            i2 = Constraints.m109689getMaxHeightimpl(j);
        }
        return MeasureScope.layout$default(measure, i, i2, null, SpacerMeasurePolicy$measure$1$1.INSTANCE, 4, null);
    }
}
