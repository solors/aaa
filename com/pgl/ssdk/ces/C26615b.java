package com.pgl.ssdk.ces;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.pgl.ssdk.C26603a0;
import com.pgl.ssdk.C26608b0;
import com.pgl.ssdk.C26609b1;
import com.pgl.ssdk.C26612c0;
import com.pgl.ssdk.C26624d0;
import com.pgl.ssdk.C26627e0;
import com.pgl.ssdk.C26631f0;
import com.pgl.ssdk.C26634g0;
import com.pgl.ssdk.C26637h0;
import com.pgl.ssdk.C26639i0;
import com.pgl.ssdk.C26641j0;
import com.pgl.ssdk.C26645l0;
import com.pgl.ssdk.C26650n0;
import com.pgl.ssdk.C26652o0;
import com.pgl.ssdk.C26660s;
import com.pgl.ssdk.C26662t;
import com.pgl.ssdk.C26663t0;
import com.pgl.ssdk.C26665u;
import com.pgl.ssdk.C26667u0;
import com.pgl.ssdk.C26668v;
import com.pgl.ssdk.C26670v0;
import com.pgl.ssdk.C26671w;
import com.pgl.ssdk.C26676x;
import com.pgl.ssdk.C26682z;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.ces.b */
/* loaded from: classes7.dex */
public class C26615b {

    /* renamed from: a */
    private static volatile C26615b f69859a = null;

    /* renamed from: b */
    private static boolean f69860b = false;

    /* renamed from: c */
    public static boolean f69861c = false;

    /* renamed from: d */
    private static Map<String, Object> f69862d = null;

    /* renamed from: e */
    private static int f69863e = 1;

    /* renamed from: f */
    private static C26663t0.C26664a f69864f;

    /* renamed from: h */
    public Context f69866h;

    /* renamed from: i */
    private String f69867i;

    /* renamed from: j */
    private int f69868j;

    /* renamed from: k */
    private String f69869k;

    /* renamed from: p */
    private String f69874p;

    /* renamed from: g */
    public boolean f69865g = false;

    /* renamed from: l */
    private String f69870l = null;

    /* renamed from: m */
    private String f69871m = null;

    /* renamed from: n */
    private String f69872n = null;

    /* renamed from: o */
    private String f69873o = null;

