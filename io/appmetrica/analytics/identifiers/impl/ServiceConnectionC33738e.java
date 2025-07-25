package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: io.appmetrica.analytics.identifiers.impl.e */
/* loaded from: classes9.dex */
public final class ServiceConnectionC33738e implements ServiceConnection {

    /* renamed from: a */
    public final Intent f92524a;

    /* renamed from: b */
    public IBinder f92525b;

    /* renamed from: c */
    public final Object f92526c = new Object();

    public ServiceConnectionC33738e(Intent intent, String str) {
        this.f92524a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }

    /* renamed from: a */
    public final void m22797a(Context context) {
        synchronized (this.f92526c) {
            this.f92525b = null;
            this.f92526c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f92526c) {
            this.f92525b = null;
            this.f92526c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f92526c) {
            this.f92526c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f92526c) {
            this.f92525b = iBinder;
            this.f92526c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f92526c) {
            this.f92525b = null;
            this.f92526c.notifyAll();
        }
    }
}
