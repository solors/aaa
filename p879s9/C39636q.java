package p879s9;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Views.kt */
@Metadata
/* renamed from: s9.q */
/* loaded from: classes8.dex */
public final class C39636q {
    /* renamed from: b */
    public static final View m12017b(View view) {
        View view2 = null;
        while (view != null) {
            if (!m12015d(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return view2;
    }

    @NotNull
    /* renamed from: c */
    public static final C37629d m12016c(@NotNull View view, int i, int i2) {
        PrimitiveRanges m16900v;
        C37629d m16904r;
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i3 = i2 + i;
        if (m12013f(view)) {
            m16904r = _Ranges.m16904r(i3 - 1, i);
            return m16904r;
        }
        m16900v = _Ranges.m16900v(i, i3);
        return m16900v;
    }

    /* renamed from: d */
    public static final boolean m12015d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getWidth() <= 0 && view.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m12014e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (m12017b(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m12013f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final void m12012g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
    }
}
