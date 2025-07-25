package com.meevii.adsdk.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.ironsource.C20747r8;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class AdsdkNetWorkUtil {
    @SuppressLint({"MissingPermission"})
    public static String getIpAddress(Context context) {
        String intToIp;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
            if (networkInfo.isConnected()) {
                intToIp = getLocalIpAddress();
            } else if (!networkInfo2.isConnected()) {
                return "";
            } else {
                intToIp = intToIp(((WifiManager) context.getApplicationContext().getSystemService(C20747r8.f52730b)).getConnectionInfo().getIpAddress());
            }
            return intToIp;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getLocalIpAddress() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (AdsdkInetAddressUtils.isIPv4Address(hostAddress)) {
                            return hostAddress;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            Log.e("localip", e.toString());
            return null;
        }
    }

    private static String intToIp(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }
}
