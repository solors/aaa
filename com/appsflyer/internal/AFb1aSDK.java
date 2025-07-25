package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface AFb1aSDK {
    void AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull String str, @NotNull String str2);

    void AFInAppEventParameterName(@NotNull String str, @NotNull String... strArr);

    boolean AFInAppEventType();

    void AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull String str, int i, @NotNull String str2);

    void AFKeystoreWrapper(@NotNull Throwable th);

    /* renamed from: e */
    boolean mo92202e();

    void valueOf();

    void values();

    void values(@Nullable String str, @Nullable PackageManager packageManager);

    void values(@NotNull String str, @NotNull String str2);
}
