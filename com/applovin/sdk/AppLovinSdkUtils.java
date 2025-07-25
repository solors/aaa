package com.applovin.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import com.applovin.impl.AbstractC5927yp;
import com.applovin.impl.AbstractC5947z3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppLovinSdkUtils {

    /* renamed from: a */
    private static final Handler f12897a = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* renamed from: a */
        private int f12898a;

        /* renamed from: b */
        private int f12899b;

        public Size(int i, int i2) {
            this.f12898a = i;
            this.f12899b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            if (this.f12898a == size.getWidth() && this.f12899b == size.getHeight()) {
                return true;
            }
            return false;
        }

        public int getHeight() {
            return this.f12899b;
        }

        public int getWidth() {
            return this.f12898a;
        }

        public int hashCode() {
            int i = this.f12899b;
            int i2 = this.f12898a;
            return i ^ ((i2 >>> 16) | (i2 << 16));
        }

        public String toString() {
            return this.f12898a + "x" + this.f12899b;
        }
    }

    /* renamed from: a */
    private static boolean m92217a(String str, String str2) {
        return StringUtils.startsWithAtLeastOnePrefix(str, CollectionUtils.explode(str2));
    }

    @Dimension(unit = 1)
    public static int dpToPx(Context context, @Dimension(unit = 0) int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            return configuration.orientation;
        }
        return 0;
    }

    public static boolean isEmulator() {
        if (!m92217a(Build.DEVICE, "goldfish,vbox") && !m92217a(Build.HARDWARE, "ranchu,generic,vbox") && !m92217a(Build.MANUFACTURER, "Genymotion") && !m92217a(Build.MODEL, "Android SDK built for x86")) {
            return false;
        }
        return true;
    }

    public static boolean isFireOS(Context context) {
        if (!"amazon".equalsIgnoreCase(Build.MANUFACTURER) && !isFireTv(context)) {
            return false;
        }
        return true;
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isInclusiveVersion(String str, @Nullable String str2, @Nullable String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int m92630f = AbstractC5927yp.m92630f(str);
        if (str2 != null && m92630f < AbstractC5927yp.m92630f(str2)) {
            return false;
        }
        if (str3 == null || m92630f <= AbstractC5927yp.m92630f(str3)) {
            return true;
        }
        return false;
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        if (AppLovinSdk.VERSION_CODE >= AbstractC5927yp.m92630f(str)) {
            return true;
        }
        return false;
    }

    public static boolean isTablet(Context context) {
        Point m92541b = AbstractC5947z3.m92541b(context);
        if (Math.min(m92541b.x, m92541b.y) >= dpToPx(context, 600)) {
            return true;
        }
        return false;
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC5947z3.m92536f()) {
            return packageManager.hasSystemFeature("android.software.leanback");
        }
        return packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    @Dimension(unit = 0)
    public static int pxToDp(Context context, @Dimension(unit = 1) int i) {
        return (int) Math.ceil(i / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, f12897a);
    }

    public static void setImageUrl(String str, ImageView imageView, AppLovinSdk appLovinSdk) {
        ImageViewUtils.setImageUri(imageView, Uri.parse(str), appLovinSdk.m92221a());
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }

    public static void runOnUiThread(boolean z, Runnable runnable) {
        if (!z && AbstractC5927yp.m92627h()) {
            runnable.run();
        } else {
            f12897a.post(runnable);
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (AbstractC5927yp.m92627h()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
