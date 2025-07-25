package com.chartboost.sdk.impl;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;

/* renamed from: com.chartboost.sdk.impl.sd */
/* loaded from: classes3.dex */
public class C10205sd {

    /* renamed from: d */
    public static C10205sd f23138d = new C10205sd();

    /* renamed from: a */
    public WeakReference f23139a;

    /* renamed from: b */
    public boolean f23140b = false;

    /* renamed from: c */
    public boolean f23141c = false;

    /* renamed from: com.chartboost.sdk.impl.sd$a */
    /* loaded from: classes3.dex */
    public class C10206a extends BroadcastReceiver {
        public C10206a() {
            C10205sd.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C10205sd c10205sd;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c10205sd = C10205sd.this;
                z = c10205sd.f23141c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c10205sd = C10205sd.this;
                z = c10205sd.f23141c;
                z2 = false;
            } else {
                return;
            }
            c10205sd.m80588a(z2, z);
            C10205sd.this.f23140b = z2;
        }
    }

    /* renamed from: b */
    public static C10205sd m80587b() {
        return f23138d;
    }

    /* renamed from: a */
    public void m80592a() {
        Context context = (Context) this.f23139a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m80588a(this.f23140b, isDeviceLocked);
        this.f23141c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m80591a(Context context) {
        if (context == null) {
            return;
        }
        this.f23139a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C10206a(), intentFilter);
    }

    /* renamed from: a */
    public void m80588a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f23141c || this.f23140b)) {
            return;
        }
        for (C9746bc c9746bc : C10300vc.m80229c().m80231b()) {
            c9746bc.m81974k().m80570b(z2 || z);
        }
    }
}
