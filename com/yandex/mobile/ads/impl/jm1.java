package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.monetization.ads.exo.offline.C25575c;
import com.monetization.ads.exo.scheduler.Requirements;
import com.yandex.mobile.ads.impl.jm1;

/* loaded from: classes8.dex */
public final class jm1 {

    /* renamed from: a */
    private final Context f80999a;

    /* renamed from: b */
    private final InterfaceC30639b f81000b;

    /* renamed from: c */
    private final Requirements f81001c;

    /* renamed from: d */
    private final Handler f81002d;

    /* renamed from: e */
    private int f81003e;
    @Nullable

    /* renamed from: f */
    private C30640c f81004f;

    /* renamed from: com.yandex.mobile.ads.impl.jm1$a */
    /* loaded from: classes8.dex */
    public class C30638a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                jm1 jm1Var = jm1.this;
                int m44305a = jm1Var.f81001c.m44305a(jm1Var.f80999a);
                if (jm1Var.f81003e != m44305a) {
                    jm1Var.f81003e = m44305a;
                    jm1Var.f81000b.mo32843a(jm1Var, m44305a);
                }
            }
        }

        private C30638a() {
            jm1.this = r1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30639b {
        /* renamed from: a */
        void mo32843a(jm1 jm1Var, int i);
    }

    @RequiresApi(24)
    /* renamed from: com.yandex.mobile.ads.impl.jm1$c */
    /* loaded from: classes8.dex */
    public final class C30640c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        private boolean f81006a;

        /* renamed from: b */
        private boolean f81007b;

        /* renamed from: a */
        public static /* synthetic */ void m32841a(C30640c c30640c) {
            c30640c.m32840b();
        }

        /* renamed from: b */
        public static /* synthetic */ void m32839b(C30640c c30640c) {
            c30640c.m32842a();
        }

        /* renamed from: c */
        private void m32838c() {
            jm1.this.f81002d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.yq2
                @Override // java.lang.Runnable
                public final void run() {
                    jm1.C30640c.m32839b(jm1.C30640c.this);
                }
            });
        }

        /* renamed from: d */
        private void m32837d() {
            jm1.this.f81002d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.zq2
                @Override // java.lang.Runnable
                public final void run() {
                    jm1.C30640c.m32841a(jm1.C30640c.this);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            m32838c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            if (!z) {
                m32837d();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.f81006a && this.f81007b == hasCapability) {
                if (hasCapability) {
                    m32837d();
                    return;
                }
                return;
            }
            this.f81006a = true;
            this.f81007b = hasCapability;
            m32838c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            m32838c();
        }

        private C30640c() {
            jm1.this = r1;
        }

        /* renamed from: a */
        public void m32842a() {
            int m44305a;
            jm1 jm1Var = jm1.this;
            if (jm1Var.f81004f == null || jm1Var.f81003e == (m44305a = jm1Var.f81001c.m44305a(jm1Var.f80999a))) {
                return;
            }
            jm1Var.f81003e = m44305a;
            jm1Var.f81000b.mo32843a(jm1Var, m44305a);
        }

        /* renamed from: b */
        public void m32840b() {
            int m44305a;
            jm1 jm1Var = jm1.this;
            if (jm1Var.f81004f == null || (jm1Var.f81003e & 3) == 0 || jm1Var.f81003e == (m44305a = jm1Var.f81001c.m44305a(jm1Var.f80999a))) {
                return;
            }
            jm1Var.f81003e = m44305a;
            jm1Var.f81000b.mo32843a(jm1Var, m44305a);
        }
    }

    public jm1(Context context, InterfaceC30639b interfaceC30639b) {
        Requirements requirements = C25575c.f66383h;
        this.f80999a = context.getApplicationContext();
        this.f81000b = interfaceC30639b;
        this.f81001c = requirements;
        this.f81002d = y32.m27064b();
    }

    /* renamed from: a */
    public final int m32851a() {
        this.f81003e = this.f81001c.m44305a(this.f80999a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f81001c.m44302e()) {
            if (y32.f88010a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f80999a.getSystemService("connectivity");
                connectivityManager.getClass();
                C30640c c30640c = new C30640c();
                this.f81004f = c30640c;
                connectivityManager.registerDefaultNetworkCallback(c30640c);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f81001c.m44304c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f81001c.m44303d()) {
            if (y32.f88010a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f81001c.m44301f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f80999a.registerReceiver(new C30638a(), intentFilter, null, this.f81002d);
        return this.f81003e;
    }
}
