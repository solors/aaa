package sg.bigo.ads.common.p941x;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import java.util.UUID;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43908c;

/* renamed from: sg.bigo.ads.common.x.a */
/* loaded from: classes10.dex */
public final class C43906a {

    /* renamed from: a */
    private static String f114978a = "";

    /* renamed from: A */
    public static boolean m4658A() {
        return ((Boolean) C43907b.m4599b("sp_ads_encryptreport_request", Boolean.TRUE, 4)).booleanValue();
    }

    /* renamed from: B */
    public static void m4657B() {
        C43907b.m4602a("sp_ads_encryptreport_request", Boolean.FALSE, 4);
    }

    /* renamed from: C */
    public static boolean m4656C() {
        return ((Boolean) C43907b.m4599b("sp_ads_encryptcallback_request", Boolean.TRUE, 4)).booleanValue();
    }

    /* renamed from: D */
    public static void m4655D() {
        C43907b.m4602a("sp_ads_encryptcallback_request", Boolean.FALSE, 4);
    }

    /* renamed from: E */
    private static synchronized void m4654E() {
        synchronized (C43906a.class) {
            if (TextUtils.isEmpty(f114978a)) {
                f114978a = String.valueOf(UUID.randomUUID());
            }
        }
    }

    /* renamed from: a */
    public static int m4653a() {
        return ((Integer) C43907b.m4599b("sp_cpu_core_num", 0, 0)).intValue();
    }

    /* renamed from: b */
    public static long m4646b() {
        return ((Long) C43907b.m4599b("sp_cpu_max_freq", 0L, 1)).longValue();
    }

    /* renamed from: c */
    public static String m4642c() {
        return (String) C43907b.m4599b("sp_user_agent", "", 3);
    }

    /* renamed from: d */
    public static long m4638d() {
        return ((Long) C43907b.m4599b("sp_user_agent_last_check_ts", 0L, 1)).longValue();
    }

    /* renamed from: e */
    public static long m4634e() {
        return ((Long) C43907b.m4599b("sp_fix_ts_diff", 0L, 1)).longValue();
    }

