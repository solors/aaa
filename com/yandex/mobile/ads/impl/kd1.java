package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class kd1 {
    @Nullable
    /* renamed from: a */
    public static final String m32579a(@NotNull Context context) {
        String typeName;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 0) {
                typeName = activeNetworkInfo.getSubtypeName();
            } else {
                typeName = activeNetworkInfo.getTypeName();
            }
            return typeName;
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* renamed from: b */
    public static final Point m32578b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
