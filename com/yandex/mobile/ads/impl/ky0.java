package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.ay0;
import com.yandex.mobile.ads.impl.hy0;
import com.yandex.mobile.ads.impl.py0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ky0 {

    /* renamed from: a */
    public static final /* synthetic */ int f81634a = 0;

    static {
        new ky0();
    }

    private ky0() {
    }

    /* renamed from: a */
    public static final void m32399a(boolean z) {
        um0.m28729a(z);
        km0.m32487a(z);
        if (z) {
            return;
        }
        int i = py0.f84119d;
        py0.C31161a.m30553a().m30555c();
        int i2 = hy0.f80246d;
        hy0.C30514a.m33433a().m33435c();
    }

    /* renamed from: b */
    public static final void m32398b(boolean z) {
        int i = as1.f76895l;
        as1.C29962a.m35776a().m35788c(z);
    }

    /* renamed from: a */
    public static final void m32400a(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull InterfaceC31678vr initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        if (new C31133ph().m30671a()) {
            return;
        }
        int i = b32.f77086c;
        b32.m35657a(context, sdkEnvironmentModule.mo30597b());
        C30781ld.m32291a(context, sdkEnvironmentModule.mo30597b());
        new yd2(new hh1()).m26940a();
        new nq0(context).m31438a();
        int i2 = ay0.f76953h;
        ay0.C29973a.m35730a(sdkEnvironmentModule).m35740a(context, initializationListener);
    }
}
