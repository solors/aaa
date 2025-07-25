package com.zeus.gmc.sdk.mobileads.columbus.internal.coi2ccc2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi2ccc2.c2oc2i */
/* loaded from: classes8.dex */
public class ServiceConnectionC32709c2oc2i implements ServiceConnection {
    boolean coo2iico = false;
    private final BlockingQueue<IBinder> coi222o222 = new LinkedBlockingQueue();

    public IBinder coo2iico() throws InterruptedException {
        if (!this.coo2iico) {
            this.coo2iico = true;
            return this.coi222o222.take();
        }
        throw new IllegalStateException();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.coi222o222.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
