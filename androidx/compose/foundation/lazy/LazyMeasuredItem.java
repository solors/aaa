package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyMeasuredItem.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    @Nullable
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    @NotNull
    private final Object key;
    @NotNull
    private final LayoutDirection layoutDirection;
    @NotNull
    private final Placeable[] placeables;
    @NotNull
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;
    @Nullable
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    @ExperimentalFoundationApi
    public /* synthetic */ LazyMeasuredItem(int i, Placeable[] placeableArr, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, placeableArr, z, horizontal, vertical, layoutDirection, z2, i2, i3, lazyListItemPlacementAnimator, i4, j, obj);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    @NotNull
    public final LazyListPositionedItem position(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int size;
        long IntOffset;
        int width;
        ArrayList arrayList = new ArrayList();
        if (this.isVertical) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        boolean z = this.reverseLayout;
        if (z) {
            i5 = (i4 - i) - this.size;
        } else {
            i5 = i;
        }
        if (z) {
            i6 = _Arrays.m17325a0(this.placeables);
        } else {
            i6 = 0;
        }
        while (true) {
            boolean z2 = this.reverseLayout;
            boolean z3 = true;
            if (!z2 ? i6 >= this.placeables.length : i6 < 0) {
                z3 = false;
            }
            if (z3) {
                Placeable placeable = this.placeables[i6];
                if (z2) {
                    size = 0;
                } else {
                    size = arrayList.size();
                }
                if (this.isVertical) {
                    Alignment.Horizontal horizontal = this.horizontalAlignment;
                    if (horizontal != null) {
                        IntOffset = IntOffsetKt.IntOffset(horizontal.align(placeable.getWidth(), i2, this.layoutDirection), i5);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    Alignment.Vertical vertical = this.verticalAlignment;
                    if (vertical != null) {
                        IntOffset = IntOffsetKt.IntOffset(i5, vertical.align(placeable.getHeight(), i3));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                long j = IntOffset;
                if (this.isVertical) {
                    width = placeable.getHeight();
                } else {
                    width = placeable.getWidth();
                }
                i5 += width;
                arrayList.add(size, new LazyListPlaceableWrapper(j, placeable, this.placeables[i6].getParentData(), null));
                if (this.reverseLayout) {
                    i6--;
                } else {
                    i6++;
                }
            } else {
                int i9 = this.index;
                Object obj = this.key;
                int i10 = this.size;
                int i11 = this.sizeWithSpacings;
                if (!z2) {
                    i7 = this.beforeContentPadding;
                } else {
                    i7 = this.afterContentPadding;
                }
                int i12 = -i7;
                if (!z2) {
                    i8 = this.afterContentPadding;
                } else {
                    i8 = this.beforeContentPadding;
                }
                return new LazyListPositionedItem(i, i9, obj, i10, i11, i12, i4 + i8, this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
            }
        }
    }

    private LazyMeasuredItem(int i, Placeable[] placeableArr, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj) {
        this.index = i;
        this.placeables = placeableArr;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        int i5 = 0;
        int i6 = 0;
        for (Placeable placeable : placeableArr) {
            i5 += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            i6 = Math.max(i6, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = i5;
        this.sizeWithSpacings = i5 + this.spacing;
        this.crossAxisSize = i6;
    }
}
