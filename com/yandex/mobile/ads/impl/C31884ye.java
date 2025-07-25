package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ye */
/* loaded from: classes8.dex */
public final class C31884ye {
    @NotNull

    /* renamed from: a */
    private static final List<String> f88182a;

    static {
        List<String> m17163p;
        m17163p = C37563v.m17163p(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url");
        f88182a = m17163p;
    }

    @NotNull
    /* renamed from: a */
    public static List m26939a() {
        return f88182a;
    }
}
