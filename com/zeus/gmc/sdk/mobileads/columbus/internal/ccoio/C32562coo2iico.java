package com.zeus.gmc.sdk.mobileads.columbus.internal.ccoio;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.util.recourse.tracker.NetState;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccoio.coo2iico */
/* loaded from: classes8.dex */
public class C32562coo2iico {
    public static final int c2oc2i = 5;
    private static final String cioccoiococ = "NetworkUtils";
    public static final int coi222o222 = 20000;
    public static final int coo2iico = 5000;

    private C32562coo2iico() {
    }

    public static boolean c2oc2i(Context context) {
        return true;
    }

    public static String coi222o222(Context context) {
        return coo2iico(context).name();
    }

    public static boolean coo2iico(Context context, int i) {
        return true;
    }

    private static NetState coo2iico(Context context) {
        AndroidUtils.avoidOnMainThread();
        try {
        } catch (Exception e) {
            MLog.m25891d(cioccoiococ, "getNetState", e);
        }
        if (context == null) {
            return NetState.NONE;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) AndroidUtils.getApplicationContext(context).getSystemService("connectivity");
        if (connectivityManager == null) {
            return NetState.NONE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return NetState.WIFI;
            }
            return coo2iico(activeNetworkInfo.getSubtype());
        }
        return NetState.NONE;
    }

    private static NetState coo2iico(int i) {
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
