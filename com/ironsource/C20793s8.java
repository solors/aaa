package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* renamed from: com.ironsource.s8 */
/* loaded from: classes6.dex */
public class C20793s8 {

    /* renamed from: a */
    public static final String f52861a = "NETWORK_TYPE_WIFI";

    /* renamed from: b */
    public static final String f52862b = "NETWORK_TYPE_UNKNOWN";

    /* renamed from: c */
    public static final String f52863c = "NETWORK_TYPE_GPRS";

    /* renamed from: d */
    public static final String f52864d = "NETWORK_TYPE_EDGE";

    /* renamed from: e */
    public static final String f52865e = "NETWORK_TYPE_UMTS";

    /* renamed from: f */
    public static final String f52866f = "NETWORK_TYPE_CDMA";

    /* renamed from: g */
    public static final String f52867g = "NETWORK_TYPE_EVDO_0";

    /* renamed from: h */
    public static final String f52868h = "NETWORK_TYPE_EVDO_A";

    /* renamed from: i */
    public static final String f52869i = "NETWORK_TYPE_1xRTT";

    /* renamed from: j */
    public static final String f52870j = "NETWORK_TYPE_HSDPA";

    /* renamed from: k */
    public static final String f52871k = "NETWORK_TYPE_HSUPA";

    /* renamed from: l */
    public static final String f52872l = "NETWORK_TYPE_HSPA";

    /* renamed from: m */
    public static final String f52873m = "NETWORK_TYPE_IDEN";

    /* renamed from: n */
    public static final String f52874n = "NETWORK_TYPE_EVDO_B";

    /* renamed from: o */
    public static final String f52875o = "NETWORK_TYPE_LTE";

    /* renamed from: p */
    public static final String f52876p = "NETWORK_TYPE_EHRPD";

    /* renamed from: q */
    public static final String f52877q = "NETWORK_TYPE_HSPAP";

    /* renamed from: r */
    public static final String f52878r = "NETWORK_TYPE_GSM";

    /* renamed from: s */
    public static final String f52879s = "NETWORK_TYPE_TD_SCDMA";

    /* renamed from: t */
    public static final String f52880t = "NETWORK_TYPE_IWLAN";

    /* renamed from: u */
    public static final String f52881u = "NETWORK_TYPE_LTE_CA";

    /* renamed from: v */
    public static final String f52882v = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static Network m55382a(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m55379b(Context context) {
        return m55380a(m55382a(context), context);
    }

    /* renamed from: c */
    private static String m55377c(Context context) {
        String m55543a = C20747r8.m55543a(context);
        if (TextUtils.isEmpty(m55543a)) {
            return "none";
        }
        return m55543a;
    }

    /* renamed from: d */
    public static String m55376d(Context context) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return f52862b;
        }
        if (networkCapabilities.hasTransport(1)) {
            return f52861a;
        }
        if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            return m55383a(activeNetworkInfo.getSubtype());
        }
        return f52862b;
    }

    /* renamed from: e */
    public static boolean m55375e(Context context) {
        return m55378b(context, m55382a(context)).equals("vpn");
    }

    /* renamed from: a */
    private static String m55383a(int i) {
        switch (i) {
            case 1:
                return f52863c;
            case 2:
                return f52864d;
            case 3:
                return f52865e;
            case 4:
                return f52866f;
            case 5:
                return f52867g;
            case 6:
                return f52868h;
            case 7:
                return f52869i;
            case 8:
                return f52870j;
            case 9:
                return f52871k;
            case 10:
                return f52872l;
            case 11:
                return f52873m;
            case 12:
                return f52874n;
            case 13:
                return f52875o;
            case 14:
                return f52876p;
            case 15:
                return f52877q;
            case 16:
                return f52878r;
            case 17:
                return f52879s;
            case 18:
                return f52880t;
            case 19:
                return f52881u;
            case 20:
                return f52882v;
            default:
                return f52862b;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private static String m55378b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return C20747r8.f52730b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return C20747r8.f52735g;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return C20747r8.f52733e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return C20747r8.f52736h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return C20747r8.f52737i;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return C20747r8.f52732d;
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return "";
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static String m55380a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return m55377c(context);
            }
            return networkCapabilities.hasTransport(1) ? C20747r8.f52730b : networkCapabilities.hasTransport(0) ? C20747r8.f52729a : m55377c(context);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static JSONObject m55381a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(C21114v8.C21123i.f54170v, m55375e(context));
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return jSONObject;
    }
}
