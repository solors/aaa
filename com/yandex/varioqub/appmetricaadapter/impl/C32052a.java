package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.a */
/* loaded from: classes8.dex */
public final class C32052a implements StartupParamsCallback {

    /* renamed from: a */
    public final /* synthetic */ AdapterIdentifiersCallback f89337a;

    public C32052a(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f89337a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        this.f89337a.onSuccess((result == null || (r2 = result.deviceId) == null) ? "" : "");
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f89337a.onError(reason.value);
    }
}
