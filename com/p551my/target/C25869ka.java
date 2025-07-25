package com.p551my.target;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.ka */
/* loaded from: classes7.dex */
public class C25869ka {

    /* renamed from: a */
    public final Context f67139a;

    /* renamed from: com.my.target.ka$a */
    /* loaded from: classes7.dex */
    public static class C25870a {

        /* renamed from: a */
        public static final DisplayMetrics f67140a;

        /* renamed from: b */
        public static final float f67141b;

        /* renamed from: c */
        public static final int f67142c;

        static {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            f67140a = displayMetrics;
            f67141b = displayMetrics.density;
            f67142c = displayMetrics.densityDpi;
        }
    }

    /* renamed from: com.my.target.ka$b */
    /* loaded from: classes7.dex */
    public static class C25871b extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final String f67143a;

        public C25871b(String str) {
            this.f67143a = str;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setViewIdResourceName(this.f67143a);
        }
    }

    public C25869ka(Context context) {
        this.f67139a = context;
    }

    /* renamed from: a */
    public static int m43612a(int i, int i2, int i3) {
        return i3 <= i ? i : i3 > i2 ? i2 : i3;
    }

    /* renamed from: b */
    public static Point m43597b(Context context) {
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
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return point;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay == null) {
                return point;
            }
            defaultDisplay.getSize(point);
            return point;
        }
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        navigationBars = WindowInsets.Type.navigationBars();
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
        i = insetsIgnoringVisibility.right;
        i2 = insetsIgnoringVisibility.left;
        int i5 = i + i2;
        i3 = insetsIgnoringVisibility.top;
        i4 = insetsIgnoringVisibility.bottom;
        bounds = currentWindowMetrics.getBounds();
        point.y = bounds.height() - (i3 + i4);
        point.x = bounds.width() - i5;
        return point;
    }

    /* renamed from: c */
    public static int m43591c(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    /* renamed from: d */
    public static String m43587d(Context context) {
        int m43591c = m43591c(context);
        if (m43591c == 2) {
            return "landscape";
        }
        if (m43591c == 1) {
            return "portrait";
        }
        return null;
    }

    /* renamed from: e */
    public static C25869ka m43585e(Context context) {
        return new C25869ka(context);
    }

    /* renamed from: a */
    public static void m43601a(View view, String str) {
        view.setContentDescription(str);
        m43594b(view, str);
    }

    /* renamed from: c */
    public static int m43593c() {
        return View.generateViewId();
    }

    /* renamed from: d */
    public static boolean m43589d() {
        try {
            Class.forName(RecyclerView.class.getName());
            return true;
        } catch (Throwable unused) {
            AbstractC25846ja.m43680a("UiUtils: RecyclerView doesn't exist, add RecyclerView dependency to show cards");
            return false;
        }
    }

    /* renamed from: e */
    public static void m43584e(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i2, i - view.getMeasuredHeight(), view.getMeasuredWidth() + i2, i);
    }

    /* renamed from: b */
    public int m43598b(int i) {
        return m43614a(i);
    }

    /* renamed from: a */
    public static void m43603a(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        int measuredWidth = i + (((i3 - i) - view.getMeasuredWidth()) / 2);
        int measuredHeight = i2 + (((i4 - i2) - view.getMeasuredHeight()) / 2);
        view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
    }

    /* renamed from: b */
    public static int m43599b() {
        return C25870a.f67142c;
    }

    /* renamed from: c */
    public static int m43592c(int i) {
        return Math.round(i / (m43599b() / 160.0f));
    }

    /* renamed from: d */
    public int m43588d(int i) {
        return (int) TypedValue.applyDimension(2, i, this.f67139a.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static DisplayMetrics m43607a(Context context) {
        Display display;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return displayMetrics;
        }
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: b */
    public static void m43595b(View view, int i, int i2, int i3) {
        m43602a(view, i, i2, 0, 0, i3);
    }

    /* renamed from: c */
    public static void m43590c(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i2, i, view.getMeasuredWidth() + i2, view.getMeasuredHeight() + i);
    }

    /* renamed from: d */
    public static void m43586d(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i2 - view.getMeasuredWidth(), i - view.getMeasuredHeight(), i2, i);
    }

    /* renamed from: a */
    public static int m43613a(int i) {
        Color.colorToHSV(i, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 0.7f};
        return Color.HSVToColor(fArr);
    }

    /* renamed from: b */
    public static void m43594b(View view, String str) {
        view.setAccessibilityDelegate(new C25871b(str));
    }

    /* renamed from: b */
    public static void m43596b(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i2 - view.getMeasuredWidth(), i, i2, view.getMeasuredHeight() + i);
    }

    /* renamed from: a */
    public int m43614a(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f67139a.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m43610a(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static float m43615a() {
        return C25870a.f67141b;
    }

    /* renamed from: a */
    public static int m43609a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        if (1 == i) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        } else if (2 == i) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        } else {
            AbstractC25846ja.m43680a("UiUtils: Unknown screen orientation. Defaulting to portrait");
            return 9;
        }
    }

    /* renamed from: a */
    public static void m43611a(int i, int i2, int i3, int i4, View... viewArr) {
        int i5 = i3 - i;
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                m43590c(view, ((i5 - view.getMeasuredHeight()) / 2) + i, i2);
                if (view.getMeasuredWidth() > 0) {
                    i2 += view.getMeasuredWidth() + i4;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m43608a(Activity activity, View view) {
        while (view.isHardwareAccelerated() && (view.getLayerType() & 1) == 0) {
            if (!(view.getParent() instanceof View)) {
                Window window = activity.getWindow();
                return (window == null || (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
            view = (View) view.getParent();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m43606a(View view) {
        Window window;
        for (View view2 = view; view2.isHardwareAccelerated() && (view2.getLayerType() & 1) == 0; view2 = (View) view2.getParent()) {
            if (!(view2.getParent() instanceof View)) {
                Context context = view.getContext();
                return ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m43600a(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i = Math.max(i2, i);
        }
        return i;
    }

    /* renamed from: a */
    public static void m43604a(View view, int i, int i2, int i3) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i3));
    }

    /* renamed from: a */
    public static void m43605a(View view, int i, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        ColorDrawable colorDrawable2 = new ColorDrawable(i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, colorDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, colorDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, iArr}, new int[]{m43613a(i2), m43613a(i)}), stateListDrawable, null));
    }

    /* renamed from: a */
    public static void m43602a(View view, int i, int i2, int i3, int i4, int i5) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, i});
        float f = i5;
        gradientDrawable.setCornerRadius(f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i2, i2});
        gradientDrawable2.setCornerRadius(f);
        if (i3 != 0) {
            gradientDrawable.setStroke(i4, i3);
            gradientDrawable2.setStroke(i4, i3);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, gradientDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, iArr}, new int[]{m43613a(i2), m43613a(i)}), stateListDrawable, null));
    }
}
