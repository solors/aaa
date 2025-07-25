package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.i0 */
/* loaded from: classes9.dex */
public final class ServiceConnectionC34602i0 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C34629j0 f94588a;

    public ServiceConnectionC34602i0(C34629j0 c34629j0) {
        this.f94588a = c34629j0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f94588a) {
            this.f94588a.f94650d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f94588a.f94651e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f94588a) {
            this.f94588a.f94650d = null;
        }
    }
}
