package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.i8 */
/* loaded from: classes8.dex */
public final class C30537i8 implements InterfaceC30599j3 {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f80357b = {Reflection.m17039e(new MutablePropertyReference1Impl(C30537i8.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0))};
    @NotNull

    /* renamed from: a */
    private final xj1 f80358a = yj1.m26872a(null);

    @Override // com.yandex.mobile.ads.impl.InterfaceC30599j3
    /* renamed from: a */
    public final void mo28535a(int i, @Nullable Bundle bundle) {
        InterfaceC30599j3 interfaceC30599j3 = (InterfaceC30599j3) this.f80358a.getValue(this, f80357b[0]);
        if (interfaceC30599j3 != null) {
            interfaceC30599j3.mo28535a(i, bundle);
            um0.m28725d(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void m33353a(@Nullable InterfaceC30599j3 interfaceC30599j3) {
        this.f80358a.setValue(this, f80357b[0], interfaceC30599j3);
    }
}
