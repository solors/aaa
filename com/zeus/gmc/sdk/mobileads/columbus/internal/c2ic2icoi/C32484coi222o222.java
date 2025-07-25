package com.zeus.gmc.sdk.mobileads.columbus.internal.c2ic2icoi;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresPermission;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import com.zeus.gmc.sdk.mobileads.columbus.util.network.manager.NetworkManager;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ic2icoi.coi222o222 */
/* loaded from: classes8.dex */
public class C32484coi222o222 {
    private static final String coo2iico = "NetworkUtils";

    private C32484coi222o222() {
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean coi222o222() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) NetworkManager.coi222o222().coo2iico().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(12);
        } catch (Exception e) {
            MLog.m25891d(coo2iico, "", e);
            return false;
        }
    }

    private static String coo2iico(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return InterfaceC32663coo2iico.coi222o222;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return InterfaceC32663coo2iico.c2oc2i;
            case 13:
            case 18:
            case 19:
                return InterfaceC32663coo2iico.cioccoiococ;
            case 20:
                return InterfaceC32663coo2iico.c2oc2o;
            default:
                return InterfaceC32663coo2iico.cco22;
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static String coo2iico() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) NetworkManager.coi222o222().coo2iico().getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? InterfaceC32663coo2iico.cco22 : activeNetworkInfo.getType() == 1 ? InterfaceC32663coo2iico.coo2iico : coo2iico(activeNetworkInfo.getSubtype());
        } catch (Exception e) {
            MLog.m25891d(coo2iico, "", e);
            return InterfaceC32663coo2iico.cco22;
        }
    }
}
