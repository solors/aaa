package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.u */
/* loaded from: classes7.dex */
public final class C24392u {
    @NotNull
    /* renamed from: a */
    public static final PackageInfo m46500a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n        packageManager…ageInfoFlags.of(0))\n    }");
            return packageInfo;
        }
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "{\n        packageManager…nfo(packageName, 0)\n    }");
        return packageInfo2;
    }
}
