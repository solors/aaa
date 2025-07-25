package com.unity3d.player;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes7.dex */
public class NetworkConnectivityNougat extends NetworkConnectivity {

    /* renamed from: b */
    private int f74578b;

    /* renamed from: c */
    private final ConnectivityManager.NetworkCallback f74579c;

    /* renamed from: com.unity3d.player.NetworkConnectivityNougat$a */
    /* loaded from: classes7.dex */
    class C28714a extends ConnectivityManager.NetworkCallback {
        C28714a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            NetworkConnectivityNougat networkConnectivityNougat;
            int i;
            super.onCapabilitiesChanged(network, networkCapabilities);
            if (networkCapabilities.hasTransport(0)) {
                networkConnectivityNougat = NetworkConnectivityNougat.this;
                i = 1;
            } else {
                networkConnectivityNougat = NetworkConnectivityNougat.this;
                i = 2;
            }
            networkConnectivityNougat.f74578b = i;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            NetworkConnectivityNougat.this.f74578b = 0;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            NetworkConnectivityNougat.this.f74578b = 0;
        }
    }

    public NetworkConnectivityNougat(Context context) {
        super(context);
        this.f74578b = 0;
        C28714a c28714a = new C28714a();
        this.f74579c = c28714a;
        if (this.f74577a == null) {
            return;
        }
        this.f74578b = super.mo37719b();
        this.f74577a.registerDefaultNetworkCallback(c28714a);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    /* renamed from: a */
    public void mo37720a() {
        ConnectivityManager connectivityManager = this.f74577a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.f74579c);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    /* renamed from: b */
    public int mo37719b() {
        return this.f74578b;
    }
}
