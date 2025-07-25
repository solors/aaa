package com.maticoo.sdk.utils.request.network.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.PermissionUtil;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;

/* loaded from: classes6.dex */
public class NetworkChecker {

    /* loaded from: classes6.dex */
    public enum NetType {
        NO_PERMISSION(-1, "NO_PERMISSION"),
        UNKNOWN(0, "NULL"),
        ETHERNET(1, "ETHERNET"),
        WIFI(2, InterfaceC32663coo2iico.coo2iico),
        MOBILE(3, "NULL"),
        MOBILE_2G(4, "2G"),
        MOBILE_3G(5, "3G"),
        MOBILE_4G(6, "4G"),
        MOBILE_5G(7, "5G"),
        MOBILE_6G(8, "6G");
        
        private String mLabel;
        private int mValue;

        NetType(int i, String str) {
            this.mValue = i;
            this.mLabel = str;
        }

        public String getLabel() {
            return this.mLabel;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public static NetType getConnectType(Context context) {
        NetworkInfo networkInfo;
        if (context == null) {
            return NetType.UNKNOWN;
        }
        if (!PermissionUtil.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return NetType.NO_PERMISSION;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetType netType = null;
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 9) {
                        netType = NetType.UNKNOWN;
                    } else {
                        netType = NetType.ETHERNET;
                    }
                } else {
                    netType = NetType.WIFI;
                }
            } else {
                netType = getMobileNetType(context);
            }
        }
        if (netType == null) {
            return NetType.UNKNOWN;
        }
        return netType;
    }

    private static NetType getMobileNetType(Context context) {
        if (!PermissionUtil.hasPermission(context, "android.permission.READ_PHONE_STATE")) {
            return NetType.NO_PERMISSION;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return NetType.MOBILE;
        }
        try {
            int networkType = telephonyManager.getNetworkType();
            if (networkType != 20) {
                switch (networkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return NetType.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return NetType.MOBILE_3G;
                    case 13:
                    case 16:
                    case 17:
                        return NetType.MOBILE_4G;
                    default:
                        return NetType.MOBILE;
                }
            }
            return NetType.MOBILE_5G;
        } catch (Exception unused) {
            return NetType.MOBILE;
        }
    }

    public static String getNetworkOperator(Context context) {
        if (context == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager.getNetworkOperator() + telephonyManager.getNetworkOperatorName();
    }

    public static boolean isAvailable(Context context) {
        if (context == null) {
            context = ApplicationUtil.getInstance().getApplicationContext();
        }
        if (NetType.UNKNOWN.getValue() != getConnectType(context).getValue()) {
            return true;
        }
        return false;
    }
}
