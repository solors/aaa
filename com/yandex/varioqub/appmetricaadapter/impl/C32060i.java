package com.yandex.varioqub.appmetricaadapter.impl;

import android.content.Context;
import com.yandex.metrica.ModulesFacade;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.p;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.LinkedHashMap;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.i */
/* loaded from: classes8.dex */
public final class C32060i implements InterfaceC32055d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: a */
    public final void mo25921a(Context context, String str) {
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: b */
    public final void mo25919b(LinkedHashMap linkedHashMap) {
        YandexMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: c */
    public final void mo25918c(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a(context, new C32058g(adapterIdentifiersCallback), new String[]{"yandex_mobile_metrica_device_id"});
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: a */
    public final void mo25922a(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a(context, new C32059h(adapterIdentifiersCallback), new String[]{"yandex_mobile_metrica_uuid"});
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d
    /* renamed from: a */
    public final void mo25920a(byte[] bArr) {
        ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
