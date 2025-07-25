package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Intents;

/* loaded from: classes7.dex */
public final class DeviceUtils {

    /* loaded from: classes7.dex */
    public enum ScreenOrientation {
        PORTRAIT,
        LANDSCAPE,
        UNKNOWN
    }

    /* renamed from: com.smaato.sdk.richmedia.util.DeviceUtils$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27571a {

        /* renamed from: a */
        static final /* synthetic */ int[] f72334a;

        static {
            int[] iArr = new int[ScreenOrientation.values().length];
            f72334a = iArr;
            try {
                iArr[ScreenOrientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72334a[ScreenOrientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72334a[ScreenOrientation.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private DeviceUtils() {
    }

    private static boolean containsFlag(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public static int getActivityInfoOrientation(@NonNull ScreenOrientation screenOrientation) {
        int i = C27571a.f72334a[screenOrientation.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return -1;
        }
        return 0;
    }

    @NonNull
    public static ScreenOrientation getScreenOrientation(@NonNull Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i != 2) {
                return ScreenOrientation.UNKNOWN;
            }
            return ScreenOrientation.LANDSCAPE;
        }
        return ScreenOrientation.PORTRAIT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isAutoRotateLocked(@NonNull Context context) {
        if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View] */
    public static boolean isInlineVideoSupported(@NonNull Context context, @NonNull WebView webView) {
        if (context instanceof Activity) {
            for (WebView webView2 = webView; webView2 != null; webView2 = (View) webView2.getParent()) {
                if (!webView2.isHardwareAccelerated() || containsFlag(webView2.getLayerType(), 1)) {
                    return false;
                }
                if (!(webView2.getParent() instanceof View)) {
                    break;
                }
            }
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                return containsFlag(window.getAttributes().flags, 16777216);
            }
        }
        return false;
    }

    public static boolean isLocationAvailable(@NonNull AppMetaData appMetaData) {
        if (!appMetaData.isPermissionGranted("android.permission.ACCESS_FINE_LOCATION") && !appMetaData.isPermissionGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            return false;
        }
        return true;
    }

    public static boolean isOrientationLocked(@NonNull Context context) {
        if (isAutoRotateLocked(context)) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        return OrientationLockedCompat.m39014c((Activity) context);
    }

    public static boolean isSmsAvailable(@NonNull Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return Intents.canHandleIntent(context, intent);
    }

    public static boolean isTelAvailable(@NonNull Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return Intents.canHandleIntent(context, intent);
    }
}
