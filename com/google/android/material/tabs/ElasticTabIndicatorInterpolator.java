package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    /* renamed from: e */
    private static float m70830e(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m70829f(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    /* renamed from: d */
    public void mo70825d(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        boolean z;
        float m70829f;
        float m70830e;
        RectF m70828a = TabIndicatorInterpolator.m70828a(tabLayout, view);
        RectF m70828a2 = TabIndicatorInterpolator.m70828a(tabLayout, view2);
        if (m70828a.left < m70828a2.left) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m70829f = m70830e(f);
            m70830e = m70829f(f);
        } else {
            m70829f = m70829f(f);
            m70830e = m70830e(f);
        }
        drawable.setBounds(AnimationUtils.lerp((int) m70828a.left, (int) m70828a2.left, m70829f), drawable.getBounds().top, AnimationUtils.lerp((int) m70828a.right, (int) m70828a2.right, m70830e), drawable.getBounds().bottom);
    }
}
