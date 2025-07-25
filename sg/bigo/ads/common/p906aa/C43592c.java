package sg.bigo.ads.common.p906aa;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43906a;

/* renamed from: sg.bigo.ads.common.aa.c */
/* loaded from: classes10.dex */
public final class C43592c {
    /* renamed from: a */
    public static int m5334a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return 3;
            }
            if (type != 0) {
                return 0;
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return 1;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 18:
                    return 2;
                case 13:
                    return 4;
                case 19:
                default:
                    return 0;
                case 20:
                    return 5;
            }
        } catch (Throwable th) {
            C43782a.m5009a(0, "NetworkUtil", "exception on get network info:" + th.getMessage());
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m5333b(Context context) {
        if (context == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static String m5332c(Context context) {
        String property;
        String m4642c = C43906a.m4642c();
        long currentTimeMillis = System.currentTimeMillis();
        long m4638d = currentTimeMillis - C43906a.m4638d();
        if (!TextUtils.isEmpty(m4642c) && m4638d > 0 && m4638d < TimeUnit.DAYS.toMillis(1L) * 7) {
            return m4642c;
        }
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            property = System.getProperty("http.agent");
        }
        StringBuilder sb2 = new StringBuilder();
        int length = property.length();
        for (int i = 0; i < length; i++) {
            char charAt = property.charAt(i);
            if (charAt > 31 && charAt < 127) {
                sb2.append(charAt);
            } else {
                sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            }
        }
        String sb3 = sb2.toString();
        C43906a.m4650a(sb3);
        C43906a.m4644b(currentTimeMillis);
        return sb3;
    }
}
