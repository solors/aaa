package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Validate.kt */
@Metadata
/* loaded from: classes4.dex */
public final class Validate {
    @NotNull
    private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
    @NotNull
    private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
    @NotNull
    public static final String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";
    @NotNull
    private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
    @NotNull
    private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
    @NotNull
    public static final Validate INSTANCE = new Validate();
    private static final String TAG = Validate.class.getName();

    private Validate() {
    }

    public static final void containsNoNullOrEmpty(@NotNull Collection<String> container, @NotNull String name) {
        boolean z;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        for (String str : container) {
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    throw new IllegalArgumentException(("Container '" + name + "' cannot contain empty values").toString());
                }
            } else {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    public static final <T> void containsNoNulls(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        for (T t : container) {
            if (t == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    @NotNull
    public static final String hasAppID() {
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final boolean hasBluetoothPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN")) {
            return true;
        }
        return false;
    }

    public static final boolean hasChangeWifiStatePermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
    }

    @NotNull
    public static final String hasClientToken() {
        String clientToken = FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final void hasContentProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String hasAppID = hasAppID();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String m17064q = Intrinsics.m17064q(CONTENT_PROVIDER_BASE, hasAppID);
            if (packageManager.resolveContentProvider(m17064q, 0) == null) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(CONTENT_PROVIDER_NOT_FOUND_REASON, Arrays.copyOf(new Object[]{m17064q}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new IllegalStateException(format.toString());
            }
        }
    }

    public static final boolean hasCustomTabRedirectActivity(@NotNull Context context, @NotNull String redirectURI) {
        List<ResolveInfo> list;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!Intrinsics.m17075f(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.m17075f(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static final void hasFacebookActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        hasFacebookActivity(context, true);
    }

    public static final void hasInternetPermissions(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        hasInternetPermissions(context, true);
    }

    public static final boolean hasLocationPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") && !hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    public static final boolean hasPermission(@NotNull Context context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context.checkCallingOrSelfPermission(permission) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasWiFiPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
    }

    public static final <T> void notEmpty(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
    }

    public static final <T> void notEmptyAndContainsNoNulls(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        containsNoNulls(container, name);
        notEmpty(container, name);
    }

    public static final void notNull(@Nullable Object obj, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    @NotNull
    public static final String notNullOrEmpty(@Nullable String str, @NotNull String name) {
        boolean z;
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z2 = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    public static final void oneOf(@Nullable Object obj, @NotNull String name, @NotNull Object... values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        int length = values.length;
        int i = 0;
        while (i < length) {
            Object obj2 = values[i];
            i++;
            if (Intrinsics.m17075f(obj2, obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Argument '" + name + "' was not one of the allowed values");
    }

    public static final void runningOnUiThread() {
        if (Intrinsics.m17075f(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        throw new FacebookException("This method should be called from the UI thread");
    }

    public static final void sdkInitialized() {
        if (FacebookSdk.isInitialized()) {
            return;
        }
        throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void hasFacebookActivity(@org.jetbrains.annotations.NotNull android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L18
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 != 0) goto L31
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L27
            java.lang.String r4 = com.facebook.internal.Validate.TAG
            android.util.Log.w(r4, r5)
            goto L31
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Validate.hasFacebookActivity(android.content.Context, boolean):void");
    }

    public static final void hasInternetPermissions(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!z) {
                Log.w(TAG, NO_INTERNET_PERMISSION_REASON);
                return;
            }
            throw new IllegalStateException(NO_INTERNET_PERMISSION_REASON.toString());
        }
    }

    public static final void notEmpty(@NotNull String arg, @NotNull String name) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }
}
