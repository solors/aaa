package com.taurusx.tax.p578b.p581e;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p580d.C28218b;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.e.i */
/* loaded from: classes7.dex */
public class C28236i {

    /* renamed from: d */
    public static final String f73339d;

    /* renamed from: e */
    public static final String f73340e;

    /* renamed from: f */
    public static final String f73341f;

    /* renamed from: g */
    public static final String f73342g;

    /* renamed from: h */
    public static final String f73343h;

    /* renamed from: i */
    public static final String f73344i;

    /* renamed from: j */
    public static final String f73345j;

    /* renamed from: k */
    public static final String f73346k;

    /* renamed from: l */
    public static final String f73347l;

    /* renamed from: m */
    public static final String f73348m;

    /* renamed from: n */
    public static final String f73349n;

    /* renamed from: o */
    public static final String f73350o;

    /* renamed from: p */
    public static final String f73351p;

    /* renamed from: a */
    public String f73352a;

    /* renamed from: b */
    public String f73353b;

    /* renamed from: c */
    public String f73354c;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f73339d = stringFogImpl.m23824a(new byte[]{-118, 11, -90, 41, -85, 25, -86, 5, -77, 47, -88, 15, -80, 30}, new byte[]{-34, 106});
        f73340e = stringFogImpl.m23824a(new byte[]{-98, -27, -97, -27}, new byte[]{-81, -43});
        stringFogImpl.m23824a(new byte[]{38, 0, 39, 1}, new byte[]{23, 48});
        stringFogImpl.m23824a(new byte[]{-3, -65, -4, -67}, new byte[]{-52, -113});
        stringFogImpl.m23824a(new byte[]{93, 92, 92, 95}, new byte[]{108, 108});
        f73341f = stringFogImpl.m23824a(new byte[]{13, 36, 12, 32}, new byte[]{60, 20});
        f73342g = stringFogImpl.m23824a(new byte[]{82, -82, 83, -85}, new byte[]{99, -98});
        f73343h = stringFogImpl.m23824a(new byte[]{-94, 2, -93, 4}, new byte[]{-109, 50});
        f73344i = stringFogImpl.m23824a(new byte[]{-13, -108, -14, -109}, new byte[]{-62, -92});
        stringFogImpl.m23824a(new byte[]{SignedBytes.MAX_POWER_OF_TWO, 52, 65, 60}, new byte[]{113, 4});
        f73345j = stringFogImpl.m23824a(new byte[]{-7, 48, -8, 57}, new byte[]{-56, 0});
        f73346k = stringFogImpl.m23824a(new byte[]{27, 85, 27, 85}, new byte[]{42, 101});
        f73347l = stringFogImpl.m23824a(new byte[]{27, 67, 27, 66}, new byte[]{42, 115});
        f73348m = stringFogImpl.m23824a(new byte[]{112, 55, 112, 53}, new byte[]{65, 7});
        f73349n = stringFogImpl.m23824a(new byte[]{-100, -88, -100, -85}, new byte[]{-83, -104});
        f73350o = stringFogImpl.m23824a(new byte[]{-16, -118, -16, -114}, new byte[]{-63, -70});
        f73351p = stringFogImpl.m23824a(new byte[]{-114, -39, -114, -36}, new byte[]{-65, -23});
    }

    public C28236i() {
        this.f73352a = UUID.randomUUID().toString();
        this.f73353b = "";
        this.f73354c = "";
    }

    /* renamed from: a */
    public static C28236i m38370a(C28210c c28210c) {
        if (c28210c != null) {
            return new C28236i(c28210c.f73225a, c28210c.f73229e);
        }
        return new C28236i();
    }

    /* renamed from: b */
    public void m38363b(String str) {
        if (m38368a(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-82, -20, -82, -12, -65, -59, -91, -5, -90, -1}, new byte[]{-53, -102}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-116, -66, -116, -90, -99, -105, -99, -95, -124, -83}, new byte[]{-23, -56}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-103, -127, -115}, new byte[]{-23, -24}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{88, -94, 91, -78, 79, -76, 94}, new byte[]{42, -57}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-69}, new byte[]{-53, -85}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void m38362c() {
        String str = f73349n;
        if (!m38368a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                jSONObject.put(stringFogImpl.m23824a(new byte[]{7, -47, 7, -55, 22, -8, 12, -58, 15, -62}, new byte[]{98, -89}), str);
                jSONObject.put(stringFogImpl.m23824a(new byte[]{-114, -84, -114, -76, -97, -123, -97, -77, -122, -65}, new byte[]{-21, -38}), System.currentTimeMillis());
                jSONObject.put(stringFogImpl.m23824a(new byte[]{-124, 123, -112}, new byte[]{-12, 18}), this.f73353b);
                jSONObject.put(stringFogImpl.m23824a(new byte[]{-6, -103, -7, -119, -19, -113, -4}, new byte[]{-120, -4}), this.f73352a);
                jSONObject.put(stringFogImpl.m23824a(new byte[]{56}, new byte[]{72, -93}), this.f73354c);
                C28206a.m38470e().f73193i.m38312a(jSONObject);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public C28236i(String str, String str2) {
        this.f73352a = UUID.randomUUID().toString();
        this.f73353b = "";
        this.f73354c = "";
        if (str != null) {
            this.f73353b = str;
        }
        if (str2 != null) {
            this.f73354c = str2;
        }
    }

    /* renamed from: a */
    public final boolean m38368a(String str) {
        JSONArray m38395v = C28218b.m38395v();
        for (int i = 0; i < m38395v.length(); i++) {
            try {
                if (str.equalsIgnoreCase(m38395v.getString(i))) {
                    return true;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m38367a(String str, int i, String str2, long j) {
        if (m38368a(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-119, -71, -119, -95, -104, -112, -126, -82, -127, -86}, new byte[]{-20, -49}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-33, 61, -33, 37, -50, 20, -50, 34, -41, 46}, new byte[]{-70, 75}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-55, -118, -35}, new byte[]{-71, -29}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-17, 22, -20, 6, -8, 0, -23}, new byte[]{-99, 115}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{52, 23, 62}, new byte[]{89, 100}), str2);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-8, -1, -17, -30, -17, -50, -14, -23, -8}, new byte[]{-99, -115}), i);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{74, -18, 89, -17, 66, -18, 79, -27, 122, -24, 67, -28}, new byte[]{46, -127}), System.currentTimeMillis() - j);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-61}, new byte[]{-77, -65}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public void m38364b() {
        String str = f73341f;
        if (m38368a(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-89, -106, -89, -114, -74, -65, -84, -127, -81, -123}, new byte[]{-62, -32}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{122, -29, 122, -5, 107, -54, 107, -4, 114, -16}, new byte[]{31, -107}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-64, -7, -44}, new byte[]{-80, -112}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{121, -34, 122, -50, 110, -56, Byte.MAX_VALUE}, new byte[]{11, -69}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-79}, new byte[]{-63, -17}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m38372a(int i) {
        String str = f73342g;
        if (m38368a(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{82, -93, 82, -69, 67, -118, 89, -76, 90, -80}, new byte[]{55, -43}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{113, -126, 113, -102, 96, -85, 96, -99, 121, -111}, new byte[]{20, -12}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{17, 72, 5}, new byte[]{97, 33}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-2, 102, -3, 118, -23, 112, -8}, new byte[]{-116, 3}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-121, 88, -112, 69, -112, 105, -115, 78, -121}, new byte[]{-30, 42}), i);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-111}, new byte[]{-31, 101}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m38373a(float f, float f2) {
        String str = f73343h;
        if (m38368a(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{36, 75, 36, 83, 53, 98, 47, 92, 44, 88}, new byte[]{65, 61}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{98, -5, 98, -29, 115, -46, 115, -28, 106, -24}, new byte[]{7, -115}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{120, -47, 108}, new byte[]{8, -72}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-68, -109, -65, -125, -85, -123, -70}, new byte[]{-50, -10}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-124}, new byte[]{-4, -91}), f);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{50}, new byte[]{75, -35}), f2);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-51}, new byte[]{-67, 83}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m38374a() {
        String str = f73345j;
        if (m38368a(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{35, 59, 35, 35, 50, 18, 40, 44, 43, 40}, new byte[]{70, 77}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-122, 31, -122, 7, -105, 54, -105, 0, -114, 12}, new byte[]{-29, 105}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-124, -115, -112}, new byte[]{-12, -28}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{22, 31, 21, 15, 1, 9, 16}, new byte[]{100, 122}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{124}, new byte[]{12, -41}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m38366a(String str, int i, String str2, String str3, long j, String str4) {
        String str5 = f73346k;
        if (m38368a(str5)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{13, 29, 13, 5, 28, 52, 6, 10, 5, 14}, new byte[]{104, 107}), str5);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{89, -78, 89, -86, 72, -101, 72, -83, 81, -95}, new byte[]{60, -60}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{5, -57, 24, -35, 21, -16, 1, -50, 3, -37, 8, -16, 4, -35, 29}, new byte[]{113, -81}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-26, -46, -6, -42, -47, -59, -31, -62, -21}, new byte[]{-114, -90}), i);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-14, 6, -18, 2, -59, 31, -23, 21}, new byte[]{-102, 114}), str2);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-103, 122, -104, 106, -121, 107}, new byte[]{-21, 31}), str3);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{23, 0, 10, 26, 7, 55, 19, 9, 17, 28, 26, 55, 17, 13, 18, 29, 6, 27, 23, 55, 23, 1, 14, 13, 60, 5, 16}, new byte[]{99, 104}), j);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{51, 75, 38, 90, 44, 80, 41, 94, 24, 87, 38, 84, 34}, new byte[]{71, 57}), str4);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m38371a(long j) {
        String str = f73344i;
        if (m38368a(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-80, 46, -80, 54, -95, 7, -69, 57, -72, 61}, new byte[]{-43, 88}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-30, 120, -17, 115, -21, 115, -47, 67, -25, 122, -21}, new byte[]{-114, 23}), System.currentTimeMillis() - j);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{11, -56, 11, -48, 26, -31, 26, -41, 3, -37}, new byte[]{110, -66}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{82, 47, 70}, new byte[]{34, 70}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-105, 46, -108, 62, UnsignedBytes.MAX_POWER_OF_TWO, 56, -111}, new byte[]{-27, 75}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{126}, new byte[]{14, -74}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m38365a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = f73350o;
        if (m38368a(str2)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-97, 80, -97, 72, -114, 121, -108, 71, -105, 67}, new byte[]{-6, 38}), str2);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-53, 120, -53, 96, -38, 81, -38, 103, -61, 107}, new byte[]{-82, 14}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{74, -26, 94}, new byte[]{58, -113}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{125, -45, 126, -61, 106, -59, 123}, new byte[]{15, -74}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-38, 7, -52, 11, -38, 7, -53, 22, -9, 23, -38, 14}, new byte[]{-88, 98}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{70, 77, 83, 87, 120, 74, 66, 92, 78, 74, 66, 91, 83}, new byte[]{39, 56}), z);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-108}, new byte[]{-28, 38}), this.f73354c);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m38369a(C28219a c28219a, C28237j c28237j) {
        if (c28219a == null || c28237j == null) {
            return;
        }
        String str = f73351p;
        if (m38368a(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            jSONObject.put(stringFogImpl.m23824a(new byte[]{99, 65, 99, 89, 114, 104, 104, 86, 107, 82}, new byte[]{6, 55}), str);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-8, 19, -8, 11, -23, 58, -23, 12, -16, 0}, new byte[]{-99, 101}), System.currentTimeMillis());
            jSONObject.put(stringFogImpl.m23824a(new byte[]{23, 104, 3}, new byte[]{103, 1}), this.f73353b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{68, 5, 71, 21, 83, 19, 66}, new byte[]{54, 96}), this.f73352a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{95, Byte.MAX_VALUE, 77, 115, 88, Byte.MAX_VALUE, 100, 116, 90, 119, 94}, new byte[]{59, 26}), c28237j.f73360f);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{35, 121, 49, 117, 36, 121, 24, 117, 35}, new byte[]{71, 28}), c28237j.f73359e);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-104, -103, -117, -104, -93, -126, -107, -101, -103}, new byte[]{-4, -10}), c28237j.f73357c);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{48, -81, 26, -85, 44, -78, 32}, new byte[]{69, -33}), c28237j.f73358d);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{35, -74, 48, -73, 24, -83, 52}, new byte[]{71, -39}), c28237j.f73355a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-67, 53, -105, 49, -69}, new byte[]{-56, 69}), c28237j.f73356b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{26, -77, 9, -78, 33, -92}, new byte[]{126, -36}), c28219a.f73285a);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-99, -104, -114, -103, -90, -114}, new byte[]{-7, -9}), c28219a.f73286b);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{-92, 5, -114, 13}, new byte[]{-47, 117}), c28219a.f73287c);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{32, -113, 10, -122}, new byte[]{85, -1}), c28219a.f73288d);
            jSONObject.put(stringFogImpl.m23824a(new byte[]{26}, new byte[]{106, 124}), this.f73354c);
            String str2 = f73339d;
            Log.d(str2, stringFogImpl.m23824a(new byte[]{45, -58, 48, -57, 29, -49, 55, -64, 53, -30, 58, -125, 59, -43, 59, -51, 42, -125, 100, -125}, new byte[]{94, -93}) + c28237j);
            C28206a.m38470e().f73193i.m38312a(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
