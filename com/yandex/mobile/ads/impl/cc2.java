package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import be.MathJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cc2 {
    @NotNull

    /* renamed from: a */
    private static final nc2 f77596a = new nc2(new ub1(), new oc2());

    /* renamed from: b */
    public static final /* synthetic */ int f77597b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.cc2$a */
    /* loaded from: classes8.dex */
    public static final class ViewTreeObserver$OnPreDrawListenerC30085a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver.OnPreDrawListener f77598a;

        /* renamed from: b */
        final /* synthetic */ View f77599b;

        ViewTreeObserver$OnPreDrawListenerC30085a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.f77598a = onPreDrawListener;
            this.f77599b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f77598a.onPreDraw();
            this.f77599b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: a */
    public static final int m35263a(int i, float f) {
        int m16912j;
        int m16917e;
        m16912j = _Ranges.m16912j(255, (int) ((255 * (100 - f)) / 100.0f));
        m16917e = _Ranges.m16917e(0, m16912j);
        return Color.argb(m16917e, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: b */
    public static final int m35253b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.isShown()) {
            return f77596a.m31598a(view);
        }
        return 0;
    }

    /* renamed from: c */
    public static final boolean m35251c(@Nullable View view) {
        boolean z = false;
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
            Rect rect2 = new Rect();
            try {
                view.getWindowVisibleDisplayFrame(rect2);
            } catch (NullPointerException unused) {
            }
            boolean z2 = rect.bottom <= rect2.top || rect.top >= rect2.bottom;
            boolean z3 = rect.right <= rect2.left || rect.left >= rect2.right;
            if (z2 || z3) {
                z = true;
            }
            return !z;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m35250d(@NotNull View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!view.isShown()) {
            return true;
        }
        if (view.getAlpha() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m35249e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        if (background != null && background.getAlpha() != 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m35260a(@NotNull Context context, int i) {
        int m103791d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d = MathJVM.m103791d(i / context.getResources().getDisplayMetrics().density);
        return m103791d;
    }

    /* renamed from: b */
    public static final int m35254b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (((context.getResources().getDisplayMetrics().heightPixels + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static final void m35256a(@NotNull View view, @NotNull ViewTreeObserver.OnPreDrawListener callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC30085a(view, callback));
    }

    /* renamed from: a */
    public static final int m35261a(@NotNull Context context, float f) {
        int m103791d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d = MathJVM.m103791d(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
        return m103791d;
    }

    /* renamed from: c */
    public static final int m35252c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (((context.getResources().getDisplayMetrics().widthPixels + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static final int m35258a(@Nullable View view) {
        int m35253b;
        if (view == null || !view.isShown() || (m35253b = m35253b(view)) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (m35253b * 100) / (height * width);
    }

    /* renamed from: a */
    public static final boolean m35257a(@Nullable View view, int i) {
        return m35258a(view) >= i;
    }

    /* renamed from: a */
    public static final void m35255a(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    Intrinsics.m17073h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static final int m35262a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: a */
    public static final int m35259a(@NotNull Context context, @NotNull nb1 requestedOrientation) {
        nb1 nb1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestedOrientation, "requestedOrientation");
        nb1 m35177a = C30114cr.m35177a(context);
        if (m35177a != requestedOrientation && m35177a != (nb1Var = nb1.f82660e) && (requestedOrientation != nb1Var || m35177a == nb1.f82658c)) {
            return m35252c(context);
        }
        return m35254b(context);
    }
}
