package com.p551my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.x1 */
/* loaded from: classes7.dex */
public class C26206x1 extends LinearSnapHelper {

    /* renamed from: b */
    public int f68187b;

    /* renamed from: g */
    public OrientationHelper f68192g;

    /* renamed from: h */
    public OrientationHelper f68193h;

    /* renamed from: i */
    public RecyclerView f68194i;

    /* renamed from: c */
    public final boolean f68188c = false;

    /* renamed from: d */
    public final float f68189d = 60.0f;

    /* renamed from: e */
    public final int f68190e = -1;

    /* renamed from: f */
    public final float f68191f = -1.0f;

    /* renamed from: a */
    public final DecelerateInterpolator f68186a = new DecelerateInterpolator(1.7f);

    /* renamed from: com.my.target.x1$a */
    /* loaded from: classes7.dex */
    public class C26207a extends LinearSmoothScroller {
        public C26207a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 60.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForDeceleration(int i) {
            return (int) Math.ceil(calculateTimeForScrolling(i) / 0.3d);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            RecyclerView recyclerView = C26206x1.this.f68194i;
            if (recyclerView != null && recyclerView.getLayoutManager() != null) {
                C26206x1 c26206x1 = C26206x1.this;
                int[] calculateDistanceToFinalSnap = c26206x1.calculateDistanceToFinalSnap(c26206x1.f68194i.getLayoutManager(), view);
                int i = calculateDistanceToFinalSnap[0];
                int i2 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    action.update(i, i2, calculateTimeForDeceleration, C26206x1.this.f68186a);
                }
            }
        }
    }

    public C26206x1(int i) {
        this.f68187b = i;
    }

    /* renamed from: a */
    public final View m42541a(RecyclerView.LayoutManager layoutManager, boolean z) {
        OrientationHelper verticalHelper;
        OrientationHelper verticalHelper2;
        int i = this.f68187b;
        if (i != 17) {
            if (i != 48) {
                if (i == 80) {
                    verticalHelper2 = getVerticalHelper(layoutManager);
                } else if (i == 8388611) {
                    verticalHelper = getHorizontalHelper(layoutManager);
                } else if (i != 8388613) {
                    return null;
                } else {
                    verticalHelper2 = getHorizontalHelper(layoutManager);
                }
                return m42542a(layoutManager, verticalHelper2, GravityCompat.END, z);
            }
            verticalHelper = getVerticalHelper(layoutManager);
            return m42542a(layoutManager, verticalHelper, GravityCompat.START, z);
        }
        return m42542a(layoutManager, getHorizontalHelper(layoutManager), 17, z);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            this.f68194i = recyclerView;
        } else {
            this.f68194i = null;
        }
        try {
            super.attachToRecyclerView(recyclerView);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final int m42538b(View view, OrientationHelper orientationHelper) {
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return decoratedStart >= orientationHelper.getStartAfterPadding() / 2 ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int i = this.f68187b;
        if (i == 17) {
            return super.calculateDistanceToFinalSnap(layoutManager, view);
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        OrientationHelper horizontalHelper = getHorizontalHelper((LinearLayoutManager) layoutManager);
        if (i == 8388611) {
            iArr[0] = m42538b(view, horizontalHelper);
        } else {
            iArr[0] = m42544a(view, horizontalHelper);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateScrollDistance(int i, int i2) {
        return super.calculateScrollDistance(i, i2);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (recyclerView = this.f68194i) != null) {
            return new C26207a(recyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return m42541a(layoutManager, true);
    }

    public final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f68193h;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f68193h = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f68193h;
    }

    public final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f68192g;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f68192g = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f68192g;
    }

    /* renamed from: a */
    public final View m42542a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, boolean z) {
        View view = null;
        if (layoutManager.getChildCount() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (z && m42543a(linearLayoutManager)) {
                return null;
            }
            int startAfterPadding = layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2;
            boolean z2 = i == 8388611;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
                View childAt = linearLayoutManager.getChildAt(i3);
                int decoratedStart = orientationHelper.getDecoratedStart(childAt);
                if (!z2) {
                    decoratedStart = (decoratedStart + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding;
                }
                int abs = Math.abs(decoratedStart);
                if (abs < i2) {
                    view = childAt;
                    i2 = abs;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    public void m42539b(int i) {
        RecyclerView recyclerView;
        RecyclerView.SmoothScroller createScroller;
        if (i == -1 || (recyclerView = this.f68194i) == null || recyclerView.getLayoutManager() == null || (createScroller = createScroller(this.f68194i.getLayoutManager())) == null) {
            return;
        }
        createScroller.setTargetPosition(i);
        this.f68194i.getLayoutManager().startSmoothScroll(createScroller);
    }

    /* renamed from: a */
    public final int m42544a(View view, OrientationHelper orientationHelper) {
        int decoratedEnd = orientationHelper.getDecoratedEnd(view);
        return decoratedEnd >= orientationHelper.getEnd() - ((orientationHelper.getEnd() - orientationHelper.getEndAfterPadding()) / 2) ? orientationHelper.getDecoratedEnd(view) - orientationHelper.getEnd() : decoratedEnd - orientationHelper.getEndAfterPadding();
    }

    /* renamed from: a */
    public final boolean m42543a(LinearLayoutManager linearLayoutManager) {
        return ((linearLayoutManager.getReverseLayout() || this.f68187b != 8388611) && !(linearLayoutManager.getReverseLayout() && this.f68187b == 8388613) && ((linearLayoutManager.getReverseLayout() || this.f68187b != 48) && !(linearLayoutManager.getReverseLayout() && this.f68187b == 80))) ? this.f68187b == 17 ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 : linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }

    /* renamed from: a */
    public void m42546a(int i) {
        m42545a(i, Boolean.TRUE);
    }

    /* renamed from: a */
    public void m42545a(int i, Boolean bool) {
        if (this.f68187b != i) {
            this.f68187b = i;
            m42540a(bool);
        }
    }

    /* renamed from: a */
    public final void m42540a(Boolean bool) {
        RecyclerView.LayoutManager layoutManager;
        View m42541a;
        RecyclerView recyclerView = this.f68194i;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (m42541a = m42541a((layoutManager = this.f68194i.getLayoutManager()), false)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, m42541a);
        if (bool.booleanValue()) {
            this.f68194i.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
        } else {
            this.f68194i.scrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
        }
    }
}
