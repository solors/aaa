package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.pgl.ssdk.ces.C26614a;
import com.pgl.ssdk.ces.C26615b;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.b1 */
/* loaded from: classes7.dex */
public class C26609b1 {

    /* renamed from: a */
    public static int f69845a = 504;

    /* renamed from: b */
    static boolean f69846b = false;

    /* renamed from: c */
    public static String f69847c = null;

    /* renamed from: d */
    public static String f69848d = "";

    /* renamed from: e */
    private static long f69849e;

    /* renamed from: f */
    private static Context f69850f;

    /* renamed from: a */
    public static void m40930a(Context context, String str) {
        m40929a(context, str, null);
    }

    /* renamed from: b */
    public static synchronized String m40927b() {
        String str;
        synchronized (C26609b1.class) {
            if (TextUtils.isEmpty(f69848d)) {
                f69848d = (String) C26614a.meta(303, f69850f, null);
            }
            str = f69848d;
        }
        return str;
    }

    /* renamed from: c */
    public static void m40926c() {
        Context context = f69850f;
        if (context != null) {
            f69845a = 102;
            C26652o0.m40800b(new RunnableC26613c1(context, null));
            C26615b.m40898h().m40919a();
            C26676x.m40712a();
        }
    }

    /* renamed from: a */
    public static void m40929a(Context context, String str, InterfaceC26625d1 interfaceC26625d1) {
        if (f69850f == null) {
            f69850f = context;
        }
        int i = f69845a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        f69849e = System.currentTimeMillis();
        f69846b = false;
        f69847c = str;
        f69845a = 102;
        C26652o0.m40800b(new RunnableC26613c1(context, interfaceC26625d1));
    }

    /* renamed from: a */
    public static synchronized Object m40928a(byte[] bArr) {
        synchronized (C26609b1.class) {
            if (bArr != null) {
                return C26614a.meta(302, f69850f, bArr);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m40931a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("version", "6.4.0.0.overseas-rc.5");
            String str = f69848d;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", f69848d);
            } else {
                jSONObject.put("token_id", m40927b());
            }
            jSONObject.put(C26559a.f69635d, f69845a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused) {
            C26659r0.m40781a("getGrilock Error");
            return "";
        }
    }
}
