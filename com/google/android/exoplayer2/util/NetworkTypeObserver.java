package com.google.android.exoplayer2.util;

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
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class NetworkTypeObserver {
    @Nullable

    /* renamed from: e */
    private static NetworkTypeObserver f36122e;

    /* renamed from: a */
    private final Handler f36123a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<Listener>> f36124b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f36125c = new Object();
    @GuardedBy("networkTypeLock")

    /* renamed from: d */
    private int f36126d = 0;

    @RequiresApi(31)
    /* loaded from: classes4.dex */
    private static final class Api31 {

        /* loaded from: classes4.dex */
        public static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            private final NetworkTypeObserver f36127a;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
                this.f36127a = networkTypeObserver;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                boolean z;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i = 5;
                if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
                    z = false;
                } else {
                    z = true;
                }
                NetworkTypeObserver networkTypeObserver = this.f36127a;
                if (z) {
                    i = 10;
                }
                networkTypeObserver.m72575h(i);
            }
        }

        private Api31() {
        }

        public static void disambiguate4gAnd5gNsa(Context context, NetworkTypeObserver networkTypeObserver) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) Assertions.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                DisplayInfoCallback displayInfoCallback = new DisplayInfoCallback(networkTypeObserver);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, displayInfoCallback);
                telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
            } catch (RuntimeException unused) {
                networkTypeObserver.m72575h(5);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        void onNetworkTypeChanged(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class Receiver extends BroadcastReceiver {
        private Receiver() {
            NetworkTypeObserver.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int m72578e = NetworkTypeObserver.m72578e(context);
            if (Util.SDK_INT < 31 || m72578e != 5) {
                NetworkTypeObserver.this.m72575h(m72578e);
            } else {
                Api31.disambiguate4gAnd5gNsa(context, NetworkTypeObserver.this);
            }
        }
    }

    private NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Receiver(), intentFilter);
    }

    /* renamed from: a */
    public static /* synthetic */ void m72582a(NetworkTypeObserver networkTypeObserver, Listener listener) {
        networkTypeObserver.m72577f(listener);
    }

    /* renamed from: d */
    private static int m72579d(NetworkInfo networkInfo) {
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
                if (Util.SDK_INT >= 29) {
                    return 9;
                }
                return 0;
        }
    }

    /* renamed from: e */
    public static int m72578e(Context context) {
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
                        if (type != 4 && type != 5) {
                            if (type == 6) {
                                return 5;
                            }
                            if (type != 9) {
                                return 8;
                            }
                            return 7;
                        }
                    } else {
                        return 2;
                    }
                }
                return m72579d(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* renamed from: f */
    public /* synthetic */ void m72577f(Listener listener) {
        listener.onNetworkTypeChanged(getNetworkType());
    }

    /* renamed from: g */
    private void m72576g() {
        Iterator<WeakReference<Listener>> it = this.f36124b.iterator();
        while (it.hasNext()) {
            WeakReference<Listener> next = it.next();
            if (next.get() == null) {
                this.f36124b.remove(next);
            }
        }
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
        NetworkTypeObserver networkTypeObserver;
        synchronized (NetworkTypeObserver.class) {
            if (f36122e == null) {
                f36122e = new NetworkTypeObserver(context);
            }
            networkTypeObserver = f36122e;
        }
        return networkTypeObserver;
    }

    /* renamed from: h */
    public void m72575h(int i) {
        synchronized (this.f36125c) {
            if (this.f36126d == i) {
                return;
            }
            this.f36126d = i;
            Iterator<WeakReference<Listener>> it = this.f36124b.iterator();
            while (it.hasNext()) {
                WeakReference<Listener> next = it.next();
                Listener listener = next.get();
                if (listener != null) {
                    listener.onNetworkTypeChanged(i);
                } else {
                    this.f36124b.remove(next);
                }
            }
        }
    }

    @VisibleForTesting
    public static synchronized void resetForTests() {
        synchronized (NetworkTypeObserver.class) {
            f36122e = null;
        }
    }

    public int getNetworkType() {
        int i;
        synchronized (this.f36125c) {
            i = this.f36126d;
        }
        return i;
    }

    public void register(final Listener listener) {
        m72576g();
        this.f36124b.add(new WeakReference<>(listener));
        this.f36123a.post(new Runnable() { // from class: com.google.android.exoplayer2.util.d
            @Override // java.lang.Runnable
            public final void run() {
                NetworkTypeObserver.m72582a(NetworkTypeObserver.this, listener);
            }
        });
    }
}
