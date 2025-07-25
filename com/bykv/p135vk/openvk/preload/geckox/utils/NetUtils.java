package com.bykv.p135vk.openvk.preload.geckox.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.e */
/* loaded from: classes3.dex */
public final class NetUtils {
    /* renamed from: a */
    public static String m91215a(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                    return InterfaceC32663coo2iico.coo2iico;
                }
                switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
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
                        return "unknow";
                }
            }
            return "unknow";
        } catch (Throwable th) {
            GeckoLogger.m91260w("gecko-debug-tag", "getNetworkState:", th);
            return "null";
        }
    }
}
