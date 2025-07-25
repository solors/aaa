package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.impl.eg */
/* loaded from: classes2.dex */
public final class C4326eg {

    /* renamed from: e */
    private static C4326eg f5908e;

    /* renamed from: a */
    private final Handler f5909a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList f5910b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final Object f5911c = new Object();

    /* renamed from: d */
    private int f5912d = 0;

    /* renamed from: com.applovin.impl.eg$b */
    /* loaded from: classes2.dex */
    public static final class C4328b {

        /* renamed from: a */
        private static volatile boolean f5913a;
    }

    /* renamed from: com.applovin.impl.eg$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4329c {
        /* renamed from: a */
        void mo96871a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.eg$d */
    /* loaded from: classes2.dex */
    public final class C4330d extends BroadcastReceiver {
        private C4330d() {
            C4326eg.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int m99516c = C4326eg.m99516c(context);
            int i = AbstractC5863xp.f12151a;
            if (i >= 29 && !C4328b.f5913a && m99516c == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) AbstractC4100b1.m100583a((TelephonyManager) context.getSystemService("phone"));
                    C4331e c4331e = new C4331e();
                    if (i < 31) {
                        telephonyManager.listen(c4331e, 1);
                    } else {
                        telephonyManager.listen(c4331e, 1048576);
                    }
                    telephonyManager.listen(c4331e, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            C4326eg.this.m99525a(m99516c);
        }
    }

    /* renamed from: com.applovin.impl.eg$e */
    /* loaded from: classes2.dex */
    private class C4331e extends PhoneStateListener {
        private C4331e() {
            C4326eg.this = r1;
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            boolean z;
            int i;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType != 3 && overrideNetworkType != 4) {
                z = false;
            } else {
                z = true;
            }
            C4326eg c4326eg = C4326eg.this;
            if (z) {
                i = 10;
            } else {
                i = 5;
            }
            c4326eg.m99525a(i);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2;
            boolean z;
            int i;
            if (serviceState == null) {
                serviceState2 = "";
            } else {
                serviceState2 = serviceState.toString();
            }
            if (!serviceState2.contains("nrState=CONNECTED") && !serviceState2.contains("nrState=NOT_RESTRICTED")) {
                z = false;
            } else {
                z = true;
            }
            C4326eg c4326eg = C4326eg.this;
            if (z) {
                i = 10;
            } else {
                i = 5;
            }
            c4326eg.m99525a(i);
        }
    }

    private C4326eg(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C4330d(), intentFilter);
    }

    /* renamed from: a */
    public static /* synthetic */ void m99520a(C4326eg c4326eg, InterfaceC4329c interfaceC4329c) {
        c4326eg.m99522a(interfaceC4329c);
    }

    /* renamed from: c */
    public static int m99516c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 9) {
                            if (type != 4 && type != 5) {
                                if (type == 6) {
                                    return 5;
                                }
                                return 8;
                            }
                        } else {
                            return 7;
                        }
                    } else {
                        return 2;
                    }
                }
                return m99523a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* renamed from: b */
    public void m99517b(final InterfaceC4329c interfaceC4329c) {
        m99519b();
        this.f5910b.add(new WeakReference(interfaceC4329c));
        this.f5909a.post(new Runnable() { // from class: com.applovin.impl.zu
            @Override // java.lang.Runnable
            public final void run() {
                C4326eg.m99520a(C4326eg.this, interfaceC4329c);
            }
        });
    }

    /* renamed from: a */
    private static int m99523a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return AbstractC5863xp.f12151a >= 29 ? 9 : 0;
        }
    }

    /* renamed from: b */
    private void m99519b() {
        Iterator it = this.f5910b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f5910b.remove(weakReference);
            }
        }
    }

    /* renamed from: a */
    public int m99526a() {
        int i;
        synchronized (this.f5911c) {
            i = this.f5912d;
        }
        return i;
    }

    /* renamed from: b */
    public static synchronized C4326eg m99518b(Context context) {
        C4326eg c4326eg;
        synchronized (C4326eg.class) {
            if (f5908e == null) {
                f5908e = new C4326eg(context);
            }
            c4326eg = f5908e;
        }
        return c4326eg;
    }

    /* renamed from: a */
    public /* synthetic */ void m99522a(InterfaceC4329c interfaceC4329c) {
        interfaceC4329c.mo96871a(m99526a());
    }

    /* renamed from: a */
    public void m99525a(int i) {
        synchronized (this.f5911c) {
            if (this.f5912d == i) {
                return;
            }
            this.f5912d = i;
            Iterator it = this.f5910b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC4329c interfaceC4329c = (InterfaceC4329c) weakReference.get();
                if (interfaceC4329c != null) {
                    interfaceC4329c.mo96871a(i);
                } else {
                    this.f5910b.remove(weakReference);
                }
            }
        }
    }
}
