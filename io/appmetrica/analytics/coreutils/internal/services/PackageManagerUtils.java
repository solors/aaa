package io.appmetrica.analytics.coreutils.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import com.google.firebase.crashlytics.internal.common.IdManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class PackageManagerUtils {
    @NotNull
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* renamed from: a */
    private static final SafePackageManager f92445a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(@NotNull Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @NotNull
    public static final String getAppVersionCodeString(@NotNull Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    @NotNull
    public static final String getAppVersionName(@NotNull Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            return IdManager.DEFAULT_VERSION_NAME;
        }
        return str;
    }

    @Nullable
    public static final PackageInfo getPackageInfo(@NotNull Context context) {
        return f92445a.getPackageInfo(context, context.getPackageName());
    }

    public static final boolean hasContentProvider(@NotNull Context context, @NotNull String str) {
        if (resolveContentProvider(context, str) != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public static final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String str) {
        return f92445a.resolveContentProvider(context, str);
    }
}
