package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyMeasuredItem.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final int column;
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    @NotNull
    private final Object key;
    private final int lineMainAxisSize;
    private final int mainAxisSpacing;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final long offset;
    private final long placeableOffset;
    @NotNull
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final int row;
    private final long size;
    private final long visualOffset;
    @NotNull
    private final List<LazyGridPlaceableWrapper> wrappers;

    public /* synthetic */ LazyGridPositionedItem(long j, long j2, int i, Object obj, int i2, int i3, long j3, int i4, int i5, int i6, int i7, boolean z, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, obj, i2, i3, j3, i4, i5, i6, i7, z, list, lazyGridItemPlacementAnimator, j4);
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m106496getMainAxisgyyYBs(long j) {
        if (this.isVertical) {
            return IntOffset.m109853getYimpl(j);
        }
        return IntOffset.m109852getXimpl(j);
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int i) {
        Object parentData = this.wrappers.get(i).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final int getCrossAxisOffset() {
        if (this.isVertical) {
            return IntOffset.m109852getXimpl(mo106483getOffsetnOccac());
        }
        return IntOffset.m109853getYimpl(mo106483getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        if (this.isVertical) {
            return IntSize.m109894getWidthimpl(mo106484getSizeYbymL2g());
        }
        return IntSize.m109893getHeightimpl(mo106484getSizeYbymL2g());
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    public final int getLineMainAxisSize() {
        return this.lineMainAxisSize;
    }

    public final int getLineMainAxisSizeWithSpacings() {
        return this.mainAxisSpacing + this.lineMainAxisSize;
    }

    public final int getMainAxisSize(int i) {
        return getMainAxisSize(this.wrappers.get(i).getPlaceable());
    }

    public final int getMainAxisSizeWithSpacings() {
        int m109894getWidthimpl;
        int i = this.mainAxisSpacing;
        if (this.isVertical) {
            m109894getWidthimpl = IntSize.m109893getHeightimpl(mo106484getSizeYbymL2g());
        } else {
            m109894getWidthimpl = IntSize.m109894getWidthimpl(mo106484getSizeYbymL2g());
        }
        return i + m109894getWidthimpl;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo106483getOffsetnOccac() {
        return this.offset;
    }

    /* renamed from: getPlaceableOffset-nOcc-ac  reason: not valid java name */
    public final long m106497getPlaceableOffsetnOccac() {
        return this.placeableOffset;
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo106484getSizeYbymL2g() {
        return this.size;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        long j;
        Intrinsics.checkNotNullParameter(scope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Placeable placeable = this.wrappers.get(i).getPlaceable();
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            if (getAnimationSpec(i) != null) {
                j = this.placementAnimator.m106488getAnimatedOffsetYT5a7pE(getKey(), i, mainAxisSize, i2, this.placeableOffset);
            } else {
                j = this.placeableOffset;
            }
            if (m106496getMainAxisgyyYBs(j) > mainAxisSize && m106496getMainAxisgyyYBs(j) < i2) {
                if (this.isVertical) {
                    long j2 = this.visualOffset;
                    Placeable.PlacementScope.m109065placeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(j2), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(j2)), 0.0f, null, 6, null);
                } else {
                    long j3 = this.visualOffset;
                    Placeable.PlacementScope.m109064placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(j3), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(j3)), 0.0f, null, 6, null);
                }
            }
        }
    }

    private LazyGridPositionedItem(long j, long j2, int i, Object obj, int i2, int i3, long j3, int i4, int i5, int i6, int i7, boolean z, List<LazyGridPlaceableWrapper> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j4) {
        this.offset = j;
        this.placeableOffset = j2;
        this.index = i;
        this.key = obj;
        this.row = i2;
        this.column = i3;
        this.size = j3;
        this.lineMainAxisSize = i4;
        this.mainAxisSpacing = i5;
        this.minMainAxisOffset = i6;
        this.maxMainAxisOffset = i7;
        this.isVertical = z;
        this.wrappers = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j4;
        int placeablesCount = getPlaceablesCount();
        boolean z2 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= placeablesCount) {
                break;
            } else if (getAnimationSpec(i8) != null) {
                z2 = true;
                break;
            } else {
                i8++;
            }
        }
        this.hasAnimations = z2;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
