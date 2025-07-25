package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DoNotInline
@Metadata
@TargetApi(30)
/* loaded from: classes9.dex */
public final class SafePackageManagerHelperForR {
    @NotNull
    public static final SafePackageManagerHelperForR INSTANCE = new SafePackageManagerHelperForR();

    private SafePackageManagerHelperForR() {
    }

    @Nullable
    public static final String extractPackageInstaller(@NotNull PackageManager packageManager, @NotNull String str) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        installSourceInfo = packageManager.getInstallSourceInfo(str);
        installingPackageName = installSourceInfo.getInstallingPackageName();
        return installingPackageName;
    }
}
