package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.impl.InterfaceC34871s1;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.internal.a */
/* loaded from: classes9.dex */
public final class BinderC35077a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        InterfaceC34871s1 interfaceC34871s1;
        interfaceC34871s1 = AppMetricaService.f95705c;
        interfaceC34871s1.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i, Bundle bundle) {
        InterfaceC34871s1 interfaceC34871s1;
        interfaceC34871s1 = AppMetricaService.f95705c;
        interfaceC34871s1.reportData(i, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        InterfaceC34871s1 interfaceC34871s1;
        interfaceC34871s1 = AppMetricaService.f95705c;
        interfaceC34871s1.resumeUserSession(bundle);
    }
}
