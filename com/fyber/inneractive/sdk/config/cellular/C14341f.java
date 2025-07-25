package com.fyber.inneractive.sdk.config.cellular;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fyber.inneractive.sdk.util.AbstractC15453j;
import com.fyber.inneractive.sdk.util.EnumC15433Y;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.cellular.f */
/* loaded from: classes4.dex */
public final class C14341f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public InterfaceC14343h f27158a;

    /* renamed from: b */
    public final ConnectivityManager f27159b;

    public C14341f(ConnectivityManager connectivityManager, InterfaceC14343h interfaceC14343h) {
        this.f27158a = interfaceC14343h;
        this.f27159b = connectivityManager;
    }

    /* renamed from: a */
    public final void m77979a() {
        this.f27158a = null;
        ConnectivityManager connectivityManager = this.f27159b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.m76530a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void m77978b() {
        ConnectivityManager connectivityManager = this.f27159b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.m76530a("failed to register network callback", th, new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public final void m77977c() {
        ConnectivityManager connectivityManager = this.f27159b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.m76530a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        EnumC15433Y enumC15433Y = EnumC15433Y.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            enumC15433Y = EnumC15433Y.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            int m76498l = AbstractC15453j.m76498l();
            if (m76498l != 0) {
                if (m76498l != 3) {
                    if (m76498l != 18) {
                        if (m76498l != 20) {
                            if (m76498l != 5 && m76498l != 6) {
                                switch (m76498l) {
                                    default:
                                        switch (m76498l) {
                                            case 12:
                                            case 14:
                                            case 15:
                                                break;
                                            case 13:
                                                enumC15433Y = EnumC15433Y.MOBILE_4G;
                                                break;
                                            default:
                                                enumC15433Y = EnumC15433Y.CELLULAR;
                                                break;
                                        }
                                    case 8:
                                    case 9:
                                    case 10:
                                        enumC15433Y = EnumC15433Y.MOBILE_3G;
                                        break;
                                }
                            }
                        } else {
                            enumC15433Y = EnumC15433Y.MOBILE_5G;
                        }
                    } else {
                        enumC15433Y = EnumC15433Y.WIFI;
                    }
                }
                enumC15433Y = EnumC15433Y.MOBILE_3G;
            }
        } else if (networkCapabilities.hasTransport(1)) {
            enumC15433Y = EnumC15433Y.WIFI;
        }
        InterfaceC14343h interfaceC14343h = this.f27158a;
        if (interfaceC14343h != null) {
            interfaceC14343h.mo77973a(enumC15433Y);
        }
    }
}
