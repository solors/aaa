package com.taurusx.tax.p583c.p590f;

import android.app.AppOpsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p583c.p590f.p591d.C28295a;
import com.taurusx.tax.p583c.p590f.p591d.C28296b;
import com.taurusx.tax.p583c.p590f.p591d.C28297c;
import com.taurusx.tax.p583c.p590f.p591d.C28298d;
import com.taurusx.tax.p583c.p590f.p591d.C28300e;
import com.taurusx.tax.p606j.C28532o;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.f.a */
/* loaded from: classes7.dex */
public class C28292a {

    /* renamed from: a */
    public static final String f73489a;

    /* renamed from: b */
    public static long f73490b;

    /* renamed from: c */
    public static String f73491c;

    /* renamed from: d */
    public static String f73492d;

    /* renamed from: e */
    public static String f73493e;

    /* renamed from: f */
    public static Boolean f73494f;

    /* renamed from: g */
    public static Boolean f73495g;

    /* renamed from: h */
    public static Boolean f73496h;

    /* renamed from: i */
    public static Boolean f73497i;

    /* renamed from: j */
    public static final String f73498j;

    /* renamed from: k */
    public static final String f73499k;

    /* renamed from: l */
    public static final String f73500l;

    /* renamed from: m */
    public static HashMap<String, ArrayList<String>> f73501m;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f73489a = stringFogImpl.m23824a(new byte[]{-77, -55, -127, -59, -108, -55, -94, -40, -98, -64}, new byte[]{-9, -84});
        f73498j = stringFogImpl.m23824a(new byte[]{-127, 48, -7}, new byte[]{-52, 116});
        f73499k = stringFogImpl.m23824a(new byte[]{117, 37, 103, 92}, new byte[]{38, 109});
        f73500l = stringFogImpl.m23824a(new byte[]{31, 75, 13, 49, 121, 53}, new byte[]{76, 3});
        f73501m = new HashMap<>();
    }

    /* renamed from: a */
    public static String m38305a() {
        if (f73492d == null) {
            String[] strArr = Build.SUPPORTED_ABIS;
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(',');
            }
            f73492d = sb2.toString();
        }
        return f73492d;
    }

    /* renamed from: b */
    public static long m38300b(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0L;
        }
        try {
            long j = f73490b;
            if (j > 0) {
                return j;
            }
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(packageName, 256)) == null) {
                return 0L;
            }
            long j2 = packageInfo.firstInstallTime;
            f73490b = j2;
            return j2;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    public static boolean m38299c() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp()) {
                    arrayList.add(networkInterface.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringFogImpl stringFogImpl = C28162a.f73047a;
        return arrayList.contains(stringFogImpl.m23824a(new byte[]{19, -9, 9, -78}, new byte[]{103, -126})) || arrayList.contains(stringFogImpl.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 61, UnsignedBytes.MAX_POWER_OF_TWO, 125}, new byte[]{-16, 77}));
    }

    /* renamed from: d */
    public static boolean m38297d() {
        if (f73496h == null) {
            f73496h = Boolean.valueOf(C28297c.m38275a());
        }
        return f73496h.booleanValue();
    }

    /* renamed from: e */
    public static String m38295e(Context context) {
        if (f73493e == null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C28162a.f73047a.m23824a(new byte[]{-8, 67, -25, 69, -19}, new byte[]{-120, 43}));
            f73493e = telephonyManager.getNetworkOperator() + telephonyManager.getNetworkOperatorName();
        }
        return f73493e;
    }

    /* renamed from: f */
    public static int m38294f(Context context) {
        if (ContextCompat.checkSelfPermission(context, C28162a.f73047a.m23824a(new byte[]{-15, -60, -12, -40, -1, -61, -12, -124, -32, -49, -30, -57, -7, -39, -29, -61, -1, -60, -66, -8, -43, -21, -44, -11, -64, -30, -33, -28, -43, -11, -61, -2, -47, -2, -43}, new byte[]{-112, -86})) == 0) {
            return SubscriptionManager.from(context).getActiveSubscriptionInfoCount();
        }
        return -2;
    }

    /* renamed from: g */
    public static boolean m38293g(Context context) {
        boolean z;
        if (f73497i == null) {
            List<Sensor> sensorList = ((SensorManager) context.getSystemService(C28162a.f73047a.m23824a(new byte[]{-91, 50, -72, 36, -71, 37}, new byte[]{-42, 87}))).getSensorList(5);
            if (sensorList != null && sensorList.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            f73497i = Boolean.valueOf(z);
        }
        return f73497i.booleanValue();
    }

    /* renamed from: h */
    public static boolean m38292h(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        if (Settings.Secure.getInt(context.getContentResolver(), C28162a.f73047a.m23824a(new byte[]{-36, 76, -33, 119, -40, 70, -36, 74, -47, 77, -39}, new byte[]{-67, 40}), 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (!C28298d.m38271b() && !Debug.isDebuggerConnected() && !C28298d.m38272a()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m38291i(Context context) {
        if (f73495g == null) {
            f73495g = Boolean.valueOf(C28300e.m38269a(context));
        }
        return f73495g.booleanValue();
    }

    @RequiresApi(api = 19)
    /* renamed from: j */
    public static boolean m38290j(Context context) {
        if (!m38288l(context)) {
            if (f73494f == null) {
                f73494f = Boolean.FALSE;
            }
            if (!f73494f.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m38289k(Context context) {
        boolean booleanValue;
        boolean z;
        synchronized (C28295a.class) {
            if (C28295a.f73505a == null) {
                if (!C28295a.m38280a(context) && !C28295a.m38279b(context) && !C28295a.m38281a()) {
                    z = false;
                    C28295a.f73505a = Boolean.valueOf(z);
                }
                z = true;
                C28295a.f73505a = Boolean.valueOf(z);
            }
            booleanValue = C28295a.f73505a.booleanValue();
        }
        return booleanValue;
    }

    @RequiresApi(api = 19)
    /* renamed from: l */
    public static boolean m38288l(Context context) {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        try {
            if (((AppOpsManager) context.getSystemService(stringFogImpl.m23824a(new byte[]{37, 14, 52, 17, 52, 13}, new byte[]{68, 126}))).checkOp(stringFogImpl.m23824a(new byte[]{0, -75, 5, -87, 14, -78, 5, -31, 12, -76, 2, -80, 62, -73, 14, -72, 0, -81, 8, -76, 15}, new byte[]{97, -37}), Process.myUid(), context.getPackageName()) != 0) {
                return false;
            }
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m38287m(Context context) {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String property = System.getProperty(stringFogImpl.m23824a(new byte[]{-101, -79, -121, -75, -35, -75, -127, -86, -117, -68, -69, -86, UnsignedBytes.MAX_POWER_OF_TWO, -79}, new byte[]{-13, -59}));
        String property2 = System.getProperty(stringFogImpl.m23824a(new byte[]{122, 87, 102, 83, 60, 83, 96, 76, 106, 90, 66, 76, 96, 87}, new byte[]{18, 35}));
        if (property2 == null) {
            property2 = stringFogImpl.m23824a(new byte[]{94, -11}, new byte[]{115, -60});
        }
        int parseInt = Integer.parseInt(property2);
        if (!TextUtils.isEmpty(property) && parseInt != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m38296d(Context context) {
        String packageName;
        String m38302a;
        String str = f73499k;
        ArrayList<String> arrayList = null;
        Signature[] signatureArr = null;
        arrayList = null;
        if (str != null && (packageName = context.getPackageName()) != null) {
            if (f73501m.get(str) != null) {
                arrayList = f73501m.get(str);
            } else {
                ArrayList<String> arrayList2 = new ArrayList<>();
                try {
                    try {
                        signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for (Signature signature : signatureArr) {
                        String m23824a = C28162a.f73047a.m23824a(new byte[]{46, 54, 57, 43, 57, 101}, new byte[]{75, 68});
                        String str2 = f73498j;
                        if (str2.equals(str)) {
                            m38302a = m38302a(signature, str2);
                        } else {
                            String str3 = f73499k;
                            if (str3.equals(str)) {
                                m38302a = m38302a(signature, str3);
                            } else {
                                String str4 = f73500l;
                                if (str4.equals(str)) {
                                    m38302a = m38302a(signature, str4);
                                }
                                arrayList2.add(m23824a);
                            }
                        }
                        m23824a = m38302a;
                        arrayList2.add(m23824a);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                f73501m.put(str, arrayList2);
                arrayList = arrayList2;
            }
        }
        return (arrayList == null || arrayList.size() == 0) ? "" : arrayList.get(0);
    }

    /* renamed from: b */
    public static boolean m38301b() {
        return C28296b.m38276b();
    }

    /* renamed from: a */
    public static String m38304a(Context context) {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        if (ContextCompat.checkSelfPermission(context, stringFogImpl.m23824a(new byte[]{92, 81, 89, 77, 82, 86, 89, 17, 77, 90, 79, 82, 84, 76, 78, 86, 82, 81, 19, 125, 113, 106, 120, 107, 114, 112, 105, 119}, new byte[]{61, 63})) == 0) {
            return BluetoothAdapter.getDefaultAdapter().getName();
        }
        return stringFogImpl.m23824a(new byte[]{-114, -26}, new byte[]{-93, -44});
    }

    /* renamed from: c */
    public static JSONArray m38298c(Context context) {
        C28532o m37993a = C28532o.m37993a();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m37988b = m37993a.m37988b(context, stringFogImpl.m23824a(new byte[]{-26, 14, -4, 20, -18, 12, -29, 5, -21, 63, -29, 9, -4, 20}, new byte[]{-113, 96}));
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(m37988b)) {
            return null;
        }
        String[] split = m37988b.split(stringFogImpl.m23824a(new byte[]{-121}, new byte[]{-68, -45}));
        if (split != null) {
            for (String str : split) {
                jSONArray.put(str);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static String m38302a(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        String m23824a = C28162a.f73047a.m23824a(new byte[]{-38, 21, -51, 8, -51, 70}, new byte[]{-65, 103});
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] digest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b : digest) {
                    sb2.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                    sb2.append(C28162a.f73047a.m23824a(new byte[]{-75}, new byte[]{-113, -55}));
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return m23824a;
        } catch (Exception e) {
            e.printStackTrace();
            return m23824a;
        }
    }

    /* renamed from: a */
    public static boolean m38303a(Context context, String str) {
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
