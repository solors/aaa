package com.p551my.target.nativeads.views;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* renamed from: com.my.target.nativeads.views.PromoCardSnapHelper */
/* loaded from: classes7.dex */
public final class PromoCardSnapHelper extends SnapHelper {
    @NonNull
    private final CardRecyclerScrollState cardRecyclerScrollState;
    final int cardSpacing;
    @Nullable
    private OrientationHelper horizontalHelper;

    /* renamed from: com.my.target.nativeads.views.PromoCardSnapHelper$CardRecyclerScrollState */
    /* loaded from: classes7.dex */
    public interface CardRecyclerScrollState {
        boolean isReachedEnd();

        boolean isReachedStart();
    }

    public PromoCardSnapHelper(int i, @NonNull CardRecyclerScrollState cardRecyclerScrollState) {
        this.cardSpacing = i;
        this.cardRecyclerScrollState = cardRecyclerScrollState;
    }

    private int distanceToCenter(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, @NonNull OrientationHelper orientationHelper) {
        int decoratedStart = (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
        if (layoutManager.getPosition(view) == 0) {
            return decoratedStart - (this.cardSpacing / 2);
        }
        if (layoutManager.getItemCount() - 1 == layoutManager.getPosition(view)) {
            return decoratedStart + (this.cardSpacing / 2);
        }
        return decoratedStart;
    }

    @NonNull
    private OrientationHelper getHorizontalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.horizontalHelper;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.horizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.horizontalHelper;
    }

    private boolean isForwardFling(@NonNull RecyclerView.LayoutManager layoutManager, int i, int i2) {
        if (layoutManager.canScrollHorizontally()) {
            if (i > 0) {
                return true;
            }
            return false;
        } else if (i2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, view, getHorizontalHelper(layoutManager));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(@NonNull RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (this.cardRecyclerScrollState.isReachedStart()) {
            return layoutManager.getChildAt(0);
        }
        if (this.cardRecyclerScrollState.isReachedEnd()) {
            return layoutManager.getChildAt(childCount - 1);
        }
        OrientationHelper horizontalHelper = getHorizontalHelper(layoutManager);
        int startAfterPadding = horizontalHelper.getStartAfterPadding() + (horizontalHelper.getTotalSpace() / 2) + 1;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((horizontalHelper.getDecoratedStart(childAt) + (horizontalHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(@NonNull RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int i3;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        OrientationHelper horizontalHelper = getHorizontalHelper(layoutManager);
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = layoutManager.getChildAt(i6);
            if (childAt != null) {
                int distanceToCenter = distanceToCenter(layoutManager, childAt, horizontalHelper);
                if (distanceToCenter <= 0 && distanceToCenter > i5) {
                    view2 = childAt;
                    i5 = distanceToCenter;
                }
                if (distanceToCenter >= 0 && distanceToCenter < i4) {
                    view = childAt;
                    i4 = distanceToCenter;
                }
            }
        }
        boolean isForwardFling = isForwardFling(layoutManager, i, i2);
        if (isForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (!isForwardFling) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = position + i3;
        if (i7 < 0 || i7 >= itemCount) {
            return -1;
        }
        return i7;
    }
}
