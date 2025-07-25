package com.p552ot.pubsub.p559g;

import android.text.TextUtils;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26590l;
import com.p552ot.pubsub.util.C26599t;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.g.l */
/* loaded from: classes7.dex */
public class C26549l {

    /* renamed from: a */
    public static final String f69547a = "CN";

    /* renamed from: b */
    public static final String f69548b = "RU";

    /* renamed from: c */
    private static final String f69549c = "RegionDomainManager";

    /* renamed from: d */
    private static final String f69550d = "INTL";

    /* renamed from: e */
    private static final String f69551e = "IN";

    /* renamed from: f */
    private static final String f69552f = "http://";

    /* renamed from: g */
    private static final String f69553g = "https://";

    /* renamed from: h */
    private static String f69554h = "";

    /* renamed from: i */
    private static String f69555i = "";

    /* renamed from: j */
    private static String f69556j = "";

    /* renamed from: k */
    private static String f69557k = "";

    /* renamed from: l */
    private static String f69558l = "";

    /* renamed from: m */
    private static String f69559m = "";

    /* renamed from: n */
    private static String f69560n = "";

    /* renamed from: o */
    private static final String f69561o = "/api/v1/token";

    /* renamed from: p */
    private static final String f69562p = "/track/key_get";

    /* renamed from: q */
    private static final String f69563q = "/api/v4/detail/config_common";

    /* renamed from: r */
    private static final String f69564r = "/api/v4/detail/config_p";

    /* renamed from: s */
    private static final byte[] f69565s = {116, 114, 97, 99, 107, 105, 110, 103, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* renamed from: t */
    private static final byte[] f69566t = {116, 114, 97, 99, 107, 105, 110, 103, 46, 105, 110, 116, 108, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* renamed from: u */
    private static final byte[] f69567u = {116, 114, 97, 99, 107, 105, 110, 103, 46, 114, 117, 115, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* renamed from: v */
    private static final byte[] f69568v = {116, 114, 97, 99, 107, 105, 110, 103, 46, 105, 110, 100, 105, 97, 46, 109, 105, 117, 105, 46, 99, 111, 109};

    /* renamed from: w */
    private static final byte[] f69569w = {115, 100, 107, 99, 111, 110, 102, 105, 103, 46, 97, 100, 46, 105, 110, 116, 108, 46, 120, 105, 97, 111, 109, 105, 46, 99, 111, 109};

    /* renamed from: x */
    private static final byte[] f69570x = {115, 100, 107, 99, 111, 110, 102, 105, 103, 46, 97, 100, 46, 105, 110, 100, 105, 97, 46, 120, 105, 97, 111, 109, 105, 46, 99, 111, 109};

    /* renamed from: y */
    private static final byte[] f69571y = {115, 100, 107, 99, 111, 110, 102, 105, 103, 46, 97, 100, 46, 114, 117, 115, 46, 120, 105, 97, 111, 109, 105, 46, 99, 111, 109};

    /* renamed from: z */
    private static ConcurrentHashMap<String, String> f69572z = new ConcurrentHashMap<>();

    /* renamed from: com.ot.pubsub.g.l$a */
    /* loaded from: classes7.dex */
    private static class C26550a {

        /* renamed from: a */
        private static final C26549l f69573a = new C26549l();

        private C26550a() {
        }
    }

    /* renamed from: a */
    public static C26549l m41237a() {
        return C26550a.f69573a;
    }

    /* renamed from: f */
    private void m41228f() {
        f69557k = m41233a(f69565s);
        f69558l = m41233a(f69566t);
        f69559m = m41233a(f69567u);
        f69560n = m41233a(f69568v);
        f69554h = m41233a(f69569w);
        f69555i = m41233a(f69570x);
        f69556j = m41233a(f69571y);
    }

    /* renamed from: g */
    private String m41227g() {
        return "https://";
    }

    /* renamed from: h */
    private String m41226h() {
        boolean m41039h = C26590l.m41039h();
        String m41038i = C26590l.m41038i();
        if (!m41039h) {
            return f69554h;
        }
        if (TextUtils.equals(m41038i, f69551e)) {
            return f69555i;
        }
        if (TextUtils.equals(m41038i, f69548b)) {
            return f69556j;
        }
        return f69554h;
    }

    /* renamed from: i */
    private String m41225i() {
        return m41234a(C26590l.m41039h(), C26590l.m41038i());
    }

    /* renamed from: b */
    public String m41232b() {
        return m41236a(m41227g(), m41226h(), f69561o);
    }

    /* renamed from: c */
    public String m41231c() {
        return m41236a(m41227g(), m41225i(), f69562p);
    }

    /* renamed from: d */
    public String m41230d() {
        return m41236a(m41227g(), m41226h(), f69563q);
    }

    /* renamed from: e */
    public String m41229e() {
        return m41236a(m41227g(), m41226h(), f69564r);
    }

    private C26549l() {
        m41228f();
        f69572z.put(f69551e, f69560n);
        f69572z.put(f69548b, f69559m);
    }

    /* renamed from: a */
    private String m41233a(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            C26586j.m41074b(f69549c, e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public String m41236a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: a */
    private String m41234a(boolean z, String str) {
        if (!z) {
            return f69557k;
        }
        String str2 = f69572z.get(str);
        return TextUtils.isEmpty(str2) ? f69558l : str2;
    }

    /* renamed from: a */
    public synchronized void m41235a(JSONObject jSONObject) {
        C26586j.m41080a(f69549c, "updateHostMap:" + jSONObject.toString());
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    f69572z.put(next, optString);
                }
            }
            C26599t.m40972g(new JSONObject(f69572z).toString());
        } catch (Exception e) {
            C26586j.m41080a(f69549c, "updateHostMap: " + e.toString());
        }
        C26586j.m41080a(f69549c, "merge config:" + new JSONObject(f69572z).toString());
    }
}
