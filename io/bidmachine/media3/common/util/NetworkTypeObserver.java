package io.bidmachine.media3.common.util;

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

@UnstableApi
/* loaded from: classes9.dex */
public final class NetworkTypeObserver {
    @Nullable
    private static NetworkTypeObserver staticInstance;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<Listener>> listeners = new CopyOnWriteArrayList<>();
    private final Object networkTypeLock = new Object();
    @GuardedBy("networkTypeLock")
    private int networkType = 0;

    /* loaded from: classes9.dex */
    public interface Listener {
        void onNetworkTypeChanged(int i);
    }

    @RequiresApi(31)
    /* renamed from: io.bidmachine.media3.common.util.NetworkTypeObserver$b */
    /* loaded from: classes9.dex */
    private static final class C35907b {

        /* renamed from: io.bidmachine.media3.common.util.NetworkTypeObserver$b$a */
        /* loaded from: classes9.dex */
        public static final class C35908a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final NetworkTypeObserver instance;

            public C35908a(NetworkTypeObserver networkTypeObserver) {
                this.instance = networkTypeObserver;
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
                NetworkTypeObserver networkTypeObserver = this.instance;
                if (z) {
                    i = 10;
                }
                networkTypeObserver.updateNetworkType(i);
            }
        }

        private C35907b() {
        }

        public static void disambiguate4gAnd5gNsa(Context context, NetworkTypeObserver networkTypeObserver) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) Assertions.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                C35908a c35908a = new C35908a(networkTypeObserver);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, c35908a);
                telephonyManager.unregisterTelephonyCallback(c35908a);
            } catch (RuntimeException unused) {
                networkTypeObserver.updateNetworkType(5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.media3.common.util.NetworkTypeObserver$c */
    /* loaded from: classes9.dex */
    public final class C35909c extends BroadcastReceiver {
        private C35909c() {
            NetworkTypeObserver.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int networkTypeFromConnectivityManager = NetworkTypeObserver.getNetworkTypeFromConnectivityManager(context);
            if (Util.SDK_INT < 31 || networkTypeFromConnectivityManager != 5) {
                NetworkTypeObserver.this.updateNetworkType(networkTypeFromConnectivityManager);
            } else {
                C35907b.disambiguate4gAnd5gNsa(context, NetworkTypeObserver.this);
            }
        }
    }

    private NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C35909c(), intentFilter);
    }

    /* renamed from: a */
    public static /* synthetic */ void m19939a(NetworkTypeObserver networkTypeObserver, Listener listener) {
        networkTypeObserver.lambda$register$0(listener);
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
        NetworkTypeObserver networkTypeObserver;
        synchronized (NetworkTypeObserver.class) {
            if (staticInstance == null) {
                staticInstance = new NetworkTypeObserver(context);
            }
            networkTypeObserver = staticInstance;
        }
        return networkTypeObserver;
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
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

    public static int getNetworkTypeFromConnectivityManager(Context context) {
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
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public /* synthetic */ void lambda$register$0(Listener listener) {
        listener.onNetworkTypeChanged(getNetworkType());
    }

    private void removeClearedReferences() {
        Iterator<WeakReference<Listener>> it = this.listeners.iterator();
        while (it.hasNext()) {
            WeakReference<Listener> next = it.next();
            if (next.get() == null) {
                this.listeners.remove(next);
            }
        }
    }

    @VisibleForTesting
    public static synchronized void resetForTests() {
        synchronized (NetworkTypeObserver.class) {
            staticInstance = null;
        }
    }

    public void updateNetworkType(int i) {
        synchronized (this.networkTypeLock) {
            if (this.networkType == i) {
                return;
            }
            this.networkType = i;
            Iterator<WeakReference<Listener>> it = this.listeners.iterator();
            while (it.hasNext()) {
                WeakReference<Listener> next = it.next();
                Listener listener = next.get();
                if (listener != null) {
                    listener.onNetworkTypeChanged(i);
                } else {
                    this.listeners.remove(next);
                }
            }
        }
    }

    public int getNetworkType() {
        int i;
        synchronized (this.networkTypeLock) {
            i = this.networkType;
        }
        return i;
    }

    public void register(final Listener listener) {
        removeClearedReferences();
        this.listeners.add(new WeakReference<>(listener));
        this.mainHandler.post(new Runnable() { // from class: io.bidmachine.media3.common.util.d
            @Override // java.lang.Runnable
            public final void run() {
                NetworkTypeObserver.m19939a(NetworkTypeObserver.this, listener);
            }
        });
    }
}
