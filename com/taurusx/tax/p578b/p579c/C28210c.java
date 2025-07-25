package com.taurusx.tax.p578b.p579c;

import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28528l;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.c.c */
/* loaded from: classes7.dex */
public class C28210c implements Serializable {

    /* renamed from: a */
    public String f73225a;

    /* renamed from: b */
    public String f73226b;

    /* renamed from: c */
    public C28211a f73227c;

    /* renamed from: d */
    public C28214b f73228d;

    /* renamed from: e */
    public String f73229e;

    /* renamed from: com.taurusx.tax.b.c.c$a */
    /* loaded from: classes7.dex */
    public static class C28211a implements Serializable {

        /* renamed from: a */
        public String f73230a;

        /* renamed from: b */
        public String f73231b;

        /* renamed from: c */
        public String f73232c;

        /* renamed from: d */
        public String f73233d;

        /* renamed from: e */
        public String f73234e;

        /* renamed from: f */
        public String f73235f;

        /* renamed from: g */
        public ArrayList<String> f73236g = new ArrayList<>();

        /* renamed from: h */
        public ArrayList<String> f73237h = new ArrayList<>();

        /* renamed from: i */
        public ArrayList<String> f73238i = new ArrayList<>();

        /* renamed from: j */
        public ArrayList<String> f73239j = new ArrayList<>();

        /* renamed from: k */
        public String f73240k;

        /* renamed from: l */
        public String f73241l;

        /* renamed from: m */
        public int f73242m;

        /* renamed from: n */
        public C28212a f73243n;

        /* renamed from: com.taurusx.tax.b.c.c$a$a */
        /* loaded from: classes7.dex */
        public static class C28212a implements Serializable {

            /* renamed from: a */
            public C28213a f73244a;

            /* renamed from: b */
            public String f73245b;

            /* renamed from: com.taurusx.tax.b.c.c$a$a$a */
            /* loaded from: classes7.dex */
            public static class C28213a implements Serializable {

                /* renamed from: a */
                public String f73246a;

                /* renamed from: b */
                public int f73247b;
            }
        }
    }

    /* renamed from: com.taurusx.tax.b.c.c$b */
    /* loaded from: classes7.dex */
    public static class C28214b implements Serializable {

        /* renamed from: a */
        public C28215a f73248a;

        /* renamed from: b */
        public C28216b f73249b;

        /* renamed from: com.taurusx.tax.b.c.c$b$a */
        /* loaded from: classes7.dex */
        public static class C28215a implements Serializable {

            /* renamed from: a */
            public int f73250a;

            /* renamed from: b */
            public int f73251b;

            /* renamed from: c */
            public int f73252c;
        }

        /* renamed from: com.taurusx.tax.b.c.c$b$b */
        /* loaded from: classes7.dex */
        public static class C28216b implements Serializable {

            /* renamed from: a */
            public int f73253a;

            /* renamed from: b */
            public int f73254b;

            /* renamed from: c */
            public float f73255c;

            /* renamed from: d */
            public String f73256d;

            /* renamed from: e */
            public int f73257e;

            /* renamed from: f */
            public long f73258f;

            /* renamed from: g */
            public long f73259g;

            /* renamed from: h */
            public long f73260h;

            /* renamed from: i */
            public long f73261i;

            /* renamed from: j */
            public int f73262j;

            /* renamed from: k */
            public boolean f73263k;

            /* renamed from: l */
            public boolean f73264l;

            /* renamed from: m */
            public int f73265m;

            /* renamed from: n */
            public boolean f73266n;

            /* renamed from: o */
            public boolean f73267o;

            /* renamed from: p */
            public boolean f73268p;

            /* renamed from: q */
            public float f73269q;

            /* renamed from: r */
            public long f73270r;

            /* renamed from: s */
            public long f73271s;

            /* renamed from: t */
            public boolean f73272t;

            /* renamed from: u */
            public long f73273u;

