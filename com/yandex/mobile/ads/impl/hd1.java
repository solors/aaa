package com.yandex.mobile.ads.impl;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hd1 {
    @NotNull

    /* renamed from: a */
    private final Context f80043a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ hd1(android.content.Context r3) {
        /*
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hd1.<init>(android.content.Context):void");
    }

    @NotNull
    /* renamed from: a */
    public final fd1 m33574a() {
        PowerManager powerManager;
        Boolean bool;
        Object systemService = this.f80043a.getSystemService("power");
        KeyguardManager keyguardManager = null;
        if (systemService instanceof PowerManager) {
            powerManager = (PowerManager) systemService;
        } else {
            powerManager = null;
        }
        if (powerManager != null) {
            bool = Boolean.valueOf(powerManager.isInteractive());
        } else {
            bool = null;
        }
        if (bool != null && !bool.booleanValue()) {
            return fd1.f79053c;
        }
        Object systemService2 = this.f80043a.getSystemService("keyguard");
        if (systemService2 instanceof KeyguardManager) {
            keyguardManager = (KeyguardManager) systemService2;
        }
        if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
            return fd1.f79052b;
        }
        return fd1.f79054d;
    }

    public hd1(@NotNull Context context, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f80043a = appContext;
    }
}
