package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class j91 {
    @Nullable

    /* renamed from: e */
    private static j91 f80799e;

    /* renamed from: a */
    private final Handler f80800a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<InterfaceC30611b>> f80801b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f80802c = new Object();
    @GuardedBy("networkTypeLock")

    /* renamed from: d */
    private int f80803d = 0;

    @RequiresApi(31)
    /* renamed from: com.yandex.mobile.ads.impl.j91$a */
    /* loaded from: classes8.dex */
    private static final class C30609a {

        /* renamed from: com.yandex.mobile.ads.impl.j91$a$a */
        /* loaded from: classes8.dex */
        public static final class C30610a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            private final j91 f80804a;

            public C30610a(j91 j91Var) {
                this.f80804a = j91Var;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                boolean z;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i = 5;
                if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
                    z = false;
                } else {
                    z = true;
                }
                j91 j91Var = this.f80804a;
                if (z) {
                    i = 10;
                }
                j91Var.m33016a(i);
            }
        }

        /* renamed from: a */
        public static void m33008a(Context context, j91 j91Var) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C30610a c30610a = new C30610a(j91Var);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, c30610a);
                telephonyManager.unregisterTelephonyCallback(c30610a);
            } catch (RuntimeException unused) {
                j91Var.m33016a(5);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.j91$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30611b {
        /* renamed from: a */
        void mo27123a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.j91$c */
    /* loaded from: classes8.dex */
    public final class C30612c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int m33012b = j91.m33012b(context);
            if (y32.f88010a < 31 || m33012b != 5) {
                j91.this.m33016a(m33012b);
            } else {
                C30609a.m33008a(context, j91.this);
            }
        }

        private C30612c() {
            j91.this = r1;
        }
    }

    private j91(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C30612c(), intentFilter);
    }

    /* renamed from: a */
    public static /* synthetic */ void m33013a(j91 j91Var, InterfaceC30611b interfaceC30611b) {
        j91Var.m33014a(interfaceC30611b);
    }

    /* renamed from: b */
    public static int m33012b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
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
                    return y32.f88010a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final int m33017a() {
        int i;
        synchronized (this.f80802c) {
            i = this.f80803d;
        }
        return i;
    }

    /* renamed from: a */
    public /* synthetic */ void m33014a(InterfaceC30611b interfaceC30611b) {
        interfaceC30611b.mo27123a(m33017a());
    }

    /* renamed from: a */
    public void m33016a(int i) {
        synchronized (this.f80802c) {
            if (this.f80803d == i) {
                return;
            }
            this.f80803d = i;
            Iterator<WeakReference<InterfaceC30611b>> it = this.f80801b.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC30611b> next = it.next();
                InterfaceC30611b interfaceC30611b = next.get();
                if (interfaceC30611b != null) {
                    interfaceC30611b.mo27123a(i);
                } else {
                    this.f80801b.remove(next);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m33011b(final InterfaceC30611b interfaceC30611b) {
        Iterator<WeakReference<InterfaceC30611b>> it = this.f80801b.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC30611b> next = it.next();
            if (next.get() == null) {
                this.f80801b.remove(next);
            }
        }
        this.f80801b.add(new WeakReference<>(interfaceC30611b));
        this.f80800a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.qq2
            @Override // java.lang.Runnable
            public final void run() {
                j91.m33013a(j91.this, interfaceC30611b);
            }
        });
    }

    /* renamed from: a */
    public static synchronized j91 m33015a(Context context) {
        j91 j91Var;
        synchronized (j91.class) {
            if (f80799e == null) {
                f80799e = new j91(context);
            }
            j91Var = f80799e;
        }
        return j91Var;
    }
}