            /* renamed from: v */
            public boolean f73274v;

            /* renamed from: a */
            public static C28216b m38427a(JSONObject jSONObject) {
                C28216b c28216b = new C28216b();
                JSONObject optJSONObject = jSONObject.optJSONObject(C28162a.m38504a(new byte[]{69, 34, 93, 25, 85, 41, 88, 32, 95, 33}, new byte[]{54, 70}));
                if (optJSONObject != null) {
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-101, 16, -98, 20, -101, 17, -74, 3, UnsignedBytes.MAX_POWER_OF_TWO, 17, -116, 26, -74, 20, -123, 25, -122, 2, -74, 6, -126, 28, -103, 42, -99, 28, -124, 16, -74, 24, -102}, new byte[]{-23, 117}))) {
                        c28216b.f73253a = optJSONObject.optInt(C28162a.m38504a(new byte[]{-34, 7, -37, 3, -34, 6, -13, 20, -59, 6, -55, 13, -13, 3, -64, 14, -61, 21, -13, 17, -57, 11, -36, 61, -40, 11, -63, 7, -13, 15, -33}, new byte[]{-84, 98}));
                    } else {
                        c28216b.f73253a = (int) C28218b.m38424C();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-114, 35, -113, 46, -118, 63, -113, 18, -120, 33, -124, 62, -114, 18, -119, 56, -97, 57, -124, 35, -76, 62, -125, 34, -100, 18, -97, 36, -122, 40, -76, 32, -104}, new byte[]{-21, 77}))) {
                        c28216b.f73254b = optJSONObject.optInt(C28162a.m38504a(new byte[]{38, -82, 39, -93, 34, -78, 39, -97, 32, -84, 44, -77, 38, -97, 33, -75, 55, -76, 44, -82, 28, -77, 43, -81, 52, -97, 55, -87, 46, -91, 28, -83, 48}, new byte[]{67, -64}));
                    } else {
                        c28216b.f73254b = (int) C28218b.m38396u();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{85, 108, 89, 115, 83, 95, 84, 117, 66, 116, 89, 110, 105, 115, 95, 122, 83, 95, 68, 97, 66, 105, 89}, new byte[]{54, 0}))) {
                        c28216b.f73255c = (float) optJSONObject.optDouble(C28162a.m38504a(new byte[]{107, 56, 103, 39, 109, 11, 106, 33, 124, 32, 103, 58, 87, 39, 97, 46, 109, 11, 122, 53, 124, 61, 103}, new byte[]{8, 84}));
                    } else {
                        c28216b.f73255c = C28218b.m38398s();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{104, -106, 109, -110, 104, -105, 69, -99, 123, -98, Byte.MAX_VALUE}, new byte[]{26, -13}))) {
                        c28216b.f73256d = optJSONObject.optString(C28162a.m38504a(new byte[]{-127, 69, -124, 65, -127, 68, -84, 78, -110, 77, -106}, new byte[]{-13, 32}));
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{38, -127, 35, -123, 38, UnsignedBytes.MAX_POWER_OF_TWO, 11, -110, 53, -120, 33, -127}, new byte[]{84, -28}))) {
                        c28216b.f73257e = optJSONObject.optInt(C28162a.m38504a(new byte[]{-114, -31, -117, -27, -114, -32, -93, -14, -99, -24, -119, -31}, new byte[]{-4, -124}));
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-35, -19, -40, -23, -35, -20, -16, -2, -58, -20, -54, -25, -16, -21, -61, -25, -36, -19, -16, -22, -38, -4, -37, -25, -63, -41, -36, -32, -64, -1, -16, -4, -58, -27, -54, -41, -62, -5}, new byte[]{-81, -120}))) {
                        c28216b.f73258f = optJSONObject.optLong(C28162a.m38504a(new byte[]{-116, 101, -119, 97, -116, 100, -95, 118, -105, 100, -101, 111, -95, 99, -110, 111, -115, 101, -95, 98, -117, 116, -118, 111, -112, 95, -115, 104, -111, 119, -95, 116, -105, 109, -101, 95, -109, 115}, new byte[]{-2, 0}));
                    } else {
                        c28216b.f73258f = C28218b.m38423D();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-11, 65, -17, 91, -16, 112, -3, 67, -16, SignedBytes.MAX_POWER_OF_TWO, -21, 112, -17, 68, -11, 95, -61, 91, -11, 66, -7, 112, -15, 92}, new byte[]{-100, 47}))) {
                        c28216b.f73259g = optJSONObject.optLong(C28162a.m38504a(new byte[]{97, 23, 123, 13, 100, 38, 105, 21, 100, 22, Byte.MAX_VALUE, 38, 123, 18, 97, 9, 87, 13, 97, 20, 109, 38, 101, 10}, new byte[]{8, 121}));
                    } else {
                        c28216b.f73259g = C28218b.m38393x();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{92, 61, 70, 39, 89, 12, 86, 63, 90, 32, 80, 12, 87, 38, 65, 39, 90, 61, 106, 32, 93, 60, 66, 12, 65, 58, 88, 54, 106, 62, 70}, new byte[]{53, 83}))) {
                        c28216b.f73260h = optJSONObject.optLong(C28162a.m38504a(new byte[]{-11, -95, -17, -69, -16, -112, -1, -93, -13, -68, -7, -112, -2, -70, -24, -69, -13, -95, -61, -68, -12, -96, -21, -112, -24, -90, -15, -86, -61, -94, -17}, new byte[]{-100, -49}));
                    } else {
                        c28216b.f73260h = C28218b.m38392y();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-75, -44, -117, -45, -75, -45, -68, -43, -117, -60, -96, -36, -117, -35, -89}, new byte[]{-44, -80}))) {
                        c28216b.f73261i = optJSONObject.optLong(C28162a.m38504a(new byte[]{81, 65, 111, 70, 81, 70, 88, SignedBytes.MAX_POWER_OF_TWO, 111, 81, 68, 73, 111, 72, 67}, new byte[]{48, 37}));
                    } else {
                        c28216b.f73261i = C28218b.m38416b();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-1, 17, -8, 20, -54, 9, -16, 16, -3, 11, -15}, new byte[]{-107, 100}))) {
                        c28216b.f73262j = optJSONObject.optInt(C28162a.m38504a(new byte[]{76, -82, 75, -85, 121, -74, 67, -81, 78, -76, 66}, new byte[]{38, -37}));
                    } else {
                        c28216b.f73262j = C28218b.m38391z();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{87, 95, 84, 80, 94, 108, 84, 65, 80, 82, 106, 80, 89, 90, 86, 88, 106, 86, 91, 82, 87, 95, 80}, new byte[]{53, 51}))) {
                        c28216b.f73263k = optJSONObject.optBoolean(C28162a.m38504a(new byte[]{-49, -127, -52, -114, -58, -78, -52, -97, -56, -116, -14, -114, -63, -124, -50, -122, -14, -120, -61, -116, -49, -127, -56}, new byte[]{-83, -19}));
                    } else {
                        c28216b.f73263k = C28218b.m38421a();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{40, 44, 41, 33, 44, 48, 41, 112, 18, 39, 35, 35, 47, 46, 40, 29, 59, 112}, new byte[]{77, 66}))) {
                        c28216b.f73264l = optJSONObject.optBoolean(C28162a.m38504a(new byte[]{-42, -94, -41, -81, -46, -66, -41, -2, -20, -87, -35, -83, -47, -96, -42, -109, -59, -2}, new byte[]{-77, -52}));
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{83, 107, 82, 102, 87, 119, 82, 55, 105, 102, 90, 106, 69, 96, 105, 113, 95, 104, 83, 90, 91, 118}, new byte[]{54, 5}))) {
                        c28216b.f73265m = optJSONObject.optInt(C28162a.m38504a(new byte[]{-36, 37, -35, 40, -40, 57, -35, 121, -26, 40, -43, 36, -54, 46, -26, 63, -48, 38, -36, 20, -44, 56}, new byte[]{-71, 75}));
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-75, 41, -94, 55, -120, 32, -71, 36, -75, 41, -78}, new byte[]{-41, 69}))) {
                        c28216b.f73266n = optJSONObject.optBoolean(C28162a.m38504a(new byte[]{-13, -111, -28, -113, -50, -104, -1, -100, -13, -111, -12}, new byte[]{-111, -3}));
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-93, -5, -78, -18, -116, -32, -69, -2, -65, -14, -116, -13, -68, -32, -67, -5, -68, -10, -73, -2, -67, -16, -116, -14, -67, -10, -79, -5, -74, -56, -91, -91}, new byte[]{-45, -105}))) {
                        c28216b.f73267o = optJSONObject.optBoolean(C28162a.m38504a(new byte[]{-101, -57, -118, -46, -76, -36, -125, -62, -121, -50, -76, -49, -124, -36, -123, -57, -124, -54, -113, -62, -123, -52, -76, -50, -123, -54, -119, -57, -114, -12, -99, -103}, new byte[]{-21, -85}));
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{73, -5, 88, -44, 71, -5, 77, -27, 119, -22, 93, -1, 71, -44, 75, -25, 71, -8, 77}, new byte[]{40, -117}))) {
                        c28216b.f73268p = optJSONObject.optBoolean(C28162a.m38504a(new byte[]{117, -51, 100, -30, 123, -51, 113, -45, 75, -36, 97, -55, 123, -30, 119, -47, 123, -50, 113}, new byte[]{20, -67}));
                    } else {
                        c28216b.f73268p = C28218b.m38406k();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{49, -64, 32, -17, 63, -64, 53, -34, 15, -45, 60, -33, 35, -43, 15, -46, 37, -60, 36, -33, 62, -17, 35, -39, 42, -43, 15, -62, 49, -60, 57, -33}, new byte[]{80, -80}))) {
                        c28216b.f73269q = (float) optJSONObject.optDouble(C28162a.m38504a(new byte[]{-28, 8, -11, 39, -22, 8, -32, 22, -38, 27, -23, 23, -10, 29, -38, 26, -16, 12, -15, 23, -21, 39, -10, 17, -1, 29, -38, 10, -28, 12, -20, 23}, new byte[]{-123, 120}));
                    } else {
                        c28216b.f73269q = C28218b.m38405l();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{29, -89, 12, -120, 19, -89, 25, -71, 35, -74, 16, -69, 19, -96, 35, -92, 23, -66, 12, -120, 8, -66, 17, -78, 35, -70, 15}, new byte[]{124, -41}))) {
                        c28216b.f73270r = optJSONObject.optLong(C28162a.m38504a(new byte[]{26, -2, 11, -47, 20, -2, 30, -32, 36, -17, 23, -30, 20, -7, 36, -3, 16, -25, 11, -47, 15, -25, 22, -21, 36, -29, 8}, new byte[]{123, -114}));
                    } else {
                        c28216b.f73270r = C28218b.m38407j();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{72, -119, 89, -90, 70, -119, 76, -105, 118, -102, 70, -116, 71, -115, 77, -106, 94, -105, 118, -115, SignedBytes.MAX_POWER_OF_TWO, -108, 76, -90, 68, -118}, new byte[]{41, -7}))) {
                        c28216b.f73271s = optJSONObject.optLong(C28162a.m38504a(new byte[]{30, -117, 15, -92, 16, -117, 26, -107, 32, -104, 16, -114, 17, -113, 27, -108, 8, -107, 32, -113, 22, -106, 26, -92, 18, -120}, new byte[]{Byte.MAX_VALUE, -5}));
                    } else {
                        c28216b.f73271s = C28218b.m38404m();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{5, 31, 20, 48, 11, 31, 1, 1, 59, 26, 23, 10, 59, 28, 15, 6, 20}, new byte[]{100, 111}))) {
                        c28216b.f73272t = optJSONObject.optBoolean(C28162a.m38504a(new byte[]{108, -24, 125, -57, 98, -24, 104, -10, 82, -19, 126, -3, 82, -21, 102, -15, 125}, new byte[]{13, -104}));
                    } else {
                        c28216b.f73272t = C28218b.m38403n();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{122, 42, 107, 5, 116, 42, 126, 52, 68, 44, 114, 62, 126, 53, 68, 57, 116, 47, 117, 46, Byte.MAX_VALUE, 53, 108, 52, 68, 46, 114, 55, 126, 5, 118, 41}, new byte[]{27, 90}))) {
                        c28216b.f73273u = optJSONObject.optLong(C28162a.m38504a(new byte[]{-1, -20, -18, -61, -15, -20, -5, -14, -63, -22, -9, -8, -5, -13, -63, -1, -15, -23, -16, -24, -6, -13, -23, -14, -63, -24, -9, -15, -5, -61, -13, -17}, new byte[]{-98, -100}));
                    } else {
                        c28216b.f73273u = C28218b.m38402o();
                    }
                    if (optJSONObject.has(C28162a.m38504a(new byte[]{-46, -69, -20, -74, -41, -70, -35, -85, -38, -71, -38, -70, -63, UnsignedBytes.MAX_POWER_OF_TWO, -64, -73, -36, -88, -20, -70, -35, -66, -47, -77, -42}, new byte[]{-77, -33}))) {
                        c28216b.f73274v = optJSONObject.optBoolean(C28162a.m38504a(new byte[]{7, 50, 57, 63, 2, 51, 8, 34, 15, 48, 15, 51, 20, 9, 21, 62, 9, 33, 57, 51, 8, 55, 4, 58, 3}, new byte[]{102, 86}));
                    } else {
                        c28216b.f73274v = C28218b.m38410g();
                    }
                } else {
                    c28216b.f73253a = (int) C28218b.m38424C();
                    c28216b.f73254b = (int) C28218b.m38396u();
                    c28216b.f73255c = C28218b.m38398s();
                    c28216b.f73256d = C28218b.m38426A();
                    c28216b.f73257e = C28218b.m38425B();
                    c28216b.f73258f = C28218b.m38423D();
                    c28216b.f73260h = C28218b.m38392y();
                    c28216b.f73261i = C28218b.m38416b();
                    c28216b.f73262j = C28218b.m38391z();
                    c28216b.f73263k = C28218b.m38421a();
                    c28216b.f73267o = C28218b.m38422E();
                    c28216b.f73268p = C28218b.m38406k();
                    c28216b.f73269q = C28218b.m38405l();
                    c28216b.f73270r = C28218b.m38407j();
                    c28216b.f73271s = C28218b.m38404m();
                    c28216b.f73272t = C28218b.m38403n();
                    c28216b.f73273u = C28218b.m38402o();
                    c28216b.f73274v = C28218b.m38410g();
                }
                C28528l.m37999a(c28216b.f73262j == 2);
                return c28216b;
            }
        }

        /* renamed from: a */
        public static C28214b m38428a(JSONObject jSONObject) {
            C28214b c28214b = new C28214b();
            try {
                C28215a c28215a = new C28215a();
                StringFogImpl stringFogImpl = C28162a.f73047a;
                JSONObject optJSONObject = jSONObject.optJSONObject(stringFogImpl.m23824a(new byte[]{65, 29, 89, 38, 81, 22, 92, 31, 91, 30}, new byte[]{50, 121}));
                if (optJSONObject != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(stringFogImpl.m23824a(new byte[]{66, -25, 76, -30, Byte.MAX_VALUE, -4, 85, -30, 69}, new byte[]{32, -114}));
                    if (optJSONObject2 != null) {
                        if (optJSONObject2.has(stringFogImpl.m23824a(new byte[]{-22, 6, -17, 6, -2, 3, -7, 48, -3, 29, -7, 14, -61, 29, -3, 27, -11, 0}, new byte[]{-100, 111}))) {
                            c28215a.f73250a = (int) new BigDecimal(String.valueOf(optJSONObject2.getDouble(stringFogImpl.m23824a(new byte[]{83, 68, 86, 68, 71, 65, SignedBytes.MAX_POWER_OF_TWO, 114, 68, 95, SignedBytes.MAX_POWER_OF_TWO, 76, 122, 95, 68, 89, 76, 66}, new byte[]{37, 45})))).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                        } else {
                            c28215a.f73250a = (int) new BigDecimal(String.valueOf(C28218b.m38399r())).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                        }
                        if (optJSONObject2.has(stringFogImpl.m23824a(new byte[]{-80, -116, -84, -109, -100, UnsignedBytes.MAX_POWER_OF_TWO, -74, -106, -94, -112, -86, -117, -83, -69, -82, -105}, new byte[]{-61, -28}))) {
                            c28215a.f73251b = (int) (optJSONObject2.optLong(stringFogImpl.m23824a(new byte[]{-53, 99, -41, 124, -25, 111, -51, 121, -39, Byte.MAX_VALUE, -47, 100, -42, 84, -43, 120}, new byte[]{-72, 11})) / 1000);
                        } else {
                            c28215a.f73251b = (int) (C28218b.m38400q() / 1000);
                        }
                        if (optJSONObject2.has(stringFogImpl.m23824a(new byte[]{-88, 42, -71, 63, -121, 34, -83, 52, -71, 50, -79, 41, -74, 25, -75, 53}, new byte[]{-40, 70}))) {
                            c28215a.f73252c = (int) (optJSONObject2.optLong(stringFogImpl.m23824a(new byte[]{-48, -79, -63, -92, -1, -71, -43, -81, -63, -87, -55, -78, -50, -126, -51, -82}, new byte[]{-96, -35})) / 1000);
                        } else {
                            c28215a.f73252c = (int) (C28218b.m38401p() / 1000);
                        }
                    } else {
                        c28215a.f73250a = (int) new BigDecimal(String.valueOf(C28218b.m38399r())).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                        c28215a.f73251b = (int) (C28218b.m38400q() / 1000);
                        c28215a.f73252c = (int) (C28218b.m38401p() / 1000);
                    }
                } else {
                    c28215a.f73250a = (int) new BigDecimal(String.valueOf(C28218b.m38399r())).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                    c28215a.f73251b = (int) (C28218b.m38400q() / 1000);
                    c28215a.f73252c = (int) (C28218b.m38401p() / 1000);
                }
                c28214b.f73248a = c28215a;
                c28214b.f73249b = C28216b.m38427a(jSONObject);
                return c28214b;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public static C28210c m38429a(JSONObject jSONObject) {
        C28211a c28211a;
        int i;
        int i2;
        C28210c c28210c = new C28210c();
        byte[] bArr = {-70};
        StringFogImpl stringFogImpl = C28162a.f73047a;
        if (jSONObject.has(stringFogImpl.m23824a(bArr, new byte[]{-37, -72}))) {
            c28210c.f73225a = jSONObject.optString(stringFogImpl.m23824a(new byte[]{111}, new byte[]{14, -94}));
        }
        if (jSONObject.has(stringFogImpl.m23824a(new byte[]{2}, new byte[]{96, 37}))) {
            c28210c.f73226b = jSONObject.optString(stringFogImpl.m23824a(new byte[]{-100}, new byte[]{-2, 6}));
        }
        if (jSONObject.has(stringFogImpl.m23824a(new byte[]{69}, new byte[]{53, 46}))) {
            c28210c.f73229e = jSONObject.optString(stringFogImpl.m23824a(new byte[]{56}, new byte[]{72, -35}));
        }
        if (jSONObject.has(stringFogImpl.m23824a(new byte[]{54, -82, 58}, new byte[]{87, -54}))) {
            c28211a = new C28211a();
            c28211a.f73235f = jSONObject.optString(stringFogImpl.m23824a(new byte[]{-24, 29, -3, 12, -9, 48, -23, 29, -16, 48, -20, 29, -7, 9, -11, 23}, new byte[]{-100, 111}));
            Double valueOf = Double.valueOf(jSONObject.optDouble(stringFogImpl.m23824a(new byte[]{-86, 123, -77, 106, -65}, new byte[]{-38, 9})));
            if (valueOf != null) {
                valueOf.floatValue();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(stringFogImpl.m23824a(new byte[]{-18, 47, -5, 62, -15, 56, -24, 46}, new byte[]{-102, 93}));
            ArrayList<String> m38033a = C28518e.m38033a(optJSONObject.optJSONArray(stringFogImpl.m23824a(new byte[]{16, 104, 9}, new byte[]{89, 37})));
            if (m38033a != null && !m38033a.isEmpty()) {
                c28211a.f73236g.addAll(m38033a);
            }
            ArrayList<String> m38033a2 = C28518e.m38033a(optJSONObject.optJSONArray(stringFogImpl.m23824a(new byte[]{68, -77, 74, -74}, new byte[]{6, -6})));
            if (m38033a2 != null && !m38033a2.isEmpty()) {
                c28211a.f73238i.addAll(m38033a2);
            }
            ArrayList<String> m38033a3 = C28518e.m38033a(optJSONObject.optJSONArray(stringFogImpl.m23824a(new byte[]{4, 62, 14, 49, 12}, new byte[]{71, 114})));
            if (m38033a3 != null && !m38033a3.isEmpty()) {
                c28211a.f73237h.addAll(m38033a3);
            }
            ArrayList<String> m38033a4 = C28518e.m38033a(optJSONObject.optJSONArray(stringFogImpl.m23824a(new byte[]{81, -104, 87, -111}, new byte[]{30, -43})));
            if (m38033a4 != null && !m38033a4.isEmpty()) {
                c28211a.f73239j.addAll(m38033a4);
            }
            jSONObject.optString(stringFogImpl.m23824a(new byte[]{-79, -9, -67, -26, -65, -25}, new byte[]{-45, -126}));
            JSONObject m38032a = C28518e.m38032a(jSONObject, stringFogImpl.m23824a(new byte[]{-16, 118, -4}, new byte[]{-111, 18}));
            c28211a.f73234e = C28518e.m38020b(m38032a, stringFogImpl.m23824a(new byte[]{-44, 9, -48, 21}, new byte[]{-96, 112}));
            if (stringFogImpl.m23824a(new byte[]{SignedBytes.MAX_POWER_OF_TWO, 70, 69, 83}, new byte[]{54, 39}).equalsIgnoreCase(c28211a.f73234e)) {
                c28211a.f73230a = C28518e.m38020b(m38032a, stringFogImpl.m23824a(new byte[]{-107, -24, -112, -3}, new byte[]{-29, -119}));
            } else if (stringFogImpl.m23824a(new byte[]{111, -121, 117, -113, 119, -125}, new byte[]{1, -26}).equalsIgnoreCase(c28211a.f73234e)) {
                c28211a.f73230a = C28518e.m38020b(m38032a, stringFogImpl.m23824a(new byte[]{17, -38, 11, -46, 9, -34}, new byte[]{Byte.MAX_VALUE, -69}));
            } else if (stringFogImpl.m23824a(new byte[]{39, 62, 34, 38}, new byte[]{79, 74}).equalsIgnoreCase(c28211a.f73234e)) {
                c28211a.f73230a = C28518e.m38020b(m38032a, stringFogImpl.m23824a(new byte[]{4, -95, 1, -71}, new byte[]{108, -43}));
            }
            JSONObject m38032a2 = C28518e.m38032a(m38032a, stringFogImpl.m23824a(new byte[]{-30, -111, -13}, new byte[]{-121, -23}));
            if (m38032a2 != null) {
                c28211a.f73243n = new C28211a.C28212a();
                JSONObject m38032a3 = C28518e.m38032a(m38032a2, stringFogImpl.m23824a(new byte[]{-74, 53, -95, 63, -66, 61, -69, 49, -73, 46}, new byte[]{-46, 92}));
                if (m38032a3 != null) {
                    c28211a.f73243n.f73244a = new C28211a.C28212a.C28213a();
                    String m38020b = C28518e.m38020b(m38032a3, stringFogImpl.m23824a(new byte[]{-105, -105, -101, -122}, new byte[]{-29, -14}));
                    try {
                        i2 = m38032a3.getInt(stringFogImpl.m23824a(new byte[]{39, 52, 37, 50, 50, 63, 35}, new byte[]{87, 81}));
                    } catch (Exception unused) {
                        i2 = 0;
                    }
                    C28211a.C28212a.C28213a c28213a = c28211a.f73243n.f73244a;
                    c28213a.f73246a = m38020b;
                    c28213a.f73247b = i2;
                }
                String m38020b2 = C28518e.m38020b(m38032a2, C28162a.f73047a.m23824a(new byte[]{-101, -116, -91, -119, -104, -99, -119, -115, -91, -99, -120, -124}, new byte[]{-6, -24}));
                if (!TextUtils.isEmpty(m38020b2)) {
                    c28211a.f73243n.f73245b = m38020b2;
                }
            }
            StringFogImpl stringFogImpl2 = C28162a.f73047a;
            c28211a.f73231b = C28518e.m38020b(m38032a, stringFogImpl2.m23824a(new byte[]{23, 69, 22, 72, 19, 89, 22, 25, 45, 66, 17, 68, 28, 116, 7, 89, 30}, new byte[]{114, 43}));
            c28211a.f73232c = C28518e.m38020b(m38032a, stringFogImpl2.m23824a(new byte[]{-57, -99, -58, -112, -61, -127, -58, -63, -3, -121, -53, -121, -50, -106}, new byte[]{-94, -13}));
            c28211a.f73233d = C28518e.m38020b(m38032a, stringFogImpl2.m23824a(new byte[]{-115, -10, -116, -5, -119, -22, -116, -86, -73, -5, -100, -7}, new byte[]{-24, -104}));
            c28211a.f73240k = C28518e.m38020b(m38032a, stringFogImpl2.m23824a(new byte[]{-30, 90, -29, 79, -22, 86, -24, 84}, new byte[]{-122, 63}));
            c28211a.f73241l = C28518e.m38020b(m38032a, stringFogImpl2.m23824a(new byte[]{-43, -50, -33, -61, -47, -50, -48, -60}, new byte[]{-77, -81}));
            try {
                i = m38032a.getInt(stringFogImpl2.m23824a(new byte[]{-106, -109, -98}, new byte[]{-9, -29}));
            } catch (Exception unused2) {
                i = 0;
            }
            c28211a.f73242m = i;
        } else {
            c28211a = null;
        }
        StringFogImpl stringFogImpl3 = C28162a.f73047a;
        String m23824a = stringFogImpl3.m23824a(new byte[]{-119, -118, -120, -103, -120, -104, -123}, new byte[]{-3, -21});
        LogUtil.m37901iv(m23824a, stringFogImpl3.m23824a(new byte[]{-58, 108, -54, 40, -99, 40}, new byte[]{-89, 8}) + c28211a.f73230a);
        c28210c.f73227c = c28211a;
        c28210c.f73228d = C28214b.m38428a(jSONObject);
        return c28210c;
    }
}
