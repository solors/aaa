package com.yandex.varioqub.appmetricaadapter.impl;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IModuleReporter;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsJVM;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.c */
/* loaded from: classes8.dex */
public final class C32054c implements InterfaceC32055d {

    /* renamed from: a */
    public IModuleReporter f89339a;

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: a */
    public final void mo25922a(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        List m17175e;
        C32053b c32053b = new C32053b(adapterIdentifiersCallback);
        m17175e = CollectionsJVM.m17175e(StartupParamsCallback.APPMETRICA_UUID);
        AppMetrica.requestStartupParams(context, c32053b, m17175e);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: b */
    public final void mo25919b(LinkedHashMap linkedHashMap) {
        AppMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: c */
    public final void mo25918c(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        List m17175e;
        C32052a c32052a = new C32052a(adapterIdentifiersCallback);
        m17175e = CollectionsJVM.m17175e(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        AppMetrica.requestStartupParams(context, c32052a, m17175e);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: a */
    public final void mo25921a(Context context, String str) {
        this.f89339a = ModulesFacade.getModuleReporter(context, str);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: a */
    public final void mo25920a(byte[] bArr) {
        IModuleReporter iModuleReporter = this.f89339a;
        if (iModuleReporter != null) {
            iModuleReporter.setSessionExtra("varioqub", bArr);
        } else {
            ModulesFacade.setSessionExtra("varioqub", bArr);
        }
    }
}
