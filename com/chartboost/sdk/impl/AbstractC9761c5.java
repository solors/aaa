package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* renamed from: com.chartboost.sdk.impl.c5 */
/* loaded from: classes3.dex */
public abstract class AbstractC9761c5 {
    @NotNull
    public static final <T> List<T> asList(@NotNull JSONArray jSONArray) {
        return AbstractC9804d5.m81820a(jSONArray);
    }

    @NotNull
    public static final <T> List<T> asListSkipNull(@NotNull JSONArray jSONArray) {
        return AbstractC9804d5.m81819b(jSONArray);
    }

    @NotNull
    public static final PackageInfo getPackageInfoCompat(@NotNull PackageManager packageManager, @NotNull String str, int i) {
        return AbstractC9804d5.m81823a(packageManager, str, i);
    }

    @NotNull
    public static final String getPackageVersionName(@NotNull PackageManager packageManager, @NotNull String str) {
        return AbstractC9804d5.m81824a(packageManager, str);
    }

    @NotNull
    public static final C9816da toBodyFields(@NotNull C9770ca c9770ca) {
        return AbstractC9804d5.m81822a(c9770ca);
    }

    @NotNull
    public static final C10321w8 toReachabilityBodyFields(@NotNull C9880h2 c9880h2) {
        return AbstractC9804d5.m81821a(c9880h2);
    }
}
