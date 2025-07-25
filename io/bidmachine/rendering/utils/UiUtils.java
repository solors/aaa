package io.bidmachine.rendering.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.explorestack.iab.utils.C10512g;
import io.bidmachine.rendering.internal.AbstractC37037k;
import io.bidmachine.rendering.internal.InterfaceC37036j;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.utils.taskmanager.TaskManager;
import io.bidmachine.rendering.utils.taskmanager.UITaskManager;

/* loaded from: classes9.dex */
public class UiUtils {

    /* renamed from: a */
    private static final TaskManager f97963a = new UITaskManager();

    /* renamed from: io.bidmachine.rendering.utils.UiUtils$a */
    /* loaded from: classes9.dex */
    public class View$OnApplyWindowInsetsListenerC37087a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ int f97964a;

        View$OnApplyWindowInsetsListenerC37087a(int i) {
            this.f97964a = i;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Insets insets;
            int i;
            int i2;
            int i3;
            int i4;
            insets = windowInsets.getInsets(this.f97964a);
            i = insets.left;
            i2 = insets.top;
            i3 = insets.right;
            i4 = insets.bottom;
            view.setPadding(i, i2, i3, i4);
            return windowInsets;
        }
    }

    public static void applyInsets(@NonNull Activity activity, @NonNull View view) {
        applyInsets(activity, view, true);
    }

    public static void cancelOnUiThread(@NonNull Runnable runnable) {
        f97963a.cancel(runnable);
    }

    public static int dpToPx(@NonNull Context context, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return C10512g.m79302o(context, f);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    @NonNull
    public static Rect getLocationInWindow(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static float getNotOverlappedAreaPercent(@NonNull Rect rect, @NonNull Rect rect2) {
        int width = rect.width() * rect.height();
        if (width == 0) {
            return 0.0f;
        }
        return (width - (Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)))) / width;
    }

    public static boolean isViewTransparent(@NonNull View view) {
        if (view.getAlpha() == 0.0f) {
            return true;
        }
        return false;
    }

    public static boolean isViewVisible(int i) {
        return i == 0;
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        f97963a.execute(runnable);
    }

    public static void safeHideView(@Nullable final View view) {
        if (view == null) {
            return;
        }
        onUiThread(new InterfaceC37036j() { // from class: io.bidmachine.rendering.utils.a
            @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
            public final void onRun() {
                view.setVisibility(8);
            }
        });
    }

    public static void safeSetBackgroundColor(@Nullable View view, @Nullable Integer num) {
        if (view != null && num != null) {
            try {
                view.setBackgroundColor(num.intValue());
            } catch (Throwable th) {
                AbstractC37037k.m19161b(th);
            }
        }
    }

    public static void safeShowView(@Nullable final View view) {
        if (view == null) {
            return;
        }
        onUiThread(new InterfaceC37036j() { // from class: io.bidmachine.rendering.utils.b
            @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
            public final void onRun() {
                view.setVisibility(0);
            }
        });
    }

    public static void setActivityBackgroundColor(@NonNull Activity activity, @ColorInt int i) {
        setWindowBackgroundColor(activity.getWindow(), i);
    }

    public static void setDefaultActivityTransition(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(0, 0, 0);
            activity.overrideActivityTransition(1, 0, 0);
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @RequiresApi(api = 30)
    public static void setInsetsChanger(@NonNull View view) {
        int systemBars;
        int displayCutout;
        systemBars = WindowInsets.Type.systemBars();
        displayCutout = WindowInsets.Type.displayCutout();
        setInsetsChanger(view, systemBars | displayCutout);
    }

    public static void setWindowBackgroundColor(@Nullable Window window, @ColorInt int i) {
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    public static void setupActivityOrientation(@NonNull Activity activity, @Nullable Orientation orientation) {
        int i;
        if (orientation != null) {
            i = orientation.getActivityOrientation();
        } else {
            i = 4;
        }
        activity.setRequestedOrientation(i);
    }

    public static int spToPx(@NonNull Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    @NonNull
    public static String toString(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i != 8) {
                    return "unknown";
                }
                return "GONE";
            }
            return "INVISIBLE";
        }
        return "VISIBLE";
    }

    public static void applyInsets(@NonNull Activity activity, @NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : view;
            view.setPadding(0, 0, 0, 0);
            setInsetsChanger(decorView);
            if (z) {
                decorView.requestApplyInsets();
            }
        }
    }

    public static boolean isViewVisible(@NonNull View view) {
        return isViewVisible(view.getVisibility());
    }

    public static void onUiThread(@NonNull Runnable runnable, long j) {
        f97963a.schedule(runnable, j);
    }

    @RequiresApi(api = 30)
    public static void setInsetsChanger(@NonNull View view, int i) {
        view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC37087a(i));
    }
}
