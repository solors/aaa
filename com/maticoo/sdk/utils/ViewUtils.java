package com.maticoo.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import com.maticoo.sdk.C21523R;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class ViewUtils {
    private static final float VIEW_LOGO_LARGE_HEIGHT = 16.0f;
    private static final float VIEW_LOGO_LARGE_WIDTH = 62.0f;
    private static final float VIEW_LOGO_SMALL_SIZE = 14.0f;

    private static float calViewVisibleArea(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return 0.0f;
        }
        return rect.height() * rect.width();
    }

    public static float calViewVisiblePercent(View view) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            return calViewVisibleArea(view) / (view.getHeight() * view.getWidth());
        }
        return 0.0f;
    }

    public static ImageView createCloseView(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(IdentifierGetter.getDrawableId(context, "zmaticoo_ic_close", C21523R.C21525drawable.zmaticoo_ic_close));
        int dip2px = DensityUtil.dip2px(context, 60.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dip2px, dip2px);
        layoutParams.gravity = GravityCompat.END;
        int i = dip2px / 2;
        layoutParams.rightMargin = i;
        layoutParams.setMarginEnd(i);
        int i2 = dip2px / 4;
        imageView.setPadding(i2, i2, i2, i2);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public static ImageView createLargeLogoView(Context context) {
        ImageView createLogoView = createLogoView(context);
        createLogoView.setImageResource(IdentifierGetter.getDrawableId(context, "zmaticoo_ic_logo", C21523R.C21525drawable.zmaticoo_ic_logo));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DensityUtil.dip2px(context, VIEW_LOGO_LARGE_WIDTH), DensityUtil.dip2px(context, VIEW_LOGO_LARGE_HEIGHT));
        layoutParams.gravity = 80;
        createLogoView.setLayoutParams(layoutParams);
        return createLogoView;
    }

    public static ImageView createLogoView(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public static ImageView createSmallLogoView(Context context) {
        ImageView createLogoView = createLogoView(context);
        createLogoView.setImageResource(IdentifierGetter.getDrawableId(context, "zmaticoo_ic_logo_small", C21523R.C21525drawable.zmaticoo_ic_logo_small));
        createLogoView.setLayoutParams(new ViewGroup.LayoutParams(DensityUtil.dip2px(context, VIEW_LOGO_SMALL_SIZE), DensityUtil.dip2px(context, VIEW_LOGO_SMALL_SIZE)));
        return createLogoView;
    }

    public static FrameLayout getRootView(Context context) {
        return getRootView(scanForActivity(context));
    }

    private static int indexOfViewInParent(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }

    public static boolean isViewCovered(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return true;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return true;
        }
        Rect rect2 = new Rect();
        while (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup.getVisibility() != 0) {
                return true;
            }
            for (int indexOfViewInParent = indexOfViewInParent(view, viewGroup) + 1; indexOfViewInParent < viewGroup.getChildCount(); indexOfViewInParent++) {
                View childAt = viewGroup.getChildAt(indexOfViewInParent);
                rect2.setEmpty();
                childAt.getGlobalVisibleRect(rect2);
                if (Rect.intersects(rect, rect2)) {
                    DeveloperLog.LogD("otherView, otherView = " + childAt);
                    DeveloperLog.LogD("otherView, area = " + (rect2.width() * rect2.height()));
                    return true;
                }
            }
            view = viewGroup;
        }
        return false;
    }

    public static void removeFromParent(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static Activity scanForActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return scanForActivity(((ContextWrapper) context).getBaseContext());
    }

    public static void webViewDestroy(WebView webView, String... strArr) {
        if (webView == null) {
            return;
        }
        webView.stopLoading();
        webView.removeAllViews();
        webView.clearHistory();
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                webView.removeJavascriptInterface(str);
            }
        }
        webView.setWebViewClient(null);
        webView.setWebChromeClient(null);
        webView.freeMemory();
    }

    public static FrameLayout getRootView(Activity activity) {
        if (activity == null) {
            return null;
        }
        View findViewById = activity.findViewById(IdentifierGetter.getId(activity, "content", 16908290));
        if (findViewById instanceof FrameLayout) {
            return (FrameLayout) findViewById;
        }
        return null;
    }
}
