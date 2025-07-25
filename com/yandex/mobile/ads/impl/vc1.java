package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vc1 {
    @NotNull

    /* renamed from: a */
    private final Context f86694a;

    public vc1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f86694a = applicationContext;
    }

    /* renamed from: a */
    public final boolean m28369a() {
        if (this.f86694a.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m28368b() {
        if (this.f86694a.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }
}
