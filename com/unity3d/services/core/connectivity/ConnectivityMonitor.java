package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class ConnectivityMonitor {
    private static int _connected = -1;
    private static Set<IConnectivityListener> _listeners = null;
    private static boolean _listening = false;
    private static int _networkType = -1;
    private static boolean _webappMonitoring = false;
    private static boolean _wifi = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.core.connectivity.ConnectivityMonitor$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C289241 {

        /* renamed from: $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent */
        static final /* synthetic */ int[] f74983xede9def6;

        static {
            int[] iArr = new int[ConnectivityEvent.values().length];
            f74983xede9def6 = iArr;
            try {
                iArr[ConnectivityEvent.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74983xede9def6[ConnectivityEvent.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74983xede9def6[ConnectivityEvent.NETWORK_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void addListener(IConnectivityListener iConnectivityListener) {
        if (_listeners == null) {
            _listeners = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        _listeners.add(iConnectivityListener);
        updateListeningStatus();
    }

    public static void connected() {
        if (_connected == 1) {
            return;
        }
        DeviceLog.debug("Unity Ads connectivity change: connected");
        initConnectionStatus();
        Set<IConnectivityListener> set = _listeners;
        if (set != null) {
            for (IConnectivityListener iConnectivityListener : set) {
                iConnectivityListener.onConnected();
            }
        }
        sendToWebview(ConnectivityEvent.CONNECTED, _wifi, _networkType);
    }

    public static void connectionStatusChanged() {
        NetworkInfo activeNetworkInfo;
        int i;
        boolean z = true;
        if (_connected == 1 && (activeNetworkInfo = ((ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() != 1) {
                z = false;
            }
            try {
                i = ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                i = -1;
            }
            boolean z2 = _wifi;
            if (z == z2 && (i == _networkType || z2)) {
                return;
            }
            _wifi = z;
            _networkType = i;
            DeviceLog.debug("Unity Ads connectivity change: network change");
            sendToWebview(ConnectivityEvent.NETWORK_CHANGE, z, i);
        }
    }

    public static void disconnected() {
        if (_connected == 0) {
            return;
        }
        _connected = 0;
        DeviceLog.debug("Unity Ads connectivity change: disconnected");
        Set<IConnectivityListener> set = _listeners;
        if (set != null) {
            for (IConnectivityListener iConnectivityListener : set) {
                iConnectivityListener.onDisconnected();
            }
        }
        sendToWebview(ConnectivityEvent.DISCONNECTED, false, 0);
    }

    private static void initConnectionStatus() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            _connected = 1;
            if (activeNetworkInfo.getType() == 1) {
                z = true;
            }
            _wifi = z;
            if (!z) {
                try {
                    _networkType = ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
                    return;
                } catch (SecurityException unused) {
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                    return;
                }
            }
            return;
        }
        _connected = 0;
    }

    public static void removeListener(IConnectivityListener iConnectivityListener) {
        Set<IConnectivityListener> set = _listeners;
        if (set == null) {
            return;
        }
        set.remove(iConnectivityListener);
        updateListeningStatus();
    }

    private static void sendToWebview(ConnectivityEvent connectivityEvent, boolean z, int i) {
        WebViewApp currentApp;
        if (_webappMonitoring && (currentApp = WebViewApp.getCurrentApp()) != null && currentApp.isWebAppLoaded()) {
            int i2 = C289241.f74983xede9def6[connectivityEvent.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (z) {
                            currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, Boolean.valueOf(z), 0);
                            return;
                        } else {
                            currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, Boolean.valueOf(z), Integer.valueOf(i));
                            return;
                        }
                    }
                    return;
                }
                currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.DISCONNECTED, new Object[0]);
            } else if (z) {
                currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, Boolean.valueOf(z), 0);
            } else {
                currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, Boolean.valueOf(z), Integer.valueOf(i));
            }
        }
    }

    public static void setConnectionMonitoring(boolean z) {
        _webappMonitoring = z;
        updateListeningStatus();
    }

    private static void startListening() {
        if (_listening) {
            return;
        }
        _listening = true;
        initConnectionStatus();
        ConnectivityNetworkCallback.register();
    }

    public static void stopAll() {
        _listeners = null;
        _webappMonitoring = false;
        updateListeningStatus();
    }

    private static void stopListening() {
        if (!_listening) {
            return;
        }
        _listening = false;
        ConnectivityNetworkCallback.unregister();
    }

    private static void updateListeningStatus() {
        Set<IConnectivityListener> set;
        if (!_webappMonitoring && ((set = _listeners) == null || set.isEmpty())) {
            stopListening();
        } else {
            startListening();
        }
    }
}
