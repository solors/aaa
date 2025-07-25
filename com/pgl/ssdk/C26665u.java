package com.pgl.ssdk;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.pgl.ssdk.ces.C26614a;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.pgl.ssdk.u */
/* loaded from: classes7.dex */
public class C26665u {

    /* renamed from: a */
    private static String f69967a;

    /* renamed from: b */
    private static long[][] f69968b;

    /* renamed from: c */
    private static String f69969c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pgl.ssdk.u$a */
    /* loaded from: classes7.dex */
    public static class RunnableC26666a implements Runnable {
        RunnableC26666a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(C26665u.f69969c)) {
                String unused = C26665u.f69969c = C26665u.m40752b();
                C26667u0.m40738b(C26676x.m40709b(), "romtype", C26665u.f69969c);
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ String m40752b() {
        return m40746d();
    }

    /* renamed from: c */
    public static JSONArray[] m40748c(Context context) {
        if (f69968b == null) {
            f69968b = (long[][]) C26614a.meta(157, context, null);
        }
        long[][] jArr = f69968b;
        if (jArr != null && jArr.length == 2) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long[][] jArr2 = f69968b;
            long[] jArr3 = jArr2[0];
            long[] jArr4 = jArr2[1];
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jArr3.length; i++) {
                try {
                    jSONArray.put(i, currentTimeMillis - jArr3[i]);
                    jSONArray2.put(i, currentTimeMillis - jArr4[i]);
                } catch (JSONException unused) {
                }
            }
            return new JSONArray[]{jSONArray, jSONArray2};
        }
        f69968b = null;
        return null;
    }

    /* renamed from: d */
    public static boolean m40745d(Context context) {
        Object meta = C26614a.meta(155, context, null);
        if (meta instanceof Boolean) {
            return ((Boolean) meta).booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static int m40744e() {
        return ((Integer) C26614a.meta(162, null, null)).intValue();
    }

    /* renamed from: b */
    public static boolean m40751b(Context context) {
        Object meta = C26614a.meta(156, context, null);
        if (meta instanceof Boolean) {
            return ((Boolean) meta).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public static String m40754a(Context context) {
        String str = f69967a;
        if (str != null) {
            return str;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "boot_count");
        f69967a = string;
        return string;
    }

    /* renamed from: d */
    private static String m40746d() {
        return (m40750b("com.samsung.android.knox.SemPersonaManager") || m40750b("com.samsung.android.knoxguard.KnoxGuardManager")) ? "samsung" : (m40750b("androidhnext.Manifest") || m40750b("androidhnext.R")) ? "honor" : (m40750b("androidhwext.Manifest") || m40750b("androidhwext.R")) ? "huawei" : (m40750b("oppo.Manifest") || m40750b("oppo.R") || m40750b("oplus.Manifest") || m40750b("oplus.R") || m40750b("com.oneplus.Manifest") || m40750b("com.oneplus.R")) ? "oppo" : (m40750b("vivo.Manifest") || m40750b("vivo.R")) ? "vivo" : (m40750b("miui.Manifest") || m40750b("miui.R") || m40750b("miui.os.Build")) ? "xiaomi" : (m40750b("lineageos.platform.Manifest") || m40750b("lineageos.platform.R")) ? "lineage" : m40747c("/system/framework/com.motorola.motosignature.jar") ? "moto" : (m40747c("/system/framework/transsion-framework.jar") || m40747c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }

    /* renamed from: b */
    private static boolean m40750b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m40747c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static String m40749c() {
        if (!TextUtils.isEmpty(f69969c)) {
            return f69969c;
        }
        String m40740a = C26667u0.m40740a(C26676x.m40709b(), "romtype", (String) null);
        f69969c = m40740a;
        if (!TextUtils.isEmpty(m40740a)) {
            return f69969c;
        }
        C26652o0.m40800b(new RunnableC26666a());
        return "";
    }
}
