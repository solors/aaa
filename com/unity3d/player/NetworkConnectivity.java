package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes7.dex */
public class NetworkConnectivity extends Activity {

    /* renamed from: a */
    protected ConnectivityManager f74577a;

    public NetworkConnectivity(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f74577a = connectivityManager;
        if (connectivityManager == null) {
            AbstractC28798u.Log(6, "NetworkConnectivity: ConnectivityManager not found");
        }
    }

    /* renamed from: b */
    public int mo37719b() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f74577a;
        if (connectivityManager == null) {
            return 0;
        }
        if (PlatformSupport.MARSHMALLOW_SUPPORT) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = this.f74577a.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasTransport(0)) {
                    return 1;
                }
                return 2;
            }
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 0) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo37720a() {
    }
}
