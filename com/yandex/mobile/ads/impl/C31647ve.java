package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.yandex.mobile.ads.impl.ve */
/* loaded from: classes8.dex */
public final class C31647ve implements InterfaceC30014be {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30014be
    @Nullable
    /* renamed from: a */
    public final C31738we mo28354a(@NotNull Context context, @NotNull String apiKey, @NotNull ll1 reporterPolicyConfigurator, @NotNull InterfaceC31106pd appAdAnalyticsActivator) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(reporterPolicyConfigurator, "reporterPolicyConfigurator");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        try {
            m14554a = LazyJVM.m14554a(new C31572ue(appAdAnalyticsActivator, context, this, apiKey, reporterPolicyConfigurator));
            return new C31738we(m14554a);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30014be
    @Nullable
    /* renamed from: b */
    public final String mo28352b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return AppMetrica.getDeviceId(context);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30014be
    @Nullable
    /* renamed from: a */
    public final String mo28356a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return AppMetrica.getUuid(context);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30014be
    /* renamed from: a */
    public final void mo28353a(@NotNull InterfaceC30231ee listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.mo33872a("AppMetrica SDK does not support autograb feature since version 6.0.0");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30014be
    /* renamed from: a */
    public final void mo28355a(@NotNull Context context, @NotNull InterfaceC31441te listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            AppMetrica.requestStartupParams(context, new C31814xe(listener), C31884ye.m26939a());
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            listener.mo29205a(EnumC31348se.f85200b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30014be
    @Nullable
    /* renamed from: a */
    public final String mo28357a() {
        try {
            return AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }
}
