package com.taurusx.tax.p606j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28530n;
import com.taurusx.tax.p606j.p613b0.EnumC28492b;
import com.taurusx.tax.p606j.p614c0.C28516c;
import com.taurusx.tax.p606j.p616z.C28561a;
import com.taurusx.tax.p606j.p616z.C28563c;
import com.taurusx.tax.p606j.p616z.ServiceConnectionC28562b;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.e */
/* loaded from: classes7.dex */
public class C28518e {
    /* renamed from: a */
    public static int m38042a(Context context, float f) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public static String m38026b(Context context) {
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String string = Settings.System.getString(context.getContentResolver(), stringFogImpl.m23824a(new byte[]{-2, 106, -5, 118, -16, 109, -5, 91, -10, 96}, new byte[]{-97, 4}));
            try {
                String m23824a = stringFogImpl.m23824a(new byte[]{-124, Byte.MAX_VALUE, -123, 108, -123, 109, -120, 51, -126, 123, -100, 123, -111, 109, -107}, new byte[]{-16, 30});
                LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-81, 1, -66, 73, -70, 7, -65, 27, -76, 0, -65, 73, -78, 13, -5, 0, -88, 73}, new byte[]{-37, 105}) + string);
                return string;
            } catch (Exception unused) {
                return string;
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    /* renamed from: c */
    public static int m38017c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? 2 : 1;
    }

    /* renamed from: d */
    public static List<Node> m38012d(Node node, String str) {
        return m38018b(node, str, null, null);
    }

    /* renamed from: e */
    public static int m38011e(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m38010f(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService(C28162a.f73047a.m23824a(new byte[]{-126, -13, -113, -14, -124, -1, -107, -11, -105, -11, -107, -27}, new byte[]{-31, -100}))).getActiveNetworkInfo();
        } catch (Error | Exception e) {
            e.printStackTrace();
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static ArrayList<String> m38033a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.get(i).toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Node m38014c(Node node, String str) {
        return m38028a(node, str, null, null);
    }

    /* renamed from: d */
    public static float m38013d(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: c */
    public static boolean m38015c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Uri.parse(str).getScheme().equals(C28162a.f73047a.m23824a(new byte[]{-84, 48, -77, 58, -92, 37}, new byte[]{-63, 81}));
        } catch (Throwable th) {
            LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{-70, -3, -69, -18, -69, -17, -74}, new byte[]{-50, -100}), Log.getStackTraceString(th));
            return false;
        }
    }

    /* renamed from: a */
    public static void m38035a(WebView webView) {
        webView.setWebChromeClient(new C28516c());
    }

    /* renamed from: a */
    public static JSONObject m38032a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m38037a(Context context, String str) {
        boolean z;
        try {
            new URL(str);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            return z;
        }
        try {
            return m38041a(context, new Intent(C28162a.f73047a.m23824a(new byte[]{-98, 48, -101, 44, -112, 55, -101, 112, -106, 48, -117, 59, -111, 42, -47, 63, -100, 42, -106, 49, -111, 112, -87, 23, -70, 9}, new byte[]{-1, 94}), Uri.parse(str)));
        } catch (Exception unused2) {
            return z;
        }
    }

    /* renamed from: b */
    public static boolean m38021b(String str) {
        Uri parse;
        try {
        } catch (Throwable th) {
            LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{81, -13, 80, -32, 80, -31, 93}, new byte[]{37, -110}), Log.getStackTraceString(th));
        }
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !TextUtils.isEmpty(parse.getHost())) {
            byte[] bArr = {-113, 38, -98, 51, -47, 45, -112, 37, -104, 38, -102, 100, -100, 37, -110};
            byte[] bArr2 = {-1, 74};
            StringFogImpl stringFogImpl = C28162a.f73047a;
            if (!TextUtils.equals(stringFogImpl.m23824a(bArr, bArr2), parse.getHost())) {
                if (!TextUtils.equals(stringFogImpl.m23824a(new byte[]{-81, 30, -80, 20, -89, 11, -20, 30, -84, 27, -80, 16, -85, 27, -20, 28, -83, 18}, new byte[]{-62, Byte.MAX_VALUE}), parse.getHost())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m38016c(Context context, Intent intent) {
        C28530n.C28531a.m37994a(context);
        C28530n.C28531a.m37994a(intent);
        try {
            C28530n.m37997a(context);
            C28530n.m37997a(intent);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C28561a m38043a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                context.getPackageManager().getPackageInfo(stringFogImpl.m23824a(new byte[]{110, 110, 96, 47, 108, 111, 105, 115, 98, 104, 105, 47, 123, 100, 99, 101, 100, 111, 106}, new byte[]{13, 1}), 0);
                ServiceConnectionC28562b serviceConnectionC28562b = new ServiceConnectionC28562b();
                Intent intent = new Intent(stringFogImpl.m23824a(new byte[]{-97, -113, -111, -50, -101, -113, -109, -121, -112, -123, -46, -127, -110, -124, -114, -113, -107, -124, -46, -121, -111, -109, -46, -127, -104, -109, -46, -119, -104, -123, -110, -108, -107, -122, -107, -123, -114, -50, -113, -123, -114, -106, -107, -125, -103, -50, -81, -76, -67, -78, -88}, new byte[]{-4, -32}));
                intent.setPackage(stringFogImpl.m23824a(new byte[]{47, 40, 33, 105, 43, 40, 35, 32, 32, 34, 98, 38, 34, 35, 62, 40, 37, 35, 98, 32, 33, 52}, new byte[]{76, 71}));
                if (context.bindService(intent, serviceConnectionC28562b, 1)) {
                    try {
                        try {
                            C28563c c28563c = new C28563c(serviceConnectionC28562b.m37926a());
                            C28561a c28561a = new C28561a(c28563c.m37924c(), c28563c.m37925a(true));
                            String m23824a = stringFogImpl.m23824a(new byte[]{55, 58, 54, 41, 54, 40, 59}, new byte[]{67, 91});
                            LogUtil.m37905d(m23824a, stringFogImpl.m23824a(new byte[]{45, 29, 26, 28, 30, 13, 5, 10, 5, 23, 11, 48, 8, 58, 0, 16, 9, 23, 24, 89, 11, 28, 24, 89, 43, 56, 37, 61, 86, 89}, new byte[]{108, 121}) + c28561a.f74048a + stringFogImpl.m23824a(new byte[]{-15, -24, -94, -95, -67, -24, -68, -24, -91, -69, -15}, new byte[]{-47, -127}) + c28561a.f74049b);
                            return c28561a;
                        } finally {
                            context.unbindService(serviceConnectionC28562b);
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
                throw new IOException(stringFogImpl.m23824a(new byte[]{72, 28, 96, 20, 99, 22, 47, 35, 99, 18, 118, 83, 108, 28, 97, 29, 106, 16, 123, 26, 96, 29, 47, 21, 110, 26, 99, 22, 107}, new byte[]{15, 115}));
            } catch (Exception e2) {
                throw e2;
            }
        }
        throw new IllegalStateException(C28162a.f73047a.m23824a(new byte[]{56, 29, 21, 18, 20, 8, 91, 30, 30, 92, 24, 29, 23, 16, 30, 24, 91, 26, 9, 19, 22, 92, 15, 20, 30, 92, 22, 29, 18, 18, 91, 8, 19, 14, 30, 29, 31}, new byte[]{123, 124}), new Throwable());
    }

    /* renamed from: b */
    public static String m38020b(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static List<Node> m38018b(Node node, String str, String str2, List<String> list) {
        if (node == null || str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str) && m38027a(item, str2, list)) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Intent m38022b(Uri uri) throws Exception {
        if (EnumC28492b.HANDLE_SHARE_TWEET.shouldTryHandlingUrl(uri)) {
            try {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                String queryParameter = uri.getQueryParameter(stringFogImpl.m23824a(new byte[]{-12, -26, -11, -32, -30, -21, -40, -21, -26, -24, -30}, new byte[]{-121, -123}));
                String queryParameter2 = uri.getQueryParameter(stringFogImpl.m23824a(new byte[]{19, 110, 2, 124, 19, 70, 14, 125}, new byte[]{103, 25}));
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        String format = String.format(stringFogImpl.m23824a(new byte[]{118, -9, 80, -4, 94, -65, 90, -22, 65, -65, 117, -70, 70, -72, 70, -65, 97, -24, 80, -6, 65, -91, 21, -70, 70}, new byte[]{53, -97}), queryParameter, String.format(stringFogImpl.m23824a(new byte[]{103, -12, 123, -16, 124, -70, 32, -81, 123, -9, 102, -12, 123, -27, 125, -82, 108, -17, 98, -81, 42, -13, 32, -13, 123, -31, 123, -11, 124, -81, 42, -13}, new byte[]{15, UnsignedBytes.MAX_POWER_OF_TWO}), queryParameter, queryParameter2));
                        Intent intent = new Intent(stringFogImpl.m23824a(new byte[]{24, -39, 29, -59, 22, -34, 29, -103, 16, -39, 13, -46, 23, -61, 87, -42, 26, -61, 16, -40, 23, -103, 42, -14, 55, -13}, new byte[]{121, -73}));
                        intent.setType(stringFogImpl.m23824a(new byte[]{-46, 106, -34, 123, -119, Byte.MAX_VALUE, -54, 110, -49, 97}, new byte[]{-90, 15}));
                        intent.putExtra(stringFogImpl.m23824a(new byte[]{34, -55, 39, -43, 44, -50, 39, -119, 42, -55, 55, -62, 45, -45, 109, -62, 59, -45, 49, -58, 109, -12, 22, -27, 9, -30, 0, -13}, new byte[]{67, -89}), format);
                        intent.putExtra(stringFogImpl.m23824a(new byte[]{-36, -63, -39, -35, -46, -58, -39, -127, -44, -63, -55, -54, -45, -37, -109, -54, -59, -37, -49, -50, -109, -5, -8, -9, -23}, new byte[]{-67, -81}), format);
                        return intent;
                    }
                    throw new Exception(stringFogImpl.m23824a(new byte[]{98, UnsignedBytes.MAX_POWER_OF_TWO, 123, -14, 90, -69, 68, -95, 94, -68, 80, -14, 89, -67, 89, -1, 82, -65, 71, -90, 78, -14, 16, -90, SignedBytes.MAX_POWER_OF_TWO, -73, 82, -90, 104, -69, 83, -11, 23, -93, 66, -73, 69, -85, 23, -94, 86, -96, 86, -65, 82, -90, 82, -96, 25}, new byte[]{55, -46}));
                }
                throw new Exception(stringFogImpl.m23824a(new byte[]{-85, -104, -78, -22, -109, -93, -115, -71, -105, -92, -103, -22, -112, -91, -112, -25, -101, -89, -114, -66, -121, -22, -39, -71, -99, -72, -101, -81, -112, -107, -112, -85, -109, -81, -39, -22, -113, -65, -101, -72, -121, -22, -114, -85, -116, -85, -109, -81, -118, -81, -116, -28}, new byte[]{-2, -54}));
            } catch (UnsupportedOperationException unused) {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                String m23824a = stringFogImpl2.m23824a(new byte[]{-41, 47, -42, 60, -42, 61, -37}, new byte[]{-93, 78});
                LogUtil.m37905d(m23824a, stringFogImpl2.m23824a(new byte[]{7, -81, 49, -84, 32, -32, 42, -81, 48, -32, 44, -95, 42, -92, 40, -91, 100, -75, 54, -84, 126, -32}, new byte[]{68, -64}) + uri);
                throw new Exception(stringFogImpl2.m23824a(new byte[]{-36, -52, -1, -34, -23, -55, -95, -60, -30, -115, -39, -1, -64, -115, -24, -60, -24, -115, -30, -62, -8, -115, -17, -33, -23, -52, -8, -56, -84, -52, -84, -59, -27, -56, -2, -52, -2, -50, -28, -60, -17, -52, -32, -115, -39, -1, -59, -125}, new byte[]{-116, -83}));
            }
        }
        throw new Exception(C28162a.f73047a.m23824a(new byte[]{-2, 59, -25, 73, -49, 6, -50, 26, -117, 7, -60, 29, -117, 1, -54, 31, -50, 73, -33, 8, -45, 26, -61, 8, -39, 12, -111, 70, -124, 29, -36, 12, -50, 29, -108, 73, -51, 6, -39, 4, -54, 29, -123}, new byte[]{-85, 105}));
    }

    /* renamed from: a */
    public static Node m38028a(Node node, String str, String str2, List<String> list) {
        List<Node> m38018b;
        if (node == null || str == null || (m38018b = m38018b(node, str, str2, list)) == null || m38018b.isEmpty()) {
            return null;
        }
        return m38018b.get(0);
    }

    /* renamed from: a */
    public static Intent m38044a() {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        return new Intent(stringFogImpl.m23824a(new byte[]{97, 66, 100, 94, 111, 69, 100, 2, 105, 66, 116, 73, 110, 88, 46, 77, 99, 88, 105, 67, 110, 2, 86, 101, 69, 123}, new byte[]{0, 44}), Uri.parse(stringFogImpl.m23824a(new byte[]{-36, -46, -61, -40, -44, -57, -117, -100, -98, -41, -44, -57, -48, -38, -35, -64, -114, -38, -43, -114, -46, -36, -36, -99, -63, -46, -46, -40, -48, -44, -44, -99, -33, -46, -36, -42}, new byte[]{-79, -77})));
    }

    /* renamed from: a */
    public static boolean m38041a(Context context, Intent intent) {
        try {
            return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Intent m38036a(Uri uri) throws Exception {
        C28530n.m37997a(uri);
        if (EnumC28492b.OPEN_NATIVE_BROWSER.shouldTryHandlingUrl(uri)) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            if (stringFogImpl.m23824a(new byte[]{99, 113, 123, 121, 106, 113, 121, 117}, new byte[]{13, 16}).equals(uri.getHost())) {
                try {
                    String queryParameter = uri.getQueryParameter(stringFogImpl.m23824a(new byte[]{108, 53, 117}, new byte[]{25, 71}));
                    if (queryParameter != null) {
                        return new Intent(stringFogImpl.m23824a(new byte[]{-61, -84, -58, -80, -51, -85, -58, -20, -53, -84, -42, -89, -52, -74, -116, -93, -63, -74, -53, -83, -52, -20, -12, -117, -25, -107}, new byte[]{-94, -62}), Uri.parse(queryParameter));
                    }
                    throw new Exception(stringFogImpl.m23824a(new byte[]{46, -86, 55, -40, 22, -111, 8, -117, 18, -106, 28, -40, 92, -115, 9, -108, 92, -40, 10, -115, 30, -118, 2, -40, 11, -103, 9, -103, 22, -99, 15, -99, 9, -42}, new byte[]{123, -8}));
                } catch (UnsupportedOperationException unused) {
                    StringFogImpl stringFogImpl2 = C28162a.f73047a;
                    String m23824a = stringFogImpl2.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -20, -127, -1, -127, -2, -116}, new byte[]{-12, -115});
                    LogUtil.m37905d(m23824a, stringFogImpl2.m23824a(new byte[]{97, -35, 87, -34, 70, -110, 76, -35, 86, -110, 74, -45, 76, -42, 78, -41, 2, -57, 80, -34, 24, -110}, new byte[]{34, -78}) + uri);
                    throw new Exception(stringFogImpl2.m23824a(new byte[]{-82, 95, -115, 77, -101, 90, -45, 87, -112, 30, -85, 108, -78, 30, -102, 87, -102, 30, -112, 81, -118, 30, -99, 76, -101, 95, -118, 91, -34, 95, -34, 86, -105, 91, -116, 95, -116, 93, -106, 87, -99, 95, -110, 30, -85, 108, -73, 16}, new byte[]{-2, 62}));
                }
            }
            throw new Exception(stringFogImpl.m23824a(new byte[]{-14, 89, -21, 43, -54, 98, -44, 120, -50, 101, -64, 43, UnsignedBytes.MAX_POWER_OF_TWO, 101, -58, 125, -50, 108, -58, Byte.MAX_VALUE, -62, 44, -121, 99, -56, 120, -45, 43, -41, 106, -43, 106, -54, 110, -45, 110, -43, 37}, new byte[]{-89, 11}));
        }
        throw new Exception(C28162a.f73047a.m23824a(new byte[]{78, -119, 87, -5, Byte.MAX_VALUE, -76, 126, -88, 59, -75, 116, -81, 59, -77, 122, -83, 126, -5, 111, -70, 99, -75, 122, -81, 114, -83, 126, -71, 105, -76, 108, -88, 126, -87, 33, -12, 52, -5, 104, -72, 115, -66, 118, -66, 53}, new byte[]{27, -37}));
    }

    /* renamed from: b */
    public static void m38023b(Context context, String str) {
        EnumSet.of(EnumC28538u.NOOP);
        C28546w.m37982a();
        new C28546w(EnumSet.copyOf((EnumSet) C28546w.f73996d), new C28545v()).m37981a(context, str);
    }

    /* renamed from: b */
    public static Integer m38019b(Node node, String str) {
        if (node != null) {
            try {
                return Integer.valueOf(Integer.parseInt(m38029a(node, str)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m38024b(Context context, Uri uri, String str) throws C28535r {
        C28530n.m37997a(context);
        C28530n.m37997a(uri);
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{-38, 11, -37, 24, -37, 25, -42}, new byte[]{-82, 106});
        LogUtil.m37905d(m23824a, stringFogImpl.m23824a(new byte[]{-97, 51, -73, 59, -75, 122, -116, 8, -112, 122, -83, 53, -7, 41, -79, 53, -82, 122, -80, 52, -7, 56, -85, 53, -82, 41, -68, 40, -29, 122}, new byte[]{-39, 90}) + uri);
        Bundle bundle = new Bundle();
        bundle.putString(stringFogImpl.m23824a(new byte[]{32, -121, 57}, new byte[]{117, -43}), uri.toString());
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(stringFogImpl.m23824a(new byte[]{48, -49, 60, -125, 39, -36, 33, -49, 48, -57, 50, -53, 105, -57, 32}, new byte[]{68, -82}), str);
        }
        Intent intent = new Intent(context, TaxBrowserActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtras(bundle);
        stringFogImpl.m23824a(new byte[]{-82, 24, -104, 27, -119, 87, -125, 24, -103, 87, -98, 31, -126, 0, -51, 35, -84, 47, -81, 5, -126, 0, -98, 18, -97, 87, -117, 24, -97, 87, -104, 5, -127, 77, -51}, new byte[]{-19, 119});
        uri.toString();
        stringFogImpl.m23824a(new byte[]{-67, -77, -25, -33, -59, -46, -42, -54, -60, -102, -50, -43, -62, -102, -47, -43, -59, -35, -40, -50, -105, -50, -40, -102, -45, -33, -44, -42, -42, -56, -46, -102, -29, -5, -17, -8, -59, -43, -64, -55, -46, -56, -105, -45, -39, -102, -50, -43, -62, -56, -105, -5, -39, -34, -59, -43, -34, -34, -105, -41, -42, -44, -34, -36, -46, -55, -61, -102, -47, -45, -37, -33, -103}, new byte[]{-73, -70});
        m38016c(context, intent);
    }

    /* renamed from: a */
    public static boolean m38027a(Node node, String str, List<String> list) {
        Node namedItem;
        if (str == null || list == null) {
            return true;
        }
        NamedNodeMap attributes = node.getAttributes();
        return (attributes == null || (namedItem = attributes.getNamedItem(str)) == null || !list.contains(namedItem.getNodeValue())) ? false : true;
    }

    /* renamed from: a */
    public static boolean m38038a(Context context, WebView webView, String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri != null) {
                String stringExtra = parseUri.getStringExtra(C28162a.f73047a.m23824a(new byte[]{-52, -10, -63, -13, -35, -31, -36, -37, -56, -27, -62, -24, -52, -27, -51, -17, -15, -15, -36, -24}, new byte[]{-82, -124}));
                if (!TextUtils.isEmpty(stringExtra) && webView != null) {
                    webView.loadUrl(stringExtra);
                    return true;
                } else if (parseUri.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(parseUri);
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{41, 126, 40, 109, 40, 108, 37}, new byte[]{93, 31});
            LogUtil.m37905d(m23824a, stringFogImpl.m23824a(new byte[]{-36, -72, -38, -67, -40, -68, -108, -80, -38, -83, -47, -73, -64, -7, -63, -85, -40, -7, -47, -95, -41, -68, -60, -83, -35, -74, -38, -7}, new byte[]{-76, -39}) + e);
        }
        return false;
    }

    /* renamed from: b */
    public static void m38025b(Context context, Intent intent) throws C28535r {
        C28530n.m37997a(context);
        C28530n.m37997a(intent);
        if (m38041a(context, intent)) {
            C28162a.f73047a.m23824a(new byte[]{28, 111, 40, 99, 37, 100, 105, 117, 38, 33, 38, 113, 44, 111, 105, 104, 39, 117, 44, 111, 61, 59, 105}, new byte[]{73, 1});
            Objects.toString(intent);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            m38016c(context, intent);
            return;
        }
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String stringExtra = intent.getStringExtra(stringFogImpl.m23824a(new byte[]{-72, 42, -75, 47, -87, 61, -88, 7, -68, 57, -74, 52, -72, 57, -71, 51, -123, 45, -88, 52}, new byte[]{-38, 88}));
        if (TextUtils.isEmpty(stringExtra)) {
            if (!stringFogImpl.m23824a(new byte[]{29, -112, 2, -102, 21, -123}, new byte[]{112, -15}).equalsIgnoreCase(intent.getScheme())) {
                C28530n.m37997a(intent);
                m38040a(context, Uri.parse(stringFogImpl.m23824a(new byte[]{-74, -118, -87, UnsignedBytes.MAX_POWER_OF_TWO, -66, -97, -31, -60, -12, -113, -66, -97, -70, -126, -73, -104, -28, -126, -65, -42}, new byte[]{-37, -21}) + intent.getPackage()));
                return;
            }
            throw new C28535r(stringFogImpl.m23824a(new byte[]{121, -108, 75, -104, 94, -108, 29, -110, 82, -124, 81, -107, 29, -97, 82, -123, 29, -103, 92, -97, 89, -99, 88, -47, 83, -108, 84, -123, 85, -108, 79, -47, 84, -97, 73, -108, 83, -123, 29, -97, 82, -125, 29, -100, 92, -125, 86, -108, 73, -47, 72, -125, 81, -33, 55, -72, 83, -123, 88, -97, 73, -53, 29}, new byte[]{61, -15}) + intent.toString());
        }
        Uri parse = Uri.parse(stringExtra);
        String scheme = parse.getScheme();
        if (!stringFogImpl.m23824a(new byte[]{124, -61, 96, -57}, new byte[]{20, -73}).equalsIgnoreCase(scheme) && !stringFogImpl.m23824a(new byte[]{-40, -7, -60, -3, -61}, new byte[]{-80, -115}).equalsIgnoreCase(scheme)) {
            m38040a(context, parse);
        } else {
            m38024b(context, parse, null);
        }
    }

    /* renamed from: a */
    public static String m38030a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    /* renamed from: a */
    public static boolean m38034a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C28162a.f73047a.m23824a(new byte[]{-112, 97, -115, 106, -105, 123, -61, 32, -42}, new byte[]{-7, 15}));
    }

    /* renamed from: a */
    public static String m38029a(Node node, String str) {
        Node namedItem;
        if (node == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    /* renamed from: a */
    public static void m38040a(Context context, Uri uri) throws C28535r {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        Intent intent = new Intent(stringFogImpl.m23824a(new byte[]{-86, -34, -81, -62, -92, -39, -81, -98, -94, -34, -65, -43, -91, -60, -27, -47, -88, -60, -94, -33, -91, -98, -99, -7, -114, -25}, new byte[]{-53, -80}), uri);
        C28530n.m37997a(context);
        C28530n.m37997a(uri);
        if (m38041a(context, intent)) {
            m38025b(context, intent);
            return;
        }
        throw new C28535r(stringFogImpl.m23824a(new byte[]{13, -75, 59, -74, 42, -6, 32, -75, 58, -6, 38, -69, 32, -66, 34, -65, 110, -69, 62, -86, 34, -77, 45, -69, 58, -77, 33, -76, 110, -87, 62, -65, 45, -77, 40, -77, 45, -6, 47, -71, 58, -77, 33, -76, 116, -6}, new byte[]{78, -38}) + uri + stringFogImpl.m23824a(new byte[]{54, 63, 101, 89, 73, 22, 81, 87, 69, 22, 94, 83, 28, 68, 73, 88, 82, 95, 82, 81, 28, 95, 82, 22, 72, 94, 89, 22, 89, 91, 73, 90, 93, 66, 83, 68, 28, 89, 78, 22, 93, 88, 83, 66, 84, 83, 78, 22, 88, 83, 74, 95, 95, 83, 28, 65, 84, 95, 95, 94, 28, 82, 83, 83, 79, 22, 82, 89, 72, 22, 84, 87, 74, 83, 28, 66, 84, 83, 28, 68, 89, 71, 73, 95, 78, 83, 88, 22, 93, 70, 76, 90, 85, 85, 93, 66, 85, 89, 82, 24}, new byte[]{60, 54}));
    }

    /* renamed from: a */
    public static String m38031a(Document document, String str) {
        NodeList elementsByTagName;
        String m38030a;
        if (document == null || (elementsByTagName = document.getElementsByTagName(str)) == null) {
            return null;
        }
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Node item = elementsByTagName.item(i);
            if (item != null && m38027a(item, (String) null, (List<String>) null) && (m38030a = m38030a(item)) != null) {
                return m38030a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m38039a(Context context, Uri uri, String str) throws C28535r {
        C28530n.m37997a(context);
        C28530n.m37997a(uri);
        byte[] bArr = {-108, UnsignedBytes.MAX_POWER_OF_TWO};
        Intent intent = new Intent(C28162a.f73047a.m23824a(new byte[]{-11, -18, -16, -14, -5, -23, -16, -82, -3, -18, -32, -27, -6, -12, -70, -31, -9, -12, -3, -17, -6, -82, -62, -55, -47, -41}, bArr), uri);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        m38016c(context, intent);
    }
}
