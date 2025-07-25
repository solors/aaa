package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.unit.ConstraintsKt;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MeasurePolicy.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.layout.MeasurePolicy */
/* loaded from: classes.dex */
public interface MeasurePolicy {

    /* compiled from: MeasurePolicy.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.MeasurePolicy$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return MeasurePolicy.super.maxIntrinsicHeight(receiver, measurables, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return MeasurePolicy.super.maxIntrinsicWidth(receiver, measurables, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return MeasurePolicy.super.minIntrinsicHeight(receiver, measurables, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return MeasurePolicy.super.minIntrinsicWidth(receiver, measurables, i);
        }
    }

    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new Layout(measurables.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo105914measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new Layout(measurables.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo105914measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    @NotNull
    /* renamed from: measure-3p2s80s */
    MeasureResult mo105914measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j);

    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new Layout(measurables.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo105914measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new Layout(measurables.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo105914measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}
