package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.d */
/* loaded from: classes2.dex */
public final class ConfigAid {

    /* renamed from: a */
    private static HashMap<String, ConfigAid> f4046a = new HashMap<>();

    /* renamed from: b */
    private JSONObject f4047b = null;

    /* renamed from: c */
    private JSONObject f4048c = null;

    /* renamed from: d */
    private boolean f4049d = false;

    /* renamed from: e */
    private String f4050e;

    private ConfigAid(JSONObject jSONObject, String str) {
        this.f4050e = str;
        m101418a(jSONObject);
        f4046a.put(this.f4050e, this);
        AppDataCenter.m102179a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    private void m101418a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f4047b = jSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        boolean z = true;
        this.f4049d = (optJSONObject.optInt("switcher") == 1 && optJSONObject.optInt("err_sampling_rate") == 1) ? false : false;
    }

    @Nullable
    /* renamed from: b */
    public static JSONObject m101417b(String str) {
        ConfigAid configAid = f4046a.get(str);
        if (configAid != null) {
            return configAid.f4047b;
        }
        return null;
    }

    /* renamed from: c */
    public static ConfigAid m101416c(String str) {
        return f4046a.get(str);
    }

    /* renamed from: d */
    public static long m101415d(String str) {
        ConfigAid configAid = f4046a.get(str);
        if (configAid == null) {
            return 3600000L;
        }
        try {
            return Long.decode(AppDataCenter.m102166a(configAid.f4047b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    /* renamed from: e */
    public static boolean m101414e(String str) {
        boolean z;
        ConfigAid configAid = f4046a.get(str);
        if (configAid != null) {
            JSONObject jSONObject = configAid.f4047b;
            if (jSONObject != null && 1 == AppDataCenter.m102169a(jSONObject, 0, "crash_module", "switcher")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m101413f(String str) {
        boolean z;
        ConfigAid configAid = f4046a.get(str);
        if (configAid != null) {
            JSONObject jSONObject = configAid.f4047b;
            if (jSONObject != null && 1 == AppDataCenter.m102169a(jSONObject, 0, "crash_module", "switcher")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m101412g(String str) {
        boolean z;
        ConfigAid configAid = f4046a.get(str);
        if (configAid != null) {
            JSONObject jSONObject = configAid.f4047b;
            if (jSONObject != null && 1 == AppDataCenter.m102169a(jSONObject, 0, "crash_module", "switcher")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m101421a() {
        if (this.f4047b == null) {
            return false;
        }
        return this.f4049d;
    }

    /* renamed from: a */
    public static boolean m101420a(String str) {
        return f4046a.get(str) != null;
    }

    /* renamed from: a */
    public static void m101419a(String str, JSONObject jSONObject) {
        ConfigAid configAid = f4046a.get(str);
        if (configAid != null) {
            configAid.m101418a(jSONObject);
        } else {
            new ConfigAid(jSONObject, str);
        }
    }
}
