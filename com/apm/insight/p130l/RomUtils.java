package com.apm.insight.p130l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.AppDataCenter;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.puujujuupp.C32791uppjpjj;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: com.apm.insight.l.l */
/* loaded from: classes2.dex */
public final class RomUtils {

    /* renamed from: a */
    private static final CharSequence f3939a = "amigo";

    /* renamed from: b */
    private static final CharSequence f3940b = "funtouch";

    /* renamed from: a */
    public static String m101639a() {
        String str;
        String str2 = "";
        if (Device.m101737b()) {
            if (Device.m101737b()) {
                return "miui_" + m101638a(C32791uppjpjj.uppjpjj) + "_" + Build.VERSION.INCREMENTAL;
            }
            return "";
        } else if (Device.m101735c()) {
            String str3 = Build.DISPLAY;
            return (str3 == null || !str3.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str3;
        } else if (m101637b()) {
            if (m101637b()) {
                return "coloros_" + m101638a("ro.build.version.opporom") + "_" + Build.DISPLAY;
            }
            return "";
        } else {
            String m101739a = Device.m101739a();
            if (m101739a == null || !m101739a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
                str = "";
            } else {
                str = m101739a + "_" + Build.DISPLAY;
            }
            if (TextUtils.isEmpty(str)) {
                String m101638a = m101638a("ro.vivo.os.build.display.id");
                boolean z = false;
                if (!TextUtils.isEmpty(m101638a) && m101638a.toLowerCase(Locale.getDefault()).contains(f3940b)) {
                    return m101638a("ro.vivo.os.build.display.id") + "_" + m101638a("ro.vivo.product.version");
                }
                String str4 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str4) && str4.toLowerCase(Locale.getDefault()).contains(f3939a)) {
                    return str4 + "_" + m101638a("ro.gn.sv.version");
                }
                String str5 = Build.MANUFACTURER + Build.BRAND;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.getDefault());
                    if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                        z = true;
                    }
                }
                if (z) {
                    return m101638a("ro.build.uiversion") + "_" + str4;
                }
                if (!TextUtils.isEmpty(m101638a("ro.letv.release.version"))) {
                    str2 = "eui_" + m101638a("ro.letv.release.version") + "_" + str4;
                }
                return !TextUtils.isEmpty(str2) ? str2 : str4;
            }
            return str;
        }
    }

    /* renamed from: b */
    private static boolean m101637b() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: a */
    private static String m101638a(String str) {
        BufferedReader bufferedReader;
        Process exec;
        String str2 = "";
        try {
            exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            str2 = bufferedReader.readLine();
            exec.destroy();
            AppDataCenter.m102180a((Closeable) bufferedReader);
            return str2;
        } catch (Throwable unused2) {
            AppDataCenter.m102180a((Closeable) bufferedReader);
            return str2;
        }
    }
}
