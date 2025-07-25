package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.f1 */
/* loaded from: classes8.dex */
public final class C30283f1 {
    @NotNull

    /* renamed from: b */
    private static final String f78866b;
    @NotNull

    /* renamed from: c */
    private static final String f78867c;
    @NotNull

    /* renamed from: a */
    private final C31781x0 f78868a = new C31781x0();

    static {
        String str = "com.yandex.mobile.ads.common.AdActivity";
        f78866b = str;
        f78867c = "There is no presence of " + str + " activity in AndroidManifest file.";
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public final void m34394a(@NotNull Context context) throws em0 {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f78866b), 0);
            Intrinsics.checkNotNullExpressionValue(activityInfo, "getActivityInfo(...)");
            this.f78868a.getClass();
            C31781x0.m27716a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f78867c;
            throw new em0(str, str);
        }
    }
}
