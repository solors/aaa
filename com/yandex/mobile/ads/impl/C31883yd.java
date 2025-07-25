package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yd */
/* loaded from: classes8.dex */
public final class C31883yd {
    @NotNull

    /* renamed from: a */
    private final Context f88159a;
    @NotNull

    /* renamed from: b */
    private final C31620uz f88160b;

    public C31883yd(@NotNull Context context, @NotNull C31620uz deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f88159a = context;
        this.f88160b = deviceInfoProvider;
    }

    @NotNull
    /* renamed from: a */
    public final C30978nv m26949a() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.f88159a.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            packageInfo = packageManager.getPackageInfo(this.f88159a.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } else {
            packageInfo = packageManager.getPackageInfo(this.f88159a.getPackageName(), 0);
        }
        this.f88160b.getClass();
        String m28586b = C31620uz.m28586b();
        if (m28586b == null) {
            m28586b = "Undefined";
        }
        String str = "Android " + m28586b;
        String str2 = "API " + i;
        String packageName = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String versionName = packageInfo.versionName;
        Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
        return new C30978nv(packageName, versionName, str, str2);
    }
}
