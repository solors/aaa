package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyMeasuredItem.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    @NotNull
    private final Object key;
    @NotNull
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    @NotNull
    private final Placeable[] placeables;
    @NotNull
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final long visualOffset;

    public /* synthetic */ LazyMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, Placeable[] placeableArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, placeableArr, lazyGridItemPlacementAnimator, j);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: getIndex-VZbfaAc  reason: not valid java name */
    public final int m106508getIndexVZbfaAc() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @NotNull
    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    @NotNull
    public final LazyGridPositionedItem position(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        long IntOffset;
        int i12;
        long IntOffset2;
        long IntSize;
        int i13;
        int i14;
        int size;
        ArrayList arrayList = new ArrayList();
        boolean z = this.isVertical;
        if (z) {
            i8 = i4;
        } else {
            i8 = i3;
        }
        if (this.reverseLayout) {
            i9 = (i8 - i) - this.mainAxisSize;
        } else {
            i9 = i;
        }
        if (z) {
            i10 = i3;
        } else {
            i10 = i4;
        }
        if (z && this.layoutDirection == LayoutDirection.Rtl) {
            i11 = (i10 - i2) - this.crossAxisSize;
        } else {
            i11 = i2;
        }
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(i11, i9);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i9, i11);
        }
        if (this.reverseLayout) {
            i12 = _Arrays.m17325a0(this.placeables);
        } else {
            i12 = 0;
        }
        while (true) {
            boolean z2 = this.reverseLayout;
            boolean z3 = true;
            if (!z2 ? i12 >= this.placeables.length : i12 < 0) {
                z3 = false;
            }
            if (!z3) {
                break;
            }
            Placeable placeable = this.placeables[i12];
            if (z2) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            arrayList.add(size, new LazyGridPlaceableWrapper(IntOffset, placeable, this.placeables[i12].getParentData(), null));
            if (this.reverseLayout) {
                i12--;
            } else {
                i12++;
            }
        }
        if (this.isVertical) {
            IntOffset2 = IntOffsetKt.IntOffset(i2, i);
        } else {
            IntOffset2 = IntOffsetKt.IntOffset(i, i2);
        }
        long j = IntOffset2;
        int i15 = this.index;
        Object obj = this.key;
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, this.mainAxisSize);
        } else {
            IntSize = IntSizeKt.IntSize(this.mainAxisSize, this.crossAxisSize);
        }
        long j2 = IntSize;
        int i16 = this.mainAxisSpacing;
        boolean z4 = this.reverseLayout;
        if (!z4) {
            i13 = this.beforeContentPadding;
        } else {
            i13 = this.afterContentPadding;
        }
        int i17 = -i13;
        if (!z4) {
            i14 = this.afterContentPadding;
        } else {
            i14 = this.beforeContentPadding;
        }
        return new LazyGridPositionedItem(j, IntOffset, i15, obj, i5, i6, j2, i7, i16, i17, i8 + i14, this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
    }

    private LazyMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, Placeable[] placeableArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.mainAxisSpacing = i3;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = placeableArr;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j;
        int i6 = 0;
        for (Placeable placeable : placeableArr) {
            i6 = Math.max(i6, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i6;
        this.mainAxisSizeWithSpacings = i6 + this.mainAxisSpacing;
    }
}
