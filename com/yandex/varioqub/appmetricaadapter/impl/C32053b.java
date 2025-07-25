package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.b */
/* loaded from: classes8.dex */
public final class C32053b implements StartupParamsCallback {

    /* renamed from: a */
    public final /* synthetic */ AdapterIdentifiersCallback f89338a;

    public C32053b(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f89338a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        this.f89338a.onSuccess((result == null || (r2 = result.uuid) == null) ? "" : "");
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f89338a.onError(reason.value);
    }
}
