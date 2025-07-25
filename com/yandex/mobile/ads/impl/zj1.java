package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class zj1 {
    @NotNull

    /* renamed from: a */
    private final C31778wz f88930a;
    @NotNull

    /* renamed from: b */
    private final Context f88931b;

    public /* synthetic */ zj1(Context context) {
        this(context, new C31778wz());
    }

    @NotNull
    /* renamed from: a */
    public final ft0 m26147a() {
        if (EnumC31709vz.f87043d == this.f88930a.m27724a(this.f88931b)) {
            return new ft0(1920, 1080, 6800);
        }
        return new ft0(854, DtbConstants.DEFAULT_PLAYER_HEIGHT, 1000);
    }

    public zj1(@NotNull Context context, @NotNull C31778wz deviceTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        this.f88930a = deviceTypeProvider;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f88931b = applicationContext;
    }
}
