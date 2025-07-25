package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.ironsource.InterfaceC21142vm;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* loaded from: classes6.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private ConnectivityManager f49928a;

    /* renamed from: b */
    private InterfaceC21142vm f49929b;

    /* renamed from: c */
    private boolean f49930c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.environment.NetworkStateReceiver$a */
    /* loaded from: classes6.dex */
    public class RunnableC19842a implements Runnable {
        RunnableC19842a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkStateReceiver.this.f49929b != null) {
                NetworkStateReceiver.this.f49929b.mo54398a(NetworkStateReceiver.this.f49930c);
            }
        }
    }

    public NetworkStateReceiver(Context context, InterfaceC21142vm interfaceC21142vm) {
        this.f49929b = interfaceC21142vm;
        if (context != null) {
            this.f49928a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        m58766a();
    }

    /* renamed from: b */
    private void m58764b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new RunnableC19842a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getExtras() != null && m58766a()) {
            m58764b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m58766a() {
        /*
            r5 = this;
            boolean r0 = r5.f49930c
            android.net.ConnectivityManager r1 = r5.f49928a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L16
            boolean r1 = r1.isConnectedOrConnecting()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r3
        L17:
            r5.f49930c = r1     // Catch: java.lang.Exception -> L1a
            goto L24
        L1a:
            r1 = move-exception
            com.ironsource.i9 r4 = com.ironsource.C20086i9.m57997d()
            r4.m58003a(r1)
        L22:
            r5.f49930c = r3
        L24:
            boolean r1 = r5.f49930c
            if (r0 == r1) goto L29
            goto L2a
        L29:
            r2 = r3
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.m58766a():boolean");
    }
}
