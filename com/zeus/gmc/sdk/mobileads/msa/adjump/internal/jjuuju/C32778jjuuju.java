package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.analytics.NetState;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32793jujujpjjp;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju.jjuuju */
/* loaded from: classes8.dex */
public class C32778jjuuju {
    private static String jujujpjjp = "NetworkUtils";

    private static NetState jujujpjjp(Context context) {
        C32793jujujpjjp.jujujpjjp();
        try {
        } catch (Exception e) {
            MLog.m25880d(jujujpjjp, "getNetState", e);
        }
        if (context == null) {
            return NetState.NONE;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return NetState.NONE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return NetState.WIFI;
            }
            return jujujpjjp(activeNetworkInfo.getSubtype());
        }
        return NetState.NONE;
    }

    public static String uppjpjj(Context context) {
        return jujujpjjp(context).name();
    }

    private static void jujujpjjp() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new RuntimeException("do not run on main thread.");
        }
    }

    private static NetState jujujpjjp(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetState.MN2G;
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
                return NetState.MN3G;
            case 13:
            case 18:
            case 19:
                return NetState.MN4G;
            case 20:
                return NetState.MN5G;
            default:
                return NetState.NONE;
        }
    }
}
