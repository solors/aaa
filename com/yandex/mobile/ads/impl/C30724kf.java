package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.cy0;
import com.yandex.mobile.ads.impl.jw0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kf */
/* loaded from: classes8.dex */
public final class C30724kf {
    /* renamed from: a */
    public static void m32568a(@NotNull Context context, @NotNull gh2 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        int i = b32.f77086c;
        b32.m35657a(context, sdkEnvironmentModule.mo30597b());
        C30781ld.m32291a(context, sdkEnvironmentModule.mo30597b());
        oq0 oq0Var = new oq0();
        Boolean m30946b = oq0.m30946b(context);
        if (m30946b != null) {
            ky0.m32398b(m30946b.booleanValue());
        }
        Boolean m30943e = oq0.m30943e(context);
        if (m30943e != null) {
            ky0.m32399a(m30943e.booleanValue());
        }
        if (C30155da.m34982a(context)) {
            new cy0();
            cy0.InterfaceC30131a m35134a = cy0.m35134a(context);
            if (m35134a instanceof cy0.InterfaceC30131a.C30133b) {
                km0.m32488a(new lm0().m32226a((cy0.InterfaceC30131a.C30133b) m35134a), new Object[0]);
            } else if (m35134a instanceof cy0.InterfaceC30131a.C30132a) {
                km0.m32486b("Yandex Mobile Ads 7.9.0 integrated successfully", new Object[0]);
            }
            new ux0().m35419a();
            ow0 ow0Var = new ow0();
            int i2 = jw0.f81165d;
            zw0.m25979a(new ax0(ow0Var).m35747a(new xw0().m27182a(jw0.C30676a.m32721a())));
        }
        bs1 bs1Var = new bs1(new kq0(), oq0Var, sdkEnvironmentModule);
        C31079p0.m30860a(context);
        bs1Var.m35445a(context);
    }
}
