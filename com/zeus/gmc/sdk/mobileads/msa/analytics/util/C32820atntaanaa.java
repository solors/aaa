package com.zeus.gmc.sdk.mobileads.msa.analytics.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RequiresPermission;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.util.atntaanaa */
/* loaded from: classes8.dex */
public class C32820atntaanaa {
    public static final int atnaaata = 10;
    public static final int atnananannnt = 5;
    public static final int atnattat = 4;
    public static final int atnntnannta = 0;
    public static final int atntaanaa = 2;
    public static final int atntatt = 0;
    public static final int atntntntanaan = 1;

    private C32820atntaanaa() {
    }

    private static boolean atnaaata(int i) {
        if (20 == i) {
            return true;
        }
        return false;
    }

    public static boolean atnntnannta(int i) {
        return i == 1 || i == 2 || i == 4 || i == 7 || i == 11;
    }

    private static boolean atntaanaa(int i) {
        if (i != 13 && i != 18 && i != 19) {
            return false;
        }
        return true;
    }

    private static boolean atntntntanaan(int i) {
        switch (i) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            case 13:
            default:
                return false;
        }
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_NETWORK_STATE"})
    public static int atnntnannta(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 10;
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (atnntnannta(subtype)) {
            return 1;
        }
        if (atntntntanaan(subtype)) {
            return 2;
        }
        if (atntaanaa(subtype)) {
            return 4;
        }
        return atnaaata(subtype) ? 5 : 0;
    }
}
