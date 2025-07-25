package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import com.apm.insight.NpthBus;
import com.apm.insight.entity.CustomBody;
import com.apm.insight.p129k.ApmConfigFetcher;
import com.apm.insight.p129k.NpthConfigFetcher;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a */
/* loaded from: classes2.dex */
public final class ApmConfig {
    static {
        new ConcurrentLinkedQueue();
    }

    /* renamed from: a */
    public static boolean m101519a(Object obj) {
        String m101928b = CustomBody.m101928b(obj);
        if (m101928b != null) {
            return ConfigAid.m101420a(m101928b);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m101512b(Object obj) {
        ConfigAid m101416c;
        String m101928b = CustomBody.m101928b(obj);
        if (m101928b == null || (m101416c = ConfigAid.m101416c(m101928b)) == null) {
            return false;
        }
        return m101416c.m101421a();
    }

    /* renamed from: c */
    public static boolean m101510c() {
        return m101514a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    /* renamed from: d */
    public static boolean m101508d() {
        if (m101514a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m101507e() {
        if (m101514a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m101506f() {
        if (m101514a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m101505g() {
        if (m101514a("custom_event_settings", "npth_simple_setting", "force_apm_crash") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m101504h() {
        if (m101514a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: i */
    private static JSONObject m101503i() {
        return ConfigAid.m101417b(NpthBus.m102029a().m101533e());
    }

    /* renamed from: c */
    public static boolean m101509c(String str) {
        if (!ConfigAid.m101420a(str)) {
            ApmConfigFetcher.m101853b();
        }
        return ConfigAid.m101413f(str);
    }

    /* renamed from: a */
    public static void m101516a(JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        AppDataCenter.m102176a("apmconfig", "fromnet " + z + " : " + jSONArray);
        if (z) {
            NpthConfigFetcher.m101766f();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String next = optJSONObject.keys().next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                AppDataCenter.m102179a((Object) ("update config " + next + " : " + optJSONObject2));
                ConfigAid.m101419a(next, optJSONObject2);
                if (z) {
                    NpthConfigFetcher.m101772a(next);
                }
            } catch (Throwable unused) {
            }
        }
        NpthConfig.m101388a(m101517a(jSONArray, String.valueOf(NpthBus.m102029a().m101533e())));
        if (z) {
            NpthConfigFetcher.m101771a(jSONArray);
        }
    }

    @Nullable
    /* renamed from: b */
    public static JSONArray m101513b() {
        String[] strArr = {"custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore"};
        JSONObject m102156b = AppDataCenter.m102156b(m101503i(), strArr);
        if (m102156b == null) {
            return null;
        }
        JSONArray optJSONArray = m102156b.optJSONArray(strArr[2]);
        AppDataCenter.m102176a("ApmConfig", "normal get configArray: " + strArr[2] + " : " + optJSONArray);
        return optJSONArray;
    }

    /* renamed from: b */
    public static boolean m101511b(String str) {
        if (!ConfigAid.m101420a(str)) {
            ApmConfigFetcher.m101853b();
        }
        return ConfigAid.m101412g(str);
    }

    @Nullable
    /* renamed from: a */
    private static JSONObject m101517a(JSONArray jSONArray, String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (optJSONObject != null) {
                    return optJSONObject;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m101521a() {
        return NpthCore.m101354e();
    }

    @Nullable
    /* renamed from: a */
    public static String m101515a(@Nullable JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return optJSONObject.optString("npth");
    }

    /* renamed from: a */
    public static int m101514a(String... strArr) {
        return AppDataCenter.m102169a(m101503i(), -1, strArr);
    }

    /* renamed from: a */
    public static int m101520a(int i, String... strArr) {
        return AppDataCenter.m102169a(m101503i(), i, strArr);
    }

    /* renamed from: a */
    public static boolean m101518a(String str) {
        if (!ConfigAid.m101420a(str)) {
            ApmConfigFetcher.m101853b();
        }
        return ConfigAid.m101414e(str);
    }
}
