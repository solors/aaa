package com.pgl.ssdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.ironsource.C20747r8;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.json.JSONArray;

/* renamed from: com.pgl.ssdk.f0 */
/* loaded from: classes7.dex */
public class C26631f0 {
    /* renamed from: a */
    private static void m40872a(LinkProperties linkProperties, JSONArray jSONArray) {
        for (InetAddress inetAddress : linkProperties.getDnsServers()) {
            if (inetAddress != null) {
                jSONArray.put(inetAddress.getHostAddress());
            }
        }
    }

    /* renamed from: b */
    private static void m40870b(LinkProperties linkProperties, JSONArray jSONArray) {
        InetAddress gateway;
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway = routeInfo.getGateway()) != null && (!(gateway instanceof Inet6Address) || !"::".equals(gateway.getHostAddress()))) {
                jSONArray.put(gateway.getHostAddress());
            }
        }
    }

    /* renamed from: c */
    private static void m40869c(LinkProperties linkProperties, JSONArray jSONArray) {
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (linkAddress != null && linkAddress.getAddress() != null && !linkAddress.getAddress().isLoopbackAddress()) {
                jSONArray.put(linkAddress.getAddress().getHostAddress());
            }
        }
    }

    /* renamed from: a */
    public static String[] m40873a(Context context) {
        Network[] allNetworks;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        int type;
        String[] strArr = new String[5];
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            for (Network network : allNetworks) {
                if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getState() == NetworkInfo.State.CONNECTED && (linkProperties = connectivityManager.getLinkProperties(network)) != null && ((type = networkInfo.getType()) == 0 || type == 1)) {
                    m40872a(linkProperties, jSONArray5);
                    if (type == 0) {
                        m40869c(linkProperties, jSONArray);
                        m40870b(linkProperties, jSONArray2);
                    } else {
                        m40869c(linkProperties, jSONArray3);
                        m40870b(linkProperties, jSONArray4);
                    }
                }
            }
            strArr[0] = jSONArray3.toString();
            strArr[1] = jSONArray4.toString();
            strArr[2] = jSONArray.toString();
            strArr[3] = jSONArray2.toString();
            strArr[4] = jSONArray5.toString();
        }
        return strArr;
    }

    /* renamed from: b */
    public static String m40871b(Context context) {
        String str;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(C20747r8.f52730b);
        if (wifiManager != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(wifiManager.isWifiEnabled() ? "1" : "0");
            str = sb2.toString();
        } else {
            str = "0";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(telephonyManager.getSimState() != 5 ? "0" : "1");
            return sb3.toString();
        }
        return str + "0";
    }
}
