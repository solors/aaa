package com.mobilefuse.sdk.p542ad.rendering.omniad.view;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: ViewRenderingPixels.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.view.ViewRenderingPixels */
/* loaded from: classes7.dex */
public final class ViewRenderingPixels {
    private final ViewGroup androidContentView;
    private final View bottomPixel;
    private final ViewGroup rootView;
    private final View topPixel;

    public ViewRenderingPixels(@NotNull Activity activity) {
        View view;
        View decorView;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.topPixel = new View(activity);
        this.bottomPixel = new View(activity);
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            view = decorView.getRootView();
        } else {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) (view instanceof ViewGroup ? view : null);
        this.rootView = viewGroup;
        this.androidContentView = viewGroup != null ? (ViewGroup) viewGroup.findViewById(16908290) : null;
    }

    public final void addPixels() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewGroup viewGroup = this.rootView;
            if (viewGroup == null) {
                return;
            }
            this.topPixel.setBackgroundColor(11141120);
            viewGroup.addView(this.topPixel, new RelativeLayout.LayoutParams(1, 1));
            this.bottomPixel.setBackgroundColor(11141120);
            viewGroup.addView(this.bottomPixel, new RelativeLayout.LayoutParams(1, 1));
            invalidateLayout();
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final void invalidateLayout() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewGroup viewGroup = this.androidContentView;
            if (viewGroup == null) {
                return;
            }
            Rect rect = new Rect();
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            viewGroup.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
            this.topPixel.setY(0.0f);
            this.bottomPixel.setX(rect.right - 1);
            this.bottomPixel.setY(rect.bottom - 1);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final void removePixels() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewParent parent = this.topPixel.getParent();
            ViewParent viewParent = null;
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(this.topPixel);
            }
            ViewParent parent2 = this.bottomPixel.getParent();
            if (parent2 instanceof ViewGroup) {
                viewParent = parent2;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.bottomPixel);
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }
}
