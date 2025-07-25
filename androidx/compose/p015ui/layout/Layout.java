package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.ui.layout.DefaultIntrinsicMeasurable */
/* loaded from: classes.dex */
public final class Layout implements Measurable {
    @NotNull
    private final IntrinsicMeasurable measurable;
    @NotNull
    private final IntrinsicMinMax minMax;
    @NotNull
    private final IntrinsicWidthHeight widthHeight;

    public Layout(@NotNull IntrinsicMeasurable measurable, @NotNull IntrinsicMinMax minMax, @NotNull IntrinsicWidthHeight widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.measurable = measurable;
        this.minMax = minMax;
        this.widthHeight = widthHeight;
    }

    @NotNull
    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @NotNull
    public final IntrinsicMinMax getMinMax() {
        return this.minMax;
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @NotNull
    public final IntrinsicWidthHeight getWidthHeight() {
        return this.widthHeight;
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        return this.measurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        return this.measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p015ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0  reason: not valid java name */
    public Placeable mo109020measureBRTryo0(long j) {
        int minIntrinsicHeight;
        int minIntrinsicWidth;
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            if (this.minMax == IntrinsicMinMax.Max) {
                minIntrinsicWidth = this.measurable.maxIntrinsicWidth(Constraints.m109689getMaxHeightimpl(j));
            } else {
                minIntrinsicWidth = this.measurable.minIntrinsicWidth(Constraints.m109689getMaxHeightimpl(j));
            }
            return new FixedSizeIntrinsicsPlaceable(minIntrinsicWidth, Constraints.m109689getMaxHeightimpl(j));
        }
        if (this.minMax == IntrinsicMinMax.Max) {
            minIntrinsicHeight = this.measurable.maxIntrinsicHeight(Constraints.m109690getMaxWidthimpl(j));
        } else {
            minIntrinsicHeight = this.measurable.minIntrinsicHeight(Constraints.m109690getMaxWidthimpl(j));
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.m109690getMaxWidthimpl(j), minIntrinsicHeight);
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        return this.measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        return this.measurable.minIntrinsicWidth(i);
    }
}