    /* renamed from: f */
    public static String m4630f(String str) {
        try {
            return (String) C43907b.m4598b(str + "_preferences", "IABTCF_TCString", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public static int m4628g(String str) {
        try {
            return ((Integer) C43907b.m4598b(str + "_preferences", "IABTCF_gdprApplies", 0, 0)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: h */
    public static String m4627h() {
        return (String) C43907b.m4599b("sp_banner_js_downloaded_url", "", 3);
    }

    /* renamed from: i */
    public static int m4624i(@NonNull String str) {
        return ((Integer) C43907b.m4599b("impression_num_".concat(String.valueOf(str)), 0, 0)).intValue();
    }

    /* renamed from: j */
    public static long m4623j() {
        return ((Long) C43907b.m4599b("last_stat_cb_events_time", 0, 1)).longValue();
    }

    /* renamed from: k */
    public static String m4621k() {
        return (String) C43907b.m4599b("cb_event_count", "", 3);
    }

    /* renamed from: l */
    public static int m4620l() {
        return ((Integer) C43907b.m4599b("consent_gdpr", 0, 0)).intValue();
    }

    /* renamed from: m */
    public static int m4619m() {
        return ((Integer) C43907b.m4599b("consent_ccpa", 0, 0)).intValue();
    }

    /* renamed from: n */
    public static int m4618n() {
        return ((Integer) C43907b.m4599b("consent_lgpd", 0, 0)).intValue();
    }

    /* renamed from: o */
    public static int m4617o() {
        return ((Integer) C43907b.m4599b("consent_coppa", 0, 0)).intValue();
    }

    /* renamed from: p */
    public static boolean m4616p() {
        if (m4620l() != 2 && m4619m() != 2 && m4618n() != 2 && m4617o() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static String m4615q() {
        if (!TextUtils.isEmpty(f114978a)) {
            return f114978a;
        }
        String str = (String) C43907b.m4598b("sp_ads_tiny", "sp_ads_uuid", "", 3);
        f114978a = str;
        if (TextUtils.isEmpty(str)) {
            try {
                m4654E();
                if (!TextUtils.isEmpty(f114978a)) {
                    C43907b.m4601a("sp_ads_tiny", "sp_ads_uuid", f114978a, 3);
                }
            } catch (Throwable unused) {
            }
        }
        return f114978a;
    }

    /* renamed from: r */
    public static void m4614r() {
        try {
            SharedPreferences.Editor m4600b = C43907b.m4600b("sp_ads");
            m4600b.clear();
            C43908c.C43909a.m4597a();
            C43908c.C43909a.C43910a.m4596a(m4600b);
        } catch (Exception e) {
            C43782a.m5009a(0, "SharedPreferenceManager", Log.getStackTraceString(e));
        }
    }

    /* renamed from: s */
    public static boolean m4613s() {
        return ((Boolean) C43907b.m4599b("sp_ads_encryptpost_request", Boolean.TRUE, 4)).booleanValue();
    }

    /* renamed from: t */
    public static void m4612t() {
        C43907b.m4602a("sp_ads_encryptpost_request", Boolean.FALSE, 4);
    }

    /* renamed from: u */
    public static boolean m4611u() {
        return ((Boolean) C43907b.m4599b("sp_ads_encryptsdkconfig_request", Boolean.TRUE, 4)).booleanValue();
    }

    /* renamed from: v */
    public static void m4610v() {
        C43907b.m4602a("sp_ads_encryptsdkconfig_request", Boolean.FALSE, 4);
    }

    /* renamed from: w */
    public static boolean m4609w() {
        return ((Boolean) C43907b.m4599b("sp_ads_encryptaddata_request", Boolean.TRUE, 4)).booleanValue();
    }

    /* renamed from: x */
    public static void m4608x() {
        C43907b.m4602a("sp_ads_encryptaddata_request", Boolean.FALSE, 4);
    }

    /* renamed from: y */
    public static boolean m4607y() {
        return ((Boolean) C43907b.m4599b("sp_ads_encrypticon_ads_data_request", Boolean.TRUE, 4)).booleanValue();
    }

    /* renamed from: z */
    public static void m4606z() {
        C43907b.m4602a("sp_ads_encrypticon_ads_data_request", Boolean.FALSE, 4);
    }

    /* renamed from: a */
    public static void m4652a(int i) {
        C43907b.m4602a("sp_cpu_core_num", Integer.valueOf(i), 0);
    }

    /* renamed from: b */
    public static void m4645b(int i) {
        C43907b.m4602a("consent_gdpr", Integer.valueOf(i), 0);
    }

    /* renamed from: c */
    public static void m4641c(int i) {
        C43907b.m4602a("consent_ccpa", Integer.valueOf(i), 0);
    }

    /* renamed from: d */
    public static void m4637d(int i) {
        C43907b.m4602a("consent_lgpd", Integer.valueOf(i), 0);
    }

    /* renamed from: e */
    public static String m4632e(String str) {
        try {
            return (String) C43907b.m4598b(str + "_preferences", CmpApiConstants.IABTCF_PURPOSE_CONSENTS, "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    public static void m4631f() {
        C43907b.m4602a("sp_fix_ts_diff", 0L, 1);
    }

    /* renamed from: g */
    public static String m4629g() {
        return (String) C43907b.m4599b("sp_omid_service_downloaded_url", "", 3);
    }

    /* renamed from: h */
    public static String m4626h(String str) {
        try {
            return (String) C43907b.m4598b(str + "_preferences", CmpApiConstants.IABTCF_PURPOSE_LEGITIMATE_INTERESTS, "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static long m4625i() {
        return ((Long) C43907b.m4599b("last_stat_init_time", 0, 1)).longValue();
    }

    /* renamed from: j */
    public static void m4622j(@NonNull String str) {
        long longValue = ((Long) C43907b.m4599b("last_impression_ts_".concat(String.valueOf(str)), 0, 1)).longValue();
        if (longValue <= 0 || DateUtils.isToday(longValue)) {
            return;
        }
        m4649a(str, 0);
        m4648a(str, 0L);
    }

    /* renamed from: a */
    public static void m4651a(long j) {
        C43907b.m4602a("sp_cpu_max_freq", Long.valueOf(j), 1);
    }

    /* renamed from: b */
    public static void m4644b(long j) {
        C43907b.m4602a("sp_user_agent_last_check_ts", Long.valueOf(j), 1);
    }

    /* renamed from: c */
    public static void m4640c(long j) {
        C43907b.m4602a("last_stat_init_time", Long.valueOf(j), 1);
    }

    /* renamed from: d */
    public static void m4636d(long j) {
        C43907b.m4602a("last_stat_cb_events_time", Long.valueOf(j), 1);
    }

    /* renamed from: e */
    public static void m4633e(int i) {
        C43907b.m4602a("consent_coppa", Integer.valueOf(i), 0);
    }

    /* renamed from: a */
    public static void m4650a(String str) {
        C43907b.m4602a("sp_user_agent", str, 3);
    }

    /* renamed from: b */
    public static void m4643b(String str) {
        C43907b.m4602a("sp_omid_service_downloaded_url", str, 3);
    }

    /* renamed from: c */
    public static void m4639c(String str) {
        C43907b.m4602a("sp_banner_js_downloaded_url", str, 3);
    }

    /* renamed from: d */
    public static void m4635d(String str) {
        C43907b.m4602a("cb_event_count", str, 3);
    }

    /* renamed from: a */
    public static void m4649a(@NonNull String str, int i) {
        C43907b.m4602a("impression_num_".concat(String.valueOf(str)), Integer.valueOf(i), 0);
    }

    /* renamed from: a */
    public static void m4648a(@NonNull String str, long j) {
        C43907b.m4602a("last_impression_ts_".concat(String.valueOf(str)), Long.valueOf(j), 1);
    }

    /* renamed from: a */
    public static void m4647a(String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        SharedPreferences m4603a = C43907b.m4603a(str + "_preferences");
        if (m4603a != null) {
            m4603a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }
}
