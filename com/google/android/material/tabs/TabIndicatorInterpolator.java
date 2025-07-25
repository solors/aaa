package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class TabIndicatorInterpolator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static RectF m70828a(TabLayout tabLayout, @Nullable View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.isTabIndicatorFullWidth() && (view instanceof TabLayout.TabView)) {
            return m70827b((TabLayout.TabView) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    static RectF m70827b(@NonNull TabLayout.TabView tabView, @Dimension(unit = 0) int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int dpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i);
        if (contentWidth < dpToPx) {
            contentWidth = dpToPx;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m70826c(TabLayout tabLayout, View view, @NonNull Drawable drawable) {
        RectF m70828a = m70828a(tabLayout, view);
        drawable.setBounds((int) m70828a.left, drawable.getBounds().top, (int) m70828a.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo70825d(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f, @NonNull Drawable drawable) {
        RectF m70828a = m70828a(tabLayout, view);
        RectF m70828a2 = m70828a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) m70828a.left, (int) m70828a2.left, f), drawable.getBounds().top, AnimationUtils.lerp((int) m70828a.right, (int) m70828a2.right, f), drawable.getBounds().bottom);
    }
}
