package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.AppDataCenter;
import com.apm.insight.NpthBus;
import com.apm.insight.p130l.C3822f;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.d */
/* loaded from: classes2.dex */
public final class HeaderCombiner {

    /* renamed from: a */
    private static String f3745a;

    /* renamed from: b */
    private static JSONObject f3746b;

    /* renamed from: a */
    private static void m101924a() {
        if (f3745a == null) {
            f3745a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + NpthBus.m102011g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f3746b == null) {
            try {
                f3746b = new JSONObject(C3822f.m101714a(f3745a, "\n"));
            } catch (IOException unused) {
                f3746b = new JSONObject();
            } catch (JSONException unused2) {
                f3746b = new JSONObject();
            }
        }
    }

    /* renamed from: b */
    public static void m101922b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            m101924a();
            JSONObject jSONObject2 = f3746b;
            if (jSONObject2 != null) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
                if (!AppDataCenter.m102170a(optJSONObject)) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                    if (optJSONObject2 == null) {
                        optJSONObject2 = new JSONObject();
                        try {
                            jSONObject.put("filters", optJSONObject2);
                        } catch (JSONException unused) {
                        }
                    }
                    CrashBody.m101945b(optJSONObject2, optJSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public static void m101923a(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null) {
            return;
        }
        try {
            m101924a();
            JSONObject jSONObject2 = f3746b;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!"slardar_filter".equals(next) && (opt = f3746b.opt(next)) != null) {
                        try {
                            jSONObject.put(next, opt);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
