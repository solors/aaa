package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Ij */
/* loaded from: classes9.dex */
public final class C33974Ij implements ServiceWakeLock {

    /* renamed from: a */
    public final Context f93036a;

    /* renamed from: b */
    public final C33950Hj f93037b;

    /* renamed from: c */
    public final HashMap f93038c = new HashMap();

    public C33974Ij(@NotNull Context context, @NotNull C33950Hj c33950Hj) {
        this.f93036a = context;
        this.f93037b = c33950Hj;
    }

    @NotNull
    /* renamed from: a */
    public final String m22538a(@NotNull String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        boolean z;
        z = true;
        if (this.f93038c.get(str) == null) {
            HashMap hashMap = this.f93038c;
            C33950Hj c33950Hj = this.f93037b;
            Context context = this.f93036a;
            String m22538a = m22538a(str);
            c33950Hj.f92971a.getClass();
            Intent intent = new Intent(context, AppMetricaService.class);
            intent.setAction(m22538a);
            ServiceConnectionC33925Gj serviceConnectionC33925Gj = new ServiceConnectionC33925Gj();
            try {
                context.bindService(intent, serviceConnectionC33925Gj, 1);
            } catch (Throwable unused) {
                serviceConnectionC33925Gj = null;
            }
            hashMap.put(str, serviceConnectionC33925Gj);
        }
        if (this.f93038c.get(str) == null) {
            z = false;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f93038c.get(str);
        if (serviceConnection != null) {
            C33950Hj c33950Hj = this.f93037b;
            m22538a(str);
            Context context = this.f93036a;
            c33950Hj.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f93038c.remove(str);
        }
    }
}
