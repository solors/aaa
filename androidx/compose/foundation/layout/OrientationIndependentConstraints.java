package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RowColumnImpl.kt */
@Metadata
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final int crossAxisMax;
    private final int crossAxisMin;
    private final int mainAxisMax;
    private final int mainAxisMin;

    public /* synthetic */ OrientationIndependentConstraints(long j, LayoutOrientation layoutOrientation, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, layoutOrientation);
    }

    public static /* synthetic */ OrientationIndependentConstraints copy$default(OrientationIndependentConstraints orientationIndependentConstraints, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = orientationIndependentConstraints.mainAxisMin;
        }
        if ((i5 & 2) != 0) {
            i2 = orientationIndependentConstraints.mainAxisMax;
        }
        if ((i5 & 4) != 0) {
            i3 = orientationIndependentConstraints.crossAxisMin;
        }
        if ((i5 & 8) != 0) {
            i4 = orientationIndependentConstraints.crossAxisMax;
        }
        return orientationIndependentConstraints.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mainAxisMin;
    }

    public final int component2() {
        return this.mainAxisMax;
    }

    public final int component3() {
        return this.crossAxisMin;
    }

    public final int component4() {
        return this.crossAxisMax;
    }

    @NotNull
    public final OrientationIndependentConstraints copy(int i, int i2, int i3, int i4) {
        return new OrientationIndependentConstraints(i, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrientationIndependentConstraints)) {
            return false;
        }
        OrientationIndependentConstraints orientationIndependentConstraints = (OrientationIndependentConstraints) obj;
        if (this.mainAxisMin == orientationIndependentConstraints.mainAxisMin && this.mainAxisMax == orientationIndependentConstraints.mainAxisMax && this.crossAxisMin == orientationIndependentConstraints.crossAxisMin && this.crossAxisMax == orientationIndependentConstraints.crossAxisMax) {
            return true;
        }
        return false;
    }

    public final int getCrossAxisMax() {
        return this.crossAxisMax;
    }

    public final int getCrossAxisMin() {
        return this.crossAxisMin;
    }

    public final int getMainAxisMax() {
        return this.mainAxisMax;
    }

    public final int getMainAxisMin() {
        return this.mainAxisMin;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mainAxisMin) * 31) + Integer.hashCode(this.mainAxisMax)) * 31) + Integer.hashCode(this.crossAxisMin)) * 31) + Integer.hashCode(this.crossAxisMax);
    }

    public final int maxHeight(@NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return this.crossAxisMax;
        }
        return this.mainAxisMax;
    }

    public final int maxWidth(@NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return this.mainAxisMax;
        }
        return this.crossAxisMax;
    }

    @NotNull
    public final OrientationIndependentConstraints stretchCrossAxis() {
        int i;
        int i2 = this.mainAxisMin;
        int i3 = this.mainAxisMax;
        int i4 = this.crossAxisMax;
        if (i4 != Integer.MAX_VALUE) {
            i = i4;
        } else {
            i = this.crossAxisMin;
        }
        return new OrientationIndependentConstraints(i2, i3, i, i4);
    }

    /* renamed from: toBoxConstraints-OenEA2s  reason: not valid java name */
    public final long m106311toBoxConstraintsOenEA2s(@NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(this.mainAxisMin, this.mainAxisMax, this.crossAxisMin, this.crossAxisMax);
        }
        return ConstraintsKt.Constraints(this.crossAxisMin, this.crossAxisMax, this.mainAxisMin, this.mainAxisMax);
    }

    @NotNull
    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.mainAxisMin + ", mainAxisMax=" + this.mainAxisMax + ", crossAxisMin=" + this.crossAxisMin + ", crossAxisMax=" + this.crossAxisMax + ')';
    }

    public OrientationIndependentConstraints(int i, int i2, int i3, int i4) {
        this.mainAxisMin = i;
        this.mainAxisMax = i2;
        this.crossAxisMin = i3;
        this.crossAxisMax = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private OrientationIndependentConstraints(long r5, androidx.compose.foundation.layout.LayoutOrientation r7) {
        /*
            r4 = this;
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Horizontal
            if (r7 != r0) goto L9
            int r1 = androidx.compose.p015ui.unit.Constraints.m109692getMinWidthimpl(r5)
            goto Ld
        L9:
            int r1 = androidx.compose.p015ui.unit.Constraints.m109691getMinHeightimpl(r5)
        Ld:
            if (r7 != r0) goto L14
            int r2 = androidx.compose.p015ui.unit.Constraints.m109690getMaxWidthimpl(r5)
            goto L18
        L14:
            int r2 = androidx.compose.p015ui.unit.Constraints.m109689getMaxHeightimpl(r5)
        L18:
            if (r7 != r0) goto L1f
            int r3 = androidx.compose.p015ui.unit.Constraints.m109691getMinHeightimpl(r5)
            goto L23
        L1f:
            int r3 = androidx.compose.p015ui.unit.Constraints.m109692getMinWidthimpl(r5)
        L23:
            if (r7 != r0) goto L2a
            int r5 = androidx.compose.p015ui.unit.Constraints.m109689getMaxHeightimpl(r5)
            goto L2e
        L2a:
            int r5 = androidx.compose.p015ui.unit.Constraints.m109690getMaxWidthimpl(r5)
        L2e:
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.OrientationIndependentConstraints.<init>(long, androidx.compose.foundation.layout.LayoutOrientation):void");
    }
}
