package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class FadeTabIndicatorInterpolator extends TabIndicatorInterpolator {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    /* renamed from: d */
    public void mo70825d(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float lerp;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF m70828a = TabIndicatorInterpolator.m70828a(tabLayout, view);
        if (i < 0) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            lerp = AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) m70828a.left, drawable.getBounds().top, (int) m70828a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (lerp * 255.0f));
    }
}
