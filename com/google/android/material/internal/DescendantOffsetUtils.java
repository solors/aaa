package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class DescendantOffsetUtils {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f37748a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f37749b = new ThreadLocal<>();

    /* renamed from: a */
    private static void m71317a(ViewParent viewParent, @NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m71317a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    public static void getDescendantRect(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRect(viewGroup, view, rect);
    }

    public static void offsetDescendantRect(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        ThreadLocal<Matrix> threadLocal = f37748a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m71317a(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f37749b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
