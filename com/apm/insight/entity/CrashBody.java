package com.apm.insight.entity;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import com.apm.insight.NpthBus;
import com.apm.insight.nativecrash.NativeCrashFileManager;
import com.apm.insight.nativecrash.NativeFileParser;
import com.apm.insight.p130l.App;
import com.apm.insight.p130l.Stack;
import com.apm.insight.runtime.p131a.ActivityDataManager;
import com.ironsource.C21114v8;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.a */
/* loaded from: classes2.dex */
public class CrashBody {

    /* renamed from: a */
    private JSONObject f3741a;

    /* renamed from: b */
    private Header f3742b;

    public CrashBody() {
        this.f3741a = new JSONObject();
    }

    /* renamed from: a */
    public static CrashBody m101964a(long j, Context context, @NonNull Throwable th) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        CrashBody crashBody = new CrashBody();
        crashBody.m101960a("isJava", (Object) 1);
        crashBody.m101960a("data", (Object) Stack.m101632a(th));
        crashBody.m101960a("crash_time", Long.valueOf(j));
        crashBody.m101960a("process_name", (Object) App.m101754d(context));
        if (!App.m101755c(context)) {
            crashBody.m101960a("remote_process", (Object) 1);
        }
        return crashBody;
    }

    /* renamed from: c */
    public static boolean m101943c(String str) {
        return NativeFileParser.m101537b(str) > 350;
    }

    /* renamed from: b */
    public final void m101950b() {
        m101959a("has_logcat", String.valueOf(m101967a()));
    }

    /* renamed from: d */
    public final Header m101940d() {
        if (this.f3742b == null) {
            Header header = new Header(NpthBus.m102011g());
            this.f3742b = header;
            m101963a(header);
        }
        return this.f3742b;
    }

    /* renamed from: b */
    public static boolean m101949b(String str) {
        return NativeFileParser.m101540a(str) > 960;
    }

    /* renamed from: c */
    public final JSONObject m101944c() {
        return this.f3741a;
    }

    public CrashBody(JSONObject jSONObject) {
        this.f3741a = jSONObject;
    }

    /* renamed from: b */
    public final CrashBody m101947b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException e) {
                    AppDataCenter.m102158b((Throwable) e);
                }
            }
            try {
                this.f3741a.put("sdk_info", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    /* renamed from: c */
    public final void m101941c(@NonNull JSONObject jSONObject) {
        m101945b(this.f3741a, jSONObject);
    }

    /* renamed from: c */
    public final CrashBody m101942c(Map<? extends String, ? extends String> map) {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        if (map != null) {
            Object opt = this.f3741a.opt("data");
            if (opt instanceof JSONArray) {
                jSONObject = ((JSONArray) opt).optJSONObject(0);
            } else {
                jSONObject = this.f3741a;
            }
            if (jSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                optJSONObject = jSONObject.optJSONObject("filters");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    m101960a("filters", optJSONObject);
                }
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                try {
                    optJSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            m101960a("filters", optJSONObject);
        }
        return this;
    }

    /* renamed from: a */
    public static boolean m101961a(String str) {
        return ((long) NativeFileParser.m101535c(str)) > NativeCrashFileManager.m101558g();
    }

    /* renamed from: a */
    public final CrashBody m101963a(Header header) {
        m101960a("header", header.m101969f());
        this.f3742b = header;
        return this;
    }

    /* renamed from: b */
    public final CrashBody m101946b(JSONObject jSONObject) {
        m101951a(this.f3741a, jSONObject);
        return this;
    }

    /* renamed from: b */
    public static void m101945b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt == null) {
                    jSONObject.put(next, jSONObject2.opt(next));
                } else if (opt instanceof JSONObject) {
                    m101945b(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                } else if (opt instanceof JSONArray) {
                    JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                    if (optJSONArray != null) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (optJSONArray.opt(0) instanceof JSONObject)) {
                            m101945b(jSONArray.getJSONObject(0), optJSONArray.getJSONObject(0));
                        } else {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                jSONArray.put(optJSONArray.get(i));
                            }
                        }
                    }
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final CrashBody m101955a(JSONObject jSONObject) {
        m101960a("header", jSONObject);
        return this;
    }

    /* renamed from: a */
    public static void m101952a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m101953a(JSONObject jSONObject, Throwable th) {
        if (jSONObject.opt("npth_err_info") == null) {
            try {
                jSONObject.put("npth_err_info", Stack.m101632a(th));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (jSONObject.opt("npth_err_info" + i) == null) {
                try {
                    jSONObject.put("npth_err_info" + i, Stack.m101632a(th));
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final CrashBody m101965a(long j) {
        try {
            m101960a("app_start_time", Long.valueOf(j));
            m101960a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public final CrashBody m101962a(ActivityDataManager activityDataManager) {
        m101960a("activity_trace", activityDataManager.m101472g());
        m101958a("activity_track", activityDataManager.m101468i());
        return this;
    }

    /* renamed from: a */
    public final CrashBody m101956a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            this.f3741a.put("plugin_info", jSONArray);
            return this;
        }
        for (String str : map.keySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("package_name", str);
            jSONObject.put("version_code", map.get(str));
            jSONArray.put(jSONObject);
        }
        this.f3741a.put("plugin_info", jSONArray);
        return this;
    }

    /* renamed from: b */
    public final CrashBody m101948b(String str, String str2) {
        Object opt = this.f3741a.opt("data");
        if (opt instanceof JSONArray) {
            m101954a(((JSONArray) opt).optJSONObject(0), "custom", str, str2);
        } else {
            m101954a(this.f3741a, "custom", str, str2);
        }
        return this;
    }

    /* renamed from: a */
    public final CrashBody m101966a(int i, String str) {
        try {
            this.f3741a.put("miniapp_id", i);
            this.f3741a.put("miniapp_version", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public final CrashBody m101957a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                jSONArray.put(str);
            }
            m101960a("patch_info", (Object) jSONArray);
            return this;
        }
        m101960a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public static void m101951a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put(C21114v8.C21115a.f53886j, jSONObject2);
        } catch (Throwable unused) {
        }
        long optLong = jSONObject2.optLong("inner_free");
        long optLong2 = jSONObject2.optLong("sdcard_free");
        long optLong3 = jSONObject2.optLong("inner_free_real");
        String str = "1M - 64M";
        String str2 = optLong <= 1024 ? "0 - 1K" : optLong <= 65536 ? "1K - 64K" : optLong <= 524288 ? "64K - 512K" : optLong <= 1048576 ? "512K - 1M" : optLong <= 67108864 ? "1M - 64M" : "64M - ";
        String str3 = optLong3 <= 1024 ? "0 - 1K" : optLong3 <= 65536 ? "1K - 64K" : optLong3 <= 524288 ? "64K - 512K" : optLong3 <= 1048576 ? "512K - 1M" : optLong3 <= 67108864 ? "1M - 64M" : "64M - ";
        if (optLong2 <= 1024) {
            str = "0 - 1K";
        } else if (optLong2 <= 65536) {
            str = "1K - 64K";
        } else if (optLong2 <= 524288) {
            str = "64K - 512K";
        } else if (optLong2 <= 1048576) {
            str = "512K - 1M";
        } else if (optLong2 > 67108864) {
            str = "64M - ";
        }
        m101954a(jSONObject, "filters", "inner_free", str2);
        m101954a(jSONObject, "filters", "inner_free_real", str3);
        m101954a(jSONObject, "filters", "sdcard_free", str);
    }

    /* renamed from: a */
    public static void m101954a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            try {
                optJSONObject = new JSONObject();
                jSONObject.put(str, optJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        optJSONObject.put(str2, str3);
    }

    /* renamed from: a */
    public final void m101960a(@NonNull String str, @Nullable Object obj) {
        try {
            this.f3741a.put(str, obj);
        } catch (Exception e) {
            AppDataCenter.m102158b((Throwable) e);
        }
    }

    /* renamed from: a */
    public final boolean m101967a() {
        Object opt = this.f3741a.opt("data");
        return opt instanceof JSONArray ? !AppDataCenter.m102168a(((JSONArray) opt).optJSONObject(0), "logcat") : !AppDataCenter.m102168a(this.f3741a, "logcat");
    }

    /* renamed from: a */
    private CrashBody m101958a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = this.f3741a.optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            m101960a("custom_long", optJSONObject);
        }
        try {
            optJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final CrashBody m101959a(String str, String str2) {
        Object opt = this.f3741a.opt("data");
        if (opt instanceof JSONArray) {
            m101954a(((JSONArray) opt).optJSONObject(0), "filters", str, str2);
        } else {
            m101954a(this.f3741a, "filters", str, str2);
        }
        return this;
    }
}
