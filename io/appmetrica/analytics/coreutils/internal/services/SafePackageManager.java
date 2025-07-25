package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.impl.C33713a;
import io.appmetrica.analytics.coreutils.impl.C33714b;
import io.appmetrica.analytics.coreutils.impl.C33715c;
import io.appmetrica.analytics.coreutils.impl.C33716d;
import io.appmetrica.analytics.coreutils.impl.C33717e;
import io.appmetrica.analytics.coreutils.impl.C33718f;
import io.appmetrica.analytics.coreutils.impl.C33719g;
import io.appmetrica.analytics.coreutils.impl.C33720h;
import io.appmetrica.analytics.coreutils.impl.C33721i;
import io.appmetrica.analytics.coreutils.impl.C33722j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class SafePackageManager {
    /* renamed from: a */
    private static Object m22804a(Boolean bool, Functions functions) {
        try {
            Object invoke = functions.invoke();
            if (invoke != null) {
                return invoke;
            }
            return bool;
        } catch (Throwable unused) {
            return bool;
        }
    }

    @Nullable
    public final ActivityInfo getActivityInfo(@NotNull Context context, @NotNull ComponentName componentName, int i) {
        return (ActivityInfo) m22804a(null, new C33713a(context, componentName, i));
    }

    @Nullable
    public final ApplicationInfo getApplicationInfo(@NotNull Context context, @NotNull String str, int i) {
        return (ApplicationInfo) m22804a(null, new C33714b(context, str, i));
    }

    @Nullable
    public final String getInstallerPackageName(@NotNull Context context, @NotNull String str) {
        return (String) m22804a(null, new C33715c(context, str));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str) {
        return getPackageInfo(context, str, 0);
    }

    @Nullable
    public final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull ComponentName componentName, int i) {
        return (ServiceInfo) m22804a(null, new C33717e(context, componentName, i));
    }

    public final boolean hasSystemFeature(@NotNull Context context, @NotNull String str) {
        return ((Boolean) m22804a(Boolean.FALSE, new C33718f(context, str))).booleanValue();
    }

    @Nullable
    public final ResolveInfo resolveActivity(@NotNull Context context, @NotNull Intent intent, int i) {
        return (ResolveInfo) m22804a(null, new C33719g(context, intent, i));
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String str) {
        return (ProviderInfo) m22804a(null, new C33720h(context, str));
    }

    @Nullable
    public final ResolveInfo resolveService(@NotNull Context context, @NotNull Intent intent, int i) {
        return (ResolveInfo) m22804a(null, new C33721i(context, intent, i));
    }

    @Nullable
    public final Unit setComponentEnabledSetting(@NotNull Context context, @NotNull ComponentName componentName, int i, int i2) {
        return (Unit) m22804a(null, new C33722j(context, componentName, i, i2));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str, int i) {
        return (PackageInfo) m22804a(null, new C33716d(context, str, i));
    }
}
