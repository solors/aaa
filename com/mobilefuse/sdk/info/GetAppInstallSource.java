package com.mobilefuse.sdk.info;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.info.GetAppInstallSourceKt */
/* loaded from: classes7.dex */
public final class GetAppInstallSource {
    private static String appInstallSource;

    @NotNull
    public static final String getAppInstallSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = appInstallSource;
        if (str == null) {
            String installingPackageName = getInstallingPackageName(context);
            appInstallSource = installingPackageName;
            return installingPackageName;
        }
        return str;
    }

    private static final String getInstallingPackageName(Context context) {
        String str;
        InstallSourceInfo installSourceInfo;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "context.packageManager.g…Info(context.packageName)");
                str = installSourceInfo.getInstallingPackageName();
            } else {
                str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
        } catch (Throwable unused) {
            str = "error";
        }
        if (str == null) {
            return "none";
        }
        return str;
    }
}
