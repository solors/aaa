package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyMeasuredItem.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    @NotNull
    private final Object key;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final int offset;
    @NotNull
    private final LazyListItemPlacementAnimator placementAnimator;
    private final int size;
    private final int sizeWithSpacings;
    private final long visualOffset;
    @NotNull
    private final List<LazyListPlaceableWrapper> wrappers;

    public /* synthetic */ LazyListPositionedItem(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, obj, i3, i4, i5, i6, z, list, lazyListItemPlacementAnimator, j);
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int i) {
        Object parentData = this.wrappers.get(i).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int i) {
        return getMainAxisSize(this.wrappers.get(i).getPlaceable());
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* renamed from: getOffset-Bjo55l4  reason: not valid java name */
    public final long m106440getOffsetBjo55l4(int i) {
        return this.wrappers.get(i).m106439getOffsetnOccac();
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        long m106440getOffsetBjo55l4;
        Intrinsics.checkNotNullParameter(scope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Placeable placeable = this.wrappers.get(i).getPlaceable();
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            if (getAnimationSpec(i) != null) {
                m106440getOffsetBjo55l4 = this.placementAnimator.m106433getAnimatedOffsetYT5a7pE(getKey(), i, mainAxisSize, i2, m106440getOffsetBjo55l4(i));
            } else {
                m106440getOffsetBjo55l4 = m106440getOffsetBjo55l4(i);
            }
            if (this.isVertical) {
                long j = this.visualOffset;
                Placeable.PlacementScope.m109065placeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(m106440getOffsetBjo55l4) + IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(m106440getOffsetBjo55l4) + IntOffset.m109853getYimpl(j)), 0.0f, null, 6, null);
            } else {
                long j2 = this.visualOffset;
                Placeable.PlacementScope.m109064placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(m106440getOffsetBjo55l4) + IntOffset.m109852getXimpl(j2), IntOffset.m109853getYimpl(m106440getOffsetBjo55l4) + IntOffset.m109853getYimpl(j2)), 0.0f, null, 6, null);
            }
        }
    }

    private LazyListPositionedItem(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List<LazyListPlaceableWrapper> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
        this.offset = i;
        this.index = i2;
        this.key = obj;
        this.size = i3;
        this.sizeWithSpacings = i4;
        this.minMainAxisOffset = i5;
        this.maxMainAxisOffset = i6;
        this.isVertical = z;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j;
        int placeablesCount = getPlaceablesCount();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= placeablesCount) {
                break;
            } else if (getAnimationSpec(i7) != null) {
                z2 = true;
                break;
            } else {
                i7++;
            }
        }
        this.hasAnimations = z2;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
