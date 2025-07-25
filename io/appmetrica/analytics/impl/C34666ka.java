package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ka */
/* loaded from: classes9.dex */
public final class C34666ka implements InterfaceC35045yj {
    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
