package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.p017os.UserManagerCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.p552ot.pubsub.p559g.C26542f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class PackageManagerCompat {
    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    @RequiresApi(30)
    /* loaded from: classes.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(@NonNull Context context) {
            boolean isAutoRevokeWhitelisted;
            isAutoRevokeWhitelisted = context.getPackageManager().isAutoRevokeWhitelisted();
            return !isAutoRevokeWhitelisted;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            z = true;
        } else {
            z = false;
        }
        if (i < 30) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getPermissionRevocationVerifierApp(packageManager) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            return true;
        }
        if (z2 && z3) {
            return true;
        }
        return false;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts(C26542f.C26543a.f69507e, "com.example", null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static ListenableFuture<Integer> getUnusedAppRestrictionsStatus(@NonNull Context context) {
        ResolvableFuture<Integer> create = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            create.set(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return create;
        } else if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            create.set(1);
            return create;
        } else {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i < 30) {
                create.set(0);
                Log.e(LOG_TAG, "Target SDK version below API 30");
                return create;
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 4;
            if (i2 >= 31) {
                if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                    if (i >= 31) {
                        i3 = 5;
                    }
                    create.set(Integer.valueOf(i3));
                } else {
                    create.set(2);
                }
                return create;
            } else if (i2 == 30) {
                if (!Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                    i3 = 2;
                }
                create.set(Integer.valueOf(i3));
                return create;
            } else {
                final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
                create.addListener(new Runnable() { // from class: androidx.core.content.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnusedAppRestrictionsBackportServiceConnection.this.disconnectFromService();
                    }
                }, Executors.newSingleThreadExecutor());
                unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(create);
                return create;
            }
        }
    }
}
