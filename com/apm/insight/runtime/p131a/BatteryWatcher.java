package com.apm.insight.runtime.p131a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.Ensure;
import com.apm.insight.runtime.MonitorCrashInner;
import com.apm.insight.runtime.NpthHandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.apm.insight.runtime.a.d */
/* loaded from: classes2.dex */
public final class BatteryWatcher {

    /* renamed from: a */
    private int f4028a;

    /* compiled from: BatteryWatcher.java */
    /* renamed from: com.apm.insight.runtime.a.d$a */
    /* loaded from: classes2.dex */
    class C3849a extends BroadcastReceiver {
        private C3849a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    BatteryWatcher.this.f4028a = (int) ((intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100));
                }
            } catch (Throwable unused) {
            }
        }

        /* synthetic */ C3849a(BatteryWatcher batteryWatcher, byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BatteryWatcher(final Context context) {
        NpthHandlerThread.m101339a().m101309a(new Runnable() { // from class: com.apm.insight.runtime.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    context.registerReceiver(new C3849a(BatteryWatcher.this, (byte) 0), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (Throwable th) {
                    Ensure.m102051a();
                    MonitorCrashInner.m101391a(th, "NPTH_CATCH");
                }
            }
        });
    }

    /* renamed from: a */
    public final int m101445a() {
        return this.f4028a;
    }
}
