package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(31)
/* loaded from: classes2.dex */
public final class AFi1tSDK extends AFi1xSDK {
    @NotNull
    private String AFInAppEventParameterName;
    @Nullable
    private Network valueOf;

    /* loaded from: classes2.dex */
    public static final class AFa1vSDK extends ConnectivityManager.NetworkCallback {
        AFa1vSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1tSDK.this.valueOf = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1tSDK.this.valueOf = network;
            AFi1tSDK.this.AFInAppEventParameterName = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AFInAppEventParameterName = "unknown";
        AFa1vSDK aFa1vSDK = new AFa1vSDK();
        try {
            ConnectivityManager connectivityManager = this.AFKeystoreWrapper;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1vSDK);
            }
        } catch (Throwable th) {
            AFg1cSDK.e$default(AFLogger.INSTANCE, AFg1bSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    @NotNull
    protected final String values() {
        NetworkCapabilities networkCapabilities;
        Network network = this.valueOf;
        if (network != null) {
            ConnectivityManager connectivityManager = this.AFKeystoreWrapper;
            if (connectivityManager != null) {
                networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            } else {
                networkCapabilities = null;
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return InterfaceC32663coo2iico.coo2iico;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean AFInAppEventParameterName() {
        Network network = this.valueOf;
        if (network != null) {
            if (!(!Intrinsics.m17075f(this.AFInAppEventParameterName, "NetworkLost"))) {
                network = null;
            }
            if (network != null) {
                ConnectivityManager connectivityManager = this.AFKeystoreWrapper;
                NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
                if (networkCapabilities != null) {
                    return AFInAppEventParameterName(networkCapabilities);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static boolean AFInAppEventParameterName(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }
}
