package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.pgl.ssdk.ces.C26614a;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.x */
/* loaded from: classes7.dex */
public class C26676x {

    /* renamed from: a */
    private static Context f69986a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pgl.ssdk.x$a */
    /* loaded from: classes7.dex */
    public static class RunnableC26677a implements Runnable {
        RunnableC26677a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C26679y.m40697c(C26676x.m40709b());
            C26614a.meta(226, C26676x.m40709b(), null);
        }
    }

    @DungeonFlag
    /* renamed from: a */
    private static String m40710a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 3);
            jSONObject.put("exception", th.toString());
            jSONObject.put("stacktrace", Arrays.toString(th.getStackTrace()));
            jSONObject.put("cause", String.valueOf(th.getCause()));
            return Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 0);
        } catch (Throwable unused) {
            return "eyJzdGF0dXMiOjN9";
        }
    }

    /* renamed from: b */
    public static Context m40709b() {
        return f69986a;
    }

    /* renamed from: c */
    public static void m40706c(Context context) {
        f69986a = context;
    }

    @DungeonFlag
    /* renamed from: b */
    public static String m40708b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 0);
            jSONObject.put("envcode", ((Long) C26614a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", C26665u.m40754a(context));
            jSONObject.put("usb_debug", C26665u.m40745d(context));
            JSONArray[] m40748c = C26665u.m40748c(context);
            if (m40748c != null) {
                jSONObject.put("sdata", m40748c[0]);
                jSONObject.put("sdmta", m40748c[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            jSONObject.put("camera_count", C26668v.m40737a());
            jSONObject.put("sim", C26668v.m40734c(context));
            jSONObject.put("virtual_display", C26679y.m40698b(context));
            jSONObject.put("acbs", C26660s.m40779b(context));
            jSONObject.put("bl_unlock", C26665u.m40751b(context));
            C26671w.m40720g();
            C26671w.m40728a(jSONObject);
            String m40764e = C26662t.m40764e();
            jSONObject.put("romtype", C26665u.m40749c());
            jSONObject.put("root", C26665u.m40744e());
            if (!TextUtils.isEmpty(m40764e)) {
                jSONObject.put("sign", m40764e);
            }
            return (String) C26614a.meta(227, context, jSONObject.toString());
        } catch (Throwable th) {
            return m40710a(th);
        }
    }

    /* renamed from: c */
    public static String m40707c() {
        String m40708b = m40708b(m40709b());
        m40712a();
        return m40708b;
    }

    /* renamed from: a */
    public static long m40711a(Context context) {
        try {
            return ((Long) C26614a.meta(154, context, null)).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @DungeonFlag
    /* renamed from: a */
    public static void m40712a() {
        C26652o0.m40800b(new RunnableC26677a());
    }
}
