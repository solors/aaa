package p992u3;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.text.TextUtils;
import com.ironsource.C20747r8;

/* renamed from: u3.b */
/* loaded from: classes6.dex */
public class NetworkUtils {

    /* renamed from: a */
    private static String f116602a;

    /* renamed from: b */
    private static C44423b f116603b;

    /* compiled from: NetworkUtils.java */
    @TargetApi(21)
    /* renamed from: u3.b$b */
    /* loaded from: classes6.dex */
    private static class C44423b extends ConnectivityManager.NetworkCallback {
        private C44423b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            String unused = NetworkUtils.f116602a = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            String unused = NetworkUtils.f116602a = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            String unused = NetworkUtils.f116602a = null;
        }
    }

    /* renamed from: b */
    private static String m3039b(Context context) {
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "unset";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return C20747r8.f52730b;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && activeNetworkInfo != null) {
            NetworkInfo.State state2 = networkInfo2.getState();
            String subtypeName = networkInfo2.getSubtypeName();
            if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype != 20) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            if (subtypeName == null) {
                                return "no_network";
                            }
                            if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                                return "no_network";
                            }
                            return "3G";
                    }
                }
                return "5G";
            }
        }
        return "no_network";
    }

    /* renamed from: c */
    public static String m3038c(Context context) {
        if (m3037d(f116602a)) {
            return f116602a;
        }
        String m3039b = m3039b(context);
        f116602a = m3039b;
        return m3039b;
    }

    /* renamed from: d */
    private static boolean m3037d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equals("2G") && !str.equals("3G") && !str.equals("4G") && !str.equals("5G") && !str.equals(C20747r8.f52730b)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m3036e(Context context) {
        if (context == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    /* renamed from: f */
    public static void m3035f(Context context) {
        try {
            if (f116603b == null) {
                f116603b = new C44423b();
            }
            NetworkRequest build = new NetworkRequest.Builder().build();
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(build, f116603b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
