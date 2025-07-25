package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xe */
/* loaded from: classes8.dex */
public final class C31814xe implements StartupParamsCallback {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31441te f87653a;

    public C31814xe(@NotNull InterfaceC31441te appMetricaStartupParamsCallback) {
        Intrinsics.checkNotNullParameter(appMetricaStartupParamsCallback, "appMetricaStartupParamsCallback");
        this.f87653a = appMetricaStartupParamsCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(@Nullable StartupParamsCallback.Result result) {
        String str;
        String str2;
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        InterfaceC31441te interfaceC31441te = this.f87653a;
        String str3 = null;
        if (result != null && (map3 = result.parameters) != null && (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) != null) {
            str = startupParamsItem3.getId();
        } else {
            str = null;
        }
        if (result != null && (map2 = result.parameters) != null && (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) != null) {
            str2 = startupParamsItem2.getId();
        } else {
            str2 = null;
        }
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            str3 = startupParamsItem.getId();
        }
        interfaceC31441te.mo29206a(new C31278re(str, str2, str3));
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(@NotNull StartupParamsCallback.Reason reason, @Nullable StartupParamsCallback.Result result) {
        EnumC31348se enumC31348se;
        Intrinsics.checkNotNullParameter(reason, "reason");
        InterfaceC31441te interfaceC31441te = this.f87653a;
        if (Intrinsics.m17075f(reason, StartupParamsCallback.Reason.NETWORK)) {
            enumC31348se = EnumC31348se.f85201c;
        } else if (Intrinsics.m17075f(reason, StartupParamsCallback.Reason.INVALID_RESPONSE)) {
            enumC31348se = EnumC31348se.f85202d;
        } else {
            enumC31348se = EnumC31348se.f85200b;
        }
        interfaceC31441te.mo29205a(enumC31348se);
    }
}
