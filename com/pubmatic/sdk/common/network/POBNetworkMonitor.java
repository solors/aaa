package com.pubmatic.sdk.common.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SuppressLint({"MissingPermission"})
/* loaded from: classes7.dex */
public class POBNetworkMonitor {
    @NonNull

    /* renamed from: a */
    private final Context f70230a;
    @Nullable

    /* renamed from: c */
    private final ConnectivityManager f70232c;
    @Nullable
    protected List<POBConnectivityListener> connectivityListeners;
    @NonNull

    /* renamed from: b */
    private ConnectionType f70231b = ConnectionType.UNKNOWN;
    @Nullable

    /* renamed from: d */
    private C26716e f70233d = null;

    /* renamed from: e */
    private boolean f70234e = false;

    /* loaded from: classes7.dex */
    public enum ConnectionType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR_NETWORK_UN(3),
        CELLULAR_NETWORK_2G(4),
        CELLULAR_NETWORK_3G(5),
        CELLULAR_NETWORK_4G(6),
        CELLULAR_NETWORK_5G(7);
        

        /* renamed from: b */
        private final int f70236b;

        ConnectionType(int i) {
            this.f70236b = i;
        }

        public int getValue() {
            return this.f70236b;
        }
    }

    /* loaded from: classes7.dex */
    public interface POBConnectivityListener {
        @MainThread
        void onNetworkConnectionChanged(boolean z);

        void onNetworkRegistrationFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkMonitor$a */
    /* loaded from: classes7.dex */
    public class C26712a implements C26716e.InterfaceC26717a {

        /* renamed from: a */
        final /* synthetic */ TelephonyManager f70237a;

        C26712a(TelephonyManager telephonyManager) {
            this.f70237a = telephonyManager;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.C26716e.InterfaceC26717a
        /* renamed from: a */
        public void mo40570a(TelephonyDisplayInfo telephonyDisplayInfo) {
            POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
            pOBNetworkMonitor.f70231b = pOBNetworkMonitor.m40580a(telephonyDisplayInfo);
            if (POBNetworkMonitor.this.f70233d != null) {
                this.f70237a.unregisterTelephonyCallback(POBNetworkMonitor.this.f70233d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkMonitor$b */
    /* loaded from: classes7.dex */
    public class C26713b extends PhoneStateListener {

        /* renamed from: a */
        final /* synthetic */ TelephonyManager f70239a;

        C26713b(TelephonyManager telephonyManager) {
            this.f70239a = telephonyManager;
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(@NonNull TelephonyDisplayInfo telephonyDisplayInfo) {
            super.onDisplayInfoChanged(telephonyDisplayInfo);
            POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
            pOBNetworkMonitor.f70231b = pOBNetworkMonitor.m40580a(telephonyDisplayInfo);
            this.f70239a.listen(this, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkMonitor$c */
    /* loaded from: classes7.dex */
    public class RunnableC26714c implements Runnable {
        RunnableC26714c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBNetworkMonitor.this.m40575b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkMonitor$d */
    /* loaded from: classes7.dex */
    public class C26715d extends ConnectivityManager.NetworkCallback {
        private C26715d() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            POBNetworkMonitor.this.m40582a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            POBNetworkMonitor.this.m40582a();
        }

        /* synthetic */ C26715d(POBNetworkMonitor pOBNetworkMonitor, C26712a c26712a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 31)
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkMonitor$e */
    /* loaded from: classes7.dex */
    public static class C26716e extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        @NonNull

        /* renamed from: a */
        private final InterfaceC26717a f70243a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.pubmatic.sdk.common.network.POBNetworkMonitor$e$a */
        /* loaded from: classes7.dex */
        public interface InterfaceC26717a {
            /* renamed from: a */
            void mo40570a(TelephonyDisplayInfo telephonyDisplayInfo);
        }

        public C26716e(@NonNull InterfaceC26717a interfaceC26717a) {
            this.f70243a = interfaceC26717a;
        }

        @Override // android.telephony.TelephonyCallback.DisplayInfoListener
        public void onDisplayInfoChanged(@NonNull TelephonyDisplayInfo telephonyDisplayInfo) {
            this.f70243a.mo40570a(telephonyDisplayInfo);
        }
    }

    public POBNetworkMonitor(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f70230a = applicationContext;
        this.f70232c = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        m40573c();
        updateConnectionType();
    }

    /* renamed from: d */
    private void m40571d() {
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) this.f70230a.getSystemService("phone");
        if (telephonyManager == null) {
            this.f70231b = ConnectionType.CELLULAR_NETWORK_UN;
        } else if (Build.VERSION.SDK_INT >= 30) {
            m40579a(telephonyManager);
        } else {
            try {
                i = telephonyManager.getNetworkType();
            } catch (Exception e) {
                POBLog.error("POBNetworkMonitor", "Failed to get telephony manager :" + e.getMessage(), new Object[0]);
                i = 0;
            }
            this.f70231b = m40581a(i);
        }
    }

    @NonNull
    public ConnectionType getConnectionType() {
        return this.f70231b;
    }

    public boolean isNetworkAvailable() {
        return isNetworkAvailable(this.f70230a);
    }

    public boolean isWiFiConnected() {
        if (this.f70231b == ConnectionType.WIFI) {
            return true;
        }
        return false;
    }

    @MainThread
    public void registerConnectivityListener(POBConnectivityListener pOBConnectivityListener) {
        if (!this.f70234e) {
            if (this.connectivityListeners == null) {
                this.connectivityListeners = new ArrayList(1);
            }
            this.connectivityListeners.add(pOBConnectivityListener);
            return;
        }
        pOBConnectivityListener.onNetworkRegistrationFailed();
    }

    @MainThread
    public void resetConnectivityListener() {
        List<POBConnectivityListener> list = this.connectivityListeners;
        if (list != null) {
            list.clear();
            this.connectivityListeners = null;
        }
    }

    @MainThread
    public void unregisterConnectivityListener(@Nullable POBConnectivityListener pOBConnectivityListener) {
        List<POBConnectivityListener> list;
        if (pOBConnectivityListener != null && (list = this.connectivityListeners) != null && list.contains(pOBConnectivityListener)) {
            this.connectivityListeners.remove(pOBConnectivityListener);
            if (this.connectivityListeners.isEmpty()) {
                this.connectivityListeners = null;
            }
        }
    }

    public void updateConnectionType() {
        NetworkInfo networkInfo;
        if (this.f70232c != null && POBUtils.hasPermission(this.f70230a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                networkInfo = this.f70232c.getActiveNetworkInfo();
            } catch (Exception e) {
                POBLog.warn("POBNetworkMonitor", "Failed to get active network info :" + e.getMessage(), new Object[0]);
                networkInfo = null;
            }
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type == 9) {
                            this.f70231b = ConnectionType.ETHERNET;
                            return;
                        }
                        return;
                    }
                    this.f70231b = ConnectionType.WIFI;
                    return;
                }
                m40571d();
                return;
            }
            this.f70231b = ConnectionType.UNKNOWN;
            return;
        }
        this.f70231b = ConnectionType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: b */
    public void m40575b() {
        updateConnectionType();
        if (this.connectivityListeners != null) {
            for (int i = 0; i < this.connectivityListeners.size(); i++) {
                POBConnectivityListener pOBConnectivityListener = this.connectivityListeners.get(i);
                if (pOBConnectivityListener != null) {
                    pOBConnectivityListener.onNetworkConnectionChanged(isNetworkAvailable(this.f70230a));
                }
            }
        }
    }

    /* renamed from: c */
    private void m40573c() {
        ConnectivityManager connectivityManager = this.f70232c;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C26715d(this, null));
                this.f70234e = false;
            } catch (RuntimeException e) {
                this.f70234e = true;
                POBLog.warn("POBNetworkMonitor", "Failed to register network callback :" + e.getMessage(), new Object[0]);
            }
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !POBUtils.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Exception e) {
            POBLog.warn("POBNetworkMonitor", "Failed to check network availability :" + e.getMessage(), new Object[0]);
        }
        return false;
    }

    @RequiresApi(api = 30)
    /* renamed from: a */
    private void m40579a(@NonNull TelephonyManager telephonyManager) {
        if (POBUtils.hasPermission(this.f70230a, "android.permission.READ_PHONE_STATE")) {
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    C26716e c26716e = new C26716e(new C26712a(telephonyManager));
                    this.f70233d = c26716e;
                    telephonyManager.registerTelephonyCallback(newSingleThreadExecutor, c26716e);
                } else {
                    telephonyManager.listen(new C26713b(telephonyManager), 1048576);
                }
                return;
            } catch (Exception e) {
                this.f70231b = ConnectionType.CELLULAR_NETWORK_UN;
                POBLog.warn("POBNetworkMonitor", "Not able fetch connection type due to " + e.getMessage(), new Object[0]);
                return;
            }
        }
        this.f70231b = ConnectionType.CELLULAR_NETWORK_UN;
        POBLog.warn("POBNetworkMonitor", "Not able fetch connection type due to android.permission.READ_PHONE_STATE permission is not available for the app!", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 30)
    /* renamed from: a */
    public ConnectionType m40580a(@NonNull TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        int overrideNetworkType2;
        int overrideNetworkType3;
        int networkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType != 2) {
            overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType2 != 3) {
                overrideNetworkType3 = telephonyDisplayInfo.getOverrideNetworkType();
                if (overrideNetworkType3 != 5) {
                    networkType = telephonyDisplayInfo.getNetworkType();
                    return m40581a(networkType);
                }
            }
        }
        return ConnectionType.CELLULAR_NETWORK_5G;
    }

    /* renamed from: a */
    private ConnectionType m40581a(int i) {
        if (i != 20) {
            switch (i) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return ConnectionType.CELLULAR_NETWORK_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return ConnectionType.CELLULAR_NETWORK_3G;
                case 13:
                    return ConnectionType.CELLULAR_NETWORK_4G;
                default:
                    return ConnectionType.CELLULAR_NETWORK_UN;
            }
        }
        return ConnectionType.CELLULAR_NETWORK_5G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @AnyThread
    /* renamed from: a */
    public void m40582a() {
        POBUtils.runOnMainThread(new RunnableC26714c());
    }
}
