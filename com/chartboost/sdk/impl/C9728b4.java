package com.chartboost.sdk.impl;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.chartboost.sdk.impl.b4 */
/* loaded from: classes3.dex */
public final class C9728b4 {

    /* renamed from: a */
    public final WindowManager f21674a;

    /* renamed from: b */
    public final DisplayMetrics f21675b;

    /* renamed from: c */
    public final Functions f21676c;

    /* renamed from: d */
    public final DisplayMetrics f21677d;

    /* renamed from: e */
    public final float f21678e;

    /* renamed from: f */
    public final int f21679f;

    /* renamed from: com.chartboost.sdk.impl.b4$a */
    /* loaded from: classes3.dex */
    public static final class C9729a extends Lambda implements Functions {

        /* renamed from: b */
        public static final C9729a f21680b = new C9729a();

        public C9729a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public C9728b4(WindowManager windowManager, DisplayMetrics displayMetrics, Functions androidVersion, DisplayMetrics realDisplayMetrics) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(realDisplayMetrics, "realDisplayMetrics");
        this.f21674a = windowManager;
        this.f21675b = displayMetrics;
        this.f21676c = androidVersion;
        this.f21677d = realDisplayMetrics;
        this.f21678e = displayMetrics.density;
        this.f21679f = displayMetrics.densityDpi;
    }

    /* renamed from: a */
    public final C9760c4 m82026a(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "getWindowInsets(...)");
        navigationBars = WindowInsets.Type.navigationBars();
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        i = insetsIgnoringVisibility.right;
        i2 = insetsIgnoringVisibility.left;
        int i5 = i + i2;
        i3 = insetsIgnoringVisibility.top;
        i4 = insetsIgnoringVisibility.bottom;
        bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return new C9760c4(bounds.width() - i5, bounds.height() - (i3 + i4));
    }

    /* renamed from: b */
    public final float m82025b() {
        return this.f21678e;
    }

    /* renamed from: c */
    public final int m82024c() {
        return this.f21679f;
    }

    /* renamed from: d */
    public final C9760c4 m82023d() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        try {
            if (((Number) this.f21676c.invoke()).intValue() >= 30) {
                currentWindowMetrics = this.f21674a.getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                return new C9760c4(bounds.width(), bounds.height());
            }
            this.f21677d.setTo(this.f21675b);
            Display defaultDisplay = this.f21674a.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(this.f21677d);
            }
            DisplayMetrics displayMetrics = this.f21677d;
            return new C9760c4(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e) {
            C9763c7.m81920b("Cannot create size", e);
            return new C9760c4(0, 0);
        }
    }

    public /* synthetic */ C9728b4(WindowManager windowManager, DisplayMetrics displayMetrics, Functions functions, DisplayMetrics displayMetrics2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowManager, displayMetrics, (i & 4) != 0 ? C9729a.f21680b : functions, (i & 8) != 0 ? new DisplayMetrics() : displayMetrics2);
    }

    /* renamed from: a */
    public final C9760c4 m82027a() {
        C9760c4 c9760c4;
        try {
            if (((Number) this.f21676c.invoke()).intValue() >= 30) {
                c9760c4 = m82026a(this.f21674a);
            } else {
                DisplayMetrics displayMetrics = this.f21675b;
                c9760c4 = new C9760c4(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            return c9760c4;
        } catch (Exception e) {
            C9763c7.m81920b("Cannot create device size", e);
            return new C9760c4(0, 0);
        }
    }
}
