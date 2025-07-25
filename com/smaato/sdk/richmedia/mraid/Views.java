package com.smaato.sdk.richmedia.mraid;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class Views {

    /* loaded from: classes7.dex */
    public static final class ViewVisibilityContext {
        public final float visibilityPercent;
        @NonNull
        public final Rect visibleRect;

        /* synthetic */ ViewVisibilityContext(float f, Rect rect, ViewTreeObserver$OnPreDrawListenerC27512a viewTreeObserver$OnPreDrawListenerC27512a) {
            this(f, rect);
        }

        private ViewVisibilityContext(float f, @NonNull Rect rect) {
            this.visibilityPercent = f;
            this.visibleRect = rect;
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.mraid.Views$a */
    /* loaded from: classes7.dex */
    class ViewTreeObserver$OnPreDrawListenerC27512a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ View f72265b;

        /* renamed from: c */
        final /* synthetic */ Runnable f72266c;

        ViewTreeObserver$OnPreDrawListenerC27512a(View view, Runnable runnable) {
            this.f72265b = view;
            this.f72266c = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f72265b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f72266c.run();
            return true;
        }
    }

    private Views() {
    }

    public static void addOnPreDrawListener(@NonNull View view, @NonNull Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27512a(view, runnable));
    }

    @NonNull
    private static Rect getGlobalVisibleRect(@NonNull View view) {
        if (!isViewVisible(view)) {
            return new Rect();
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return new Rect();
        }
        return rect;
    }

    private static float getVisiblePercent(@NonNull View view, float f) {
        if (!isViewVisible(view)) {
            return 0.0f;
        }
        return (f / (view.getWidth() * view.getHeight())) * 100.0f;
    }

    @NonNull
    private static Rect getVisibleRectRelativeToView(@NonNull View view) {
        Rect positionOnScreenOf = positionOnScreenOf(view);
        Rect globalVisibleRect = getGlobalVisibleRect(view);
        if (globalVisibleRect.isEmpty()) {
            return new Rect();
        }
        globalVisibleRect.offset(-positionOnScreenOf.left, -positionOnScreenOf.top);
        return globalVisibleRect;
    }

    private static boolean isViewVisible(@NonNull View view) {
        if (!view.hasWindowFocus() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        return view.isShown();
    }

    public static boolean isViewable(float f) {
        if (f > 0.0f) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Rect positionOnScreenOf(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    @NonNull
    public static ViewVisibilityContext visibilityContextRelativeToView(@NonNull View view) {
        Rect visibleRectRelativeToView = getVisibleRectRelativeToView(view);
        return new ViewVisibilityContext(getVisiblePercent(view, visibleRectRelativeToView.width() * visibleRectRelativeToView.height()), visibleRectRelativeToView, null);
    }
}
