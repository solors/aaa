package com.taurusx.tax.p606j.p616z;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.taurusx.tax.j.z.b */
/* loaded from: classes7.dex */
public final class ServiceConnectionC28562b implements ServiceConnection {

    /* renamed from: a */
    public boolean f74050a = false;

    /* renamed from: b */
    public final LinkedBlockingQueue<IBinder> f74051b = new LinkedBlockingQueue<>(1);

    /* renamed from: a */
    public IBinder m37926a() throws InterruptedException {
        if (!this.f74050a) {
            this.f74050a = true;
            return this.f74051b.take();
        }
        throw new IllegalStateException();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f74051b.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
