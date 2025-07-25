package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ae */
/* loaded from: classes8.dex */
public final class C29930ae {
    @Nullable
    /* renamed from: a */
    public static final String m35915a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public static final String m35914b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }
}
