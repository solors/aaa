package p1059ya;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1072z8.C45190f;

@Metadata
/* renamed from: ya.r */
/* loaded from: classes8.dex */
public final class ViewGroups {
    @NotNull

    /* renamed from: a */
    private static final int[] f118566a = {C45190f.div_gallery};

    /* renamed from: a */
    private static final boolean m970a(RecyclerView recyclerView, int i) {
        if (i < 0) {
            return true;
        }
        if (i != 4) {
            if (i == 8 && recyclerView.computeHorizontalScrollExtent() + recyclerView.computeHorizontalScrollOffset() < recyclerView.computeHorizontalScrollRange()) {
                return true;
            }
            return false;
        } else if (recyclerView.computeHorizontalScrollOffset() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private static final boolean m969b(ViewPager viewPager, int i) {
        if (i < 0) {
            return true;
        }
        if (i != 4) {
            if (i != 8) {
                return false;
            }
            return viewPager.canScrollHorizontally(1);
        }
        return viewPager.canScrollHorizontally(-1);
    }

    /* renamed from: c */
    public static final boolean m968c(@NotNull ViewGroup viewGroup, @NotNull MotionEvent event) {
        int i;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        if (event.getHistorySize() < 1) {
            i = -1;
        } else if (event.getHistoricalX(0) < event.getX()) {
            i = 4;
        } else {
            i = 8;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getId() == C45190f.div_tabs_block && C45081s.m963c(childAt, rawX, rawY)) {
                View m964b = C45081s.m964b(childAt, C45190f.div_tabs_pager_container);
                Intrinsics.m17073h(m964b, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
                if (m966e((ViewPager) m964b, rawX, rawY, i)) {
                    return true;
                }
            }
            if ((childAt instanceof RecyclerView) && m967d((RecyclerView) childAt, rawX, rawY, i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static final boolean m967d(RecyclerView recyclerView, float f, float f2, int i) {
        if (C45081s.m963c(recyclerView, f, f2) && m970a(recyclerView, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static final boolean m966e(ViewPager viewPager, float f, float f2, int i) {
        if (m969b(viewPager, i)) {
            return true;
        }
        int length = f118566a.length;
        for (int i2 = 0; i2 < length; i2++) {
            RecyclerView recyclerView = (RecyclerView) C45081s.m965a(viewPager, f118566a[i2]);
            if (recyclerView != null && m967d(recyclerView, f, f2, i)) {
                return true;
            }
        }
        return false;
    }
}
