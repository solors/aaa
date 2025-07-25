package com.amazon.device.ads;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;

/* loaded from: classes2.dex */
class DtbNetworkState {
    public static final DtbNetworkState INSTANCE = new DtbNetworkState();
    private final ConnectivityManager connectivityManager = (ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity");

    private DtbNetworkState() {
    }

    public boolean isWifiConnection() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getTypeName().equals(InterfaceC32663coo2iico.coo2iico)) {
            return true;
        }
        return false;
    }
}
