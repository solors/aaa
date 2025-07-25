package com.taurusx.tax.p578b.p580d;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p578b.p581e.C28236i;
import com.taurusx.tax.p583c.p584a.C28265a;
import com.taurusx.tax.p583c.p584a.p585d.C28271a;
import com.taurusx.tax.p583c.p584a.p585d.C28272b;
import com.taurusx.tax.p583c.p584a.p585d.C28273c;
import com.taurusx.tax.p583c.p584a.p585d.C28274d;
import com.taurusx.tax.p583c.p584a.p585d.C28275e;
import com.taurusx.tax.p583c.p586b.C28276a;
import com.taurusx.tax.p583c.p587c.C28283c;
import com.taurusx.tax.p583c.p587c.RunnableC28282b;
import com.taurusx.tax.p583c.p589e.C28291a;
import com.taurusx.tax.p606j.C28512c;
import com.taurusx.tax.p606j.C28532o;
import com.taurusx.tax.p606j.C28533p;
import com.taurusx.tax.p606j.C28537t;
import com.taurusx.tax.p606j.C28549x;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.d.b */
/* loaded from: classes7.dex */
public class C28218b {

    /* renamed from: a */
    public static final String f73277a;

    /* renamed from: b */
    public static final String f73278b;

    /* renamed from: c */
    public static final String f73279c;

    /* renamed from: d */
    public static final String f73280d;

    /* renamed from: e */
    public static final String f73281e;

    /* renamed from: f */
    public static final String f73282f;

    /* renamed from: g */
    public static final String f73283g;