    /* renamed from: q */
    private boolean f69875q = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pgl.ssdk.ces.b$a */
    /* loaded from: classes7.dex */
    public static class RunnableC26616a implements Runnable {
        RunnableC26616a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C26676x.m40708b(C26676x.m40709b());
        }
    }

    /* renamed from: com.pgl.ssdk.ces.b$b */
    /* loaded from: classes7.dex */
    public class RunnableC26617b implements Runnable {
        RunnableC26617b() {
            C26615b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C26641j0.m40846a(C26615b.this.f69866h).m40847a();
            C26639i0.m40855a(C26615b.this.f69866h).m40856a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pgl.ssdk.ces.b$c */
    /* loaded from: classes7.dex */
    public class RunnableC26618c implements Runnable {
        RunnableC26618c() {
            C26615b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C26682z.m40692b(C26615b.this.f69866h);
        }
    }

    private C26615b(Context context, String str) {
        this.f69866h = context;
        this.f69867i = str;
    }

    /* renamed from: a */
    public static C26615b m40915a(Context context, String str, int i, int i2, String str2) {
        if (f69859a == null) {
            synchronized (C26615b.class) {
                if (f69859a == null) {
                    if (context == null) {
                        context = C26682z.m40696a().getApplicationContext();
                    }
                    if (context == null) {
                        f69863e = 4;
                        return null;
                    }
                    m40918a(i);
                    C26663t0.C26664a m40756b = C26663t0.m40756b(context, "nms");
                    if (m40756b != null) {
                        f69863e = m40756b.f69965a;
                        f69864f = m40756b;
                        return null;
                    }
                    C26615b c26615b = new C26615b(context, str);
                    f69859a = c26615b;
                    c26615b.f69868j = i2;
                    f69859a.f69869k = str2;
                    f69859a.m40907b(context);
                    f69859a.m40904c(m40916a(context));
                    C26676x.m40706c(context);
                    f69863e = 0;
                    C26652o0.m40800b(new RunnableC26616a());
                }
            }
        }
        return f69859a;
    }

    /* renamed from: c */
    private void m40904c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f69874p = str;
        C26614a.meta(104, null, str);
    }

    /* renamed from: e */
    public static String m40901e() {
        if (m40898h() != null) {
            return m40898h().f69870l;
        }
        return null;
    }

    /* renamed from: g */
    public static int m40899g() {
        return f69863e;
    }

    /* renamed from: h */
    public static C26615b m40898h() {
        return f69859a;
    }

    /* renamed from: i */
    public static C26663t0.C26664a m40897i() {
        return f69864f;
    }

    /* renamed from: l */
    private void m40894l() {
        C26609b1.m40930a(this.f69866h, this.f69867i);
    }

    /* renamed from: b */
    public void m40908b() {
        Map<String, Object> map = f69862d;
        if (map != null) {
            Object obj = map.get(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ);
            if (obj instanceof String) {
                String m40860a = C26634g0.m40860a((String) obj);
                if (TextUtils.isEmpty(m40860a)) {
                    return;
                }
                C26614a.meta(159, null, m40860a);
            }
        }
    }

    /* renamed from: d */
    public synchronized void m40902d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f69872n)) {
            C26614a.meta(112, null, str);
            this.f69872n = str;
            C26609b1.m40926c();
        }
    }

    /* renamed from: f */
    public long m40900f() {
        return C26676x.m40711a(this.f69866h);
    }

    /* renamed from: j */
    public String m40896j() {
        return C26676x.m40707c();
    }

    /* renamed from: k */
    public String m40895k() {
        return C26609b1.m40927b();
    }

    /* renamed from: m */
    public void m40893m() {
        this.f69875q = true;
        C26650n0.m40807b();
        m40894l();
        m40911a("CZL-L1st", (Map<String, Object>) null);
    }

    /* renamed from: c */
    public void m40905c() {
        C26652o0.m40800b(new RunnableC26618c());
    }

    /* renamed from: d */
    public static String m40903d() {
        if (m40898h() != null) {
            return m40898h().f69867i;
        }
        return null;
    }

    /* renamed from: b */
    private void m40907b(Context context) {
        if (context == null || f69860b) {
            return;
        }
        try {
            C26614a.meta(101, null, "1");
            C26614a.meta(102, null, this.f69867i);
            C26614a.meta(114, null, Integer.valueOf(this.f69868j));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C26682z.m40686g(context));
            C26614a.meta(105, null, sb2.toString());
            C26614a.meta(106, null, C26682z.m40688e(context));
            C26614a.meta(107, null, C26682z.m40689d(context));
            C26614a.meta(108, null, C26682z.m40690c(context));
            C26614a.meta(109, null, C26682z.m40691c());
            C26614a.meta(110, null, C26682z.m40693b());
            C26614a.meta(115, null, this.f69869k);
            f69860b = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public synchronized void m40906b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f69873o)) {
            C26614a.meta(111, null, str);
            this.f69873o = str;
            C26609b1.m40926c();
        }
    }

    /* renamed from: a */
    private static String m40916a(Context context) {
        String m40742a = C26667u0.m40742a(context, "iid");
        if (TextUtils.isEmpty(m40742a)) {
            String uuid = UUID.randomUUID().toString();
            C26667u0.m40738b(context, "iid", uuid);
            return uuid;
        }
        return m40742a;
    }

    /* renamed from: a */
    public synchronized void m40913a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f69870l)) {
            C26614a.meta(103, null, str);
            C26609b1.m40926c();
            this.f69870l = str;
        }
    }

    /* renamed from: a */
    public void m40912a(String str, String str2, String str3, String str4) {
        this.f69870l = str2;
        this.f69872n = str3;
        this.f69871m = str;
        C26614a.meta(113, null, str);
        C26614a.meta(112, null, str3);
        C26614a.meta(103, null, str2);
        C26614a.meta(111, null, str4);
        try {
            m40893m();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m40918a(int i) {
        C26645l0.m40833a(i);
    }

    /* renamed from: a */
    public Map<String, String> m40910a(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[2];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (bArr == null) {
            bArr = new byte[0];
        }
        objArr[1] = bArr;
        String str2 = (String) C26614a.meta(224, this.f69866h, objArr);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("X-Armors", str2);
        }
        return hashMap;
    }

    /* renamed from: a */
    public void m40911a(String str, Map<String, Object> map) {
        try {
            long j = "CZL-L1st".equals(str) ? 10000L : 0L;
            Handler m40801b = C26652o0.m40801b();
            if (m40801b != null) {
                m40801b.postDelayed(new RunnableC26619c(this.f69866h, str, map), j);
            }
            m40919a();
            C26676x.m40712a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public Object m40917a(int i, Object obj) {
        if (i == 123) {
            return C26624d0.m40887a(this.f69866h);
        }
        if (i == 121) {
            return C26608b0.m40937a();
        }
        if (i == 122) {
            return C26608b0.m40935b();
        }
        if (i == 126) {
            return C26608b0.m40934b(this.f69866h);
        }
        if (i == 128) {
            return C26608b0.m40932c(this.f69866h);
        }
        if (i == 120) {
            return C26603a0.m40939c();
        }
        if (i == 124) {
            return C26627e0.m40878c(this.f69866h);
        }
        if (i == 130) {
            return C26627e0.m40880a(this.f69866h);
        }
        if (i == 145) {
            return C26631f0.m40871b(this.f69866h);
        }
        if (i == 125) {
            return C26627e0.m40879b(this.f69866h);
        }
        if (i == 129) {
            return C26612c0.m40920e(this.f69866h);
        }
        if (i == 141) {
            return C26612c0.m40921d(this.f69866h);
        }
        if (i == 131) {
            return C26609b1.m40931a();
        }
        if (i == 134) {
            return C26641j0.m40846a(this.f69866h).m40845b();
        }
        if (i == 140) {
            return C26639i0.m40855a(this.f69866h).m40851e();
        }
        if (i == 144) {
            return C26639i0.m40855a(this.f69866h).m40852d();
        }
        String str = null;
        if (i == 133) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Object> entry : f69862d.entrySet()) {
                    if (entry.getValue() == null) {
                        jSONObject.put(entry.getKey(), "");
                    } else {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                str = jSONObject.toString();
            } catch (Throwable unused) {
            }
            return str == null ? JsonUtils.EMPTY_JSON : str.trim();
        } else if (i == 135) {
            return C26662t.m40763f();
        } else {
            if (i == 201) {
                return C26608b0.m40936a(this.f69866h);
            }
            if (i == 202) {
                return C26608b0.m40933c();
            }
            if (i == 236) {
                return C26670v0.m40733a((String) obj);
            }
            if (i == 142) {
                return C26682z.m40687f(this.f69866h);
            }
            if (i == 143) {
                return C26631f0.m40873a(this.f69866h);
            }
            if (i == 146) {
                try {
                    return C26662t.m40768b();
                } catch (Throwable unused2) {
                    return null;
                }
            } else if (i == 147) {
                return Boolean.valueOf(C26682z.m40685h(this.f69866h));
            } else {
                if (i == 148) {
                    return C26660s.m40779b(this.f69866h);
                }
                if (i == 149) {
                    return C26665u.m40754a(this.f69866h);
                }
                if (i == 150) {
                    return Integer.valueOf(C26668v.m40737a());
                }
                if (i == 151) {
                    return C26665u.m40749c();
                }
                if (i == 161) {
                    return Boolean.valueOf(C26662t.m40762g());
                }
                if (i == 163) {
                    return C26637h0.m40857a();
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    public void m40914a(MotionEvent motionEvent) {
        C26671w.m40730a(motionEvent, this.f69866h);
    }

    /* renamed from: a */
    public void m40909a(Map<String, Object> map) {
        if (map != null) {
            f69862d = map;
        }
    }

    /* renamed from: a */
    public void m40919a() {
        C26652o0.m40800b(new RunnableC26617b());
    }
}