    /* renamed from: h */
    public static JSONObject f73284h;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f73277a = stringFogImpl.m23824a(new byte[]{107, 0, 102, 9, 97, 8}, new byte[]{8, 111});
        stringFogImpl.m23824a(new byte[]{-42, 73, -52, 65, -50, 77}, new byte[]{-72, 40});
        stringFogImpl.m23824a(new byte[]{71, 0, 90, 11, 92, 29, 90, 7, 90, 7, 79, 2}, new byte[]{46, 110});
        stringFogImpl.m23824a(new byte[]{101, 33, 96, 37, 101, 32}, new byte[]{23, 68});
        stringFogImpl.m23824a(new byte[]{110, -6, 98, -11, 105, -23}, new byte[]{12, -101});
        stringFogImpl.m23824a(new byte[]{-97, -84, UnsignedBytes.MAX_POWER_OF_TWO, -67, -97, -76}, new byte[]{-20, -36});
        stringFogImpl.m23824a(new byte[]{14, 14, 8, 19, 27, 2, 2, 25, 5}, new byte[]{107, 118});
        f73278b = stringFogImpl.m23824a(new byte[]{-119, 22, -123, 40, -100, 19, -94, 20, -110, 25, -101, 30, -102, 40, -101, 30, -111, 18, -45, 20, -101, 16}, new byte[]{-3, 119});
        f73279c = stringFogImpl.m23824a(new byte[]{-91, 81, -65, 88, -108, 68, -86, 72, -108, 83, -83, 87}, new byte[]{-53, 48});
        f73280d = stringFogImpl.m23824a(new byte[]{75, -123, 71, -123, 91, -121, 89, -125}, new byte[]{63, -28});
        stringFogImpl.m23824a(new byte[]{46, 4, 50, 0, 53, 74, 105, 95, 37, 31, 40, 22, 47, 23, 104, 3, 53, 0, 104, 4, 39, 8, 53, 3, 54, 94, 37, 31, 43, 95, 53, 3, 54, 95, 48, 65, 105, 19, 41, 30, 32, 25, 33}, new byte[]{70, 112});
        f73281e = stringFogImpl.m23824a(new byte[]{-29, -15, -1, -11, -8, -65, -92, -86, -8, -31, -32, -10, -20, -85, -8, -10, -5, -85, -1, -28, -13, -10, -8, -11, -91, -26, -28, -24, -92, -10, -8, -11, -92, -13, -70, -86, -22, -31}, new byte[]{-117, -123});
        f73282f = stringFogImpl.m23824a(new byte[]{-105, 5, -117, 1, -116, 75, -48, 94, -116, 2, -113, 20, -121, 18, -46, 16, -116, 24, -98, 95, -117, 16, -121, 2, -116, 1, -47, 18, -112, 28, -48, 2, -116, 1, -48, 7, -50, 94, -102, 9, -100}, new byte[]{-1, 113});
        f73283g = stringFogImpl.m23824a(new byte[]{-24, 72, -12, 76, -13, 6, -81, 19, -27, 74, -27, 82, -12, 17, -11, 79, -82, 79, -13, 76, -82, 72, -31, 68, -13, 79, -16, 18, -29, 83, -19, 19, -10, 13, -81, 89, -10, 89, -18, 72}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 60});
        stringFogImpl.m23824a(new byte[]{75, 94, 87, 90, 25, 5, 12, 27, 26, 24, 13, 30, 21, 4, 17, 24, 22, 4, 18, 19, 26, 5, 80, 89, 83, 5, 85, 27, 12, 75, 71}, new byte[]{35, 42});
    }

    /* renamed from: A */
    public static String m38426A() {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        return (String) m38418a(stringFogImpl.m23824a(new byte[]{-122, -48, -125, -44, -122, -47, -85, -37, -107, -40, -111}, new byte[]{-12, -75}), stringFogImpl.m23824a(new byte[]{12, 34, 6, 35}, new byte[]{111, 77}));
    }

    /* renamed from: B */
    public static int m38425B() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{0, -62, 5, -58, 0, -61, 45, -47, 19, -53, 7, -62}, new byte[]{114, -89}), 1)).intValue();
    }

    /* renamed from: C */
    public static long m38424C() {
        return ((Long) m38418a(C28162a.f73047a.m23824a(new byte[]{30, 19, 27, 23, 30, 18, 51, 0, 5, 18, 9, 25, 51, 23, 0, 26, 3, 1, 51, 5, 7, 31, 28, 41, 24, 31, 1, 19, 51, 27, 31}, new byte[]{108, 118}), 30000L)).longValue();
    }

    /* renamed from: D */
    public static long m38423D() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{-73, -51, -78, -55, -73, -52, -102, -34, -84, -52, -96, -57, -102, -53, -87, -57, -74, -51, -102, -54, -80, -36, -79, -57, -85, -9, -74, -64, -86, -33, -102, -36, -84, -59, -96, -9, -88, -37}, new byte[]{-59, -88}), 70000)).intValue();
    }

    /* renamed from: E */
    public static boolean m38422E() {
        return ((Boolean) m38418a(C28162a.f73047a.m23824a(new byte[]{-83, -56, -68, -35, -126, -45, -75, -51, -79, -63, -126, -64, -78, -45, -77, -56, -78, -59, -71, -51, -77, -61, -126, -63, -77, -59, -65, -56, -72, -5, -85, -106}, new byte[]{-35, -92}), Boolean.FALSE)).booleanValue();
    }

    /* renamed from: a */
    public static <T> T m38418a(String str, T t) {
        StringFogImpl stringFogImpl;
        StringFogImpl stringFogImpl2;
        Boolean bool;
        m38417a(false);
        JSONObject jSONObject = f73284h;
        T t2 = null;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            String[] split = str.split(C28162a.f73047a.m23824a(new byte[]{-58, 61}, new byte[]{-102, 19}));
            if (split != null && split.length > 0) {
                for (int i = 0; i < split.length; i++) {
                    try {
                        if (jSONObject.has(split[i])) {
                            if (i == split.length - 1) {
                                if (t instanceof Boolean) {
                                    bool = Boolean.valueOf(jSONObject.optBoolean(split[i]));
                                } else if (t instanceof Long) {
                                    t2 = (T) Long.valueOf(jSONObject.optLong(split[i]));
                                } else if (t instanceof Float) {
                                    Double valueOf = Double.valueOf(jSONObject.optDouble(split[i]));
                                    if (valueOf != null) {
                                        t2 = (T) Float.valueOf(valueOf.floatValue());
                                    }
                                } else if (t instanceof Integer) {
                                    t2 = (T) Integer.valueOf(jSONObject.optInt(split[i]));
                                } else if (t instanceof String) {
                                    t2 = (T) jSONObject.optString(split[i]);
                                } else if (t instanceof Boolean) {
                                    bool = Boolean.valueOf(jSONObject.optBoolean(split[i]));
                                } else {
                                    t2 = (T) jSONObject.opt(split[i]);
                                }
                                t2 = (T) bool;
                            } else {
                                jSONObject = jSONObject.getJSONObject(split[i]);
                            }
                        }
                    } catch (Exception e) {
                        byte[] bArr = {-63, SignedBytes.MAX_POWER_OF_TWO};
                        LogUtil.m37901iv(C28162a.f73047a.m23824a(new byte[]{-75, 33, -76, 50, -76, 51, -71}, bArr), stringFogImpl2.m23824a(new byte[]{-123, -49, -121, -35, -112, -114, -108, -54, -43, -51, -102, -64, -109, -57, -110, -114, -112, -36, -121, -63, -121, -114, -49, -114}, new byte[]{-11, -82}) + e);
                    }
                }
            }
        } else {
            LogUtil.m37901iv(C28162a.f73047a.m23824a(new byte[]{-4, 73, -3, 90, -3, 91, -16}, new byte[]{-120, 40}), stringFogImpl.m23824a(new byte[]{-10, 26, -12, 8, -29, 91, -25, 31, -90, 24, -23, 21, -32, 18, -31, 91, -29, 9, -12, 20, -12, 91, -68, 91, -19, 30, -1, 91, -23, 9, -90, 17, -11, 20, -24, 91, -23, 25, -20, 30, -27, 15, -90, 18, -11, 91, -24, 14, -22, 23}, new byte[]{-122, 123}) + LogUtil.getCallClassAndMethod());
        }
        return t2 != null ? t2 : t;
    }

    /* renamed from: b */
    public static long m38416b() {
        return ((Long) m38418a(C28162a.f73047a.m23824a(new byte[]{81, 96, 111, 103, 81, 103, 88, 97, 111, 112, 68, 104, 111, 105, 67}, new byte[]{48, 4}), Long.valueOf(TimeUnit.SECONDS.toMillis(1800L)))).longValue();
    }

    /* renamed from: c */
    public static String m38414c() {
        return (String) m38418a(C28162a.f73047a.m23824a(new byte[]{45, 42, 19, 45, 36, 33, 37, 45, 41, 61, 19, 59, 62, 34}, new byte[]{76, 78}), "");
    }

    /* renamed from: d */
    public static String m38413d() {
        Context context = TaurusXAds.getContext();
        if (context == null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37901iv(stringFogImpl.m23824a(new byte[]{-15, -73, -16, -92, -16, -91, -3}, new byte[]{-123, -42}), stringFogImpl.m23824a(new byte[]{38, 115, 53, 54, 32, 114, 97, 117, 46, 120, 39, Byte.MAX_VALUE, 38, 54, 57, 123, 45, 54, 49, 119, 53, 126, 97, 115, 51, 100, 46, 100, 97, 44, 97, 117, 46, 120, 53, 115, 57, 98, 97, Byte.MAX_VALUE, 50, 54, 47, 99, 45, 122}, new byte[]{65, 22}));
            return null;
        }
        File file = new File(context.getFilesDir(), f73279c);
        file.mkdirs();
        return new File(file, f73278b).getAbsolutePath();
    }

    /* renamed from: e */
    public static boolean m38412e() {
        return ((Boolean) m38418a(C28162a.f73047a.m23824a(new byte[]{101, -120, 91, -119, 114, -119, 106, -104, 91, -124, 109, -97, 112, -125, 118, -107, 91, -119, 106, -115, 102, UnsignedBytes.MAX_POWER_OF_TWO, 97}, new byte[]{4, -20}), Boolean.FALSE)).booleanValue();
    }

    /* renamed from: f */
    public static int m38411f() {
        byte[] bArr = {SignedBytes.MAX_POWER_OF_TWO, -66};
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{33, -38, 31, -37, 54, -37, 46, -54, 31, -42, 41, -51, 52, -47, 50, -57, 31, -54, 41, -45, 37, -31, 50, -33, 46, -39, 37, -31, 45, -41, 46}, bArr), 60)).intValue();
    }

    /* renamed from: g */
    public static boolean m38410g() {
        return ((Boolean) m38418a(C28162a.f73047a.m23824a(new byte[]{49, 94, 15, 83, 52, 95, 62, 78, 57, 92, 57, 95, 34, 101, 35, 82, 63, 77, 15, 95, 62, 91, 50, 86, 53}, new byte[]{80, 58}), Boolean.FALSE)).booleanValue();
    }

    /* renamed from: h */
    public static int m38409h() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{-123, 98, -120, 105, -74, 121, UnsignedBytes.MAX_POWER_OF_TWO, 96, -116, 98, -100, 121, -74, 96, -102}, new byte[]{-23, 13}), 10000)).intValue();
    }

    /* renamed from: i */
    public static String m38408i() {
        return (String) m38418a(C28162a.f73047a.m23824a(new byte[]{-11, 71, -53, 86, -26, 79}, new byte[]{-108, 35}), f73281e);
    }

    /* renamed from: j */
    public static long m38407j() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{8, -24, 25, -57, 6, -24, 12, -10, 54, -7, 5, -12, 6, -17, 54, -21, 2, -15, 25, -57, 29, -15, 4, -3, 54, -11, 26}, new byte[]{105, -104}), 0)).intValue();
    }

    /* renamed from: k */
    public static boolean m38406k() {
        return ((Boolean) m38418a(C28162a.f73047a.m23824a(new byte[]{26, 78, 11, 97, 20, 78, 30, 80, 36, 95, 14, 74, 20, 97, 24, 82, 20, 77, 30}, new byte[]{123, 62}), Boolean.TRUE)).booleanValue();
    }

    /* renamed from: l */
    public static float m38405l() {
        return ((Float) m38418a(C28162a.f73047a.m23824a(new byte[]{15, 28, 30, 51, 1, 28, 11, 2, 49, 15, 2, 3, 29, 9, 49, 14, 27, 24, 26, 3, 0, 51, 29, 5, 20, 9, 49, 30, 15, 24, 7, 3}, new byte[]{110, 108}), Float.valueOf(1.0f))).floatValue();
    }

    /* renamed from: m */
    public static long m38404m() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{63, 86, 46, 121, 49, 86, 59, 72, 1, 69, 49, 83, 48, 82, 58, 73, 41, 72, 1, 82, 55, 75, 59, 121, 51, 85}, new byte[]{94, 38}), 5000)).intValue();
    }

    /* renamed from: n */
    public static boolean m38403n() {
        return ((Boolean) m38418a(C28162a.f73047a.m23824a(new byte[]{87, 87, 70, 120, 89, 87, 83, 73, 105, 82, 69, 66, 105, 84, 93, 78, 70}, new byte[]{54, 39}), Boolean.TRUE)).booleanValue();
    }

    /* renamed from: o */
    public static long m38402o() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 76, -111, 99, -114, 76, -124, 82, -66, 74, -120, 88, -124, 83, -66, 95, -114, 73, -113, 72, -123, 83, -106, 82, -66, 72, -120, 81, -124, 99, -116, 79}, new byte[]{-31, 60}), 10000)).intValue();
    }

    /* renamed from: p */
    public static long m38401p() {
        return ((Long) m38418a(C28162a.f73047a.m23824a(new byte[]{-24, 88, -26, 93, -43, 67, -1, 93, -17, 31, -6, 93, -21, 72, -43, 85, -1, 67, -21, 69, -29, 94, -28, 110, -25, 66}, new byte[]{-118, 49}), Long.valueOf(TimeUnit.SECONDS.toMillis(3L)))).longValue();
    }

    /* renamed from: q */
    public static long m38400q() {
        return ((Long) m38418a(C28162a.f73047a.m23824a(new byte[]{93, -112, 83, -107, 96, -117, 74, -107, 90, -41, 76, -111, 80, -114, 96, -99, 74, -117, 94, -115, 86, -106, 81, -90, 82, -118}, new byte[]{63, -7}), Long.valueOf(TimeUnit.SECONDS.toMillis(1L)))).longValue();
    }

    /* renamed from: r */
    public static float m38399r() {
        return ((Float) m38418a(C28162a.f73047a.m23824a(new byte[]{91, 99, 85, 102, 102, 120, 76, 102, 92, 36, 79, 99, 74, 99, 91, 102, 92, 85, 88, 120, 92, 107, 102, 120, 88, 126, 80, 101}, new byte[]{57, 10}), Float.valueOf(0.5f))).floatValue();
    }

    /* renamed from: s */
    public static float m38398s() {
        return ((Float) m38418a(C28162a.f73047a.m23824a(new byte[]{49, 104, 61, 119, 55, 91, 48, 113, 38, 112, 61, 106, 13, 119, 59, 126, 55, 91, 32, 101, 38, 109, 61}, new byte[]{82, 4}), Float.valueOf(1.0f))).floatValue();
    }

    /* renamed from: t */
    public static long m38397t() {
        return ((Long) m38418a(C28162a.f73047a.m23824a(new byte[]{73, -34, 68, -41, 67, -42, 117, -46, 75, -46, 66, -44, 117, -59, 94, -35, 117, -36, 89}, new byte[]{42, -79}), Long.valueOf(TimeUnit.SECONDS.toMillis(300L)))).longValue();
    }

    /* renamed from: u */
    public static long m38396u() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{-67, -69, -68, -74, -71, -89, -68, -118, -69, -71, -73, -90, -67, -118, -70, -96, -84, -95, -73, -69, -121, -90, -80, -70, -81, -118, -84, -68, -75, -80, -121, -72, -85}, new byte[]{-40, -43}), 3000)).intValue();
    }

    /* renamed from: v */
    public static JSONArray m38395v() {
        return (JSONArray) m38418a(C28162a.f73047a.m23824a(new byte[]{-24, -108, -24, -116, -7, -67, -18, -115, -29, -106, -1, -115, -31, -67, -28, -122, -2}, new byte[]{-115, -30}), new JSONArray());
    }

    /* renamed from: w */
    public static String m38394w() {
        String m23824a = C28162a.f73047a.m23824a(new byte[]{60, 121, 58, 94, 44, 115, 53}, new byte[]{89, 1});
        String str = f73282f;
        String str2 = (String) m38418a(m23824a, str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return str;
    }

    /* renamed from: x */
    public static long m38393x() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{37, -69, 63, -95, 32, -118, 45, -71, 32, -70, 59, -118, 63, -66, 37, -91, 19, -95, 37, -72, 41, -118, 33, -90}, new byte[]{76, -43}), 5000)).intValue();
    }

    /* renamed from: y */
    public static long m38392y() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{-27, -93, -1, -71, -32, -110, -17, -95, -29, -66, -23, -110, -18, -72, -8, -71, -29, -93, -45, -66, -28, -94, -5, -110, -8, -92, -31, -88, -45, -96, -1}, new byte[]{-116, -51}), 30000)).intValue();
    }

    /* renamed from: z */
    public static int m38391z() {
        return ((Integer) m38418a(C28162a.f73047a.m23824a(new byte[]{-119, -23, -114, -20, -68, -15, -122, -24, -117, -13, -121}, new byte[]{-29, -100}), 2)).intValue();
    }

    /* renamed from: b */
    public static boolean m38415b(Context context) {
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            long m37992a = C28532o.m37993a().m37992a(context, stringFogImpl.m23824a(new byte[]{69, -26, 80, -14, 106, -8, 84, -25, 65, -53, 86, -5, 91, -14, 92, -13, 106, -26, 80, -27, 106, -32, 92, -7, 80}, new byte[]{53, -108}));
            long m38397t = m38397t();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (m38397t <= timeUnit.toMillis(300L)) {
                m38397t = timeUnit.toMillis(300L);
            }
            boolean z = System.currentTimeMillis() - m37992a > m38397t;
            String m23824a = stringFogImpl.m23824a(new byte[]{67, 41, 66, 58, 66, 59, 79, 101, 69, 45, 91, 45, 86, 59, 82}, new byte[]{55, 72});
            LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{62, -26, 54, -24, 56, -26, 121, -23, 54, -28, 63, -29, 62, -86, 60, -14, 41, -29, 43, -17, 61, -86, 99, -86}, new byte[]{89, -118}) + z);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m38417a(boolean z) {
        if (f73284h == null || z) {
            JSONObject jSONObject = null;
            if (TaurusXAds.getContext() == null) {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                LogUtil.m37901iv(stringFogImpl.m23824a(new byte[]{-45, 74, -46, 89, -46, 88, -33}, new byte[]{-89, 43}), stringFogImpl.m23824a(new byte[]{126, -110, 109, -41, 120, -109, 57, -108, 118, -103, Byte.MAX_VALUE, -98, 126, -41, 124, -123, 107, -104, 107, -41, 35, -41, 122, -104, 119, -125, 124, -113, 109, -41, 112, -124, 57, -103, 108, -101, 117}, new byte[]{25, -9}));
            } else {
                String m38413d = m38413d();
                if (TextUtils.isEmpty(m38413d)) {
                    StringFogImpl stringFogImpl2 = C28162a.f73047a;
                    LogUtil.m37901iv(stringFogImpl2.m23824a(new byte[]{-111, 88, -112, 75, -112, 74, -99}, new byte[]{-27, 57}), stringFogImpl2.m23824a(new byte[]{-47, -25, -62, -94, -41, -26, -106, -31, -39, -20, -48, -21, -47, -94, -45, -16, -60, -19, -60, -94, -116, -94, -40, -29, -62, -22, -106, -10, -41, -6, -106, -28, -33, -18, -45, -94, -58, -29, -62, -22, -106, -21, -59, -94, -40, -9, -38, -18}, new byte[]{-74, -126}));
                } else {
                    String m37961b = C28549x.m37961b(m38413d);
                    try {
                        if (!TextUtils.isEmpty(m37961b)) {
                            jSONObject = new JSONObject(C28207b.m38453a(f73280d, m37961b));
                        }
                    } catch (Exception e) {
                        StringFogImpl stringFogImpl3 = C28162a.f73047a;
                        String m23824a = stringFogImpl3.m23824a(new byte[]{-83, 92, -84, 79, -84, 78, -95}, new byte[]{-39, 61});
                        LogUtil.m37901iv(m23824a, stringFogImpl3.m23824a(new byte[]{-44, -92, -57, -31, -46, -91, -109, -94, -36, -81, -43, -88, -44, -31, -42, -77, -63, -82, -63, -31, -119, -31}, new byte[]{-77, -63}) + e);
                    }
                }
            }
            f73284h = jSONObject;
        }
    }

    /* renamed from: a */
    public static void m38419a(Context context, C28291a c28291a) {
        boolean z;
        int i;
        StringFogImpl stringFogImpl = C28162a.f73047a;
        c28291a.f73482f = (String) m38418a(stringFogImpl.m23824a(new byte[]{-46, -103, -46, -127, -61, -80, -62, -99, -37}, new byte[]{-73, -17}), f73283g);
        C28206a m38470e = C28206a.m38470e();
        c28291a.f73479c = !TextUtils.isEmpty(m38470e.f73185a) ? m38470e.f73185a : "";
        c28291a.f73485i = C28537t.m37984b(TaurusXAds.getContext());
        c28291a.f73480d = 119;
        c28291a.f73481e = stringFogImpl.m23824a(new byte[]{-3, -86, -3, -86, -11}, new byte[]{-52, -124});
        c28291a.f73483g = C28512c.m38051a(C28512c.f73954h, C28512c.f73952f);
        c28291a.f73484h = C28512c.m38051a(C28512c.f73954h, C28512c.f73953g);
        synchronized (c28291a) {
            z = false;
            if (!c28291a.f73478b) {
                if (context == null) {
                    Log.e(C28291a.f73476m, stringFogImpl.m23824a(new byte[]{103, -47, 74, -105, 80, -112, 87, -60, 69, -62, 80, -112, 83, -39, 80, -40, 4, -34, 81, -36, 72, -112, 71, -33, 74, -60, 65, -56, 80}, new byte[]{36, -80}));
                } else {
                    Log.d(C28291a.f73476m, stringFogImpl.m23824a(new byte[]{-11, -49, -57, -55, -46}, new byte[]{-90, -69}));
                    c28291a.f73477a = context.getApplicationContext();
                    C28283c c28283c = new C28283c();
                    c28291a.f73486j = c28283c;
                    new Thread(new RunnableC28282b(c28283c, c28291a.f73477a)).start();
                    C28265a c28265a = new C28265a();
                    c28291a.f73487k = c28265a;
                    Context context2 = c28291a.f73477a;
                    C28274d c28274d = c28265a.f73433d;
                    c28274d.getClass();
                    c28274d.f73445a = new C28275e(context2, C28275e.m38332a());
                    c28274d.f73446b = new C28272b(context2, stringFogImpl.m23824a(new byte[]{95, 1, 94, 18, 94, 19, 83, 63, 74, 4, 5, 4, 73}, new byte[]{43, 96}));
                    c28274d.f73447c = C28273c.m38336a();
                    c28274d.f73448d = C28271a.m38337a();
                    C28274d c28274d2 = c28265a.f73433d;
                    Cursor cursor = null;
                    try {
                        cursor = c28274d2.f73445a.getReadableDatabase().query(c28274d2.f73447c, null, null, null, null, null, null);
                        i = cursor.getCount();
                        cursor.close();
                    } catch (Error | Exception e) {
                        e.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                        }
                        i = 0;
                    }
                    c28265a.f73432c = new AtomicInteger(i);
                    C28276a c28276a = new C28276a(c28291a, c28291a.f73487k);
                    c28291a.f73488l = c28276a;
                    Context context3 = c28291a.f73477a;
                    synchronized (c28276a) {
                        if (c28276a.f73451b) {
                            Log.d(C28276a.f73449j, C28162a.f73047a.m23824a(new byte[]{68, 93, Byte.MAX_VALUE, 28, 95, 72, 109, 78, 120, 89, 104}, new byte[]{12, 60}));
                        } else {
                            Log.d(C28276a.f73449j, C28162a.f73047a.m23824a(new byte[]{90, -6, 104, -4, 125}, new byte[]{9, -114}));
                            c28276a.f73451b = true;
                            c28276a.f73450a = context3.getApplicationContext();
                            c28276a.f73457h.sendEmptyMessage(1);
                        }
                    }
                    c28291a.f73478b = true;
                }
            }
        }
        C28236i c28236i = new C28236i();
        String str = C28236i.f73340e;
        if (!c28236i.m38368a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                jSONObject.put(stringFogImpl2.m23824a(new byte[]{-92, 32, -92, 56, -75, 9, -81, 55, -84, 51}, new byte[]{-63, 86}), str);
                jSONObject.put(stringFogImpl2.m23824a(new byte[]{-66, -82, -66, -74, -81, -121, -81, -79, -74, -67}, new byte[]{-37, -40}), System.currentTimeMillis());
                C28206a.m38470e().f73193i.m38312a(jSONObject);
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        String m23824a = C28162a.f73047a.m23824a(new byte[]{29, 123, 28, 115}, new byte[]{44, 75});
        JSONArray m38395v = m38395v();
        int i2 = 0;
        while (true) {
            if (i2 >= m38395v.length()) {
                break;
            }
            try {
                if (m23824a.equalsIgnoreCase(m38395v.getString(i2))) {
                    z = true;
                    break;
                }
                i2++;
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        }
        if (z) {
            return;
        }
        if (C28533p.f73984b == null) {
            synchronized (C28533p.class) {
                if (C28533p.f73984b == null) {
                    C28533p.f73984b = new C28533p();
                }
            }
        }
        C28533p c28533p = C28533p.f73984b;
        c28533p.getClass();
        Thread.setDefaultUncaughtExceptionHandler(c28533p);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fa A[Catch: JSONException -> 0x0315, TryCatch #0 {JSONException -> 0x0315, blocks: (B:3:0x0003, B:5:0x0036, B:8:0x003f, B:10:0x0045, B:11:0x0072, B:13:0x008e, B:15:0x00f4, B:17:0x0158, B:25:0x01f4, B:27:0x01fa, B:29:0x0204, B:30:0x022c, B:31:0x022f, B:33:0x02c1), top: B:38:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02c1 A[Catch: JSONException -> 0x0315, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0315, blocks: (B:3:0x0003, B:5:0x0036, B:8:0x003f, B:10:0x0045, B:11:0x0072, B:13:0x008e, B:15:0x00f4, B:17:0x0158, B:25:0x01f4, B:27:0x01fa, B:29:0x0204, B:30:0x022c, B:31:0x022f, B:33:0x02c1), top: B:38:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m38420a(android.content.Context r29) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p578b.p580d.C28218b.m38420a(android.content.Context):void");
    }

    /* renamed from: a */
    public static boolean m38421a() {
        return ((Boolean) m38418a(C28162a.f73047a.m23824a(new byte[]{32, 103, 35, 104, 41, 84, 35, 121, 39, 106, 29, 104, 46, 98, 33, 96, 29, 110, 44, 106, 32, 103, 39}, new byte[]{66, 11}), Boolean.TRUE)).booleanValue();
    }
}
